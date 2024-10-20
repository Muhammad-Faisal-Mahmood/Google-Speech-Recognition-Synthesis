/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public final class coy
extends AbstractExecutorService {
    private final ExecutorService a;
    private final cow b;

    private coy(ExecutorService executorService, cow cow2) {
        this.a = executorService;
        this.b = cow2;
    }

    public static ExecutorService a(gto gto2, ExecutorService executorService) {
        if (gto2.g()) {
            return new coy(executorService, (cow)gto2.c());
        }
        return executorService;
    }

    @Override
    public final boolean awaitTermination(long l2, TimeUnit timeUnit) {
        return this.a.awaitTermination(l2, timeUnit);
    }

    @Override
    public final void execute(Runnable runnable) {
        cov cov2 = this.b.a();
        if (cov2 == null) {
            this.a.execute(runnable);
            return;
        }
        this.a.execute(new ckr((Object)cov2, (Object)runnable, 12, null));
    }

    @Override
    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    @Override
    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    @Override
    public final void shutdown() {
        this.a.shutdown();
    }

    public final List shutdownNow() {
        return this.a.shutdownNow();
    }

    public final String toString() {
        return this.a.toString();
    }
}

