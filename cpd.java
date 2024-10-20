/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class cpd
extends hnl {
    final Executor a;
    final hpr b;

    public cpd(Executor executor, hpr hpr2) {
        this.a = executor;
        this.b = hpr2;
    }

    @Override
    public final boolean awaitTermination(long l2, TimeUnit timeUnit) {
        return this.b.awaitTermination(l2, timeUnit);
    }

    @Override
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }

    @Override
    public final boolean isShutdown() {
        return this.b.isShutdown();
    }

    @Override
    public final boolean isTerminated() {
        return this.b.isTerminated();
    }

    @Override
    public final void shutdown() {
        this.b.shutdown();
    }

    public final List shutdownNow() {
        return this.b.shutdownNow();
    }

    public final String toString() {
        return this.a.toString();
    }
}

