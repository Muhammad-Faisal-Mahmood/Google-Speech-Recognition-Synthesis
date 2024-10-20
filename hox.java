/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

final class hox
extends hph {
    private final hpn a;

    public hox(hpn hpn2) {
        fxf.K(hpn2);
        this.a = hpn2;
    }

    @Override
    public final void c(Runnable runnable, Executor executor) {
        this.a.c(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean bl2) {
        return this.a.cancel(bl2);
    }

    @Override
    public final Object get() {
        return this.a.get();
    }

    @Override
    public final Object get(long l2, TimeUnit timeUnit) {
        return this.a.get(l2, timeUnit);
    }

    @Override
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override
    public final String toString() {
        return this.a.toString();
    }
}

