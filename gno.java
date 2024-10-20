/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.Trace
 *  android.text.TextUtils
 *  android.util.Log
 */
import android.os.Build;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Locale;
import java.util.WeakHashMap;

public final class gno {
    public static boolean a;
    public static boolean b;
    public static boolean c;
    public static final WeakHashMap d;
    public static final ThreadLocal e;
    public static final Deque f;
    public static final Deque g;
    public static final Object h;
    public static final Runnable i;
    public static int j;
    public static int k;
    public static gpc l;
    static final cxt m;
    private static final hav n;
    private static hav o;
    private static final gnn p;

    static {
        hav hav2;
        n = hav2 = hav.s("android.support.v4.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "androidx.activity.OnBackPressedDispatcher$Api34Impl$createOnBackAnimationCallback", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl.isCrashLoopMonitorEnabled", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl", new String[0]);
        o = hav2;
        a = true;
        b = false;
        c = false;
        m = new cxt("tiktok_systrace", null);
        d = new WeakHashMap();
        p = new gnn();
        e = new gnj();
        f = new ArrayDeque();
        g = new ArrayDeque();
        h = new Object();
        i = new gni(0);
        k = 0;
    }

    private static void A(gpc gpc2) {
        Trace.endSection();
        if (gpc2.a() != null) {
            gno.A(gpc2.a());
        }
    }

    private static boolean B(gpc gpc2, IllegalStateException illegalStateException) {
        if (gpc2 instanceof gnd) {
            return ((gnd)gpc2).h();
        }
        return gno.q(illegalStateException);
    }

    public static goz a() {
        Object t2 = c ? p.get() : e.get();
        return (goz)t2;
    }

    public static gpc b() {
        return gno.a().c;
    }

    static gpc c() {
        return (gpc)g.peek();
    }

    public static gpc d() {
        goz goz2 = gno.a();
        gpc gpc2 = goz2.c;
        if (gpc2 != null) {
            return gpc2;
        }
        return gnw.k(goz2);
    }

    public static gpc e() {
        gpc gpc2 = l;
        if (gpc2 != null) {
            l = null;
            return gpc2;
        }
        return null;
    }

    public static gpc f(goz goz2, gpc gpc2) {
        if (goz2.e != null) {
            return gno.t(goz2, gpc2, 2);
        }
        return gno.t(goz2, gpc2, 4);
    }

    public static gpc g(goz goz2, gpc gpc2) {
        gpc gpc3 = goz2.d;
        goz2.d = gpc2;
        return gpc3;
    }

    public static gpf h() {
        gno.n(false);
        return new gnh(1);
    }

    public static gpf i() {
        gpc gpc2;
        goz goz2 = gno.a();
        if (!goz2.a) {
            return new gnh(0);
        }
        gpc gpc3 = gpc2 = goz2.c;
        if (gpc2 == null) {
            gpc3 = gnw.k(goz2);
        }
        f.add(gpc3);
        fpk.e(i);
        return new gnh(2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static String j(gpc var0) {
        var4_1 = 0;
        var1_2 = 0;
        var10_3 = var0;
        while (var10_3 != null) {
            var2_4 = var4_1 + 1;
            var3_5 /* !! */  = var1_2 + var10_3.c().length();
            var11_6 /* !! */  = (char[])var10_3.a();
            var10_3 = var11_6 /* !! */ ;
            var4_1 = var2_4;
            var1_2 = var3_5 /* !! */ ;
            if (var11_6 /* !! */  == null) continue;
            var1_2 = var3_5 /* !! */  + 4;
            var10_3 = var11_6 /* !! */ ;
            var4_1 = var2_4;
        }
        if (var4_1 > 250) {
            var13_7 = new String[var4_1];
            var10_3 = var0;
            for (var2_4 = var4_1 - 1; var2_4 >= 0; --var2_4) {
                var13_7[var2_4] = var10_3.c();
                var10_3 = var10_3.a();
            }
            var11_6 /* !! */  = (char[])new gzy();
            var10_3 = hav.o(var13_7).k();
            var2_4 = 0;
            while (var10_3.hasNext()) {
                var11_6 /* !! */ .d(var10_3.next(), var2_4);
                ++var2_4;
            }
            var12_8 = var11_6 /* !! */ .b();
            var11_6 /* !! */  = (hcy)var12_8;
            var2_4 = var11_6 /* !! */ .c;
            var6_9 = var4_1 >> 2;
            if (var2_4 > var6_9) {
                while (true) {
                    var10_3 = null;
                    break;
                }
            } else {
                var5_10 = var4_1 + 1;
                var10_3 = new int[var5_10];
                for (var2_4 = 0; var2_4 < var4_1; ++var2_4) {
                    var10_3[var2_4] = (Integer)var12_8.get(var13_7[var2_4]);
                }
                var10_3[var4_1] = var11_6 /* !! */ .c;
                var14_14 = new gow((int[])var10_3);
                var2_4 = 0;
                while (true) {
                    var3_5 /* !! */  = -1;
                    if (var2_4 >= var5_10) break;
                    ++var14_14.f;
                    var7_11 = var14_14.a[var2_4];
                    block6: while (true) {
                        var10_3 = null;
                        while (var14_14.f > 0) {
                            if (var14_14.e == 0) {
                                var12_8 = var14_14.c.d;
                                var11_6 /* !! */  = (char[])var7_11;
                                if (!var12_8.containsKey(var11_6 /* !! */ )) {
                                    var12_8 = new gou(var2_4, 0x40000000);
                                    var14_14.c.d.put(var11_6 /* !! */ , var12_8);
                                    if (var10_3 != null) {
                                        var10_3.c = var14_14.c;
                                    }
                                    var14_14.f += var3_5 /* !! */ ;
                                    var14_14.a();
                                    continue block6;
                                }
                                if (var10_3 != null) {
                                    var10_3.c = var14_14.c;
                                }
                                var14_14.d = var2_4;
                                ++var14_14.e;
                                var14_14.b();
                                break block6;
                            }
                            var11_6 /* !! */  = (char[])var14_14.a;
                            var9_13 = ((gou)var14_14.c.d.get((Object)Integer.valueOf((int)var11_6 /* !! */ [var14_14.d]))).a;
                            var8_12 = var14_14.e;
                            if (var11_6 /* !! */ [var9_13 + var8_12] == var7_11) {
                                if (var10_3 != null) {
                                    var10_3.c = var14_14.c;
                                }
                                var14_14.e = var8_12 + 1;
                                var14_14.b();
                                break block6;
                            }
                            var12_8 = (gou)var14_14.c.d.get(var14_14.a[var14_14.d]);
                            var8_12 = var12_8.a;
                            var11_6 /* !! */  = (char[])new gou(var8_12, var14_14.e + var8_12 + var3_5 /* !! */ );
                            var14_14.c.d.put(var14_14.a[var14_14.d], var11_6 /* !! */ );
                            var11_6 /* !! */ .d.put(var14_14.a[var11_6 /* !! */ .b + 1], var12_8);
                            var12_8.a = var11_6 /* !! */ .b + 1;
                            if (var10_3 != null) {
                                var10_3.c = var11_6 /* !! */ ;
                            }
                            var10_3 = new gou(var2_4, 0x40000000);
                            var11_6 /* !! */ .d.put(var7_11, var10_3);
                            --var14_14.f;
                            var14_14.a();
                            var10_3 = var11_6 /* !! */ ;
                            var3_5 /* !! */  = -1;
                        }
                        break;
                    }
                    ++var2_4;
                }
                var15_15 = new ArrayDeque<Object>();
                var10_3 = new got(var14_14.b, 0, -1, -1);
                var15_15.push(var10_3);
                block8: while (!var15_15.isEmpty()) {
                    var16_16 = (got)var15_15.pop();
                    var17_17 = ((gou)var16_16.d).d.values().iterator();
                    var11_6 /* !! */  = (char[])var10_3;
                    while (true) {
                        var10_3 = var11_6 /* !! */ ;
                        if (!var17_17.hasNext()) continue block8;
                        var10_3 = (gou)var17_17.next();
                        var10_3 = !(var14_14.c(var16_16.b, var16_16.c, var10_3.a, var10_3.b) || var10_3.d.isEmpty() && var14_14.c(var2_4 = var16_16.b, var5_10 = var16_16.c, var3_5 /* !! */  = var10_3.a, var3_5 /* !! */  + var5_10 - var2_4)) ? new got((gou)var10_3, 1, var10_3.a, var10_3.b) : new got((gou)var10_3, var16_16.a + 1, var16_16.b, var16_16.c);
                        var12_8 = var11_6 /* !! */ ;
                        if (var11_6 /* !! */ .a < var10_3.a) {
                            var12_8 = var10_3;
                        }
                        var15_15.push(var10_3);
                        var11_6 /* !! */  = (char[])var12_8;
                    }
                }
                var12_8 = var14_14.a;
                var2_4 = var10_3.c;
                var11_6 /* !! */  = (char[])var14_14.b;
                var7_11 = Math.min(((Object)var12_8).length, var2_4 + 1);
                var2_4 = 0;
                block10: while (true) {
                    var12_8 = var14_14.a;
                    var3_5 /* !! */  = var10_3.b;
                    if ((var12_8 = (gou)var11_6 /* !! */ .d.get(var3_5 /* !! */  = (int)var12_8[var3_5 /* !! */  + var2_4 % (var7_11 - var3_5 /* !! */ )])) == null) break;
                    var5_10 = var12_8.a;
                    var3_5 /* !! */  = var2_4;
                    while (true) {
                        var2_4 = var3_5 /* !! */ ;
                        var11_6 /* !! */  = (char[])var12_8;
                        if (var5_10 >= var12_8.b + 1) continue block10;
                        var15_15 = var14_14.a;
                        var2_4 = var3_5 /* !! */ ;
                        var11_6 /* !! */  = (char[])var12_8;
                        if (var5_10 < ((Object)var15_15).length) ** break;
                        continue block10;
                        var8_12 = var10_3.b;
                        var2_4 = var3_5 /* !! */ ;
                        if (var15_15[var8_12 + var3_5 /* !! */  % (var7_11 - var8_12)] != var15_15[var5_10]) break block10;
                        ++var3_5 /* !! */ ;
                        ++var5_10;
                    }
                    break;
                }
                var3_5 /* !! */  = var10_3.b;
                var10_3 = new gov(var3_5 /* !! */ , var7_11, var2_4 / (var7_11 - var3_5 /* !! */ ));
                if (var10_3.c * (var10_3.b - var10_3.a) < var6_9) ** continue;
            }
            var11_6 /* !! */  = "";
            if (var10_3 != null) {
                var2_4 = var10_3.a;
                var12_8 = var2_4 > 0 ? String.valueOf(TextUtils.join((CharSequence)" -> ", (Object[])Arrays.copyOf(var13_7, var2_4))).concat(" -> ") : "";
                var2_4 = var10_3.a;
                if ((var2_4 += (var10_3.b - var2_4) * var10_3.c) < var4_1) {
                    var11_6 /* !! */  = " -> ".concat(String.valueOf(TextUtils.join((CharSequence)" -> ", (Object[])Arrays.copyOfRange(var13_7, var2_4, var4_1))));
                }
                var11_6 /* !! */  = (char[])String.format(Locale.US, "%s{%s}x%d%s", new Object[]{var12_8, TextUtils.join((CharSequence)" -> ", (Object[])Arrays.copyOfRange(var13_7, var10_3.a, var10_3.b)), var10_3.c, var11_6 /* !! */ });
            }
            if (!var11_6 /* !! */ .isEmpty()) {
                return var11_6 /* !! */ ;
            }
        }
        var11_6 /* !! */  = new char[var1_2];
        while (var0 != null) {
            var10_3 = var0.c();
            var2_4 = var1_2 - var10_3.length();
            var10_3.getChars(0, var10_3.length(), var11_6 /* !! */ , var2_4);
            var0 = var10_3 = var0.a();
            var1_2 = var2_4;
            if (var10_3 == null) continue;
            var1_2 = var2_4 - 4;
            " -> ".getChars(0, 4, var11_6 /* !! */ , var1_2);
            var0 = var10_3;
        }
        return new String(var11_6 /* !! */ );
    }

    static void k(gpc object) {
        Object object2 = gno.a();
        Object object3 = ((goz)object2).c;
        if (object3 != null) {
            if (object == object3) {
                gno.f((goz)object2, object3.a());
                return;
            }
            object = object.c();
            object3 = object3.c();
            object2 = new StringBuilder("Tried to end span ");
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(", but that span is not the current span. The current span is ");
            ((StringBuilder)object2).append((String)object3);
            ((StringBuilder)object2).append(".");
            throw new gnm(((StringBuilder)object2).toString());
        }
        object3 = object.c();
        object = new StringBuilder("Tried to end [");
        ((StringBuilder)object).append((String)object3);
        ((StringBuilder)object).append("], but no trace was active. This is caused by mismatched or missing calls to beginSpan.");
        throw new gnl(((StringBuilder)object).toString());
    }

    public static void l() {
        int n2;
        int n3 = j;
        j = n2 = n3 - 1;
        if (n2 >= 0) {
            if (k == n3) {
                fxf.B(g.isEmpty() ^ true, "current async trace should not be null");
                gno.w(null);
                k = 0;
            }
            return;
        }
        throw new IllegalStateException("More calls to pause than to resume");
    }

    public static void m() {
        l = gno.b();
        fpk.e(new gni(1));
    }

    public static void n(boolean bl2) {
        Object object = gpe.a;
        Object object2 = gpd.b;
        ++j;
        if (k == 0) {
            boolean bl3 = object == object2;
            bl3 = bl2 & bl3;
            object = gno.a();
            object2 = ((goz)object).c;
            if (object2 == null) {
                gpc gpc2 = gno.c();
                if (bl3 && (object2 = gno.x(gpc2)) != null) {
                    if (gno.B(gpc2, (IllegalStateException)object2)) {
                        if (gpc2 == null) {
                            object2 = new gnw((Exception)object2, true, (goz)object);
                            g.push(object2);
                            gno.f((goz)object, (gpc)object2);
                        } else {
                            gno.f((goz)object, gpc2);
                        }
                        k = j;
                        return;
                    }
                    ((Throwable)object2).printStackTrace();
                    --j;
                    throw object2;
                }
                if (gpc2 != null) {
                    gno.f((goz)object, gpc2);
                    k = j;
                    return;
                }
            } else if (bl3 && object2 instanceof gnd && !((gnd)object2).h()) {
                object = gno.x((gpc)object2);
                ((Throwable)object).printStackTrace();
                --j;
                throw object;
            }
        }
    }

    public static void o() {
        ++j;
        if (k == 0) {
            gpc gpc2;
            goz goz2 = gno.a();
            if (goz2.c == null && (gpc2 = gno.c()) != null) {
                gno.f(goz2, gpc2);
                k = j;
            }
        }
    }

    static void p(hav hav2) {
        hat hat2 = new hat();
        hat2.i(hav2);
        hat2.i(n);
        o = hat2.g();
    }

    static boolean q(Throwable serializable2) {
        if (o.isEmpty()) {
            return false;
        }
        for (StackTraceElement stackTraceElement : ((Throwable)serializable2).getStackTrace()) {
            hdx hdx2 = o.k();
            while (hdx2.hasNext()) {
                String string = (String)hdx2.next();
                if (!stackTraceElement.toString().startsWith(string)) continue;
                return true;
            }
        }
        return false;
    }

    public static boolean r() {
        gpc gpc2 = gno.b();
        return gpc2 != null && gpc2 != goj.a;
    }

    public static boolean s() {
        gpc gpc2 = gno.c();
        if (gpc2 != null && (!(gpc2 instanceof gnd) || ((gnd)gpc2).h())) {
            gno.o();
            return true;
        }
        return false;
    }

    static gpc t(goz object, gpc gpc2, int n2) {
        gpc gpc3;
        block7: {
            gpc gpc4;
            block13: {
                block8: {
                    block12: {
                        block9: {
                            block11: {
                                block10: {
                                    gpc3 = ((goz)object).c;
                                    if (gpc3 == gpc2) {
                                        return gpc2;
                                    }
                                    if (gpc3 == null) {
                                        boolean bl2 = Build.VERSION.SDK_INT >= 29 ? gnk.a() : fhq.m(m);
                                        ((goz)object).b = bl2;
                                    }
                                    if (!((goz)object).b) break block7;
                                    if (gpc3 == null) break block8;
                                    if (gpc2 == null) break block9;
                                    if (gpc3.a() != gpc2) break block10;
                                    Trace.endSection();
                                    break block7;
                                }
                                if (gpc3 != gpc2.a()) break block11;
                                gno.y(gpc2.c());
                                break block7;
                            }
                            gpc4 = gpc2;
                            break block12;
                        }
                        gpc4 = null;
                    }
                    gno.A(gpc3);
                    break block13;
                }
                gpc4 = gpc2;
            }
            if (gpc4 != null) {
                gno.z(gpc4);
            }
        }
        if (gpc2 != null) {
            gpc2.o();
        } else {
            gpc2 = null;
        }
        if (gpc3 != null) {
            gpc3.o();
        }
        ((goz)object).c = gpc2;
        object = ((goz)object).e;
        if (n2 == 2) {
            a.s(object, "Coroutine is executing but trace storage is not being set.");
            ((gqr)object).b = gpc2;
        }
        return gpc3;
    }

    public static void u() {
        gno.v(true);
    }

    public static void v(boolean bl2) {
        if (gpe.a()) {
            gpc gpc2 = gno.b();
            IllegalStateException illegalStateException = gpc2 != null && !(gpc2 instanceof goj) ? (gpc2 instanceof gnd ? new IllegalStateException("Was supposed to have a trace - did you forget to propagate or create one? See this exception's cause for the last place a trace was missing. See http://go/tiktok-tracing for more details.", ((gnd)gpc2).g()) : null) : new IllegalStateException("Was supposed to have a trace - did you forget to propagate or create one? See http://go/tiktok-tracing for more details.");
            if (illegalStateException != null && !gno.B(gpc2, illegalStateException)) {
                if (!bl2 && gpe.a != gpd.c) {
                    throw illegalStateException;
                }
                Log.e((String)"Tracer", (String)"Missing trace", (Throwable)illegalStateException);
            }
        }
    }

    public static void w(gpc gpc2) {
        gno.f(gno.a(), gpc2);
    }

    private static IllegalStateException x(gpc gpc2) {
        if (gpc2 != null && !(gpc2 instanceof goj)) {
            if (gpc2 instanceof gnd) {
                return new IllegalStateException("Was supposed to have a trace - did you commit a FragmentManager transaction without one? See this exception's cause for the last place a trace was missing. Note most fragment transactions should use commitNow(), as trace can be lost in async operations like commit(). If you have to use commit(), refer to http://go/tiktok-tracing/handling_missing_traces.md#fragment-transactions for more details.", ((gnd)gpc2).g());
            }
            return null;
        }
        return new IllegalStateException("Was supposed to have a trace - did you commit a FragmentManager transaction without one? Most fragment transactions should use commitNow(), as trace can be lost in async operations like commit(). If you have to use commit(), refer to http://go/tiktok-tracing/handling_missing_traces.md#fragment-transactions for more details.");
    }

    private static void y(String string) {
        String string2 = string;
        if (string.length() > 127) {
            string2 = string.substring(0, 127);
        }
        Trace.beginSection((String)string2);
    }

    private static void z(gpc gpc2) {
        if (gpc2.a() != null) {
            gno.z(gpc2.a());
        }
        gno.y(gpc2.c());
    }
}

