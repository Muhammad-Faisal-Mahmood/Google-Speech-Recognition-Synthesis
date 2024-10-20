/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

public final class cog
extends ScheduledThreadPoolExecutor {
    public cog(ThreadFactory threadFactory) {
        super(1, threadFactory);
    }

    protected final RunnableScheduledFuture decorateTask(Runnable runnable, RunnableScheduledFuture runnableScheduledFuture) {
        return cpc.b(runnableScheduledFuture);
    }

    protected final RunnableScheduledFuture decorateTask(Callable callable, RunnableScheduledFuture runnableScheduledFuture) {
        return cpc.b(runnableScheduledFuture);
    }
}

