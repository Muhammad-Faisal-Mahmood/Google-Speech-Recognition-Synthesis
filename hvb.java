/*
 * Decompiled with CFR 0.152.
 */
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public final class hvb
extends FilterInputStream
implements InputStreamRetargetInterface {
    private int a;

    public hvb(InputStream inputStream, int n2) {
        super(inputStream);
        this.a = n2;
    }

    @Override
    public final int available() {
        return Math.min(super.available(), this.a);
    }

    @Override
    public final int read() {
        if (this.a <= 0) {
            return -1;
        }
        int n2 = super.read();
        if (n2 >= 0) {
            --this.a;
        }
        return n2;
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        int n4 = this.a;
        if (n4 <= 0) {
            return -1;
        }
        if ((n2 = super.read(byArray, n2, Math.min(n3, n4))) >= 0) {
            this.a -= n2;
        }
        return n2;
    }

    @Override
    public final long skip(long l2) {
        int n2 = (int)super.skip(Math.min(l2, (long)this.a));
        if (n2 >= 0) {
            this.a -= n2;
        }
        return n2;
    }

    @Override
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}

