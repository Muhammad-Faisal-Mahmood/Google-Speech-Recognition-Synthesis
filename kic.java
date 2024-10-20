/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Locale;

public final class kic {
    static {
        klp klp2 = klp.a;
        kmp.v("\"\\");
        kmp.v("\t ,=");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final void a(kgd var0, kgm var1_4, kgk var2_5) {
        block162: {
            jse.e(var2_5, "headers");
            if (var0 == kgd.a) break block162;
            var0 = kgb.a;
            jse.e(var2_5, "headers");
            var6_8 = var2_5.a();
            var4_9 = 0;
            var3_10 = 0;
            var0 = null;
            while (true) {
                var5_13 = 2;
                if (var3_10 >= var6_8) break;
                var33_11 = var0;
                if (jse.H("Set-Cookie", var2_5.c(var3_10))) {
                    var33_11 = var0;
                    if (var0 == null) {
                        var33_11 = new ArrayList<T>(2);
                    }
                    var33_11.add(var2_5.d(var3_10));
                }
                ++var3_10;
                var0 = var33_11;
            }
            if (var0 != null) {
                var0 = DesugarCollections.unmodifiableList(var0);
                jse.b(var0);
            } else {
                var0 = jpa.a;
            }
            var3_10 = var0.size();
            var36_15 /* !! */  = null;
            var2_5 = var0;
            for (var12_14 = 0; var12_14 < var3_10; ++var12_14) {
                block152: {
                    block167: {
                        block175: {
                            block169: {
                                block174: {
                                    block173: {
                                        block172: {
                                            block171: {
                                                block170: {
                                                    block168: {
                                                        block161: {
                                                            block165: {
                                                                block166: {
                                                                    block164: {
                                                                        var0 = (String)var2_5.get(var12_14);
                                                                        jse.e(var0, "setCookie");
                                                                        var29_33 = System.currentTimeMillis();
                                                                        jse.e(var0, "setCookie");
                                                                        var6_8 = khb.C(var0, ';', var4_9, 6);
                                                                        var7_16 = khb.C(var0, '=', var6_8, var5_13);
                                                                        if (var7_16 == var6_8) {
                                                                            while (true) {
                                                                                var0 = var2_5;
                                                                                var6_8 = var4_9;
                                                                                var4_9 = var3_10;
                                                                                var2_5 = null;
                                                                                var3_10 = var6_8;
                                                                                break block152;
                                                                                break;
                                                                            }
                                                                        }
                                                                        if ((var41_42 = khb.m(var0, var4_9, var7_16)).length() == 0 || khb.c(var41_42) != -1 || khb.c(var42_43 = khb.m(var0, var7_16 + 1, var6_8)) != -1) ** continue;
                                                                        var17_25 = var0.length();
                                                                        var7_16 = var6_8 + 1;
                                                                        var13_21 = var6_8 = (var5_13 = var4_9);
                                                                        var32_35 = true;
                                                                        var21_29 = -1L;
                                                                        var23_30 = 253402300799999L;
                                                                        var38_39 = null;
                                                                        var37_38 = null;
                                                                        var15_23 = var6_8;
                                                                        var14_22 = var5_13;
                                                                        var6_8 = var4_9;
                                                                        block64: while (true) {
                                                                            block160: {
                                                                                block163: {
                                                                                    block158: {
                                                                                        block157: {
                                                                                            var25_31 = 0x7FFFFFFFFFFFFFFFL;
                                                                                            if (var7_16 >= var17_25) break;
                                                                                            var18_26 = khb.a(var0, ';', var7_16, var17_25);
                                                                                            var4_9 = khb.a(var0, '=', var7_16, var18_26);
                                                                                            var34_36 = khb.m(var0, var7_16, var4_9);
                                                                                            var39_40 = var4_9 < var18_26 ? khb.m((String)var0, var4_9 + 1, var18_26) : "";
                                                                                            if (jse.H((String)var34_36, "expires")) {
                                                                                                var19_27 = var39_40.length();
                                                                                                var6_8 = jvf.A((String)var39_40, var6_8, var19_27, (boolean)var6_8);
                                                                                                var40_41 = kgb.d.matcher((CharSequence)var39_40);
                                                                                                var5_13 = -1;
                                                                                                var4_9 = -1;
                                                                                                var7_16 = -1;
                                                                                                var8_17 = -1;
                                                                                                var10_19 = -1;
                                                                                                var9_18 = -1;
                                                                                                while (var6_8 < var19_27) {
                                                                                                    block154: {
                                                                                                        block153: {
                                                                                                            var33_11 = var2_5;
                                                                                                            var20_28 = jvf.A((String)var39_40, var6_8 + 1, var19_27, true);
                                                                                                            var40_41.region(var6_8, var20_28);
                                                                                                            if (var5_13 != -1) break block153;
                                                                                                            if (var40_41.usePattern(kgb.d).matches()) {
                                                                                                                var2_5 = var40_41.group(1);
                                                                                                                jse.d(var2_5, "group(...)");
                                                                                                                var5_13 = Integer.parseInt((String)var2_5);
                                                                                                                var2_5 = var40_41.group(2);
                                                                                                                jse.d(var2_5, "group(...)");
                                                                                                                var10_19 = Integer.parseInt((String)var2_5);
                                                                                                                var2_5 = var40_41.group(3);
                                                                                                                jse.d(var2_5, "group(...)");
                                                                                                                var9_18 = Integer.parseInt((String)var2_5);
                                                                                                                break block154;
                                                                                                            }
                                                                                                            var5_13 = -1;
                                                                                                        }
                                                                                                        if (var8_17 == -1) {
                                                                                                            if (var40_41.usePattern(kgb.c).matches()) {
                                                                                                                var2_5 = var40_41.group(1);
                                                                                                                jse.d(var2_5, "group(...)");
                                                                                                                var8_17 = Integer.parseInt((String)var2_5);
                                                                                                                break block154;
                                                                                                            }
                                                                                                            var8_17 = -1;
                                                                                                        }
                                                                                                        var11_20 = var3_10;
                                                                                                        if (var7_16 == -1) {
                                                                                                            block155: {
                                                                                                                if (!var40_41.usePattern(kgb.b).matches()) break block155;
                                                                                                                var34_36 = var40_41.group(1);
                                                                                                                jse.d(var34_36, "group(...)");
                                                                                                                var2_5 = Locale.US;
                                                                                                                jse.d(var2_5, "US");
                                                                                                                var35_37 = var34_36.toLowerCase((Locale)var2_5);
                                                                                                                jse.d(var35_37, "toLowerCase(...)");
                                                                                                                var43_44 /* !! */  = (byte[][])kgb.b.pattern();
                                                                                                                jse.d(var43_44 /* !! */ , "pattern(...)");
                                                                                                                var2_5 = var0;
                                                                                                                var6_8 = var11_20;
                                                                                                                var34_36 = var33_11;
                                                                                                                var7_16 = jse.M((CharSequence)var43_44 /* !! */ , (String)var35_37, 0, 6) / 4;
                                                                                                                break block154;
                                                                                                            }
                                                                                                            var7_16 = -1;
                                                                                                            var6_8 = -1;
                                                                                                        } else {
                                                                                                            var6_8 = -1;
                                                                                                        }
                                                                                                        var35_37 = var0;
                                                                                                        var4_9 = var16_24 = var4_9;
                                                                                                        if (var16_24 == var6_8) {
                                                                                                            block156: {
                                                                                                                var6_8 = var11_20;
                                                                                                                var2_5 = var35_37;
                                                                                                                var34_36 = var33_11;
                                                                                                                if (!var40_41.usePattern(kgb.a).matches()) break block156;
                                                                                                                var6_8 = var11_20;
                                                                                                                var2_5 = var35_37;
                                                                                                                var34_36 = var33_11;
                                                                                                                var43_44 /* !! */  = (byte[][])var40_41.group(1);
                                                                                                                var6_8 = var11_20;
                                                                                                                var2_5 = var35_37;
                                                                                                                var34_36 = var33_11;
                                                                                                                jse.d(var43_44 /* !! */ , "group(...)");
                                                                                                                var6_8 = var11_20;
                                                                                                                var2_5 = var35_37;
                                                                                                                var34_36 = var33_11;
                                                                                                                var4_9 = Integer.parseInt((String)var43_44 /* !! */ );
                                                                                                                break block154;
                                                                                                            }
                                                                                                            var4_9 = -1;
                                                                                                        }
                                                                                                    }
                                                                                                    var6_8 = var3_10;
                                                                                                    var2_5 = var0;
                                                                                                    var34_36 = var33_11;
                                                                                                    var11_20 = jvf.A((String)var39_40, var20_28 + 1, var19_27, false);
                                                                                                    var2_5 = var33_11;
                                                                                                    var6_8 = var11_20;
                                                                                                }
                                                                                                var33_11 = var2_5;
                                                                                                var4_9 = var6_8 = var4_9;
                                                                                                if (var6_8 >= 70) {
                                                                                                    var4_9 = var6_8;
                                                                                                    if (var6_8 < 100) {
                                                                                                        var4_9 = var6_8 + 1900;
                                                                                                    }
                                                                                                }
                                                                                                var11_20 = var4_9;
                                                                                                if (var4_9 >= 0) {
                                                                                                    var11_20 = var4_9;
                                                                                                    if (var4_9 < 70) {
                                                                                                        var11_20 = var4_9 + 2000;
                                                                                                    }
                                                                                                }
                                                                                                if (var11_20 >= 1601) {
                                                                                                    if (var7_16 != -1) {
                                                                                                        if (var8_17 > 0 && var8_17 < 32) {
                                                                                                            if (var5_13 >= 0 && var5_13 < 24) {
                                                                                                                if (var10_19 >= 0 && var10_19 < 60) {
                                                                                                                    if (var9_18 >= 0 && var9_18 < 60) {
                                                                                                                        var6_8 = var3_10;
                                                                                                                        var2_5 = var0;
                                                                                                                        var34_36 = var33_11;
                                                                                                                        var6_8 = var3_10;
                                                                                                                        var2_5 = var0;
                                                                                                                        var34_36 = var33_11;
                                                                                                                        var35_37 = new GregorianCalendar(khb.d);
                                                                                                                        var6_8 = var3_10;
                                                                                                                        var2_5 = var0;
                                                                                                                        var34_36 = var33_11;
                                                                                                                        var35_37.setLenient(false);
                                                                                                                        var6_8 = var3_10;
                                                                                                                        var2_5 = var0;
                                                                                                                        var34_36 = var33_11;
                                                                                                                        var35_37.set(1, var11_20);
                                                                                                                        var6_8 = var3_10;
                                                                                                                        var2_5 = var0;
                                                                                                                        var34_36 = var33_11;
                                                                                                                        var35_37.set(2, var7_16 - 1);
                                                                                                                        var6_8 = var3_10;
                                                                                                                        var2_5 = var0;
                                                                                                                        var34_36 = var33_11;
                                                                                                                        var35_37.set(5, var8_17);
                                                                                                                        var6_8 = var3_10;
                                                                                                                        var2_5 = var0;
                                                                                                                        var34_36 = var33_11;
                                                                                                                        var35_37.set(11, var5_13);
                                                                                                                        var6_8 = var3_10;
                                                                                                                        var2_5 = var0;
                                                                                                                        var34_36 = var33_11;
                                                                                                                        var35_37.set(12, var10_19);
                                                                                                                        var6_8 = var3_10;
                                                                                                                        var2_5 = var0;
                                                                                                                        var34_36 = var33_11;
                                                                                                                        var35_37.set(13, var9_18);
                                                                                                                        var6_8 = var3_10;
                                                                                                                        var2_5 = var0;
                                                                                                                        var34_36 = var33_11;
                                                                                                                        var35_37.set(14, 0);
                                                                                                                        var6_8 = var3_10;
                                                                                                                        var2_5 = var0;
                                                                                                                        var34_36 = var33_11;
                                                                                                                        var23_30 = var25_31 = var35_37.getTimeInMillis();
                                                                                                                        var2_5 = var0;
                                                                                                                        var0 = var33_11;
                                                                                                                        break block157;
                                                                                                                    }
                                                                                                                    var6_8 = var3_10;
                                                                                                                    var2_5 = var0;
                                                                                                                    var34_36 = var33_11;
                                                                                                                    var6_8 = var3_10;
                                                                                                                    var2_5 = var0;
                                                                                                                    var34_36 = var33_11;
                                                                                                                    var35_37 = new IllegalArgumentException("Failed requirement.");
                                                                                                                    var6_8 = var3_10;
                                                                                                                    var2_5 = var0;
                                                                                                                    var34_36 = var33_11;
                                                                                                                    throw var35_37;
                                                                                                                }
                                                                                                                var6_8 = var3_10;
                                                                                                                var2_5 = var0;
                                                                                                                var34_36 = var33_11;
                                                                                                                var6_8 = var3_10;
                                                                                                                var2_5 = var0;
                                                                                                                var34_36 = var33_11;
                                                                                                                var35_37 = new IllegalArgumentException("Failed requirement.");
                                                                                                                var6_8 = var3_10;
                                                                                                                var2_5 = var0;
                                                                                                                var34_36 = var33_11;
                                                                                                                throw var35_37;
                                                                                                            }
                                                                                                            var6_8 = var3_10;
                                                                                                            var2_5 = var0;
                                                                                                            var34_36 = var33_11;
                                                                                                            var6_8 = var3_10;
                                                                                                            var2_5 = var0;
                                                                                                            var34_36 = var33_11;
                                                                                                            var35_37 = new IllegalArgumentException("Failed requirement.");
                                                                                                            var6_8 = var3_10;
                                                                                                            var2_5 = var0;
                                                                                                            var34_36 = var33_11;
                                                                                                            throw var35_37;
                                                                                                        }
                                                                                                        var6_8 = var3_10;
                                                                                                        var2_5 = var0;
                                                                                                        var34_36 = var33_11;
                                                                                                        var6_8 = var3_10;
                                                                                                        var2_5 = var0;
                                                                                                        var34_36 = var33_11;
                                                                                                        var35_37 = new IllegalArgumentException("Failed requirement.");
                                                                                                        var6_8 = var3_10;
                                                                                                        var2_5 = var0;
                                                                                                        var34_36 = var33_11;
                                                                                                        throw var35_37;
                                                                                                    }
                                                                                                    var6_8 = var3_10;
                                                                                                    var2_5 = var0;
                                                                                                    var34_36 = var33_11;
                                                                                                    var6_8 = var3_10;
                                                                                                    var2_5 = var0;
                                                                                                    var34_36 = var33_11;
                                                                                                    var35_37 = new IllegalArgumentException("Failed requirement.");
                                                                                                    var6_8 = var3_10;
                                                                                                    var2_5 = var0;
                                                                                                    var34_36 = var33_11;
                                                                                                    throw var35_37;
                                                                                                }
                                                                                                var6_8 = var3_10;
                                                                                                var2_5 = var0;
                                                                                                var34_36 = var33_11;
                                                                                                var6_8 = var3_10;
                                                                                                var2_5 = var0;
                                                                                                var34_36 = var33_11;
                                                                                                var35_37 = new IllegalArgumentException("Failed requirement.");
                                                                                                var6_8 = var3_10;
                                                                                                var2_5 = var0;
                                                                                                var34_36 = var33_11;
                                                                                                throw var35_37;
                                                                                                catch (IllegalArgumentException var33_12) {
                                                                                                    var33_11 = var2_5;
                                                                                                    var2_5 = var0;
lbl316:
                                                                                                    // 2 sources

                                                                                                    while (true) {
                                                                                                        var0 = var33_11;
                                                                                                        var6_8 = var3_10;
lbl319:
                                                                                                        // 2 sources

                                                                                                        while (true) {
                                                                                                            var4_9 = var14_22;
                                                                                                            var5_13 = var13_21;
                                                                                                            var31_34 = var32_35;
                                                                                                            var25_31 = var21_29;
                                                                                                            var27_32 = var23_30;
                                                                                                            var39_40 = var38_39;
                                                                                                            var40_41 = var37_38;
                                                                                                            break;
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            var33_11 = var2_5;
                                                                                            var35_37 = var0;
                                                                                            if (!jse.H((String)var34_36, "max-age")) break block163;
                                                                                            try {
                                                                                                var25_31 = Long.parseLong((String)var39_40);
                                                                                                if (var25_31 <= 0L) {
                                                                                                    while (true) {
                                                                                                        var21_29 = -9223372036854775808L;
                                                                                                        var2_5 = var35_37;
                                                                                                        var0 = var33_11;
                                                                                                        break;
                                                                                                    }
                                                                                                } else {
                                                                                                    var21_29 = var25_31;
                                                                                                    var2_5 = var35_37;
                                                                                                    var0 = var33_11;
                                                                                                }
                                                                                            }
                                                                                            catch (NumberFormatException var0_1) {
                                                                                                var6_8 = var3_10;
                                                                                                var2_5 = var35_37;
                                                                                                var34_36 = var33_11;
                                                                                                var6_8 = var3_10;
                                                                                                var2_5 = var35_37;
                                                                                                var34_36 = var33_11;
                                                                                                var40_41 = new jtv("-?\\d+");
                                                                                                var6_8 = var3_10;
                                                                                                var2_5 = var35_37;
                                                                                                var34_36 = var33_11;
                                                                                                if (!var40_41.b((CharSequence)var39_40)) break block158;
                                                                                                var6_8 = var3_10;
                                                                                                var2_5 = var35_37;
                                                                                                var34_36 = var33_11;
                                                                                                if (jse.X((String)var39_40, "-")) ** continue;
                                                                                                var21_29 = 0x7FFFFFFFFFFFFFFFL;
                                                                                                var0 = var33_11;
                                                                                                var2_5 = var35_37;
                                                                                            }
                                                                                        }
                                                                                        var5_13 = 1;
                                                                                        var4_9 = var14_22;
                                                                                        var31_34 = var32_35;
                                                                                        var25_31 = var21_29;
                                                                                        var27_32 = var23_30;
                                                                                        var39_40 = var38_39;
                                                                                        var40_41 = var37_38;
                                                                                        var6_8 = var3_10;
                                                                                        break block160;
                                                                                    }
                                                                                    var6_8 = var3_10;
                                                                                    var2_5 = var35_37;
                                                                                    var34_36 = var33_11;
                                                                                    throw var0_1;
                                                                                }
                                                                                if (jse.H((String)var34_36, "domain")) {
                                                                                    block159: {
                                                                                        var6_8 = var3_10;
                                                                                        var2_5 = var35_37;
                                                                                        var34_36 = var33_11;
                                                                                        if (jse.G((String)var39_40, ".")) break block159;
                                                                                        var6_8 = var3_10;
                                                                                        var2_5 = var35_37;
                                                                                        var34_36 = var33_11;
                                                                                        var39_40 = jvf.r(jse.x((String)var39_40, "."));
                                                                                        if (var39_40 != null) {
                                                                                            var31_34 = false;
                                                                                            var4_9 = var14_22;
                                                                                            var5_13 = var13_21;
                                                                                            var25_31 = var21_29;
                                                                                            var27_32 = var23_30;
                                                                                            var40_41 = var37_38;
                                                                                            var6_8 = var3_10;
                                                                                            var2_5 = var35_37;
                                                                                            var0 = var33_11;
                                                                                            break block160;
                                                                                        }
                                                                                        var6_8 = var3_10;
                                                                                        var2_5 = var35_37;
                                                                                        var34_36 = var33_11;
                                                                                        var6_8 = var3_10;
                                                                                        var2_5 = var35_37;
                                                                                        var34_36 = var33_11;
                                                                                        var0 = new IllegalArgumentException();
                                                                                        var6_8 = var3_10;
                                                                                        var2_5 = var35_37;
                                                                                        var34_36 = var33_11;
                                                                                        throw var0;
                                                                                    }
                                                                                    var6_8 = var3_10;
                                                                                    var2_5 = var35_37;
                                                                                    var34_36 = var33_11;
                                                                                    var6_8 = var3_10;
                                                                                    var2_5 = var35_37;
                                                                                    var34_36 = var33_11;
                                                                                    var0 = new IllegalArgumentException("Failed requirement.");
                                                                                    var6_8 = var3_10;
                                                                                    var2_5 = var35_37;
                                                                                    var34_36 = var33_11;
                                                                                    throw var0;
                                                                                }
                                                                                if (jse.H((String)var34_36, "path")) {
                                                                                    var40_41 = var39_40;
                                                                                    var4_9 = var14_22;
                                                                                    var5_13 = var13_21;
                                                                                    var31_34 = var32_35;
                                                                                    var25_31 = var21_29;
                                                                                    var27_32 = var23_30;
                                                                                    var39_40 = var38_39;
                                                                                    var6_8 = var3_10;
                                                                                    var2_5 = var35_37;
                                                                                    var0 = var33_11;
                                                                                } else if (jse.H((String)var34_36, "secure")) {
                                                                                    var4_9 = 1;
                                                                                    var5_13 = var13_21;
                                                                                    var31_34 = var32_35;
                                                                                    var25_31 = var21_29;
                                                                                    var27_32 = var23_30;
                                                                                    var39_40 = var38_39;
                                                                                    var40_41 = var37_38;
                                                                                    var6_8 = var3_10;
                                                                                    var2_5 = var35_37;
                                                                                    var0 = var33_11;
                                                                                } else {
                                                                                    var4_9 = var14_22;
                                                                                    var5_13 = var13_21;
                                                                                    var31_34 = var32_35;
                                                                                    var25_31 = var21_29;
                                                                                    var27_32 = var23_30;
                                                                                    var39_40 = var38_39;
                                                                                    var40_41 = var37_38;
                                                                                    var6_8 = var3_10;
                                                                                    var2_5 = var35_37;
                                                                                    var0 = var33_11;
                                                                                    if (jse.H((String)var34_36, "httponly")) {
                                                                                        var15_23 = 1;
                                                                                        var0 = var33_11;
                                                                                        var2_5 = var35_37;
                                                                                        var6_8 = var3_10;
                                                                                        var40_41 = var37_38;
                                                                                        var39_40 = var38_39;
                                                                                        var27_32 = var23_30;
                                                                                        var25_31 = var21_29;
                                                                                        var31_34 = var32_35;
                                                                                        var5_13 = var13_21;
                                                                                        var4_9 = var14_22;
                                                                                    }
                                                                                }
                                                                            }
lbl478:
                                                                            // 2 sources

                                                                            while (true) {
                                                                                var7_16 = var18_26 + 1;
                                                                                var3_10 = var6_8;
                                                                                var33_11 = var2_5;
                                                                                var6_8 = 0;
                                                                                var2_5 = var0;
                                                                                var0 = var33_11;
                                                                                var14_22 = var4_9;
                                                                                var13_21 = var5_13;
                                                                                var32_35 = var31_34;
                                                                                var21_29 = var25_31;
                                                                                var23_30 = var27_32;
                                                                                var38_39 = var39_40;
                                                                                var37_38 = var40_41;
                                                                                continue block64;
                                                                                break;
                                                                            }
                                                                            break;
                                                                        }
                                                                        var33_11 = var2_5;
                                                                        var4_9 = var3_10;
                                                                        if (var21_29 == -9223372036854775808L) {
                                                                            var21_29 = -9223372036854775808L;
                                                                        } else if (var21_29 != -1L) {
                                                                            var23_30 = var25_31;
                                                                            if (var21_29 <= 9223372036854775L) {
                                                                                var23_30 = var21_29 * 1000L;
                                                                            }
                                                                            if ((var21_29 = var29_33 + var23_30) < var29_33 || var21_29 > 253402300799999L) {
                                                                                var21_29 = 253402300799999L;
                                                                            }
                                                                        } else {
                                                                            var21_29 = var23_30;
                                                                        }
                                                                        var0 = var1_4.c;
                                                                        if (var38_39 != null) break block164;
                                                                        var34_36 = var0;
                                                                        break block165;
                                                                    }
                                                                    var34_36 = var38_39;
                                                                    if (jse.i(var0, var38_39)) break block165;
                                                                    if (!jse.G((String)var0, var38_39) || var0.charAt(var0.length() - var38_39.length() - 1) != '.') break block166;
                                                                    var34_36 = var38_39;
                                                                    if (!khb.s((String)var0)) break block165;
                                                                }
lbl517:
                                                                // 2 sources

                                                                while (true) {
                                                                    var5_13 = 2;
                                                                    var2_5 = null;
                                                                    var3_10 = 0;
                                                                    var0 = var33_11;
                                                                    break block152;
                                                                    break;
                                                                }
                                                            }
                                                            if (var0.length() == var34_36.length()) break block167;
                                                            var39_40 = kkp.c;
                                                            var0 = IDN.toUnicode((String)var34_36);
                                                            jse.b(var0);
                                                            var40_41 = var39_40.a((String)var0);
                                                            if (!var39_40.d.get() && var39_40.d.compareAndSet(false, true)) {
                                                                var39_40.b();
                                                            } else {
                                                                try {
                                                                    var39_40.e.await();
                                                                }
                                                                catch (InterruptedException var0_2) {
                                                                    Thread.currentThread().interrupt();
                                                                }
                                                            }
                                                            if (var39_40.f == null) ** GOTO lbl625
                                                            var5_13 = var40_41.size();
                                                            var43_44 /* !! */  = new byte[var5_13][];
                                                            for (var3_10 = 0; var3_10 < var5_13; ++var3_10) {
                                                                var0 = (String)var40_41.get(var3_10);
                                                                var2_5 = StandardCharsets.UTF_8;
                                                                jse.d(var2_5, "UTF_8");
                                                                var0 = var0.getBytes((Charset)var2_5);
                                                                jse.d(var0, "getBytes(...)");
                                                                var43_44 /* !! */ [var3_10] = (byte[])var0;
                                                            }
                                                            for (var3_10 = 0; var3_10 < var5_13; ++var3_10) {
                                                                var0 = var2_5 = (Object)var39_40.f;
                                                                if (var2_5 == null) {
                                                                    jse.h("publicSuffixListBytes");
                                                                    var0 = null;
                                                                }
                                                                if ((var0 = kmp.z((byte[])var0, var43_44 /* !! */ , var3_10)) == null) {
                                                                    continue;
                                                                }
                                                                break block161;
                                                            }
                                                            var0 = null;
                                                        }
                                                        if (var5_13 > 1) {
                                                            var38_39 = (byte[][])var43_44 /* !! */ .clone();
                                                            var6_8 = ((Object)var38_39).length;
                                                            for (var3_10 = 0; var3_10 < var6_8 - 1; ++var3_10) {
                                                                var38_39[var3_10] = kkp.a;
                                                                var2_5 = var35_37 = (Object)var39_40.f;
                                                                if (var35_37 == null) {
                                                                    jse.h("publicSuffixListBytes");
                                                                    var2_5 = null;
                                                                }
                                                                if ((var2_5 = kmp.z((byte[])var2_5, (byte[][])var38_39, var3_10)) == null) {
                                                                    continue;
                                                                }
                                                                break;
                                                            }
                                                        } else {
                                                            var2_5 = null;
                                                        }
                                                        if (var2_5 != null) {
                                                            for (var3_10 = 0; var3_10 < var5_13 - 1; ++var3_10) {
                                                                var35_37 = var38_39 = (Object)var39_40.g;
                                                                if (var38_39 == null) {
                                                                    jse.h("publicSuffixExceptionListBytes");
                                                                    var35_37 = null;
                                                                }
                                                                if ((var35_37 = kmp.z((byte[])var35_37, var43_44 /* !! */ , var3_10)) == null) {
                                                                    continue;
                                                                }
                                                                break;
                                                            }
                                                        } else {
                                                            var35_37 = null;
                                                        }
                                                        if (var35_37 == null) break block168;
                                                        var0 = jse.V("!".concat((String)var35_37), new char[]{'.'});
                                                        break block169;
                                                    }
                                                    if (var0 != null || var2_5 != null) break block170;
                                                    var0 = kkp.b;
                                                    break block169;
                                                }
                                                if (var0 == null) break block171;
                                                var0 = var35_37 = jse.V((CharSequence)var0, new char[]{'.'});
                                                if (var35_37 != null) break block172;
                                            }
                                            var0 = jpa.a;
                                        }
                                        if (var2_5 == null) break block173;
                                        var2_5 = var35_37 = jse.V((CharSequence)var2_5, new char[]{'.'});
                                        if (var35_37 != null) break block174;
                                    }
                                    var2_5 = jpa.a;
                                }
                                if (var0.size() <= var2_5.size()) {
                                    var0 = var2_5;
                                }
                            }
                            if (var40_41.size() != var0.size() || ((String)var0.get(0)).charAt(0) == '!') break block175;
                            var0 = null;
                            ** GOTO lbl621
                        }
                        if (((String)var0.get(0)).charAt(0) == '!') {
                            var3_10 = var40_41.size();
                            var5_13 = var0.size();
                        } else {
                            var3_10 = var40_41.size();
                            var5_13 = var0.size() + 1;
                        }
                        var0 = var39_40.a((String)var34_36);
                        jse.e(var0, "<this>");
                        var0 = new wn(var0, 2);
                        if ((var3_10 -= var5_13) >= 0) {
                            if (var3_10 != 0) {
                                var0 = new jtg((jtl)var0, var3_10);
                            }
                            var0 = jsl.f((jtl)var0, ".");
lbl621:
                            // 2 sources

                            if (var0 == null) {
                                ** continue;
                            }
                        } else {
                            throw new IllegalArgumentException(a.ah(var3_10, "Requested element count ", " is less than zero."));
lbl625:
                            // 1 sources

                            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
                        }
                    }
                    var5_13 = 2;
                    var0 = "/";
                    if (var37_38 != null && jse.X(var37_38, "/")) {
                        var0 = var37_38;
                    } else {
                        var2_5 = var1_4.b();
                        var3_10 = jse.N((CharSequence)var2_5, '/', 0, 6);
                        if (var3_10 != 0) {
                            var0 = var2_5.substring(0, var3_10);
                            jse.d(var0, "substring(...)");
                        }
                    }
                    var3_10 = 0;
                    var2_5 = new kgb(var41_42, var42_43, var21_29, (String)var34_36, (String)var0, (boolean)var14_22, (boolean)var15_23, (boolean)var13_21, var32_35);
                    var0 = var33_11;
                }
                if (var2_5 == null) {
                    var33_11 = var36_15 /* !! */ ;
                } else {
                    var33_11 = var36_15 /* !! */ ;
                    if (var36_15 /* !! */  == null) {
                        var33_11 = new ArrayList<E>();
                    }
                    var33_11.add(var2_5);
                }
                var6_8 = var4_9;
                var2_5 = var0;
                var4_9 = var3_10;
                var3_10 = var6_8;
                var36_15 /* !! */  = var33_11;
            }
            if (var36_15 /* !! */  != null) {
                var0 = DesugarCollections.unmodifiableList(var36_15 /* !! */ );
                jse.b(var0);
            } else {
                var0 = jpa.a;
            }
            if (!var0.isEmpty()) {
                jse.e(var0, "cookies");
            }
        }
        return;
        catch (IllegalArgumentException var2_6) {
            var2_5 = var0;
            ** continue;
        }
        catch (IllegalArgumentException var2_7) {
            var2_5 = var0;
            var6_8 = var11_20;
            var0 = var33_11;
            ** continue;
        }
        {
            catch (IllegalArgumentException | NumberFormatException var0_3) {
                var4_9 = var14_22;
                var5_13 = var13_21;
                var31_34 = var32_35;
                var25_31 = var21_29;
                var27_32 = var23_30;
                var39_40 = var38_39;
                var40_41 = var37_38;
                var0 = var34_36;
                ** continue;
            }
        }
    }

    public static final boolean b(kgv kgv2) {
        if (!jse.i(kgv2.a.b, "HEAD")) {
            int n2 = kgv2.d;
            if ((n2 < 100 || n2 >= 200) && n2 != 204 && n2 != 304) {
                return true;
            }
            return khb.i(kgv2) != -1L || jse.H("chunked", kgv.a(kgv2, "Transfer-Encoding"));
            {
            }
        }
        return false;
    }
}

