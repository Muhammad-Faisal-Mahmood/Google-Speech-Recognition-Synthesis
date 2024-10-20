/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  guu
 *  guv
 *  gvt
 */
import j$.util.concurrent.ConcurrentLinkedQueue;
import j$.util.concurrent.ConcurrentMap;
import j$.util.concurrent.ConcurrentMap$_CC;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.logging.Logger;

public final class gwr
extends AbstractMap
implements java.util.concurrent.ConcurrentMap,
ConcurrentMap {
    static final Logger a = Logger.getLogger(gwr.class.getName());
    static final gwd b = new guy();
    static final Queue c = new guz();
    public static final int x = 0;
    final int d;
    final int e;
    final gvu[] f;
    final int g;
    final gtd h;
    final gtd i;
    final gvw j;
    final gvw k;
    final long l;
    final gww m;
    final long n;
    final long o;
    final Queue p;
    final gwu q;
    final gup r;
    final gvl s;
    Set t;
    Collection u;
    Set v;
    final fvd w;

    public gwr(guw guw2) {
        int n2;
        long l2;
        int n3 = guw2.d;
        int n4 = 4;
        int n5 = n3;
        if (n3 == -1) {
            n5 = 4;
        }
        this.g = Math.min(n5, 65536);
        gvu[] gvuArray = guw2.b();
        this.j = gvuArray;
        this.k = guw2.c();
        this.h = (gtd)fxf.S(guw2.l, guw2.b().a());
        this.i = (gtd)fxf.S(guw2.m, guw2.c().a());
        long l3 = guw2.j;
        long l4 = 0L;
        l3 = l3 != 0L && guw2.k != 0L ? (guw2.g == null ? guw2.e : guw2.f) : 0L;
        this.l = l3;
        this.m = (gww)fxf.S(guw2.g, guv.a);
        long l5 = l2 = guw2.k;
        if (l2 == -1L) {
            l5 = 0L;
        }
        this.n = l5;
        l5 = guw2.j;
        if (l5 == -1L) {
            l5 = l4;
        }
        this.o = l5;
        Object object = (gwu)fxf.S(guw2.n, guu.a);
        this.q = object;
        object = object == guu.a ? c : new ConcurrentLinkedQueue();
        this.p = object;
        boolean bl2 = this.l();
        int n6 = 0;
        int n7 = 0;
        int n8 = 1;
        n5 = !bl2 && !this.i() ? 0 : 1;
        object = guw2.o;
        if (object == null) {
            object = n5 != 0 ? gup.a : guw.b;
        }
        this.r = object;
        n5 = !this.m() && !this.i() ? 0 : 1;
        n3 = !this.j() && !this.l() ? 0 : 1;
        object = gvl.a;
        if (gvuArray != gvw.c) {
            n4 = 0;
        }
        n3 = 1 != n3 ? 0 : 2;
        this.s = gvl.i[n4 | n5 | n3];
        object = (fvd)((gum)guw2.p).a;
        this.w = null;
        n5 = n4 = Math.min(16, 0x40000000);
        if (this.h()) {
            n5 = n4;
            if (!this.g()) {
                n5 = (int)Math.min((long)n4, l3);
            }
        }
        n4 = 0;
        for (n3 = 1; !(n3 >= this.g || this.h() && (long)n3 * 20L > this.l); n3 += n3) {
            ++n4;
        }
        this.e = 32 - n4;
        this.d = n3 - 1;
        this.f = new gvu[n3];
        int n9 = n2 = n5 / n3;
        n4 = n8;
        if (n2 * n3 < n5) {
            n9 = n2 + 1;
            n4 = n8;
        }
        while (n4 < n9) {
            n4 += n4;
        }
        if (this.h()) {
            l2 = n3;
            l4 = this.l;
            l5 = l4 / l2 + 1L;
            for (n5 = n7; n5 < (gvuArray = this.f).length; ++n5) {
                l3 = l5;
                if ((long)n5 == l4 % l2) {
                    l3 = l5 - 1L;
                }
                object = (fvd)((gum)guw2.p).a;
                gvuArray[n5] = new gvu(this, n4, l3);
                l5 = l3;
            }
        } else {
            for (n5 = n6; n5 < (gvuArray = this.f).length; ++n5) {
                object = (fvd)((gum)guw2.p).a;
                gvuArray[n5] = new gvu(this, n4, -1L);
            }
        }
    }

    static void c(gws gws2, gws gws3) {
        gws2.l(gws3);
        gws3.n(gws2);
    }

    static void d(gws gws2, gws gws3) {
        gws2.m(gws3);
        gws3.o(gws2);
    }

    static void e(gws gws2) {
        gvt gvt2 = gvt.a;
        gws2.l((gws)gvt2);
        gws2.n((gws)gvt2);
    }

    static void f(gws gws2) {
        gvt gvt2 = gvt.a;
        gws2.m((gws)gvt2);
        gws2.o((gws)gvt2);
    }

    final int a(Object object) {
        int n2 = object == null ? 0 : this.h.a(object);
        n2 += n2 << 15 ^ 0xFFFFCD7D;
        n2 ^= n2 >>> 10;
        n2 += n2 << 3;
        n2 ^= n2 >>> 6;
        n2 += (n2 << 2) + (n2 << 14);
        return n2 ^ n2 >>> 16;
    }

    final gvu b(int n2) {
        int n3 = this.e;
        int n4 = this.d;
        return this.f[n2 >>> n3 & n4];
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void clear() {
        gvu[] gvuArray = this.f;
        int n2 = gvuArray.length;
        int n3 = 0;
        while (n3 < n2) {
            gvu gvu2 = gvuArray[n3];
            if (gvu2.b != 0) {
                gvu2.lock();
                gvu2.m(gvu2.a.r.a());
                AtomicReferenceArray atomicReferenceArray = gvu2.f;
                int n4 = 0;
                while (true) {
                    if (n4 >= atomicReferenceArray.length()) break;
                    for (gws gws2 = (gws)atomicReferenceArray.get(n4); gws2 != null; gws2 = gws2.e()) {
                        if (!gws2.d().d()) continue;
                        Object object = gws2.j();
                        Object object2 = gws2.d().get();
                        gwt gwt2 = object != null && object2 != null ? gwt.a : gwt.c;
                        gws2.a();
                        gvu2.s(object, object2, gws2.d().a(), gwt2);
                    }
                    ++n4;
                }
                for (n4 = 0; n4 < atomicReferenceArray.length(); ++n4) {
                    atomicReferenceArray.set(n4, null);
                }
                if (gvu2.a.n()) {
                    while (gvu2.h.poll() != null) {
                    }
                }
                if (gvu2.a.o()) {
                    while (gvu2.i.poll() != null) {
                    }
                }
                gvu2.l.clear();
                gvu2.m.clear();
                gvu2.k.set(0);
                ++gvu2.d;
                gvu2.b = 0;
            }
            ++n3;
        }
    }

    @Override
    public final /* synthetic */ Object compute(Object object, BiFunction biFunction) {
        return ConcurrentMap$_CC.$default$compute(this, object, biFunction);
    }

    @Override
    public final /* synthetic */ Object computeIfAbsent(Object object, Function function) {
        return ConcurrentMap$_CC.$default$computeIfAbsent(this, object, function);
    }

    @Override
    public final /* synthetic */ Object computeIfPresent(Object object, BiFunction biFunction) {
        return ConcurrentMap$_CC.$default$computeIfPresent(this, object, biFunction);
    }

    @Override
    public final boolean containsKey(Object object) {
        boolean bl2;
        gvu gvu2;
        block4: {
            boolean bl3;
            block5: {
                bl3 = false;
                if (object == null) {
                    return false;
                }
                int n2 = this.a(object);
                gvu2 = this.b(n2);
                bl2 = bl3;
                try {
                    if (gvu2.b == 0) break block4;
                    if ((object = gvu2.b(object, n2, gvu2.a.r.a())) != null) break block5;
                    bl2 = bl3;
                    break block4;
                }
                catch (Throwable throwable) {
                    gvu2.j();
                    throw throwable;
                }
            }
            object = object.d().get();
            bl2 = bl3;
            if (object == null) break block4;
            bl2 = true;
        }
        gvu2.j();
        return bl2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final boolean containsValue(Object var1_1) {
        if (var1_1 == null) {
            return false;
        }
        var13_2 = this.r;
        var12_3 = this.f;
        var6_4 = var13_2.a();
        var10_5 = -1L;
        for (var2_6 = 0; var2_6 < 3; ++var2_6) {
            var5_9 = var12_3.length;
            var8_10 = 0L;
            for (var3_7 = 0; var3_7 < var5_9; ++var3_7) {
                var16_13 = var12_3[var3_7];
                var4_8 = var16_13.b;
                var15_12 = var16_13.f;
                for (var4_8 = 0; var4_8 < var15_12.length(); ++var4_8) {
                    for (var13_2 = (gws)var15_12.get(var4_8); var13_2 != null; var13_2 = var13_2.e()) {
                        block8: {
                            block9: {
                                if (var13_2.j() == null) {
                                    var16_13.p();
lbl18:
                                    // 3 sources

                                    while (true) {
                                        var14_11 = null;
                                        break block8;
                                        break;
                                    }
                                }
                                var14_11 = var13_2.d().get();
                                if (var14_11 != null) break block9;
                                var16_13.p();
                                ** GOTO lbl18
                            }
                            if (var16_13.a.k((gws)var13_2, var6_4)) {
                                var16_13.q(var6_4);
                                ** continue;
                            }
                        }
                        if (var14_11 == null || !this.i.c(var1_1, var14_11)) continue;
                        return true;
                    }
                }
                var8_10 += (long)var16_13.d;
            }
            if (var8_10 == var10_5) break;
            var10_5 = var8_10;
        }
        return false;
    }

    @Override
    public final Set entrySet() {
        Set set = this.v;
        if (set != null) {
            return set;
        }
        this.v = set = new gvn(this);
        return set;
    }

    @Override
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        ConcurrentMap$_CC.$default$forEach(this, biConsumer);
    }

    final boolean g() {
        return this.m != guv.a;
    }

    @Override
    public final Object get(Object object) {
        if (object == null) {
            return null;
        }
        int n2 = this.a(object);
        return this.b(n2).c(object, n2);
    }

    @Override
    public final Object getOrDefault(Object object, Object object2) {
        if ((object = this.get(object)) != null) {
            return object;
        }
        return object2;
    }

    final boolean h() {
        return this.l >= 0L;
    }

    final boolean i() {
        return this.n > 0L;
    }

    @Override
    public final boolean isEmpty() {
        gvu[] gvuArray = this.f;
        int n2 = gvuArray.length;
        long l2 = 0L;
        for (int i2 = 0; i2 < n2; ++i2) {
            gvu gvu2 = gvuArray[i2];
            if (gvu2.b != 0) {
                return false;
            }
            l2 += (long)gvu2.d;
        }
        if (l2 != 0L) {
            for (gvu gvu2 : gvuArray) {
                if (gvu2.b != 0) {
                    return false;
                }
                l2 -= (long)gvu2.d;
            }
            return l2 == 0L;
        }
        return true;
    }

    final boolean j() {
        return this.o > 0L;
    }

    final boolean k(gws gws2, long l2) {
        fxf.K(gws2);
        if (this.i() && l2 - gws2.b() >= this.n) {
            return true;
        }
        return this.j() && l2 - gws2.c() >= this.o;
    }

    @Override
    public final Set keySet() {
        Set set = this.t;
        if (set != null) {
            return set;
        }
        this.t = set = new gvq(this);
        return set;
    }

    final boolean l() {
        return this.j();
    }

    final boolean m() {
        return this.i() || this.h();
        {
        }
    }

    @Override
    public final /* synthetic */ Object merge(Object object, Object object2, BiFunction biFunction) {
        return ConcurrentMap$_CC.$default$merge(this, object, object2, biFunction);
    }

    final boolean n() {
        return this.j != gvw.a;
    }

    final boolean o() {
        return this.k != gvw.a;
    }

    @Override
    public final Object put(Object object, Object object2) {
        fxf.K(object);
        fxf.K(object2);
        int n2 = this.a(object);
        return this.b(n2).d(object, n2, object2, false);
    }

    @Override
    public final void putAll(Map object) {
        for (Map.Entry entry : object.entrySet()) {
            this.put(entry.getKey(), entry.getValue());
        }
    }

    @Override
    public final Object putIfAbsent(Object object, Object object2) {
        fxf.K(object);
        fxf.K(object2);
        int n2 = this.a(object);
        return this.b(n2).d(object, n2, object2, true);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object remove(Object object) {
        Object object2 = null;
        if (object == null) {
            return null;
        }
        int n2 = this.a(object);
        gvu gvu2 = this.b(n2);
        gvu2.lock();
        try {
            gws gws2;
            gvu2.m(gvu2.a.r.a());
            int n3 = gvu2.b;
            AtomicReferenceArray atomicReferenceArray = gvu2.f;
            n3 = n2 & atomicReferenceArray.length() - 1;
            gws gws3 = gws2 = (gws)atomicReferenceArray.get(n3);
            while (true) {
                Object object3 = object2;
                if (gws3 == null) return object3;
                Object object4 = gws3.j();
                if (gws3.a() == n2 && object4 != null && gvu2.a.h.c(object, object4)) {
                    void var1_3;
                    gwd gwd2 = gws3.d();
                    Object object5 = gwd2.get();
                    if (object5 != null) {
                        gwt gwt2 = gwt.a;
                    } else {
                        object3 = object2;
                        if (!gwd2.d()) return object3;
                        gwt gwt3 = gwt.c;
                    }
                    ++gvu2.d;
                    gws gws4 = gvu2.t(gws2, gws3, object4, object5, gwd2, (gwt)var1_3);
                    n2 = gvu2.b;
                    atomicReferenceArray.set(n3, gws4);
                    gvu2.b = n2 - 1;
                    object3 = object5;
                    return object3;
                }
                gws3 = gws3.e();
            }
        }
        finally {
            gvu2.unlock();
            gvu2.n();
        }
    }

    @Override
    public final boolean remove(Object object, Object object2) {
        boolean bl2 = false;
        if (object != null && object2 != null) {
            boolean bl3;
            gws gws2;
            gws gws3;
            AtomicReferenceArray atomicReferenceArray;
            int n2;
            int n3 = this.a(object);
            gvu gvu2 = this.b(n3);
            gvu2.lock();
            try {
                gvu2.m(gvu2.a.r.a());
                n2 = gvu2.b;
                atomicReferenceArray = gvu2.f;
                n2 = n3 & atomicReferenceArray.length() - 1;
                gws2 = gws3 = (gws)atomicReferenceArray.get(n2);
            }
            catch (Throwable throwable) {
                gvu2.unlock();
                gvu2.n();
                throw throwable;
            }
            while (true) {
                block11: {
                    gwd gwd2;
                    Object object3;
                    block12: {
                        bl3 = bl2;
                        if (gws2 == null) break;
                        object3 = gws2.j();
                        if (gws2.a() != n3 || object3 == null) break block11;
                        if (!gvu2.a.h.c(object, object3)) break block11;
                        gwd2 = gws2.d();
                        Object object4 = gwd2.get();
                        if (gvu2.a.i.c(object2, object4)) {
                            object = gwt.a;
                            object2 = object4;
                            break block12;
                        }
                        bl3 = bl2;
                        if (object4 != null) break;
                        bl3 = bl2;
                        if (!gwd2.d()) break;
                        object = gwt.c;
                        object2 = null;
                    }
                    ++gvu2.d;
                    object2 = gvu2.t(gws3, gws2, object3, object2, gwd2, (gwt)((Object)object));
                    n3 = gvu2.b;
                    atomicReferenceArray.set(n2, object2);
                    gvu2.b = n3 - 1;
                    bl3 = bl2;
                    if (object != gwt.a) break;
                    bl3 = true;
                    break;
                }
                gws2 = gws2.e();
                continue;
                break;
            }
            gvu2.unlock();
            gvu2.n();
            return bl3;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object replace(Object object, Object object2) {
        fxf.K(object);
        fxf.K(object2);
        int n2 = this.a(object);
        gvu gvu2 = this.b(n2);
        gvu2.lock();
        try {
            gws gws2;
            long l2 = gvu2.a.r.a();
            gvu2.m(l2);
            AtomicReferenceArray atomicReferenceArray = gvu2.f;
            int n3 = n2 & atomicReferenceArray.length() - 1;
            gws gws3 = gws2 = (gws)atomicReferenceArray.get(n3);
            while (true) {
                Object object3;
                Object object4 = object3 = null;
                if (gws3 == null) return object4;
                Object object5 = gws3.j();
                if (gws3.a() == n2 && object5 != null && gvu2.a.h.c(object, object5)) {
                    gwd gwd2 = gws3.d();
                    object4 = gwd2.get();
                    if (object4 == null) {
                        object4 = object3;
                        if (!gwd2.d()) return object4;
                        n2 = gvu2.b;
                        ++gvu2.d;
                        object = gvu2.t(gws2, gws3, object5, null, gwd2, gwt.c);
                        n2 = gvu2.b;
                        atomicReferenceArray.set(n3, object);
                        gvu2.b = n2 - 1;
                        object4 = object3;
                        return object4;
                    }
                    ++gvu2.d;
                    gvu2.s(object, object4, gwd2.a(), gwt.b);
                    gvu2.o(gws3, object, object2, l2);
                    gvu2.h(gws3);
                    return object4;
                }
                gws3 = gws3.e();
            }
        }
        finally {
            gvu2.unlock();
            gvu2.n();
        }
    }

    @Override
    public final boolean replace(Object object, Object object2, Object object3) {
        boolean bl2;
        gws gws2;
        gws gws3;
        int n2;
        AtomicReferenceArray atomicReferenceArray;
        long l2;
        fxf.K(object);
        fxf.K(object3);
        boolean bl3 = false;
        if (object2 == null) {
            return false;
        }
        int n3 = this.a(object);
        gvu gvu2 = this.b(n3);
        gvu2.lock();
        try {
            l2 = gvu2.a.r.a();
            gvu2.m(l2);
            atomicReferenceArray = gvu2.f;
            n2 = n3 & atomicReferenceArray.length() - 1;
            gws2 = gws3 = (gws)atomicReferenceArray.get(n2);
        }
        catch (Throwable throwable) {
            gvu2.unlock();
            gvu2.n();
            throw throwable;
        }
        while (true) {
            block10: {
                block12: {
                    Object object4;
                    gwd gwd2;
                    block11: {
                        bl2 = bl3;
                        if (gws2 == null) break;
                        Object object5 = gws2.j();
                        if (gws2.a() != n3 || object5 == null) break block10;
                        if (!gvu2.a.h.c(object, object5)) break block10;
                        gwd2 = gws2.d();
                        object4 = gwd2.get();
                        if (object4 != null) break block11;
                        bl2 = bl3;
                        if (!gwd2.d()) break;
                        n3 = gvu2.b;
                        ++gvu2.d;
                        object = gvu2.t(gws3, gws2, object5, null, gwd2, gwt.c);
                        n3 = gvu2.b;
                        atomicReferenceArray.set(n2, object);
                        gvu2.b = n3 - 1;
                        bl2 = bl3;
                        break;
                    }
                    if (!gvu2.a.i.c(object2, object4)) break block12;
                    ++gvu2.d;
                    gvu2.s(object, object4, gwd2.a(), gwt.b);
                    gvu2.o(gws2, object, object3, l2);
                    gvu2.h(gws2);
                    bl2 = true;
                    break;
                }
                gvu2.k(gws2, l2);
                bl2 = bl3;
                break;
            }
            gws2 = gws2.e();
            continue;
            break;
        }
        gvu2.unlock();
        gvu2.n();
        return bl2;
    }

    @Override
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        ConcurrentMap$_CC.$default$replaceAll(this, biFunction);
    }

    @Override
    public final int size() {
        gvu[] gvuArray = this.f;
        int n2 = gvuArray.length;
        long l2 = 0L;
        for (int i2 = 0; i2 < n2; ++i2) {
            l2 += (long)Math.max(0, gvuArray[i2].b);
        }
        return hhk.ag(l2);
    }

    @Override
    public final Collection values() {
        Collection collection = this.u;
        if (collection != null) {
            return collection;
        }
        this.u = collection = new gwe(this);
        return collection;
    }
}

