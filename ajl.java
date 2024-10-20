/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
import android.util.Pair;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.util.ArrayList;
import java.util.List;

public final class ajl {
    public int a;
    public boolean b;
    public aip c;
    public ajj d;
    public ajj e;
    public ajj f;
    public ajj g;
    public int h;
    public Object i;
    public List j;
    public final akl k;
    public final AmbientMode$AmbientController l;
    private final aeu m;
    private final aev n;
    private final afp o;
    private long p;
    private long q;

    public ajl(akl akl2, afp afp2, AmbientMode$AmbientController ambientMode$AmbientController, aip aip2) {
        this.k = akl2;
        this.o = afp2;
        this.l = ambientMode$AmbientController;
        this.c = aip2;
        this.m = new aeu();
        this.n = new aev();
        this.j = new ArrayList();
    }

    static boolean k(long l2, long l3) {
        return l2 == -9223372036854775807L || l2 == l3;
        {
        }
    }

    private final long p(Object object) {
        for (int i2 = 0; i2 < this.j.size(); ++i2) {
            ajj ajj2 = (ajj)this.j.get(i2);
            if (!ajj2.b.equals(object)) continue;
            return ajj2.g.a.d;
        }
        return -1L;
    }

    private final ajk q(aew aew2, Object object, int n2, int n3, long l2, long l3) {
        object = new anc(object, n2, n3, l3);
        Object object2 = ((anc)object).a;
        int n4 = ((anc)object).b;
        int n5 = ((anc)object).c;
        long l4 = aew2.n(object2, this.m).e(n4, n5);
        if (n3 == this.m.d(n2)) {
            this.m.j();
        }
        this.m.k(((anc)object).b);
        l3 = l4 != -9223372036854775807L && l4 <= 0L ? Math.max(0L, -1L + l4) : 0L;
        return new ajk((anc)object, l3, l2, -9223372036854775807L, l4, false, false, false);
    }

    private final ajk r(aew aew2, Object object, long l2, long l3, long l4) {
        long l5 = l2;
        aew2.n(object, this.m);
        int n2 = this.m.b(l5);
        if (n2 != -1) {
            this.m.l(n2);
        }
        if (n2 == -1) {
            this.m.h();
        } else {
            this.m.k(n2);
        }
        object = new anc(object, l4, n2);
        boolean bl2 = ajl.v((anc)object);
        boolean bl3 = this.u(aew2, (anc)object);
        boolean bl4 = this.t(aew2, (anc)object, bl2);
        if (n2 != -1) {
            this.m.k(n2);
        }
        if (n2 != -1) {
            this.m.i(n2);
            l2 = 0L;
        } else {
            l2 = -9223372036854775807L;
        }
        if (l2 != -9223372036854775807L) {
            l2 = 0L;
            l4 = 0L;
        } else {
            l4 = this.m.d;
        }
        long l6 = l5;
        if (l4 != -9223372036854775807L) {
            l6 = l5;
            if (l5 >= l4) {
                l6 = Math.max(0L, l4 - 1L);
            }
        }
        return new ajk((anc)object, l6, l3, l2, l4, bl2, bl3, bl4);
    }

    private static anc s(aew aew2, Object object, long l2, long l3, aev aev2, aeu aeu2) {
        aew2.n(object, aeu2);
        aew2.o(aeu2.c, aev2);
        aew2.a(object);
        aeu2.h();
        aew2.n(object, aeu2);
        int n2 = aeu2.c(l2);
        if (n2 == -1) {
            return new anc(object, l3, aeu2.b(l2));
        }
        return new anc(object, n2, aeu2.d(n2), l3);
    }

    private final boolean t(aew aew2, anc anc2, boolean bl2) {
        int n2 = aew2.a(anc2.a);
        return !aew2.o((int)aew2.m((int)n2, (aeu)this.m).c, (aev)this.n).i && aew2.i(n2, this.m, this.n, this.a, this.b) == -1 && bl2;
    }

