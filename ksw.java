/*
 * Decompiled with CFR 0.152.
 */
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLConnection;
import java.nio.ByteBuffer;

final class ksw
extends InputStream
implements InputStreamRetargetInterface {
    public boolean a;
    public ByteBuffer b;
    public IOException c;
    private final ksv d;

    public ksw(ksv ksv2) {
        this.d = ksv2;
    }

    private final void a() {
        if (this.a) {
            IOException iOException = this.c;
            if (iOException != null) {
                throw iOException;
            }
        } else if (!this.b()) {
            if (this.b == null) {
                this.b = ByteBuffer.allocateDirect(32768);
            }
            Object object = (ByteBuffer)this.b.clear();
            object = this.d;
            ByteBuffer byteBuffer = this.b;
            ((ksv)object).b.c(byteBuffer);
            ((ksv)object).a.b(((URLConnection)object).getReadTimeout());
            object = this.c;
            if (object == null) {
                object = this.b;
                if (object != null) {
                    object = (ByteBuffer)((ByteBuffer)object).flip();
                    return;
                }
            } else {
                throw object;
            }
        }
    }

    private final boolean b() {
        ByteBuffer byteBuffer = this.b;
        return byteBuffer != null && byteBuffer.hasRemaining();
    }

    @Override
    public final int available() {
        if (this.a) {
            IOException iOException = this.c;
            if (iOException != null) {
                throw iOException;
            }
        } else if (this.b()) {
            return this.b.remaining();
        }
        return 0;
    }

    @Override
    public final int read() {
        this.a();
        if (this.b()) {
            return this.b.get() & 0xFF;
        }
        return -1;
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        if (n2 >= 0 && n3 >= 0 && n2 + n3 <= byArray.length) {
            if (n3 == 0) {
                return 0;
            }
            this.a();
            if (this.b()) {
                n3 = Math.min(this.b.limit() - this.b.position(), n3);
                this.b.get(byArray, n2, n3);
                return n3;
            }
            return -1;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}

