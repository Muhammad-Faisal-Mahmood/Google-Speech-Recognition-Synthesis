/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 *  gqv
 */
import android.util.SparseArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

final class grt {
    public final Map a = new HashMap();
    public final Set b = new HashSet();
    public final Map c = new HashMap();
    public final gqm d;
    public long e = 0L;
    public long f;
    public long g;
    public gok h;
    public gok i;
    public final hwp j = kel.a.l();
    private final SparseArray k;
    private final long[] l;
    private final boolean[] m;
    private long n = 1L;
    private long o = 2L;

    public grt(gqm gqm2, SparseArray sparseArray) {
        this.f = Long.MAX_VALUE;
        this.g = Long.MIN_VALUE;
        this.d = gqm2;
        this.k = sparseArray;
        this.m = new boolean[gqm2.e.size()];
        this.l = new long[gqm2.e.size()];
    }

    private final long c(long l2, hwg hyg2, String object) {
        long l3 = this.n;
        this.n = 1L + l3;
        hwp hwp2 = kep.a.l();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        hwv hwv2 = hwp2.b;
        kep kep2 = (kep)hwv2;
        kep2.b |= 2;
        kep2.d = l2;
        if (!hwv2.B()) {
            hwp2.u();
        }
        hwv2 = (kep)hwp2.b;
        ((kep)hwv2).b |= 1;
        ((kep)hwv2).c = object;
        this.m(l3, (hwg)hyg2, (kep)hwp2.o());
        hyg2 = this.o(l3);
        if (!((hwp)hyg2).b.B()) {
            ((hwp)hyg2).u();
        }
        hyg2 = (kfn)((hwp)hyg2).b;
        object = kfn.a;
        ((kfn)hyg2).b |= 0x10;
        ((kfn)hyg2).g = true;
        return l3;
    }

    private final long d(int n2) {
        long l2;
        long[] lArray = this.l;
        long l3 = l2 = lArray[n2];
        if (l2 == 0L) {
            l3 = this.n;
            this.n = 1L + l3;
            lArray[n2] = l3;
        }
        return l3;
    }

    private final long e(gok gok2) {
        return this.d(gok2.d);
    }

    private static long f(gok gok2) {
        return (gok2.f + gok2.h) * 1000000L + (long)gok2.g + (long)gok2.i;
    }

    private static long g(gok gok2) {
        return gok2.f * 1000000L + (long)gok2.g;
    }

    private final grs h(gok object) {
        int n2 = ((gok)object).e;
        if ((long)n2 != -1L) {
            long l2;
            hwv hwv2;
            boolean bl2;
            int n3;
            boolean bl3;
            long l3;
            int n4;
            boolean bl4 = ((gok)object).m;
            Object object2 = this.d.e;
            do {
                l3 = n2;
                bl3 = false;
                n3 = n2;
                bl2 = bl4;
                if (l3 == -1L) break;
                hwv2 = (gok)object2.get(n2);
                n3 = n4 = a.v(hwv2.l);
                if (n4 == 0) {
                    n3 = 1;
                }
                if (--n3 != 1) {
                    if (n3 != 2) {
                        if (n3 != 3) {
                            n2 = hwv2.d;
                            object = new StringBuilder("Invalid span kind for span: ");
                            ((StringBuilder)object).append(n2);
                            throw new AssertionError((Object)((StringBuilder)object).toString());
                        }
                        throw new AssertionError((Object)"Markers are not expected to be ancestors.");
                    }
                    bl2 = hwv2.m;
                    n3 = hwv2.e;
                    n4 = 0;
                    bl2 &= bl4;
                } else {
                    n4 = 1;
                    bl2 = bl4;
                    n3 = n2;
                }
                n2 = n3;
                bl4 = bl2;
            } while (n4 == 0);
            bl4 = bl3;
            if ((long)n3 != -1L) {
                bl4 = true;
            }
            fvd.am(bl4);
            gok gok2 = (gok)object2.get(n3);
            l3 = grt.g(gok2);
            long l4 = grt.g((gok)object);
            if (l3 <= l4 && l4 <= (l2 = grt.f(gok2)) && ((n2 = a.v(((gok)object).l)) == 0 || n2 != 2 || l3 <= (l4 = grt.f((gok)object)) && l4 <= l2) && bl2) {
                return new grs(this.e(gok2), gsl.a);
            }
            object2 = grt.j((gok)object);
            hwv2 = grt.i(gok2);
            hzu.d((hwg)object2);
            hzu.d((hwg)hwv2);
            n2 = n3 = Long.compare(((hwg)object2).b, ((hwg)hwv2).b);
            if (n3 == 0) {
                n2 = Integer.compare(((hwg)object2).c, ((hwg)hwv2).c);
            }
            if (n2 >= 0) {
                object2 = hwv2;
            }
            l3 = this.c(this.e(gok2), (hwg)object2, String.valueOf(((gok)object).c).concat("-dispatch"));
            l2 = this.e(gok2);
            hzu.d((hwg)object2);
            return new grs(l2, gto.i(new grr(l3, hhk.ap(hhk.aq(((hwg)object2).b, 1000000000L), ((hwg)object2).c))));
        }
        return new grs(0L, gsl.a);
    }

