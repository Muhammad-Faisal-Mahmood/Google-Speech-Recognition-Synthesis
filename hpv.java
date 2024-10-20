/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class hpv
extends hps
implements hpr {
    final ScheduledExecutorService a;

    public hpv(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        fxf.K(scheduledExecutorService);
        this.a = scheduledExecutorService;
    }

    @Override
    public final hpp b(Runnable runnable, long l2, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.a;
        runnable = hqh.d(runnable, null);
        return new hpt((hpn)((Object)runnable), scheduledExecutorService.schedule(runnable, l2, timeUnit));
    }

    @Override
    public final hpp c(Callable object, long l2, TimeUnit timeUnit) {
        object = new hqh((Callable)object);
        return new hpt((hpn)object, this.a.schedule((Runnable)object, l2, timeUnit));
    }

    @Override
    public final hpp d(Runnable runnable, long l2, long l3, TimeUnit timeUnit) {
        runnable = new hpu(runnable);
        return new hpt((hpn)((Object)runnable), this.a.scheduleAtFixedRate(runnable, l2, l3, timeUnit));
    }

    @Override
    public final hpp e(Runnable runnable, long l2, long l3, TimeUnit timeUnit) {
        runnable = new hpu(runnable);
        return new hpt((hpn)((Object)runnable), this.a.scheduleWithFixedDelay(runnable, l2, l3, timeUnit));
    }
}

