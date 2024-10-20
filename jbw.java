/*
 * Decompiled with CFR 0.152.
 */
import java.net.SocketAddress;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

final class jbw
implements jco {
    private final jco a;

    public jbw(jco jco2, Executor executor) {
        this.a = jco2;
        a.s(executor, "appExecutor");
    }

    @Override
    public final jcu a(SocketAddress socketAddress, jcn jcn2, ity ity2) {
        return new jbv(this.a.a(socketAddress, jcn2, ity2), jcn2.a);
    }

    @Override
    public final Collection b() {
        return this.a.b();
    }

    @Override
    public final ScheduledExecutorService c() {
        return this.a.c();
    }

    @Override
    public final void close() {
        this.a.close();
    }
}