    private static hwg i(gok gok2) {
        return hzu.b(grt.f(gok2));
    }

    private static hwg j(gok gok2) {
        return grt.k(gok2, 0L);
    }

    private static hwg k(gok gok2, long l2) {
        return hzu.b(grt.g(gok2) + l2);
    }

    private final kep l(gok hwv2, long l2) {
        hwp hwp2 = kep.a.l();
        Object object = hwv2.c;
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        Object object2 = hwp2.b;
        kep kep2 = (kep)object2;
        object.getClass();
        kep2.b |= 1;
        kep2.c = object;
        if (!((hwv)object2).B()) {
            hwp2.u();
        }
        object = (kep)hwp2.b;
        ((kep)object).b |= 2;
        ((kep)object).d = l2;
        object = (hav)((gop)this.k.get(hwv2.d, (Object)goo.a)).i(gpt.a);
        if (object != null) {
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            hwv2 = (kep)hwp2.b;
            object2 = ((kep)hwv2).e;
            if (!object2.c()) {
                ((kep)hwv2).e = hwv.r((hxe)object2);
            }
            hvc.g((Iterable)object, ((kep)hwv2).e);
        }
        return (kep)hwp2.o();
    }

    private final void m(long l2, hwg hyg2, kep hwv2) {
        hwp hwp2 = keq.a.l();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        hyg hyg3 = hwp2.b;
        keq keq2 = (keq)hyg3;
        keq2.b |= 1;
        keq2.e = l2;
        if (!((hwv)hyg3).B()) {
            hwp2.u();
        }
        hyg3 = (keq)hwp2.b;
        hyg2.getClass();
        ((keq)hyg3).f = hyg2;
        ((keq)hyg3).b |= 2;
        hyg2 = kem.a.l();
        if (!((hwp)hyg2).b.B()) {
            ((hwp)hyg2).u();
        }
        hyg3 = (kem)((hwp)hyg2).b;
        hwv2.getClass();
        ((kem)hyg3).c = hwv2;
        ((kem)hyg3).b |= 1;
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        hyg3 = this.j;
        hwv2 = (keq)hwp2.b;
        hyg2 = (kem)((hwp)hyg2).o();
        hyg2.getClass();
        ((keq)hwv2).d = hyg2;
        ((keq)hwv2).c = 5;
        ((hwp)hyg3).aB(hwp2);
    }

