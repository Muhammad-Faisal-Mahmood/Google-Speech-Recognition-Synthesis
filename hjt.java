/*
 * Decompiled with CFR 0.152.
 */
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

public final class hjt
extends AbstractExecutorService {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    public final AtomicInteger d = new AtomicInteger();
    public final AtomicInteger e = new AtomicInteger();
    public final AtomicInteger f = new AtomicInteger();
    public boolean g;
    public final AtomicBoolean h = new AtomicBoolean();
    public final ThreadFactory i;
    public final boolean j;
    public final Runnable k;
    public final Runnable l;
    public final hjr[] m;
    public final hjr[] n;
    public final CountDownLatch o;
    public final AtomicReference p;
    private final int q;
    private boolean r;
    private final boolean s;
    private final hjs[] t;

    public hjt(int n2, ThreadFactory object, Runnable objectArray, Runnable runnable) {
        if (n2 > 0) {
            int n3;
            this.q = Integer.MAX_VALUE;
            this.i = object;
            this.j = true;
            this.k = objectArray;
            this.l = runnable;
            this.s = true;
            this.o = new CountDownLatch(n2);
            int n4 = n2 + 1;
            object = new hjr[n4];
            objectArray = new hjr[n4];
            int n5 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                object[n3] = new hjr(b, n3);
                objectArray[n3] = new hjr(a, n3);
            }
            this.m = object;
            this.n = objectArray;
            objectArray = new hjs[n2];
            object = object[0];
            for (n3 = n5; n3 < n2; ++n3) {
                object = new hjr(object, n3);
                objectArray[n3] = new hjs(this, n3);
            }
            this.t = objectArray;
            this.p = new AtomicReference<hjr[]>((hjr[])object);
            return;
        }
        throw new IllegalArgumentException(a.af(n2, "numThreads must be positive: "));
    }

    /*
     * Unable to fully structure code
     */
    private final void b(boolean var1_1) {
        this.r = true;
        block0: while (true) {
            var3_3 = (hjr)this.p.get();
            var2_2 = var3_3.a;
            if (var2_2 == hjt.a) {
                return;
            }
            var2_2 = var2_2 == hjt.b && !var1_1 ? this.n[var3_3.b] : this.n[0];
            if (!a.l(this.p, var3_3, var2_2)) continue;
            var2_2 = var3_3;
            while (true) {
                if (var2_2.a != hjt.b) ** break;
                continue block0;
                var4_4 = this.t[var2_2.b];
                var3_3 = var4_4.b;
                var4_4.i = 3;
                if (var3_3 != null) {
                    LockSupport.unpark((Thread)var3_3);
                } else {
                    var4_4.a();
                }
                var2_2 = (hjr)var2_2.a;
            }
            break;
        }
    }

    public final void a() {
        if (this.s) {
            this.d.decrementAndGet();
        }
    }

    @Override
    public final boolean awaitTermination(long l2, TimeUnit timeUnit) {
        return this.o.await(l2, timeUnit);
    }

    @Override
    public final void execute(Runnable object) {
        block10: {
            int n2;
            Object object2;
            int n3;
            object.getClass();
            if (this.r) break block10;
            if (this.s) {
                if (this.q != Integer.MAX_VALUE) {
                    do {
                        object2 = this.d;
                        n2 = this.q;
                        n3 = ((AtomicInteger)object2).get();
                        if (n3 == n2) break block10;
                    } while (!this.d.compareAndSet(n3, n3 + 1));
                } else {
                    this.d.incrementAndGet();
                }
            }
            object = new hjr(object, -1);
            this.c.add(object);
            while (true) {
                hjr hjr2;
                block13: {
                    block14: {
                        block12: {
                            block11: {
                                hjr2 = (hjr)this.p.get();
                                object2 = hjr2.a;
                                if (object2 != b) break block11;
                                n2 = hjr2.b;
                                n3 = Math.min(n2 + 1, this.t.length);
                                if (n3 != n2 && !a.l(this.p, hjr2, this.m[n3])) continue;
                                break block12;
                            }
                            if (object2 != a) break block13;
                            if (this.c.remove(object)) break block14;
                        }
                        return;
                    }
                    this.a();
                    throw new RejectedExecutionException();
                }
                n2 = hjr2.b;
                if (a.l(this.p, hjr2, (hjr)object2)) break;
            }
            object2 = this.t[n2];
            object = ((hjs)object2).b;
            ((hjs)object2).i = 1;
            if (object != null) {
                LockSupport.unpark((Thread)object);
                return;
            }
            ((hjs)object2).h.e.incrementAndGet();
            ((hjs)object2).b();
            return;
        }
        throw new RejectedExecutionException();
    }

    @Override
    public final boolean isShutdown() {
        return ((hjr)this.p.get()).a == a;
    }

    @Override
    public final boolean isTerminated() {
        return this.o.getCount() == 0L;
    }

    @Override
    public final void shutdown() {
        this.b(false);
    }

    public final List shutdownNow() {
        this.b(true);
        ArrayList<Runnable> arrayList = new ArrayList<Runnable>();
        Object object = this.h;
        int n2 = 0;
        if (((AtomicBoolean)object).compareAndSet(false, true)) {
            while (true) {
                if ((object = (hjr)this.c.poll()) == null) {
                    this.g = true;
                    hjs[] hjsArray = this.t;
                    int n3 = hjsArray.length;
                    while (n2 < n3) {
                        object = hjsArray[n2].c;
                        if (object != null) {
                            ((Thread)object).interrupt();
                        }
                        ++n2;
                    }
                    break;
                }
                this.a();
                arrayList.add((Runnable)((hjr)object).a);
            }
        }
        return arrayList;
    }
}

