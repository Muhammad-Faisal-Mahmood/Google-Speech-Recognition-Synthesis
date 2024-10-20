/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientDelegate;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class qg {
    public float A;
    int B;
    float C;
    public final int[] D;
    public float E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final qf J;
    public final qf K;
    public final qf L;
    public final qf M;
    public final qf N;
    final qf O;
    final qf P;
    public final qf Q;
    public final qf[] R;
    protected final ArrayList S;
    public final boolean[] T;
    public qg U;
    int V;
    public int W;
    public float X;
    public int Y;
    public int Z;
    private boolean a = true;
    public int aa;
    public int ab;
    public int ac;
    public int ad;
    public float ae;
    public float af;
    public Object ag;
    public int ah;
    public String ai;
    public int aj;
    public int ak;
    public final float[] al;
    public final qg[] am;
    public final qg[] an;
    public int ao;
    public int ap;
    public final int[] aq;
    private boolean b;
    public boolean e = false;
    public qp f;
    public qp g;
    public qx h = null;
    public qy i = null;
    public final boolean[] j = new boolean[]{true, true};
    public int k = -1;
    public int l = -1;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public final int[] u;
    public int v;
    public int w;
    public float x;
    public int y;
    public int z;

    public qg() {
        ArrayList<qf> arrayList;
        qf qf2;
        qf qf3;
        qf qf4;
        qf qf5;
        qf qf6;
        qf qf7;
        qf qf8;
        qf qf9;
        new HashMap();
        this.b = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = -1;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = new int[2];
        this.v = 0;
        this.w = 0;
        this.x = 1.0f;
        this.y = 0;
        this.z = 0;
        this.A = 1.0f;
        this.B = -1;
        this.C = 1.0f;
        this.D = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.E = Float.NaN;
        this.F = false;
        this.G = false;
        this.H = 0;
        this.I = 0;
        this.J = qf9 = new qf(this, 2);
        this.K = qf8 = new qf(this, 3);
        this.L = qf7 = new qf(this, 4);
        this.M = qf6 = new qf(this, 5);
        this.N = qf5 = new qf(this, 6);
        this.O = qf4 = new qf(this, 8);
        this.P = qf3 = new qf(this, 9);
        this.Q = qf2 = new qf(this, 7);
        this.R = new qf[]{qf9, qf7, qf8, qf6, qf5, qf2};
        this.S = arrayList = new ArrayList<qf>();
        this.T = new boolean[2];
        this.aq = new int[]{1, 1};
        this.U = null;
        this.V = 0;
        this.W = 0;
        this.X = 0.0f;
        this.Y = -1;
        this.Z = 0;
        this.aa = 0;
        this.ab = 0;
        this.ae = 0.5f;
        this.af = 0.5f;
        this.ah = 0;
        this.ai = null;
        this.aj = 0;
        this.ak = 0;
        this.al = new float[]{-1.0f, -1.0f};
        this.am = new qg[]{null, null};
        this.an = new qg[]{null, null};
        this.ao = -1;
        this.ap = -1;
        arrayList.add(qf9);
        arrayList.add(qf8);
        arrayList.add(qf7);
        arrayList.add(qf6);
        arrayList.add(qf4);
        arrayList.add(qf3);
        arrayList.add(qf2);
        arrayList.add(qf5);
    }

    private final boolean a(int n2) {
        Object object = this.R;
        n2 += n2;
        qf qf2 = object[n2];
        qf qf3 = qf2.e;
        if (qf3 != null && qf3.e != qf2) {
            qf3 = object[n2 + 1];
            object = qf3.e;
            if (object != null && object.e == qf3) {
                return true;
            }
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final void c(px var1_1, boolean var2_2, boolean var3_3, boolean var4_4, boolean var5_5, qb var6_6, qb var7_7, int var8_8, boolean var9_9, qf var10_10, qf var11_11, int var12_12, int var13_13, int var14_14, int var15_15, float var16_16, boolean var17_17, boolean var18_18, boolean var19_19, boolean var20_20, boolean var21_21, int var22_22, int var23_23, int var24_24, int var25_25, float var26_26, boolean var27_27) {
        block103: {
            block124: {
                block132: {
                    block131: {
                        block109: {
                            block101: {
                                block130: {
                                    block112: {
                                        block125: {
                                            block128: {
                                                block129: {
                                                    block126: {
                                                        block127: {
                                                            block102: {
                                                                block122: {
                                                                    block117: {
                                                                        block118: {
                                                                            block123: {
                                                                                block113: {
                                                                                    block120: {
                                                                                        block121: {
                                                                                            block119: {
                                                                                                block115: {
                                                                                                    block116: {
                                                                                                        block114: {
                                                                                                            block111: {
                                                                                                                block110: {
                                                                                                                    block105: {
                                                                                                                        block106: {
                                                                                                                            block108: {
                                                                                                                                block107: {
                                                                                                                                    block104: {
                                                                                                                                        var39_28 = var1_1.b(var10_10);
                                                                                                                                        var35_29 = var1_1.b(var11_11);
                                                                                                                                        var40_30 = var1_1.b(var10_10.e);
                                                                                                                                        var38_31 = var1_1.b(var11_11.e);
                                                                                                                                        var31_32 = var10_10.h();
                                                                                                                                        var34_33 = var11_11.h();
                                                                                                                                        var33_34 = this.Q.h();
                                                                                                                                        var28_35 = var34_33 != false ? var31_32 + 1 : var31_32;
                                                                                                                                        var30_36 = var28_35;
                                                                                                                                        if (var33_34) {
                                                                                                                                            var30_36 = var28_35 + 1;
                                                                                                                                        }
                                                                                                                                        if (var17_17) {
                                                                                                                                            var22_22 = 3;
                                                                                                                                        }
                                                                                                                                        var28_35 = var8_8 - 1;
                                                                                                                                        if (var8_8 == 0) break block103;
                                                                                                                                        var29_37 = var28_35 != 0 && var28_35 != 1 && var28_35 == 2 && var22_22 != 4 ? 1 : 0;
                                                                                                                                        var32_38 = this.k;
                                                                                                                                        var8_8 = var29_37;
                                                                                                                                        var28_35 = var13_13;
                                                                                                                                        if (var32_38 != -1) {
                                                                                                                                            var8_8 = var29_37;
                                                                                                                                            var28_35 = var13_13;
                                                                                                                                            if (var2_2) {
                                                                                                                                                this.k = -1;
                                                                                                                                                var28_35 = var32_38;
                                                                                                                                                var8_8 = 0;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        if ((var13_13 = this.l) != -1 && !var2_2) {
                                                                                                                                            this.l = -1;
                                                                                                                                            var28_35 = 0;
                                                                                                                                            var8_8 = var13_13;
                                                                                                                                            var13_13 = var28_35;
                                                                                                                                        } else {
                                                                                                                                            var13_13 = var8_8;
                                                                                                                                            var8_8 = var28_35;
                                                                                                                                        }
                                                                                                                                        var29_37 = this.ah;
                                                                                                                                        var28_35 = var29_37 == 8 ? 0 : 1;
                                                                                                                                        if (var29_37 == 8) {
                                                                                                                                            var8_8 = 0;
                                                                                                                                        }
                                                                                                                                        if (var27_27) {
                                                                                                                                            if (var31_32 == 0 && !var34_33 && !var33_34) {
                                                                                                                                                var1_1.f(var39_28, var12_12);
                                                                                                                                            } else if (var31_32 != 0 && !var34_33) {
                                                                                                                                                var1_1.m(var39_28, var40_30, var10_10.b(), 8);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        if ((var12_12 = var28_35 & var13_13) != 0) break block104;
                                                                                                                                        if (var9_9) {
                                                                                                                                            var1_1.m(var35_29, var39_28, 0, 3);
                                                                                                                                            if (var14_14 > 0) {
                                                                                                                                                var1_1.g(var35_29, var39_28, var14_14, 8);
                                                                                                                                            }
                                                                                                                                            if (var15_15 < 0x7FFFFFFF) {
                                                                                                                                                var1_1.h(var35_29, var39_28, var15_15, 8);
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            var1_1.m(var35_29, var39_28, var8_8, 8);
                                                                                                                                        }
                                                                                                                                        var8_8 = var24_24;
                                                                                                                                        var13_13 = var25_25;
                                                                                                                                        var28_35 = var22_22;
                                                                                                                                        var25_25 = var12_12;
                                                                                                                                        break block105;
                                                                                                                                    }
                                                                                                                                    var29_37 = var12_12;
                                                                                                                                    if (var30_36 == 2 || var17_17) break block106;
                                                                                                                                    if (var22_22 == 1) break block107;
                                                                                                                                    if (var22_22 != 0) break block106;
                                                                                                                                    var12_12 = 0;
                                                                                                                                    break block108;
                                                                                                                                }
                                                                                                                                var12_12 = 1;
                                                                                                                            }
                                                                                                                            var8_8 = var13_13 = Math.max(var24_24, var8_8);
                                                                                                                            if (var25_25 > 0) {
                                                                                                                                var8_8 = Math.min(var25_25, var13_13);
                                                                                                                            }
                                                                                                                            var1_1.m(var35_29, var39_28, var8_8, 8);
                                                                                                                            var15_15 = 0;
                                                                                                                            var8_8 = var24_24;
                                                                                                                            var13_13 = var25_25;
                                                                                                                            var28_35 = var12_12;
                                                                                                                            var25_25 = var15_15;
                                                                                                                            break block105;
                                                                                                                        }
                                                                                                                        var12_12 = var24_24;
                                                                                                                        if (var24_24 == -2) {
                                                                                                                            var12_12 = var8_8;
                                                                                                                        }
                                                                                                                        var13_13 = var25_25;
                                                                                                                        if (var25_25 == -2) {
                                                                                                                            var13_13 = var8_8;
                                                                                                                        }
                                                                                                                        var15_15 = var8_8;
                                                                                                                        if (var8_8 > 0) {
                                                                                                                            var15_15 = var8_8;
                                                                                                                            if (var22_22 != 1) {
                                                                                                                                var15_15 = 0;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        var8_8 = var15_15;
                                                                                                                        if (var12_12 > 0) {
                                                                                                                            var1_1.g(var35_29, var39_28, var12_12, 8);
                                                                                                                            var8_8 = Math.max(var15_15, var12_12);
                                                                                                                        }
                                                                                                                        if (var13_13 > 0) {
                                                                                                                            if (var3_3 && var22_22 == 1) {
                                                                                                                                var28_35 = 1;
                                                                                                                            } else {
                                                                                                                                var1_1.h(var35_29, var39_28, var13_13, 8);
                                                                                                                                var28_35 = var22_22;
                                                                                                                            }
                                                                                                                            var8_8 = Math.min(var8_8, var13_13);
                                                                                                                        } else {
                                                                                                                            var28_35 = var22_22;
                                                                                                                        }
                                                                                                                        if (var22_22 == 1) {
                                                                                                                            if (var3_3) {
                                                                                                                                var1_1.m(var35_29, var39_28, var8_8, 8);
                                                                                                                            } else if (var19_19) {
                                                                                                                                var1_1.m(var35_29, var39_28, var8_8, 5);
                                                                                                                                var1_1.h(var35_29, var39_28, var8_8, 8);
                                                                                                                            } else {
                                                                                                                                var1_1.m(var35_29, var39_28, var8_8, 5);
                                                                                                                                var1_1.h(var35_29, var39_28, var8_8, 8);
                                                                                                                            }
                                                                                                                            var8_8 = var12_12;
                                                                                                                            var25_25 = var29_37;
                                                                                                                        } else if (var22_22 == 2) {
                                                                                                                            var8_8 = var10_10.i;
                                                                                                                            if (var8_8 != 3 && var8_8 != 5) {
                                                                                                                                var36_39 = var1_1.b(this.U.K(2));
                                                                                                                                var37_40 = var1_1.b(this.U.K(4));
                                                                                                                            } else {
                                                                                                                                var36_39 = var1_1.b(this.U.K(3));
                                                                                                                                var37_40 = var1_1.b(this.U.K(5));
                                                                                                                            }
                                                                                                                            var41_41 = var1_1.a();
                                                                                                                            var41_41.g(var35_29, var39_28, (qb)var37_40, var36_39, var26_26);
                                                                                                                            var1_1.e((pw)var41_41);
                                                                                                                            var25_25 = var3_3 ^ 1;
                                                                                                                            var8_8 = var12_12;
                                                                                                                        } else {
                                                                                                                            var5_5 = true;
                                                                                                                            var25_25 = var29_37;
                                                                                                                            var8_8 = var12_12;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    if (!var27_27 || var19_19) break block109;
                                                                                                                    if (var31_32 == 0 && !var34_33 && !var33_34) lbl-1000:
                                                                                                                    // 4 sources

                                                                                                                    {
                                                                                                                        while (true) {
                                                                                                                            var6_6 = var35_29;
                                                                                                                            var8_8 = 5;
                                                                                                                            break block101;
                                                                                                                            break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    if (var31_32 == 0 || var34_33) break block110;
                                                                                                                    var6_6 = var10_10.e.d;
                                                                                                                    if (!var3_3 || !(var6_6 instanceof qd)) ** GOTO lbl-1000
                                                                                                                    var6_6 = var35_29;
                                                                                                                    var8_8 = 8;
                                                                                                                    break block101;
                                                                                                                }
                                                                                                                if (var31_32 != 0 || !var34_33) break block111;
                                                                                                                var1_1.m(var35_29, var38_31, -var11_11.b(), 8);
                                                                                                                if (!var3_3) ** GOTO lbl-1000
                                                                                                                var1_1.g(var39_28, (qb)var6_6, 0, 5);
                                                                                                                ** while (true)
                                                                                                            }
                                                                                                            if (var31_32 == 0 || !var34_33) break block112;
                                                                                                            var41_41 = var10_10.e.d;
                                                                                                            var42_42 = var11_11.e.d;
                                                                                                            var37_40 = this.U;
                                                                                                            var30_36 = 6;
                                                                                                            if (var25_25 == 0) break block113;
                                                                                                            if (var28_35 != 0) break block114;
                                                                                                            if (var13_13 == 0 && var8_8 == 0) {
                                                                                                                if (var40_30.g && var38_31.g) {
                                                                                                                    var1_1.m(var39_28, var40_30, var10_10.b(), 8);
                                                                                                                    var1_1.m(var35_29, var38_31, -var11_11.b(), 8);
                                                                                                                    return;
                                                                                                                }
                                                                                                                var29_37 = 8;
                                                                                                                var15_15 = 8;
                                                                                                                var8_8 = 0;
                                                                                                                var12_12 = 1;
                                                                                                                var24_24 = 0;
                                                                                                                var13_13 = 0;
                                                                                                            } else {
                                                                                                                var29_37 = 5;
                                                                                                                var15_15 = 5;
                                                                                                                var22_22 = 1;
                                                                                                                var12_12 = 0;
                                                                                                                var24_24 = 1;
                                                                                                                var13_13 = var8_8;
                                                                                                                var8_8 = var22_22;
                                                                                                            }
                                                                                                            if (!(var41_41 instanceof qd) && !(var42_42 instanceof qd)) {
                                                                                                                var31_32 = 6;
                                                                                                                var22_22 = var12_12;
                                                                                                                var23_23 = var8_8;
                                                                                                                var8_8 = var15_15;
                                                                                                                var12_12 = var31_32;
                                                                                                                var15_15 = var13_13;
                                                                                                                var13_13 = var29_37;
                                                                                                            } else {
                                                                                                                var15_15 = 6;
                                                                                                                var22_22 = var12_12;
                                                                                                                var23_23 = var8_8;
                                                                                                                var8_8 = 4;
                                                                                                                var12_12 = var15_15;
                                                                                                                var15_15 = var13_13;
                                                                                                                var13_13 = var29_37;
                                                                                                            }
                                                                                                            break block102;
                                                                                                        }
                                                                                                        if (var28_35 != 2) break block115;
                                                                                                        if (var41_41 instanceof qd || var42_42 instanceof qd) break block116;
                                                                                                        var13_13 = 5;
                                                                                                        var12_12 = 5;
                                                                                                        break block117;
                                                                                                    }
                                                                                                    var13_13 = 5;
                                                                                                    break block118;
                                                                                                }
                                                                                                if (var28_35 != 1) break block119;
                                                                                                var13_13 = 8;
                                                                                                break block118;
                                                                                            }
                                                                                            if (var28_35 != 3) break block120;
                                                                                            if (this.B == -1) {
                                                                                                var13_13 = 8;
                                                                                                var12_12 = var20_20 ? (var3_3 ? 5 : 4) : 8;
lbl215:
                                                                                                // 2 sources

                                                                                                while (true) {
                                                                                                    var15_15 = 5;
lbl217:
                                                                                                    // 3 sources

                                                                                                    while (true) {
                                                                                                        var29_37 = var8_8;
                                                                                                        var28_35 = 3;
                                                                                                        var23_23 = 1;
                                                                                                        var24_24 = 1;
                                                                                                        var22_22 = 1;
                                                                                                        var8_8 = var15_15;
                                                                                                        var15_15 = var29_37;
                                                                                                        break block102;
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            if (!var17_17) break block121;
                                                                                            if (var23_23 != 2 && var23_23 != 1) {
                                                                                                var13_13 = 8;
                                                                                                var12_12 = 5;
                                                                                            } else {
                                                                                                var13_13 = 5;
                                                                                                var12_12 = 4;
                                                                                            }
                                                                                            var15_15 = var12_12;
                                                                                            var12_12 = 6;
                                                                                            ** GOTO lbl217
                                                                                        }
                                                                                        if (var13_13 > 0) {
                                                                                            var12_12 = 6;
                                                                                            var13_13 = 5;
                                                                                            ** continue;
                                                                                        }
                                                                                        if (var13_13 == 0 && var8_8 == 0) {
                                                                                            if (!var20_20) {
                                                                                                var13_13 = 5;
                                                                                                var8_8 = 8;
lbl245:
                                                                                                // 2 sources

                                                                                                while (true) {
                                                                                                    var28_35 = 3;
                                                                                                    var12_12 = 6;
                                                                                                    var23_23 = 1;
                                                                                                    var24_24 = 1;
                                                                                                    var22_22 = 1;
                                                                                                    var15_15 = 0;
                                                                                                    break block102;
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            var8_8 = var41_41 != var37_40 && var42_42 != var37_40 ? 4 : 5;
                                                                                            var13_13 = var8_8;
                                                                                            var8_8 = 4;
                                                                                            ** continue;
                                                                                        }
                                                                                        var12_12 = 6;
                                                                                        var13_13 = 5;
                                                                                        var15_15 = 4;
                                                                                        ** while (true)
                                                                                    }
                                                                                    var13_13 = 5;
                                                                                    var12_12 = 4;
                                                                                    var23_23 = 0;
                                                                                    var24_24 = 0;
                                                                                    break block122;
                                                                                }
                                                                                if (!var40_30.g || !var38_31.g) break block123;
                                                                                var1_1.d(var39_28, var40_30, var10_10.b(), var16_16, var38_31, var35_29, var11_11.b(), 8);
                                                                                if (var3_3 && var5_5) {
                                                                                    var8_8 = var11_11.e != null ? var11_11.b() : 0;
                                                                                    if (var38_31 != var7_7) {
                                                                                        var1_1.g(var7_7, var35_29, var8_8, 5);
                                                                                        return;
                                                                                    }
                                                                                }
                                                                                break block124;
                                                                            }
                                                                            var13_13 = 5;
                                                                        }
                                                                        var12_12 = 4;
                                                                    }
                                                                    var23_23 = 1;
                                                                    var24_24 = 1;
                                                                }
                                                                var29_37 = 6;
                                                                var22_22 = 0;
                                                                var15_15 = var8_8;
                                                                var8_8 = var12_12;
                                                                var12_12 = var29_37;
                                                            }
                                                            if (var24_24 != 0 && var40_30 == var38_31 && var41_41 != var37_40) {
                                                                var24_24 = 0;
                                                                var29_37 = 0;
                                                            } else {
                                                                var31_32 = 1;
                                                                var29_37 = var24_24;
                                                                var24_24 = var31_32;
                                                            }
                                                            if (var23_23 != 0) {
                                                                if (var25_25 == 0 && !var18_18 && !var20_20 && var40_30 == var6_6 && var38_31 == var7_7) {
                                                                    var2_2 = false;
                                                                    var12_12 = 8;
                                                                    var23_23 = 8;
                                                                    var13_13 = 0;
                                                                } else {
                                                                    var2_2 = var3_3;
                                                                    var23_23 = var24_24;
                                                                    var24_24 = var13_13;
                                                                    var13_13 = var23_23;
                                                                    var23_23 = var12_12;
                                                                    var12_12 = var24_24;
                                                                }
                                                                var1_1.d(var39_28, var40_30, var10_10.b(), var16_16, var38_31, var35_29, var11_11.b(), var23_23);
                                                            } else {
                                                                var2_2 = var3_3;
                                                                var12_12 = var13_13;
                                                                var13_13 = var24_24;
                                                            }
                                                            if (this.ah == 8 && !var11_11.g()) break block124;
                                                            if (var29_37 != 0) {
                                                                if (var2_2 && var40_30 != var38_31 && var25_25 == 0 && (var41_41 instanceof qd || var42_42 instanceof qd)) {
                                                                    var12_12 = 6;
                                                                }
                                                                var1_1.g(var39_28, var40_30, var10_10.b(), var12_12);
                                                                var1_1.h(var35_29, var38_31, -var11_11.b(), var12_12);
                                                            }
                                                            var36_39 = var35_29;
                                                            if (var2_2 && var21_21 && !(var41_41 instanceof qd) && !(var42_42 instanceof qd) && var42_42 != var37_40) {
                                                                var8_8 = 6;
                                                                var13_13 = 6;
                                                                var12_12 = 1;
                                                            } else {
                                                                var23_23 = var12_12;
                                                                var12_12 = var13_13;
                                                                var13_13 = var23_23;
                                                            }
                                                            if (var12_12 == 0) break block125;
                                                            var12_12 = var8_8;
                                                            if (var22_22 == 0) break block126;
                                                            if (!var20_20) break block127;
                                                            var12_12 = var8_8;
                                                            if (!var4_4) break block126;
                                                        }
                                                        var12_12 = var30_36;
                                                        if (var41_41 != var37_40) {
                                                            var12_12 = var42_42 == var37_40 ? var30_36 : var8_8;
                                                        }
                                                        if (var41_41 instanceof qj || var42_42 instanceof qj) {
                                                            var12_12 = 5;
                                                        }
                                                        if (var41_41 instanceof qd || var42_42 instanceof qd) {
                                                            var12_12 = 5;
                                                        }
                                                        if (var20_20) {
                                                            var12_12 = 5;
                                                        }
                                                        var12_12 = Math.max(var12_12, var8_8);
                                                    }
                                                    var8_8 = var12_12;
                                                    if (!var2_2) break block128;
                                                    var8_8 = var12_12 = Math.min(var13_13, var12_12);
                                                    if (!var17_17) break block128;
                                                    var8_8 = var12_12;
                                                    if (var20_20) break block128;
                                                    if (var41_41 == var37_40) break block129;
                                                    var8_8 = var12_12;
                                                    if (var42_42 != var37_40) break block128;
                                                }
                                                var8_8 = 4;
                                            }
                                            var1_1.m(var39_28, var40_30, var10_10.b(), var8_8);
                                            var1_1.m(var36_39, var38_31, -var11_11.b(), var8_8);
                                        }
                                        if (var2_2) {
                                            var8_8 = var40_30 == var6_6 ? var10_10.b() : 0;
                                            if (var40_30 != var6_6) {
                                                var1_1.g(var39_28, (qb)var6_6, var8_8, 5);
                                            }
                                        }
                                        var3_3 = var2_2;
                                        if (var2_2) {
                                            var3_3 = var2_2;
                                            if (var25_25 != 0) {
                                                var3_3 = var2_2;
                                                if (var14_14 == 0) {
                                                    var3_3 = var2_2;
                                                    if (var15_15 == 0) {
                                                        if (var28_35 == 3) {
                                                            var1_1.g(var36_39, var39_28, 0, 8);
                                                            var3_3 = var2_2;
                                                        } else {
                                                            var1_1.g(var36_39, var39_28, 0, 5);
                                                            var3_3 = var2_2;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        break block130;
                                    }
                                    var6_6 = var35_29;
                                }
                                var6_6 = var35_29;
                                var8_8 = 5;
                            }
                            if (var3_3 && var5_5) {
                                var12_12 = var11_11.e != null ? var11_11.b() : 0;
                                if (var38_31 != var7_7) {
                                    var1_1.g(var7_7, var35_29, var12_12, var8_8);
                                    return;
                                }
                            }
                            break block124;
                        }
                        if (var30_36 >= 2 || !var3_3 || !var5_5) break block124;
                        var1_1.g(var39_28, (qb)var6_6, 0, 8);
                        var8_8 = !var2_2 && this.N.e != null ? 0 : 1;
                        if (var2_2 || (var6_6 = this.N.e) == null) break block131;
                        var6_6 = var6_6.d;
                        if (var6_6.X == 0.0f || (var6_6 = (Object)var6_6.aq)[0] != 3 || var6_6[1] != 3) break block124;
                        break block132;
                    }
                    if (var8_8 == 0) break block124;
                }
                var1_1.g(var7_7, var35_29, 0, 8);
            }
            return;
        }
        throw null;
    }

    public final void A(int n2) {
        if (n2 < 0) {
            this.ad = 0;
            return;
        }
        this.ad = n2;
    }

    public final void B(int n2) {
        if (n2 < 0) {
            this.ac = 0;
            return;
        }
        this.ac = n2;
    }

    public final void C(int n2) {
        this.V = n2;
        int n3 = this.ac;
        if (n2 < n3) {
            this.V = n3;
        }
    }

    public void D(boolean bl2, boolean bl3) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        boolean bl4;
        boolean bl5;
        block15: {
            block14: {
                qx qx2 = this.h;
                bl5 = bl2 & qx2.g;
                qy qy2 = this.i;
                bl4 = bl3 & qy2.g;
                n6 = qx2.h.f;
                n5 = qy2.h.f;
                n4 = qx2.i.f;
                n3 = qy2.i.f;
                if (n4 - n6 < 0 || n3 - n5 < 0 || n6 == Integer.MIN_VALUE || n6 == Integer.MAX_VALUE || n5 == Integer.MIN_VALUE || n5 == Integer.MAX_VALUE || n4 == Integer.MIN_VALUE || n4 == Integer.MAX_VALUE || n3 == Integer.MIN_VALUE) break block14;
                n2 = n3;
                if (n3 != Integer.MAX_VALUE) break block15;
            }
            n3 = 0;
            n5 = n2 = (n4 = 0);
            n6 = n2;
            n2 = n4;
            n4 = n3;
        }
        if (bl5) {
            this.Z = n6;
        }
        if (bl4) {
            this.aa = n5;
        }
        if (this.ah == 8) {
            this.V = 0;
            this.W = 0;
            return;
        }
        if (bl5) {
            n4 -= n6;
            n6 = n4;
            if (this.aq[0] == 1) {
                n3 = this.V;
                n6 = n4;
                if (n4 < n3) {
                    n6 = n3;
                }
            }
            this.V = n6;
            n4 = this.ac;
            if (n6 < n4) {
                this.V = n4;
            }
        }
        if (bl4) {
            n2 = n6 = n2 - n5;
            if (this.aq[1] == 1) {
                n5 = this.W;
                n2 = n6;
                if (n6 < n5) {
                    n2 = n5;
                }
            }
            this.W = n2;
            n5 = this.ad;
            if (n2 < n5) {
                this.W = n5;
            }
        }
    }

    final boolean E() {
        return this instanceof qm || this instanceof qj;
        {
        }
    }

    public final boolean F(int n2) {
        int n3;
        int n4;
        if (n2 == 0) {
            int n5;
            n2 = this.J.e != null ? 1 : 0;
            return n2 + (n5 = this.L.e != null ? 1 : 0) < 2;
        }
        n2 = this.K.e != null ? 1 : 0;
        return n2 + (n4 = this.M.e != null ? 1 : 0) + (n3 = this.N.e != null ? 1 : 0) < 2;
    }

    public final boolean G(int n2, int n3) {
        if (n2 == 0) {
            qf qf2 = this.J.e;
            if (qf2 != null && qf2.c) {
                qf qf3 = this.L;
                qf2 = qf3.e;
                if (qf2 != null && qf2.c) {
                    return qf2.a() - qf3.b() - (this.J.e.a() + this.J.b()) >= n3;
                }
            }
        } else {
            qf qf4 = this.K.e;
            if (qf4 != null && qf4.c) {
                qf4 = this.M;
                qf qf5 = qf4.e;
                if (qf5 != null && qf5.c && qf5.a() - qf4.b() - (this.K.e.a() + this.K.b()) >= n3) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean H() {
        block3: {
            block2: {
                qf qf2 = this.J;
                qf qf3 = qf2.e;
                if (qf3 != null && qf3.e == qf2) break block2;
                qf3 = this.L;
                qf2 = qf3.e;
                if (qf2 == null || qf2.e != qf3) break block3;
            }
            return true;
        }
        return false;
    }

    public final boolean I() {
        block3: {
            block2: {
                qf qf2 = this.K;
                qf qf3 = qf2.e;
                if (qf3 != null && qf3.e == qf2) break block2;
                qf3 = this.M;
                qf2 = qf3.e;
                if (qf2 == null || qf2.e != qf3) break block3;
            }
            return true;
        }
        return false;
    }

    public final boolean J() {
        return this.a && this.ah != 8;
    }

    public qf K(int n2) {
        if (--n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 4) {
                        if (n2 != 5) {
                            return this.Q;
                        }
                        return this.N;
                    }
                    return this.M;
                }
                return this.L;
            }
            return this.K;
        }
        return this.J;
    }

    public final int L(int n2) {
        if (n2 == 0) {
            return this.M();
        }
        return this.N();
    }

    public final int M() {
        return this.aq[0];
    }

    public final int N() {
        return this.aq[1];
    }

    public final void O(int n2, qg qg2, int n3, int n4, int n5) {
        this.K(n2).j(qg2.K(n3), n4, n5);
    }

    public final void P(int n2) {
        this.aq[0] = n2;
    }

    public final void Q(int n2) {
        this.aq[1] = n2;
    }

    public void R(boolean bl2) {
        Object object;
        int n2;
        int n3;
        int n4;
        int n5;
        Object object2;
        int n6;
        block24: {
            block23: {
                qq qq2;
                n6 = px.o(this.J);
                object2 = px.o(this.K);
                n5 = px.o(this.L);
                n4 = px.o(this.M);
                n3 = n6;
                n2 = n5;
                if (bl2) {
                    qq2 = this.h;
                    n3 = n6;
                    n2 = n5;
                    if (qq2 != null) {
                        object = qq2.h;
                        n3 = n6;
                        n2 = n5;
                        if (((qs)object).i) {
                            qq2 = qq2.i;
                            n3 = n6;
                            n2 = n5;
                            if (((qs)qq2).i) {
                                n3 = ((qs)object).f;
                                n2 = ((qs)qq2).f;
                            }
                        }
                    }
                }
                n6 = object2;
                n5 = n4;
                if (bl2) {
                    qq2 = this.i;
                    n6 = object2;
                    n5 = n4;
                    if (qq2 != null) {
                        object = ((qy)qq2).h;
                        n6 = object2;
                        n5 = n4;
                        if (((qs)object).i) {
                            qq2 = ((qy)qq2).i;
                            n6 = object2;
                            n5 = n4;
                            if (((qs)qq2).i) {
                                n6 = ((qs)object).f;
                                n5 = ((qs)qq2).f;
                            }
                        }
                    }
                }
                if (n2 - n3 < 0 || n5 - n6 < 0 || n3 == Integer.MIN_VALUE || n3 == Integer.MAX_VALUE || n6 == Integer.MIN_VALUE || n6 == Integer.MAX_VALUE || n2 == Integer.MIN_VALUE || n2 == Integer.MAX_VALUE || n5 == Integer.MIN_VALUE) break block23;
                n4 = n3;
                n3 = n5;
                if (n5 != Integer.MAX_VALUE) break block24;
            }
            n4 = 0;
            n3 = n2 = (n6 = 0);
        }
        this.Z = n4;
        this.aa = n6;
        if (this.ah == 8) {
            this.V = 0;
            this.W = 0;
            return;
        }
        n4 = n2 - n4;
        object = this.aq;
        n5 = object2 = (Object)object[0];
        n2 = n4;
        if (object2 == 1) {
            n5 = this.V;
            n2 = n4;
            if (n4 < n5) {
                n2 = n5;
            }
            n5 = 1;
        }
        n3 = n4 = n3 - n6;
        if (object[1] == true) {
            n6 = this.W;
            n3 = n4;
            if (n4 < n6) {
                n3 = n6;
            }
        }
        this.V = n2;
        this.W = n3;
        n6 = this.ad;
        if (n3 < n6) {
            this.W = n6;
        }
        if (n2 < (n6 = this.ac)) {
            this.V = n6;
        } else {
            n6 = n2;
        }
        n4 = this.w;
        if (n4 > 0 && n5 == 3) {
            this.V = Math.min(n6, n4);
        }
        if ((n5 = this.z) > 0 && this.aq[1] == 3) {
            this.W = Math.min(this.W, n5);
        }
        if (n2 != (n5 = this.V)) {
            this.k = n5;
        }
        if (n3 != (n2 = this.W)) {
            this.l = n2;
        }
    }

    public void S(AmbientDelegate ambientDelegate) {
        this.J.i();
        this.K.i();
        this.L.i();
        this.M.i();
        this.N.i();
        this.Q.i();
        this.O.i();
        this.P.i();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void b(px var1_1, boolean var2_2) {
        block73: {
            block90: {
                block89: {
                    block87: {
                        block75: {
                            block83: {
                                block88: {
                                    block84: {
                                        block86: {
                                            block85: {
                                                block76: {
                                                    block77: {
                                                        block81: {
                                                            block82: {
                                                                block80: {
                                                                    block78: {
                                                                        block79: {
                                                                            block74: {
                                                                                block71: {
                                                                                    block72: {
                                                                                        block70: {
                                                                                            block65: {
                                                                                                block69: {
                                                                                                    block66: {
                                                                                                        block67: {
                                                                                                            block68: {
                                                                                                                var39_3 = var1_1.b(this.J);
                                                                                                                var37_4 = var1_1.b(this.L);
                                                                                                                var40_5 = var1_1.b(this.K);
                                                                                                                var38_6 = var1_1.b(this.M);
                                                                                                                var41_7 = var1_1.b(this.N);
                                                                                                                var34_8 = this.U;
                                                                                                                if (var34_8 == null) break block66;
                                                                                                                var34_8 = var34_8.aq;
                                                                                                                var22_9 = var34_8[0] == 2;
                                                                                                                var23_10 = var34_8[1] == 2;
                                                                                                                var9_11 = this.r;
                                                                                                                if (var9_11 == 1) break block67;
                                                                                                                if (var9_11 == 2) break block68;
                                                                                                                if (var9_11 == 3) break block66;
                                                                                                                break block69;
                                                                                                            }
                                                                                                            var22_9 = false;
                                                                                                            break block69;
                                                                                                        }
                                                                                                        var23_10 = false;
                                                                                                        break block69;
                                                                                                    }
                                                                                                    var23_10 = false;
                                                                                                    var22_9 = false;
                                                                                                }
                                                                                                if (this.ah == 8) {
                                                                                                    var10_12 = this.S.size();
                                                                                                    for (var9_11 = 0; var9_11 < var10_12; ++var9_11) {
                                                                                                        if (!((qf)this.S.get(var9_11)).g()) {
                                                                                                            continue;
                                                                                                        }
                                                                                                        break block65;
                                                                                                    }
                                                                                                    var34_8 = this.T;
                                                                                                    if (var34_8[0] == false && var34_8[1] == false) {
                                                                                                        return;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            if (this.b) break block70;
                                                                                            if (!this.m) break block71;
                                                                                            break block72;
                                                                                        }
                                                                                        var1_1.f(var39_3, this.Z);
                                                                                        var1_1.f(var37_4, this.Z + this.V);
                                                                                        if (var22_9 && (var34_8 = this.U) != null) {
                                                                                            var35_13 = this.J;
                                                                                            var34_8 = (qh)var34_8;
                                                                                            var36_14 = var34_8.aB;
                                                                                            if (var36_14 == null || var36_14.get() == null || var35_13.a() > ((qf)var34_8.aB.get()).a()) {
                                                                                                var34_8.aB = new WeakReference<Object>(var35_13);
                                                                                            }
                                                                                            var36_14 = this.L;
                                                                                            var35_13 = var34_8.aD;
                                                                                            if (var35_13 == null || var35_13.get() == null || var36_14.a() > ((qf)var34_8.aD.get()).a()) {
                                                                                                var34_8.aD = new WeakReference<Object>(var36_14);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if (this.m) {
                                                                                        var1_1.f(var40_5, this.aa);
                                                                                        var1_1.f((qb)var38_6, this.aa + this.W);
                                                                                        if (this.N.g()) {
                                                                                            var1_1.f((qb)var41_7, this.aa + this.ab);
                                                                                        }
                                                                                        if (var23_10 && (var34_8 = this.U) != null) {
                                                                                            var35_13 = this.K;
                                                                                            var34_8 = (qh)var34_8;
                                                                                            var36_14 = var34_8.aA;
                                                                                            if (var36_14 == null || var36_14.get() == null || var35_13.a() > ((qf)var34_8.aA.get()).a()) {
                                                                                                var34_8.aA = new WeakReference<Object>(var35_13);
                                                                                            }
                                                                                            var36_14 = this.M;
                                                                                            var35_13 = var34_8.aC;
                                                                                            if (var35_13 == null || var35_13.get() == null || var36_14.a() > ((qf)var34_8.aC.get()).a()) {
                                                                                                var34_8.aC = new WeakReference<Object>(var36_14);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if (this.b && this.m) break block73;
                                                                                }
                                                                                if (!var2_2 || (var34_8 = this.h) == null || (var36_14 = this.i) == null) break block74;
                                                                                var35_13 = var34_8.h;
                                                                                if (!var35_13.i || !var34_8.i.i || !var36_14.h.i || !var36_14.i.i) break block74;
                                                                                var1_1.f(var39_3, var35_13.f);
                                                                                var1_1.f(var37_4, this.h.i.f);
                                                                                var1_1.f(var40_5, this.i.h.f);
                                                                                var1_1.f((qb)var38_6, this.i.i.f);
                                                                                var1_1.f((qb)var41_7, this.i.a.f);
                                                                                if (this.U != null) {
                                                                                    if (var22_9 && this.j[0] && !this.H()) {
                                                                                        var1_1.g(var1_1.b(this.U.L), var37_4, 0, 8);
                                                                                    }
                                                                                    if (var23_10 && this.j[1] && !this.I()) {
                                                                                        var1_1.g(var1_1.b(this.U.M), (qb)var38_6, 0, 8);
                                                                                    }
                                                                                }
                                                                                break block73;
                                                                            }
                                                                            if (this.U != null) {
                                                                                if (this.a(0)) {
                                                                                    ((qh)this.U).a(this, 0);
                                                                                    var25_15 = true;
                                                                                } else {
                                                                                    var25_15 = this.H();
                                                                                }
                                                                                if (this.a(1)) {
                                                                                    ((qh)this.U).a(this, 1);
                                                                                    var24_16 = true;
                                                                                } else {
                                                                                    var24_16 = this.I();
                                                                                }
                                                                                if (!var25_15 && var22_9 && this.ah != 8 && this.J.e == null && this.L.e == null) {
                                                                                    var1_1.g(var1_1.b(this.U.L), var37_4, 0, 1);
                                                                                }
                                                                                if (!var24_16) {
                                                                                    if (var23_10) {
                                                                                        if (this.ah != 8 && this.K.e == null && this.M.e == null && this.N == null) {
                                                                                            var1_1.g(var1_1.b(this.U.M), (qb)var38_6, 0, 1);
                                                                                        }
                                                                                        var23_10 = true;
                                                                                    } else {
                                                                                        var23_10 = false;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                var24_16 = false;
                                                                                var25_15 = false;
                                                                            }
                                                                            var19_17 = this.V;
                                                                            var11_18 = var9_11 = this.ac;
                                                                            if (var19_17 >= var9_11) {
                                                                                var11_18 = var19_17;
                                                                            }
                                                                            var20_19 = this.W;
                                                                            var9_11 = var10_12 = this.ad;
                                                                            if (var20_19 >= var10_12) {
                                                                                var9_11 = var20_19;
                                                                            }
                                                                            var16_21 = (var15_20 /* !! */  = (var34_8 = (Object)this.aq)[0]) != 3 ? 1 : 0;
                                                                            var21_22 = var34_8[1];
                                                                            var17_23 = var21_22 != 3 ? 1 : 0;
                                                                            this.B = var13_24 /* !! */  = this.Y;
                                                                            this.C = var8_25 = this.X;
                                                                            var12_26 = this.s;
                                                                            var18_27 = this.t;
                                                                            if (!(var8_25 > 0.0f) || (var10_12 = this.ah) == 8) break block75;
                                                                            var14_28 /* !! */  = var15_20 /* !! */ ;
                                                                            var10_12 = var12_26;
                                                                            if (var15_20 /* !! */  == 3) {
                                                                                if (var12_26 == 0) {
                                                                                    var14_28 /* !! */  = 3;
                                                                                    var10_12 = 3;
                                                                                } else {
                                                                                    var14_28 /* !! */  = 3;
                                                                                    var10_12 = var12_26;
                                                                                }
                                                                            }
                                                                            var12_26 = var18_27;
                                                                            var15_20 /* !! */  = var21_22;
                                                                            if (var21_22 == 3) {
                                                                                if (var18_27 == 0) {
                                                                                    var12_26 = 3;
                                                                                    var15_20 /* !! */  = 3;
                                                                                } else {
                                                                                    var15_20 /* !! */  = 3;
                                                                                    var12_26 = var18_27;
                                                                                }
                                                                            }
                                                                            if (var14_28 /* !! */  != 3 || var15_20 /* !! */  != 3 || var10_12 != 3) break block76;
                                                                            if (var12_26 != 3) break block77;
                                                                            if (var13_24 /* !! */  != -1) break block78;
                                                                            if (var16_21 == 0 || var17_23 != 0) break block79;
                                                                            this.B = 0;
                                                                            break block80;
                                                                        }
                                                                        if (var16_21 != 0 || var17_23 == 0) ** GOTO lbl-1000
                                                                        this.B = 1;
                                                                        this.C = 1.0f / var8_25;
                                                                        ** GOTO lbl-1000
                                                                    }
                                                                    if (var13_24 /* !! */  != 0) ** GOTO lbl-1000
                                                                }
                                                                if (!this.K.h() || !this.M.h()) {
                                                                    this.B = 1;
                                                                } else if (!(this.B != 1 || this.J.h() && this.L.h())) {
                                                                    this.B = 0;
                                                                }
                                                                if (!(this.B != -1 || this.K.h() && this.M.h() && this.J.h() && this.L.h())) {
                                                                    if (this.K.h() && this.M.h()) {
                                                                        this.B = 0;
                                                                    } else if (this.J.h() && this.L.h()) {
                                                                        this.C = 1.0f / this.C;
                                                                        this.B = 1;
                                                                    }
                                                                }
                                                                if ((var13_24 /* !! */  = this.B) != -1) break block81;
                                                                var14_28 /* !! */  = this.v;
                                                                if (var14_28 /* !! */  <= 0 || this.y != 0) break block82;
                                                                this.B = 0;
                                                                var13_24 /* !! */  = 0;
                                                                var15_20 /* !! */  = false;
                                                                break block83;
                                                            }
                                                            if (var14_28 /* !! */  != false || this.y <= 0) break block81;
                                                            this.C = 1.0f / this.C;
                                                            this.B = 1;
                                                            break block84;
                                                        }
                                                        var15_20 /* !! */  = var13_24 /* !! */ ;
                                                        break block83;
                                                    }
                                                    var16_21 = 3;
                                                    break block85;
                                                }
                                                var16_21 = var10_12;
                                            }
                                            if (var14_28 /* !! */  != 3 || var16_21 != 3) break block86;
                                            this.B = 0;
                                            var13_24 /* !! */  = (int)(var8_25 * (float)var20_19);
                                            if (var15_20 /* !! */  != 3) {
                                                var11_18 = 0;
                                                var14_28 /* !! */  = 4;
                                            } else {
                                                var11_18 = 1;
                                                var14_28 /* !! */  = var10_12;
                                            }
                                            var15_20 /* !! */  = false;
                                            var10_12 = var13_24 /* !! */ ;
                                            var13_24 /* !! */  = 0;
                                            break block87;
                                        }
                                        if (var15_20 /* !! */  != 3 || var12_26 != 3) break block88;
                                        this.B = 1;
                                        var7_29 = var8_25;
                                        if (var13_24 /* !! */  == -1) {
                                            this.C = var7_29 = 1.0f / var8_25;
                                        }
                                        var9_11 = (int)(var7_29 * (float)var19_17);
                                        if (var14_28 /* !! */  == 3) break block84;
                                        var14_28 /* !! */  = var10_12;
                                        var10_12 = var11_18;
                                        var13_24 /* !! */  = 1;
                                        var15_20 /* !! */  = true;
                                        var11_18 = 0;
                                        var12_26 = 4;
                                        break block87;
                                    }
                                    var13_24 /* !! */  = 1;
                                    var15_20 /* !! */  = true;
                                    break block83;
                                }
                                var14_28 /* !! */  = var13_24 /* !! */ ;
                                var15_20 /* !! */  = var13_24 /* !! */ ;
                                var13_24 /* !! */  = (int)var14_28 /* !! */ ;
                            }
                            var14_28 /* !! */  = var10_12;
                            var10_12 = var11_18;
                            var11_18 = 1;
                            break block87;
                        }
                        var16_21 = var13_24 /* !! */ ;
                        var10_12 = var11_18;
                        var11_18 = 0;
                        var14_28 /* !! */  = var12_26;
                        var12_26 = var18_27;
                        var15_20 /* !! */  = var13_24 /* !! */ ;
                        var13_24 /* !! */  = var16_21;
                    }
                    var34_8 = this.u;
                    var34_8[0] = var14_28 /* !! */ ;
                    var34_8[1] = var12_26;
                    var27_30 = var11_18 != 0 && (var15_20 /* !! */  == false || var15_20 /* !! */  == -1);
                    var26_31 = var11_18 != 0 && (var13_24 /* !! */  == 1 || var13_24 /* !! */  == -1);
                    var28_32 = this.aq[0] == 2 && this instanceof qh != false;
                    if (var28_32) {
                        var10_12 = 0;
                    }
                    var30_33 = this.Q.h() ^ true;
                    var34_8 = this.T;
                    var32_34 = var34_8[0];
                    var31_35 = var34_8[1];
                    var13_24 /* !! */  = this.p;
                    var36_14 = null;
                    if (var13_24 /* !! */  == 2 || this.b) break block89;
                    if (!var2_2 || (var34_8 = this.h) == null) ** GOTO lbl-1000
                    var35_13 = var34_8.h;
                    if (var35_13.i && var34_8.i.i) {
                        var1_1.f(var39_3, var35_13.f);
                        var1_1.f(var37_4, this.h.i.f);
                        if (this.U != null) {
                            if (var22_9) {
                                if (this.j[0] && !this.H()) {
                                    var1_1.g(var1_1.b(this.U.L), var37_4, 0, 8);
                                }
                                var22_9 = true;
                            } else {
                                var22_9 = false;
                            }
                        }
                    } else lbl-1000:
                    // 2 sources

                    {
                        var34_8 = (var34_8 = this.U) != null ? var1_1.b(var34_8.L) : null;
                        var35_13 = this.U;
                        var35_13 = var35_13 != null ? var1_1.b(var35_13.J) : null;
                        var33_36 = this.j[0];
                        var42_37 /* !! */  = this.aq;
                        var15_20 /* !! */  = var42_37 /* !! */ [0];
                        var44_38 = this.J;
                        var43_39 = this.L;
                        var16_21 = this.Z;
                        var17_23 = this.ac;
                        var13_24 /* !! */  = this.D[0];
                        var7_29 = this.ae;
                        var29_40 = var42_37 /* !! */ [1] == 3;
                        this.c(var1_1, true, var22_9, var23_10, var33_36, (qb)var35_13, (qb)var34_8, (int)var15_20 /* !! */ , var28_32, var44_38, var43_39, var16_21, var10_12, var17_23, var13_24 /* !! */ , var7_29, var27_30, var29_40, var25_15, var24_16, (boolean)var32_34, (int)var14_28 /* !! */ , var12_26, this.v, this.w, this.x, var30_33);
                    }
                }
                if (!var2_2 || (var34_8 = this.i) == null) ** GOTO lbl-1000
                var35_13 = var34_8.h;
                if (var35_13.i && var34_8.i.i) {
                    var10_12 = var35_13.f;
                    var1_1.f(var40_5, var10_12);
                    var10_12 = this.i.i.f;
                    var1_1.f((qb)var38_6, var10_12);
                    var1_1.f((qb)var41_7, this.i.a.f);
                    var34_8 = this.U;
                    if (var34_8 != null && !var24_16 && var23_10 && this.j[1]) {
                        var1_1.g(var1_1.b(var34_8.M), (qb)var38_6, 0, 8);
                    }
                    var10_12 = 0;
                } else lbl-1000:
                // 2 sources

                {
                    var10_12 = 1;
                }
                if (this.q == 2 || var10_12 == 0 || this.m) break block90;
                var2_2 = this.aq[1] == 2 && this instanceof qh != false;
                if (var2_2) {
                    var9_11 = 0;
                }
                var34_8 = (var34_8 = this.U) != null ? var1_1.b(var34_8.M) : null;
                var42_37 /* !! */  = (int[])this.U;
                var35_13 = var36_14;
                if (var42_37 /* !! */  != null) {
                    var35_13 = var1_1.b(var42_37 /* !! */ .K);
                }
                if ((var10_12 = this.ab) <= 0 && this.ah != 8) ** GOTO lbl318
                var36_14 = this.N;
                if (var36_14.e != null) {
                    var1_1.m((qb)var41_7, var40_5, var10_12, 8);
                    var1_1.m((qb)var41_7, var1_1.b(this.N.e), this.N.b(), 8);
                    if (var23_10) {
                        var1_1.g((qb)var34_8, var1_1.b(this.M), 0, 5);
                    }
                    var27_30 = false;
                } else {
                    if (this.ah == 8) {
                        var1_1.m((qb)var41_7, var40_5, var36_14.b(), 8);
                    } else {
                        var1_1.m((qb)var41_7, var40_5, var10_12, 8);
                    }
lbl318:
                    // 3 sources

                    var27_30 = var30_33;
                }
                var29_40 = this.j[1];
                var42_37 /* !! */  = this.aq;
                var15_20 /* !! */  = var42_37 /* !! */ [1];
                var41_7 = this.K;
                var36_14 = this.M;
                var13_24 /* !! */  = this.aa;
                var10_12 = this.ad;
                var16_21 = this.D[1];
                var7_29 = this.af;
                var28_32 = var42_37 /* !! */ [0] == 3;
                this.c(var1_1, false, var23_10, var22_9, var29_40, (qb)var35_13, (qb)var34_8, (int)var15_20 /* !! */ , var2_2, (qf)var41_7, (qf)var36_14, var13_24 /* !! */ , var9_11, var10_12, var16_21, var7_29, var26_31, var28_32, var24_16, var25_15, (boolean)var31_35, var12_26, (int)var14_28 /* !! */ , this.y, this.z, this.A, var27_30);
            }
            if (var11_18 != 0) {
                if (this.B == 1) {
                    var1_1.n((qb)var38_6, var40_5, var37_4, var39_3, this.C);
                } else {
                    var1_1.n(var37_4, var39_3, (qb)var38_6, var40_5, this.C);
                }
            }
            if (this.Q.h()) {
                var41_7 = this.Q.e.d;
                var7_29 = (float)Math.toRadians(this.E + 90.0f);
                var9_11 = this.Q.b();
                var34_8 = var1_1.b(this.K(2));
                var38_6 = var1_1.b(this.K(3));
                var36_14 = var1_1.b(this.K(4));
                var39_3 = var1_1.b(this.K(5));
                var35_13 = var1_1.b(var41_7.K(2));
                var40_5 = var1_1.b(var41_7.K(3));
                var37_4 = var1_1.b(var41_7.K(4));
                var42_37 /* !! */  = (int[])var1_1.b(var41_7.K(5));
                var41_7 = var1_1.a();
                var3_41 = var9_11;
                var5_42 = var7_29;
                var41_7.j((qb)var38_6, var39_3, var40_5, (qb)var42_37 /* !! */ , (float)(Math.sin(var5_42) * var3_41));
                var1_1.e((pw)var41_7);
                var38_6 = var1_1.a();
                var38_6.j((qb)var34_8, (qb)var36_14, (qb)var35_13, var37_4, (float)(Math.cos(var5_42) * var3_41));
                var1_1.e((pw)var38_6);
            }
        }
        this.b = false;
        this.m = false;
    }

    public boolean d() {
        return this.ah != 8;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean e() {
        boolean bl2;
        boolean bl3 = this.b;
        boolean bl4 = bl2 = true;
        if (bl3) return bl4;
        if (!this.J.c) return false;
        if (!this.L.c) return false;
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean f() {
        boolean bl2;
        boolean bl3 = this.m;
        boolean bl4 = bl2 = true;
        if (bl3) return bl4;
        if (!this.K.c) return false;
        if (!this.M.c) return false;
        return bl2;
    }

    public final int g() {
        return this.l() + this.W;
    }

    public final int h() {
        if (this.ah == 8) {
            return 0;
        }
        return this.W;
    }

    public final int i() {
        return this.k() + this.V;
    }

    public final int j() {
        if (this.ah == 8) {
            return 0;
        }
        return this.V;
    }

    public final int k() {
        qg qg2 = this.U;
        if (qg2 != null) {
            return ((qh)qg2).ar + this.Z;
        }
        return this.Z;
    }

    public final int l() {
        qg qg2 = this.U;
        if (qg2 != null) {
            return ((qh)qg2).as + this.aa;
        }
        return this.aa;
    }

    public final qg m(int n2) {
        block3: {
            qf qf2;
            block4: {
                block2: {
                    if (n2 != 0) break block2;
                    qf qf3 = this.L;
                    qf2 = qf3.e;
                    if (qf2 == null || qf2.e != qf3) break block3;
                    break block4;
                }
                if (n2 != 1) break block3;
                qf qf4 = this.M;
                qf2 = qf4.e;
                if (qf2 == null || qf2.e != qf4) break block3;
            }
            return qf2.d;
        }
        return null;
    }

    public final qg n(int n2) {
        block3: {
            qf qf2;
            block4: {
                block2: {
                    if (n2 != 0) break block2;
                    qf qf3 = this.J;
                    qf2 = qf3.e;
                    if (qf2 == null || qf2.e != qf3) break block3;
                    break block4;
                }
                if (n2 != 1) break block3;
                qf qf4 = this.K;
                qf2 = qf4.e;
                if (qf2 == null || qf2.e != qf4) break block3;
            }
            return qf2.d;
        }
        return null;
    }

    public final ra o(int n2) {
        if (n2 == 0) {
            return this.h;
        }
        if (n2 == 1) {
            return this.i;
        }
        return null;
    }

    public final void p(qh qh2, px px2, HashSet hashSet, int n2, boolean bl2) {
        block12: {
            block13: {
                block11: {
                    if (!bl2) break block11;
                    if (!hashSet.contains(this)) break block12;
                    ql.a(qh2, px2, this);
                    hashSet.remove(this);
                    this.b(px2, qh2.W(64));
                }
                if (n2 != 0) break block13;
                Object object = this.J.a;
                if (object != null) {
                    object = ((HashSet)object).iterator();
                    while (object.hasNext()) {
                        ((qf)object.next()).d.p(qh2, px2, hashSet, 0, true);
                    }
                }
                if ((object = this.L.a) == null) break block12;
                object = ((HashSet)object).iterator();
                while (object.hasNext()) {
                    ((qf)object.next()).d.p(qh2, px2, hashSet, 0, true);
                }
                break block12;
            }
            Object object = this.K.a;
            if (object != null) {
                object = ((HashSet)object).iterator();
                while (object.hasNext()) {
                    ((qf)object.next()).d.p(qh2, px2, hashSet, 1, true);
                }
            }
            if ((object = this.M.a) != null) {
                object = ((HashSet)object).iterator();
                while (object.hasNext()) {
                    ((qf)object.next()).d.p(qh2, px2, hashSet, 1, true);
                }
            }
            if ((object = this.N.a) != null) {
                Iterator iterator = ((HashSet)object).iterator();
                while (iterator.hasNext()) {
                    object = ((qf)iterator.next()).d;
                    ((qg)object).p(qh2, px2, hashSet, 1, true);
                }
            }
        }
    }

    public final void q(px px2) {
        px2.b(this.J);
        px2.b(this.K);
        px2.b(this.L);
        px2.b(this.M);
        if (this.ab > 0) {
            px2.b(this.N);
        }
    }

    public final void r() {
        if (this.h == null) {
            this.h = new qx(this);
        }
        if (this.i == null) {
            this.i = new qy(this);
        }
    }

    public void s() {
        this.J.d();
        this.K.d();
        this.L.d();
        this.M.d();
        this.N.d();
        this.O.d();
        this.P.d();
        this.Q.d();
        this.U = null;
        this.E = Float.NaN;
        this.V = 0;
        this.W = 0;
        this.X = 0.0f;
        this.Y = -1;
        this.Z = 0;
        this.aa = 0;
        this.ab = 0;
        this.ac = 0;
        this.ad = 0;
        this.ae = 0.5f;
        this.af = 0.5f;
        Object[] objectArray = this.aq;
        objectArray[0] = 1;
        objectArray[1] = 1;
        this.ag = null;
        this.ah = 0;
        this.aj = 0;
        this.ak = 0;
        objectArray = this.al;
        objectArray[0] = (int)-1.0f;
        objectArray[1] = (int)-1.0f;
        this.p = -1;
        this.q = -1;
        objectArray = this.D;
        objectArray[0] = Integer.MAX_VALUE;
        objectArray[1] = Integer.MAX_VALUE;
        this.s = 0;
        this.t = 0;
        this.x = 1.0f;
        this.A = 1.0f;
        this.w = Integer.MAX_VALUE;
        this.z = Integer.MAX_VALUE;
        this.v = 0;
        this.y = 0;
        this.B = -1;
        this.C = 1.0f;
        objectArray = this.j;
        objectArray[0] = 1;
        objectArray[1] = 1;
        this.G = false;
        objectArray = this.T;
        objectArray[0] = 0;
        objectArray[1] = 0;
        this.a = true;
        objectArray = this.u;
        objectArray[0] = 0;
        objectArray[1] = 0;
        this.k = -1;
        this.l = -1;
    }

    public final void t() {
        this.b = false;
        this.m = false;
        this.n = false;
        this.o = false;
        int n2 = this.S.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            qf qf2 = (qf)this.S.get(i2);
            qf2.c = false;
            qf2.b = 0;
        }
    }

    public String toString() {
        CharSequence charSequence = "";
        StringBuilder stringBuilder = new StringBuilder("");
        if (this.ai != null) {
            charSequence = new StringBuilder("id: ");
            ((StringBuilder)charSequence).append(this.ai);
            ((StringBuilder)charSequence).append(" ");
            charSequence = ((StringBuilder)charSequence).toString();
        }
        stringBuilder.append((String)charSequence);
        stringBuilder.append("(");
        stringBuilder.append(this.Z);
        stringBuilder.append(", ");
        stringBuilder.append(this.aa);
        stringBuilder.append(") - (");
        stringBuilder.append(this.V);
        stringBuilder.append(" x ");
        stringBuilder.append(this.W);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void u(int n2) {
        this.ab = n2;
        boolean bl2 = n2 > 0;
        this.F = bl2;
    }

    public final void v(int n2, int n3) {
        if (this.b) {
            return;
        }
        this.J.e(n2);
        this.L.e(n3);
        this.Z = n2;
        this.V = n3 - n2;
        this.b = true;
    }

    public final void w(int n2, int n3) {
        if (this.m) {
            return;
        }
        this.K.e(n2);
        this.M.e(n3);
        this.aa = n2;
        this.W = n3 - n2;
        if (this.F) {
            this.N.e(n2 + this.ab);
        }
        this.m = true;
    }

    public final void x(int n2) {
        this.W = n2;
        int n3 = this.ad;
        if (n2 < n3) {
            this.W = n3;
        }
    }

    protected final void y(int n2, boolean bl2) {
        this.T[n2] = bl2;
    }

    public final void z(int n2, int n3) {
        this.H = n2;
        this.I = n3;
        this.a = false;
    }
}

