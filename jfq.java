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

final class jfq
implements ScheduledExecutorService {
    final ScheduledExecutorService a;

    public jfq(ScheduledExecutorService scheduledExecutorService) {
        a.s(scheduledExecutorService, "delegate");
        this.a = scheduledExecutorService;
    }

    @Override
    public final boolean awaitTermination(long l2, TimeUnit timeUnit) {
        return this.a.awaitTermination(l2, timeUnit);
    }

    @Override
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }

    public final List invokeAll(Collection collection) {
        return this.a.invokeAll(collection);
    }

    public final List invokeAll(Collection collection, long l2, TimeUnit timeUnit) {
        return this.a.invokeAll(collection, l2, timeUnit);
    }

    public final Object invokeAny(Collection collection) {
        return this.a.invokeAny(collection);
    }

    public final Object invokeAny(Collection collection, long l2, TimeUnit timeUnit) {
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

    public final ScheduledFuture schedule(Runnable runnable, long l2, TimeUnit timeUnit) {
        return this.a.schedule(runnable, l2, timeUnit);
    }

    public final ScheduledFuture schedule(Callable callable, long l2, TimeUnit timeUnit) {
        return this.a.schedule(callable, l2, timeUnit);
    }

    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long l2, long l3, TimeUnit timeUnit) {
        return this.a.scheduleAtFixedRate(runnable, l2, l3, timeUnit);
    }

    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long l2, long l3, TimeUnit timeUnit) {
        return this.a.scheduleWithFixedDelay(runnable, l2, l3, timeUnit);
    }

    @Override
    public final void shutdown() {
        throw new UnsupportedOperationException("Restricted: shutdown() is not allowed");
    }

    public final List shutdownNow() {
        throw new UnsupportedOperationException("Restricted: shutdownNow() is not allowed");
    }

    public final Future submit(Runnable runnable) {
        return this.a.submit(runnable);
    }

    public final Future submit(Runnable runnable, Object object) {
        return this.a.submit(runnable, object);
    }

    public final Future submit(Callable callable) {
        return this.a.submit(callable);
    }
}

