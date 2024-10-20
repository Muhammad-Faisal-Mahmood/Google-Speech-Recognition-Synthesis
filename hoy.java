/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class hoy
extends gzg
implements Future,
hpn {
    protected hoy() {
    }

    protected abstract hpn bi();

    @Override
    public void c(Runnable runnable, Executor executor) {
        this.bi().c(runnable, executor);
    }

    @Override
    public boolean cancel(boolean bl2) {
        return this.bj().cancel(bl2);
    }

    public final Object get() {
        return this.bj().get();
    }

    public final Object get(long l2, TimeUnit timeUnit) {
        return this.bj().get(l2, timeUnit);
    }

    @Override
    public final boolean isCancelled() {
        return this.bj().isCancelled();
    }

    @Override
    public final boolean isDone() {
        return this.bj().isDone();
    }
}

