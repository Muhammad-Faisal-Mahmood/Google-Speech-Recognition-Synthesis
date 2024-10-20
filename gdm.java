/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class gdm
implements ScheduledExecutorService {
    private final ScheduledExecutorService a;

    public gdm(ScheduledExecutorService scheduledExecutorService) {
        jse.e(scheduledExecutorService, "delegate");
        this.a = scheduledExecutorService;
    }

    @Override
    public final boolean awaitTermination(long l2, TimeUnit timeUnit) {
        jse.e((Object)timeUnit, "unit");
        return this.a.awaitTermination(l2, timeUnit);
    }

    @Override
    public final void execute(Runnable runnable) {
        jse.e(runnable, "command");
        long l2 = gqk.a;
        if (gqk.o()) {
            this.a.execute(gqk.h(runnable));
            return;
        }
        this.a.execute(runnable);
    }

    public final List invokeAll(Collection list) {
        jse.e(list, "tasks");
        list = this.a.invokeAll(list);
        jse.d(list, "invokeAll(...)");
        return list;
    }

    public final List invokeAll(Collection list, long l2, TimeUnit timeUnit) {
        jse.e(list, "tasks");
        jse.e((Object)timeUnit, "unit");
        list = this.a.invokeAll(list, l2, timeUnit);
        jse.d(list, "invokeAll(...)");
        return list;
    }

    public final Object invokeAny(Collection collection) {
        jse.e(collection, "tasks");
        return this.a.invokeAny(collection);
    }

    public final Object invokeAny(Collection collection, long l2, TimeUnit timeUnit) {
        jse.e(collection, "tasks");
        jse.e((Object)timeUnit, "unit");
        return this.a.invokeAny(collection, l2, timeUnit);
    }

    @Override
    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    @Override
    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    public final ScheduledFuture schedule(Runnable object, long l2, TimeUnit timeUnit) {
        jse.e(object, "command");
        jse.e((Object)timeUnit, "unit");
        long l3 = gqk.a;
        Runnable runnable = object;
        if (gqk.o()) {
            runnable = gqk.h((Runnable)object);
        }
        object = this.a.schedule(runnable, l2, timeUnit);
        jse.d(object, "schedule(...)");
        return object;
    }

    public final ScheduledFuture schedule(Callable object, long l2, TimeUnit timeUnit) {
        jse.e(object, "callable");
        jse.e((Object)timeUnit, "unit");
        long l3 = gqk.a;
        Callable callable = object;
        if (gqk.o()) {
            callable = gqk.k((Callable)object);
        }
        object = this.a.schedule(callable, l2, timeUnit);
        jse.d(object, "schedule(...)");
        return object;
    }

    public final ScheduledFuture scheduleAtFixedRate(Runnable object, long l2, long l3, TimeUnit timeUnit) {
        jse.e(object, "command");
        jse.e((Object)timeUnit, "unit");
        long l4 = gqk.a;
        Runnable runnable = object;
        if (gqk.o()) {
            runnable = gqk.h((Runnable)object);
        }
        object = this.a.scheduleAtFixedRate(runnable, l2, l3, timeUnit);
        jse.d(object, "scheduleAtFixedRate(...)");
        return object;
    }

    public final ScheduledFuture scheduleWithFixedDelay(Runnable object, long l2, long l3, TimeUnit timeUnit) {
        jse.e(object, "command");
        jse.e((Object)timeUnit, "unit");
        long l4 = gqk.a;
        Runnable runnable = object;
        if (gqk.o()) {
            runnable = gqk.h((Runnable)object);
        }
        object = this.a.scheduleWithFixedDelay(runnable, l2, l3, timeUnit);
        jse.d(object, "scheduleWithFixedDelay(...)");
        return object;
    }

    @Override
    public final void shutdown() {
        this.a.shutdown();
    }

    public final List shutdownNow() {
        List<Runnable> list = this.a.shutdownNow();
        jse.d(list, "shutdownNow(...)");
        return list;
    }

    public final Future submit(Runnable future) {
        jse.e(future, "task");
        long l2 = gqk.a;
        if (gqk.o()) {
            future = this.a.submit(gqk.h((Runnable)((Object)future)));
            jse.b(future);
        } else {
            future = this.a.submit((Runnable)((Object)future));
            jse.b(future);
        }
        return future;
    }

    public final Future submit(Runnable future, Object object) {
        jse.e(future, "task");
        long l2 = gqk.a;
        if (gqk.o()) {
            future = this.a.submit(gqk.h((Runnable)((Object)future)), object);
            jse.b(future);
        } else {
            future = this.a.submit((Runnable)((Object)future), object);
            jse.b(future);
        }
        return future;
    }

    public final Future submit(Callable future) {
        jse.e(future, "task");
        long l2 = gqk.a;
        if (gqk.o()) {
            future = this.a.submit(gqk.k((Callable)((Object)future)));
            jse.b(future);
        } else {
            future = this.a.submit(future);
            jse.b(future);
        }
        return future;
    }
}

