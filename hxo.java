/*
 * Decompiled with CFR 0.152.
 */
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Iterator;

final class hxo
extends InputStream
implements InputStreamRetargetInterface {
    private Iterator a;
    private ByteBuffer b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private byte[] g;
    private int h;
    private long i;

    public hxo(Iterable object) {
        this.a = object.iterator();
        this.c = 0;
        object = object.iterator();
        while (object.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer)object.next();
            ++this.c;
        }
        this.d = -1;
        if (!this.b()) {
            this.b = hxl.c;
            this.d = 0;
            this.e = 0;
            this.i = 0L;
        }
    }

    private final void a(int n2) {
        this.e = n2 = this.e + n2;
        if (n2 == this.b.limit()) {
            this.b();
        }
    }

    private final boolean b() {
        ByteBuffer byteBuffer;
        ++this.d;
        if (!this.a.hasNext()) {
            return false;
        }
        this.b = byteBuffer = (ByteBuffer)this.a.next();
        this.e = byteBuffer.position();
        if (this.b.hasArray()) {
            this.f = true;
            this.g = this.b.array();
            this.h = this.b.arrayOffset();
        } else {
            this.f = false;
            this.i = hzj.e(this.b);
            this.g = null;
        }
        return true;
    }

    @Override
    public final int read() {
        if (this.d == this.c) {
            return -1;
        }
        if (this.f) {
            byte by2 = this.g[this.e + this.h];
            this.a(1);
            return by2 & 0xFF;
        }
        byte by3 = hzj.a((long)this.e + this.i);
        this.a(1);
        return by3 & 0xFF;
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        if (this.d == this.c) {
            return -1;
        }
        int n4 = this.b.limit();
        int n5 = this.e;
        int n6 = n4 - n5;
        n4 = n3;
        if (n3 > n6) {
            n4 = n6;
        }
        if (this.f) {
            System.arraycopy(this.g, n5 + this.h, byArray, n2, n4);
            this.a(n4);
        } else {
            n3 = this.b.position();
            ((Buffer)this.b).position(this.e);
            this.b.get(byArray, n2, n4);
            ((Buffer)this.b).position(n3);
            this.a(n4);
        }
        return n4;
    }

    @Override
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}

