/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class how
extends gzg
implements ExecutorService {
    protected how() {
    }

    @Override
    public final boolean awaitTermination(long l2, TimeUnit timeUnit) {
        return this.g().awaitTermination(l2, timeUnit);
    }

    @Override
    public void execute(Runnable runnable) {
        this.g().execute(runnable);
    }

    protected abstract ExecutorService g();

    public final List invokeAll(Collection collection) {
        return this.g().invokeAll(collection);
    }

    public final List invokeAll(Collection collection, long l2, TimeUnit timeUnit) {
        return this.g().invokeAll(collection, l2, timeUnit);
    }

    public final Object invokeAny(Collection collection) {
        return this.g().invokeAny(collection);
    }

    public final Object invokeAny(Collection collection, long l2, TimeUnit timeUnit) {
        return this.g().invokeAny(collection, l2, timeUnit);
    }

    @Override
    public final boolean isShutdown() {
        return this.g().isShutdown();
    }

    @Override
    public final boolean isTerminated() {
        return this.g().isTerminated();
    }

    @Override
    public void shutdown() {
        this.g().shutdown();
    }

    public List shutdownNow() {
        return this.g().shutdownNow();
    }

    public Future submit(Runnable runnable) {
        return this.g().submit(runnable);
    }

    public Future submit(Runnable runnable, Object object) {
        return this.g().submit(runnable, object);
    }

    public Future submit(Callable callable) {
        return this.g().submit(callable);
    }
}

