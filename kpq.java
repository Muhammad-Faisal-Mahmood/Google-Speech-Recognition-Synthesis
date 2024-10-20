/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.nio.ByteBuffer;

public abstract class kpq
implements Closeable {
    public abstract long a();

    public abstract void b(kpr var1, ByteBuffer var2);

    public abstract void c(kpr var1);

    @Override
    public void close() {
    }
}

