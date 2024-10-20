/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.InputStream;

public abstract class kgx
implements Closeable {
    public abstract long a();

    public abstract klo b();

    public final InputStream c() {
        return this.b().i();
    }

    @Override
    public final void close() {
        khb.q(this.b());
    }
}

