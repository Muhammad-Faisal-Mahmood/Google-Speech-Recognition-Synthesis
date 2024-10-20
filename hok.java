/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

abstract class hok
extends hpl {
    private final Executor a;
    final hol b;

    public hok(hol hol2, Executor executor) {
        this.b = hol2;
        fxf.K(executor);
        this.a = executor;
    }

    public abstract void c(Object var1);

    @Override
    public final void d(Throwable throwable) {
        hol.t(this.b);
        if (throwable instanceof ExecutionException) {
            this.b.n(((ExecutionException)throwable).getCause());
            return;
        }
        if (throwable instanceof CancellationException) {
            this.b.cancel(false);
            return;
        }
        this.b.n(throwable);
    }

    @Override
    public final void e(Object object) {
        hol.t(this.b);
        this.c(object);
    }

    final void f() {
        try {
            this.a.execute(this);
            return;
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            this.b.n(rejectedExecutionException);
            return;
        }
    }

    @Override
    public final boolean g() {
        return this.b.isDone();
    }
}