    private final boolean u(aew aew2, anc anc2) {
        if (!ajl.v(anc2)) {
            return false;
        }
        int n2 = aew2.n((Object)anc2.a, (aeu)this.m).c;
        int n3 = aew2.a(anc2.a);
        return aew2.o((int)n2, (aev)this.n).o == n3;
    }

    private static final boolean v(anc anc2) {
        return !anc2.b() && anc2.e == -1;
    }

    private final void w(aew aew2, Object object, int n2) {
        aew2.n(object, this.m);
        this.m.i(n2);
        long l2 = this.m.g.a((int)n2).g;
    }

    public final ajj a() {
        int n2;
        ajj ajj2 = this.d;
        if (ajj2 == null) {
            return null;
        }
        if (ajj2 == this.e) {
            this.e = ajj2.i;
        }
        ajj2.h();
        this.h = n2 = this.h - 1;
        if (n2 == 0) {
            this.f = null;
            ajj2 = this.d;
            this.i = ajj2.b;
            this.q = ajj2.g.a.d;
        }
        this.d = this.d.i;
        this.h();
        return this.d;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final ajk b(aew object, ajj object2, long l2) {
        ajk ajk2;
        block13: {
            block14: {
                aeu aeu2;
                block15: {
                    block11: {
                        long l3;
                        long l4;
                        block9: {
                            int n2;
                            long l5;
                            block12: {
                                Object object3;
                                block10: {
                                    ajk2 = ((ajj)object2).g;
                                    l5 = ((ajj)object2).k;
                                    l4 = ajk2.e;
                                    boolean bl2 = ajk2.g;
                                    l3 = l5 + l4 - l2;
                                    if (!bl2) break block9;
                                    n2 = ((aew)object).a(ajk2.a.a);
                                    int n3 = this.a;
                                    bl2 = this.b;
                                    object3 = this.n;
                                    aeu aeu3 = this.m;
                                    l5 = 0L;
                                    if ((n2 = ((aew)object).i(n2, aeu3, (aev)object3, n3, bl2)) == -1) return null;
                                    n3 = ((aew)object).d((int)n2, (aeu)this.m, (boolean)true).c;
                                    object3 = this.m.b;
                                    abr.i(object3);
                                    l2 = ajk2.a.d;
                                    if (((aew)object).o((int)n3, (aev)this.n).n != n2) break block10;
                                    aeu3 = ((aew)object).l(this.n, this.m, n3, -9223372036854775807L, Math.max(0L, l3));
                                    if (aeu3 == null) break block11;
                                    object3 = ((Pair)aeu3).first;
                                    l4 = (Long)((Pair)aeu3).second;
                                    object2 = ((ajj)object2).i;
                                    if (object2 != null && ((ajj)object2).b.equals(object3)) {
                                        l2 = ((ajj)object2).g.a.d;
                                    } else {
                                        l2 = l5 = this.p(object3);
                                        if (l5 == -1L) {
                                            l2 = this.p;
                                            this.p = 1L + l2;
                                        }
                                    }
                                    l5 = -9223372036854775807L;
                                    object2 = object3;
                                    break block12;
                                }
                                l4 = 0L;
                                object2 = object3;
                            }
                            object2 = ajl.s((aew)object, object2, l4, l2, this.n, this.m);
                            if (l5 == -9223372036854775807L) return this.c((aew)object, (anc)object2, l5, l4);
                            if (ajk2.c == -9223372036854775807L) return this.c((aew)object, (anc)object2, l5, l4);
                            ((aew)object).n(ajk2.a.a, this.m).h();
                            n2 = this.m.g.d;
                            return this.c((aew)object, (anc)object2, l5, l4);
                        }
                        object2 = ajk2.a;
                        ((aew)object).n(((anc)object2).a, this.m);
                        if (!((anc)object2).b()) break block13;
                        int n4 = ((anc)object2).b;
                        if (this.m.a(n4) == -1) break block11;
                        aeu2 = this.m;
                        int n5 = ((anc)object2).c;
                        n5 = aeu2.g.a(n4).b(n5);
                        if (n5 < 0) {
                            return this.q((aew)object, ((anc)object2).a, n4, n5, ajk2.c, ((anc)object2).d);
                        }
                        l2 = l4 = ajk2.c;
                        if (l4 != -9223372036854775807L) break block14;
                        aev aev2 = this.n;
                        aeu2 = this.m;
                        if ((aeu2 = ((aew)object).l(aev2, aeu2, aeu2.c, -9223372036854775807L, Math.max(0L, l3))) != null) break block15;
                    }
                    return null;
                }
                l2 = (Long)((Pair)aeu2).second;
            }
            this.w((aew)object, ((anc)object2).a, ((anc)object2).b);
            return this.r((aew)object, ((anc)object2).a, Math.max(0L, l2), ajk2.c, ((anc)object2).d);
        }
        int n6 = ((anc)object2).e;
        if (n6 != -1) {
            this.m.l(n6);
        }
        aeu aeu4 = this.m;
        int n7 = ((anc)object2).e;
        n6 = aeu4.d(n7);
        aeu4.k(n7);
        if (n6 != this.m.a(((anc)object2).e)) {
            return this.q((aew)object, ((anc)object2).a, ((anc)object2).e, n6, ajk2.e, ((anc)object2).d);
        }
        this.w((aew)object, ((anc)object2).a, ((anc)object2).e);
        return this.r((aew)object, ((anc)object2).a, 0L, ajk2.e, ((anc)object2).d);
    }

    public final ajk c(aew aew2, anc anc2, long l2, long l3) {
        aew2.n(anc2.a, this.m);
        if (anc2.b()) {
            return this.q(aew2, anc2.a, anc2.b, anc2.c, l2, anc2.d);
        }
        return this.r(aew2, anc2.a, l3, l2, anc2.d);
    }

    public final ajk d(aew aew2, ajk ajk2) {
        long l2;
        long l3;
        int n2;
        anc anc2 = ajk2.a;
        boolean bl2 = ajl.v(anc2);
        boolean bl3 = this.u(aew2, anc2);
        boolean bl4 = this.t(aew2, anc2, bl2);
        aew2.n(ajk2.a.a, this.m);
        if (!anc2.b() && (n2 = anc2.e) != -1) {
            this.m.i(n2);
            l3 = 0L;
        } else {
            l3 = -9223372036854775807L;
        }
        if (anc2.b()) {
            l2 = this.m.e(anc2.b, anc2.c);
        } else if (l3 != -9223372036854775807L) {
            l3 = 0L;
            l2 = 0L;
        } else {
            l2 = this.m.d;
        }
        if (anc2.b()) {
            this.m.k(anc2.b);
        } else {
            n2 = anc2.e;
            if (n2 != -1) {
                this.m.k(n2);
            }
        }
        return new ajk(anc2, ajk2.b, ajk2.c, l3, l2, bl2, bl3, bl4);
    }

    public final anc e(aew aew2, Object object, long l2) {
        long l3;
        Object object2;
        int n2;
        block10: {
            int n3;
            n2 = aew2.n((Object)object, (aeu)this.m).c;
            object2 = this.i;
            if (object2 != null && (n3 = aew2.a(object2)) != -1 && aew2.m((int)n3, (aeu)this.m).c == n2) {
                l3 = this.q;
            } else {
                object2 = this.d;
                while (object2 != null) {
                    if (((ajj)object2).b.equals(object)) {
                        l3 = ((ajj)object2).g.a.d;
                        break block10;
                    }
                    object2 = ((ajj)object2).i;
                }
                object2 = this.d;
                while (object2 != null) {
                    n3 = aew2.a(((ajj)object2).b);
                    if (n3 != -1 && aew2.m((int)n3, (aeu)this.m).c == n2) {
                        l3 = ((ajj)object2).g.a.d;
                        break block10;
                    }
                    object2 = ((ajj)object2).i;
                }
                l3 = this.p(object);
                if (l3 == -1L) {
                    long l4 = this.p;
                    this.p = 1L + l4;
                    l3 = l4;
                    if (this.d == null) {
                        this.i = object;
                        this.q = l4;
                        l3 = l4;
                    }
                }
            }
        }
        aew2.n(object, this.m);
        object2 = this.m;
        aev aev2 = this.n;
        aew2.o(((aeu)object2).c, aev2);
        n2 = aew2.a(object);
        while (true) {
            object2 = this.n;
            if (n2 < ((aev)object2).n) break;
            aew2.d(n2, this.m, true);
            this.m.h();
            object2 = this.m;
            if (((aeu)object2).c(((aeu)object2).d) != -1) {
                object = this.m.b;
                abr.i(object);
            }
            --n2;
        }
        return ajl.s(aew2, object, l2, l3, (aev)object2, this.m);
    }

    public final void f() {
        if (this.h == 0) {
            return;
        }
        ajj ajj2 = this.d;
        abr.j(ajj2);
        this.i = ajj2.b;
        this.q = ajj2.g.a.d;
        while (ajj2 != null) {
            ajj2.h();
            ajj2 = ajj2.i;
        }
        this.d = null;
        this.f = null;
        this.e = null;
        this.h = 0;
        this.h();
    }

    public final void g() {
        ajj ajj2 = this.g;
        if (ajj2 == null || ajj2.l()) {
            this.g = null;
            for (int i2 = 0; i2 < this.j.size(); ++i2) {
                ajj2 = (ajj)this.j.get(i2);
                if (ajj2.l()) continue;
                this.g = ajj2;
                return;
            }
        }
    }

    public final void h() {
        gzs gzs2 = new gzs();
        Object object = this.d;
        while (object != null) {
            gzs2.h(((ajj)object).g.a);
            object = ((ajj)object).i;
        }
        object = this.e;
        object = object == null ? null : ((ajj)object).g.a;
        this.o.c(new ai((Object)this, (Object)gzs2, object, 2, null));
    }

    public final void i(long l2) {
        ajj ajj2 = this.f;
        if (ajj2 != null) {
            abr.f(ajj2.m());
            if (ajj2.e) {
                ajj2.a.k(ajj2.d(l2));
            }
        }
    }

    public final void j() {
        if (!this.j.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < this.j.size(); ++i2) {
                ((ajj)this.j.get(i2)).h();
            }
            this.j = arrayList;
            this.g = null;
            this.g();
        }
    }

