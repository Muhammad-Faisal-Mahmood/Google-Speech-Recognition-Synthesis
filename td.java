/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.graphics.Typeface
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Log
 *  android.util.TypedValue
 *  android.util.Xml
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class td {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    public static Typeface a(Context object, int n2, TypedValue typedValue, int n3, tb tb2, boolean bl2, boolean bl3) {
        Resources resources = object.getResources();
        resources.getValue(n2, typedValue, true);
        object = td.b((Context)object, resources, typedValue, n2, n3, tb2, bl2, bl3);
        if (object == null && tb2 == null && !bl3) {
            object = new StringBuilder("Font resource ID #0x");
            ((StringBuilder)object).append(Integer.toHexString(n2));
            ((StringBuilder)object).append(" could not be retrieved.");
            throw new Resources.NotFoundException(((StringBuilder)object).toString());
        }
        return object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Typeface b(Context var0, Resources var1_5, TypedValue var2_6, int var3_7, int var4_8, tb var5_9, boolean var6_10, boolean var7_11) {
        block50: {
            block53: {
                block52: {
                    if (var2_6.string == null) {
                        var0 /* !! */  = new StringBuilder("Resource \"");
                        var0 /* !! */ .append(var1_5.getResourceName(var3_7));
                        var0 /* !! */ .append("\" (");
                        var0 /* !! */ .append(Integer.toHexString(var3_7));
                        var0 /* !! */ .append(") is not a Font: ");
                        var0 /* !! */ .append(var2_6);
                        throw new Resources.NotFoundException(var0 /* !! */ .toString());
                    }
                    var15_12 = var2_6.string.toString();
                    if (!var15_12.startsWith("res/")) {
                        if (var5_9 == null) return null;
                        var5_9.c(-3);
                        return null;
                    }
                    var8_13 = var2_6.assetCookie;
                    var12_14 /* !! */  = (Typeface)ti.b.a(ti.b(var1_5, var3_7, var15_12, var8_13, var4_8));
                    if (var12_14 /* !! */  != null) {
                        if (var5_9 == null) return var12_14 /* !! */ ;
                        var5_9.d(var12_14 /* !! */ );
                        return var12_14 /* !! */ ;
                    }
                    if (var7_11) {
                        return null;
                    }
                    try {
                        block54: {
                            if (!var15_12.toLowerCase().endsWith(".xml")) ** GOTO lbl-1000
                            var12_14 /* !! */  = var1_5.getXml(var3_7);
                            while ((var8_13 = var12_14 /* !! */ .next()) != 2) {
                                if (var8_13 != 1) continue;
                                var0 /* !! */  = new XmlPullParserException("No start tag found");
                                throw var0 /* !! */ ;
                            }
                            var12_14 /* !! */ .require(2, null, "font-family");
                            if (!var12_14 /* !! */ .getName().equals("font-family")) ** GOTO lbl130
                            var13_15 = var1_5.obtainAttributes(Xml.asAttributeSet((XmlPullParser)var12_14 /* !! */ ), sd.b);
                            var17_16 = var13_15.getString(0);
                            var16_17 = var13_15.getString(5);
                            var18_18 = var13_15.getString(6);
                            var14_19 = var13_15.getString(2);
                            var8_13 = var13_15.getResourceId(1, 0);
                            var10_20 = var13_15.getInteger(3, 1);
                            var9_21 = var13_15.getInteger(4, 500);
                            var19_22 = var13_15.getString(7);
                            var13_15.recycle();
                            if (var17_16 == null || var16_17 == null || var18_18 == null) ** GOTO lbl97
                            while (var12_14 /* !! */ .next() != 3) {
                                kl.s((XmlPullParser)var12_14 /* !! */ );
                            }
                            if (var8_13 != 0) break block54;
                            var12_14 /* !! */  = Collections.emptyList();
                            ** GOTO lbl91
                        }
                        var20_23 /* !! */  = var1_5.obtainTypedArray(var8_13);
                    }
                    catch (IOException var0_3) {
                        Log.e((String)"ResourcesCompat", (String)"Failed to read xml resource ".concat(String.valueOf(var15_12)), (Throwable)var0_3);
                        break block50;
                    }
                    catch (XmlPullParserException var0_4) {
                        Log.e((String)"ResourcesCompat", (String)"Failed to parse xml resource ".concat(String.valueOf(var15_12)), (Throwable)var0_4);
                        break block50;
                    }
                    if (var20_23 /* !! */ .length() == 0) {
                        var12_14 /* !! */  = Collections.emptyList();
                    }
                    ** GOTO lbl-1000
                    {
                        block59: {
                            block58: {
                                block57: {
                                    block55: {
                                        block56: {
                                            block51: {
                                                catch (Throwable var0_1) {
                                                    var20_23 /* !! */ .recycle();
                                                    throw var0_1;
                                                }
lbl-1000:
                                                // 3 sources

                                                {
                                                    while (true) {
                                                        var20_23 /* !! */ .recycle();
                                                        break block51;
                                                        break;
                                                    }
                                                }
lbl-1000:
                                                // 1 sources

                                                {
                                                    var13_15 = new ArrayList();
                                                    if (var20_23 /* !! */ .getType(0) != 1) ** GOTO lbl-1000
                                                    var8_13 = 0;
                                                    while (true) {
                                                        var12_14 /* !! */  = var13_15;
                                                        if (var8_13 >= var20_23 /* !! */ .length()) ** GOTO lbl-1000
                                                        var11_24 = var20_23 /* !! */ .getResourceId(var8_13, 0);
                                                        if (var11_24 != 0) {
                                                            var13_15.add(kl.r(var1_5.getStringArray(var11_24)));
                                                        }
                                                        ++var8_13;
                                                    }
                                                }
lbl-1000:
                                                // 1 sources

                                                {
                                                    var13_15.add(kl.r(var1_5.getStringArray(var8_13)));
                                                    var12_14 /* !! */  = var13_15;
                                                    ** continue;
                                                }
                                            }
                                            var13_15 = var14_19 != null ? new uc((String)var17_16, (String)var16_17, (String)var14_19, (List)var12_14 /* !! */ ) : null;
                                            var20_23 /* !! */  = new uc((String)var17_16, (String)var16_17, var18_18, (List)var12_14 /* !! */ );
                                            var14_19 = new sz((uc)var20_23 /* !! */ , (uc)var13_15, var10_20, var9_21, var19_22);
                                            var12_14 /* !! */  = var14_19;
                                            break block55;
lbl97:
                                            // 1 sources

                                            var14_19 = new ArrayList();
                                            while (var12_14 /* !! */ .next() != 3) {
                                                if (var12_14 /* !! */ .getEventType() != 2) continue;
                                                if (var12_14 /* !! */ .getName().equals("font")) {
                                                    var17_16 = var1_5.obtainAttributes(Xml.asAttributeSet((XmlPullParser)var12_14 /* !! */ ), sd.c);
                                                    var8_13 = 8;
                                                    if (!var17_16.hasValue(8)) {
                                                        var8_13 = 1;
                                                    }
                                                    var10_20 = var17_16.getInt(var8_13, 400);
                                                    var8_13 = true != var17_16.hasValue(6) ? 2 : 6;
                                                    var7_11 = var17_16.getInt(var8_13, 0) == 1;
                                                    var8_13 = 9;
                                                    if (!var17_16.hasValue(9)) {
                                                        var8_13 = 3;
                                                    }
                                                    var9_21 = true != var17_16.hasValue(7) ? 4 : 7;
                                                    var16_17 = var17_16.getString(var9_21);
                                                    var9_21 = var17_16.getInt(var8_13, 0);
                                                    var8_13 = true != var17_16.hasValue(5) ? 0 : 5;
                                                    var11_25 = var17_16.getResourceId(var8_13, 0);
                                                    var13_15 = var17_16.getString(var8_13);
                                                    var17_16.recycle();
                                                    while (var12_14 /* !! */ .next() != 3) {
                                                        kl.s((XmlPullParser)var12_14 /* !! */ );
                                                    }
                                                    var17_16 = new sy((String)var13_15, var10_20, var7_11, (String)var16_17, var9_21, var11_25);
                                                    var14_19.add(var17_16);
                                                    continue;
                                                }
                                                kl.s((XmlPullParser)var12_14 /* !! */ );
                                            }
                                            if (var14_19.isEmpty()) break block56;
                                            var12_14 /* !! */  = new bzb(var14_19.toArray(new sy[0]), null);
                                            break block55;
lbl130:
                                            // 1 sources

                                            kl.s((XmlPullParser)var12_14 /* !! */ );
                                        }
                                        var12_14 /* !! */  = null;
                                    }
                                    if (var12_14 /* !! */  == null) {
                                        Log.e((String)"ResourcesCompat", (String)"Failed to find font-family tag");
                                        if (var5_9 == null) return null;
                                        var5_9.c(-3);
                                        return null;
                                    }
                                    var10_20 = var2_6.assetCookie;
                                    if (!(var12_14 /* !! */  instanceof sz)) break block52;
                                    var13_15 = (sz)var12_14 /* !! */ ;
                                    var2_6 = var13_15.e;
                                    if (var2_6 == null || var2_6.isEmpty()) break block57;
                                    var12_14 /* !! */  = Typeface.create((String)var2_6, (int)0);
                                    var14_19 = Typeface.create((Typeface)Typeface.DEFAULT, (int)0);
                                    if (var12_14 /* !! */  == null) break block57;
                                    var2_6 = var12_14 /* !! */ ;
                                    if (!var12_14 /* !! */ .equals(var14_19)) break block58;
                                }
                                var2_6 = null;
                            }
                            if (var2_6 != null) {
                                var12_14 /* !! */  = var2_6;
                                if (var5_9 == null) return var12_14 /* !! */ ;
                                var5_9.d((Typeface)var2_6);
                                return var2_6;
                            }
                            var8_13 = (var6_10 != false ? var13_15.d == 0 : var5_9 == null) ? 1 : 0;
                            var9_21 = var6_10 != false ? var13_15.c : -1;
                            var12_14 /* !! */  = tb.e();
                            var14_19 = new bzb(var5_9, null);
                            var2_6 = var13_15.b;
                            var2_6 = var2_6 != null ? rw.F(new Object[]{var13_15.a, var2_6}) : rw.F(new Object[]{var13_15.a});
                            var16_17 = new uj((Handler)var12_14 /* !! */ , 0);
                            var13_15 = new awg((bzb)var14_19, (Executor)var16_17);
                            if (var8_13 == 0) break block59;
                            if (var2_6.size() > 1) {
                                var0 /* !! */  = new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                                throw var0 /* !! */ ;
                            }
                            var12_14 /* !! */  = (uc)var2_6.get(0);
                            var2_6 = ug.a;
                            var14_19 = ug.a(a.ab(new Object[]{var12_14 /* !! */ }), var4_8);
                            var2_6 = (Typeface)ug.a.a(var14_19);
                            if (var2_6 != null) {
                                var0 /* !! */  = new hti((Typeface)var2_6);
                                var13_15.B((hti)var0 /* !! */ );
                                var0 /* !! */  = var2_6;
                                break block53;
                            }
                            if (var9_21 == -1) {
                                var0 /* !! */  = ug.b((String)var14_19, var0 /* !! */ , a.ab(new Object[]{var12_14 /* !! */ }), var4_8);
                                var13_15.B((hti)var0 /* !! */ );
                                var0 /* !! */  = var0 /* !! */ .b;
                                break block53;
                            }
                            var2_6 = new ud((String)var14_19, var0 /* !! */ , (uc)var12_14 /* !! */ , var4_8);
                            try {
                                var0 /* !! */  = (hti)a.Z(ug.b, (Callable)var2_6, var9_21);
                                var13_15.B((hti)var0 /* !! */ );
                                var0 /* !! */  = var0 /* !! */ .b;
                                break block53;
                            }
                            catch (InterruptedException var0_2) {
                                var0 /* !! */  = new hti(-3);
                                var13_15.B((hti)var0 /* !! */ );
                                ** GOTO lbl210
                            }
                        }
                        var14_19 = ug.a((List)var2_6, var4_8);
                        var12_14 /* !! */  = (Typeface)ug.a.a(var14_19);
                        if (var12_14 /* !! */  != null) {
                            var0 /* !! */  = new hti(var12_14 /* !! */ );
                            var13_15.B((hti)var0 /* !! */ );
                            var0 /* !! */  = var12_14 /* !! */ ;
                            break block53;
                        }
                        var16_17 = new uf(var13_15, 1);
                        var12_14 /* !! */  = ug.c;
                        ** synchronized (var12_14 /* !! */ )
                    }
lbl-1000:
                    // 1 sources

                    {
                        var13_15 = (ArrayList)ug.d.get(var14_19);
                        if (var13_15 != null) {
                            var13_15.add(var16_17);
                            // MONITOREXIT @DISABLED, blocks:[12, 29] lbl202 : MonitorExitStatement: MONITOREXIT : var12_14 /* !! */ 
lbl210:
                            // 3 sources

                            while (true) {
                                var0 /* !! */  = null;
                                break block53;
                                break;
                            }
                        } else {
                            var13_15 = new ArrayList();
                            var13_15.add(var16_17);
                            ug.d.put(var14_19, var13_15);
                            // MONITOREXIT @DISABLED, blocks:[12, 28] lbl211 : MonitorExitStatement: MONITOREXIT : var12_14 /* !! */ 
                            {
                                var12_14 /* !! */  = new ue((String)var14_19, var0 /* !! */ , (List)var2_6, var4_8);
                                var2_6 = ug.b;
                                var13_15 = new uf(var14_19, 0);
                                var0 /* !! */  = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                var14_19 = new uk((Handler)var0 /* !! */ , (Callable)var12_14 /* !! */ , (um)var13_15);
                                var2_6.execute((Runnable)var14_19);
                                ** continue;
                            }
                        }
                    }
                }
                var0 /* !! */  = ti.a.b(var0 /* !! */ , (bzb)var12_14 /* !! */ , var1_5, var4_8);
                if (var5_9 != null) {
                    if (var0 /* !! */  != null) {
                        var5_9.d((Typeface)var0 /* !! */ );
                    } else {
                        var5_9.c(-3);
                    }
                }
            }
            var12_14 /* !! */  = var0 /* !! */ ;
            if (var0 /* !! */  == null) return var12_14 /* !! */ ;
            ti.b.b(ti.b(var1_5, var3_7, var15_12, var10_20, var4_8), var0 /* !! */ );
            return var0 /* !! */ ;
lbl-1000:
            // 1 sources

            {
                var0 /* !! */  = ti.a(var0 /* !! */ , var1_5, var3_7, var15_12, var2_6.assetCookie, var4_8);
                if (var5_9 == null) return var0 /* !! */ ;
                if (var0 /* !! */  != null) {
                    var5_9.d((Typeface)var0 /* !! */ );
                    return var0 /* !! */ ;
                }
                var5_9.c(-3);
                return var0 /* !! */ ;
            }
        }
        if (var5_9 == null) return null;
        var5_9.c(-3);
        return null;
    }
}

