/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.util.Xml
 *  android.view.InflateException
 *  android.view.Menu
 *  android.view.MenuInflater
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import androidx.wear.ambient.AmbientDelegate;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class fc
extends MenuInflater {
    static final Class[] a;
    static final Class[] b;
    final Object[] c;
    final Object[] d;
    final Context e;
    public Object f;

    static {
        Class[] classArray = new Class[]{Context.class};
        a = classArray;
        b = classArray;
    }

    public fc(Context context) {
        super(context);
        this.e = context;
        Object[] objectArray = new Object[]{context};
        this.c = objectArray;
        this.d = objectArray;
    }

    /*
     * Unable to fully structure code
     */
    private final void b(XmlPullParser var1_1, AttributeSet var2_2, Menu var3_3) {
        block13: {
            var9_4 = new fb(this, (Menu)var3_3);
            var4_5 = var1_1.getEventType();
            do {
                if (var4_5 != 2) continue;
                var3_3 = var1_1.getName();
                if (var3_3.equals("menu")) {
                    var6_6 = var1_1.next();
                    break block13;
                }
                throw new RuntimeException("Expecting menu, got ".concat(String.valueOf(var3_3)));
            } while ((var4_5 = var1_1.next()) != 1);
            var6_6 = var4_5;
        }
        var3_3 = null;
        var5_7 = 0;
        var4_5 = 0;
        while (var5_7 == 0) {
            block15: {
                block14: {
                    block25: {
                        block24: {
                            block19: {
                                block16: {
                                    block22: {
                                        block23: {
                                            block21: {
                                                block20: {
                                                    block17: {
                                                        block18: {
                                                            if (var6_6 == 1) break block15;
                                                            if (var6_6 == 2) break block16;
                                                            if (var6_6 != 3) {
                                                                var7_8 = var4_5;
                                                                var6_6 = var5_7;
lbl22:
                                                                // 7 sources

                                                                while (true) {
                                                                    var4_5 = var7_8;
                                                                    var5_7 = var6_6;
                                                                    break block14;
                                                                    break;
                                                                }
                                                            }
                                                            var8_9 = var1_1.getName();
                                                            if (var4_5 == 0) break block17;
                                                            if (!var8_9.equals(var3_3)) break block18;
                                                            var3_3 = null;
                                                            break block19;
                                                        }
                                                        var4_5 = 1;
                                                        break block20;
                                                    }
                                                    var4_5 = 0;
                                                }
                                                if (!var8_9.equals("group")) break block21;
                                                var9_4.c();
                                                var6_6 = var5_7;
                                                var7_8 = var4_5;
                                                ** GOTO lbl22
                                            }
                                            if (!var8_9.equals("item")) break block22;
                                            var6_6 = var5_7;
                                            var7_8 = var4_5;
                                            if (var9_4.h) ** GOTO lbl22
                                            var8_9 = var9_4.F;
                                            if (var8_9 == null || !var8_9.T()) break block23;
                                            var9_4.a();
                                            var6_6 = var5_7;
                                            var7_8 = var4_5;
                                            ** GOTO lbl22
                                        }
                                        var9_4.h = true;
                                        var9_4.d(var9_4.a.add(var9_4.b, var9_4.i, var9_4.j, var9_4.k));
                                        var6_6 = var5_7;
                                        var7_8 = var4_5;
                                        ** GOTO lbl22
                                    }
                                    var6_6 = var5_7;
                                    var7_8 = var4_5;
                                    if (!var8_9.equals("menu")) ** GOTO lbl22
                                    var6_6 = 1;
                                    var7_8 = var4_5;
                                    ** continue;
                                }
                                if (var4_5 != 0) lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        var4_5 = 1;
                                        break block14;
                                        break;
                                    }
                                }
                                var8_9 = var1_1.getName();
                                if (!var8_9.equals("group")) break block24;
                                var8_9 = var9_4.E.e.obtainStyledAttributes(var2_2, er.p);
                                var9_4.b = var8_9.getResourceId(1, 0);
                                var9_4.c = var8_9.getInt(3, 0);
                                var9_4.d = var8_9.getInt(4, 0);
                                var9_4.e = var8_9.getInt(5, 0);
                                var9_4.f = var8_9.getBoolean(2, true);
                                var9_4.g = var8_9.getBoolean(0, true);
                                var8_9.recycle();
                            }
lbl83:
                            // 3 sources

                            while (true) {
                                var4_5 = 0;
                                break block14;
                                break;
                            }
                        }
                        if (!var8_9.equals("item")) break block25;
                        var8_9 = AmbientDelegate.z(var9_4.E.e, var2_2, er.q);
                        var9_4.i = var8_9.p(2, 0);
                        var9_4.j = var8_9.m(5, var9_4.c) & -65536 | (char)var8_9.m(6, var9_4.d);
                        var9_4.k = var8_9.t(7);
                        var9_4.l = var8_9.t(8);
                        var9_4.m = var8_9.p(0, 0);
                        var9_4.n = fb.e(var8_9.u(9));
                        var9_4.o = var8_9.m(16, 4096);
                        var9_4.p = fb.e(var8_9.u(10));
                        var9_4.q = var8_9.m(20, 4096);
                        var9_4.r = var8_9.x(11) != false ? (int)var8_9.w(11, false) : var9_4.e;
                        var9_4.s = var8_9.w(3, false);
                        var9_4.t = var8_9.w(4, var9_4.f);
                        var9_4.u = var8_9.w(1, var9_4.g);
                        var9_4.v = var8_9.m(21, -1);
                        var9_4.z = var8_9.u(12);
                        var9_4.w = var8_9.p(13, 0);
                        var9_4.x = var8_9.u(15);
                        var9_4.y = var8_9.u(14);
                        var10_10 = var9_4.y;
                        if (var10_10 == null) ** GOTO lbl115
                        if (var9_4.w == 0 && var9_4.x == null) {
                            var11_11 = var9_4.E;
                            var9_4.F = (a)var9_4.b(var10_10, fc.b, var11_11.d);
                        } else {
                            Log.w((String)"SupportMenuInflater", (String)"Ignoring attribute 'actionProviderClass'. Action view already specified.");
lbl115:
                            // 2 sources

                            var9_4.F = null;
                        }
                        var9_4.A = var8_9.t(17);
                        var9_4.B = var8_9.t(22);
                        var9_4.D = var8_9.x(19) != false ? a.e(var8_9.m(19, -1), var9_4.D) : null;
                        var9_4.C = var8_9.x(18) != false ? var8_9.q(18) : null;
                        var8_9.v();
                        var9_4.h = false;
                        ** GOTO lbl83
                    }
                    if (var8_9.equals("menu")) {
                        this.b(var1_1, var2_2, (Menu)var9_4.a());
                        ** continue;
                    }
                    var3_3 = var8_9;
                    ** continue;
                }
                var6_6 = var1_1.next();
                continue;
            }
            throw new RuntimeException("Unexpected end of document");
        }
    }

    public final Object a(Object object) {
        Object object2;
        if (object instanceof Activity) {
            object2 = object;
        } else {
            object2 = object;
            if (object instanceof ContextWrapper) {
                object2 = this.a(((ContextWrapper)object).getBaseContext());
            }
        }
        return object2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void inflate(int var1_1, Menu var2_2) {
        block12: {
            block13: {
                block11: {
                    if (!(var2_2 instanceof tr)) {
                        super.inflate(var1_1, var2_2);
                        return;
                    }
                    var11_3 = null;
                    var12_6 /* !! */  = null;
                    var10_7 = null;
                    var9_8 = 0;
                    var8_9 = 0;
                    var6_10 = 0;
                    var7_11 = 0;
                    var3_12 = var9_8;
                    var5_13 = var8_9;
                    var4_14 = var6_10;
                    try {
                        var10_7 = var13_15 = this.e.getResources().getLayout(var1_1);
                        var3_12 = var9_8;
                        var11_3 = var13_15;
                        var5_13 = var8_9;
                        var12_6 /* !! */  = var13_15;
                        var4_14 = var6_10;
                        var15_18 = Xml.asAttributeSet((XmlPullParser)var13_15);
                        var1_1 = var7_11;
                        var10_7 = var13_15;
                        var3_12 = var9_8;
                        var11_3 = var13_15;
                        var5_13 = var8_9;
                        var12_6 /* !! */  = var13_15;
                        var4_14 = var6_10;
                        if (var2_2 instanceof fs) {
                            var10_7 = var13_15;
                            var3_12 = var9_8;
                            var11_3 = var13_15;
                            var5_13 = var8_9;
                            var12_6 /* !! */  = var13_15;
                            var4_14 = var6_10;
                            var14_19 = (fs)var2_2;
                            var1_1 = var7_11;
                            var10_7 = var13_15;
                            var3_12 = var9_8;
                            var11_3 = var13_15;
                            var5_13 = var8_9;
                            var12_6 /* !! */  = var13_15;
                            var4_14 = var6_10;
                            if (!var14_19.h) {
                                var10_7 = var13_15;
                                var3_12 = var9_8;
                                var11_3 = var13_15;
                                var5_13 = var8_9;
                                var12_6 /* !! */  = var13_15;
                                var4_14 = var6_10;
                                var14_19.s();
                                var1_1 = 1;
                            }
                        }
                        var10_7 = var13_15;
                        var3_12 = var1_1;
                        var11_3 = var13_15;
                        var5_13 = var1_1;
                        var12_6 /* !! */  = var13_15;
                        var4_14 = var1_1;
                        this.b((XmlPullParser)var13_15, var15_18, var2_2);
                        if (var1_1 != 0) {
                            ((fs)var2_2).r();
                        }
                        if (var13_15 == null) break block11;
                    }
                    catch (Throwable var11_4) {
                        break block12;
                    }
                    catch (IOException var13_16) {
                        break block13;
                    }
                    catch (XmlPullParserException var11_5) {
                        ** GOTO lbl82
                    }
                    var13_15.close();
                }
                return;
            }
            var10_7 = var11_3;
            var3_12 = var5_13;
            {
                var10_7 = var11_3;
                var3_12 = var5_13;
                var12_6 /* !! */  = new InflateException("Error inflating menu XML", (Throwable)var13_16);
                var10_7 = var11_3;
                var3_12 = var5_13;
                throw var12_6 /* !! */ ;
lbl82:
                // 1 sources

                var10_7 = var12_6 /* !! */ ;
                var3_12 = var4_14;
                var10_7 = var12_6 /* !! */ ;
                var3_12 = var4_14;
                var13_17 = new InflateException("Error inflating menu XML", (Throwable)var11_5);
                var10_7 = var12_6 /* !! */ ;
                var3_12 = var4_14;
                throw var13_17;
            }
        }
        if (var3_12 != 0) {
            ((fs)var2_2).r();
        }
        if (var10_7 != null) {
            var10_7.close();
        }
        throw var11_4;
    }
}

