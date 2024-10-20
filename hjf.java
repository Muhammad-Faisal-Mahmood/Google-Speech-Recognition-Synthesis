/*
 * Decompiled with CFR 0.152.
 */
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class hjf
extends FilterInputStream
implements InputStreamRetargetInterface {
    private long a;
    private long b = -1L;

    public hjf(InputStream inputStream, long l2) {
        super(inputStream);
        boolean bl2 = l2 >= 0L;
        fxf.r(bl2, "limit must be non-negative");
        this.a = l2;
    }

    @Override
    public final int available() {
        return (int)Math.min((long)this.in.available(), this.a);
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
            this.b = this.a;
            return;
        }
    }

    @Override
    public final int read() {
        if (this.a == 0L) {
            return -1;
        }
        int n2 = this.in.read();
        if (n2 != -1) {
            --this.a;
        }
        return n2;
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        long l2 = this.a;
        if (l2 == 0L) {
            return -1;
        }
        if ((n2 = this.in.read(byArray, n2, n3 = (int)Math.min((long)n3, l2))) != -1) {
            this.a -= (long)n2;
        }
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
            if (this.b != -1L) {
                this.in.reset();
                this.a = this.b;
                return;
            }
            IOException iOException = new IOException("Mark not set");
            throw iOException;
        }
    }

    @Override
    public final long skip(long l2) {
        l2 = Math.min(l2, this.a);
        l2 = this.in.skip(l2);
        this.a -= l2;
        return l2;
    }

    @Override
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}

