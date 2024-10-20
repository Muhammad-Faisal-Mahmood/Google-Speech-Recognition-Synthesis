/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;

public final class kcb
implements Executor,
Closeable {
    public static final kbt a = new kbt("NOT_IN_STACK");
    public final int b;
    public final int c;
    public final long d;
    public final String e;
    public final jub f;
    public final kbp g;
    public final jub h;
    public final dml i;
    public final dml j;
    private final jtz k;

    public kcb(int n2, int n3, long l2, String object) {
        this.b = n2;
        this.c = n3;
        this.d = l2;
        this.e = object;
        if (n2 > 0) {
            if (n3 >= n2) {
                if (n3 <= 0x1FFFFE) {
                    if (l2 > 0L) {
                        this.i = new dml(null);
                        this.j = new dml(null);
                        this.f = new jub(0L, jud.a);
                        n3 = n2 + 1;
                        this.g = new kbp(n3 + n3);
                        l2 = n2;
                        object = jud.a;
                        this.h = new jub(l2 << 42, (jse)object);
                        this.k = new jtz(false, (jse)object);
                        return;
                    }
                    object = new StringBuilder("Idle worker keep alive time ");
                    ((StringBuilder)object).append(l2);
                    ((StringBuilder)object).append(" must be positive");
                    throw new IllegalArgumentException(((StringBuilder)object).toString());
                }
                throw new IllegalArgumentException(a.ah(n3, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            }
            throw new IllegalArgumentException(a.an(n2, n3, "Max pool size ", " should be greater than or equals to core pool size "));
        }
        throw new IllegalArgumentException(a.ah(n2, "Core pool size ", " should be at least 1"));
    }

    public static /* synthetic */ void e(kcb kcb2, Runnable runnable, boolean bl2, int n2) {
        n2 = (n2 & 4) != 0 ? 0 : 1;
        kcb2.a(runnable, false, (bl2 & n2) != 0);
    }

    public static final void f(kcf runnable) {
        try {
            runnable.run();
            return;
        }
        catch (Throwable throwable) {
            runnable = Thread.currentThread();
            ((Thread)runnable).getUncaughtExceptionHandler().uncaughtException((Thread)runnable, throwable);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final int g() {
        kbp kbp2 = this.g;
        synchronized (kbp2) {
            int n2;
            boolean bl2 = this.d();
            if (bl2) {
                return -1;
            }
            long l2 = this.h.b;
            int n3 = (int)((l2 & 0x3FFFFE00000L) >> 21);
            int n4 = (int)(l2 & 0x1FFFFFL);
            if ((n3 = jse.k(n4 - n3, 0)) >= (n2 = this.b)) {
                return 0;
            }
            if (n4 >= this.c) {
                return 0;
            }
            Object object = this.g;
            l2 = this.h.b;
            n4 = (int)(l2 & 0x1FFFFFL) + 1;
            if (((kbp)object).a(n4) != null) {
                object = new IllegalArgumentException("Failed requirement.");
                throw object;
            }
            object = new kca(this, n4);
            this.g.b(n4, object);
            jub jub2 = this.h;
            l2 = jub.a.incrementAndGet(jub2);
            if (n4 == (int)(0x1FFFFFL & l2)) {
                // MONITOREXIT @DISABLED, blocks:[6, 7] lbl27 : MonitorExitStatement: MONITOREXIT : var7_1
                ((Thread)object).start();
                return n3 + 1;
            }
            object = new IllegalArgumentException("Failed requirement.");
            throw object;
        }
    }

    private final kca h() {
        Thread thread = Thread.currentThread();
        thread = thread instanceof kca ? (kca)thread : null;
        if (thread != null && jse.i(((kca)thread).c, this)) {
            return thread;
        }
        return null;
    }

    private final boolean i(long l2) {
        block5: {
            block7: {
                int n2;
                block6: {
                    if (jse.k((int)(l2 & 0x1FFFFFL) - (int)((0x3FFFFE00000L & l2) >> 21), 0) >= this.b) break block5;
                    n2 = this.g();
                    if (n2 != 1) break block6;
                    if (this.b > 1) {
                        this.g();
                    }
                    break block7;
                }
                if (n2 <= 0) break block5;
            }
            return true;
        }
        return false;
    }

    private final boolean j() {
        kca kca2;
        do {
            block2: {
                long l2;
                int n2;
                jub jub2 = this.f;
                do {
                    if ((kca2 = (kca)this.g.a((int)(0x1FFFFFL & (l2 = jub2.b)))) != null) continue;
                    kca2 = null;
                    break block2;
                } while ((n2 = kcb.k(kca2)) < 0 || !this.f.c(l2, 0x200000L + l2 & 0xFFFFFFFFFFE00000L | (long)n2));
                kca2.nextParkedWorker = a;
            }
            if (kca2 != null) continue;
            return false;
        } while (!kca2.a.b(-1, 0));
        LockSupport.unpark(kca2);
        return true;
    }

    private static final int k(kca object) {
        int n2;
        do {
            if ((object = ((kca)object).nextParkedWorker) == a) {
                return -1;
            }
            if (object == null) {
                return 0;
            }
            object = (kca)object;
        } while ((n2 = ((kca)object).indexInArray) == 0);
        return n2;
    }

    public final void a(Runnable object, boolean bl2, boolean bl3) {
        boolean bl4;
        kca kca2;
        boolean bl5;
        long l2;
        block12: {
            Object object2;
            block13: {
                object2 = kch.a;
                l2 = System.nanoTime();
                if (object instanceof kcf) {
                    object2 = (kcf)object;
                    ((kcf)object2).g = l2;
                    ((kcf)object2).h = bl2;
                } else {
                    object2 = new kcg((Runnable)object, l2, bl2);
                }
                bl5 = ((kcf)object2).h;
                l2 = bl5 ? this.h.a(0x200000L) : 0L;
                kca2 = this.h();
                bl4 = true;
                object = object2;
                if (kca2 == null) break block12;
                int n2 = kca2.d;
                object = object2;
                if (n2 == 5) break block12;
                if (((kcf)object2).h) break block13;
                object = object2;
                if (n2 == 2) break block12;
            }
            kca2.b = true;
            object = kca2.e;
            object = bl3 ? ((cya)object).f((kcf)object2) : ((object2 = (kcf)((juc)((cya)object).d).a(object2)) == null ? null : ((cya)object).f((kcf)object2));
        }
        if (object != null && !(bl2 = ((kcf)object).h ? this.j.A(object) : this.i.A(object))) {
            throw new RejectedExecutionException(String.valueOf(this.e).concat(" was terminated"));
        }
        if (!bl3 || kca2 == null) {
            bl4 = false;
        }
        if (bl5) {
            if (!(bl4 || this.j() || this.i(l2))) {
                this.j();
                return;
            }
        } else if (!bl4) {
            this.c();
        }
    }

    public final void b(kca kca2, int n2, int n3) {
        long l2;
        int n4;
        do {
            int n5;
            l2 = this.f.b;
            n4 = n5 = (int)(0x1FFFFFL & l2);
            if (n5 != n2) continue;
            n4 = n3 == 0 ? kcb.k(kca2) : n3;
        } while (n4 < 0 || !this.f.c(l2, 0x200000L + l2 & 0xFFFFFFFFFFE00000L | (long)n4));
    }

    public final void c() {
        if (!this.j() && !this.i(this.h.b)) {
            this.j();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void close() {
        Object object;
        boolean bl2;
        long l2;
        if (!this.k.a(false, true)) {
            return;
        }
        kca kca2 = this.h();
        Object object2 = this.g;
        synchronized (object2) {
            l2 = this.h.b;
        }
        int n2 = (int)(l2 & 0x1FFFFFL);
        if (n2 > 0) {
            int n3 = 1;
            while (true) {
                object2 = this.g.a(n3);
                jse.b(object2);
                object2 = (kca)object2;
                if (object2 != kca2) {
                    while (((Thread)object2).getState() != Thread.State.TERMINATED) {
                        LockSupport.unpark((Thread)object2);
                        ((Thread)object2).join(10000L);
                    }
                    bl2 = jve.a;
                    object2 = ((kca)object2).e;
                    object = this.j;
                    kcf kcf2 = (kcf)((juc)((cya)object2).d).a(null);
                    if (kcf2 != null) {
                        ((dml)object).A(kcf2);
                    }
                    while ((kcf2 = ((cya)object2).g()) != null) {
                        ((dml)object).A(kcf2);
                    }
                }
                if (n3 == n2) break;
                ++n3;
            }
        }
        this.j.z();
        this.i.z();
        while (true) {
            block17: {
                block16: {
                    if (kca2 == null) break block16;
                    object2 = object = kca2.b(true);
                    if (object != null) break block17;
                }
                object2 = object = (kcf)this.i.y();
                if (object == null) {
                    object2 = object = (kcf)this.j.y();
                    if (object == null) {
                        if (kca2 != null) {
                            kca2.d(5);
                        }
                        bl2 = jve.a;
                        this.f.b = 0L;
                        this.h.b = 0L;
                        return;
                    }
                }
            }
            kcb.f((kcf)object2);
        }
    }

    public final boolean d() {
        return this.k.b();
    }

    @Override
    public final void execute(Runnable runnable) {
        kcb.e(this, runnable, false, 6);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String toString() {
        Object object;
        int n2;
        int n3;
        int n4;
        Object object2;
        int n5;
        int n6;
        int n7;
        ArrayList<String> arrayList = new ArrayList<String>();
        int n8 = this.g.array.length();
        int n9 = 0;
        int n10 = 0;
        int n11 = n7 = (n6 = 0);
        for (n5 = 1; n5 < n8; ++n5) {
            object2 = (kca)this.g.a(n5);
            n4 = n9;
            n3 = n10;
            int n12 = n6;
            n2 = n7;
            int n13 = n11;
            if (object2 != null) {
                object = ((kca)object2).e;
                int n14 = ((juc)((cya)object).d).a != null ? ((cya)object).e() + 1 : ((cya)object).e();
                n4 = ((kca)object2).d;
                n3 = n4 - 1;
                if (n4 == 0) throw null;
                if (n3 != 0) {
                    if (n3 != 1) {
                        if (n3 != 2) {
                            if (n3 != 3) {
                                if (n3 != 4) throw new joa();
                                n13 = n11 + 1;
                                n4 = n9;
                                n3 = n10;
                                n12 = n6;
                                n2 = n7;
                            } else {
                                n4 = n9;
                                n3 = n10;
                                n12 = n6;
                                n2 = ++n7;
                                n13 = n11;
                                if (n14 > 0) {
                                    object2 = new StringBuilder();
                                    ((StringBuilder)object2).append(n14);
                                    ((StringBuilder)object2).append("d");
                                    arrayList.add(((StringBuilder)object2).toString());
                                    n4 = n9;
                                    n3 = n10;
                                    n12 = n6;
                                    n2 = n7;
                                    n13 = n11;
                                }
                            }
                        } else {
                            n12 = n6 + 1;
                            n4 = n9;
                            n3 = n10;
                            n2 = n7;
                            n13 = n11;
                        }
                    } else {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append(n14);
                        ((StringBuilder)object2).append("b");
                        arrayList.add(((StringBuilder)object2).toString());
                        n3 = n10 + 1;
                        n4 = n9;
                        n12 = n6;
                        n2 = n7;
                        n13 = n11;
                    }
                } else {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append(n14);
                    ((StringBuilder)object2).append("c");
                    arrayList.add(((StringBuilder)object2).toString());
                    n4 = n9 + 1;
                    n3 = n10;
                    n12 = n6;
                    n2 = n7;
                    n13 = n11;
                }
            }
            n9 = n4;
            n10 = n3;
            n6 = n12;
            n7 = n2;
            n11 = n13;
        }
        object = this.h;
        object2 = this.e;
        long l2 = ((jub)object).b;
        object = jvf.b(this);
        n4 = this.b;
        n5 = this.c;
        dml dml2 = this.i;
        Object object3 = this.j;
        n3 = dml2.x();
        n2 = ((dml)object3).x();
        object3 = new StringBuilder();
        ((StringBuilder)object3).append((String)object2);
        ((StringBuilder)object3).append("@");
        ((StringBuilder)object3).append((String)object);
        ((StringBuilder)object3).append("[Pool Size {core = ");
        ((StringBuilder)object3).append(n4);
        ((StringBuilder)object3).append(", max = ");
        ((StringBuilder)object3).append(n5);
        ((StringBuilder)object3).append("}, Worker States {CPU = ");
        ((StringBuilder)object3).append(n9);
        ((StringBuilder)object3).append(", blocking = ");
        ((StringBuilder)object3).append(n10);
        ((StringBuilder)object3).append(", parked = ");
        ((StringBuilder)object3).append(n6);
        ((StringBuilder)object3).append(", dormant = ");
        ((StringBuilder)object3).append(n7);
        ((StringBuilder)object3).append(", terminated = ");
        ((StringBuilder)object3).append(n11);
        ((StringBuilder)object3).append("}, running workers queues = ");
        ((StringBuilder)object3).append(arrayList);
        ((StringBuilder)object3).append(", global CPU queue size = ");
        ((StringBuilder)object3).append(n3);
        ((StringBuilder)object3).append(", global blocking queue size = ");
        ((StringBuilder)object3).append(n2);
        ((StringBuilder)object3).append(", Control State {created workers= ");
        ((StringBuilder)object3).append((int)(l2 & 0x1FFFFFL));
        ((StringBuilder)object3).append(", blocking tasks = ");
        ((StringBuilder)object3).append((int)((0x3FFFFE00000L & l2) >> 21));
        ((StringBuilder)object3).append(", CPUs acquired = ");
        ((StringBuilder)object3).append(n4 - (int)((l2 & 0x7FFFFC0000000000L) >> 42));
        ((StringBuilder)object3).append("}]");
        return ((StringBuilder)object3).toString();
    }
}

