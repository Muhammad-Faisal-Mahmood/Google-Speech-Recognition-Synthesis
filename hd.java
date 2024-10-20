/*
 * Decompiled with CFR 0.152.
 */
import android.support.v7.widget.RecyclerView;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class hd {
    public final ArrayList a;
    public final ArrayList b;
    public int c = 0;
    final AmbientMode$AmbientController d;
    final bzb e;
    private final uo f = new uo(30);

    public hd(AmbientMode$AmbientController ambientMode$AmbientController) {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.d = ambientMode$AmbientController;
        this.e = new bzb(this);
    }

    private final int m(int n2, int n3) {
        int n4;
        hc hc2;
        int n5;
        int n6 = this.b.size();
        while ((n5 = n6 - 1) >= 0) {
            hc2 = (hc)this.b.get(n5);
            int n7 = hc2.a;
            if (n7 == 8) {
                n7 = hc2.b;
                n4 = hc2.d;
                n6 = n7 < n4 ? n4 : n7;
                int n8 = n7 < n4 ? n7 : n4;
                if (n2 >= n8 && n2 <= n6) {
                    if (n8 == n7) {
                        if (n3 == 1) {
                            hc2.d = n4 + 1;
                        } else if (n3 == 2) {
                            hc2.d = n4 - 1;
                        }
                        ++n2;
                        n6 = n5;
                        continue;
                    }
                    if (n3 == 1) {
                        hc2.b = n7 + 1;
                    } else if (n3 == 2) {
                        hc2.b = n7 - 1;
                    }
                    --n2;
                    n6 = n5;
                    continue;
                }
                n6 = n5;
                if (n2 >= n7) continue;
                if (n3 == 1) {
                    hc2.b = n7 + 1;
                    hc2.d = n4 + 1;
                    n6 = n5;
                    continue;
                }
                n6 = n5;
                if (n3 != 2) continue;
                hc2.b = n7 - 1;
                hc2.d = n4 - 1;
                n6 = n5;
                continue;
            }
            n4 = hc2.b;
            if (n4 <= n2) {
                if (n7 == 1) {
                    n2 -= hc2.d;
                    n6 = n5;
                    continue;
                }
                n6 = n5;
                if (n7 != 2) continue;
                n2 += hc2.d;
                n6 = n5;
                continue;
            }
            if (n3 == 1) {
                hc2.b = n4 + 1;
                n6 = n5;
                continue;
            }
            n6 = n5;
            if (n3 != 2) continue;
            hc2.b = n4 - 1;
            n6 = n5;
        }
        n3 = this.b.size();
        while (--n3 >= 0) {
            hc2 = (hc)this.b.get(n3);
            if (hc2.a == 8) {
                n4 = hc2.d;
                if (n4 != hc2.b && n4 >= 0) continue;
                this.b.remove(n3);
                this.h(hc2);
                continue;
            }
            if (hc2.d > 0) continue;
            this.b.remove(n3);
            this.h(hc2);
        }
        return n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void n(hc hc2) {
        Object object;
        int n2;
        int n3;
        int n4;
        int n5 = hc2.a;
        if (n5 != 1 && n5 != 8) {
            n4 = this.m(hc2.b, n5);
            n5 = hc2.b;
            n3 = hc2.a;
            if (n3 != 2) {
                if (n3 != 4) {
                    Objects.toString(hc2);
                    throw new IllegalArgumentException("op should be remove or update.".concat(String.valueOf(hc2)));
                }
                n2 = 1;
            } else {
                n2 = 0;
            }
            n3 = 1;
        } else {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        for (int i2 = 1; i2 < hc2.d; ++i2) {
            int n6 = this.m(hc2.b + n2 * i2, hc2.a);
            int n7 = hc2.a;
            if (n7 != 2 ? n7 == 4 && n6 == n4 + 1 : n6 == n4) {
                ++n3;
                continue;
            }
            object = this.c(n7, n4, n3, hc2.c);
            this.f((hc)object, n5);
            this.h((hc)object);
            n4 = n5;
            if (hc2.a == 4) {
                n4 = n5 + n3;
            }
            n3 = 1;
            n5 = n4;
            n4 = n6;
        }
        object = hc2.c;
        this.h(hc2);
        if (n3 > 0) {
            hc2 = this.c(hc2.a, n4, n3, object);
            this.f(hc2, n5);
            this.h(hc2);
        }
    }

    private final void o(hc hc2) {
        this.b.add(hc2);
        int n2 = hc2.a;
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 4) {
                    if (n2 == 8) {
                        this.d.o(hc2.b, hc2.d);
                        return;
                    }
                    Objects.toString(hc2);
                    throw new IllegalArgumentException("Unknown update op type for ".concat(String.valueOf(hc2)));
                }
                this.d.m(hc2.b, hc2.d, hc2.c);
                return;
            }
            AmbientMode$AmbientController ambientMode$AmbientController = this.d;
            n2 = hc2.b;
            int n3 = hc2.d;
            ((RecyclerView)ambientMode$AmbientController.a).P(n2, n3, false);
            ((RecyclerView)ambientMode$AmbientController.a).P = true;
            return;
        }
        this.d.n(hc2.b, hc2.d);
    }

    private final boolean p(int n2) {
        int n3 = this.b.size();
        int n4 = 0;
        while (n4 < n3) {
            int n5 = n4 + 1;
            hc hc2 = (hc)this.b.get(n4);
            n4 = hc2.a;
            if (n4 == 8) {
                if (this.b(hc2.d, n5) == n2) {
                    return true;
                }
            } else if (n4 == 1) {
                int n6 = hc2.b;
                int n7 = hc2.d;
                for (n4 = n6; n4 < n7 + n6; ++n4) {
                    if (this.b(n4, n5) != n2) continue;
                    return true;
                }
            }
            n4 = n5;
        }
        return false;
    }

    final int a(int n2) {
        return this.b(n2, 0);
    }

    final int b(int n2, int n3) {
        int n4 = this.b.size();
        int n5 = n3;
        n3 = n2;
        while (n5 < n4) {
            int n6;
            hc hc2 = (hc)this.b.get(n5);
            int n7 = hc2.a;
            if (n7 == 8) {
                n2 = hc2.b;
                if (n2 == n3) {
                    n2 = hc2.d;
                } else {
                    n6 = n3;
                    if (n2 < n3) {
                        n6 = n3 - 1;
                    }
                    n2 = n6;
                    if (hc2.d <= n6) {
                        n2 = n6 + 1;
                    }
                }
            } else {
                n6 = hc2.b;
                n2 = n3;
                if (n6 <= n3) {
                    if (n7 == 2) {
                        n2 = hc2.d;
                        if (n3 < n6 + n2) {
                            return -1;
                        }
                        n2 = n3 - n2;
                    } else {
                        n2 = n3;
                        if (n7 == 1) {
                            n2 = n3 + hc2.d;
                        }
                    }
                }
            }
            ++n5;
            n3 = n2;
        }
        return n3;
    }

    public final hc c(int n2, int n3, int n4, Object object) {
        hc hc2 = (hc)this.f.a();
        if (hc2 == null) {
            object = new hc(n2, n3, n4, object);
        } else {
            hc2.a = n2;
            hc2.b = n3;
            hc2.d = n4;
            hc2.c = object;
            object = hc2;
        }
        return object;
    }

    public final void d() {
        int n2 = this.b.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.d.l((hc)this.b.get(i2));
        }
        this.i(this.b);
        this.c = 0;
    }

    public final void e() {
        this.d();
        int n2 = this.a.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            hc hc2 = (hc)this.a.get(i2);
            int n3 = hc2.a;
            if (n3 != 1) {
                if (n3 != 2) {
                    if (n3 != 4) {
                        if (n3 != 8) continue;
                        this.d.l(hc2);
                        this.d.o(hc2.b, hc2.d);
                        continue;
                    }
                    this.d.l(hc2);
                    this.d.m(hc2.b, hc2.d, hc2.c);
                    continue;
                }
                this.d.l(hc2);
                this.d.p(hc2.b, hc2.d);
                continue;
            }
            this.d.l(hc2);
            this.d.n(hc2.b, hc2.d);
        }
        this.i(this.a);
        this.c = 0;
    }

    final void f(hc hc2, int n2) {
        this.d.l(hc2);
        int n3 = hc2.a;
        if (n3 != 2) {
            if (n3 == 4) {
                this.d.m(n2, hc2.d, hc2.c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        this.d.p(n2, hc2.d);
    }

    /*
     * Unable to fully structure code
     */
    public final void g() {
        while (true) {
            block68: {
                var16_13 = this.a;
                var1_1 = var16_13.size();
                var5_5 = -1;
                --var1_1;
                var4_4 = 0;
                var2_2 = 0;
                while (var1_1 >= 0) {
                    if (((hc)var16_13.get((int)var1_1)).a == 8) {
                        if (var2_2 != 0) {
                            var3_3 = var1_1;
                            break block68;
                        }
                        var2_2 = 0;
                    } else {
                        var2_2 = 1;
                    }
                    --var1_1;
                }
                var3_3 = -1;
            }
            var15_12 = null;
            var14_11 = null;
            var13_10 = null;
            if (var3_3 == -1) break;
            var19_16 = this.e;
            var6_6 = var3_3 + 1;
            var18_15 = (hc)var16_13.get(var3_3);
            var17_14 = (hc)var16_13.get(var6_6);
            var1_1 = var17_14.a;
            if (var1_1 != 1) {
                if (var1_1 != 2) {
                    if (var1_1 != 4) continue;
                    var2_2 = var18_15.d;
                    var4_4 = var17_14.b;
                    if (var2_2 < var4_4) {
                        var17_14.b = var4_4 - 1;
                        while (true) {
                            var12_9 = null;
                            break;
                        }
                    } else {
                        if (var2_2 >= var4_4 + (var1_1 = var17_14.d)) ** continue;
                        var17_14.d = var1_1 - 1;
                        var14_11 = var19_16.a;
                        var1_1 = var18_15.b;
                        var12_9 = var17_14.c;
                        var12_9 = ((hd)var14_11).c(4, var1_1, 1, var12_9);
                    }
                    var1_1 = var18_15.b;
                    var2_2 = var17_14.b;
                    if (var1_1 <= var2_2) {
                        var17_14.b = var2_2 + 1;
                    } else if (var1_1 < (var2_2 += var17_14.d)) {
                        var14_11 = var19_16.a;
                        var13_10 = var17_14.c;
                        var13_10 = ((hd)var14_11).c(4, var1_1 + 1, var2_2 -= var1_1, var13_10);
                        var17_14.d -= var2_2;
                    }
                    var16_13.set(var6_6, var18_15);
                    if (var17_14.d > 0) {
                        var16_13.set(var3_3, var17_14);
                    } else {
                        var16_13.remove(var3_3);
                        ((hd)var19_16.a).h(var17_14);
                    }
                    if (var12_9 != null) {
                        var16_13.add(var3_3, var12_9);
                    }
                    if (var13_10 == null) continue;
                    var16_13.add(var3_3, var13_10);
                    continue;
                }
                var1_1 = var18_15.b;
                var7_7 = var18_15.d;
                if (var1_1 < var7_7) {
                    if (var17_14.b == var1_1 && var17_14.d == var7_7 - var1_1) {
                        var1_1 = 0;
                        var2_2 = 1;
                    } else {
                        var1_1 = 0;
                        var2_2 = var4_4;
                    }
                } else if (var17_14.b == var7_7 + 1 && var17_14.d == var1_1 - var7_7) {
                    var1_1 = 1;
                    var2_2 = 1;
                } else {
                    var1_1 = 1;
                    var2_2 = var4_4;
                }
                var5_5 = var17_14.b;
                if (var7_7 < var5_5) {
                    var17_14.b = var4_4 = var5_5 - 1;
                } else {
                    var8_8 = var17_14.d;
                    var4_4 = var5_5;
                    if (var7_7 < var5_5 + var8_8) {
                        var17_14.d = var8_8 - 1;
                        var18_15.a = 2;
                        var18_15.d = 1;
                        if (var17_14.d != 0) continue;
                        var16_13.remove(var6_6);
                        ((hd)var19_16.a).h(var17_14);
                        continue;
                    }
                }
                var5_5 = var18_15.b;
                if (var5_5 <= var4_4) {
                    var17_14.b = var4_4 + 1;
                    while (true) {
                        var12_9 = null;
                        break;
                    }
                } else {
                    if (var5_5 >= (var4_4 += var17_14.d)) ** continue;
                    var12_9 = ((hd)var19_16.a).c(2, var5_5 + 1, var4_4 - var5_5, null);
                    var17_14.d = var18_15.b - var17_14.b;
                }
                if (var2_2 != 0) {
                    var16_13.set(var3_3, var17_14);
                    var16_13.remove(var6_6);
                    ((hd)var19_16.a).h(var18_15);
                    continue;
                }
                if (var1_1 != 0) {
                    var13_10 = var15_12;
                    if (var12_9 != null) {
                        var1_1 = var18_15.b;
                        if (var1_1 > var12_9.b) {
                            var18_15.b = var1_1 - var12_9.d;
                        }
                        if ((var1_1 = var18_15.d) > var12_9.b) {
                            var18_15.d = var1_1 - var12_9.d;
                        }
                        var13_10 = var12_9;
                    }
                    if ((var1_1 = var18_15.b) > var17_14.b) {
                        var18_15.b = var1_1 - var17_14.d;
                    }
                    var1_1 = var18_15.d;
                    var12_9 = var13_10;
                    if (var1_1 > var17_14.b) {
                        var18_15.d = var1_1 - var17_14.d;
                        var12_9 = var13_10;
                    }
                } else {
                    var13_10 = var14_11;
                    if (var12_9 != null) {
                        var1_1 = var18_15.b;
                        if (var1_1 >= var12_9.b) {
                            var18_15.b = var1_1 - var12_9.d;
                        }
                        if ((var1_1 = var18_15.d) >= var12_9.b) {
                            var18_15.d = var1_1 - var12_9.d;
                        }
                        var13_10 = var12_9;
                    }
                    if ((var1_1 = var18_15.b) >= var17_14.b) {
                        var18_15.b = var1_1 - var17_14.d;
                    }
                    var1_1 = var18_15.d;
                    var12_9 = var13_10;
                    if (var1_1 >= var17_14.b) {
                        var18_15.d = var1_1 - var17_14.d;
                        var12_9 = var13_10;
                    }
                }
                var16_13.set(var3_3, var17_14);
                if (var18_15.b != var18_15.d) {
                    var16_13.set(var6_6, var18_15);
                } else {
                    var16_13.remove(var6_6);
                }
                if (var12_9 == null) continue;
                var16_13.add(var3_3, var12_9);
                continue;
            }
            var4_4 = var18_15.d;
            var7_7 = var17_14.b;
            var1_1 = var4_4 < var7_7 ? var5_5 : 0;
            var5_5 = var18_15.b;
            var2_2 = var1_1;
            if (var5_5 < var7_7) {
                var2_2 = var1_1 + 1;
            }
            if (var7_7 <= var5_5) {
                var18_15.b = var5_5 + var17_14.d;
            }
            if ((var1_1 = var17_14.b) <= var4_4) {
                var18_15.d = var4_4 + var17_14.d;
            }
            var17_14.b = var1_1 + var2_2;
            var16_13.set(var3_3, var17_14);
            var16_13.set(var6_6, var18_15);
        }
        var10_17 = this.a.size();
        for (var7_7 = 0; var7_7 < var10_17; ++var7_7) {
            var12_9 = (hc)this.a.get(var7_7);
            var1_1 = var12_9.a;
            if (var1_1 != 1) {
                if (var1_1 != 2) {
                    if (var1_1 != 4) {
                        if (var1_1 != 8) continue;
                        this.o((hc)var12_9);
                        continue;
                    }
                    var8_8 = var12_9.b;
                    var11_19 = var12_9.d;
                    var9_18 = -1;
                    var1_1 = 0;
                    var2_2 = var8_8;
                    for (var3_3 = var8_8; var3_3 < var11_19 + var8_8; ++var3_3) {
                        if (this.d.k(var3_3) == null && !this.p(var3_3)) {
                            var5_5 = var2_2;
                            var4_4 = var1_1;
                            if (var9_18 == 1) {
                                this.o(this.c(4, var2_2, var1_1, var12_9.c));
                                var4_4 = 0;
                                var5_5 = var3_3;
                            }
                            var1_1 = 0;
                            var2_2 = var5_5;
                            var5_5 = var4_4;
                            var4_4 = var1_1;
                        } else {
                            var6_6 = var2_2;
                            var5_5 = var1_1;
                            if (var9_18 == 0) {
                                this.n(this.c(4, var2_2, var1_1, var12_9.c));
                                var5_5 = 0;
                                var6_6 = var3_3;
                            }
                            var4_4 = 1;
                            var2_2 = var6_6;
                        }
                        var1_1 = var5_5 + 1;
                        var9_18 = var4_4;
                    }
                    var13_10 = var12_9;
                    if (var1_1 != var12_9.d) {
                        var13_10 = var12_9.c;
                        this.h((hc)var12_9);
                        var13_10 = this.c(4, var2_2, var1_1, var13_10);
                    }
                    if (var9_18 == 0) {
                        this.n((hc)var13_10);
                        continue;
                    }
                    this.o((hc)var13_10);
                    continue;
                }
                var6_6 = var12_9.b;
                var4_4 = var12_9.d + var6_6;
                var5_5 = 0;
                var2_2 = -1;
                for (var1_1 = var6_6; var1_1 < var4_4; ++var1_1) {
                    if (this.d.k(var1_1) == null && !this.p(var1_1)) {
                        if (var2_2 == 1) {
                            this.o(this.c(2, var6_6, var5_5, null));
                            var2_2 = 1;
                        } else {
                            var2_2 = 0;
                        }
                        var8_8 = 0;
                        var3_3 = var2_2;
                        var2_2 = var8_8;
                    } else {
                        if (var2_2 == 0) {
                            this.n(this.c(2, var6_6, var5_5, null));
                            var3_3 = 1;
                        } else {
                            var3_3 = 0;
                        }
                        var2_2 = 1;
                    }
                    if (var3_3 != 0) {
                        var1_1 -= var5_5;
                        var4_4 -= var5_5;
                        var3_3 = 1;
                    } else {
                        var3_3 = var5_5 + 1;
                    }
                    var5_5 = var3_3;
                }
                var13_10 = var12_9;
                if (var5_5 != var12_9.d) {
                    this.h((hc)var12_9);
                    var13_10 = this.c(2, var6_6, var5_5, null);
                }
                if (var2_2 == 0) {
                    this.n((hc)var13_10);
                    continue;
                }
                this.o((hc)var13_10);
                continue;
            }
            this.o((hc)var12_9);
        }
        this.a.clear();
    }

    public final void h(hc hc2) {
        hc2.c = null;
        this.f.b(hc2);
    }

    final void i(List list) {
        int n2 = list.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.h((hc)list.get(i2));
        }
        list.clear();
    }

    public final void j() {
        this.i(this.a);
        this.i(this.b);
        this.c = 0;
    }

    public final boolean k(int n2) {
        return (n2 & this.c) != 0;
    }

    public final boolean l() {
        return this.a.size() > 0;
    }
}

