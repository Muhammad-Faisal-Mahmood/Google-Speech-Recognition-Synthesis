/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.Color
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.util.StateSet
 *  android.util.TypedValue
 *  android.util.Xml
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class sx {
    public static final int a = 0;
    private static final ThreadLocal b = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) {
        int n2;
        AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xmlPullParser);
        while ((n2 = xmlPullParser.next()) != 2) {
            if (n2 != 1) continue;
            throw new XmlPullParserException("No start tag found");
        }
        return sx.b(resources, xmlPullParser, attributeSet, theme);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ColorStateList b(Resources var0, XmlPullParser var1_1, AttributeSet var2_2, Resources.Theme var3_3) {
        block35: {
            var32_4 /* !! */  = var1_1 /* !! */ .getName();
            if (!var32_4 /* !! */ .equals("selector")) break block35;
            var24_5 = var1_1 /* !! */ .getDepth();
            var26_6 = 1;
            ++var24_5;
            var35_7 /* !! */  = new int[20][];
            var32_4 /* !! */  = new int[20];
            var27_8 = 0;
            while ((var25_28 = var1_1 /* !! */ .next()) != var26_6 && ((var28_29 = var1_1 /* !! */ .getDepth()) >= var24_5 || var25_28 != 3)) {
                block38: {
                    block34: {
                        block39: {
                            block36: {
                                block37: {
                                    if (var25_28 != 2 || var28_29 > var24_5 || !var1_1 /* !! */ .getName().equals("item")) continue;
                                    var33_33 = sd.a;
                                    var33_33 = var3_3 == null ? (Object)var0 /* !! */ .obtainAttributes(var2_2, (int[])var33_33) : (Object)var3_3.obtainStyledAttributes(var2_2, (int[])var33_33, 0, 0);
                                    var25_28 = var33_33.getResourceId(0, -1);
                                    if (var25_28 == -1) ** GOTO lbl-1000
                                    var36_36 = sx.b;
                                    var34_34 /* !! */  = (TypedValue)var36_36.get();
                                    if (var34_34 /* !! */  == null) {
                                        var34_34 /* !! */  = new TypedValue();
                                        var36_36.set(var34_34 /* !! */ );
                                    }
                                    var0 /* !! */ .getValue(var25_28, (TypedValue)var34_34 /* !! */ , (boolean)var26_6);
                                    if (var34_34 /* !! */ .type < 28 || var34_34 /* !! */ .type > 31) {
                                        try {
                                            var25_28 = sx.a(var0 /* !! */ , (XmlPullParser)var0 /* !! */ .getXml(var25_28), var3_3).getDefaultColor();
                                        }
                                        catch (Exception var34_35) {
                                            var25_28 = var33_33.getColor(0, -65281);
                                        }
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var25_28 = var33_33.getColor(0, -65281);
                                    }
                                    var6_10 = var33_33.hasValue(var26_6) != false ? var33_33.getFloat(var26_6, 1.0f) : (var33_33.hasValue(3) != false ? var33_33.getFloat(3, 1.0f) : 1.0f);
                                    var10_14 = Build.VERSION.SDK_INT >= 31 && var33_33.hasValue(2) != false ? var33_33.getFloat(2, -1.0f) : var33_33.getFloat(4, -1.0f);
                                    var33_33.recycle();
                                    var31_32 = var2_2.getAttributeCount();
                                    var33_33 = new int[var31_32];
                                    var28_29 = 0;
                                    for (var26_6 = 0; var26_6 < var31_32; ++var26_6) {
                                        var30_31 = var2_2.getAttributeNameResource(var26_6);
                                        var29_30 = var28_29;
                                        if (var30_31 != 16843173) {
                                            var29_30 = var28_29;
                                            if (var30_31 != 16843551) {
                                                var29_30 = var28_29;
                                                if (var30_31 != 2130968634) {
                                                    var29_30 = var28_29;
                                                    if (var30_31 != 2130969390) {
                                                        var29_30 = var30_31;
                                                        if (!var2_2.getAttributeBooleanValue(var26_6, false)) {
                                                            var29_30 = -var30_31;
                                                        }
                                                        var33_33[var28_29] = var29_30;
                                                        var29_30 = var28_29 + 1;
                                                    }
                                                }
                                            }
                                        }
                                        var28_29 = var29_30;
                                    }
                                    var33_33 = StateSet.trimStateSet((int[])var33_33, (int)var28_29);
                                    var34_34 /* !! */  = (Object[])var33_33;
                                    var9_13 = 100.0f;
                                    var26_6 = var10_14 >= 0.0f && var10_14 <= 100.0f ? 1 : 0;
                                    var28_29 = var26_6;
                                    if (var6_10 != 1.0f) break block36;
                                    if (var26_6 != 0) break block37;
                                    var33_33 = var34_34 /* !! */ ;
                                    break block38;
                                }
                                var28_29 = 1;
                            }
                            var26_6 = rw.z((int)((float)Color.alpha((int)var25_28) * var6_10 + 0.5f), 0, 255);
                            if (var28_29 == 0) break block39;
                            var36_36 = sv.b(var25_28);
                            var7_11 = var36_36.a;
                            var6_10 = var36_36.b;
                            var4_9 = var6_10;
                            var39_39 = te.a;
                            if (var4_9 < 1.0) ** GOTO lbl-1000
                            var25_28 = Math.round(var10_14);
                            var36_36 = var32_4 /* !! */ ;
                            if (!((double)var25_28 <= 0.0) && !((double)Math.round(var10_14) >= 100.0)) {
                                var8_12 = var7_11 < 0.0f ? 0.0f : Math.min(360.0f, var7_11);
                                var7_11 = var6_10;
                                var37_37 = null;
                                var12_16 = 0.0f;
                                var25_28 = 1;
                                var33_33 = var36_36;
                                var11_15 = var6_10;
                                var6_10 = var9_13;
                                var32_4 /* !! */  = var34_34 /* !! */ ;
                                while (Math.abs(var12_16 - var11_15) >= 0.4f) {
                                    block33: {
                                        var13_17 = var6_10;
                                        var16_20 = 1000.0f;
                                        var15_19 = 1000.0f;
                                        var14_18 = 0.0f;
                                        var36_36 = null;
                                        var34_34 /* !! */  = (Object[])var33_33;
                                        var9_13 = var6_10;
                                        var6_10 = var8_12;
                                        while (Math.abs(var14_18 - var13_17) > 0.01f) {
                                            var9_13 = var14_18 + (var13_17 - var14_18) / 2.0f;
                                            var28_29 = sv.c(var9_13, var7_11, var6_10).a(te.a);
                                            var18_22 = sw.a(Color.red((int)var28_29));
                                            var21_25 = sw.a(Color.green((int)var28_29));
                                            var17_21 = sw.a(Color.blue((int)var28_29));
                                            var33_33 = sw.d[1];
                                            var22_26 = var33_33[0];
                                            var19_23 = var33_33[1];
                                            var20_24 = var33_33[2];
                                            var8_12 = 100.0f;
                                            var17_21 = (var17_21 = (var18_22 * var22_26 + var21_25 * var19_23 + var17_21 * var20_24) / 100.0f) <= 0.008856452f ? (var17_21 *= 903.2963f) : (float)Math.cbrt(var17_21) * 116.0f - 16.0f;
                                            var18_22 = Math.abs(var10_14 - var17_21);
                                            if (var18_22 < 0.2f) {
                                                var38_38 = sv.b(var28_29);
                                                var33_33 = sv.c(var38_38.c, var38_38.b, var6_10);
                                                var21_25 = var38_38.d;
                                                var20_24 = (int)var33_33.d;
                                                var22_26 = (int)var38_38.e;
                                                var23_27 = var33_33.e;
                                                var19_23 = (int)(var38_38.f - var33_33.f);
                                                var20_24 = (int)(var21_25 - var20_24);
                                                var19_23 = (int)(Math.pow(Math.sqrt(var20_24 * var20_24 + (var22_26 -= var23_27) * var22_26 + var19_23 * var19_23), 0.63) * 1.41);
                                                var33_33 = var36_36;
                                                if (var19_23 <= 1.0f) {
                                                    var15_19 = var19_23;
                                                    var33_33 = var38_38;
                                                    var16_20 = var18_22;
                                                }
                                            } else {
                                                var33_33 = var36_36;
                                            }
                                            if (var16_20 == 0.0f) {
                                                var36_36 = var33_33;
                                                if (var15_19 == 0.0f) break block33;
                                            }
                                            if ((var28_29 = (int)(var17_21 == var10_14 ? 0 : (var17_21 < var10_14 ? -1 : 1))) >= 0) {
                                                var13_17 = var9_13;
                                            }
                                            if (var28_29 < 0) {
                                                var14_18 = var9_13;
                                            }
                                            var9_13 = 100.0f;
                                            var36_36 = var33_33;
                                        }
                                        var8_12 = var9_13;
                                    }
                                    var33_33 = var32_4 /* !! */ ;
                                    var32_4 /* !! */  = var34_34 /* !! */ ;
                                    if (var25_28 != 0) {
                                        if (var36_36 != null) {
                                            var25_28 = var36_36.a(var39_39);
                                            break block34;
                                        }
                                        var9_13 = var12_16 + (var11_15 - var12_16) / 2.0f;
                                        var7_11 = var8_12;
                                        var34_34 /* !! */  = var32_4 /* !! */ ;
                                        var32_4 /* !! */  = (Object[])var33_33;
                                        var25_28 = 0;
                                        var8_12 = var6_10;
                                        var6_10 = var7_11;
                                        var7_11 = var9_13;
                                        var33_33 = var34_34 /* !! */ ;
                                        continue;
                                    }
                                    if (var36_36 != null) {
                                        var37_37 = var36_36;
                                    }
                                    if (var36_36 != null) {
                                        var12_16 = var7_11;
                                    }
                                    if (var36_36 == null) {
                                        var11_15 = var7_11;
                                    }
                                    var9_13 = var12_16 + (var11_15 - var12_16) / 2.0f;
                                    var7_11 = var8_12;
                                    var34_34 /* !! */  = var32_4 /* !! */ ;
                                    var32_4 /* !! */  = (Object[])var33_33;
                                    var8_12 = var6_10;
                                    var6_10 = var7_11;
                                    var7_11 = var9_13;
                                    var33_33 = var34_34 /* !! */ ;
                                }
                                var34_34 /* !! */  = var32_4 /* !! */ ;
                                var32_4 /* !! */  = (Object[])var33_33;
                                if (var37_37 == null) {
                                    var25_28 = sw.b(var10_14);
                                    var33_33 = var34_34 /* !! */ ;
                                } else {
                                    var25_28 = var37_37.a(var39_39);
                                    var33_33 = var34_34 /* !! */ ;
                                }
                            } else lbl-1000:
                            // 2 sources

                            {
                                var25_28 = sw.b(var10_14);
                            }
                            break block34;
                        }
                        var33_33 = var34_34 /* !! */ ;
                    }
                    var25_28 = 0xFFFFFF & var25_28 | var26_6 << 24;
                }
                var26_6 = var27_8 + 1;
                if (var26_6 > var32_4 /* !! */ .length) {
                    var34_34 /* !! */  = new int[kt.x(var27_8)];
                    System.arraycopy(var32_4 /* !! */ , 0, var34_34 /* !! */ , 0, var27_8);
                    var32_4 /* !! */  = var34_34 /* !! */ ;
                }
                var32_4 /* !! */ [var27_8] = var25_28;
                var34_34 /* !! */  = (Object[])var35_7 /* !! */ ;
                if (var26_6 > var35_7 /* !! */ .length) {
                    var34_34 /* !! */  = (Object[])Array.newInstance(var35_7 /* !! */ .getClass().getComponentType(), kt.x(var27_8));
                    System.arraycopy(var35_7 /* !! */ , 0, var34_34 /* !! */ , 0, var27_8);
                }
                var34_34 /* !! */ [var27_8] = (TypedValue)var33_33;
                var35_7 /* !! */  = (int[][])var34_34 /* !! */ ;
                var27_8 = var26_6;
                var26_6 = 1;
            }
            var1_1 /* !! */  = (XmlPullParser)new int[var27_8];
            var0 /* !! */  = (Resources)new int[var27_8][];
            System.arraycopy(var32_4 /* !! */ , 0, var1_1 /* !! */ , 0, var27_8);
            System.arraycopy(var35_7 /* !! */ , 0, var0 /* !! */ , 0, var27_8);
            return new ColorStateList((int[][])var0 /* !! */ , (int[])var1_1 /* !! */ );
        }
        var0 /* !! */  = new StringBuilder();
        var0 /* !! */ .append(var1_1 /* !! */ .getPositionDescription());
        var0 /* !! */ .append(": invalid color state list tag ");
        var0 /* !! */ .append((String)var32_4 /* !! */ );
        throw new XmlPullParserException(var0 /* !! */ .toString());
    }
}

