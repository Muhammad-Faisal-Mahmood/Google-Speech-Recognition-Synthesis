/*
 * Decompiled with CFR 0.152.
 */
public final class khc
implements kgn {
    /*
     * Unable to fully structure code
     */
    @Override
    public final kgv a(kid var1_1) {
        block22: {
            block23: {
                System.currentTimeMillis();
                var36_2 = var1_1.b;
                jse.e(var36_2, "request");
                var33_3 = var36_2;
                if (var36_2 == null) break block22;
                var32_4 = var33_3 = var36_2.f;
                if (var33_3 != null) break block23;
                var32_4 = var36_2.c;
                var2_5 = kfv.j;
                var2_5 = var32_4.a();
                var8_7 = true;
                var33_3 = null;
                var23_8 = false;
                var22_9 = false;
                var7_10 = -1;
                var6_11 = -1;
                var21_12 = false;
                var20_13 = false;
                var19_14 = false;
                var5_15 = -1;
                var4_16 = -1;
                var18_17 = false;
                var17_18 = false;
                var16_19 = false;
                for (var10_6 = 0; var10_6 < var2_5; ++var10_6) {
                    block27: {
                        block26: {
                            block25: {
                                block24: {
                                    var38_38 = var32_4.c(var10_6);
                                    var37_37 = var32_4.d(var10_6);
                                    if (!jse.H(var38_38, "Cache-Control")) break block24;
                                    if (var33_3 != null) break block25;
                                    var33_3 = var37_37;
                                    break block26;
                                }
                                var34_35 = var32_4;
                                var9_21 = var2_5;
                                var15_26 = var8_7;
                                var35_36 = var33_3;
                                var31_34 = var23_8;
                                var29_32 = var22_9;
                                var13_24 = var7_10;
                                var11_22 = var6_11;
                                var26_29 = var21_12;
                                var30_33 = var20_13;
                                var25_28 = var19_14;
                                var14_25 = var5_15;
                                var12_23 = var4_16;
                                var28_31 = var18_17;
                                var27_30 = var17_18;
                                var24_27 = var16_19;
                                if (!jse.H(var38_38, "Pragma")) break block27;
                            }
                            var8_7 = false;
                        }
                        var3_20 = 0;
                        block1: while (true) {
                            block29: {
                                block28: {
                                    var34_35 = var32_4;
                                    var9_21 = var2_5;
                                    var15_26 = var8_7;
                                    var35_36 = var33_3;
                                    var31_34 = var23_8;
                                    var29_32 = var22_9;
                                    var13_24 = var7_10;
                                    var11_22 = var6_11;
                                    var26_29 = var21_12;
                                    var30_33 = var20_13;
                                    var25_28 = var19_14;
                                    var14_25 = var5_15;
                                    var12_23 = var4_16;
                                    var28_31 = var18_17;
                                    var27_30 = var17_18;
                                    var24_27 = var16_19;
                                    if (var3_20 >= var37_37.length()) break;
                                    var11_22 = jsl.w(var37_37, "=,;", var3_20);
                                    var9_21 = var11_22 + 1;
                                    var34_35 = var37_37.substring(var3_20, var11_22);
                                    jse.d(var34_35, "substring(...)");
                                    var35_36 = jse.w((CharSequence)var34_35).toString();
                                    if (var11_22 != var37_37.length() && var37_37.charAt(var11_22) != ',' && var37_37.charAt(var11_22) != ';') {
                                        block21: {
                                            jse.e(var37_37, "<this>");
                                            var11_22 = var37_37.length();
                                            var3_20 = var9_21;
                                            var9_21 = var11_22;
                                            while (var3_20 < var9_21) {
                                                var11_22 = var37_37.charAt(var3_20);
                                                if (var11_22 == 32 || var11_22 == 9) {
                                                    ++var3_20;
                                                    continue;
                                                }
                                                break block21;
                                            }
                                            var3_20 = var37_37.length();
                                        }
                                        if (var3_20 < var37_37.length() && var37_37.charAt(var3_20) == '\"') {
                                            var9_21 = var3_20 + 1;
                                            var3_20 = jse.L(var37_37, '\"', var9_21, 4);
                                            var34_35 = var37_37.substring(var9_21, var3_20);
                                            jse.d(var34_35, "substring(...)");
                                            ++var3_20;
                                        } else {
                                            var9_21 = jsl.w(var37_37, ",;", var3_20);
                                            var34_35 = var37_37.substring(var3_20, var9_21);
                                            jse.d(var34_35, "substring(...)");
                                            var34_35 = jse.w((CharSequence)var34_35).toString();
                                            var3_20 = var9_21;
                                        }
                                    } else {
                                        var34_35 = null;
                                        var3_20 = var9_21;
                                    }
                                    if (jse.H("no-cache", (String)var35_36)) {
                                        var23_8 = true;
                                        continue;
                                    }
                                    if (jse.H("no-store", (String)var35_36)) {
                                        var22_9 = true;
                                        continue;
                                    }
                                    if (jse.H("max-age", (String)var35_36)) {
                                        var7_10 = khb.h((String)var34_35, -1);
lbl114:
                                        // 4 sources

                                        while (true) {
                                            var9_21 = var4_16;
                                            var11_22 = var5_15;
                                            var12_23 = var6_11;
                                            var13_24 = var7_10;
                                            while (true) {
                                                var7_10 = var13_24;
                                                var6_11 = var12_23;
                                                var5_15 = var11_22;
                                                var4_16 = var9_21;
                                                continue block1;
                                                break;
                                            }
                                            break;
                                        }
                                    }
                                    if (!jse.H("s-maxage", (String)var35_36)) break block28;
                                    var6_11 = khb.h((String)var34_35, -1);
                                    ** GOTO lbl114
                                }
                                if (jse.H("private", (String)var35_36)) {
                                    var21_12 = true;
                                    continue;
                                }
                                if (jse.H("public", (String)var35_36)) {
                                    var20_13 = true;
                                    continue;
                                }
                                if (jse.H("must-revalidate", (String)var35_36)) {
                                    var19_14 = true;
                                    continue;
                                }
                                if (!jse.H("max-stale", (String)var35_36)) break block29;
                                var5_15 = khb.h((String)var34_35, 0x7FFFFFFF);
                                ** GOTO lbl114
                            }
                            if (jse.H("min-fresh", (String)var35_36)) {
                                var4_16 = khb.h((String)var34_35, -1);
                                ** continue;
                            }
                            if (jse.H("only-if-cached", (String)var35_36)) {
                                var18_17 = true;
                                continue;
                            }
                            if (jse.H("no-transform", (String)var35_36)) {
                                var17_18 = true;
                                continue;
                            }
                            var24_27 = jse.H("immutable", (String)var35_36);
                            var14_25 = var3_20;
                            var34_35 = var32_4;
                            var13_24 = var7_10;
                            var12_23 = var6_11;
                            var11_22 = var5_15;
                            var9_21 = var4_16;
                            if (!var24_27) ** continue;
                            var16_19 = true;
                            var32_4 = var34_35;
                            var3_20 = var14_25;
                        }
                    }
                    var32_4 = var34_35;
                    var2_5 = var9_21;
                    var8_7 = var15_26;
                    var33_3 = var35_36;
                    var23_8 = var31_34;
                    var22_9 = var29_32;
                    var7_10 = var13_24;
                    var6_11 = var11_22;
                    var21_12 = var26_29;
                    var20_13 = var30_33;
                    var19_14 = var25_28;
                    var5_15 = var14_25;
                    var4_16 = var12_23;
                    var18_17 = var28_31;
                    var17_18 = var27_30;
                    var16_19 = var24_27;
                }
                var32_4 = true != var8_7 ? null : var33_3;
                var36_2.f = var32_4 = new kfv(var23_8, var22_9, var7_10, var6_11, var21_12, var20_13, var19_14, var5_15, var4_16, var18_17, var17_18, var16_19, (String)var32_4);
            }
            var33_3 = var36_2;
            if (var32_4.i) {
                var33_3 = null;
            }
        }
        if (var33_3 != null) {
            var32_4 = var1_1.a((kgs)var33_3);
            var1_1 = new kgu((kgv)var32_4);
            var33_3 = jvf.q(null);
            kgu.b("cacheResponse", (kgv)var33_3);
            var1_1.e = var33_3;
            var32_4 = jvf.q((kgv)var32_4);
            kgu.b("networkResponse", (kgv)var32_4);
            var1_1.d = var32_4;
            return var1_1.a();
        }
        var32_4 = new kgu();
        var32_4.f(var1_1.b);
        var32_4.e(kgq.b);
        var32_4.a = 504;
        var32_4.d("Unsatisfiable Request (only-if-cached)");
        var32_4.c = khb.c;
        var32_4.g = -1L;
        var32_4.h = System.currentTimeMillis();
        return var32_4.a();
    }
}

