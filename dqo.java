/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.ConnectivityManager
 */
import android.net.ConnectivityManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;

public final class dqo
implements hnx {
    public final long a;
    public final Object b;
    public final Object c;
    private final int d;

    public /* synthetic */ dqo(dqp dqp2, dql dql2, long l2, int n2) {
        this.d = n2;
        this.b = dqp2;
        this.c = dql2;
        this.a = l2;
    }

    public /* synthetic */ dqo(egg egg2, String string, long l2, int n2) {
        this.d = n2;
        this.c = egg2;
        this.b = string;
        this.a = l2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn a() {
        block22: {
            var1_1 = this.d;
            var6_2 = false;
            var2_3 = 1;
            if (var1_1 != 0) {
                var8_4 = (egg)this.c;
                var8_4.f();
                var10_6 = this.b;
                var7_8 = var8_4.j;
                var9_11 = (String)var10_6;
                var2_3 = var7_8.a(var9_11);
                ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/Superpacks", "sync", 776, "Superpacks.java")).A("Syncing %s, version: %d", var10_6, var2_3);
                var10_6 = var8_4.b(var9_11, var2_3, "sync");
                if (var10_6 == null) throw new ddg("No manifest registered for ".concat(var9_11));
                var13_14 = ((dct)var10_6.e()).a;
                var11_15 = ((dcj)var8_4.d).c(var13_14);
                ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/Superpacks", "requestSlices", 1698, "Superpacks.java")).C("Slicing strategy for %s: %s", var10_6.e(), var11_15);
                var12_16 = var8_4.b.a(var13_14, true);
                if (var12_16 != null) {
                    var7_8 = var12_16.a;
                } else {
                    var1_1 = gzx.d;
                    var7_8 = hct.a;
                }
                var14_17 = ddo.c((Collection)var7_8);
                var16_18 = var11_15.a((dbx)var10_6);
                var8_4.i(var13_14, var16_18.d());
                var17_19 = (hfk)((hfk)ddd.a.f()).j("com/google/android/libraries/micore/superpacks/Superpacks", "requestSlices", 1726, "Superpacks.java");
                var19_20 = new cxc(10);
                var18_21 = (dax)var16_18;
                var15_22 = var18_21.a;
                var19_20 = dec.f(var15_22, (gte)var19_20);
                if (var18_21.c != null) {
                    var6_2 = true;
                }
                var17_19.H("Syncing %s (%d) with slices: %s, metadata: %b", var13_14, var2_3, var19_20, var6_2);
                var17_19 = var14_17.iterator();
                while (true) {
                    if (!var17_19.hasNext()) {
                        var4_23 = this.a;
                        var11_15.b();
                        return hno.g(hno.g(((dhl)var8_4.i).c(var13_14, var15_22, var14_17), new dca(var8_4, var13_14, (gzx)var7_8, var15_22, var16_18, var12_16, 0), (Executor)var8_4.l), new dcc(var8_4, var4_23, var9_11, (dbx)var10_6), (Executor)var8_4.l);
                    }
                    var19_20 = (ddn)var17_19.next();
                    var18_21 = var8_4.c;
                    dda.a.a(((dfu)var18_21).f((ddn)var19_20));
                }
            }
            var4_24 = this.a;
            var8_5 = this.b;
            var1_1 = a.F(((ket)((dqp)var8_5).e.b()).d);
            var7_9 = this.c;
            if (var1_1 != 0 && var1_1 == 5) {
                ((dql)var7_9).t = var9_12 = gto.i(var4_24);
            }
            var10_7 /* !! */  = ((dqp)var8_5).a;
            ((dql)var7_9).l = var9_12 = ((dqp)var8_5).h.c();
            var3_25 = -1;
            try {
                var9_12 = (ConnectivityManager)var10_7 /* !! */ .getSystemService("connectivity");
                var1_1 = var3_25;
                if (var9_12 == null) break block22;
                var9_12 = var9_12.getActiveNetworkInfo();
                var1_1 = var3_25;
                if (var9_12 != null) {
                    var1_1 = var9_12.getType();
                }
            }
            catch (SecurityException var9_13) {
                a.as(dkc.a.h(), "Failed to get network type, Please add: android.permission.ACCESS_NETWORK_STATE to AndroidManifest.xml", "com/google/android/libraries/performance/primes/metrics/network/NetworkCapture", "getNetworkType", '$', "NetworkCapture.java", var9_13);
                var1_1 = var3_25;
            }
        }
        if ((var1_1 = jsl.x(var1_1)) == 0) {
            var1_1 = var2_3;
        }
        ((dql)var7_9).u = var1_1;
        var1_1 = ((dqk)((dqp)var8_5).b.b()).a;
        var9_12 = ((dqp)var8_5).c;
        synchronized (var9_12) {
            ((dqp)var8_5).f.ensureCapacity(var1_1);
            ((dqp)var8_5).f.add(var7_9);
        }
        {
            if (((dqp)var8_5).f.size() >= var1_1) {
                var7_9 = ((dqp)var8_5).f;
                var10_7 /* !! */  = new ArrayList(0);
                ((dqp)var8_5).f = var10_7 /* !! */ ;
            } else {
                var7_9 = null;
            }
            if (var7_9 != null) ** GOTO lbl89
        }
        try {
            var7_9 = hpj.a;
            return var7_9;
lbl89:
            // 1 sources

            var7_9 = ((dqm)((dqp)var8_5).d.b()).c((Iterable)var7_9);
            var7_9 = ((dqp)var8_5).b((kfl)var7_9);
            return var7_9;
        }
        finally {
            ((dqp)var8_5).g.decrementAndGet();
        }
    }
}

