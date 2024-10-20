/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class jid
implements jcj {
    static final iws a = new iwm("grpc-previous-rpc-attempts", iwx.b);
    static final iws b = new iwm("grpc-retry-pushback-ms", iwx.b);
    public static final iyh c = iyh.c.e("Stream thrown away because RetriableStream committed");
    public static final Random d = new Random();
    final ixb A;
    final itw B;
    final ius C;
    final jfe D;
    public final dml E;
    public bmu F;
    private final iwx G;
    private iyh H;
    public final ixb e;
    public final Executor f;
    public final Executor g;
    public final ScheduledExecutorService h;
    public final jie i;
    public final jec j;
    public final boolean k;
    public final Object l;
    public final long m;
    public final long n;
    public final jic o;
    public final jeh p;
    public volatile jhy q;
    public final AtomicBoolean r;
    public final AtomicInteger s;
    public final AtomicInteger t;
    public long u;
    public jcl v;
    public jhw w;
    public jhw x;
    public long y;
    public boolean z;

    public jid(jfe object, ixb ixb2, iwx iwx2, itw object2, jie jie2, jec jec2, ius object3) {
        this.A = ixb2;
        this.B = object2;
        this.C = object3;
        this.D = object;
        Object object4 = ((jfe)object).b;
        object3 = ((jfs)object4).T;
        long l2 = ((jfs)object4).N;
        long l3 = ((jfs)object4).O;
        object2 = ((jfs)object4).e((itw)object2);
        object4 = ((jfs)object4).i.c();
        object = ((jfe)object).a;
        this.g = new iym(new jhn());
        this.l = new Object();
        this.p = new jeh();
        this.q = new jhy(new ArrayList(8), Collections.emptyList(), null, null, false, false, false, 0);
        this.r = new AtomicBoolean();
        this.s = new AtomicInteger();
        this.t = new AtomicInteger();
        this.e = ixb2;
        this.E = object3;
        this.m = l2;
        this.n = l3;
        this.f = object2;
        this.h = object4;
        this.G = iwx2;
        this.i = jie2;
        if (jie2 != null) {
            this.y = jie2.b;
        }
        this.j = jec2;
        boolean bl2 = false;
        boolean bl3 = jie2 == null || jec2 == null;
        fxf.r(bl3, "Should not provide both retryPolicy and hedgingPolicy");
        bl3 = bl2;
        if (jec2 != null) {
            bl3 = true;
        }
        this.k = bl3;
        this.o = object;
    }

    public static /* bridge */ /* synthetic */ void x(jid jid2) {
        jid2.z = true;
    }

    @Override
    public final its a() {
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void b(jeh jeh2) {
        Object object = this.l;
        // MONITORENTER : object
        jeh2.b("closed", this.p);
        Object object2 = this.q;
        // MONITOREXIT : object
        if (((jhy)object2).f != null) {
            object = new jeh();
            ((jhy)object2).f.a.b((jeh)object);
            jeh2.b("committed", object);
            return;
        }
        object = new jeh();
        Iterator iterator = ((jhy)object2).c.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                jeh2.b("open", object);
                return;
            }
            object2 = (jib)iterator.next();
            jeh jeh3 = new jeh();
            ((jib)object2).a.b(jeh3);
            ((jeh)object).a(jeh3);
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
    public final void c(iyh iyh2) {
        jhy jhy2;
        jib jib2;
        Object object = new jib(0);
        ((jib)object).a = new jgo();
        Object object2 = this.q((jib)object);
        if (object2 != null) {
            Object object3 = this.l;
            // MONITORENTER : object3
            this.q = this.q.c((jib)object);
            // MONITOREXIT : object3
            object2.run();
            this.v(iyh2, jck.a, new iwx());
            return;
        }
        object = this.l;
        // MONITORENTER : object
        if (this.q.c.contains(this.q.f)) {
            jib2 = this.q.f;
        } else {
            this.H = iyh2;
            jib2 = null;
        }
        object2 = this.q;
        this.q = jhy2 = new jhy(((jhy)object2).b, ((jhy)object2).c, ((jhy)object2).d, ((jhy)object2).f, true, ((jhy)object2).a, ((jhy)object2).h, ((jhy)object2).e);
        // MONITOREXIT : object
        if (jib2 == null) return;
        jib2.a.c(iyh2);
    }

    @Override
    public final void d() {
        jhy jhy2 = this.q;
        if (jhy2.a) {
            jhy2.f.a.d();
            return;
        }
        this.s(new jhq(1));
    }

    @Override
    public final void e() {
        this.s(new jhq(0));
    }

    @Override
    public final void f() {
        this.s(new jhq(2));
    }

    @Override
    public final void g(int n2) {
        jhy jhy2 = this.q;
        if (jhy2.a) {
            jhy2.f.a.g(n2);
            return;
        }
        this.s(new jhr(n2, 2));
    }

    @Override
    public final void h(iuf iuf2) {
        this.s(new jhp(iuf2, 1));
    }

    @Override
    public final void i(iut iut2) {
        this.s(new jhp(iut2, 0));
    }

    @Override
    public final void j(iuw iuw2) {
        this.s(new jhp(iuw2, 2));
    }

    @Override
    public final void k(int n2) {
        this.s(new jhr(n2, 1));
    }

    @Override
    public final void l(int n2) {
        this.s(new jhr(n2, 0));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void m(jcl object) {
        Object object2;
        block17: {
            block18: {
                block19: {
                    this.v = object;
                    object2 = this.D.b.z;
                    Object object3 = ((jfr)object2).a;
                    // MONITORENTER : object3
                    object = ((jfr)object2).c;
                    Object var2_4 = null;
                    if (object != null) {
                        // MONITOREXIT : object3
                    } else {
                        ((jfr)object2).b.add(this);
                        // MONITOREXIT : object3
                        object = null;
                    }
                    if (object != null) {
                        this.c((iyh)object);
                        return;
                    }
                    object = this.l;
                    // MONITORENTER : object
                    object3 = this.q.b;
                    object2 = new jhx(this);
                    object3.add(object2);
                    // MONITOREXIT : object
                    object2 = this.p(0, false);
                    if (object2 == null) {
                        return;
                    }
                    if (!this.k) break block17;
                    object3 = this.l;
                    // MONITORENTER : object3
                    this.q = this.q.a((jib)object2);
                    object = var2_4;
                    if (!this.w(this.q)) break block18;
                    jic jic2 = this.o;
                    if (jic2 == null) break block19;
                    object = var2_4;
                    if (!jic2.a()) break block18;
                }
                this.x = object = new jhw(this.l);
            }
            // MONITOREXIT : object3
            if (object != null) {
                ((jhw)object).b(this.h.schedule(new cdn(this, object, 3), this.j.b, TimeUnit.NANOSECONDS));
            }
        }
        this.t((jib)object2);
    }

    @Override
    public final void n(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override
    public final boolean o() {
        Iterator iterator = this.q.c.iterator();
        while (iterator.hasNext()) {
            if (!((jib)iterator.next()).a.o()) continue;
            return true;
        }
        return false;
    }

    public final jib p(int n2, boolean bl2) {
        int n3;
        do {
            if ((n3 = this.t.get()) >= 0) continue;
            return null;
        } while (!this.t.compareAndSet(n3, n3 + 1));
        jib jib2 = new jib(n2);
        iuc[] iucArray = new jht(new jhv(this, jib2));
        Object object = this.G;
        Object object2 = new iwx();
        ((iwx)object2).f((iwx)object);
        if (n2 > 0) {
            ((iwx)object2).g(a, String.valueOf(n2));
        }
        itw itw2 = this.B.i((fvc)iucArray);
        iucArray = jeb.l(itw2, n2, bl2);
        object = this.C.a();
        try {
            object2 = this.D.b.y.b(this.A, (iwx)object2, itw2, iucArray);
            jib2.a = object2;
            return jib2;
        }
        finally {
            this.C.f((ius)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Runnable q(jib jib2) {
        Object object = this.l;
        synchronized (object) {
            jhy jhy2;
            Object object2;
            if (this.q.f != null) {
                return null;
            }
            Collection collection = this.q.c;
            jhy jhy3 = this.q;
            boolean bl2 = jhy3.f == null;
            fxf.B(bl2, "Already committed");
            Object object3 = jhy3.b;
            if (jhy3.c.contains(jib2)) {
                object2 = Collections.singleton(jib2);
                object3 = null;
                bl2 = true;
            } else {
                object2 = Collections.emptyList();
                bl2 = false;
            }
            this.q = jhy2 = new jhy((List)object3, (Collection)object2, jhy3.d, jib2, jhy3.g, bl2, jhy3.h, jhy3.e);
            this.E.D(-this.u);
            object3 = this.w;
            bl2 = object3 != null ? ((jhw)object3).b : false;
            if (object3 != null) {
                object3 = ((jhw)object3).a();
                this.w = null;
            } else {
                object3 = null;
            }
            object2 = this.x;
            if (object2 != null) {
                object2 = ((jhw)object2).a();
                this.x = null;
                return new jho(this, collection, jib2, (Future)object3, bl2, (Future)object2, 0);
            } else {
                object2 = null;
            }
            return new jho(this, collection, jib2, (Future)object3, bl2, (Future)object2, 0);
        }
    }

    public final void r(jib object) {
        if ((object = this.q((jib)object)) != null) {
            this.f.execute((Runnable)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void s(jhu jhu2) {
        Collection collection;
        Iterator iterator = this.l;
        synchronized (iterator) {
            if (!this.q.a) {
                this.q.b.add(jhu2);
            }
            collection = this.q.c;
        }
        iterator = collection.iterator();
        while (iterator.hasNext()) {
            jhu2.a((jib)iterator.next());
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void t(jib object) {
        jcj jcj2 = null;
        int n2 = 0;
        int n3 = 0;
        ArrayList arrayList = null;
        while (true) {
            int n4;
            block18: {
                int n5;
                boolean bl2;
                jhy jhy2;
                Object object2;
                block22: {
                    block20: {
                        block21: {
                            block19: {
                                object2 = this.l;
                                // MONITORENTER : object2
                                jhy2 = this.q;
                                jib jib2 = jhy2.f;
                                if (jib2 == null || jib2 == object) break block19;
                                // MONITOREXIT : object2
                                arrayList = jcj2;
                                break block20;
                            }
                            if (!jhy2.g) break block21;
                            // MONITOREXIT : object2
                            arrayList = jcj2;
                            break block20;
                        }
                        if (n2 != jhy2.b.size()) break block22;
                        this.q = jhy2.c((jib)object);
                        if (!this.o()) {
                            // MONITOREXIT : object2
                            return;
                        }
                        arrayList = new ArrayList(this, 1);
                        // MONITOREXIT : object2
                    }
                    if (arrayList != null) {
                        this.g.execute((Runnable)((Object)arrayList));
                        return;
                    }
                    if (n3 == 0) {
                        ((jib)object).a.m(new jia(this, (jib)object));
                    }
                    arrayList = ((jib)object).a;
                    object = this.q.f == object ? this.H : c;
                    arrayList.c((iyh)object);
                    return;
                }
                if (((jib)object).b) {
                    // MONITOREXIT : object2
                    return;
                }
                n4 = Math.min(n2 + 128, jhy2.b.size());
                if (arrayList == null) {
                    arrayList = new ArrayList(jhy2.b.subList(n2, n4));
                } else {
                    arrayList.clear();
                    arrayList.addAll(jhy2.b.subList(n2, n4));
                }
                // MONITOREXIT : object2
                int n6 = arrayList.size();
                int n7 = 0;
                n2 = n3;
                do {
                    n3 = n2;
                    if (n7 >= n6) break block18;
                    object2 = (jhu)arrayList.get(n7);
                    object2.a((jib)object);
                    n5 = n2 | object2 instanceof jhx;
                    jhy2 = this.q;
                    object2 = jhy2.f;
                    if (object2 != null) {
                        n3 = n5;
                        if (object2 != object) break block18;
                    }
                    bl2 = jhy2.g;
                    ++n7;
                    n2 = n5;
                } while (!bl2);
                n3 = n5;
            }
            n2 = n4;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void u() {
        Object object = this.l;
        // MONITORENTER : object
        jhw jhw2 = this.x;
        Future future = null;
        if (jhw2 != null) {
            future = jhw2.a();
            this.x = null;
        }
        this.q = this.q.b();
        // MONITOREXIT : object
        if (future == null) return;
        future.cancel(false);
    }

    public final void v(iyh iyh2, jck jck2, iwx iwx2) {
        this.F = new bmu((Object)iyh2, (Object)jck2, (Object)iwx2, null);
        if (this.t.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.g.execute(new ww(this, iyh2, jck2, iwx2, 13));
        }
    }

    public final boolean w(jhy jhy2) {
        return jhy2.f == null && jhy2.e < this.j.a && !jhy2.h;
    }
}

