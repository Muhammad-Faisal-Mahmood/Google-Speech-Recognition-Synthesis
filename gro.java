/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
import android.util.SparseArray;
import java.util.ArrayList;

public final class gro
implements gte {
    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    @Override
    public final Object apply(Object var1_1) {
        block34: {
            block33: {
                var8_2 = (gqo)var1_1;
                new SparseArray();
                var1_1 = var8_2.c;
                var8_2 = var8_2.d;
                fxf.K(var1_1);
                var10_3 = new grt((gqm)var1_1, (SparseArray)var8_2);
                fxf.A(((kel)var10_3.j.o()).equals(kel.a));
                var9_4 = var10_3.j;
                var8_2 = hzw.b(var10_3.d.f);
                if (!var9_4.b.B()) {
                    var9_4.u();
                }
                var1_1 = (kel)var9_4.b;
                var8_2.getClass();
                var1_1.f = var8_2;
                var1_1.b |= 16;
                var3_5 = fxf.ad(var10_3.d);
                if (!var9_4.b.B()) {
                    var9_4.u();
                }
                var1_1 = (kel)var9_4.b;
                var1_1.b |= 1;
                var1_1.c = var3_5;
                var1_1 = var10_3.d;
                if ((var1_1.b & 32) != 0) {
                    var1_1 = var8_2 = var1_1.i;
                    if (var8_2 == null) {
                        var1_1 = gmv.a;
                    }
                    if ((var1_1.b & 1) != 0) {
                        var11_6 = var10_3.j;
                        var8_2 = var9_4 = var1_1.c;
                        if (var9_4 == null) {
                            var8_2 = gmu.a;
                        }
                        var2_7 = var8_2.c;
                        if (!var11_6.b.B()) {
                            var11_6.u();
                        }
                        var8_2 = (kel)var11_6.b;
                        var8_2.b |= 64;
                        var8_2.h = var2_7;
                    }
                    if ((var1_1.b & 2) != 0) {
                        var11_6 = var10_3.j;
                        var9_4 = kek.a.l();
                        var1_1 = var8_2 = var1_1.d;
                        if (var8_2 == null) {
                            var1_1 = gmt.a;
                        }
                        var8_2 = hzu.a(var1_1.c);
                        if (!var9_4.b.B()) {
                            var9_4.u();
                        }
                        var1_1 = (kek)var9_4.b;
                        var8_2.getClass();
                        var1_1.c = var8_2;
                        var1_1.b |= 1;
                        if (!var11_6.b.B()) {
                            var11_6.u();
                        }
                        var1_1 = (kel)var11_6.b;
                        var8_2 = (kek)var9_4.o();
                        var8_2.getClass();
                        var1_1.i = var8_2;
                        var1_1.b |= 128;
                    }
                }
                if (var10_3.d.e.size() != 0) break block33;
                var1_1 = new djt("<empty trace>");
                var8_2 = var10_3.d;
                var9_4 = var10_3.j;
                var3_5 = var8_2.g;
                var1_1 = new gru((djt)var1_1, null, var3_5, var3_5, false, (kel)var9_4.o(), kfo.a);
                break block34;
            }
            var1_1 = var10_3.d.e.iterator();
            while (var1_1.hasNext()) {
                var10_3.b((gok)var1_1.next());
            }
            if (!var10_3.b.isEmpty()) {
                var1_1 = new ArrayList<E>(var10_3.c.size());
                for (Object var12_8 : var10_3.c.entrySet()) {
                    var8_2 = keh.a.l();
                    var3_5 = (Long)var12_8.getKey();
                    if (!var8_2.b.B()) {
                        var8_2.u();
                    }
                    var11_6 = (keh)var8_2.b;
                    var11_6.b |= 1;
                    var11_6.c = var3_5;
                    var3_5 = (Long)var12_8.getValue();
                    if (!var8_2.b.B()) {
                        var8_2.u();
                    }
                    var11_6 = (keh)var8_2.b;
                    var11_6.b |= 2;
                    var11_6.d = var3_5;
                    var1_1.add((keh)var8_2.o());
                }
                for (Object var12_8 : var10_3.b) {
                    var11_6 = var10_3.j;
                    var9_4 = kej.a.l();
                    if (!var9_4.b.B()) {
                        var9_4.u();
                    }
                    var13_9 = (kej)var9_4.b;
                    var13_9.e = 2;
                    var13_9.b |= 1;
                    var12_8.longValue();
                    if (!var9_4.b.B()) {
                        var9_4.u();
                    }
                    var13_9 = (kej)var9_4.b;
                    var13_9.c = 2;
                    var13_9.d = var12_8;
                    if (!var9_4.b.B()) {
                        var9_4.u();
                    }
                    var13_9 = (kej)var9_4.b;
                    var12_8 = var13_9.f;
                    if (!var12_8.c()) {
                        var13_9.f = hwv.s((hxk)var12_8);
                    }
                    hvc.g((Iterable)var1_1, var13_9.f);
                    if (!var11_6.b.B()) {
                        var11_6.u();
                    }
                    var11_6 = (kel)var11_6.b;
                    var12_8 = (kej)var9_4.o();
                    var12_8.getClass();
                    var9_4 = var11_6.e;
                    if (!var9_4.c()) {
                        var11_6.e = hwv.s((hxk)var9_4);
                    }
                    var11_6.e.add(var12_8);
                }
            }
            if (var10_3.i == null) {
                var10_3.i = var10_3.h;
            }
            var8_2 = var10_3.j;
            var1_1 = var10_3.i.c;
            if (!var8_2.b.B()) {
                var8_2.u();
            }
            var8_2 = (kel)var8_2.b;
            var1_1.getClass();
            var8_2.b = 2 | var8_2.b;
            var8_2.d = var1_1;
            var2_7 = var10_3.d.e.size();
            var7_10 = false;
            if (var2_7 != 1) ** GOTO lbl-1000
            var1_1 = var10_3.d;
            if (var1_1.g == var10_3.e && (var1_1.b & 32) == 0) {
                var5_11 = true;
            } else lbl-1000:
            // 2 sources

            {
                var5_11 = false;
            }
            var6_12 = var10_3.f != 0x7FFFFFFFFFFFFFFFL;
            fxf.A(var6_12);
            var6_12 = var7_10;
            if (var10_3.g != -9223372036854775808L) {
                var6_12 = true;
            }
            fxf.A(var6_12);
            var8_2 = var10_3.j;
            var1_1 = hzu.b(var10_3.g - var10_3.f);
            if (!var8_2.b.B()) {
                var8_2.u();
            }
            var8_2 = (kel)var8_2.b;
            var1_1.getClass();
            var8_2.g = var1_1;
            var8_2.b |= 32;
            var1_1 = kfo.a.l();
            var8_2 = var10_3.d;
            var8_2 = hzu.b(var8_2.g * 1000000L + (long)var8_2.h);
            if (!var1_1.b.B()) {
                var1_1.u();
            }
            var9_4 = (kfo)var1_1.b;
            var8_2.getClass();
            var9_4.d = var8_2;
            var9_4.b |= 1;
            var8_2 = var10_3.a.values().iterator();
            while (var8_2.hasNext()) {
                var12_8 = (kfn)((hwp)var8_2.next()).o();
                if (!var1_1.b.B()) {
                    var1_1.u();
                }
                var9_4 = (kfo)var1_1.b;
                var12_8.getClass();
                var11_6 = var9_4.c;
                if (!var11_6.c()) {
                    var9_4.c = hwv.s((hxk)var11_6);
                }
                var9_4.c.add(var12_8);
            }
            var9_4 = var10_3.i;
            var8_2 = new djt(var9_4.c);
            var9_4 = (kdo)var10_3.a((gok)var9_4).f();
            var3_5 = var10_3.d.g;
            var1_1 = new gru((djt)var8_2, (kdo)var9_4, var3_5, var3_5 + var10_3.e, var5_11, (kel)var10_3.j.o(), (kfo)var1_1.o());
        }
        return var1_1.f;
    }
}

