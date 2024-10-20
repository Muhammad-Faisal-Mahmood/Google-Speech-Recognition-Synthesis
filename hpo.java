/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public final class hpo
extends FutureTask
implements hpn {
    private final hop a = new hop();

    public hpo(Runnable runnable) {
        super(runnable, null);
    }

    public hpo(Callable callable) {
        super(callable);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void c(Runnable runnable, Executor executor) {
        a.s(runnable, "Runnable was null.");
        a.s(executor, "Executor was null.");
        hop hop2 = this.a;
        synchronized (hop2) {
            if (!hop2.b) {
                hoo hoo2;
                hop2.a = hoo2 = new hoo(runnable, executor, hop2.a);
                return;
            }
        }
        hop.a(runnable, executor);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final void done() {
        hoo hoo2;
        Object object;
        Object object2 = this.a;
        synchronized (object2) {
            if (((hop)object2).b) {
                return;
            }
            ((hop)object2).b = true;
            object = ((hop)object2).a;
            hoo2 = null;
            ((hop)object2).a = null;
        }
        while (true) {
            object2 = hoo2;
            if (object == null) break;
            object2 = ((hoo)object).c;
            ((hoo)object).c = hoo2;
            hoo2 = object;
            object = object2;
        }
        while (object2 != null) {
            hop.a(((hoo)object2).a, ((hoo)object2).b);
            object2 = ((hoo)object2).c;
        }
        return;
    }

    public final Object get(long l2, TimeUnit timeUnit) {
        long l3 = timeUnit.toNanos(l2);
        if (l3 <= 2147483647999999999L) {
            return super.get(l2, timeUnit);
        }
        return super.get(Math.min(l3, 2147483647999999999L), TimeUnit.NANOSECONDS);
    }
}

