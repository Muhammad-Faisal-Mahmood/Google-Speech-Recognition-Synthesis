/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class jhm {
    public final ScheduledExecutorService a;
    public final Executor b;
    public final Runnable c;
    public long d;
    public boolean e;
    public ScheduledFuture f;
    private final guh g;

    public jhm(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, guh guh2) {
        this.c = runnable;
        this.b = executor;
        this.a = scheduledExecutorService;
        this.g = guh2;
        guh2.d();
    }

    public final long a() {
        return this.g.a(TimeUnit.NANOSECONDS);
    }
}