    private final void n(gok hyg2, long l2, long l3, long l4, String object, long l5) {
        block18: {
            hyg hyg3;
            hwv hwv2;
            hyg hyg4;
            hyg hyg5;
            long l6;
            block20: {
                block19: {
                    l6 = this.e((gok)hyg2);
                    hyg5 = grt.k((gok)hyg2, l5);
                    hyg4 = ken.a.l();
                    hwv2 = this.l((gok)hyg2, l2);
                    if (!((hwp)hyg4).b.B()) {
                        ((hwp)hyg4).u();
                    }
                    hyg3 = ((hwp)hyg4).b;
                    hwv hwv3 = (ken)hyg3;
                    hwv2.getClass();
                    ((ken)hwv3).c = hwv2;
                    ((ken)hwv3).b |= 1;
                    if (l3 != 0L) {
                        if (!((hwv)hyg3).B()) {
                            ((hwp)hyg4).u();
                        }
                        hyg3 = (ken)((hwp)hyg4).b;
                        ((ken)hyg3).b |= 2;
                        ((ken)hyg3).d = l3;
                    }
                    if (l4 != 0L && object != null) {
                        if (!((hwp)hyg4).b.B()) {
                            ((hwp)hyg4).u();
                        }
                        hyg3 = ((hwp)hyg4).b;
                        hwv2 = (ken)hyg3;
                        ((ken)hwv2).b |= 8;
                        ((ken)hwv2).e = object;
                        if (!((hwv)hyg3).B()) {
                            ((hwp)hyg4).u();
                        }
                        hyg3 = ((hwp)hyg4).b;
                        object = (ken)hyg3;
                        ((ken)object).b |= 0x20;
                        ((ken)object).g = 1L;
                        if (!((hwv)hyg3).B()) {
                            ((hwp)hyg4).u();
                        }
                        object = (ken)((hwp)hyg4).b;
                        ((ken)object).f = 3;
                        ((ken)object).b |= 0x10;
                    }
                    object = this.j;
                    hyg3 = keq.a.l();
                    if (!((hwp)hyg3).b.B()) {
                        ((hwp)hyg3).u();
                    }
                    hwv3 = ((hwp)hyg3).b;
                    hwv2 = (keq)hwv3;
                    ((keq)hwv2).b |= 1;
                    ((keq)hwv2).e = l6;
                    if (!hwv3.B()) {
                        ((hwp)hyg3).u();
                    }
                    hwv3 = ((hwp)hyg3).b;
                    hwv2 = (keq)hwv3;
                    hyg5.getClass();
                    ((keq)hwv2).f = hyg5;
                    ((keq)hwv2).b |= 2;
                    if (!hwv3.B()) {
                        ((hwp)hyg3).u();
                    }
                    hwv2 = (keq)((hwp)hyg3).b;
                    hyg4 = (ken)((hwp)hyg4).o();
                    hyg4.getClass();
                    ((keq)hwv2).d = hyg4;
                    ((keq)hwv2).c = 3;
                    ((hwp)object).aB((hwp)hyg3);
                    if ((((gok)hyg2).b & 0x20) == 0) break block18;
                    if (((gok)hyg2).h > 0L) break block19;
                    object = hyg5;
                    if (((gok)hyg2).i <= 0) break block20;
                }
                object = grt.i((gok)hyg2);
            }
            hyg5 = keo.a.l();
            if ((((gok)hyg2).b & 0x80) != 0) {
                hyg2 = hzu.a(((gok)hyg2).j);
                if (!((hwp)hyg5).b.B()) {
                    ((hwp)hyg5).u();
                }
                hyg4 = (keo)((hwp)hyg5).b;
                hyg2.getClass();
                ((keo)hyg4).c = hyg2;
                ((keo)hyg4).b |= 1;
            }
            hyg4 = this.j;
            hyg2 = keq.a.l();
            if (!((hwp)hyg2).b.B()) {
                ((hwp)hyg2).u();
            }
            hyg3 = ((hwp)hyg2).b;
            hwv2 = (keq)hyg3;
            ((keq)hwv2).b |= 1;
            ((keq)hwv2).e = l6;
            if (!((hwv)hyg3).B()) {
                ((hwp)hyg2).u();
            }
            hwv2 = ((hwp)hyg2).b;
            hyg3 = (keq)hwv2;
            object.getClass();
            ((keq)hyg3).f = object;
            ((keq)hyg3).b |= 2;
            if (!hwv2.B()) {
                ((hwp)hyg2).u();
            }
            object = (keq)((hwp)hyg2).b;
            hyg5 = (keo)((hwp)hyg5).o();
            hyg5.getClass();
            ((keq)object).d = hyg5;
            ((keq)object).c = 4;
            ((hwp)hyg4).aB((hwp)hyg2);
        }
    }

