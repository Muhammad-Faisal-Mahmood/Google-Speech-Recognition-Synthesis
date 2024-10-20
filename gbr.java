/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gda
 *  hom
 */
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public final class gbr
implements ExecutorService {
    private static final hei c = hei.m("com/google/apps/tiktok/concurrent/SuspendableUiThreadExecutor");
    public final Deque a = new ArrayDeque();
    public int b = 1;
    private final Executor d;
    private final boolean e;
    private boolean f;
    private hpn g;
    private final hpy h = new hpy(this, 1);

    public gbr(Executor executor, gda gda2) {
        this.d = executor;
        fxf.K(gda2);
        this.e = true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static /* synthetic */ void d(hpn hpn2) {
        try {
            hhk.S(hpn2);
            return;
        }
        catch (ExecutionException executionException) {
            a.as(c.g(), "Silently ignored exception in SuspendableUiThreadExecutor.", "com/google/apps/tiktok/concurrent/SuspendableUiThreadExecutor", "logOnFailure", '\u019c', "SuspendableUiThreadExecutor.java", executionException.getCause());
            return;
        }
        catch (CancellationException cancellationException) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Queue a() {
        Deque deque = this.a;
        synchronized (deque) {
            fxf.B(this.f, "Executor may only be drained when it is suspended.");
            ArrayDeque arrayDeque = new ArrayDeque(this.a);
            this.a.clear();
            return arrayDeque;
        }
    }

    @Override
    public final boolean awaitTermination(long l2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        fpk.c();
        Deque deque = this.a;
        synchronized (deque) {
            this.f = false;
        }
        this.execute(hpw.a);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() {
        fpk.c();
        Deque deque = this.a;
        synchronized (deque) {
            this.f = true;
            this.b = 1;
            hpn hpn2 = this.g;
            if (hpn2 != null) {
                hpn2.cancel(false);
                this.g = null;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void execute(Runnable runnable) {
        int n2;
        int n3;
        fxf.K(runnable);
        Deque deque = this.a;
        // MONITORENTER : deque
        if (!this.f && (n3 = this.b) != 3 && n3 != 2) {
            hpn hpn2;
            this.a.add(runnable);
            this.g = hpn2 = hhk.N(gqk.i(this.h), this.d);
            runnable = new ffd(hpn2, 13);
            hpn2.c(gqk.i(runnable), (Executor)hom.a);
            this.b = 2;
            // MONITOREXIT : deque
        } else {
            this.a.add(runnable);
            // MONITOREXIT : deque
        }
        deque = this.a;
        // MONITORENTER : deque
        boolean bl2 = fpk.g();
        n3 = n2 = 0;
        if (bl2) {
            n3 = n2;
            if (this.e) {
                n3 = n2;
                if (!this.f) {
                    n3 = n2;
                    if (this.b != 3) {
                        a.s(this.g, "Should not be possible since the worker must have been scheduled in `executeInternal()`.");
                        this.g.cancel(false);
                        this.g = null;
                        this.b = 2;
                        n3 = 1;
                    }
                }
            }
        }
        // MONITOREXIT : deque
        if (n3 == 0) return;
        this.h.run();
    }

    public final List invokeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final List invokeAll(Collection collection, long l2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final Object invokeAny(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final Object invokeAny(Collection collection, long l2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean isShutdown() {
        return false;
    }

    @Override
    public final boolean isTerminated() {
        return false;
    }

    @Override
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    public final Future submit(Runnable runnable) {
        return hhk.N(runnable, this);
    }

    public final Future submit(Runnable runnable, Object object) {
        return hhk.O(new czm(runnable, object, 17, null), this);
    }

    public final Future submit(Callable callable) {
        return hhk.O(callable, this);
    }
}

