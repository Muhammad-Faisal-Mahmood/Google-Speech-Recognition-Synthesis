/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

public abstract class hnl
extends AbstractExecutorService
implements hpq {
    @Override
    public final hpn be(Runnable runnable) {
        return (hpn)super.submit(runnable);
    }

    @Override
    public hpn bf(Callable callable) {
        return (hpn)super.submit(callable);
    }

    @Override
    public final hpn bg(Runnable runnable, Object object) {
        return (hpn)super.submit(runnable, object);
    }

    protected final RunnableFuture newTaskFor(Runnable runnable, Object object) {
        return hqh.d(runnable, object);
    }

    protected final RunnableFuture newTaskFor(Callable callable) {
        return new hqh(callable);
    }
}