    private final hwp o(long l2) {
        Object object = this.a;
        Long l3 = l2;
        hyg hyg2 = (hwp)object.get(l3);
        object = hyg2;
        if (hyg2 == null) {
            object = kfn.a.l();
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            hyg2 = (kfn)((hwp)object).b;
            ((kfn)hyg2).b |= 1;
            ((kfn)hyg2).c = l2;
            this.a.put(l3, object);
        }
        return object;
    }

    public final gto a(gok object) {
        object = (gop)this.k.get(((gok)object).d, (Object)goo.a);
        if (((gom)(object = gop.h(grq.a, (gop)object, gqv.a))).b()) {
            return ((grp)((gom)object).a()).a();
        }
        return gsl.a;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void b(gok var1_1) {
        block38: {
            block41: {
                block39: {
                    block40: {
                        var14_2 /* !! */  = this.m;
                        var3_3 = var1_1.d;
                        if (var14_2 /* !! */ [var3_3]) break block38;
                        var2_4 = var1_1.e;
                        if (var2_4 > var3_3) {
                            this.b((gok)this.d.e.get(var2_4));
                        }
                        var4_5 = var1_1.l;
                        var2_4 = var3_3 = a.v(var4_5);
                        if (var3_3 == 0) {
                            var2_4 = 1;
                        }
                        var3_3 = var2_4 - 1;
                        var2_4 = 0;
                        var13_6 = false;
                        if (var3_3 == 1) break block39;
                        if (var3_3 != 2) break block40;
                        var2_4 = a.v(var4_5);
                        if (var2_4 != 0 && var2_4 == 3) {
                            var13_6 = true;
                        }
                        fxf.A(var13_6);
                        var15_7 = this.h((gok)var1_1);
                        var14_2 /* !! */  = (boolean[])var15_7.b;
                        var5_8 = var14_2 /* !! */ .g() != false ? ((grr)var14_2 /* !! */ .c()).a : this.c(var15_7.a, grt.j((gok)var1_1), String.valueOf(var1_1.c).concat("-start"));
                        var14_2 /* !! */  = this.o(this.e((gok)var1_1));
                        var7_9 = this.d(var1_1.e);
                        if (!var14_2 /* !! */ .b.B()) {
                            var14_2 /* !! */ .u();
                        }
                        var15_7 = (kfn)var14_2 /* !! */ .b;
                        var14_2 /* !! */  = kfn.a;
                        var15_7.b |= 32;
                        var15_7.h = var7_9;
                        var7_9 = this.o;
                        this.o = 1L + var7_9;
                        this.n((gok)var1_1, var5_8, var7_9, 1L, "Intervals", 0L);
                        break block41;
                    }
                    if (var3_3 != 3) {
                        var2_4 = var1_1.d;
                        var1_1 = new StringBuilder("Invalid span kind for span: ");
                        var1_1.append(var2_4);
                        throw new AssertionError((Object)var1_1.toString());
                    }
                }
                var3_3 = a.v(var4_5);
                if (var3_3 != 0 && var3_3 == 2) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var13_6 = true;
                        break;
                    }
                } else {
                    var3_3 = a.v(var4_5);
                    if (var3_3 == 0) {
                        while (true) {
                            var13_6 = false;
                            break;
                        }
                    } else {
                        if (var3_3 != 4) ** continue;
                        ** continue;
                    }
                }
                fxf.A(var13_6);
                var3_3 = a.v(var1_1.l);
                if (var3_3 != 0 && var3_3 == 2) {
                    var2_4 = 1;
                }
                var14_2 /* !! */  = this.h((gok)var1_1);
                var7_9 = var14_2 /* !! */ .a;
                if (var1_1.k) {
                    var5_8 = 1L;
                } else if ((long)var1_1.e == -1L) {
                    var5_8 = this.o;
                    this.o = var5_8 + 1L;
                } else if (var14_2 /* !! */ .b.g()) {
                    var5_8 = this.o;
                    this.o = var5_8 + 1L;
                } else {
                    var5_8 = 0L;
                }
                var14_2 /* !! */  = var14_2 /* !! */ .b;
                if (!var14_2 /* !! */ .g()) ** GOTO lbl82
                var14_2 /* !! */  = (grr)var14_2 /* !! */ .c();
                var7_9 = var14_2 /* !! */ .a;
                if (grt.g((gok)var1_1) == var14_2 /* !! */ .b) {
                    var9_10 = 1L;
                    var2_4 = 1;
                } else {
                    var2_4 = 1;
lbl82:
                    // 2 sources

                    var9_10 = 0L;
                }
                var3_3 = var1_1.e;
                if ((long)var3_3 != -1L && (var11_11 = this.d(var3_3)) != var7_9) {
                    var14_2 /* !! */  = this.o(this.e((gok)var1_1));
                    if (!var14_2 /* !! */ .b.B()) {
                        var14_2 /* !! */ .u();
                    }
                    var14_2 /* !! */  = (kfn)var14_2 /* !! */ .b;
                    var15_7 = kfn.a;
                    var14_2 /* !! */ .b |= 32;
                    var14_2 /* !! */ .h = var11_11;
                }
                if (var2_4 != 0) {
                    this.n((gok)var1_1, var7_9, var5_8, 0L, null, var9_10);
                } else {
                    this.m(this.e((gok)var1_1), grt.j((gok)var1_1), this.l((gok)var1_1, var7_9));
                }
            }
            var14_2 /* !! */  = this.a((gok)var1_1);
            if (var14_2 /* !! */ .g()) {
                var15_7 = this.o(this.e((gok)var1_1));
                var14_2 /* !! */  = (kdo)var14_2 /* !! */ .c();
                if (!var15_7.b.B()) {
                    var15_7.u();
                }
                var15_7 = (kfn)var15_7.b;
                var16_12 = kfn.a;
                var15_7.d = var14_2 /* !! */ ;
                var15_7.b |= 2;
            }
            if ((long)var1_1.e == -1L) {
                this.h = var1_1;
            } else if (this.i == null) {
                var14_2 /* !! */  = (gop)this.k.get(var1_1.d, (Object)goo.a);
                if ((var14_2 /* !! */  = gop.h(grq.a, (gop)var14_2 /* !! */ , gqv.a)).b() && ((grp)var14_2 /* !! */ .a()).b()) {
                    this.i = var1_1;
                    var14_2 /* !! */  = this.o(this.e((gok)var1_1));
                    if (!var14_2 /* !! */ .b.B()) {
                        var14_2 /* !! */ .u();
                    }
                    var14_2 /* !! */  = (kfn)var14_2 /* !! */ .b;
                    var15_7 = kfn.a;
                    var14_2 /* !! */ .b |= 4;
                    var14_2 /* !! */ .e = true;
                }
            }
            if ((var1_1.b & 256) != 0) {
                var14_2 /* !! */  = this.o(this.e((gok)var1_1));
                var13_6 = var1_1.k;
                if (!var14_2 /* !! */ .b.B()) {
                    var14_2 /* !! */ .u();
                }
                var15_7 = (kfn)var14_2 /* !! */ .b;
                var14_2 /* !! */  = kfn.a;
                var15_7.b |= 8;
                var15_7.f = var13_6;
            }
            var7_9 = grt.g((gok)var1_1);
            var5_8 = grt.f((gok)var1_1);
            if (var7_9 < this.f) {
                this.f = var7_9;
            }
            if (var5_8 > this.g) {
                this.g = var5_8;
            }
            if ((var5_8 = var1_1.f + var1_1.h) > this.e) {
                this.e = var5_8;
            }
            var14_2 /* !! */  = this.k;
            if ((var14_2 /* !! */  = gop.h(djn.a, (gop)var14_2 /* !! */ .get(var1_1.d, (Object)goo.a), gqv.a)).b()) {
                this.b.add((Long)var14_2 /* !! */ .a());
            }
            var14_2 /* !! */  = this.k;
            if ((var14_2 /* !! */  = gop.h(djn.b, (gop)var14_2 /* !! */ .get(var1_1.d, (Object)goo.a), gqv.a)).b()) {
                this.c.put(this.e((gok)var1_1), (Long)var14_2 /* !! */ .a());
            }
            this.m[var1_1.d] = true;
        }
    }
}

