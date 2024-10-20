/*
 * Decompiled with CFR 0.152.
 */
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public final class qh
extends qn {
    public final qr a;
    public WeakReference aA = null;
    public WeakReference aB = null;
    public WeakReference aC = null;
    public WeakReference aD = null;
    final HashSet aE;
    public final qo aF;
    public rg aG = null;
    public final bmu aH = new bmu(this);
    public int ar;
    public int as;
    public int at = 0;
    public int au = 0;
    public qe[] av;
    public qe[] aw;
    public int ax = 257;
    public boolean ay = false;
    public boolean az = false;
    public int b;
    public boolean c = false;
    public final px d;

    public qh() {
        this.a = new qr(this);
        this.d = new px();
        this.av = new qe[4];
        this.aw = new qe[4];
        this.aE = new HashSet();
        this.aF = new qo();
    }

    public static void X(qg qg2, rg rg2, qo qo2) {
        if (rg2 == null) {
            return;
        }
        if (qg2.ah != 8 && !(qg2 instanceof qj) && !(qg2 instanceof qd)) {
            qo2.i = qg2.M();
            qo2.j = qg2.N();
            qo2.a = qg2.j();
            qo2.b = qg2.h();
            qo2.g = false;
            qo2.h = 0;
            int n2 = qo2.i == 3 ? 1 : 0;
            int n3 = qo2.j == 3 ? 1 : 0;
            boolean bl2 = n2 != 0 && qg2.X > 0.0f;
            boolean bl3 = n3 != 0 && qg2.X > 0.0f;
            int n4 = n2;
            if (n2 != 0) {
                n4 = n2;
                if (qg2.F(0)) {
                    n4 = n2;
                    if (qg2.s == 0) {
                        n4 = n2;
                        if (!bl2) {
                            qo2.i = 2;
                            if (n3 != 0 && qg2.t == 0) {
                                qo2.i = 1;
                            }
                            n4 = 0;
                        }
                    }
                }
            }
            n2 = n3;
            if (n3 != 0) {
                n2 = n3;
                if (qg2.F(1)) {
                    n2 = n3;
                    if (qg2.t == 0) {
                        n2 = n3;
                        if (!bl3) {
                            qo2.j = 2;
                            if (n4 != 0 && qg2.s == 0) {
                                qo2.j = 1;
                            }
                            n2 = 0;
                        }
                    }
                }
            }
            if (qg2.e()) {
                qo2.i = 1;
                n4 = 0;
            }
            if (qg2.f()) {
                qo2.j = 1;
                n2 = 0;
            }
            if (bl2) {
                if (qg2.u[0] == 4) {
                    qo2.i = 1;
                } else if (n2 == 0) {
                    if (qo2.j == 1) {
                        n2 = qo2.b;
                    } else {
                        qo2.i = 2;
                        rg2.a(qg2, qo2);
                        n2 = qo2.d;
                    }
                    qo2.i = 1;
                    qo2.a = (int)(qg2.X * (float)n2);
                }
            }
            if (bl3) {
                if (qg2.u[1] == 4) {
                    qo2.j = 1;
                } else if (n4 == 0) {
                    if (qo2.i == 1) {
                        n2 = qo2.a;
                    } else {
                        qo2.j = 2;
                        rg2.a(qg2, qo2);
                        n2 = qo2.c;
                    }
                    qo2.j = 1;
                    n3 = qg2.Y;
                    float f2 = n2;
                    qo2.b = n3 == -1 ? (int)(f2 / qg2.X) : (int)(qg2.X * f2);
                }
            }
            rg2.a(qg2, qo2);
            qg2.C(qo2.c);
            qg2.x(qo2.d);
            qg2.F = qo2.f;
            qg2.u(qo2.e);
            qo2.h = 0;
            boolean bl4 = qo2.g;
            return;
        }
        qo2.c = 0;
        qo2.d = 0;
    }

    private final void Z(qf qf2, qb qb2) {
        px px2 = this.d;
        px2.g(qb2, px2.b(qf2), 0, 5);
    }

    private final void aa(qf qf2, qb qb2) {
        px px2 = this.d;
        px2.g(px2.b(qf2), qb2, 0, 5);
    }

    private final void ab() {
        this.at = 0;
        this.au = 0;
    }

    @Override
    public final void D(boolean bl2, boolean bl3) {
        super.D(bl2, bl3);
        int n2 = this.aI.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            ((qg)this.aI.get(i2)).D(bl2, bl3);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final void T() {
        block218: {
            block219: {
                block234: {
                    block229: {
                        this.Z = 0;
                        this.aa = 0;
                        this.ay = false;
                        this.az = false;
                        var3_1 = this.aI.size();
                        var5_2 = Math.max(0, this.j());
                        var2_3 = Math.max(0, this.h());
                        var17_4 = this.aq;
                        var6_6 = var17_4[1];
                        var4_7 = var17_4[0];
                        if (this.b != 0 || !ql.b(this.ax, 1)) break block229;
                        var18_8 = this.aG;
                        var7_15 = this.M();
                        var12_16 = this.N();
                        qu.b = 0;
                        qu.c = 0;
                        this.t();
                        var17_4 = this.aI;
                        var11_17 /* !! */  = var17_4.size();
                        for (var1_18 = 0; var1_18 < var11_17 /* !! */ ; ++var1_18) {
                            ((qg)var17_4.get(var1_18)).t();
                        }
                        var15_19 = this.c;
                        if (var7_15 == 1) {
                            this.v(0, this.j());
                        } else {
                            this.J.e(0);
                            this.Z = 0;
                        }
                        var1_18 = var8_20 = 0;
                        for (var7_15 = 0; var7_15 < var11_17 /* !! */ ; ++var7_15) {
                            block216: {
                                block230: {
                                    block231: {
                                        var19_23 = (qg)var17_4.get(var7_15);
                                        if (!(var19_23 instanceof qj)) break block230;
                                        var19_23 = (qj)var19_23;
                                        var9_21 = var8_20;
                                        var10_22 /* !! */  = var1_18;
                                        if (var19_23.ar != 1) break block216;
                                        var8_20 = var19_23.b;
                                        if (var8_20 != -1) {
                                            var19_23.a(var8_20);
lbl40:
                                            // 4 sources

                                            while (true) {
                                                var9_21 = 1;
                                                var10_22 /* !! */  = var1_18;
                                                break block216;
                                                break;
                                            }
                                        }
                                        if (var19_23.c == -1 || !this.e()) break block231;
                                        var19_23.a(this.j() - var19_23.c);
                                        ** GOTO lbl40
                                    }
                                    if (!this.e()) ** GOTO lbl40
                                    var19_23.a((int)(var19_23.a * (float)this.j() + 0.5f));
                                    ** continue;
                                }
                                var9_21 = var8_20;
                                var10_22 /* !! */  = var1_18;
                                if (var19_23 instanceof qd) {
                                    var9_21 = var8_20;
                                    var10_22 /* !! */  = var1_18;
                                    if (((qd)var19_23).a() == 0) {
                                        var10_22 /* !! */  = 1;
                                        var9_21 = var8_20;
                                    }
                                }
                            }
                            var8_20 = var9_21;
                            var1_18 = var10_22 /* !! */ ;
                        }
                        if (var8_20 != 0) {
                            for (var7_15 = 0; var7_15 < var11_17 /* !! */ ; ++var7_15) {
                                var19_23 = (qg)var17_4.get(var7_15);
                                if (!(var19_23 instanceof qj)) continue;
                                var19_23 = (qj)var19_23;
                                if (var19_23.ar != 1) continue;
                                qu.a(0, (qg)var19_23, (rg)var18_8, var15_19);
                            }
                        }
                        var7_15 = 0;
                        qu.a(0, this, (rg)var18_8, var15_19);
                        if (var1_18 != 0) {
                            for (var1_18 = 0; var1_18 < var11_17 /* !! */ ; ++var1_18) {
                                var19_23 = (qg)var17_4.get(var1_18);
                                if (!(var19_23 instanceof qd) || (var19_23 = (qd)var19_23).a() != 0) continue;
                                qu.d((qd)var19_23, (rg)var18_8, 0, var15_19);
                            }
                        }
                        if (var12_16 == 1) {
                            this.w(0, this.h());
                            var8_20 = 0;
                            var1_18 = 0;
                        } else {
                            this.K.e(0);
                            this.aa = 0;
                            var8_20 = 0;
                            var1_18 = 0;
                            var7_15 = 0;
                        }
                        while (var7_15 < var11_17 /* !! */ ) {
                            block217: {
                                block232: {
                                    block233: {
                                        var19_23 = (qg)var17_4.get(var7_15);
                                        if (!(var19_23 instanceof qj)) break block232;
                                        var19_23 = (qj)var19_23;
                                        var9_21 = var8_20;
                                        var10_22 /* !! */  = var1_18;
                                        if (var19_23.ar != 0) break block217;
                                        var8_20 = var19_23.b;
                                        if (var8_20 != -1) {
                                            var19_23.a(var8_20);
lbl100:
                                            // 4 sources

                                            while (true) {
                                                var9_21 = 1;
                                                var10_22 /* !! */  = var1_18;
                                                break block217;
                                                break;
                                            }
                                        }
                                        if (var19_23.c == -1 || !this.f()) break block233;
                                        var19_23.a(this.h() - var19_23.c);
                                        ** GOTO lbl100
                                    }
                                    if (!this.f()) ** GOTO lbl100
                                    var19_23.a((int)(var19_23.a * (float)this.h() + 0.5f));
                                    ** continue;
                                }
                                var9_21 = var8_20;
                                var10_22 /* !! */  = var1_18;
                                if (var19_23 instanceof qd) {
                                    var9_21 = var8_20;
                                    var10_22 /* !! */  = var1_18;
                                    if (((qd)var19_23).a() == 1) {
                                        var10_22 /* !! */  = 1;
                                        var9_21 = var8_20;
                                    }
                                }
                            }
                            ++var7_15;
                            var8_20 = var9_21;
                            var1_18 = var10_22 /* !! */ ;
                        }
                        if (var8_20 != 0) {
                            for (var7_15 = 0; var7_15 < var11_17 /* !! */ ; ++var7_15) {
                                var19_23 = (qg)var17_4.get(var7_15);
                                if (!(var19_23 instanceof qj)) continue;
                                var19_23 = (qj)var19_23;
                                if (var19_23.ar != 0) continue;
                                qu.b(1, (qg)var19_23, (rg)var18_8);
                            }
                        }
                        qu.b(0, this, (rg)var18_8);
                        if (var1_18 != 0) {
                            for (var1_18 = 0; var1_18 < var11_17 /* !! */ ; ++var1_18) {
                                var19_23 = (qg)var17_4.get(var1_18);
                                if (!(var19_23 instanceof qd) || (var19_23 = (qd)var19_23).a() != 1) continue;
                                qu.d((qd)var19_23, (rg)var18_8, 1, var15_19);
                            }
                        }
                        for (var1_18 = 0; var1_18 < var11_17 /* !! */ ; ++var1_18) {
                            var19_23 = (qg)var17_4.get(var1_18);
                            if (!var19_23.J() || !qu.c(var19_23)) continue;
                            qh.X(var19_23, (rg)var18_8, qu.a);
                            if (var19_23 instanceof qj) {
                                if (((qj)var19_23).ar == 0) {
                                    qu.b(0, var19_23, (rg)var18_8);
                                    continue;
                                }
                                qu.a(0, var19_23, (rg)var18_8, var15_19);
                                continue;
                            }
                            qu.a(0, (qg)var19_23, (rg)var18_8, var15_19);
                            qu.b(0, var19_23, (rg)var18_8);
                        }
                        for (var1_18 = 0; var1_18 < var3_1; ++var1_18) {
                            var18_8 = (qg)this.aI.get(var1_18);
                            if (!var18_8.J() || var18_8 instanceof qj || var18_8 instanceof qd || var18_8 instanceof qm) continue;
                            var15_19 = var18_8.G;
                            var8_20 = var18_8.L(0);
                            var7_15 = var18_8.L(1);
                            if (var8_20 == 3 && var18_8.s != 1 && var7_15 == 3 && var18_8.t != 1) continue;
                            var17_4 = new qo();
                            qh.X((qg)var18_8, this.aG, (qo)var17_4);
                        }
                    }
                    var7_15 = var6_6;
                    if (var3_1 <= 2) break block234;
                    var1_18 = var6_6;
                    if (var4_7 != 2) {
                        var1_18 = var6_6;
                        if (var6_6 == 2) {
                            var1_18 = 2;
                        } else {
                            while (true) {
                                var7_15 = var1_18;
                                var1_18 = 0;
                                var6_6 = var4_7;
                                var8_20 = var3_1;
                                break block218;
                                break;
                            }
                        }
                    }
                    var7_15 = var1_18;
                    if (!ql.b(this.ax, 1024)) break block234;
                    var29_26 = this.aG;
                    var28_25 = this.aI;
                    var7_15 = var28_25.size();
                    for (var6_6 = 0; var6_6 < var7_15; ++var6_6) {
                        var17_4 = (qg)var28_25.get(var6_6);
                        if (!ki.j(this.M(), this.N(), var17_4.M(), var17_4.N()) || var17_4 instanceof qi) ** continue;
                    }
                    var23_27 = null;
                    var17_4 = null;
                    var19_23 = null;
                    var18_8 = null;
                    var21_28 = null;
                    var20_29 = null;
                    var8_20 = var3_1;
                    var3_1 = var1_18;
                    var1_18 = var2_3;
                    var2_3 = var5_2;
                    for (var6_6 = 0; var6_6 < var7_15; ++var6_6) {
                        var30_35 = (qg)var28_25.get(var6_6);
                        if (!ki.j(this.M(), this.N(), var30_35.M(), var30_35.N())) {
                            qh.X(var30_35, var29_26, this.aF);
                        }
                        var15_19 = var30_35 instanceof qj;
                        var25_32 = var23_27;
                        var24_31 = var19_23;
                        if (var15_19) {
                            var26_33 = (qj)var30_35;
                            var22_30 = var19_23;
                            if (var26_33.ar == 0) {
                                var22_30 = var19_23;
                                if (var19_23 == null) {
                                    var22_30 = new ArrayList<qj>();
                                }
                                var22_30.add(var26_33);
                            }
                            var25_32 = var23_27;
                            var24_31 = var22_30;
                            if (var26_33.ar == 1) {
                                var19_23 = var23_27;
                                if (var23_27 == null) {
                                    var19_23 = new ArrayList<E>();
                                }
                                var19_23.add(var26_33);
                                var24_31 = var22_30;
                                var25_32 = var19_23;
                            }
                        }
                        var19_23 = var17_4;
                        var22_30 = var18_8;
                        if (var30_35 instanceof qk) {
                            if (var30_35 instanceof qd) {
                                var26_33 = (qd)var30_35;
                                var23_27 = var17_4;
                                if (var26_33.a() == 0) {
                                    var23_27 = var17_4;
                                    if (var17_4 == null) {
                                        var23_27 = new ArrayList<Object>();
                                    }
                                    var23_27.add(var26_33);
                                }
                                var19_23 = var23_27;
                                var22_30 = var18_8;
                                if (var26_33.a() == 1) {
                                    var22_30 = var18_8;
                                    if (var18_8 == null) {
                                        var22_30 = new ArrayList<E>();
                                    }
                                    var22_30.add(var26_33);
                                    var19_23 = var23_27;
                                }
                            } else {
                                var23_27 = (qk)var30_35;
                                var19_23 = var17_4;
                                if (var17_4 == null) {
                                    var19_23 = new ArrayList<Object>();
                                }
                                var19_23.add(var23_27);
                                var22_30 = var18_8;
                                if (var18_8 == null) {
                                    var22_30 = new ArrayList<ArrayList<Object>>();
                                }
                                var22_30.add(var23_27);
                            }
                        }
                        var26_33 = var21_28;
                        if (var30_35.J.e == null) {
                            var26_33 = var21_28;
                            if (var30_35.L.e == null) {
                                var26_33 = var21_28;
                                if (!var15_19) {
                                    var26_33 = var21_28;
                                    if (!(var30_35 instanceof qd)) {
                                        var17_4 = var21_28;
                                        if (var21_28 == null) {
                                            var17_4 = new ArrayList<E>();
                                        }
                                        var17_4.add(var30_35);
                                        var26_33 = var17_4;
                                    }
                                }
                            }
                        }
                        var27_34 = var20_29;
                        if (var30_35.K.e == null) {
                            var27_34 = var20_29;
                            if (var30_35.M.e == null) {
                                var27_34 = var20_29;
                                if (var30_35.N.e == null) {
                                    var27_34 = var20_29;
                                    if (!var15_19) {
                                        var27_34 = var20_29;
                                        if (!(var30_35 instanceof qd)) {
                                            var17_4 = var20_29;
                                            if (var20_29 == null) {
                                                var17_4 = new ArrayList<E>();
                                            }
                                            var17_4.add(var30_35);
                                            var27_34 = var17_4;
                                        }
                                    }
                                }
                            }
                        }
                        var23_27 = var25_32;
                        var17_4 = var19_23;
                        var19_23 = var24_31;
                        var18_8 = var22_30;
                        var21_28 = var26_33;
                        var20_29 = var27_34;
                    }
                    var22_30 = new ArrayList<E>();
                    if (var23_27 != null) {
                        var6_6 = var23_27.size();
                        for (var5_2 = 0; var5_2 < var6_6; ++var5_2) {
                            ki.h((qj)var23_27.get(var5_2), 0, var22_30, null);
                        }
                    }
                    if (var17_4 != null) {
                        var6_6 = var17_4.size();
                        for (var5_2 = 0; var5_2 < var6_6; ++var5_2) {
                            var24_31 = (qk)var17_4.get(var5_2);
                            var23_27 = ki.h((qg)var24_31, 0, var22_30, null);
                            var24_31.T((ArrayList)var22_30, 0, (qz)var23_27);
                            var23_27.b((ArrayList)var22_30);
                        }
                    }
                    if ((var17_4 = this.K((int)2).a) != null) {
                        var17_4 = var17_4.iterator();
                        while (var17_4.hasNext()) {
                            ki.h(((qf)var17_4.next()).d, 0, var22_30, null);
                        }
                    }
                    if ((var17_4 = this.K((int)4).a) != null) {
                        var17_4 = var17_4.iterator();
                        while (var17_4.hasNext()) {
                            ki.h(((qf)var17_4.next()).d, 0, (ArrayList)var22_30, null);
                        }
                    }
                    if ((var17_4 = this.K((int)7).a) != null) {
                        var17_4 = var17_4.iterator();
                        while (var17_4.hasNext()) {
                            ki.h(((qf)var17_4.next()).d, 0, var22_30, null);
                        }
                    }
                    if (var21_28 != null) {
                        var6_6 = var21_28.size();
                        for (var5_2 = 0; var5_2 < var6_6; ++var5_2) {
                            ki.h((qg)var21_28.get(var5_2), 0, var22_30, null);
                        }
                    }
                    if (var19_23 != null) {
                        var6_6 = var19_23.size();
                        for (var5_2 = 0; var5_2 < var6_6; ++var5_2) {
                            ki.h((qj)var19_23.get(var5_2), 1, (ArrayList)var22_30, null);
                        }
                    }
                    if (var18_8 != null) {
                        var6_6 = var18_8.size();
                        for (var5_2 = 0; var5_2 < var6_6; ++var5_2) {
                            var19_23 = (qk)var18_8.get(var5_2);
                            var17_4 = ki.h((qg)var19_23, 1, var22_30, null);
                            var19_23.T((ArrayList)var22_30, 1, (qz)var17_4);
                            var17_4.b((ArrayList)var22_30);
                        }
                    }
                    if ((var17_4 = this.K((int)3).a) != null) {
                        var17_4 = var17_4.iterator();
                        while (var17_4.hasNext()) {
                            ki.h(((qf)var17_4.next()).d, 1, var22_30, null);
                        }
                    }
                    if ((var17_4 = this.K((int)6).a) != null) {
                        var17_4 = var17_4.iterator();
                        while (var17_4.hasNext()) {
                            ki.h(((qf)var17_4.next()).d, 1, var22_30, null);
                        }
                    }
                    if ((var17_4 = this.K((int)5).a) != null) {
                        var17_4 = var17_4.iterator();
                        while (var17_4.hasNext()) {
                            ki.h(((qf)var17_4.next()).d, 1, var22_30, null);
                        }
                    }
                    if ((var17_4 = this.K((int)7).a) != null) {
                        var17_4 = var17_4.iterator();
                        while (var17_4.hasNext()) {
                            ki.h(((qf)var17_4.next()).d, 1, var22_30, null);
                        }
                    }
                    if (var20_29 != null) {
                        var6_6 = var20_29.size();
                        for (var5_2 = 0; var5_2 < var6_6; ++var5_2) {
                            ki.h((qg)var20_29.get(var5_2), 1, var22_30, null);
                        }
                    }
                    for (var5_2 = 0; var5_2 < var7_15; ++var5_2) {
                        var17_4 = (qg)var28_25.get(var5_2);
                        var18_8 = var17_4.aq;
                        if (var18_8[0] != 3 || var18_8[1] != 3) continue;
                        var18_8 = ki.i(var22_30, var17_4.ao);
                        var17_4 = ki.i(var22_30, var17_4.ap);
                        if (var18_8 == null || var17_4 == null) continue;
                        var18_8.c(0, (qz)var17_4);
                        var17_4.d = 2;
                        var22_30.remove(var18_8);
                    }
                    if (var22_30.size() <= 1) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var5_2 = var2_3;
                            var2_3 = var1_18;
                            var6_6 = var4_7;
                            var7_15 = var3_1;
                            break block219;
                            break;
                        }
                    }
                    if (this.M() != 2) ** GOTO lbl-1000
                    var10_22 /* !! */  = var22_30.size();
                    var17_4 = null;
                    var6_6 = 0;
                    for (var5_2 = 0; var5_2 < var10_22 /* !! */ ; ++var5_2) {
                        var19_23 = (qz)var22_30.get(var5_2);
                        var18_8 = var17_4;
                        var7_15 = var6_6;
                        if (var19_23.d != 1) {
                            var9_21 = var19_23.a(this.d, 0);
                            if (var9_21 > var6_6) {
                                var17_4 = var19_23;
                            }
                            var18_8 = var17_4;
                            var7_15 = var6_6;
                            if (var9_21 > var6_6) {
                                var7_15 = var9_21;
                                var18_8 = var17_4;
                            }
                        }
                        var17_4 = var18_8;
                        var6_6 = var7_15;
                    }
                    if (var17_4 != null) {
                        this.P(1);
                        this.C(var6_6);
                        var18_8 = var17_4;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var18_8 = null;
                    }
                    if (this.N() != 2) ** GOTO lbl-1000
                    var10_22 /* !! */  = var22_30.size();
                    var17_4 = null;
                    var5_2 = 0;
                    for (var7_15 = 0; var7_15 < var10_22 /* !! */ ; ++var7_15) {
                        var20_29 = (qz)var22_30.get(var7_15);
                        var19_23 = var17_4;
                        var6_6 = var5_2;
                        if (var20_29.d != 0) {
                            var9_21 = var20_29.a(this.d, 1);
                            if (var9_21 > var5_2) {
                                var17_4 = var20_29;
                            }
                            var19_23 = var17_4;
                            var6_6 = var5_2;
                            if (var9_21 > var5_2) {
                                var6_6 = var9_21;
                                var19_23 = var17_4;
                            }
                        }
                        var17_4 = var19_23;
                        var5_2 = var6_6;
                    }
                    if (var17_4 != null) {
                        this.Q(1);
                        this.x(var5_2);
                    } else lbl-1000:
                    // 2 sources

                    {
                        var17_4 = null;
                    }
                    ** while (var18_8 == null && var17_4 == null)
lbl447:
                    // 1 sources

                    if (var4_7 == 2) {
                        if (var2_3 < this.j() && var2_3 > 0) {
                            this.C(var2_3);
                            this.ay = true;
                            var4_7 = var2_3;
                        } else {
                            var4_7 = this.j();
                        }
                        var2_3 = 2;
                    } else {
                        var5_2 = var2_3;
                        var2_3 = var4_7;
                        var4_7 = var5_2;
                    }
                    if (var3_1 == 2) {
                        if (var1_18 < this.h() && var1_18 > 0) {
                            this.x(var1_18);
                            this.az = true;
                            var3_1 = var1_18;
                        } else {
                            var3_1 = this.h();
                        }
                        var1_18 = 2;
                    } else {
                        var5_2 = var1_18;
                        var1_18 = var3_1;
                        var3_1 = var5_2;
                    }
                    var6_6 = var2_3;
                    var7_15 = var1_18;
                    var1_18 = 1;
                    var5_2 = var4_7;
                    var2_3 = var3_1;
                    break block218;
                }
                var8_20 = var3_1;
                var6_6 = var4_7;
            }
            var1_18 = 0;
        }
        var3_1 = !this.W(64) && !this.W(128) ? 0 : 1;
        var17_4 = this.d;
        var17_4.f = false;
        var17_4.g = false;
        if (this.ax != 0 && var3_1 != 0) {
            var17_4.g = true;
        }
        var17_4 = this.aI;
        var13_36 = this.M() == 2 || this.N() == 2;
        this.ab();
        for (var3_1 = 0; var3_1 < var8_20; ++var3_1) {
            var18_8 = (qg)this.aI.get(var3_1);
            if (!(var18_8 instanceof qn)) continue;
            ((qn)var18_8).T();
        }
        var4_7 = 1;
        var9_21 = 0;
        var3_1 = var1_18;
        var1_18 = var9_21;
        while (var4_7 != 0) {
            block228: {
                block220: {
                    ++var1_18;
                    this.d.k();
                    this.ab();
                    this.q(this.d);
                    for (var4_7 = 0; var4_7 < var8_20; ++var4_7) {
                        ((qg)this.aI.get(var4_7)).q(this.d);
                        continue;
                    }
                    var20_29 = this.d;
                    var15_19 = this.W(64);
                    this.b((px)var20_29, var15_19);
                    var12_16 = this.aI.size();
                    var10_22 /* !! */  = 0;
                    for (var11_17 /* !! */  = 0; var11_17 /* !! */  < var12_16; ++var11_17 /* !! */ ) {
                        try {
                            var19_23 = (qg)this.aI.get(var11_17 /* !! */ );
                            var19_23.y(0, false);
                            var9_21 = var2_3;
                            var18_8 = var17_4;
                            var4_7 = var1_18;
                        }
                        catch (Exception var19_24) {
                            var4_7 = var1_18;
                            var18_8 = var17_4;
                            var17_4 = var19_24;
lbl528:
                            // 2 sources

                            while (true) {
                                var19_23 = var18_8;
                                var1_18 = var4_7;
                                var18_8 = var17_4;
                                var17_4 = var19_23;
                                break block220;
                                break;
                            }
                        }
                        var19_23.y(1, false);
                        var9_21 = var2_3;
                        var18_8 = var17_4;
                        var4_7 = var1_18;
                        var10_22 /* !! */  |= var19_23 instanceof qd;
                        continue;
                    }
                    if (var10_22 /* !! */  != 0) {
                        block98: for (var10_22 /* !! */  = 0; var10_22 /* !! */  < var12_16; ++var10_22 /* !! */ ) {
                            var9_21 = var2_3;
                            var18_8 = var17_4;
                            var4_7 = var1_18;
                            var19_23 = (qg)this.aI.get(var10_22 /* !! */ );
                            var9_21 = var2_3;
                            var18_8 = var17_4;
                            var4_7 = var1_18;
                            if (!(var19_23 instanceof qd)) continue;
                            var9_21 = var2_3;
                            var18_8 = var17_4;
                            var4_7 = var1_18;
                            var19_23 = (qd)var19_23;
                            var11_17 /* !! */  = 0;
                            while (true) {
                                block222: {
                                    block223: {
                                        block221: {
                                            var9_21 = var2_3;
                                            var18_8 = var17_4;
                                            var4_7 = var1_18;
                                            if (var11_17 /* !! */  >= var19_23.as) continue block98;
                                            var9_21 = var2_3;
                                            var18_8 = var17_4;
                                            var4_7 = var1_18;
                                            var21_28 = var19_23.ar[var11_17 /* !! */ ];
                                            var9_21 = var2_3;
                                            var18_8 = var17_4;
                                            var4_7 = var1_18;
                                            if (var19_23.b) break block221;
                                            var9_21 = var2_3;
                                            var18_8 = var17_4;
                                            var4_7 = var1_18;
                                            if (!var21_28.d()) break block222;
                                        }
                                        var9_21 = var2_3;
                                        var18_8 = var17_4;
                                        var4_7 = var1_18;
                                        var14_37 = var19_23.a;
                                        if (var14_37 == 0 || var14_37 == 1) break block223;
                                        if (var14_37 != 2 && var14_37 != 3) break block222;
                                        try {
                                            var21_28.y(1, true);
                                            break block222;
                                        }
                                        catch (Exception var18_9) {
                                            break block220;
                                        }
                                    }
                                    var9_21 = var2_3;
                                    var18_8 = var17_4;
                                    var4_7 = var1_18;
                                    var21_28.y(0, true);
                                }
                                ++var11_17 /* !! */ ;
                            }
                        }
                    }
                    var9_21 = var2_3;
                    var18_8 = var17_4;
                    var4_7 = var1_18;
                    try {
                        this.aE.clear();
                        var4_7 = 0;
                    }
                    catch (Exception var17_5) {
                        var2_3 = var9_21;
                        ** continue;
                    }
                    while (true) {
                        block226: {
                            block225: {
                                if (var4_7 < var12_16) break block235;
                                while (true) {
                                    var9_21 = var2_3;
                                    var18_8 = var17_4;
                                    var4_7 = var1_18;
                                    if (this.aE.size() <= 0) break;
                                    var9_21 = var2_3;
                                    var18_8 = var17_4;
                                    var4_7 = var1_18;
                                    var11_17 /* !! */  = this.aE.size();
                                    var9_21 = var2_3;
                                    var18_8 = var17_4;
                                    var4_7 = var1_18;
                                    var19_23 = this.aE.iterator();
                                    block102: while (true) {
                                        var9_21 = var2_3;
                                        var18_8 = var17_4;
                                        var4_7 = var1_18;
                                        if (!var19_23.hasNext()) break;
                                        var9_21 = var2_3;
                                        var18_8 = var17_4;
                                        var4_7 = var1_18;
                                        var22_30 = (qm)((qg)var19_23.next());
                                        var9_21 = var2_3;
                                        var18_8 = var17_4;
                                        var4_7 = var1_18;
                                        var21_28 = this.aE;
                                        var10_22 /* !! */  = 0;
                                        while (true) {
                                            block224: {
                                                var9_21 = var2_3;
                                                var18_8 = var17_4;
                                                var4_7 = var1_18;
                                                if (var10_22 /* !! */  >= var22_30.as) continue block102;
                                                var9_21 = var2_3;
                                                var18_8 = var17_4;
                                                var4_7 = var1_18;
                                                if (!var21_28.contains(var22_30.ar[var10_22 /* !! */ ])) break block224;
                                                var9_21 = var2_3;
                                                var18_8 = var17_4;
                                                var4_7 = var1_18;
                                                var22_30.b((px)var20_29, var15_19);
                                                var9_21 = var2_3;
                                                var18_8 = var17_4;
                                                var4_7 = var1_18;
                                                this.aE.remove(var22_30);
                                                break block102;
                                            }
                                            ++var10_22 /* !! */ ;
                                        }
                                        break;
                                    }
                                    var9_21 = var2_3;
                                    var18_8 = var17_4;
                                    var4_7 = var1_18;
                                    if (var11_17 /* !! */  != this.aE.size()) continue;
                                    var9_21 = var2_3;
                                    var18_8 = var17_4;
                                    var4_7 = var1_18;
                                    var19_23 = this.aE.iterator();
                                    while (true) {
                                        var9_21 = var2_3;
                                        var18_8 = var17_4;
                                        var4_7 = var1_18;
                                        if (!var19_23.hasNext()) break;
                                        var9_21 = var2_3;
                                        var18_8 = var17_4;
                                        var4_7 = var1_18;
                                        ((qg)var19_23.next()).b((px)var20_29, var15_19);
                                        continue;
                                        break;
                                    }
                                    var9_21 = var2_3;
                                    var18_8 = var17_4;
                                    var4_7 = var1_18;
                                    this.aE.clear();
                                    continue;
                                    break;
                                }
                                var9_21 = var2_3;
                                var18_8 = var17_4;
                                var4_7 = var1_18;
                                var16_38 = px.a;
                                if (!var16_38) break block225;
                                var21_28 = new HashSet();
                                for (var10_22 /* !! */  = 0; var10_22 /* !! */  < var12_16; ++var10_22 /* !! */ ) {
                                    var9_21 = var2_3;
                                    var18_8 = var17_4;
                                    var4_7 = var1_18;
                                    var19_23 = (qg)this.aI.get(var10_22 /* !! */ );
                                    var9_21 = var2_3;
                                    var18_8 = var17_4;
                                    var4_7 = var1_18;
                                    if (var19_23.E()) continue;
                                    var9_21 = var2_3;
                                    var18_8 = var17_4;
                                    var4_7 = var1_18;
                                    var21_28.add(var19_23);
                                }
                                var4_7 = this.M();
                                var4_7 = var4_7 == 2 ? 0 : 1;
                                this.p(this, (px)var20_29, (HashSet)var21_28, var4_7, false);
                                var18_8 = var21_28.iterator();
                                while (var18_8.hasNext()) {
                                    var19_23 = (qg)var18_8.next();
                                    ql.a(this, (px)var20_29, (qg)var19_23);
                                    var19_23.b((px)var20_29, var15_19);
                                }
                                break block226;
                                catch (Exception var18_10) {
                                    break block220;
                                }
                            }
                            for (var4_7 = 0; var4_7 < var12_16; ++var4_7) {
                                block227: {
                                    var18_8 = (qg)this.aI.get(var4_7);
                                    if (!(var18_8 instanceof qh)) ** GOTO lbl766
                                    var19_23 = var18_8.aq;
                                    var10_22 /* !! */  = (int)var19_23[0];
                                    var11_17 /* !! */  = (int)var19_23[1];
                                    var9_21 = var10_22 /* !! */ ;
                                    if (var10_22 /* !! */  == 2) {
                                        var18_8.P(1);
                                        var9_21 = 2;
                                    }
                                    var10_22 /* !! */  = var11_17 /* !! */ ;
                                    if (var11_17 /* !! */  == 2) {
                                        var18_8.Q(1);
                                        var10_22 /* !! */  = 2;
                                    }
                                    var18_8.b((px)var20_29, var15_19);
                                    if (var9_21 != 2) break block227;
                                    var18_8.P(2);
                                }
                                if (var10_22 /* !! */  != 2) continue;
                                var18_8.Q(2);
                                continue;
lbl766:
                                // 1 sources

                                ql.a(this, (px)var20_29, (qg)var18_8);
                                if (var18_8.E()) continue;
                                var18_8.b((px)var20_29, var15_19);
                            }
                        }
                        var9_21 = var2_3;
                        var19_23 = var17_4;
                        var10_22 /* !! */  = var1_18;
                        var4_7 = this.at;
                        if (var4_7 <= 0) ** GOTO lbl779
                        kt.e(this, (px)var20_29, null, 0);
lbl779:
                        // 2 sources

                        if ((var4_7 = this.au) <= 0) ** GOTO lbl782
                        kt.e(this, (px)var20_29, null, 1);
lbl782:
                        // 2 sources

                        if ((var18_8 = this.aA) == null) ** GOTO lbl787
                        if (var18_8.get() != null) {
                            this.aa((qf)this.aA.get(), this.d.b(this.K));
                            this.aA = null;
                        }
lbl787:
                        // 4 sources

                        if ((var18_8 = this.aC) == null) ** GOTO lbl792
                        if (var18_8.get() != null) {
                            this.Z((qf)this.aC.get(), this.d.b(this.M));
                            this.aC = null;
                        }
lbl792:
                        // 4 sources

                        if ((var18_8 = this.aB) == null) ** GOTO lbl797
                        if (var18_8.get() != null) {
                            this.aa((qf)this.aB.get(), this.d.b(this.J));
                            this.aB = null;
                        }
lbl797:
                        // 4 sources

                        if ((var18_8 = this.aD) == null) ** GOTO lbl803
                        if (var18_8.get() == null) ** GOTO lbl803
                        this.Z((qf)this.aD.get(), this.d.b(this.L));
                        this.aD = null;
lbl803:
                        // 3 sources

                        this.d.j();
                        var17_4 = var19_23;
                        break block228;
                        break;
                    }
                    catch (Exception var18_13) {
                        break block220;
                    }
                    {
                        block235: {
                            catch (Exception var18_11) {
                                var1_18 = var10_22 /* !! */ ;
                                var17_4 = var19_23;
                                var2_3 = var9_21;
                                break block220;
                            }
                            catch (Exception var18_12) {
                                break block220;
                            }
                        }
                        var18_8 = (qg)this.aI.get(var4_7);
                        if (var18_8.E()) {
                            if (var18_8 instanceof qm) {
                                this.aE.add(var18_8);
                            } else {
                                var18_8.b((px)var20_29, var15_19);
                            }
                        }
                        ++var4_7;
                        continue;
                    }
                    catch (Exception var18_14) {
                        // empty catch block
                    }
                }
                var18_8.printStackTrace();
                var19_23 = System.out;
                var18_8.toString();
                var19_23.println("EXCEPTION : ".concat(var18_8.toString()));
                var9_21 = var2_3;
                var10_22 /* !! */  = var1_18;
            }
            ql.a[2] = false;
            var15_19 = this.W(64);
            this.R(var15_19);
            var11_17 /* !! */  = this.aI.size();
            var1_18 = 0;
            for (var2_3 = 0; var2_3 < var11_17 /* !! */ ; ++var2_3) {
                var18_8 = (qg)this.aI.get(var2_3);
                var18_8.R(var15_19);
                var4_7 = var18_8.k == -1 && var18_8.l == -1 ? 0 : 1;
                var1_18 |= var4_7;
            }
            var4_7 = var1_18;
            var2_3 = var3_1;
            if (var13_36) {
                var4_7 = var1_18;
                var2_3 = var3_1;
                if (var10_22 /* !! */  < 8) {
                    var4_7 = var1_18;
                    var2_3 = var3_1;
                    if (ql.a[2]) {
                        var4_7 = 0;
                        var2_3 = 0;
                        for (var11_17 /* !! */  = 0; var11_17 /* !! */  < var8_20; ++var11_17 /* !! */ ) {
                            var18_8 = (qg)this.aI.get(var11_17 /* !! */ );
                            var4_7 = Math.max(var4_7, var18_8.Z + var18_8.j());
                            var2_3 = Math.max(var2_3, var18_8.aa + var18_8.h());
                        }
                        var4_7 = Math.max(this.ac, var4_7);
                        var14_37 = Math.max(this.ad, var2_3);
                        var12_16 = var1_18;
                        var11_17 /* !! */  = var3_1;
                        if (var6_6 == 2) {
                            var12_16 = var1_18;
                            var11_17 /* !! */  = var3_1;
                            if (this.j() < var4_7) {
                                this.C(var4_7);
                                this.aq[0] = 2;
                                var12_16 = 1;
                                var11_17 /* !! */  = 1;
                            }
                        }
                        var4_7 = var12_16;
                        var2_3 = var11_17 /* !! */ ;
                        if (var7_15 == 2) {
                            var4_7 = var12_16;
                            var2_3 = var11_17 /* !! */ ;
                            if (this.h() < var14_37) {
                                this.x(var14_37);
                                this.aq[1] = 2;
                                var4_7 = 1;
                                var2_3 = 1;
                            }
                        }
                    }
                }
            }
            if ((var1_18 = Math.max(this.ac, this.j())) > this.j()) {
                this.C(var1_18);
                this.aq[0] = 1;
                var1_18 = 1;
                var2_3 = 1;
            } else {
                var1_18 = var4_7;
            }
            var3_1 = Math.max(this.ad, this.h());
            if (var3_1 > this.h()) {
                this.x(var3_1);
                this.aq[1] = 1;
                var1_18 = 1;
                var3_1 = 1;
            } else {
                var3_1 = var2_3;
            }
            if (var3_1 == 0) {
                var18_8 = this.aq;
                var4_7 = var1_18;
                var2_3 = var3_1;
                if (var18_8[0] == 2) {
                    var4_7 = var1_18;
                    var2_3 = var3_1;
                    if (var5_2 > 0) {
                        var4_7 = var1_18;
                        var2_3 = var3_1;
                        if (this.j() > var5_2) {
                            this.ay = true;
                            var18_8[0] = (Iterator<E>)true;
                            this.C(var5_2);
                            var4_7 = 1;
                            var2_3 = 1;
                        }
                    }
                }
                if ((var18_8 = (Object)this.aq)[1] == 2 && var9_21 > 0) {
                    var11_17 /* !! */  = this.h();
                    var1_18 = var4_7;
                    var3_1 = var2_3;
                    if (var11_17 /* !! */  > var9_21) {
                        this.az = true;
                        var18_8[1] = true;
                        this.x(var9_21);
                        var1_18 = 1;
                        var3_1 = 1;
                    }
                } else {
                    var1_18 = var4_7;
                    var3_1 = var2_3;
                }
            }
            var2_3 = var10_22 /* !! */  > 8 ? 0 : 1;
            var4_7 = var2_3 & var1_18;
            var1_18 = var10_22 /* !! */ ;
            var2_3 = var9_21;
        }
        this.aI = var17_4;
        if (var3_1 != 0) {
            var17_4 = this.aq;
            var17_4[0] = var6_6;
            var17_4[1] = var7_15;
        }
        this.S(this.d.j);
    }

    public final void U(int n2) {
        this.ax = n2;
        px.a = this.W(512);
    }

    /*
     * Unable to fully structure code
     */
    public final boolean V(boolean var1_1, int var2_2) {
        block17: {
            block20: {
                block18: {
                    block16: {
                        block19: {
                            var10_3 = this.a;
                            var11_4 = var10_3.a;
                            var9_5 = false;
                            var6_6 = var11_4.L(0);
                            var5_7 = var10_3.a.L(1);
                            var11_4 = var10_3.a;
                            var7_8 = var11_4.k();
                            var8_9 = var11_4.l();
                            var4_10 = var5_7;
                            if (!var1_1) break block18;
                            var3_11 = var5_7;
                            if (var6_6 == 2) break block19;
                            var4_10 = var5_7;
                            if (var5_7 != 2) break block18;
                            var3_11 = 2;
                        }
                        var11_4 = var10_3.e;
                        var5_7 = var11_4.size();
                        for (var4_10 = 0; var4_10 < var5_7; ++var4_10) {
                            var12_12 = (ra)var11_4.get(var4_10);
                            if (var12_12.f != var2_2 || var12_12.e()) continue;
                            var5_7 = 0;
                            break block16;
                        }
                        var5_7 = 1;
                    }
                    if (var2_2 == 0) {
                        var4_10 = var3_11;
                        if (var5_7 != 0) {
                            var4_10 = var3_11;
                            if (var6_6 == 2) {
                                var10_3.a.P(1);
                                var11_4 = var10_3.a;
                                var11_4.C(var10_3.a((qh)var11_4, 0));
                                var11_4 = var10_3.a;
                                var11_4.h.e.c(var11_4.j());
                                var4_10 = var3_11;
                            }
                        }
                    } else {
                        var4_10 = var3_11;
                        if (var5_7 != 0) {
                            var4_10 = var3_11;
                            if (var3_11 == 2) {
                                var10_3.a.Q(1);
                                var11_4 = var10_3.a;
                                var11_4.x(var10_3.a((qh)var11_4, 1));
                                var11_4 = var10_3.a;
                                var11_4.i.e.c(var11_4.h());
                                var4_10 = var3_11;
                            }
                        }
                    }
                }
                if (var2_2 != 0) break block20;
                var11_4 = var10_3.a;
                var3_11 = var11_4.aq[0];
                if (var3_11 != 1 && var3_11 != 4) ** GOTO lbl-1000
                var3_11 = var11_4.j() + var7_8;
                var11_4.h.i.c(var3_11);
                var10_3.a.h.e.c(var3_11 - var7_8);
                ** GOTO lbl66
            }
            var11_4 = var10_3.a;
            var3_11 = var11_4.aq[1];
            if (var3_11 != 1 && var3_11 != 4) lbl-1000:
            // 2 sources

            {
                var3_11 = 0;
            } else {
                var3_11 = var11_4.h() + var8_9;
                var11_4.i.i.c(var3_11);
                var10_3.a.i.e.c(var3_11 - var8_9);
lbl66:
                // 2 sources

                var3_11 = 1;
            }
            var10_3.c();
            var11_4 = var10_3.e;
            var7_8 = var11_4.size();
            for (var5_7 = 0; var5_7 < var7_8; ++var5_7) {
                var12_12 = (ra)var11_4.get(var5_7);
                if (var12_12.f != var2_2 || var12_12.d == var10_3.a && !var12_12.g) continue;
                var12_12.c();
            }
            var12_12 = var10_3.e;
            var7_8 = var12_12.size();
            for (var5_7 = 0; var5_7 < var7_8; ++var5_7) {
                var11_4 = (ra)var12_12.get(var5_7);
                if (var11_4.f != var2_2 || var3_11 == 0 && var11_4.d == var10_3.a) continue;
                if (!var11_4.h.i) {
                    var1_1 = var9_5;
                } else if (!var11_4.i.i) {
                    var1_1 = var9_5;
                } else {
                    if (var11_4 instanceof qp || var11_4.e.i) continue;
                    var1_1 = var9_5;
                }
                break block17;
            }
            var1_1 = true;
        }
        var10_3.a.P(var6_6);
        var10_3.a.Q(var4_10);
        return var1_1;
    }

    public final boolean W(int n2) {
        return (this.ax & n2) == n2;
    }

    final void a(qg qg2, int n2) {
        if (n2 == 0) {
            n2 = this.at;
            qe[] qeArray = this.aw;
            int n3 = qeArray.length;
            if (n2 + 1 >= n3) {
                this.aw = Arrays.copyOf(qeArray, n3 + n3);
            }
            qeArray = this.aw;
            n2 = this.at;
            qeArray[n2] = new qe(qg2, 0, this.c);
            this.at = n2 + 1;
            return;
        }
        int n4 = this.au;
        qe[] qeArray = this.av;
        n2 = qeArray.length;
        if (n4 + 1 >= n2) {
            this.av = Arrays.copyOf(qeArray, n2 + n2);
        }
        qeArray = this.av;
        n2 = this.au;
        qeArray[n2] = new qe(qg2, 1, this.c);
        this.au = n2 + 1;
    }

    public final void c() {
        this.a.b = true;
    }

    @Override
    public final void s() {
        this.d.k();
        this.ar = 0;
        this.as = 0;
        super.s();
    }
}

