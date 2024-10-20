/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class jwb
extends jwa
implements jvj {
    private final Executor a;

    public jwb(Executor executor) {
        this.a = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor)executor).setRemoveOnCancelPolicy(true);
        }
    }

    private static final void h(jqf jqf2, RejectedExecutionException rejectedExecutionException) {
        jns.as(jqf2, jvf.l("The task was rejected", rejectedExecutionException));
    }

    private static final ScheduledFuture i(ScheduledExecutorService object, Runnable runnable, jqf jqf2, long l2) {
        try {
            object = object.schedule(runnable, l2, TimeUnit.MILLISECONDS);
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            jwb.h(jqf2, rejectedExecutionException);
            object = null;
        }
        return object;
    }

    @Override
    public final void a(jqf jqf2, Runnable runnable) {
        try {
            this.a.execute(runnable);
            return;
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            jwb.h(jqf2, rejectedExecutionException);
            juy juy2 = jvo.a;
            ((juy)kcc.a).a(jqf2, runnable);
            return;
        }
    }

    @Override
    public final void c(long l2, jul jul2) {
        Executor executor = this.a;
        boolean bl2 = executor instanceof ScheduledExecutorService;
        ScheduledFuture scheduledFuture = null;
        executor = bl2 ? (ScheduledExecutorService)executor : null;
        if (executor != null) {
            scheduledFuture = jwb.i((ScheduledExecutorService)executor, new bcv((Object)this, (Object)jul2, 6), jul2.b, l2);
        }
        if (scheduledFuture != null) {
            jul2.t(new juj(scheduledFuture, 1));
            return;
        }
        jvg.a.c(l2, jul2);
    }

    @Override
    public final void close() {
        Executor executor = this.a;
        executor = executor instanceof ExecutorService ? (ExecutorService)executor : null;
        if (executor != null) {
            executor.shutdown();
        }
    }

    @Override
    public final Executor e() {
        return this.a;
    }

    public final boolean equals(Object object) {
        return object instanceof jwb && ((jwb)object).a == this.a;
    }

    @Override
    public final jvq g(long l2, Runnable object, jqf jqf2) {
        Executor executor = this.a;
        boolean bl2 = executor instanceof ScheduledExecutorService;
        ScheduledFuture scheduledFuture = null;
        executor = bl2 ? (ScheduledExecutorService)executor : null;
        if (executor != null) {
            scheduledFuture = jwb.i((ScheduledExecutorService)executor, (Runnable)object, jqf2, l2);
        }
        object = scheduledFuture != null ? new jvp(scheduledFuture) : jvg.a.u(l2, (Runnable)object);
        return object;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }

    @Override
    public final String toString() {
        return this.a.toString();
    }
}

