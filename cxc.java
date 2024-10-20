/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  android.util.Log
 */
import android.app.ActivityManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class cxc
implements gte {
    private final int a;

    public /* synthetic */ cxc(int n2) {
        this.a = n2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final Object apply(Object var1_1) {
        var2_2 = this.a;
        var5_3 = true;
        switch (var2_2) {
            default: {
                var1_1 = (dmo)var1_1;
                return false;
            }
            case 19: {
                return Integer.parseInt((String)var1_1);
            }
            case 18: {
                var1_1 = (RuntimeException)var1_1;
                ((heg)((heg)((heg)dkc.a.h()).i((Throwable)var1_1)).j("com/google/android/libraries/performance/primes/metrics/memory/MemoryMetricServiceImpl", "record", 422, "MemoryMetricServiceImpl.java")).r("Metric extension provider failed.");
                return null;
            }
            case 17: {
                return gzx.o((List)var1_1);
            }
            case 16: {
                var6_4 = (kel)var1_1;
                var1_1 = kfp.a.l();
                if (!var1_1.b.B()) {
                    var1_1.u();
                }
                var5_3 = (kfp)var1_1.b;
                var6_4.getClass();
                var5_3.c = var6_4;
                var5_3.b |= 1;
                var5_3 = kfo.a.l();
                if (!var5_3.b.B()) {
                    var5_3.u();
                }
                var6_4 = (kfo)var5_3.b;
                var6_4.b |= 2;
                var6_4.e = true;
                var6_4 = (kfo)var5_3.o();
                if (!var1_1.b.B()) {
                    var1_1.u();
                }
                var5_3 = (kfp)var1_1.b;
                var6_4.getClass();
                var5_3.d = var6_4;
                var5_3.b |= 2;
                return (kfp)var1_1.o();
            }
            case 15: {
                return gto.h(((ActivityManager.RunningAppProcessInfo)var1_1).importanceReasonComponent);
            }
            case 14: {
                return ((djt)var1_1).a;
            }
            case 13: {
                var2_2 = dec.a;
                var1_1 = var1_1 == null ? "" : var1_1.toString();
                return var1_1;
            }
            case 12: {
                var1_1 = (gtp)var1_1;
                fxf.K(var1_1);
                return var1_1.a;
            }
            case 11: {
                var1_1 = (den)var1_1;
                var1_1 = var1_1 != null ? var1_1.o().f(false) : "null";
                return var1_1;
            }
            case 10: {
                return ((der)var1_1).h(true, false);
            }
            case 9: {
                var1_1 = (Void)var1_1;
                return new bbg();
            }
            case 8: {
                var1_1 = var5_3 = ((cts)var1_1).f;
                if (var5_3 == null) {
                    var1_1 = ctu.a;
                }
                return var1_1;
            }
            case 7: {
                var1_1 = (hmb)var1_1;
                var6_5 = hls.a.l();
                if (!var6_5.b.B()) {
                    var6_5.u();
                }
                var5_3 = (hls)var6_5.b;
                var1_1.getClass();
                var5_3.l = var1_1;
                var5_3.c |= 65536;
                return Arrays.asList(new hls[]{(hls)var6_5.o()});
            }
            case 6: {
                var5_3 = (List)var1_1;
                var1_1 = new ArrayList<E>();
                var6_6 = var5_3.iterator();
                while (var6_6.hasNext()) {
                    var10_15 = (cyp)var6_6.next();
                    var5_3 = hls.a.l();
                    var8_11 /* !! */  = var10_15.a;
                    if (!var5_3.b.B()) {
                        var5_3.u();
                    }
                    var7_9 = var5_3.b;
                    var9_13 = (hls)var7_9;
                    var9_13.h = var8_11 /* !! */ ;
                    var9_13.b |= -2147483648;
                    var8_11 /* !! */  = var10_15.b;
                    if (!var7_9.B()) {
                        var5_3.u();
                    }
                    var7_9 = (hls)var5_3.b;
                    var7_9.e = var8_11 /* !! */ ;
                    var7_9.b |= 256;
                    var1_1.add((hls)var5_3.o());
                }
                return var1_1;
            }
            case 5: {
                var1_1 = (hme)var1_1;
                var6_7 = hls.a.l();
                if (!var6_7.b.B()) {
                    var6_7.u();
                }
                var5_3 = (hls)var6_7.b;
                var1_1.getClass();
                var5_3.j = var1_1;
                var5_3.c |= 8192;
                return Arrays.asList(new hls[]{(hls)var6_7.o()});
            }
            case 4: {
                var1_1 = (Iterable)var1_1;
                var6_8 = new HashMap<K, V>();
                var9_14 = var1_1.iterator();
                while (var9_14.hasNext()) {
                    var11_19 = (cxr)var9_14.next();
                    var7_10 = cyo.i(var11_19.b);
                    var8_12 = new HashSet<Object>();
                    var10_16 = var11_19.b;
                    var1_1 = var5_3 = var10_16.v;
                    if (var5_3 == null) {
                        var1_1 = kfr.a;
                    }
                    var2_2 = true != var11_19.a.f ? 3 : 4;
                    var1_1 = var1_1.b.iterator();
                    while (var1_1.hasNext()) {
                        var5_3 = (kfq)var1_1.next();
                        var3_17 = var4_18 = a.v(var5_3.b);
                        if (var4_18 == 0) {
                            var3_17 = 1;
                        }
                        if (var3_17 != var2_2) continue;
                        var1_1 = gto.i((int)var5_3.c);
                        ** GOTO lbl135
                    }
                    var1_1 = gsl.a;
lbl135:
                    // 2 sources

                    if (var1_1.g()) {
                        var8_12.add(var1_1.c());
                    } else if (Log.isLoggable((String)"MDD", (int)5)) {
                        Log.w((String)"MDD", (String)"No download stage experiment ids found even though experiment info is set.");
                    }
                    var1_1 = var5_3 = var10_16.v;
                    if (var5_3 == null) {
                        var1_1 = kfr.a;
                    }
                    if (var1_1.c.size() < 10) {
                        var1_1 = var5_3 = var10_16.v;
                        if (var5_3 == null) {
                            var1_1 = kfr.a;
                        }
                        var8_12.addAll(var1_1.c);
                    } else {
                        var1_1 = var5_3 = var10_16.v;
                        if (var5_3 == null) {
                            var1_1 = kfr.a;
                        }
                        cyr.n("Found more experiment ids than mendel experiment ids for logging than allowed. Found %d, limit is %d", var1_1.c.size(), 10);
                    }
                    if (var8_12.isEmpty()) continue;
                    cyo.g(var6_8, var7_10).addAll(var8_12);
                }
                return var6_8;
            }
            case 3: {
                var5_3 = (Iterable)var1_1;
                var1_1 = new HashMap<K, V>();
                var5_3 = var5_3.iterator();
                while (var5_3.hasNext()) {
                    cyo.g((Map)var1_1, cyo.i((cth)var5_3.next()));
                }
                return var1_1;
            }
            case 2: {
                var1_1 = (Void)var1_1;
                return var5_3;
            }
            case 1: {
                var1_1 = (Void)var1_1;
                return var5_3;
            }
            case 0: 
        }
        var5_3 = (ctx)var1_1;
        var1_1 = (hwp)var5_3.C(5);
        var1_1.x((hwv)var5_3);
        if (!var1_1.a.B()) {
            var1_1.b = var1_1.q();
            return (ctx)var1_1.o();
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }
}

