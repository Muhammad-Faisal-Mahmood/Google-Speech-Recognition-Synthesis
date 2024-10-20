/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class qp
extends ra {
    ArrayList a = new ArrayList();
    private int b;

    public qp(qg object, int n2) {
        super((qg)object);
        this.f = n2;
        Object object2 = this.d;
        object = ((qg)object2).n(n2);
        while (object != null) {
            qg qg2 = ((qg)object).n(this.f);
            object2 = object;
            object = qg2;
        }
        this.d = object2;
        this.a.add(((qg)object2).o(this.f));
        for (object = ((qg)object2).m(this.f); object != null; object = ((qg)object).m(this.f)) {
            this.a.add(((qg)object).o(this.f));
        }
        object = this.a;
        int n3 = object.size();
        for (n2 = 0; n2 < n3; ++n2) {
            object2 = (ra)object.get(n2);
            int n4 = this.f;
            if (n4 == 0) {
                ((ra)object2).d.f = this;
                continue;
            }
            if (n4 != 1) continue;
            ((ra)object2).d.g = this;
        }
        if (this.f == 0 && ((qh)this.d.U).c && this.a.size() > 1) {
            object = this.a;
            this.d = ((ra)((ArrayList)object).get((int)(((ArrayList)object).size() - 1))).d;
        }
        n2 = this.f == 0 ? this.d.aj : this.d.ak;
        this.b = n2;
    }

    private final qg g() {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            qg qg2 = ((ra)this.a.get((int)i2)).d;
            if (qg2.ah == 8) continue;
            return qg2;
        }
        return null;
    }

    private final qg n() {
        int n2 = this.a.size();
        while (--n2 >= 0) {
            qg qg2 = ((ra)this.a.get((int)n2)).d;
            if (qg2.ah == 8) continue;
            return qg2;
        }
        return null;
    }

    @Override
    public final long a() {
        int n2 = this.a.size();
        long l2 = 0L;
        for (int i2 = 0; i2 < n2; ++i2) {
            ra ra2 = (ra)this.a.get(i2);
            l2 = l2 + (long)ra2.h.e + ra2.a() + (long)ra2.i.e;
        }
        return l2;
    }

    @Override
    public final void b() {
        int n2;
        Object object = this.a;
        int n3 = object.size();
        for (n2 = 0; n2 < n3; ++n2) {
            ((ra)object.get(n2)).b();
        }
        n2 = this.a.size();
        if (n2 <= 0) {
            return;
        }
        Object object2 = ((ra)this.a.get((int)0)).d;
        object = ((ra)this.a.get((int)(n2 - 1))).d;
        if (this.f == 0) {
            Object object3 = ((qg)object2).J;
            object = ((qg)object).L;
            object2 = qp.l((qf)object3, 0);
            n2 = ((qf)object3).b();
            object3 = this.g();
            if (object3 != null) {
                n2 = ((qg)object3).J.b();
            }
            if (object2 != null) {
                qp.j(this.h, (qs)object2, n2);
            }
            object2 = qp.l((qf)object, 0);
            n2 = ((qf)object).b();
            object = this.n();
            if (object != null) {
                n2 = ((qg)object).L.b();
            }
            if (object2 != null) {
                qp.j(this.i, (qs)object2, -n2);
            }
        } else {
            Object object4 = ((qg)object2).K;
            object = ((qg)object).M;
            object2 = qp.l((qf)object4, 1);
            n2 = ((qf)object4).b();
            object4 = this.g();
            if (object4 != null) {
                n2 = ((qg)object4).K.b();
            }
            if (object2 != null) {
                qp.j(this.h, (qs)object2, n2);
            }
            object2 = qp.l((qf)object, 1);
            n2 = ((qf)object).b();
            object = this.n();
            if (object != null) {
                n2 = ((qg)object).M.b();
            }
            if (object2 != null) {
                qp.j(this.i, (qs)object2, -n2);
            }
        }
        this.h.a = this;
        this.i.a = this;
    }

    @Override
    public final void c() {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            ((ra)this.a.get(i2)).c();
        }
    }

    @Override
    public final void d() {
        this.l = null;
        ArrayList arrayList = this.a;
        int n2 = arrayList.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            ((ra)arrayList.get(i2)).d();
        }
    }

    @Override
    public final boolean e() {
        int n2 = this.a.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (((ra)this.a.get(i2)).e()) continue;
            return false;
        }
        return true;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final void f() {
        block86: {
            block87: {
                block85: {
                    block84: {
                        var21_1 /* !! */  = this.h;
                        if (!var21_1 /* !! */ .i) break block86;
                        var22_2 = this.i;
                        if (!var22_2.i) break block86;
                        var20_3 = this.d.U;
                        var19_4 = var20_3 instanceof qh != false ? ((qh)var20_3).c : false;
                        var18_5 = var22_2.f - var21_1 /* !! */ .f;
                        var17_6 = this.a.size();
                        for (var4_7 = 0; var4_7 < var17_6; ++var4_7) {
                            var12_8 = var4_7;
                            if (((ra)this.a.get((int)var4_7)).d.ah == 8) {
                                continue;
                            }
                            break block84;
                        }
                        var12_8 = -1;
                    }
                    for (var4_7 = var16_9 = var17_6 - 1; var4_7 >= 0; --var4_7) {
                        var13_10 = var4_7;
                        if (((ra)this.a.get((int)var4_7)).d.ah == 8) {
                            continue;
                        }
                        break block85;
                    }
                    var13_10 = -1;
                }
                for (var8_11 = 0; var8_11 < 2; ++var8_11) {
                    var6_16 = 0;
                    var4_7 = 0;
                    var7_17 = 0;
                    var1_12 = 0.0f;
                    for (var9_18 = 0; var9_18 < var17_6; ++var9_18) {
                        block88: {
                            block90: {
                                block89: {
                                    var22_2 = (ra)this.a.get(var9_18);
                                    var20_3 = var22_2.d;
                                    var5_15 = var6_16;
                                    var11_20 = var4_7;
                                    var10_19 = var7_17;
                                    var3_14 = var1_12;
                                    if (var20_3.ah == 8) break block88;
                                    var14_21 = var7_17 + 1;
                                    var5_15 = var6_16;
                                    if (var9_18 > 0) {
                                        var5_15 = var6_16;
                                        if (var9_18 >= var12_8) {
                                            var5_15 = var6_16 + var22_2.h.e;
                                        }
                                    }
                                    var21_1 /* !! */  = var22_2.e;
                                    var7_17 = var21_1 /* !! */ .f;
                                    var6_16 = var22_2.j != 3 ? 1 : 0;
                                    if (var6_16 == 0) break block89;
                                    var10_19 = this.f;
                                    if (!(var10_19 == 0 ? var20_3.h.e.i != false : var10_19 != 1 || var20_3.i.e.i != false)) break block86;
                                    ** GOTO lbl-1000
                                }
                                if (var22_2.c != 1 || var8_11 != 0) break block90;
                                var6_16 = var21_1 /* !! */ .m;
                                ++var4_7;
                                ** GOTO lbl57
                            }
                            if (var21_1 /* !! */ .i) {
                                var6_16 = var7_17;
lbl57:
                                // 2 sources

                                var10_19 = 1;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var10_19 = var6_16;
                                var6_16 = var7_17;
                            }
                            if (var10_19 == 0) {
                                var7_17 = var4_7 + 1;
                                var3_14 = var20_3.al[this.f];
                                var6_16 = var5_15;
                                var4_7 = var7_17;
                                var2_13 = var1_12;
                                if (var3_14 >= 0.0f) {
                                    var2_13 = var1_12 + var3_14;
                                    var6_16 = var5_15;
                                    var4_7 = var7_17;
                                }
                            } else {
                                var6_16 = var5_15 + var6_16;
                                var2_13 = var1_12;
                            }
                            var5_15 = var6_16;
                            var11_20 = var4_7;
                            var10_19 = var14_21;
                            var3_14 = var2_13;
                            if (var9_18 < var16_9) {
                                var5_15 = var6_16;
                                var11_20 = var4_7;
                                var10_19 = var14_21;
                                var3_14 = var2_13;
                                if (var9_18 < var13_10) {
                                    var5_15 = var6_16 + -var22_2.i.e;
                                    var3_14 = var2_13;
                                    var10_19 = var14_21;
                                    var11_20 = var4_7;
                                }
                            }
                        }
                        var6_16 = var5_15;
                        var4_7 = var11_20;
                        var7_17 = var10_19;
                        var1_12 = var3_14;
                    }
                    if (var6_16 >= var18_5 && var4_7 != 0) {
                        continue;
                    }
                    var5_15 = var4_7;
                    break block87;
                }
                var5_15 = 0;
                var6_16 = 0;
                var7_17 = 0;
                var1_12 = 0.0f;
            }
            var8_11 = this.h.f;
            if (var19_4) {
                var8_11 = this.i.f;
            }
            var4_7 = var8_11;
            if (var6_16 > var18_5) {
                var2_13 = var6_16 - var18_5;
                var4_7 = var19_4 != false ? var8_11 + (int)(var2_13 / 2.0f + 0.5f) : var8_11 - (int)(var2_13 / 2.0f + 0.5f);
            }
            if (var5_15 > 0) {
                var3_14 = var18_5 - var6_16;
                var2_13 = var3_14 / (float)var5_15 + 0.5f;
                var8_11 = 0;
                var9_18 = var4_7;
                for (var14_21 = 0; var14_21 < var17_6; ++var14_21) {
                    var21_1 /* !! */  = (ra)this.a.get(var14_21);
                    var22_2 = var21_1 /* !! */ .d;
                    if (var22_2.ah == 8 || var21_1 /* !! */ .j != 3) continue;
                    var20_3 = var21_1 /* !! */ .e;
                    if (var20_3.i) continue;
                    var4_7 = (int)var2_13;
                    if (var1_12 > 0.0f) {
                        var4_7 = (int)(var22_2.al[this.f] * var3_14 / var1_12 + 0.5f);
                    }
                    if (this.f == 0) {
                        var11_20 = var22_2.w;
                        var10_19 = var22_2.v;
                    } else {
                        var11_20 = var22_2.z;
                        var10_19 = var22_2.y;
                    }
                    var15_22 = var21_1 /* !! */ .c == 1 ? Math.min(var4_7, var20_3.m) : var4_7;
                    var10_19 = var15_22 = Math.max(var10_19, var15_22);
                    if (var11_20 > 0) {
                        var10_19 = Math.min(var11_20, var15_22);
                    }
                    var15_22 = var4_7;
                    var11_20 = var8_11;
                    if (var10_19 != var4_7) {
                        var11_20 = var8_11 + 1;
                        var15_22 = var10_19;
                    }
                    var21_1 /* !! */ .e.c(var15_22);
                    var8_11 = var11_20;
                }
                if (var8_11 > 0) {
                    var11_20 = var5_15 - var8_11;
                    var10_19 = 0;
                    var4_7 = 0;
                    while (true) {
                        var5_15 = var11_20;
                        var6_16 = var4_7;
                        if (var10_19 >= var17_6) break;
                        var20_3 = (ra)this.a.get(var10_19);
                        if (var20_3.d.ah != 8) {
                            var5_15 = var4_7;
                            if (var10_19 > 0) {
                                var5_15 = var4_7;
                                if (var10_19 >= var12_8) {
                                    var5_15 = var4_7 + var20_3.h.e;
                                }
                            }
                            var4_7 = var5_15 += var20_3.e.f;
                            if (var10_19 < var16_9) {
                                var4_7 = var5_15;
                                if (var10_19 < var13_10) {
                                    var4_7 = var5_15 + -var20_3.i.e;
                                }
                            }
                        }
                        ++var10_19;
                    }
                }
                if (this.b == 2 && var8_11 == 0) {
                    this.b = 0;
                    var8_11 = var6_16;
                    var4_7 = var9_18;
                } else {
                    var8_11 = var6_16;
                    var4_7 = var9_18;
                }
            } else {
                var8_11 = var6_16;
            }
            if (var8_11 > var18_5) {
                this.b = 2;
            }
            var6_16 = var5_15;
            if (var7_17 > 0) {
                var6_16 = var5_15;
                if (var5_15 == 0) {
                    if (var12_8 == var13_10) {
                        this.b = 2;
                    }
                    var6_16 = 0;
                }
            }
            if ((var5_15 = this.b) == 1) {
                var5_15 = var7_17 > 1 ? (var18_5 - var8_11) / (var7_17 - 1) : (var7_17 == 1 ? (var18_5 - var8_11) / 2 : 0);
                var7_17 = var5_15;
                if (var6_16 > 0) {
                    var7_17 = 0;
                }
                var6_16 = var4_7;
                for (var5_15 = 0; var5_15 < var17_6; ++var5_15) {
                    var4_7 = var19_4 != false ? var17_6 - (var5_15 + 1) : var5_15;
                    var21_1 /* !! */  = (ra)this.a.get(var4_7);
                    if (var21_1 /* !! */ .d.ah == 8) {
                        var21_1 /* !! */ .h.c(var6_16);
                        var21_1 /* !! */ .i.c(var6_16);
                        var4_7 = var6_16;
                    } else {
                        var4_7 = var6_16;
                        if (var5_15 > 0) {
                            var4_7 = var19_4 != false ? var6_16 - var7_17 : var6_16 + var7_17;
                        }
                        var6_16 = var4_7;
                        if (var5_15 > 0) {
                            var6_16 = var4_7;
                            if (var5_15 >= var12_8) {
                                var6_16 = var19_4 != false ? var4_7 - var21_1 /* !! */ .h.e : var4_7 + var21_1 /* !! */ .h.e;
                            }
                        }
                        if (var19_4) {
                            var21_1 /* !! */ .i.c(var6_16);
                        } else {
                            var21_1 /* !! */ .h.c(var6_16);
                        }
                        var20_3 = var21_1 /* !! */ .e;
                        var4_7 = var8_11 = var20_3.f;
                        if (var21_1 /* !! */ .j == 3) {
                            var4_7 = var8_11;
                            if (var21_1 /* !! */ .c == 1) {
                                var4_7 = var20_3.m;
                            }
                        }
                        var6_16 = var19_4 ? (var6_16 -= var4_7) : (var6_16 += var4_7);
                        if (var19_4) {
                            var21_1 /* !! */ .h.c(var6_16);
                        } else {
                            var21_1 /* !! */ .i.c(var6_16);
                        }
                        var21_1 /* !! */ .g = true;
                        var4_7 = var6_16;
                        if (var5_15 < var16_9) {
                            var4_7 = var6_16;
                            if (var5_15 < var13_10) {
                                var4_7 = var19_4 != false ? var6_16 - -var21_1 /* !! */ .i.e : var6_16 + -var21_1 /* !! */ .i.e;
                            }
                        }
                    }
                    var6_16 = var4_7;
                }
            } else if (var5_15 == 0) {
                var7_17 = (var18_5 - var8_11) / (var7_17 + 1);
                if (var6_16 > 0) {
                    var7_17 = 0;
                }
                for (var5_15 = 0; var5_15 < var17_6; ++var5_15) {
                    var6_16 = var19_4 != false ? var17_6 - (var5_15 + 1) : var5_15;
                    var21_1 /* !! */  = (ra)this.a.get(var6_16);
                    if (var21_1 /* !! */ .d.ah == 8) {
                        var21_1 /* !! */ .h.c(var4_7);
                        var21_1 /* !! */ .i.c(var4_7);
                        continue;
                    }
                    var6_16 = var19_4 != false ? var4_7 - var7_17 : var4_7 + var7_17;
                    var4_7 = var6_16;
                    if (var5_15 > 0) {
                        var4_7 = var6_16;
                        if (var5_15 >= var12_8) {
                            var4_7 = var19_4 != false ? var6_16 - var21_1 /* !! */ .h.e : var6_16 + var21_1 /* !! */ .h.e;
                        }
                    }
                    if (var19_4) {
                        var21_1 /* !! */ .i.c(var4_7);
                    } else {
                        var21_1 /* !! */ .h.c(var4_7);
                    }
                    var20_3 = var21_1 /* !! */ .e;
                    var6_16 = var8_11 = var20_3.f;
                    if (var21_1 /* !! */ .j == 3) {
                        var6_16 = var8_11;
                        if (var21_1 /* !! */ .c == 1) {
                            var6_16 = Math.min(var8_11, var20_3.m);
                        }
                    }
                    var6_16 = var19_4 != false ? var4_7 - var6_16 : var4_7 + var6_16;
                    if (var19_4) {
                        var21_1 /* !! */ .h.c(var6_16);
                    } else {
                        var21_1 /* !! */ .i.c(var6_16);
                    }
                    var4_7 = var6_16;
                    if (var5_15 >= var16_9) continue;
                    var4_7 = var6_16;
                    if (var5_15 >= var13_10) continue;
                    var4_7 = var19_4 != false ? var6_16 - -var21_1 /* !! */ .i.e : var6_16 + -var21_1 /* !! */ .i.e;
                }
            } else if (var5_15 == 2) {
                var1_12 = this.f == 0 ? this.d.ae : this.d.af;
                var2_13 = var1_12;
                if (var19_4) {
                    var2_13 = 1.0f - var1_12;
                }
                if ((var5_15 = (int)((float)(var18_5 - var8_11) * var2_13 + 0.5f)) < 0 || var6_16 > 0) {
                    var5_15 = 0;
                }
                var4_7 = var19_4 ? (var4_7 -= var5_15) : (var4_7 += var5_15);
                var5_15 = 0;
                while (var5_15 < var17_6) {
                    var7_17 = var5_15 + 1;
                    var6_16 = var19_4 != false ? var17_6 - var7_17 : var5_15;
                    var20_3 = (ra)this.a.get(var6_16);
                    if (var20_3.d.ah == 8) {
                        var20_3.h.c(var4_7);
                        var20_3.i.c(var4_7);
                    } else {
                        var6_16 = var4_7;
                        if (var5_15 > 0) {
                            var6_16 = var4_7;
                            if (var5_15 >= var12_8) {
                                var6_16 = var19_4 != false ? var4_7 - var20_3.h.e : var4_7 + var20_3.h.e;
                            }
                        }
                        if (var19_4) {
                            var20_3.i.c(var6_16);
                        } else {
                            var20_3.h.c(var6_16);
                        }
                        var21_1 /* !! */  = var20_3.e;
                        var4_7 = var21_1 /* !! */ .f;
                        if (var20_3.j == 3 && var20_3.c == 1) {
                            var4_7 = var21_1 /* !! */ .m;
                        }
                        var6_16 = var19_4 ? (var6_16 -= var4_7) : (var6_16 += var4_7);
                        if (var19_4) {
                            var20_3.h.c(var6_16);
                        } else {
                            var20_3.i.c(var6_16);
                        }
                        var4_7 = var6_16;
                        if (var5_15 < var16_9) {
                            var4_7 = var6_16;
                            if (var5_15 < var13_10) {
                                var4_7 = var19_4 != false ? var6_16 - -var20_3.i.e : var6_16 + -var20_3.i.e;
                            }
                        }
                    }
                    var5_15 = var7_17;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ChainRun ");
        Object object = this.f == 0 ? "horizontal : " : "vertical : ";
        stringBuilder.append((String)object);
        ArrayList arrayList = this.a;
        int n2 = arrayList.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            object = (ra)arrayList.get(i2);
            stringBuilder.append("<");
            stringBuilder.append(object);
            stringBuilder.append("> ");
        }
        return stringBuilder.toString();
    }
}

