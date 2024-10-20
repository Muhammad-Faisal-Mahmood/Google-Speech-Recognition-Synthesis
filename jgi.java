/*
 * Decompiled with CFR 0.152.
 */
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

final class jgi
extends FilterInputStream
implements InputStreamRetargetInterface {
    private final int a;
    private final jjo b;
    private long c;
    private long d;
    private long e = -1L;

    public jgi(InputStream inputStream, int n2, jjo jjo2) {
        super(inputStream);
        this.a = n2;
        this.b = jjo2;
    }

    private final void a() {
        if (this.d > this.c) {
            jjo.f(this.b);
            this.c = this.d;
        }
    }

    private final void b() {
        long l2 = this.d;
        int n2 = this.a;
        if (l2 <= (long)n2) {
            return;
        }
        throw new iyj(iyh.g.e(a.af(n2, "Decompressed gRPC message exceeds maximum size ")));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void mark(int n2) {
        synchronized (this) {
            this.in.mark(n2);
            this.e = this.d;
            return;
        }
    }

    @Override
    public final int read() {
        int n2 = this.in.read();
        if (n2 != -1) {
            ++this.d;
        }
        this.b();
        this.a();
        return n2;
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        if ((n2 = this.in.read(byArray, n2, n3)) != -1) {
            this.d += (long)n2;
        }
        this.b();
        this.a();
        return n2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void reset() {
        synchronized (this) {
            if (!this.in.markSupported()) {
                IOException iOException = new IOException("Mark not supported");
                throw iOException;
            }
            if (this.e != -1L) {
                this.in.reset();
                this.d = this.e;
                return;
            }
            IOException iOException = new IOException("Mark not set");
            throw iOException;
        }
    }

    @Override
    public final long skip(long l2) {
        l2 = this.in.skip(l2);
        this.d += l2;
        this.b();
        this.a();
        return l2;
    }

    @Override
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}

