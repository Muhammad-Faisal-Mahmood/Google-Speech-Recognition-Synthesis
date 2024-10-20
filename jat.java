/*
 * Decompiled with CFR 0.152.
 */
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class jat
implements jco {
    private final ScheduledExecutorService a;
    private final Executor b;
    private final int c;
    private final jau d;
    private final jjv e;
    private final boolean f;

    public jat(jau jau2, Executor executor, ScheduledExecutorService scheduledExecutorService, int n2, jjv jjv2) {
        boolean bl2 = scheduledExecutorService == null;
        this.f = bl2;
        if (bl2) {
            scheduledExecutorService = (ScheduledExecutorService)jjm.a(jeb.p);
        }
        this.a = scheduledExecutorService;
        this.c = n2;
        this.d = jau2;
        a.s(executor, "executor");
        this.b = executor;
        this.e = jjv2;
    }

    @Override
    public final jcu a(SocketAddress socketAddress, jcn object, ity object2) {
        socketAddress = (InetSocketAddress)socketAddress;
        String string = ((jcn)object).a;
        object2 = ((jcn)object).c;
        its its2 = ((jcn)object).b;
        object = this.b;
        int n2 = this.c;
        return new jbc(this.d, (InetSocketAddress)socketAddress, string, (String)object2, its2, (Executor)object, n2, this.e);
    }

    @Override
    public final Collection b() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override
    public final ScheduledExecutorService c() {
        return this.a;
    }

    @Override
    public final void close() {
        if (this.f) {
            ScheduledExecutorService scheduledExecutorService = this.a;
            jjm.d(jeb.p, scheduledExecutorService);
        }
    }
}

