/*
 * Decompiled with CFR 0.152.
 */
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.lang.ref.ReferenceQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;

final class gvu
extends ReentrantLock {
    final gwr a;
    volatile int b;
    long c;
    int d;
    int e;
    volatile AtomicReferenceArray f;
    final long g;
    final ReferenceQueue h;
    final ReferenceQueue i;
    final Queue j;
    final AtomicInteger k = new AtomicInteger();
    final Queue l;
    final Queue m;

    public gvu(gwr queue, int n2, long l2) {
        this.a = queue;
        this.g = l2;
        Queue queue2 = new AtomicReferenceArray(n2);
        this.e = ((AtomicReferenceArray)((Object)queue2)).length() * 3 / 4;
        if (!((gwr)((Object)queue)).g() && (long)(n2 = this.e) == l2) {
            this.e = n2 + 1;
        }
        this.f = queue2;
        boolean bl2 = ((gwr)((Object)queue)).n();
        Object var7_6 = null;
        queue2 = bl2 ? new ReferenceQueue() : null;
        this.h = queue2;
        queue2 = var7_6;
        if (((gwr)((Object)queue)).o()) {
            queue2 = new ReferenceQueue();
        }
        this.i = queue2;
        queue2 = ((gwr)((Object)queue)).m() ? new ConcurrentLinkedQueue() : gwr.c;
        this.j = queue2;
        queue2 = ((gwr)((Object)queue)).j() ? new gwp() : gwr.c;
        this.l = queue2;
        queue = ((gwr)((Object)queue)).m() ? new gve() : gwr.c;
        this.m = queue;
    }

    final gws a(gws gws2, gws gws3) {
        gwd gwd2;
        Object object;
        Object object2 = gws2.j();
        if (object2 == null || (object = (gwd2 = gws2.d()).get()) == null && gwd2.d()) {
            return null;
        }
        gws2 = this.a.s.a(this, gws2, gws3, object2);
        gws2.p(gwd2.b(this.i, object, gws2));
        return gws2;
    }

    final gws b(Object object, int n2, long l2) {
        Object object2;
        block5: {
            object2 = this.f;
            for (object2 = (gws)((AtomicReferenceArray)object2).get(((AtomicReferenceArray)object2).length() - 1 & n2); object2 != null; object2 = object2.e()) {
                if (object2.a() != n2) continue;
                Object object3 = object2.j();
                if (object3 == null) {
                    this.p();
                    continue;
                }
                if (!this.a.h.c(object, object3)) {
                    continue;
                }
                break block5;
            }
            object2 = null;
        }
        if (object2 == null) {
            return null;
        }
        if (this.a.k((gws)object2, l2)) {
            this.q(l2);
            return null;
        }
        return object2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final Object c(Object object, int n2) {
        try {
            Object object2;
            int n3 = this.b;
            Object object3 = object2 = null;
            if (n3 != 0) {
                long l2 = this.a.r.a();
                if ((object = this.b(object, n2, l2)) == null) {
                    object3 = object2;
                } else {
                    object3 = object.d().get();
                    if (object3 != null) {
                        if (this.a.i()) {
                            object.k(l2);
                        }
                        this.j.add(object);
                        object.j();
                        object = this.a.w;
                    } else {
                        this.p();
                        object3 = object2;
                    }
                }
            }
            this.j();
            return object3;
        }
        catch (Throwable throwable) {
            this.j();
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final Object d(Object object, int n2, Object object2, boolean bl2) {
        block19: {
            this.lock();
            try {
                Object object3;
                Object object4;
                gws gws2;
                Object object5;
                int n3;
                Object object6;
                long l2;
                block20: {
                    int n4;
                    l2 = this.a.r.a();
                    this.m(l2);
                    if (this.b + 1 <= this.e || (n4 = ((AtomicReferenceArray)(object6 = this.f)).length()) >= 0x40000000) break block20;
                    n3 = this.b;
                    object5 = new AtomicReferenceArray(n4 + n4);
                    this.e = ((AtomicReferenceArray)object5).length() * 3 / 4;
                    int n5 = ((AtomicReferenceArray)object5).length() - 1;
                    int n6 = 0;
                    while (true) {
                        int n7;
                        block22: {
                            block24: {
                                block21: {
                                    block23: {
                                        if (n6 >= n4) break block21;
                                        gws2 = (gws)((AtomicReferenceArray)object6).get(n6);
                                        n7 = n3;
                                        if (gws2 == null) break block22;
                                        n7 = gws2.a() & n5;
                                        if (object4 != null) break block23;
                                        ((AtomicReferenceArray)object5).set(n7, gws2);
                                        n7 = n3;
                                        break block22;
                                    }
                                    object3 = gws2;
                                    for (object4 = gws2.e(); object4 != null; object4 = object4.e()) {
                                        int n8 = object4.a() & n5;
                                        int n9 = n8 != n7 ? n8 : n7;
                                        if (n8 != n7) {
                                            object3 = object4;
                                        }
                                        n7 = n9;
                                    }
                                    break block24;
                                }
                                this.f = object5;
                                this.b = n3;
                                break;
                            }
                            ((AtomicReferenceArray)object5).set(n7, object3);
                            while (true) {
                                block18: {
                                    n7 = n3;
                                    if (gws2 == object3) break;
                                    n7 = gws2.a() & n5;
                                    object4 = this.a(gws2, (gws)((AtomicReferenceArray)object5).get(n7));
                                    if (object4 != null) {
                                        ((AtomicReferenceArray)object5).set(n7, object4);
                                        break block18;
                                    }
                                    this.l(gws2);
                                    --n3;
                                }
                                gws2 = gws2.e();
                                continue;
                                break;
                            }
                        }
                        ++n6;
                        n3 = n7;
                    }
                }
                object5 = this.f;
                n3 = n2 & ((AtomicReferenceArray)object5).length() - 1;
                object4 = object3 = (gws)((AtomicReferenceArray)object5).get(n3);
                while (true) {
                    gws2 = null;
                    if (object4 == null) break;
                    object6 = object4.j();
                    if (object4.a() == n2 && object6 != null && this.a.h.c(object, object6)) {
                        object5 = object4.d();
                        object3 = object5.get();
                        if (object3 == null) {
                            ++this.d;
                            if (object5.d()) {
                                this.s(object, null, object5.a(), gwt.c);
                                this.o((gws)object4, object, object2, l2);
                                n2 = this.b;
                            } else {
                                this.o((gws)object4, object, object2, l2);
                                n2 = this.b + 1;
                            }
                            this.b = n2;
                            this.h((gws)object4);
                            object = gws2;
                            break block19;
                        } else {
                            if (bl2) {
                                this.k((gws)object4, l2);
                            } else {
                                ++this.d;
                                this.s(object, object3, object5.a(), gwt.b);
                                this.o((gws)object4, object, object2, l2);
                                this.h((gws)object4);
                            }
                            object = object3;
                        }
                        break block19;
                    }
                    object4 = object4.e();
                }
                ++this.d;
                object4 = this.a.s;
                fxf.K(object);
                object4 = ((gvl)((Object)object4)).b(this, object, n2, (gws)object3);
                this.o((gws)object4, object, object2, l2);
                ((AtomicReferenceArray)object5).set(n3, object4);
                ++this.b;
                this.h((gws)object4);
                object = gws2;
            }
            catch (Throwable throwable) {
                this.unlock();
                this.n();
                throw throwable;
            }
        }
        this.unlock();
        this.n();
        return object;
    }

    final void e() {
        this.m(this.a.r.a());
        this.n();
    }

    final void f() {
        gws gws2;
        while ((gws2 = (gws)this.j.poll()) != null) {
            if (!this.m.contains(gws2)) continue;
            this.m.add(gws2);
        }
    }

    final void g() {
        block21: {
            AtomicReferenceArray atomicReferenceArray;
            int n2;
            gvu gvu2;
            Object object;
            Object object2;
            Object object3;
            int n3;
            boolean bl2 = this.a.n();
            int n4 = 0;
            if (bl2) {
                n3 = 0;
                while ((object3 = this.h.poll()) != null) {
                    object2 = this.a;
                    object = (gws)object3;
                    int n5 = object.a();
                    gvu2 = ((gwr)object2).b(n5);
                    gvu2.lock();
                    try {
                        n2 = gvu2.b;
                        atomicReferenceArray = gvu2.f;
                    }
                    catch (Throwable throwable) {
                        gvu2.unlock();
                        gvu2.n();
                        throw throwable;
                    }
                    for (object2 = object3 = (gws)atomicReferenceArray.get(n5 &= atomicReferenceArray.length() - 1); object2 != null; object2 = object2.e()) {
                        if (object2 != object) continue;
                        ++gvu2.d;
                        object2 = gvu2.t((gws)object3, (gws)object2, object2.j(), object2.d().get(), object2.d(), gwt.c);
                        n2 = gvu2.b;
                        atomicReferenceArray.set(n5, object2);
                        gvu2.b = n2 - 1;
                        break;
                    }
                    gvu2.unlock();
                    gvu2.n();
                    n3 = n2 = n3 + 1;
                    if (n2 != 16) continue;
                    break;
                }
            }
            if (!this.a.o()) break block21;
            n3 = n4;
            while ((object3 = this.i.poll()) != null) {
                block19: {
                    block20: {
                        object2 = this.a;
                        object = (gwd)object3;
                        object3 = object.c();
                        n4 = object3.a();
                        gvu2 = ((gwr)object2).b(n4);
                        Object object4 = object3.j();
                        gvu2.lock();
                        try {
                            n2 = gvu2.b;
                            atomicReferenceArray = gvu2.f;
                            n2 = n4 & atomicReferenceArray.length() - 1;
                        }
                        catch (Throwable throwable) {
                            gvu2.unlock();
                            if (!gvu2.isHeldByCurrentThread()) {
                                gvu2.n();
                            }
                            throw throwable;
                        }
                        for (object2 = object3 = (gws)atomicReferenceArray.get(n2); object2 != null; object2 = object2.e()) {
                            block17: {
                                block18: {
                                    Object object5 = object2.j();
                                    if (object2.a() != n4 || object5 == null) break block17;
                                    if (!gvu2.a.h.c(object4, object5)) break block17;
                                    if (object2.d() != object) break block18;
                                    ++gvu2.d;
                                    object2 = gvu2.t((gws)object3, (gws)object2, object5, object.get(), (gwd)object, gwt.c);
                                    n4 = gvu2.b;
                                    atomicReferenceArray.set(n2, object2);
                                    gvu2.b = n4 - 1;
                                    gvu2.unlock();
                                    if (gvu2.isHeldByCurrentThread()) break block19;
                                    break block20;
                                }
                                gvu2.unlock();
                                if (gvu2.isHeldByCurrentThread()) break block19;
                                break block20;
                            }
                            continue;
                        }
                        gvu2.unlock();
                        if (gvu2.isHeldByCurrentThread()) break block19;
                    }
                    gvu2.n();
                }
                n3 = n4 = n3 + 1;
                if (n4 != 16) continue;
                break;
            }
        }
    }

    final void h(gws object) {
        if (this.a.h()) {
            this.f();
            if ((long)object.d().a() <= this.g || this.r((gws)object, object.a(), gwt.e)) {
                block0: while (this.c > this.g) {
                    for (gws gws2 : this.m) {
                        if (gws2.d().a() <= 0) continue;
                        if (!this.r(gws2, gws2.a(), gwt.e)) {
                            throw new AssertionError();
                        }
                        continue block0;
                    }
                    throw new AssertionError();
                }
            }
        } else {
            return;
        }
        throw new AssertionError();
    }

    final void i(long l2) {
        gws gws2;
        this.f();
        while ((gws2 = (gws)this.l.peek()) != null && this.a.k(gws2, l2)) {
            if (!this.r(gws2, gws2.a(), gwt.d)) {
                throw new AssertionError();
            }
        }
        while ((gws2 = (gws)this.m.peek()) != null && this.a.k(gws2, l2)) {
            if (!this.r(gws2, gws2.a(), gwt.d)) {
                throw new AssertionError();
            }
        }
    }

    final void j() {
        if ((this.k.incrementAndGet() & 0x3F) == 0) {
            this.e();
        }
    }

    final void k(gws gws2, long l2) {
        if (this.a.i()) {
            gws2.k(l2);
        }
        this.m.add(gws2);
    }

    final void l(gws gws2) {
        Object object = gws2.j();
        gws2.a();
        this.s(object, gws2.d().get(), gws2.d().a(), gwt.c);
        this.l.remove(gws2);
        this.m.remove(gws2);
    }

    final void m(long l2) {
        if (this.tryLock()) {
            try {
                this.g();
                this.i(l2);
                this.k.set(0);
                return;
            }
            finally {
                this.unlock();
            }
        }
    }

    final void n() {
        if (!this.isHeldByCurrentThread()) {
            gwv gwv2;
            gwr gwr2 = this.a;
            while ((gwv2 = (gwv)gwr2.p.poll()) != null) {
                try {
                    gwr2.q.a(gwv2);
                }
                catch (Throwable throwable) {
                    gwr.a.logp(Level.WARNING, "com.google.common.cache.LocalCache", "processPendingNotifications", "Exception thrown by removal listener", throwable);
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    final void o(gws var1_1, Object var2_2, Object var3_3, long var4_4) {
        block8: {
            block4: {
                block9: {
                    block5: {
                        block6: {
                            block7: {
                                var10_5 = this.a;
                                var9_6 = var1_1.d();
                                var6_7 = var10_5.m.a(var2_2, var3_3);
                                var8_8 = var6_7 >= 0;
                                fxf.B(var8_8, "Weights must be non-negative");
                                var7_9 = this.a.k.ordinal();
                                if (var7_9 == 0) break block4;
                                if (var7_9 == 1) break block5;
                                if (var7_9 != 2) break block6;
                                if (var6_7 != 1) break block7;
                                var2_2 = new gwi(this.i, var3_3, var1_1);
                                ** GOTO lbl28
                            }
                            var2_2 = new gwm(this.i, var3_3, var1_1, var6_7);
                            break block8;
                        }
                        throw null;
                    }
                    if (var6_7 != 1) break block9;
                    var2_2 = new gvv(this.i, var3_3, var1_1);
                    ** GOTO lbl28
                }
                var2_2 = new gwk(this.i, var3_3, var1_1, var6_7);
                break block8;
            }
            if (var6_7 == 1) {
                var2_2 = new gwa(var3_3);
lbl28:
                // 3 sources

                var6_7 = 1;
            } else {
                var2_2 = new gwl(var3_3, var6_7);
            }
        }
        var1_1.p((gwd)var2_2);
        this.f();
        this.c += (long)var6_7;
        if (this.a.i()) {
            var1_1.k(var4_4);
        }
        if (this.a.l()) {
            var1_1.q(var4_4);
        }
        this.m.add(var1_1);
        this.l.add(var1_1);
        var9_6.e();
    }

    final void p() {
        if (this.tryLock()) {
            try {
                this.g();
                return;
            }
            finally {
                this.unlock();
            }
        }
    }

    final void q(long l2) {
        if (this.tryLock()) {
            try {
                this.i(l2);
                return;
            }
            finally {
                this.unlock();
            }
        }
    }

    final boolean r(gws gws2, int n2, gwt gwt2) {
        gws gws3;
        AtomicReferenceArray atomicReferenceArray = this.f;
        for (gws gws4 = gws3 = (gws)atomicReferenceArray.get(n2 &= atomicReferenceArray.length() - 1); gws4 != null; gws4 = gws4.e()) {
            if (gws4 != gws2) continue;
            ++this.d;
            gws2 = this.t(gws3, gws4, gws4.j(), gws4.d().get(), gws4.d(), gwt2);
            int n3 = this.b;
            atomicReferenceArray.set(n2, gws2);
            this.b = n3 - 1;
            return true;
        }
        return false;
    }

    final void s(Object object, Object object2, int n2, gwt gwt2) {
        this.c -= (long)n2;
        n2 = gwt2.ordinal();
        if (n2 != 0 && n2 != 1 && n2 != 2 && n2 != 3 && n2 != 4) {
            throw null;
        }
        if (this.a.p != gwr.c) {
            object = new gwv(object, object2, gwt2);
            this.a.p.offer(object);
        }
    }

    final gws t(gws gws2, gws gws3, Object object, Object object2, gwd gwd2, gwt gwt2) {
        this.s(object, object2, gwd2.a(), gwt2);
        this.l.remove(gws3);
        this.m.remove(gws3);
        gwd2.f();
        int n2 = this.b;
        object = gws3.e();
        while (gws2 != gws3) {
            object2 = this.a(gws2, (gws)object);
            if (object2 != null) {
                object = object2;
            } else {
                this.l(gws2);
                --n2;
            }
            gws2 = gws2.e();
        }
        this.b = n2;
        return object;
    }
}

