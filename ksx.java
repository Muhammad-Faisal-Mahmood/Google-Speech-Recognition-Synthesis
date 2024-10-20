/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.OutputStream;

abstract class ksx
extends OutputStream {
    public IOException d;
    public boolean e;
    public boolean f;

    public abstract kpq a();

    public abstract void b();

    public abstract boolean c();

    @Override
    public void close() {
        this.e = true;
    }

    protected final void d() {
        IOException iOException = this.d;
        if (iOException == null) {
            return;
        }
        throw iOException;
    }

    protected final void e() {
        if (!this.f) {
            if (!this.e) {
                return;
            }
            throw new IOException("Stream has been closed.");
        }
        this.d();
        throw new IOException("Writing after request completed.");
    }
}

