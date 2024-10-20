/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public abstract class coz
extends hpa
implements hpr {
    protected coz() {
    }

    @Override
    public final hpp b(Runnable runnable, long l2, TimeUnit timeUnit) {
        return this.h().b(runnable, l2, timeUnit);
    }

    @Override
    public final hpp c(Callable callable, long l2, TimeUnit timeUnit) {
        return this.h().c(callable, l2, timeUnit);
    }

    @Override
    public final hpp d(Runnable runnable, long l2, long l3, TimeUnit timeUnit) {
        return this.h().d(runnable, l2, l3, timeUnit);
    }

    @Override
    public final hpp e(Runnable runnable, long l2, long l3, TimeUnit timeUnit) {
        return this.h().e(runnable, l2, l3, timeUnit);
    }

    protected abstract hpr h();
}

