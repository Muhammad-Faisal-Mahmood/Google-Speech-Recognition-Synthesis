/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.graphics.LinearGradient
 *  android.graphics.Path
 *  android.graphics.RadialGradient
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  android.graphics.SweepGradient
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.util.TypedValue
 *  android.util.Xml
 *  android.view.View
 *  android.view.Window
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 *  pt
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class kt {
    private static void A(ArrayList arrayList, char c2, float[] fArray) {
        arrayList.add(new th(c2, fArray));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void e(qh var0, px var1_1, ArrayList var2_2, int var3_3) {
        if (var3_3 == 0) {
            var9_4 = var0.at;
            var22_5 = var0.aw;
            var13_6 = 0;
        } else {
            var9_4 = var0.au;
            var22_5 = var0.av;
            var13_6 = 2;
        }
        var8_7 = 0;
        while (var8_7 < var9_4) {
            block109: {
                block118: {
                    block114: {
                        block117: {
                            block115: {
                                block116: {
                                    block113: {
                                        block112: {
                                            block108: {
                                                block102: {
                                                    var26_26 = var22_5[var8_7];
                                                    if (var26_26.t) break block102;
                                                    var10_12 = var26_26.o;
                                                    var12_14 = var10_12 + var10_12;
                                                    var23_23 = var21_22 = var26_26.a;
                                                    var10_12 = 0;
                                                    while (var10_12 == 0) {
                                                        block107: {
                                                            block106: {
                                                                block103: {
                                                                    block105: {
                                                                        block104: {
                                                                            var14_15 = var12_14 + 1;
                                                                            ++var26_26.i;
                                                                            var24_24 = var21_22.an;
                                                                            var10_12 = var26_26.o;
                                                                            var24_24[var10_12] = null;
                                                                            var21_22.am[var10_12] = null;
                                                                            if (var21_22.ah == 8) break block103;
                                                                            ++var26_26.l;
                                                                            if (var21_22.L(var10_12) != 3) {
                                                                                var11_13 = var26_26.m;
                                                                                var10_12 = var26_26.o == 0 ? var21_22.j() : var21_22.h();
                                                                                var26_26.m = var11_13 + var10_12;
                                                                            }
                                                                            var26_26.m = var10_12 = var26_26.m + var21_22.R[var12_14].b();
                                                                            var26_26.m = var10_12 + var21_22.R[var14_15].b();
                                                                            var26_26.n = var10_12 = var26_26.n + var21_22.R[var12_14].b();
                                                                            var26_26.n = var10_12 + var21_22.R[var14_15].b();
                                                                            if (var26_26.b == null) {
                                                                                var26_26.b = var21_22;
                                                                            }
                                                                            var26_26.d = var21_22;
                                                                            var24_24 = var21_22.aq;
                                                                            var15_16 = var26_26.o;
                                                                            if (var24_24[var15_16] != 3) break block103;
                                                                            var10_12 = var11_13 = var21_22.u[var15_16];
                                                                            if (var11_13 == 0) break block104;
                                                                            var10_12 = var11_13;
                                                                            if (var11_13 == 3) break block104;
                                                                            if (var11_13 != 2) break block105;
                                                                            var10_12 = 2;
                                                                        }
                                                                        ++var26_26.j;
                                                                        var4_8 = var21_22.al[var15_16];
                                                                        if (var4_8 > 0.0f) {
                                                                            var26_26.k += var4_8;
                                                                        }
                                                                        if (var21_22.ah != 8 && (var10_12 == 0 || var10_12 == 3)) {
                                                                            if (var4_8 < 0.0f) {
                                                                                var26_26.q = true;
                                                                            } else {
                                                                                var26_26.r = true;
                                                                            }
                                                                            if (var26_26.h == null) {
                                                                                var26_26.h = new ArrayList<E>();
                                                                            }
                                                                            var26_26.h.add(var21_22);
                                                                        }
                                                                        if (var26_26.f == null) {
                                                                            var26_26.f = var21_22;
                                                                        }
                                                                        if ((var24_24 = var26_26.g) != null) {
                                                                            var10_12 = var26_26.o;
                                                                            var24_24.am[var10_12] = var21_22;
                                                                        }
                                                                        var26_26.g = var21_22;
                                                                    }
                                                                    var10_12 = var26_26.o;
                                                                }
                                                                if (var23_23 != var21_22) {
                                                                    var23_23.an[var26_26.o] = var21_22;
                                                                }
                                                                if ((var23_23 = var21_22.R[var14_15].e) == null) break block106;
                                                                var23_23 = var23_23.d;
                                                                var24_24 = var23_23.R[var12_14].e;
                                                                if (var24_24 != null && var24_24.d == var21_22) break block107;
                                                            }
                                                            var23_23 = null;
                                                        }
                                                        var10_12 = var23_23 != null ? 0 : 1;
                                                        var24_24 = var23_23;
                                                        if (var23_23 == null) {
                                                            var24_24 = var21_22;
                                                        }
                                                        var23_23 = var21_22;
                                                        var21_22 = var24_24;
                                                    }
                                                    var23_23 = var26_26.b;
                                                    if (var23_23 != null) {
                                                        var26_26.m -= var23_23.R[var12_14].b();
                                                    }
                                                    if ((var23_23 = var26_26.d) != null) {
                                                        var26_26.m -= var23_23.R[var12_14 + 1].b();
                                                    }
                                                    var26_26.c = var21_22;
                                                    var26_26.e = var26_26.o == 0 && var26_26.p != false ? var26_26.c : var26_26.a;
                                                    var20_21 = var26_26.r != false && var26_26.q != false;
                                                    var26_26.s = var20_21;
                                                }
                                                var26_26.t = true;
                                                if (var2_2 == null || var2_2.contains(var26_26.a)) break block108;
                                                var11_13 = var8_7;
                                                var23_23 = var22_5;
                                                break block109;
                                            }
                                            var24_24 = var26_26.a;
                                            var33_33 = var26_26.c;
                                            var21_22 = var26_26.b;
                                            var32_32 = var26_26.d;
                                            var25_25 = var26_26.e;
                                            var4_8 = var26_26.k;
                                            var23_23 = var26_26.f;
                                            var23_23 = var26_26.g;
                                            var18_19 = var0.aq[var3_3];
                                            if (var3_3 == 0) {
                                                var12_14 = var25_25.aj;
                                                var10_12 = var12_14 == 0 ? 1 : 0;
                                                var11_13 = var12_14 == 1 ? 1 : 0;
                                                var12_14 = var12_14 == 2 ? 1 : 0;
                                                var23_23 = var24_24;
                                                var15_16 = var10_12;
                                                var10_12 = 0;
                                                var16_17 = var12_14;
                                                var12_14 = var10_12;
                                                var29_29 /* !! */  = var24_24;
                                                var10_12 = var9_4;
                                                var14_15 = var11_13;
                                            } else {
                                                var11_13 = var25_25.ak;
                                                var10_12 = var11_13 == 0 ? 1 : 0;
                                                var12_14 = var11_13 == 1 ? 1 : 0;
                                                var11_13 = var11_13 == 2 ? 1 : 0;
                                                var16_17 = 0;
                                                var23_23 = var24_24;
                                                var15_16 = var10_12;
                                                var14_15 = var12_14;
                                                var10_12 = var9_4;
                                                var29_29 /* !! */  = var24_24;
                                                var12_14 = var16_17;
                                                var16_17 = var11_13;
                                            }
                                            while (true) {
                                                block111: {
                                                    block110: {
                                                        var9_4 = var8_7;
                                                        if (var12_14 != 0) break;
                                                        var19_20 = var13_6 + 1;
                                                        var27_27 = var23_23.R[var13_6];
                                                        var9_4 = 1 != var16_17 ? 4 : 1;
                                                        var11_13 = var27_27.b();
                                                        var17_18 = var23_23.aq[var3_3] == 3 && var23_23.u[var3_3] == 0 ? 1 : 0;
                                                        var24_24 = var27_27.e;
                                                        var12_14 = var11_13;
                                                        if (var24_24 != null) {
                                                            var12_14 = var11_13;
                                                            if (var23_23 != var29_29 /* !! */ ) {
                                                                var12_14 = var11_13 + var24_24.b();
                                                            }
                                                        }
                                                        var11_13 = var9_4;
                                                        if (var16_17 != 0) {
                                                            var11_13 = var9_4;
                                                            if (var23_23 != var29_29 /* !! */ ) {
                                                                var11_13 = var9_4;
                                                                if (var23_23 != var21_22) {
                                                                    var11_13 = 8;
                                                                }
                                                            }
                                                        }
                                                        if (var24_24 != null) {
                                                            if (var23_23 == var21_22) {
                                                                var1_1.g(var27_27.h, var24_24.h, var12_14, 6);
                                                            } else {
                                                                var1_1.g(var27_27.h, var24_24.h, var12_14, 8);
                                                            }
                                                            var9_4 = var11_13;
                                                            if (var17_18 != 0) {
                                                                var9_4 = var11_13;
                                                                if (var16_17 == 0) {
                                                                    var9_4 = 5;
                                                                }
                                                            }
                                                            if (var23_23 == var21_22 && var16_17 != 0 && var23_23.T[var3_3]) {
                                                                var9_4 = 5;
                                                            }
                                                            var1_1.m(var27_27.h, var27_27.e.h, var12_14, var9_4);
                                                        }
                                                        if (var18_19 == 2) {
                                                            if (var23_23.ah != 8 && var23_23.aq[var3_3] == 3) {
                                                                var24_24 = var23_23.R;
                                                                var1_1.g(var24_24[var19_20].h, var24_24[var13_6].h, 0, 5);
                                                            }
                                                            var1_1.g(var23_23.R[var13_6].h, var0.R[var13_6].h, 0, 8);
                                                        }
                                                        if ((var24_24 = var23_23.R[var19_20].e) == null) break block110;
                                                        var24_24 = var24_24.d;
                                                        var27_27 = var24_24.R[var13_6].e;
                                                        if (var27_27 != null && var27_27.d == var23_23) break block111;
                                                    }
                                                    var24_24 = null;
                                                }
                                                var12_14 = var24_24 != null ? 0 : 1;
                                                if (var24_24 == null) continue;
                                                var23_23 = var24_24;
                                            }
                                            var28_28 = var22_5;
                                            if (var32_32 == null) break block112;
                                            var8_7 = var13_6 + 1;
                                            if (var33_33.R[var8_7].e == null) break block112;
                                            var22_5 = var32_32.R[var8_7];
                                            if (var32_32.aq[var3_3] != 3 || var32_32.u[var3_3] != 0 || var16_17 != 0) ** GOTO lbl-1000
                                            var23_23 = var22_5.e;
                                            if (var23_23.d == var0) {
                                                var1_1.m(var22_5.h, var23_23.h, -var22_5.b(), 5);
                                            } else if (var16_17 != 0) {
                                                var23_23 = var22_5.e;
                                                if (var23_23.d == var0) {
                                                    var1_1.m(var22_5.h, var23_23.h, -var22_5.b(), 4);
                                                }
                                            }
                                            var1_1.h(var22_5.h, var33_33.R[var8_7].e.h, -var22_5.b(), 6);
                                        }
                                        if (var18_19 == 2) {
                                            var8_7 = var13_6 + 1;
                                            var22_5 = var0.R[var8_7].h;
                                            var23_23 = var33_33.R[var8_7];
                                            var1_1.g((qb)var22_5, var23_23.h, var23_23.b(), 8);
                                        }
                                        if ((var22_5 = var26_26.h) != null && (var11_13 = var22_5.size()) > 1) {
                                            if (var26_26.q && !var26_26.s) {
                                                var4_8 = var26_26.j;
                                            }
                                            var23_23 = null;
                                            var6_10 = 0.0f;
                                            var5_9 = var4_8;
                                            for (var8_7 = 0; var8_7 < var11_13; ++var8_7) {
                                                var24_24 = (qg)var22_5.get(var8_7);
                                                var4_8 = var24_24.al[var3_3];
                                                if (var4_8 < 0.0f) {
                                                    if (var26_26.s) {
                                                        var24_24 = var24_24.R;
                                                        var1_1.m(var24_24[var13_6 + 1].h, var24_24[var13_6].h, 0, 4);
                                                        continue;
                                                    }
                                                    var4_8 = 1.0f;
                                                }
                                                if ((var12_14 = (int)((cfr_temp_0 = var4_8 - 0.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1))) == 0) {
                                                    var24_24 = var24_24.R;
                                                    var1_1.m(var24_24[var13_6 + 1].h, var24_24[var13_6].h, 0, 8);
                                                    continue;
                                                }
                                                if (var23_23 != null) {
                                                    var17_18 = var13_6 + 1;
                                                    var27_27 = var23_23.R;
                                                    var23_23 = var27_27[var13_6].h;
                                                    var31_31 = var27_27[var17_18].h;
                                                    var30_30 = var24_24.R;
                                                    var27_27 = var30_30[var13_6].h;
                                                    var30_30 = var30_30[var17_18].h;
                                                    var34_34 = var1_1.a();
                                                    var34_34.b = 0.0f;
                                                    if (var5_9 != 0.0f && var6_10 != var4_8) {
                                                        if (var6_10 == 0.0f) {
                                                            var34_34.e.g((qb)var23_23, 1.0f);
                                                            var34_34.e.g((qb)var31_31, -1.0f);
                                                        } else if (var12_14 == 0) {
                                                            var34_34.e.g((qb)var27_27, 1.0f);
                                                            var34_34.e.g((qb)var30_30, -1.0f);
                                                        } else {
                                                            var7_11 = var6_10 / var5_9;
                                                            var6_10 = var4_8 / var5_9;
                                                            var34_34.e.g((qb)var23_23, 1.0f);
                                                            var34_34.e.g((qb)var31_31, -1.0f);
                                                            var23_23 = var34_34.e;
                                                            var6_10 = var7_11 / var6_10;
                                                            var23_23.g((qb)var30_30, var6_10);
                                                            var34_34.e.g((qb)var27_27, -var6_10);
                                                        }
                                                    } else {
                                                        var34_34.e.g((qb)var23_23, 1.0f);
                                                        var34_34.e.g((qb)var31_31, -1.0f);
                                                        var34_34.e.g((qb)var30_30, 1.0f);
                                                        var34_34.e.g((qb)var27_27, -1.0f);
                                                    }
                                                    var1_1.e((pw)var34_34);
                                                }
                                                var23_23 = var24_24;
                                                var6_10 = var4_8;
                                            }
                                        }
                                        if (var21_22 == null || var21_22 != var32_32 && var16_17 == 0) break block113;
                                        var8_7 = var13_6 + 1;
                                        var22_5 = var29_29 /* !! */ .R[var13_6];
                                        var24_24 = var33_33.R[var8_7];
                                        var22_5 = var22_5.e;
                                        var22_5 = var22_5 != null ? var22_5.h : null;
                                        var23_23 = var24_24.e;
                                        var23_23 = var23_23 != null ? var23_23.h : null;
                                        var26_26 = var21_22.R[var13_6];
                                        if (var32_32 != null) {
                                            var24_24 = var32_32.R[var8_7];
                                        }
                                        if (var22_5 != null && var23_23 != null) {
                                            var4_8 = var3_3 == 0 ? var25_25.ae : var25_25.af;
                                            var11_13 = var26_26.b();
                                            var8_7 = var24_24.b();
                                            var1_1.d(var26_26.h, (qb)var22_5, var11_13, var4_8, (qb)var23_23, var24_24.h, var8_7, 7);
                                            var8_7 = var9_4;
                                        } else {
                                            var8_7 = var9_4;
                                        }
                                        break block114;
                                    }
                                    var8_7 = var9_4;
                                    if (var15_16 == 0) break block115;
                                    if (var21_22 == null) break block116;
                                    var9_4 = var26_26.j;
                                    var9_4 = var9_4 > 0 && var26_26.i == var9_4 ? 1 : 0;
                                    var24_24 = var25_25 = var21_22;
                                    var11_13 = var9_4;
                                    while (var24_24 != null) {
                                        var23_23 = var24_24.an[var3_3];
                                        while (var23_23 != null && var23_23.ah == 8) {
                                            var23_23 = var23_23.an[var3_3];
                                        }
                                        if (var23_23 != null || var24_24 == var32_32) {
                                            var16_17 = var13_6 + 1;
                                            var26_26 = var24_24.R[var13_6];
                                            var30_30 = var26_26.h;
                                            var22_5 = var26_26.e;
                                            var22_5 = var22_5 != null ? var22_5.h : null;
                                            if (var25_25 != var24_24) {
                                                var22_5 = var25_25.R[var16_17].h;
                                            } else if (var24_24 == var21_22) {
                                                var22_5 = var29_29 /* !! */ .R[var13_6].e;
                                                var22_5 = var22_5 != null ? var22_5.h : null;
                                            }
                                            var17_18 = var26_26.b();
                                            var12_14 = var24_24.R[var16_17].b();
                                            if (var23_23 != null) {
                                                var27_27 = var23_23.R[var13_6];
                                                var26_26 = var27_27.h;
                                            } else {
                                                var27_27 = var33_33.R[var16_17].e;
                                                var26_26 = var27_27 != null ? var27_27.h : null;
                                            }
                                            var31_31 = var24_24.R[var16_17].h;
                                            var9_4 = var12_14;
                                            if (var27_27 != null) {
                                                var9_4 = var12_14 + var27_27.b();
                                            }
                                            var12_14 = var17_18 + var25_25.R[var16_17].b();
                                            if (var30_30 != null && var22_5 != null && var26_26 != null && var31_31 != null) {
                                                if (var24_24 == var21_22) {
                                                    var12_14 = var21_22.R[var13_6].b();
                                                }
                                                if (var24_24 == var32_32) {
                                                    var9_4 = var32_32.R[var16_17].b();
                                                }
                                                var16_17 = 1 != var11_13 ? 5 : 8;
                                                var1_1.d((qb)var30_30, (qb)var22_5, var12_14, 0.5f, (qb)var26_26, (qb)var31_31, var9_4, var16_17);
                                            }
                                        }
                                        if (var24_24.ah != 8) {
                                            var25_25 = var24_24;
                                        }
                                        var24_24 = var23_23;
                                    }
                                    break block114;
                                }
                                var22_5 = null;
                                break block117;
                            }
                            var22_5 = var21_22;
                        }
                        var11_13 = var9_4;
                        var9_4 = 8;
                        if (var14_15 != 0 && var21_22 != null) {
                            var16_17 = var13_6 + 1;
                            var8_7 = var26_26.j;
                            var8_7 = var8_7 > 0 && var26_26.i == var8_7 ? 1 : 0;
                            var25_25 = var24_24 = var21_22;
                            var23_23 = var22_5;
                            var12_14 = var8_7;
                            var22_5 = var25_25;
                            while ((var26_26 = var22_5) != null) {
                                var22_5 = var26_26.an[var3_3];
                                while (var22_5 != null && var22_5.ah == var9_4) {
                                    var22_5 = var22_5.an[var3_3];
                                }
                                if (var26_26 != var21_22 && var26_26 != var32_32 && var22_5 != null) {
                                    if (var22_5 == var32_32) {
                                        var22_5 = null;
                                    }
                                    var25_25 = var26_26.R[var13_6];
                                    var34_34 = var25_25.h;
                                    var27_27 = var25_25.e;
                                    var35_35 = var24_24.R[var16_17].h;
                                    var17_18 = var25_25.b();
                                    var9_4 = var26_26.R[var16_17].b();
                                    if (var22_5 != null) {
                                        var30_30 = var22_5.R[var13_6];
                                        var31_31 = var30_30.h;
                                        var25_25 = var30_30.e;
                                        var25_25 = var25_25 != null ? var25_25.h : null;
                                        var27_27 = var25_25;
                                    } else {
                                        var27_27 = var32_32.R[var13_6];
                                        var25_25 = var27_27 != null ? var27_27.h : null;
                                        var30_30 = var26_26.R[var16_17].h;
                                        var31_31 = var25_25;
                                        var25_25 = var27_27;
                                        var27_27 = var30_30;
                                        var30_30 = var25_25;
                                    }
                                    var8_7 = var9_4;
                                    if (var30_30 != null) {
                                        var8_7 = var9_4 + var30_30.b();
                                    }
                                    var18_19 = var24_24.R[var16_17].b();
                                    var9_4 = 1 != var12_14 ? 4 : 8;
                                    if (var34_34 != null && var35_35 != null && var31_31 != null && var27_27 != null) {
                                        var1_1.d((qb)var34_34, var35_35, var18_19 + var17_18, 0.5f, (qb)var31_31, (qb)var27_27, var8_7, var9_4);
                                    }
                                    var8_7 = 8;
                                } else {
                                    var8_7 = var9_4;
                                }
                                if (var26_26.ah != var8_7) {
                                    var24_24 = var26_26;
                                }
                                var9_4 = var8_7;
                            }
                            var22_5 = var21_22.R[var13_6];
                            var26_26 = var29_29 /* !! */ .R[var13_6].e;
                            var24_24 = var32_32.R[var16_17];
                            var25_25 = var33_33.R[var16_17].e;
                            if (var26_26 != null) {
                                if (var21_22 != var32_32) {
                                    var1_1.m(var22_5.h, var26_26.h, var22_5.b(), 5);
                                } else if (var25_25 != null) {
                                    var1_1.d(var22_5.h, var26_26.h, var22_5.b(), 0.5f, var24_24.h, var25_25.h, var24_24.b(), 5);
                                }
                            }
                            var22_5 = var23_23;
                            if (var25_25 != null) {
                                var22_5 = var23_23;
                                if (var21_22 != var32_32) {
                                    var1_1.m(var24_24.h, var25_25.h, -var24_24.b(), 5);
                                    var22_5 = var23_23;
                                }
                            }
                        }
                        var21_22 = var22_5;
                        var8_7 = var11_13;
                    }
                    if (var15_16 != 0) break block118;
                    var11_13 = var8_7;
                    var9_4 = var10_12;
                    var23_23 = var28_28;
                    if (var14_15 == 0) break block109;
                }
                var11_13 = var8_7;
                var9_4 = var10_12;
                var23_23 = var28_28;
                if (var21_22 != null) {
                    var11_13 = var8_7;
                    var9_4 = var10_12;
                    var23_23 = var28_28;
                    if (var21_22 != var32_32) {
                        var12_14 = var13_6 + 1;
                        var23_23 = var21_22.R;
                        var27_27 = var23_23[var13_6];
                        var24_24 = var32_32 == null ? var21_22 : var32_32;
                        var26_26 = var24_24.R[var12_14];
                        var22_5 = var27_27.e;
                        var25_25 = var22_5 != null ? var22_5.h : null;
                        var22_5 = var26_26.e;
                        var22_5 = var22_5 != null ? var22_5.h : null;
                        if (var33_33 != var24_24) {
                            var22_5 = var33_33.R[var12_14].e;
                            var22_5 = var22_5 != null ? var22_5.h : null;
                        }
                        if (var21_22 == var24_24) {
                            var26_26 = var23_23[var12_14];
                        }
                        var11_13 = var8_7;
                        var9_4 = var10_12;
                        var23_23 = var28_28;
                        if (var25_25 != null) {
                            var11_13 = var8_7;
                            var9_4 = var10_12;
                            var23_23 = var28_28;
                            if (var22_5 != null) {
                                var9_4 = var27_27.b();
                                var11_13 = var24_24.R[var12_14].b();
                                var1_1.d(var27_27.h, (qb)var25_25, var9_4, 0.5f, (qb)var22_5, var26_26.h, var11_13, 5);
                                var23_23 = var28_28;
                                var9_4 = var10_12;
                                var11_13 = var8_7;
                            }
                        }
                    }
                }
            }
            var8_7 = var11_13 + 1;
            var22_5 = var23_23;
        }
    }

    public static Object f(hpn object, jqb jqb2) {
        block3: {
            try {
                if (object.isDone()) {
                    object = a.h((Future)object);
                    return object;
                }
                jul jul2 = new jul(jjj.n(jqb2), 1);
                jul2.r();
                object.c(new bcv(object, jul2, 1), (Executor)pt.a);
                jul2.s(new mz(object, 3));
                object = jul2.a();
                if (object != jqh.a) break block3;
            }
            catch (ExecutionException executionException) {
                throw kt.g(executionException);
            }
            jsd.j(jqb2);
        }
        return object;
    }

    public static Throwable g(ExecutionException throwable) {
        throwable = throwable.getCause();
        jse.b(throwable);
        return throwable;
    }

    /*
     * Unable to fully structure code
     */
    public static void h(th[] var0, Path var1_1) {
        var25_2 = new float[6];
        var13_3 = var0.length;
        var14_4 = 0;
        var15_5 = 109;
        while (var14_4 < var13_3) {
            var24_25 = var0[var14_4];
            var17_18 = var24_25.a;
            var23_24 = var24_25.b;
            var10_14 = var25_2[0];
            var9_13 = var25_2[1];
            var11_15 = var25_2[2];
            var8_12 = var25_2[3];
            var7_11 = var25_2[4];
            var6_10 = var25_2[5];
            var3_7 = var10_14;
            var2_6 = var9_13;
            var4_8 = var11_15;
            var5_9 = var8_12;
            switch (var17_18) {
                default: {
                    var3_7 = var10_14;
                    var2_6 = var9_13;
                    var4_8 = var11_15;
                    var5_9 = var8_12;
                    ** GOTO lbl39
                }
                case 90: 
                case 122: {
                    var1_1.close();
                    var1_1.moveTo(var7_11, var6_10);
                    var4_8 = var3_7 = var7_11;
                    var5_9 = var2_6 = var6_10;
                    ** GOTO lbl39
                }
                case 81: 
                case 83: 
                case 113: 
                case 115: {
                    var12_16 = 4;
                    var3_7 = var10_14;
                    var2_6 = var9_13;
                    var4_8 = var11_15;
                    var5_9 = var8_12;
                    break;
                }
lbl39:
                // 3 sources

                case 76: 
                case 77: 
                case 84: 
                case 108: 
                case 109: 
                case 116: {
                    var12_16 = 2;
                    break;
                }
                case 72: 
                case 86: 
                case 104: 
                case 118: {
                    var12_16 = 1;
                    var3_7 = var10_14;
                    var2_6 = var9_13;
                    var4_8 = var11_15;
                    var5_9 = var8_12;
                    break;
                }
                case 67: 
                case 99: {
                    var12_16 = 6;
                    var3_7 = var10_14;
                    var2_6 = var9_13;
                    var4_8 = var11_15;
                    var5_9 = var8_12;
                    break;
                }
                case 65: 
                case 97: {
                    var12_16 = 7;
                    var5_9 = var8_12;
                    var4_8 = var11_15;
                    var2_6 = var9_13;
                    var3_7 = var10_14;
                }
            }
            var8_12 = var3_7;
            var18_19 = 0;
            var3_7 = var2_6;
            var2_6 = var8_12;
            var16_17 = var14_4;
            var14_4 = var17_18;
            for (var17_18 = var18_19; var17_18 < var23_24.length; var17_18 += var12_16) {
                block26: {
                    block51: {
                        block27: {
                            block28: {
                                block29: {
                                    block30: {
                                        block31: {
                                            block32: {
                                                block50: {
                                                    block44: {
                                                        block33: {
                                                            block34: {
                                                                block35: {
                                                                    block36: {
                                                                        block37: {
                                                                            block38: {
                                                                                block49: {
                                                                                    block48: {
                                                                                        block39: {
                                                                                            block47: {
                                                                                                block46: {
                                                                                                    block40: {
                                                                                                        block41: {
                                                                                                            block45: {
                                                                                                                block42: {
                                                                                                                    block43: {
                                                                                                                        if (var14_4 == 65) break block27;
                                                                                                                        if (var14_4 == 67) break block28;
                                                                                                                        if (var14_4 == 72) break block29;
                                                                                                                        if (var14_4 == 81) break block30;
                                                                                                                        if (var14_4 == 86) break block31;
                                                                                                                        if (var14_4 == 97) break block32;
                                                                                                                        if (var14_4 == 99) break block33;
                                                                                                                        if (var14_4 == 104) break block34;
                                                                                                                        if (var14_4 == 113) break block35;
                                                                                                                        if (var14_4 == 118) break block36;
                                                                                                                        if (var14_4 == 76) break block37;
                                                                                                                        if (var14_4 == 77) break block38;
                                                                                                                        if (var14_4 == 83) break block39;
                                                                                                                        if (var14_4 == 84) break block40;
                                                                                                                        if (var14_4 == 108) break block41;
                                                                                                                        if (var14_4 == 109) break block42;
                                                                                                                        if (var14_4 == 115) break block43;
                                                                                                                        if (var14_4 == 116) {
                                                                                                                            var18_19 = var17_18 + 1;
                                                                                                                            if (var15_5 != 113 && var15_5 != 116 && var15_5 != 81 && var15_5 != 84) {
                                                                                                                                var5_9 = 0.0f;
                                                                                                                                var4_8 = 0.0f;
                                                                                                                            } else {
                                                                                                                                var5_9 = var3_7 - var5_9;
                                                                                                                                var4_8 = var2_6 - var4_8;
                                                                                                                            }
                                                                                                                            var1_1.rQuadTo(var4_8, var5_9, var23_24[var17_18], var23_24[var18_19]);
                                                                                                                            var9_13 = var2_6 + var23_24[var17_18];
                                                                                                                            var8_12 = var3_7 + var23_24[var18_19];
                                                                                                                            var5_9 += var3_7;
                                                                                                                            var4_8 += var2_6;
                                                                                                                            var2_6 = var9_13;
                                                                                                                            var3_7 = var8_12;
                                                                                                                        }
                                                                                                                        break block26;
                                                                                                                    }
                                                                                                                    var20_21 = var17_18 + 3;
                                                                                                                    var19_20 = var17_18 + 2;
                                                                                                                    var18_19 = var17_18 + 1;
                                                                                                                    if (var15_5 != 99 && var15_5 != 115 && var15_5 != 67 && var15_5 != 83) {
                                                                                                                        var5_9 = 0.0f;
                                                                                                                        var4_8 = 0.0f;
                                                                                                                    } else {
                                                                                                                        var8_12 = var2_6 - var4_8;
                                                                                                                        var4_8 = var3_7 - var5_9;
                                                                                                                        var5_9 = var8_12;
                                                                                                                    }
                                                                                                                    var11_15 = var23_24[var17_18];
                                                                                                                    var9_13 = var23_24[var18_19];
                                                                                                                    var10_14 = var23_24[var19_20];
                                                                                                                    var8_12 = var23_24[var20_21];
                                                                                                                    var1_1.rCubicTo(var5_9, var4_8, var11_15, var9_13, var10_14, var8_12);
                                                                                                                    var9_13 = var23_24[var17_18] + var2_6;
                                                                                                                    var4_8 = var23_24[var18_19] + var3_7;
                                                                                                                    var8_12 = var2_6 + var23_24[var19_20];
                                                                                                                    var5_9 = var23_24[var20_21];
                                                                                                                    var2_6 = var9_13;
                                                                                                                    break block44;
                                                                                                                }
                                                                                                                var8_12 = var23_24[var17_18];
                                                                                                                var2_6 += var8_12;
                                                                                                                var9_13 = var23_24[var17_18 + 1];
                                                                                                                var3_7 += var9_13;
                                                                                                                if (var17_18 <= 0) break block45;
                                                                                                                var1_1.rLineTo(var8_12, var9_13);
                                                                                                                break block26;
                                                                                                            }
                                                                                                            var1_1.rMoveTo(var8_12, var9_13);
                                                                                                            ** GOTO lbl184
                                                                                                        }
                                                                                                        var15_5 = var17_18 + 1;
                                                                                                        var1_1.rLineTo(var23_24[var17_18], var23_24[var15_5]);
                                                                                                        var2_6 += var23_24[var17_18];
                                                                                                        var8_12 = var23_24[var15_5];
lbl140:
                                                                                                        // 2 sources

                                                                                                        while (true) {
                                                                                                            var3_7 += var8_12;
                                                                                                            break block26;
                                                                                                            break;
                                                                                                        }
                                                                                                    }
                                                                                                    var18_19 = var17_18 + 1;
                                                                                                    if (var15_5 == 113 || var15_5 == 116 || var15_5 == 81) break block46;
                                                                                                    var9_13 = var2_6;
                                                                                                    var8_12 = var3_7;
                                                                                                    if (var15_5 != 84) break block47;
                                                                                                }
                                                                                                var8_12 = var3_7 + var3_7 - var5_9;
                                                                                                var9_13 = var2_6 + var2_6 - var4_8;
                                                                                            }
                                                                                            var1_1.quadTo(var9_13, var8_12, var23_24[var17_18], var23_24[var18_19]);
                                                                                            var2_6 = var23_24[var17_18];
                                                                                            var3_7 = var23_24[var18_19];
                                                                                            var4_8 = var9_13;
                                                                                            var5_9 = var8_12;
                                                                                            break block26;
                                                                                        }
                                                                                        var20_21 = var17_18 + 3;
                                                                                        var18_19 = var17_18 + 2;
                                                                                        var19_20 = var17_18 + 1;
                                                                                        if (var15_5 == 99 || var15_5 == 115 || var15_5 == 67) break block48;
                                                                                        var9_13 = var2_6;
                                                                                        var8_12 = var3_7;
                                                                                        if (var15_5 != 83) break block49;
                                                                                    }
                                                                                    var8_12 = var3_7 + var3_7 - var5_9;
                                                                                    var9_13 = var2_6 + var2_6 - var4_8;
                                                                                }
                                                                                var1_1.cubicTo(var9_13, var8_12, var23_24[var17_18], var23_24[var19_20], var23_24[var18_19], var23_24[var20_21]);
                                                                                var2_6 = var23_24[var17_18];
                                                                                var4_8 = var23_24[var19_20];
                                                                                var8_12 = var23_24[var18_19];
                                                                                var3_7 = var23_24[var20_21];
                                                                                break block50;
                                                                            }
                                                                            var2_6 = var23_24[var17_18];
                                                                            var3_7 = var23_24[var17_18 + 1];
                                                                            if (var17_18 > 0) {
                                                                                var1_1.lineTo(var2_6, var3_7);
                                                                            } else {
                                                                                var1_1.moveTo(var2_6, var3_7);
lbl184:
                                                                                // 2 sources

                                                                                var7_11 = var2_6;
                                                                                var6_10 = var3_7;
                                                                            }
                                                                            break block26;
                                                                        }
                                                                        var15_5 = var17_18 + 1;
                                                                        var1_1.lineTo(var23_24[var17_18], var23_24[var15_5]);
                                                                        var2_6 = var23_24[var17_18];
                                                                        var3_7 = var23_24[var15_5];
                                                                        break block26;
                                                                    }
                                                                    var1_1.rLineTo(0.0f, var23_24[var17_18]);
                                                                    var8_12 = var23_24[var17_18];
                                                                    ** continue;
                                                                }
                                                                var18_19 = var17_18 + 3;
                                                                var19_20 = var17_18 + 2;
                                                                var15_5 = var17_18 + 1;
                                                                var1_1.rQuadTo(var23_24[var17_18], var23_24[var15_5], var23_24[var19_20], var23_24[var18_19]);
                                                                var4_8 = var23_24[var17_18];
                                                                var5_9 = var23_24[var15_5];
                                                                var9_13 = var2_6 + var23_24[var19_20];
                                                                var8_12 = var3_7 + var23_24[var18_19];
                                                                var5_9 += var3_7;
                                                                var4_8 += var2_6;
                                                                var2_6 = var9_13;
                                                                var3_7 = var8_12;
                                                                break block26;
                                                            }
                                                            var1_1.rLineTo(var23_24[var17_18], 0.0f);
                                                            var2_6 += var23_24[var17_18];
                                                            break block26;
                                                        }
                                                        var18_19 = var17_18 + 5;
                                                        var20_21 = var17_18 + 4;
                                                        var15_5 = var17_18 + 3;
                                                        var19_20 = var17_18 + 2;
                                                        var1_1.rCubicTo(var23_24[var17_18], var23_24[var17_18 + 1], var23_24[var19_20], var23_24[var15_5], var23_24[var20_21], var23_24[var18_19]);
                                                        var9_13 = var23_24[var19_20] + var2_6;
                                                        var4_8 = var23_24[var15_5] + var3_7;
                                                        var8_12 = var2_6 + var23_24[var20_21];
                                                        var5_9 = var23_24[var18_19];
                                                        var2_6 = var9_13;
                                                    }
                                                    var3_7 += var5_9;
                                                }
                                                var5_9 = var4_8;
                                                var4_8 = var2_6;
                                                var2_6 = var8_12;
                                                break block26;
                                            }
                                            var18_19 = var17_18 + 6;
                                            var15_5 = var17_18 + 5;
                                            var5_9 = var23_24[var15_5];
                                            var8_12 = var23_24[var18_19];
                                            var9_13 = var23_24[var17_18];
                                            var10_14 = var23_24[var17_18 + 1];
                                            var4_8 = var23_24[var17_18 + 2];
                                            var21_22 = var23_24[var17_18 + 3] != 0.0f;
                                            var22_23 = var23_24[var17_18 + 4] != 0.0f;
                                            th.a(var1_1, var2_6, var3_7, var5_9 + var2_6, var8_12 + var3_7, var9_13, var10_14, var4_8, var21_22, var22_23);
                                            var2_6 += var23_24[var15_5];
                                            var3_7 += var23_24[var18_19];
                                            break block51;
                                        }
                                        var1_1.lineTo(var2_6, var23_24[var17_18]);
                                        var3_7 = var23_24[var17_18];
                                        break block26;
                                    }
                                    var15_5 = var17_18 + 3;
                                    var19_20 = var17_18 + 2;
                                    var18_19 = var17_18 + 1;
                                    var1_1.quadTo(var23_24[var17_18], var23_24[var18_19], var23_24[var19_20], var23_24[var15_5]);
                                    var4_8 = var23_24[var17_18];
                                    var5_9 = var23_24[var18_19];
                                    var2_6 = var23_24[var19_20];
                                    var3_7 = var23_24[var15_5];
                                    break block26;
                                }
                                var1_1.lineTo(var23_24[var17_18], var3_7);
                                var2_6 = var23_24[var17_18];
                                break block26;
                            }
                            var18_19 = var17_18 + 5;
                            var15_5 = var17_18 + 4;
                            var19_20 = var17_18 + 3;
                            var20_21 = var17_18 + 2;
                            var1_1.cubicTo(var23_24[var17_18], var23_24[var17_18 + 1], var23_24[var20_21], var23_24[var19_20], var23_24[var15_5], var23_24[var18_19]);
                            var2_6 = var23_24[var15_5];
                            var3_7 = var23_24[var18_19];
                            var4_8 = var23_24[var20_21];
                            var5_9 = var23_24[var19_20];
                            break block26;
                        }
                        var15_5 = var17_18 + 6;
                        var18_19 = var17_18 + 5;
                        var8_12 = var23_24[var18_19];
                        var10_14 = var23_24[var15_5];
                        var5_9 = var23_24[var17_18];
                        var4_8 = var23_24[var17_18 + 1];
                        var9_13 = var23_24[var17_18 + 2];
                        var21_22 = var23_24[var17_18 + 3] != 0.0f;
                        var22_23 = var23_24[var17_18 + 4] != 0.0f;
                        th.a(var1_1, var2_6, var3_7, var8_12, var10_14, var5_9, var4_8, var9_13, var21_22, var22_23);
                        var2_6 = var23_24[var18_19];
                        var3_7 = var23_24[var15_5];
                    }
                    var4_8 = var2_6;
                    var5_9 = var3_7;
                }
                var18_19 = var13_3;
                var13_3 = var14_4;
                var15_5 = var14_4;
                var14_4 = var13_3;
                var13_3 = var18_19;
            }
            var25_2[0] = var2_6;
            var25_2[1] = var3_7;
            var25_2[2] = var4_8;
            var25_2[3] = var5_9;
            var25_2[4] = var7_11;
            var25_2[5] = var6_10;
            var15_5 = var24_25.a;
            var14_4 = var16_17 + 1;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static th[] i(String var0) {
        var14_2 = new ArrayList<E>();
        var1_3 = 0;
        var2_4 = 1;
        var4_5 = 0;
        while (true) {
            block20: {
                block21: {
                    var3_6 = var2_4;
                    if (var2_4 >= var0.length()) {
                        if (var2_4 - var4_5 == 1 && var4_5 < var0.length()) {
                            kt.A(var14_2, var0.charAt(var4_5), new float[var1_3]);
                        }
                        return var14_2.toArray(new th[var1_3]);
                    }
                    while (var3_6 < var0.length() && (((var2_4 = (int)var0.charAt(var3_6)) - 65) * (var2_4 - 90) > 0 && (var2_4 - 97) * (var2_4 - 122) > 0 || var2_4 == 101 || var2_4 == 69)) {
                        ++var3_6;
                    }
                    var13_15 = var0.substring(var4_5, var3_6).trim();
                    if (var13_15.isEmpty()) break block20;
                    if (var13_15.charAt(var1_3) == 'z' || var13_15.charAt(var1_3) == 'Z') break block21;
                    var12_14 = new float[var13_15.length()];
                    var11_13 = var13_15.length();
                    var4_5 = 1;
                    var8_10 = var1_3;
                    while (var4_5 < var11_13) {
                        var6_8 = var5_7 = (var1_3 = (var2_4 = var1_3));
                        var10_12 = var4_5;
                        var7_9 = var5_7;
                        var9_11 = var1_3;
                        var5_7 = var10_12;
                        while (true) {
                            var1_3 = var6_8;
                            if (var5_7 >= var13_15.length()) break;
                            var1_3 = var13_15.charAt(var5_7);
                            if (var1_3 == 32) ** GOTO lbl-1000
                            if (var1_3 == 69 || var1_3 == 101) ** GOTO lbl60
                            block4 : switch (var1_3) {
                                default: {
                                    var1_3 = var2_4;
lbl38:
                                    // 4 sources

                                    while (true) {
                                        var9_11 = 0;
                                        var2_4 = var1_3;
                                        var1_3 = var9_11;
                                        break block4;
                                        break;
                                    }
                                }
                                case 46: {
                                    if (var2_4 != 0) ** GOTO lbl47
                                    var1_3 = 1;
                                    ** GOTO lbl38
lbl47:
                                    // 1 sources

                                    var2_4 = 1;
lbl48:
                                    // 2 sources

                                    while (true) {
                                        var1_3 = 0;
                                        var7_9 = 1;
                                        var6_8 = 1;
                                        break block4;
                                        break;
                                    }
                                }
                                case 45: {
                                    var1_3 = var2_4;
                                    if (var5_7 == var4_5) ** GOTO lbl38
                                    var1_3 = var2_4;
                                    if (var9_11 == 0) ** break;
                                    ** continue;
                                    ** continue;
                                }
lbl60:
                                // 1 sources

                                var1_3 = 1;
                                break;
                                case 44: lbl-1000:
                                // 2 sources

                                {
                                    var1_3 = 0;
                                    var7_9 = 1;
                                }
                            }
                            if (var7_9 != 0) {
                                var1_3 = var6_8;
                                break;
                            }
                            ++var5_7;
                            var9_11 = var1_3;
                        }
                        var2_4 = var8_10;
                        if (var4_5 < var5_7) {
                            var12_14[var8_10] = Float.parseFloat(var13_15.substring(var4_5, var5_7));
                            var2_4 = var8_10 + 1;
                        }
                        var4_5 = var1_3 != 0 ? var5_7 : var5_7 + 1;
                        var1_3 = 0;
                        var8_10 = var2_4;
                    }
                    try {
                        var12_14 = kt.k(var12_14, var8_10);
                        var1_3 = 0;
                    }
                    catch (NumberFormatException var0_1) {
                        throw new RuntimeException(a.aj(var13_15, "error in parsing \"", "\""), var0_1);
                    }
                }
                var12_14 = new float[var1_3];
                kt.A(var14_2, var13_15.charAt(var1_3), var12_14);
            }
            var4_5 = var3_6;
            var2_4 = var3_6 + 1;
        }
    }

    public static th[] j(th[] thArray) {
        th[] thArray2 = new th[thArray.length];
        for (int i2 = 0; i2 < thArray.length; ++i2) {
            thArray2[i2] = new th(thArray[i2]);
        }
        return thArray2;
    }

    public static float[] k(float[] fArray, int n2) {
        if (n2 >= 0) {
            int n3 = Math.min(n2, fArray.length);
            float[] fArray2 = new float[n2];
            System.arraycopy(fArray, 0, fArray2, 0, n3);
            return fArray2;
        }
        throw new IllegalArgumentException();
    }

    public static float l(TypedArray typedArray, XmlPullParser xmlPullParser, String string, int n2, float f2) {
        if (!kt.t(xmlPullParser, string)) {
            return f2;
        }
        return typedArray.getFloat(n2, f2);
    }

    public static int m(Context context, int n2, int n3) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(n2, typedValue, true);
        if (typedValue.resourceId != 0) {
            return n2;
        }
        return n3;
    }

    public static int n(TypedArray typedArray, XmlPullParser xmlPullParser, String string, int n2, int n3) {
        if (!kt.t(xmlPullParser, string)) {
            return n3;
        }
        return typedArray.getInt(n2, n3);
    }

    public static int o(TypedArray typedArray, int n2, int n3, int n4) {
        return typedArray.getResourceId(n2, typedArray.getResourceId(n3, n4));
    }

    public static TypedArray p(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] nArray) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, nArray);
        }
        return theme.obtainStyledAttributes(attributeSet, nArray, 0, 0);
    }

    public static CharSequence q(TypedArray typedArray, int n2, int n3) {
        CharSequence charSequence = typedArray.getText(n2);
        if (charSequence == null) {
            return typedArray.getText(n3);
        }
        return charSequence;
    }

    public static String r(TypedArray typedArray, int n2, int n3) {
        String string = typedArray.getString(n2);
        if (string == null) {
            return typedArray.getString(n3);
        }
        return string;
    }

    public static boolean s(TypedArray typedArray, int n2, int n3, boolean bl2) {
        return typedArray.getBoolean(n2, typedArray.getBoolean(n3, bl2));
    }

    public static boolean t(XmlPullParser xmlPullParser, String string) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", string) != null;
    }

    public static CharSequence[] u(TypedArray typedArray, int n2, int n3) {
        CharSequence[] charSequenceArray = typedArray.getTextArray(n2);
        if (charSequenceArray == null) {
            return typedArray.getTextArray(n3);
        }
        return charSequenceArray;
    }

    public static int v(TypedArray typedArray, int n2, int n3) {
        return typedArray.getInt(n2, typedArray.getInt(n3, Integer.MAX_VALUE));
    }

    public static int w(TypedArray typedArray, XmlPullParser xmlPullParser, String string, int n2) {
        if (!kt.t(xmlPullParser, string)) {
            return 0;
        }
        return typedArray.getColor(n2, 0);
    }

    public static int x(int n2) {
        if (n2 <= 4) {
            return 8;
        }
        return n2 + n2;
    }

    public static Shader.TileMode y(int n2) {
        if (n2 != 1) {
            if (n2 != 2) {
                return Shader.TileMode.CLAMP;
            }
            return Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static htf z(TypedArray var0, XmlPullParser var1_2, Resources.Theme var2_3, String var3_4, int var4_5) {
        block16: {
            block15: {
                if (!kt.t(var1_2 /* !! */ , (String)var3_4)) break block16;
                var1_2 /* !! */  = new TypedValue();
                var0 /* !! */ .getValue(var4_5, (TypedValue)var1_2 /* !! */ );
                if (var1_2 /* !! */ .type >= 28 && var1_2 /* !! */ .type <= 31) {
                    return new htf(null, null, var1_2 /* !! */ .data);
                }
                var1_2 /* !! */  = var0 /* !! */ .getResources();
                var4_5 = var0 /* !! */ .getResourceId(var4_5, 0);
                try {
                    block18: {
                        block17: {
                            var0 /* !! */  = var1_2 /* !! */ .getXml(var4_5);
                            var3_4 = Xml.asAttributeSet((XmlPullParser)var0 /* !! */ );
                            while ((var4_5 = var0 /* !! */ .next()) != 2) {
                                if (var4_5 != 1) continue;
                                var0 /* !! */  = new XmlPullParserException("No start tag found");
                                throw var0 /* !! */ ;
                            }
                            var23_6 = var0 /* !! */ .getName();
                            var4_5 = var23_6.hashCode();
                            if (var4_5 == 89650992) break block17;
                            if (var4_5 != 1191572447 || !var23_6.equals("selector")) ** GOTO lbl-1000
                            var4_5 = 0;
                            break block18;
                        }
                        if (var23_6.equals("gradient")) {
                            var4_5 = 1;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var4_5 = -1;
                        }
                    }
                    if (var4_5 == 0) ** GOTO lbl118
                    if (var4_5 == 1) {
                    }
                    ** GOTO lbl109
                }
                catch (Exception var0_1) {
                    Log.e((String)"ComplexColorCompat", (String)"Failed to inflate ComplexColor.", (Throwable)var0_1);
                    var0 /* !! */  = null;
                    break block15;
                }
                {
                    block19: {
                        var23_6 = var0 /* !! */ .getName();
                        if (!var23_6.equals("gradient")) ** GOTO lbl100
                        var23_6 = kt.p((Resources)var1_2 /* !! */ , var2_3 /* !! */ , (AttributeSet)var3_4, sd.d);
                        var7_7 = kt.l((TypedArray)var23_6, (XmlPullParser)var0 /* !! */ , "startX", 8, 0.0f);
                        var5_8 = kt.l((TypedArray)var23_6, (XmlPullParser)var0 /* !! */ , "startY", 9, 0.0f);
                        var8_9 = kt.l((TypedArray)var23_6, (XmlPullParser)var0 /* !! */ , "endX", 10, 0.0f);
                        var11_10 = kt.l((TypedArray)var23_6, (XmlPullParser)var0 /* !! */ , "endY", 11, 0.0f);
                        var6_11 = kt.l((TypedArray)var23_6, (XmlPullParser)var0 /* !! */ , "centerX", 3, 0.0f);
                        var10_12 = kt.l((TypedArray)var23_6, (XmlPullParser)var0 /* !! */ , "centerY", 4, 0.0f);
                        var14_13 = kt.n((TypedArray)var23_6, (XmlPullParser)var0 /* !! */ , "type", 2, 0);
                        var17_14 = kt.w((TypedArray)var23_6, (XmlPullParser)var0 /* !! */ , "startColor", 0);
                        var20_15 = kt.t((XmlPullParser)var0 /* !! */ , "centerColor");
                        var4_5 = kt.w((TypedArray)var23_6, (XmlPullParser)var0 /* !! */ , "centerColor", 7);
                        var15_16 = kt.w((TypedArray)var23_6, (XmlPullParser)var0 /* !! */ , "endColor", 1);
                        var16_17 = kt.n((TypedArray)var23_6, (XmlPullParser)var0 /* !! */ , "tileMode", 6, 0);
                        var9_18 = kt.l((TypedArray)var23_6, (XmlPullParser)var0 /* !! */ , "gradientRadius", 5, 0.0f);
                        var23_6.recycle();
                        var13_19 = var0 /* !! */ .getDepth() + 1;
                        var24_20 = new ArrayList<Float>(20);
                        var23_6 = new Object(20);
                        while ((var19_23 = var0 /* !! */ .next()) != 1 && ((var18_22 = var0 /* !! */ .getDepth()) >= var13_19 || var19_23 != 3)) {
                            if (var19_23 != 2 || var18_22 > var13_19 || !var0 /* !! */ .getName().equals("item")) continue;
                            var25_26 = kt.p((Resources)var1_2 /* !! */ , var2_3 /* !! */ , (AttributeSet)var3_4, sd.e);
                            var21_24 = var25_26.hasValue(0);
                            var22_25 = var25_26.hasValue(1);
                            if (var21_24 && var22_25) {
                                var18_22 = var25_26.getColor(0, 0);
                                var12_21 = var25_26.getFloat(1, 0.0f);
                                var25_26.recycle();
                                var23_6.add(var18_22);
                                var24_20.add(Float.valueOf(var12_21));
                                continue;
                            }
                            var1_2 /* !! */  = new XmlPullParserException(String.valueOf(var0 /* !! */ .getPositionDescription()).concat(": <item> tag requires a 'color' attribute and a 'offset' attribute!"));
                            throw var1_2 /* !! */ ;
                        }
                        var0 /* !! */  = var23_6.size() > 0 ? new awg((List)var23_6, var24_20) : null;
                        if (var0 /* !! */  == null) {
                            var0 /* !! */  = var20_15 != false ? new awg(var17_14, var4_5, var15_16) : new awg(var17_14, var15_16);
                        }
                        if (var14_13 == 1) break block19;
                        if (var14_13 != 2) {
                            var2_3 /* !! */  = var0 /* !! */ .b;
                            var3_4 = var0 /* !! */ .a;
                            var0 /* !! */  = kt.y(var16_17);
                            var3_4 = (float[])var3_4;
                            var1_2 /* !! */  = new LinearGradient(var7_7, var5_8, var8_9, var11_10, (int[])var2_3 /* !! */ , (float[])var3_4, (Shader.TileMode)var0 /* !! */ );
                            var0 /* !! */  = var1_2 /* !! */ ;
                        } else {
                            var1_2 /* !! */  = var0 /* !! */ .b;
                            var0 /* !! */  = (TypedArray)((float[])var0 /* !! */ .a);
                            var0 /* !! */  = new SweepGradient(var6_11, var10_12, (int[])var1_2 /* !! */ , (float[])var0 /* !! */ );
                        }
                        ** GOTO lbl96
                    }
                    if (var9_18 <= 0.0f) ** GOTO lbl98
                }
                {
                    var1_2 /* !! */  = var0 /* !! */ .b;
                    var2_3 /* !! */  = var0 /* !! */ .a;
                    var0 /* !! */  = kt.y(var16_17);
                    var2_3 /* !! */  = (Resources.Theme)((float[])var2_3 /* !! */ );
                    var0 /* !! */  = new RadialGradient(var6_11, var10_12, var9_18, (int[])var1_2 /* !! */ , (float[])var2_3 /* !! */ , (Shader.TileMode)var0 /* !! */ );
lbl96:
                    // 3 sources

                    var0 /* !! */  = new htf((Shader)var0 /* !! */ , null, 0);
                    break block15;
lbl98:
                    // 1 sources

                    var0 /* !! */  = new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
                    throw var0 /* !! */ ;
lbl100:
                    // 1 sources

                    var2_3 /* !! */  = new StringBuilder();
                    var2_3 /* !! */ .append(var0 /* !! */ .getPositionDescription());
                    var2_3 /* !! */ .append(": invalid gradient color tag ");
                    var2_3 /* !! */ .append((String)var23_6);
                    var1_2 /* !! */  = new XmlPullParserException(var2_3 /* !! */ .toString());
                    throw var1_2 /* !! */ ;
lbl109:
                    // 1 sources

                    var1_2 /* !! */  = new StringBuilder();
                    var1_2 /* !! */ .append(var0 /* !! */ .getPositionDescription());
                    var1_2 /* !! */ .append(": unsupported complex color tag ");
                    var1_2 /* !! */ .append((String)var23_6);
                    var2_3 /* !! */  = new XmlPullParserException(var1_2 /* !! */ .toString());
                    throw var2_3 /* !! */ ;
lbl118:
                    // 1 sources

                    var0 /* !! */  = sx.b((Resources)var1_2 /* !! */ , (XmlPullParser)var0 /* !! */ , (AttributeSet)var3_4, var2_3 /* !! */ );
                    var0 /* !! */  = new htf(null, (ColorStateList)var0 /* !! */ , var0 /* !! */ .getDefaultColor());
                }
            }
            if (var0 /* !! */  != null) {
                return var0 /* !! */ ;
            }
        }
        return new htf(null, null, 0);
    }

    public void a(RecyclerView recyclerView, int n2, int n3) {
    }

    public void b(int n2) {
    }

    public void c(Window window) {
        jse.e(window, "window");
    }

    public void d(nh nh2, nh nh3, Window window, View view, boolean bl2, boolean bl3) {
        throw null;
    }
}

