/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class ixc {
    public final int a;
    public final ixu b;
    public final iym c;
    public final ixh d;
    public final ScheduledExecutorService e;
    public final Executor f;
    private final ity g;

    public ixc(Integer n2, ixu ixu2, iym iym2, ixh ixh2, ScheduledExecutorService scheduledExecutorService, ity ity2, Executor executor) {
        n2.intValue();
        this.a = 443;
        this.b = ixu2;
        this.c = iym2;
        this.d = ixh2;
        this.e = scheduledExecutorService;
        this.g = ity2;
        this.f = executor;
    }

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.e("defaultPort", this.a);
        gtn2.b("proxyDetector", this.b);
        gtn2.b("syncContext", this.c);
        gtn2.b("serviceConfigParser", this.d);
        gtn2.b("scheduledExecutorService", this.e);
        gtn2.b("channelLogger", this.g);
        gtn2.b("executor", this.f);
        gtn2.b("overrideAuthority", null);
        return gtn2.toString();
    }
}

