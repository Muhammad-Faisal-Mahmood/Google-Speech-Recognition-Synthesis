/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class jbu
implements jif {
    private static final Logger c = Logger.getLogger(jbu.class.getName());
    public jdp a;
    public ksb b;
    private final ScheduledExecutorService d;
    private final iym e;

    public jbu(ScheduledExecutorService scheduledExecutorService, iym iym2) {
        this.d = scheduledExecutorService;
        this.e = iym2;
    }

    @Override
    public final void a() {
        this.e.c();
        iuk iuk2 = new iuk(this, 7, null);
        this.e.execute(iuk2);
    }

    @Override
    public final void b(Runnable runnable) {
        Object object;
        this.e.c();
        if (this.a == null) {
            this.a = new jdp();
        }
        if ((object = this.b) != null && ((ksb)object).k()) {
            return;
        }
        long l2 = this.a.a();
        iym iym2 = this.e;
        object = this.d;
        this.b = iym2.d(runnable, l2, TimeUnit.NANOSECONDS, (ScheduledExecutorService)object);
        c.logp(Level.FINE, "io.grpc.internal.BackoffPolicyRetryScheduler", "schedule", "Scheduling DNS resolution backoff for {0}ns", l2);
    }
}

