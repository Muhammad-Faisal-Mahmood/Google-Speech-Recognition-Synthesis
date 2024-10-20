/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.content.res.XmlResourceParser
 *  android.graphics.drawable.ColorDrawable
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.util.SparseIntArray
 *  android.util.TypedValue
 *  android.util.Xml
 *  android.view.LayoutInflater
 *  android.view.View
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class ro {
    public static final int[] a;
    private static final SparseIntArray c;
    private static final SparseIntArray d;
    public final HashMap b;
    private final HashMap e = new HashMap();

    static {
        SparseIntArray sparseIntArray;
        SparseIntArray sparseIntArray2;
        a = new int[]{0, 4, 8};
        c = sparseIntArray2 = new SparseIntArray();
        d = sparseIntArray = new SparseIntArray();
        int[] nArray = rs.a;
        sparseIntArray2.append(82, 25);
        sparseIntArray2.append(83, 26);
        sparseIntArray2.append(85, 29);
        sparseIntArray2.append(86, 30);
        sparseIntArray2.append(92, 36);
        sparseIntArray2.append(91, 35);
        sparseIntArray2.append(63, 4);
        sparseIntArray2.append(62, 3);
        sparseIntArray2.append(58, 1);
        sparseIntArray2.append(60, 91);
        sparseIntArray2.append(59, 92);
        sparseIntArray2.append(101, 6);
        sparseIntArray2.append(102, 7);
        sparseIntArray2.append(70, 17);
        sparseIntArray2.append(71, 18);
        sparseIntArray2.append(72, 19);
        sparseIntArray2.append(54, 99);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(87, 32);
        sparseIntArray2.append(88, 33);
        sparseIntArray2.append(69, 10);
        sparseIntArray2.append(68, 9);
        sparseIntArray2.append(106, 13);
        sparseIntArray2.append(109, 16);
        sparseIntArray2.append(107, 14);
        sparseIntArray2.append(104, 11);
        sparseIntArray2.append(108, 15);
        sparseIntArray2.append(105, 12);
        sparseIntArray2.append(95, 40);
        sparseIntArray2.append(80, 39);
        sparseIntArray2.append(79, 41);
        sparseIntArray2.append(94, 42);
        sparseIntArray2.append(78, 20);
        sparseIntArray2.append(93, 37);
        sparseIntArray2.append(67, 5);
        sparseIntArray2.append(81, 87);
        sparseIntArray2.append(90, 87);
        sparseIntArray2.append(84, 87);
        sparseIntArray2.append(61, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(96, 95);
        sparseIntArray2.append(73, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(97, 54);
        sparseIntArray2.append(74, 55);
        sparseIntArray2.append(98, 56);
        sparseIntArray2.append(75, 57);
        sparseIntArray2.append(99, 58);
        sparseIntArray2.append(76, 59);
        sparseIntArray2.append(64, 61);
        sparseIntArray2.append(66, 62);
        sparseIntArray2.append(65, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(121, 65);
        sparseIntArray2.append(35, 66);
        sparseIntArray2.append(122, 67);
        sparseIntArray2.append(113, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(112, 68);
        sparseIntArray2.append(100, 69);
        sparseIntArray2.append(77, 70);
        sparseIntArray2.append(111, 97);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(114, 76);
        sparseIntArray2.append(89, 77);
        sparseIntArray2.append(123, 78);
        sparseIntArray2.append(56, 80);
        sparseIntArray2.append(55, 81);
        sparseIntArray2.append(116, 82);
        sparseIntArray2.append(120, 83);
        sparseIntArray2.append(119, 84);
        sparseIntArray2.append(118, 85);
        sparseIntArray2.append(117, 86);
        sparseIntArray.append(85, 6);
        sparseIntArray.append(85, 7);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(89, 13);
        sparseIntArray.append(92, 16);
        sparseIntArray.append(90, 14);
        sparseIntArray.append(87, 11);
        sparseIntArray.append(91, 15);
        sparseIntArray.append(88, 12);
        sparseIntArray.append(78, 40);
        sparseIntArray.append(71, 39);
        sparseIntArray.append(70, 41);
        sparseIntArray.append(77, 42);
        sparseIntArray.append(69, 20);
        sparseIntArray.append(76, 37);
        sparseIntArray.append(60, 5);
        sparseIntArray.append(72, 87);
        sparseIntArray.append(75, 87);
        sparseIntArray.append(73, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(56, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(79, 95);
        sparseIntArray.append(64, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(80, 54);
        sparseIntArray.append(65, 55);
        sparseIntArray.append(81, 56);
        sparseIntArray.append(66, 57);
        sparseIntArray.append(82, 58);
        sparseIntArray.append(67, 59);
        sparseIntArray.append(59, 62);
        sparseIntArray.append(58, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(105, 65);
        sparseIntArray.append(34, 66);
        sparseIntArray.append(106, 67);
        sparseIntArray.append(96, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(97, 98);
        sparseIntArray.append(95, 68);
        sparseIntArray.append(83, 69);
        sparseIntArray.append(68, 70);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(98, 76);
        sparseIntArray.append(74, 77);
        sparseIntArray.append(107, 78);
        sparseIntArray.append(55, 80);
        sparseIntArray.append(54, 81);
        sparseIntArray.append(100, 82);
        sparseIntArray.append(104, 83);
        sparseIntArray.append(103, 84);
        sparseIntArray.append(102, 85);
        sparseIntArray.append(101, 86);
        sparseIntArray.append(94, 97);
    }

    public ro() {
        this.b = new HashMap();
    }

    public static int a(TypedArray typedArray, int n2, int n3) {
        if ((n3 = typedArray.getResourceId(n2, n3)) == -1) {
            return typedArray.getInt(n2, -1);
        }
        return n3;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void e(Object object, TypedArray object2, int n2, int n3) {
        String string;
        block31: {
            block25: {
                boolean bl2;
                block30: {
                    block29: {
                        block26: {
                            block27: {
                                int n4;
                                block28: {
                                    int n5 = object2.peekValue((int)n2).type;
                                    bl2 = true;
                                    n4 = 0;
                                    if (n5 == 3) break block25;
                                    if (n5 == 5) break block26;
                                    n5 = object2.getInt(n2, 0);
                                    if (n5 == -4) break block27;
                                    if (n5 == -3) break block28;
                                    n2 = n5;
                                    if (n5 == -2) break block29;
                                    n2 = n5;
                                    if (n5 == -1) break block29;
                                }
                                bl2 = false;
                                n2 = n4;
                                break block30;
                            }
                            n2 = -2;
                            break block30;
                        }
                        n2 = object2.getDimensionPixelSize(n2, 0);
                    }
                    bl2 = false;
                }
                if (object instanceof rf) {
                    object = (rf)((Object)object);
                    if (n3 == 0) {
                        ((rf)((Object)object)).width = n2;
                        ((rf)((Object)object)).aa = bl2;
                        return;
                    }
                    ((rf)((Object)object)).height = n2;
                    ((rf)((Object)object)).ab = bl2;
                    return;
                }
                if (object instanceof rk) {
                    object = (rk)object;
                    if (n3 == 0) {
                        ((rk)object).d = n2;
                        ((rk)object).an = bl2;
                        return;
                    }
                    ((rk)object).e = n2;
                    ((rk)object).ao = bl2;
                    return;
                }
                if (!(object instanceof ri)) return;
                object = (ri)object;
                if (n3 == 0) {
                    ((ri)object).b(23, n2);
                    ((ri)object).d(80, bl2);
                    return;
                }
                ((ri)object).b(21, n2);
                ((ri)object).d(81, bl2);
                return;
            }
            string = object2.getString(n2);
            if (string == null) return;
            n2 = string.indexOf(61);
            if (n2 <= 0) return;
            if (n2 >= string.length() - 1) return;
            object2 = string.substring(0, n2);
            if ((string = string.substring(n2 + 1)).length() <= 0) return;
            object2 = ((String)object2).trim();
            string = string.trim();
            if ("ratio".equalsIgnoreCase((String)object2)) {
                if (object instanceof rf) {
                    object = (rf)((Object)object);
                    if (n3 == 0) {
                        ((rf)((Object)object)).width = 0;
                    } else {
                        ((rf)((Object)object)).height = 0;
                    }
                    ro.f((rf)((Object)object), string);
                    return;
                }
                if (object instanceof rk) {
                    ((rk)object).A = string;
                    return;
                }
                if (!(object instanceof ri)) return;
                ((ri)object).c(5, string);
                return;
            }
            if ("weight".equalsIgnoreCase((String)object2)) {
                float f2 = Float.parseFloat(string);
                if (object instanceof rf) {
                    object = (rf)((Object)object);
                    if (n3 == 0) {
                        ((rf)((Object)object)).width = 0;
                        ((rf)((Object)object)).L = f2;
                        return;
                    }
                    ((rf)((Object)object)).height = 0;
                    ((rf)((Object)object)).M = f2;
                    return;
                }
                if (object instanceof rk) {
                    object = (rk)object;
                    if (n3 == 0) {
                        ((rk)object).d = 0;
                        ((rk)object).W = f2;
                        return;
                    }
                    ((rk)object).e = 0;
                    ((rk)object).V = f2;
                    return;
                }
                if (!(object instanceof ri)) return;
                object = (ri)object;
                if (n3 == 0) {
                    ((ri)object).b(23, 0);
                    ((ri)object).a(39, f2);
                    return;
                }
                ((ri)object).b(21, 0);
                ((ri)object).a(40, f2);
                return;
            }
            if (!"parent".equalsIgnoreCase((String)object2)) return;
            try {}
            catch (NumberFormatException numberFormatException) {
                return;
            }
            break block31;
            catch (NumberFormatException numberFormatException) {
                return;
            }
        }
        float f3 = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(string)));
        if (object instanceof rf) {
            object = (rf)((Object)object);
            if (n3 == 0) {
                ((rf)((Object)object)).width = 0;
                ((rf)((Object)object)).V = f3;
                ((rf)((Object)object)).P = 2;
                return;
            }
            ((rf)((Object)object)).height = 0;
            ((rf)((Object)object)).W = f3;
            ((rf)((Object)object)).Q = 2;
            return;
        }
        if (object instanceof rk) {
            object = (rk)object;
            if (n3 == 0) {
                ((rk)object).d = 0;
                ((rk)object).af = f3;
                ((rk)object).Z = 2;
                return;
            }
            ((rk)object).e = 0;
            ((rk)object).ag = f3;
            ((rk)object).aa = 2;
            return;
        }
        if (!(object instanceof ri)) return;
        object = (ri)object;
        if (n3 == 0) {
            ((ri)object).b(23, 0);
            ((ri)object).b(54, 2);
            return;
        }
        ((ri)object).b(21, 0);
        ((ri)object).b(55, 2);
    }

    /*
     * Unable to fully structure code
     */
    static void f(rf var0, String var1_1) {
        block9: {
            block10: {
                var6_2 = -1;
                var2_4 = var3_3 = NaNf;
                if (var1_1 == null) break block9;
                var9_5 = var1_1.indexOf(44);
                var8_6 = var1_1.length();
                var7_7 = 0;
                var6_2 = 0;
                if (var9_5 > 0 && var9_5 < var8_6 - 1) {
                    var10_8 = var1_1.substring(0, var9_5);
                    if (!var10_8.equalsIgnoreCase("W")) {
                        var6_2 = var10_8.equalsIgnoreCase("H") != false ? 1 : -1;
                    }
                    var7_7 = var9_5 + 1;
                } else {
                    var6_2 = -1;
                }
                var9_5 = var1_1.indexOf(58);
                if (var9_5 < 0 || var9_5 >= var8_6 - 1) break block10;
                var11_10 = var1_1.substring(var7_7, var9_5);
                var10_8 = var1_1.substring(var9_5 + 1);
                var2_4 = var3_3;
                if (var11_10.length() <= 0) break block9;
                var2_4 = var3_3;
                if (var10_8.length() <= 0) break block9;
                try {
                    var4_11 = Float.parseFloat(var11_10);
                    var5_12 = Float.parseFloat(var10_8);
                    var2_4 = var3_3;
                }
                catch (NumberFormatException var10_9) {
                    var2_4 = var3_3;
                    ** continue;
                }
                if (!(var4_11 > 0.0f)) break block9;
                var2_4 = var3_3;
                if (!(var5_12 > 0.0f)) break block9;
                if (var6_2 != 1) ** GOTO lbl37
                var2_4 = Math.abs(var5_12 / var4_11);
                break block9;
lbl37:
                // 1 sources

                var2_4 = Math.abs(var4_11 / var5_12);
                break block9;
            }
            var10_8 = var1_1.substring(var7_7);
            var2_4 = var3_3;
            if (var10_8.length() > 0) {
                var2_4 = Float.parseFloat(var10_8);
            }
        }
lbl46:
        // 2 sources

        while (true) {
            var0.I = var1_1;
            var0.J = var2_4;
            var0.K = var6_2;
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final int[] g(View var0, String var1_1) {
        var9_3 = var1_1.split(",");
        var8_4 = var0.getContext();
        var7_5 = new int[var9_3.length];
        var5_6 = 0;
        var4_7 = 0;
        while (var5_6 < (var2_8 = var9_3.length)) {
            block10: {
                var10_11 = var9_3[var5_6].trim();
                var6_10 = null;
                try {
                    var3_9 = rr.class.getField(var10_11).getInt(null);
                }
                catch (Exception var1_2) {
                    var3_9 = 0;
                }
                var2_8 = var3_9;
                if (var3_9 == 0) {
                    var2_8 = var8_4.getResources().getIdentifier(var10_11, "id", var8_4.getPackageName());
                }
                var3_9 = var2_8;
                if (var2_8 != 0) break block10;
                if (!var0.isInEditMode() || !(var0.getParent() instanceof ConstraintLayout)) ** GOTO lbl-1000
                var11_12 = (ConstraintLayout)var0.getParent();
                var1_1 = var6_10;
                if (var10_11 instanceof String) {
                    var12_13 = var11_12.f;
                    var1_1 = var6_10;
                    if (var12_13 != null) {
                        var1_1 = var6_10;
                        if (var12_13.containsKey(var10_11)) {
                            var1_1 = var11_12.f.get(var10_11);
                        }
                    }
                }
                if (var1_1 != null && var1_1 instanceof Integer) {
                    var3_9 = (Integer)var1_1;
                } else lbl-1000:
                // 2 sources

                {
                    var3_9 = 0;
                }
            }
            var7_5[var4_7] = var3_9;
            ++var5_6;
            ++var4_7;
        }
        if (var4_7 != var2_8) {
            return Arrays.copyOf(var7_5, var4_7);
        }
        return var7_5;
    }

    private static void h(rj rj2, TypedArray typedArray) {
        ri ri2;
        int n2 = typedArray.getIndexCount();
        rj2.g = ri2 = new ri();
        rj2.c.b = false;
        rj2.d.c = false;
        rj2.b.a = false;
        rj2.e.b = false;
        block82: for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = typedArray.getIndex(i2);
            switch (d.get(n3)) {
                default: {
                    Log.w((String)"ConstraintSet", (String)a.ag(n3, "Unknown attribute 0x", c));
                    continue block82;
                }
                case 99: {
                    ri2.d(99, typedArray.getBoolean(n3, rj2.d.i));
                    continue block82;
                }
                case 98: {
                    if (typedArray.peekValue((int)n3).type == 3) {
                        typedArray.getString(n3);
                        continue block82;
                    }
                    rj2.a = typedArray.getResourceId(n3, rj2.a);
                    continue block82;
                }
                case 97: {
                    ri2.b(97, typedArray.getInt(n3, rj2.d.aq));
                    continue block82;
                }
                case 96: {
                    ro.e(ri2, typedArray, n3, 1);
                    continue block82;
                }
                case 95: {
                    ro.e(ri2, typedArray, n3, 0);
                    continue block82;
                }
                case 94: {
                    ri2.b(94, typedArray.getDimensionPixelSize(n3, rj2.d.U));
                    continue block82;
                }
                case 93: {
                    ri2.b(93, typedArray.getDimensionPixelSize(n3, rj2.d.N));
                    continue block82;
                }
                case 87: {
                    Log.w((String)"ConstraintSet", (String)a.ag(n3, "unused attribute 0x", c));
                    continue block82;
                }
                case 86: {
                    Object object = typedArray.peekValue(n3);
                    if (((TypedValue)object).type == 1) {
                        rj2.c.o = typedArray.getResourceId(n3, -1);
                        ri2.b(89, rj2.c.o);
                        object = rj2.c;
                        if (((rl)object).o == -1) continue block82;
                        ((rl)object).n = -2;
                        ri2.b(88, -2);
                        continue block82;
                    }
                    if (((TypedValue)object).type == 3) {
                        rj2.c.m = typedArray.getString(n3);
                        ri2.c(90, rj2.c.m);
                        if (rj2.c.m.indexOf("/") > 0) {
                            rj2.c.o = typedArray.getResourceId(n3, -1);
                            ri2.b(89, rj2.c.o);
                            rj2.c.n = -2;
                            ri2.b(88, -2);
                            continue block82;
                        }
                        rj2.c.n = -1;
                        ri2.b(88, -1);
                        continue block82;
                    }
                    object = rj2.c;
                    ((rl)object).n = typedArray.getInteger(n3, ((rl)object).o);
                    ri2.b(88, rj2.c.n);
                    continue block82;
                }
                case 85: {
                    ri2.a(85, typedArray.getFloat(n3, rj2.c.k));
                    continue block82;
                }
                case 84: {
                    ri2.b(84, typedArray.getInteger(n3, rj2.c.l));
                    continue block82;
                }
                case 83: {
                    ri2.b(83, ro.a(typedArray, n3, rj2.e.j));
                    continue block82;
                }
                case 82: {
                    ri2.b(82, typedArray.getInteger(n3, rj2.c.d));
                    continue block82;
                }
                case 81: {
                    ri2.d(81, typedArray.getBoolean(n3, rj2.d.ao));
                    continue block82;
                }
                case 80: {
                    ri2.d(80, typedArray.getBoolean(n3, rj2.d.an));
                    continue block82;
                }
                case 79: {
                    ri2.a(79, typedArray.getFloat(n3, rj2.c.h));
                    continue block82;
                }
                case 78: {
                    ri2.b(78, typedArray.getInt(n3, rj2.b.c));
                    continue block82;
                }
                case 77: {
                    ri2.c(77, typedArray.getString(n3));
                    continue block82;
                }
                case 76: {
                    ri2.b(76, typedArray.getInt(n3, rj2.c.f));
                    continue block82;
                }
                case 75: {
                    ri2.d(75, typedArray.getBoolean(n3, rj2.d.ap));
                    continue block82;
                }
                case 74: {
                    ri2.c(74, typedArray.getString(n3));
                    continue block82;
                }
                case 73: {
                    ri2.b(73, typedArray.getDimensionPixelSize(n3, rj2.d.ai));
                    continue block82;
                }
                case 72: {
                    ri2.b(72, typedArray.getInt(n3, rj2.d.ah));
                    continue block82;
                }
                case 71: {
                    Log.e((String)"ConstraintSet", (String)"CURRENTLY UNSUPPORTED");
                    continue block82;
                }
                case 70: {
                    ri2.a(70, typedArray.getFloat(n3, 1.0f));
                    continue block82;
                }
                case 69: {
                    ri2.a(69, typedArray.getFloat(n3, 1.0f));
                    continue block82;
                }
                case 68: {
                    ri2.a(68, typedArray.getFloat(n3, rj2.b.e));
                    continue block82;
                }
                case 67: {
                    ri2.a(67, typedArray.getFloat(n3, rj2.c.j));
                    continue block82;
                }
                case 66: {
                    ri2.b(66, typedArray.getInt(n3, 0));
                    continue block82;
                }
                case 65: {
                    if (typedArray.peekValue((int)n3).type == 3) {
                        ri2.c(65, typedArray.getString(n3));
                        continue block82;
                    }
                    ri2.c(65, qc.a[typedArray.getInteger(n3, 0)]);
                    continue block82;
                }
                case 64: {
                    ri2.b(64, ro.a(typedArray, n3, rj2.c.c));
                    continue block82;
                }
                case 63: {
                    ri2.a(63, typedArray.getFloat(n3, rj2.d.D));
                    continue block82;
                }
                case 62: {
                    ri2.b(62, typedArray.getDimensionPixelSize(n3, rj2.d.C));
                    continue block82;
                }
                case 60: {
                    ri2.a(60, typedArray.getFloat(n3, rj2.e.c));
                    continue block82;
                }
                case 59: {
                    ri2.b(59, typedArray.getDimensionPixelSize(n3, rj2.d.ae));
                    continue block82;
                }
                case 58: {
                    ri2.b(58, typedArray.getDimensionPixelSize(n3, rj2.d.ad));
                    continue block82;
                }
                case 57: {
                    ri2.b(57, typedArray.getDimensionPixelSize(n3, rj2.d.ac));
                    continue block82;
                }
                case 56: {
                    ri2.b(56, typedArray.getDimensionPixelSize(n3, rj2.d.ab));
                    continue block82;
                }
                case 55: {
                    ri2.b(55, typedArray.getInt(n3, rj2.d.aa));
                    continue block82;
                }
                case 54: {
                    ri2.b(54, typedArray.getInt(n3, rj2.d.Z));
                    continue block82;
                }
                case 53: {
                    ri2.a(53, typedArray.getDimension(n3, rj2.e.m));
                    continue block82;
                }
                case 52: {
                    ri2.a(52, typedArray.getDimension(n3, rj2.e.l));
                    continue block82;
                }
                case 51: {
                    ri2.a(51, typedArray.getDimension(n3, rj2.e.k));
                    continue block82;
                }
                case 50: {
                    ri2.a(50, typedArray.getDimension(n3, rj2.e.i));
                    continue block82;
                }
                case 49: {
                    ri2.a(49, typedArray.getDimension(n3, rj2.e.h));
                    continue block82;
                }
                case 48: {
                    ri2.a(48, typedArray.getFloat(n3, rj2.e.g));
                    continue block82;
                }
                case 47: {
                    ri2.a(47, typedArray.getFloat(n3, rj2.e.f));
                    continue block82;
                }
                case 46: {
                    ri2.a(46, typedArray.getFloat(n3, rj2.e.e));
                    continue block82;
                }
                case 45: {
                    ri2.a(45, typedArray.getFloat(n3, rj2.e.d));
                    continue block82;
                }
                case 44: {
                    ri2.d(44, true);
                    ri2.a(44, typedArray.getDimension(n3, rj2.e.o));
                    continue block82;
                }
                case 43: {
                    ri2.a(43, typedArray.getFloat(n3, rj2.b.d));
                    continue block82;
                }
                case 42: {
                    ri2.b(42, typedArray.getInt(n3, rj2.d.Y));
                    continue block82;
                }
                case 41: {
                    ri2.b(41, typedArray.getInt(n3, rj2.d.X));
                    continue block82;
                }
                case 40: {
                    ri2.a(40, typedArray.getFloat(n3, rj2.d.V));
                    continue block82;
                }
                case 39: {
                    ri2.a(39, typedArray.getFloat(n3, rj2.d.W));
                    continue block82;
                }
                case 38: {
                    rj2.a = n3 = typedArray.getResourceId(n3, rj2.a);
                    ri2.b(38, n3);
                    continue block82;
                }
                case 37: {
                    ri2.a(37, typedArray.getFloat(n3, rj2.d.z));
                    continue block82;
                }
                case 34: {
                    ri2.b(34, typedArray.getDimensionPixelSize(n3, rj2.d.J));
                    continue block82;
                }
                case 31: {
                    ri2.b(31, typedArray.getDimensionPixelSize(n3, rj2.d.M));
                    continue block82;
                }
                case 28: {
                    ri2.b(28, typedArray.getDimensionPixelSize(n3, rj2.d.I));
                    continue block82;
                }
                case 27: {
                    ri2.b(27, typedArray.getInt(n3, rj2.d.G));
                    continue block82;
                }
                case 24: {
                    ri2.b(24, typedArray.getDimensionPixelSize(n3, rj2.d.H));
                    continue block82;
                }
                case 23: {
                    ri2.b(23, typedArray.getLayoutDimension(n3, rj2.d.d));
                    continue block82;
                }
                case 22: {
                    Object object = rj2.b;
                    ri2.b(22, a[typedArray.getInt(n3, ((rm)object).b)]);
                    continue block82;
                }
                case 21: {
                    ri2.b(21, typedArray.getLayoutDimension(n3, rj2.d.e));
                    continue block82;
                }
                case 20: {
                    ri2.a(20, typedArray.getFloat(n3, rj2.d.y));
                    continue block82;
                }
                case 19: {
                    ri2.a(19, typedArray.getFloat(n3, rj2.d.h));
                    continue block82;
                }
                case 18: {
                    ri2.b(18, typedArray.getDimensionPixelOffset(n3, rj2.d.g));
                    continue block82;
                }
                case 17: {
                    ri2.b(17, typedArray.getDimensionPixelOffset(n3, rj2.d.f));
                    continue block82;
                }
                case 16: {
                    ri2.b(16, typedArray.getDimensionPixelSize(n3, rj2.d.P));
                    continue block82;
                }
                case 15: {
                    ri2.b(15, typedArray.getDimensionPixelSize(n3, rj2.d.T));
                    continue block82;
                }
                case 14: {
                    ri2.b(14, typedArray.getDimensionPixelSize(n3, rj2.d.Q));
                    continue block82;
                }
                case 13: {
                    ri2.b(13, typedArray.getDimensionPixelSize(n3, rj2.d.O));
                    continue block82;
                }
                case 12: {
                    ri2.b(12, typedArray.getDimensionPixelSize(n3, rj2.d.S));
                    continue block82;
                }
                case 11: {
                    ri2.b(11, typedArray.getDimensionPixelSize(n3, rj2.d.R));
                    continue block82;
                }
                case 8: {
                    ri2.b(8, typedArray.getDimensionPixelSize(n3, rj2.d.L));
                    continue block82;
                }
                case 7: {
                    ri2.b(7, typedArray.getDimensionPixelOffset(n3, rj2.d.F));
                    continue block82;
                }
                case 6: {
                    ri2.b(6, typedArray.getDimensionPixelOffset(n3, rj2.d.E));
                    continue block82;
                }
                case 5: {
                    ri2.c(5, typedArray.getString(n3));
                    continue block82;
                }
                case 2: {
                    ri2.b(2, typedArray.getDimensionPixelSize(n3, rj2.d.K));
                }
            }
        }
    }

    private static final rj i(Context context, AttributeSet object, boolean bl2) {
        rj rj2 = new rj();
        int[] nArray = bl2 ? rs.c : rs.a;
        context = context.obtainStyledAttributes(object, nArray);
        if (bl2) {
            ro.h(rj2, (TypedArray)context);
        } else {
            int n2 = context.getIndexCount();
            block96: for (int i2 = 0; i2 < n2; ++i2) {
                int n3 = context.getIndex(i2);
                if (n3 != 1 && n3 != 23 && n3 != 24) {
                    rj2.c.b = true;
                    rj2.d.c = true;
                    rj2.b.a = true;
                    rj2.e.b = true;
                }
                object = c;
                switch (object.get(n3)) {
                    default: {
                        Log.w((String)"ConstraintSet", (String)a.ag(n3, "Unknown attribute 0x", (SparseIntArray)object));
                        continue block96;
                    }
                    case 97: {
                        object = rj2.d;
                        object.aq = context.getInt(n3, object.aq);
                        continue block96;
                    }
                    case 96: {
                        ro.e(rj2.d, (TypedArray)context, n3, 1);
                        continue block96;
                    }
                    case 95: {
                        ro.e(rj2.d, (TypedArray)context, n3, 0);
                        continue block96;
                    }
                    case 94: {
                        object = rj2.d;
                        object.U = context.getDimensionPixelSize(n3, object.U);
                        continue block96;
                    }
                    case 93: {
                        object = rj2.d;
                        object.N = context.getDimensionPixelSize(n3, object.N);
                        continue block96;
                    }
                    case 92: {
                        object = rj2.d;
                        object.t = ro.a((TypedArray)context, n3, object.t);
                        continue block96;
                    }
                    case 91: {
                        object = rj2.d;
                        object.s = ro.a((TypedArray)context, n3, object.s);
                        continue block96;
                    }
                    case 87: {
                        Log.w((String)"ConstraintSet", (String)a.ag(n3, "unused attribute 0x", (SparseIntArray)object));
                        continue block96;
                    }
                    case 86: {
                        object = context.peekValue(n3);
                        if (object.type == 1) {
                            rj2.c.o = context.getResourceId(n3, -1);
                            object = rj2.c;
                            if (object.o == -1) continue block96;
                            object.n = -2;
                            continue block96;
                        }
                        if (object.type == 3) {
                            rj2.c.m = context.getString(n3);
                            if (rj2.c.m.indexOf("/") > 0) {
                                rj2.c.o = context.getResourceId(n3, -1);
                                rj2.c.n = -2;
                                continue block96;
                            }
                            rj2.c.n = -1;
                            continue block96;
                        }
                        object = rj2.c;
                        object.n = context.getInteger(n3, object.o);
                        continue block96;
                    }
                    case 85: {
                        object = rj2.c;
                        object.k = context.getFloat(n3, object.k);
                        continue block96;
                    }
                    case 84: {
                        object = rj2.c;
                        object.l = context.getInteger(n3, object.l);
                        continue block96;
                    }
                    case 83: {
                        object = rj2.e;
                        object.j = ro.a((TypedArray)context, n3, object.j);
                        continue block96;
                    }
                    case 82: {
                        object = rj2.c;
                        object.d = context.getInteger(n3, object.d);
                        continue block96;
                    }
                    case 81: {
                        object = rj2.d;
                        object.ao = context.getBoolean(n3, object.ao);
                        continue block96;
                    }
                    case 80: {
                        object = rj2.d;
                        object.an = context.getBoolean(n3, object.an);
                        continue block96;
                    }
                    case 79: {
                        object = rj2.c;
                        object.h = context.getFloat(n3, object.h);
                        continue block96;
                    }
                    case 78: {
                        object = rj2.b;
                        object.c = context.getInt(n3, object.c);
                        continue block96;
                    }
                    case 77: {
                        rj2.d.am = context.getString(n3);
                        continue block96;
                    }
                    case 76: {
                        object = rj2.c;
                        object.f = context.getInt(n3, object.f);
                        continue block96;
                    }
                    case 75: {
                        object = rj2.d;
                        object.ap = context.getBoolean(n3, object.ap);
                        continue block96;
                    }
                    case 74: {
                        rj2.d.al = context.getString(n3);
                        continue block96;
                    }
                    case 73: {
                        object = rj2.d;
                        object.ai = context.getDimensionPixelSize(n3, object.ai);
                        continue block96;
                    }
                    case 72: {
                        object = rj2.d;
                        object.ah = context.getInt(n3, object.ah);
                        continue block96;
                    }
                    case 71: {
                        Log.e((String)"ConstraintSet", (String)"CURRENTLY UNSUPPORTED");
                        continue block96;
                    }
                    case 70: {
                        rj2.d.ag = context.getFloat(n3, 1.0f);
                        continue block96;
                    }
                    case 69: {
                        rj2.d.af = context.getFloat(n3, 1.0f);
                        continue block96;
                    }
                    case 68: {
                        object = rj2.b;
                        object.e = context.getFloat(n3, object.e);
                        continue block96;
                    }
                    case 67: {
                        object = rj2.c;
                        object.j = context.getFloat(n3, object.j);
                        continue block96;
                    }
                    case 66: {
                        rj2.c.g = context.getInt(n3, 0);
                        continue block96;
                    }
                    case 65: {
                        if (context.peekValue((int)n3).type == 3) {
                            rj2.c.e = context.getString(n3);
                            continue block96;
                        }
                        rj2.c.e = qc.a[context.getInteger(n3, 0)];
                        continue block96;
                    }
                    case 64: {
                        object = rj2.c;
                        object.c = ro.a((TypedArray)context, n3, object.c);
                        continue block96;
                    }
                    case 63: {
                        object = rj2.d;
                        object.D = context.getFloat(n3, object.D);
                        continue block96;
                    }
                    case 62: {
                        object = rj2.d;
                        object.C = context.getDimensionPixelSize(n3, object.C);
                        continue block96;
                    }
                    case 61: {
                        object = rj2.d;
                        object.B = ro.a((TypedArray)context, n3, object.B);
                        continue block96;
                    }
                    case 60: {
                        object = rj2.e;
                        object.c = context.getFloat(n3, object.c);
                        continue block96;
                    }
                    case 59: {
                        object = rj2.d;
                        object.ae = context.getDimensionPixelSize(n3, object.ae);
                        continue block96;
                    }
                    case 58: {
                        object = rj2.d;
                        object.ad = context.getDimensionPixelSize(n3, object.ad);
                        continue block96;
                    }
                    case 57: {
                        object = rj2.d;
                        object.ac = context.getDimensionPixelSize(n3, object.ac);
                        continue block96;
                    }
                    case 56: {
                        object = rj2.d;
                        object.ab = context.getDimensionPixelSize(n3, object.ab);
                        continue block96;
                    }
                    case 55: {
                        object = rj2.d;
                        object.aa = context.getInt(n3, object.aa);
                        continue block96;
                    }
                    case 54: {
                        object = rj2.d;
                        object.Z = context.getInt(n3, object.Z);
                        continue block96;
                    }
                    case 53: {
                        object = rj2.e;
                        object.m = context.getDimension(n3, object.m);
                        continue block96;
                    }
                    case 52: {
                        object = rj2.e;
                        object.l = context.getDimension(n3, object.l);
                        continue block96;
                    }
                    case 51: {
                        object = rj2.e;
                        object.k = context.getDimension(n3, object.k);
                        continue block96;
                    }
                    case 50: {
                        object = rj2.e;
                        object.i = context.getDimension(n3, object.i);
                        continue block96;
                    }
                    case 49: {
                        object = rj2.e;
                        object.h = context.getDimension(n3, object.h);
                        continue block96;
                    }
                    case 48: {
                        object = rj2.e;
                        object.g = context.getFloat(n3, object.g);
                        continue block96;
                    }
                    case 47: {
                        object = rj2.e;
                        object.f = context.getFloat(n3, object.f);
                        continue block96;
                    }
                    case 46: {
                        object = rj2.e;
                        object.e = context.getFloat(n3, object.e);
                        continue block96;
                    }
                    case 45: {
                        object = rj2.e;
                        object.d = context.getFloat(n3, object.d);
                        continue block96;
                    }
                    case 44: {
                        object = rj2.e;
                        object.n = true;
                        object.o = context.getDimension(n3, object.o);
                        continue block96;
                    }
                    case 43: {
                        object = rj2.b;
                        object.d = context.getFloat(n3, object.d);
                        continue block96;
                    }
                    case 42: {
                        object = rj2.d;
                        object.Y = context.getInt(n3, object.Y);
                        continue block96;
                    }
                    case 41: {
                        object = rj2.d;
                        object.X = context.getInt(n3, object.X);
                        continue block96;
                    }
                    case 40: {
                        object = rj2.d;
                        object.V = context.getFloat(n3, object.V);
                        continue block96;
                    }
                    case 39: {
                        object = rj2.d;
                        object.W = context.getFloat(n3, object.W);
                        continue block96;
                    }
                    case 38: {
                        rj2.a = context.getResourceId(n3, rj2.a);
                        continue block96;
                    }
                    case 37: {
                        object = rj2.d;
                        object.z = context.getFloat(n3, object.z);
                        continue block96;
                    }
                    case 36: {
                        object = rj2.d;
                        object.n = ro.a((TypedArray)context, n3, object.n);
                        continue block96;
                    }
                    case 35: {
                        object = rj2.d;
                        object.o = ro.a((TypedArray)context, n3, object.o);
                        continue block96;
                    }
                    case 34: {
                        object = rj2.d;
                        object.J = context.getDimensionPixelSize(n3, object.J);
                        continue block96;
                    }
                    case 33: {
                        object = rj2.d;
                        object.v = ro.a((TypedArray)context, n3, object.v);
                        continue block96;
                    }
                    case 32: {
                        object = rj2.d;
                        object.u = ro.a((TypedArray)context, n3, object.u);
                        continue block96;
                    }
                    case 31: {
                        object = rj2.d;
                        object.M = context.getDimensionPixelSize(n3, object.M);
                        continue block96;
                    }
                    case 30: {
                        object = rj2.d;
                        object.m = ro.a((TypedArray)context, n3, object.m);
                        continue block96;
                    }
                    case 29: {
                        object = rj2.d;
                        object.l = ro.a((TypedArray)context, n3, object.l);
                        continue block96;
                    }
                    case 28: {
                        object = rj2.d;
                        object.I = context.getDimensionPixelSize(n3, object.I);
                        continue block96;
                    }
                    case 27: {
                        object = rj2.d;
                        object.G = context.getInt(n3, object.G);
                        continue block96;
                    }
                    case 26: {
                        object = rj2.d;
                        object.k = ro.a((TypedArray)context, n3, object.k);
                        continue block96;
                    }
                    case 25: {
                        object = rj2.d;
                        object.j = ro.a((TypedArray)context, n3, object.j);
                        continue block96;
                    }
                    case 24: {
                        object = rj2.d;
                        object.H = context.getDimensionPixelSize(n3, object.H);
                        continue block96;
                    }
                    case 23: {
                        object = rj2.d;
                        object.d = context.getLayoutDimension(n3, object.d);
                        continue block96;
                    }
                    case 22: {
                        object = rj2.b;
                        object.b = context.getInt(n3, object.b);
                        object = rj2.b;
                        object.b = a[object.b];
                        continue block96;
                    }
                    case 21: {
                        object = rj2.d;
                        object.e = context.getLayoutDimension(n3, object.e);
                        continue block96;
                    }
                    case 20: {
                        object = rj2.d;
                        object.y = context.getFloat(n3, object.y);
                        continue block96;
                    }
                    case 19: {
                        object = rj2.d;
                        object.h = context.getFloat(n3, object.h);
                        continue block96;
                    }
                    case 18: {
                        object = rj2.d;
                        object.g = context.getDimensionPixelOffset(n3, object.g);
                        continue block96;
                    }
                    case 17: {
                        object = rj2.d;
                        object.f = context.getDimensionPixelOffset(n3, object.f);
                        continue block96;
                    }
                    case 16: {
                        object = rj2.d;
                        object.P = context.getDimensionPixelSize(n3, object.P);
                        continue block96;
                    }
                    case 15: {
                        object = rj2.d;
                        object.T = context.getDimensionPixelSize(n3, object.T);
                        continue block96;
                    }
                    case 14: {
                        object = rj2.d;
                        object.Q = context.getDimensionPixelSize(n3, object.Q);
                        continue block96;
                    }
                    case 13: {
                        object = rj2.d;
                        object.O = context.getDimensionPixelSize(n3, object.O);
                        continue block96;
                    }
                    case 12: {
                        object = rj2.d;
                        object.S = context.getDimensionPixelSize(n3, object.S);
                        continue block96;
                    }
                    case 11: {
                        object = rj2.d;
                        object.R = context.getDimensionPixelSize(n3, object.R);
                        continue block96;
                    }
                    case 10: {
                        object = rj2.d;
                        object.w = ro.a((TypedArray)context, n3, object.w);
                        continue block96;
                    }
                    case 9: {
                        object = rj2.d;
                        object.x = ro.a((TypedArray)context, n3, object.x);
                        continue block96;
                    }
                    case 8: {
                        object = rj2.d;
                        object.L = context.getDimensionPixelSize(n3, object.L);
                        continue block96;
                    }
                    case 7: {
                        object = rj2.d;
                        object.F = context.getDimensionPixelOffset(n3, object.F);
                        continue block96;
                    }
                    case 6: {
                        object = rj2.d;
                        object.E = context.getDimensionPixelOffset(n3, object.E);
                        continue block96;
                    }
                    case 5: {
                        rj2.d.A = context.getString(n3);
                        continue block96;
                    }
                    case 4: {
                        object = rj2.d;
                        object.p = ro.a((TypedArray)context, n3, object.p);
                        continue block96;
                    }
                    case 3: {
                        object = rj2.d;
                        object.q = ro.a((TypedArray)context, n3, object.q);
                        continue block96;
                    }
                    case 2: {
                        object = rj2.d;
                        object.K = context.getDimensionPixelSize(n3, object.K);
                        continue block96;
                    }
                    case 1: {
                        object = rj2.d;
                        object.r = ro.a((TypedArray)context, n3, object.r);
                    }
                }
            }
            object = rj2.d;
            if (object.al != null) {
                object.ak = null;
            }
        }
        context.recycle();
        return rj2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void b(Context var1_1, int var2_2) {
        var1_1 /* !! */  = (ConstraintLayout)LayoutInflater.from((Context)var1_1 /* !! */ ).inflate(var2_2, null);
        var5_3 = var1_1 /* !! */ .getChildCount();
        this.b.clear();
        for (var2_2 = 0; var2_2 < var5_3; ++var2_2) {
            block16: {
                var10_16 /* !! */  = var1_1 /* !! */ .getChildAt(var2_2);
                var11_17 = (rf)var10_16 /* !! */ .getLayoutParams();
                var6_6 = var10_16 /* !! */ .getId();
                if (var6_6 == -1) break block16;
                var9_15 = this.b;
                var8_8 = var6_6;
                if (!var9_15.containsKey(var8_8)) {
                    this.b.put(var8_8, new rj());
                }
                if ((var9_15 = (rj)this.b.get(var8_8)) == null) continue;
                var15_21 = this.e;
                var12_18 = new HashMap<String, Object>();
                var14_20 = var10_16 /* !! */ .getClass();
                for (String var16_22 : var15_21.keySet()) {
                    block15: {
                        block14: {
                            block13: {
                                var8_8 = (rc)var15_21.get(var16_22);
                                if (!var16_22.equals("BackgroundColor")) ** GOTO lbl28
                                var7_7 = ((ColorDrawable)var10_16 /* !! */ .getBackground()).getColor();
                                try {
                                    var17_23 = new rc((rc)var8_8, var7_7);
                                    var12_18.put(var16_22, var17_23);
                                    continue;
lbl28:
                                    // 1 sources

                                    var18_24 = var14_20.getMethod(a.ai(var16_22, "getMap"), null).invoke((Object)var10_16 /* !! */ , null);
                                    var17_23 = new rc((rc)var8_8, var18_24);
                                    var12_18.put(var16_22, var17_23);
                                    continue;
                                }
                                catch (InvocationTargetException var8_9) {
                                    break block13;
                                }
                                catch (IllegalAccessException var8_10) {
                                    break block14;
                                }
                                catch (NoSuchMethodException var8_11) {
                                    break block15;
                                }
                                catch (InvocationTargetException var8_12) {
                                    // empty catch block
                                }
                            }
                            var17_23 = new StringBuilder(" Custom Attribute \"");
                            var17_23.append(var16_22);
                            var17_23.append("\" not found on ");
                            var17_23.append(var14_20.getName());
                            Log.e((String)"TransitionLayout", (String)var17_23.toString(), (Throwable)var8_8);
                            continue;
                            catch (IllegalAccessException var8_13) {
                                // empty catch block
                            }
                        }
                        var17_23 = new StringBuilder(" Custom Attribute \"");
                        var17_23.append(var16_22);
                        var17_23.append("\" not found on ");
                        var17_23.append(var14_20.getName());
                        Log.e((String)"TransitionLayout", (String)var17_23.toString(), (Throwable)var8_8);
                        continue;
                        catch (NoSuchMethodException var8_14) {
                            // empty catch block
                        }
                    }
                    var17_23 = new StringBuilder();
                    var17_23.append(var14_20.getName());
                    var17_23.append(" must have a method ");
                    var17_23.append(var16_22);
                    Log.e((String)"TransitionLayout", (String)var17_23.toString(), (Throwable)var8_8);
                }
                var8_8 = var1_1 /* !! */ ;
                var9_15.f = var12_18;
                var9_15.a = var6_6;
                var6_6 = var11_17.e;
                var1_1 /* !! */  = var9_15.d;
                var1_1 /* !! */ .j = var6_6;
                var1_1 /* !! */ .k = var11_17.f;
                var1_1 /* !! */ .l = var11_17.g;
                var1_1 /* !! */ .m = var11_17.h;
                var1_1 /* !! */ .n = var11_17.i;
                var1_1 /* !! */ .o = var11_17.j;
                var1_1 /* !! */ .p = var11_17.k;
                var1_1 /* !! */ .q = var11_17.l;
                var1_1 /* !! */ .r = var11_17.m;
                var1_1 /* !! */ .s = var11_17.n;
                var1_1 /* !! */ .t = var11_17.o;
                var1_1 /* !! */ .u = var11_17.s;
                var1_1 /* !! */ .v = var11_17.t;
                var1_1 /* !! */ .w = var11_17.u;
                var1_1 /* !! */ .x = var11_17.v;
                var1_1 /* !! */ .y = var11_17.G;
                var1_1 /* !! */ .z = var11_17.H;
                var1_1 /* !! */ .A = var11_17.I;
                var1_1 /* !! */ .B = var11_17.p;
                var1_1 /* !! */ .C = var11_17.q;
                var1_1 /* !! */ .D = var11_17.r;
                var1_1 /* !! */ .E = var11_17.X;
                var1_1 /* !! */ .F = var11_17.Y;
                var1_1 /* !! */ .G = var11_17.Z;
                var1_1 /* !! */ .h = var11_17.c;
                var1_1 /* !! */ .f = var11_17.a;
                var1_1 /* !! */ .g = var11_17.b;
                var1_1 /* !! */ .d = var11_17.width;
                var9_15.d.e = var6_6 = var11_17.height;
                var9_15.d.H = var6_6 = var11_17.leftMargin;
                var9_15.d.I = var6_6 = var11_17.rightMargin;
                var9_15.d.J = var6_6 = var11_17.topMargin;
                var9_15.d.K = var6_6 = var11_17.bottomMargin;
                var6_6 = var11_17.D;
                var1_1 /* !! */  = var9_15.d;
                var1_1 /* !! */ .N = var6_6;
                var1_1 /* !! */ .V = var11_17.M;
                var1_1 /* !! */ .W = var11_17.L;
                var1_1 /* !! */ .Y = var11_17.O;
                var1_1 /* !! */ .X = var11_17.N;
                var1_1 /* !! */ .an = var11_17.aa;
                var1_1 /* !! */ .ao = var11_17.ab;
                var1_1 /* !! */ .Z = var11_17.P;
                var1_1 /* !! */ .aa = var11_17.Q;
                var1_1 /* !! */ .ab = var11_17.T;
                var1_1 /* !! */ .ac = var11_17.U;
                var1_1 /* !! */ .ad = var11_17.R;
                var1_1 /* !! */ .ae = var11_17.S;
                var1_1 /* !! */ .af = var11_17.V;
                var1_1 /* !! */ .ag = var11_17.W;
                var1_1 /* !! */ .am = var11_17.ac;
                var1_1 /* !! */ .P = var11_17.x;
                var1_1 /* !! */ .R = var11_17.z;
                var1_1 /* !! */ .O = var11_17.w;
                var1_1 /* !! */ .Q = var11_17.y;
                var1_1 /* !! */ .T = var11_17.A;
                var1_1 /* !! */ .S = var11_17.B;
                var1_1 /* !! */ .U = var11_17.C;
                var1_1 /* !! */ .aq = var11_17.ad;
                var1_1 /* !! */ .L = var11_17.getMarginEnd();
                var9_15.d.M = var11_17.getMarginStart();
                var9_15.b.b = var10_16 /* !! */ .getVisibility();
                var9_15.b.d = var10_16 /* !! */ .getAlpha();
                var9_15.e.c = var10_16 /* !! */ .getRotation();
                var9_15.e.d = var10_16 /* !! */ .getRotationX();
                var9_15.e.e = var10_16 /* !! */ .getRotationY();
                var9_15.e.f = var10_16 /* !! */ .getScaleX();
                var9_15.e.g = var10_16 /* !! */ .getScaleY();
                var4_5 = var10_16 /* !! */ .getPivotX();
                var3_4 = var10_16 /* !! */ .getPivotY();
                if ((double)var4_5 != 0.0 || (double)var3_4 != 0.0) {
                    var1_1 /* !! */  = var9_15.e;
                    var1_1 /* !! */ .h = var4_5;
                    var1_1 /* !! */ .i = var3_4;
                }
                var9_15.e.k = var10_16 /* !! */ .getTranslationX();
                var9_15.e.l = var10_16 /* !! */ .getTranslationY();
                var9_15.e.m = var10_16 /* !! */ .getTranslationZ();
                var1_1 /* !! */  = var9_15.e;
                if (var1_1 /* !! */ .n) {
                    var1_1 /* !! */ .o = var10_16 /* !! */ .getElevation();
                }
                var1_1 /* !! */  = var8_8;
                if (!(var10_16 /* !! */  instanceof rb)) continue;
                var1_1 /* !! */  = (rb)var10_16 /* !! */ ;
                var10_16 /* !! */  = var9_15.d;
                var10_16 /* !! */ .ap = var1_1 /* !! */ .b.b;
                var10_16 /* !! */ .ak = Arrays.copyOf(var1_1 /* !! */ .c, var1_1 /* !! */ .d);
                var9_15 = var9_15.d;
                var9_15.ah = var1_1 /* !! */ .a;
                var9_15.ai = var1_1 /* !! */ .b.c;
                var1_1 /* !! */  = var8_8;
                continue;
            }
            throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(Context context, int n2) {
        XmlResourceParser xmlResourceParser = context.getResources().getXml(n2);
        try {
            int n3 = xmlResourceParser.getEventType();
            while (true) {
                if (n3 == 1) {
                    return;
                }
                if (n3 == 2) {
                    String string = xmlResourceParser.getName();
                    rj rj2 = ro.i(context, Xml.asAttributeSet((XmlPullParser)xmlResourceParser), false);
                    if (string.equalsIgnoreCase("Guideline")) {
                        rj2.d.b = true;
                    }
                    this.b.put(rj2.a, rj2);
                }
                n3 = xmlResourceParser.next();
            }
        }
        catch (IOException iOException) {
            Log.e((String)"ConstraintSet", (String)a.af(n2, "Error parsing resource: "), (Throwable)iOException);
            return;
        }
        catch (XmlPullParserException xmlPullParserException) {
            Log.e((String)"ConstraintSet", (String)a.af(n2, "Error parsing resource: "), (Throwable)xmlPullParserException);
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public final void d(Context var1_1, XmlPullParser var2_8) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [22[TRYBLOCK]], but top level block is 75[CASE]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }
}

