/*
 * Decompiled with CFR 0.152.
 */
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;

final class jhh
extends InputStream
implements InputStreamRetargetInterface,
ivt {
    private final jhg a;

    public jhh(jhg jhg2) {
        a.s(jhg2, "buffer");
        this.a = jhg2;
    }

    @Override
    public final int available() {
        return ((jct)this.a).a;
    }

    @Override
    public final void close() {
        this.a.close();
    }

    @Override
    public final void mark(int n2) {
        this.a.b();
    }

    @Override
    public final boolean markSupported() {
        return this.a.d();
    }

    @Override
    public final int read() {
        jhg jhg2 = this.a;
        if (((jct)jhg2).a == 0) {
            return -1;
        }
        return jhg2.e();
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        int n4 = ((jct)this.a).a;
        if (n4 == 0) {
            return -1;
        }
        n3 = Math.min(n4, n3);
        this.a.k(byArray, n2, n3);
        return n3;
    }

    @Override
    public final void reset() {
        this.a.c();
    }

    @Override
    public final long skip(long l2) {
        int n2 = (int)Math.min((long)((jct)this.a).a, l2);
        this.a.l(n2);
        return n2;
    }

    @Override
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}

