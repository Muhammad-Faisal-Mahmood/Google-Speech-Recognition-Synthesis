/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.concurrent.ScheduledExecutorService;

public interface jco
extends Closeable {
    public jcu a(SocketAddress var1, jcn var2, ity var3);

    public Collection b();

    public ScheduledExecutorService c();

    @Override
    public void close();
}