    public final boolean l(anb anb2) {
        ajj ajj2 = this.f;
        return ajj2 != null && ajj2.a == anb2;
    }

    public final boolean m(anb anb2) {
        ajj ajj2 = this.g;
        return ajj2 != null && ajj2.a == anb2;
    }

    public final boolean n(ajj ajj2) {
        abr.j(ajj2);
        boolean bl2 = ajj2.equals(this.f);
        boolean bl3 = false;
        if (bl2) {
            return false;
        }
        this.f = ajj2;
        while ((ajj2 = ajj2.i) != null) {
            if (ajj2 == this.e) {
                this.e = this.d;
                bl3 = true;
            }
            ajj2.h();
            --this.h;
        }
        ajj2 = this.f;
        abr.i(ajj2);
        ajj2.i(null);
        this.h();
        return bl3;
    }

    public final boolean o(aew aew2) {
        ajj ajj2;
        ajj ajj3 = this.d;
        if (ajj3 == null) {
            return true;
        }
        int n2 = aew2.a(ajj3.b);
        block0: do {
            n2 = aew2.i(n2, this.m, this.n, this.a, this.b);
            ajj2 = ajj3;
            while (true) {
                abr.i(ajj2);
                ajj3 = ajj2.i;
                if (ajj3 == null || ajj2.g.g) continue block0;
                ajj2 = ajj3;
            }
        } while (n2 != -1 && ajj3 != null && aew2.a(ajj3.b) == n2);
        boolean bl2 = this.n(ajj2);
        ajj2.g = this.d(aew2, ajj2.g);
        return !bl2;
    }
}

