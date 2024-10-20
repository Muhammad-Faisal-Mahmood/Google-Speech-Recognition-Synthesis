/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 *  android.os.StrictMode$ThreadPolicy$Builder
 */
import android.net.Uri;
import android.os.StrictMode;
import androidx.wear.ambient.AmbientLifecycleObserverKt;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class cym
implements gte {
    public final Object a;
    private final int b;

    public /* synthetic */ cym(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object apply(Object var1_1) {
        var2_5 = this.b;
        var8_6 = null;
        var7_8 = false;
        switch (var2_5) {
            default: {
                var1_1 = (hyf)var1_1;
                return ((caj)((dzg)this.a).c.b()).e((hyf)var1_1);
            }
            case 19: {
                var11_9 = (dvk)var1_1;
                var12_13 = new hcc(null);
                var9_16 = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)new StrictMode.ThreadPolicy.Builder(var9_16).permitDiskWrites().build());
                var10_28 = this.a;
                try {
                    var13_33 = dwq.a;
                    synchronized (var13_33) {
                    }
                }
                catch (Throwable var1_2) {
                    ** GOTO lbl53
                }
                catch (IOException var8_7) {
                    var1_1 = new RuntimeException(var8_7);
                    throw var1_1;
                }
                {
                    var15_35 = (bmu)((dwq)var10_28).f.a();
                    var14_36 = ((dwq)var10_28).h;
                    var1_1 = var8_6 = var11_9.c;
                    if (var8_6 == null) {
                        var1_1 = dvh.b;
                    }
                    var8_6 = new fqt((hyf)var1_1);
                    var8_6.a = new hcc[]{var12_13};
                    var15_35.w(var14_36, (fpp)var8_6);
                    var1_1 = var8_6 = var11_9.c;
                    if (var8_6 == null) {
                        var1_1 = dvh.b;
                    }
                    ((dwq)var10_28).i = var1_1;
                }
                {
                    var13_33 = dwq.b;
                    ** synchronized (var13_33)
                }
lbl-1000:
                // 1 sources

                {
                    var15_35 = (bmu)((dwq)var10_28).f.a();
                    var14_36 = ((dwq)var10_28).j;
                    var1_1 = var8_6 = var11_9.d;
                    if (var8_6 == null) {
                        var1_1 = dvi.b;
                    }
                    var8_6 = new fqt((hyf)var1_1);
                    var8_6.a = new hcc[]{var12_13};
                    var15_35.w(var14_36, (fpp)var8_6);
                    var1_1 = var8_6 = var11_9.d;
                    if (var8_6 == null) {
                        var1_1 = dvi.b;
                    }
                    ((dwq)var10_28).k = var1_1;
                }
                StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)var9_16);
                return null;
lbl53:
                // 1 sources

                StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)var9_16);
                throw var1_2;
            }
            case 18: {
                var9_17 = (dvn)var1_1;
                var1_1 = dvv.a;
                var8_6 = this.a;
                var1_1 = dvl.a;
                var8_6.getClass();
                var9_17 = var9_17.b;
                if (var9_17.containsKey(var8_6) == false) return var1_1.d;
                var1_1 = (dvl)var9_17.get(var8_6);
                return var1_1.d;
            }
            case 17: {
                var8_6 = (dvn)var1_1;
                var1_1 = dvv.a;
                var1_1 = dvl.a;
                var9_18 = var8_6.b;
                var8_6 = this.a;
                if (var9_18.containsKey(var8_6) == false) return var1_1.c;
                var1_1 = (dvl)var9_18.get(var8_6);
                return var1_1.c;
            }
            case 16: {
                var8_6 = (dvn)var1_1;
                var1_1 = dvv.a;
                var1_1 = dvn.a.l();
                var10_29 = DesugarCollections.unmodifiableMap(var8_6.b).entrySet().iterator();
                while (var10_29.hasNext() != false) {
                    var8_6 = this.a;
                    var11_10 = var10_29.next();
                    var14_37 = (dvl)var11_10.getValue();
                    var9_19 = dvl.a.l();
                    if (!var14_37.d.equals(var8_6)) {
                        var13_34 = var14_37.d;
                        if (!var9_19.b.B()) {
                            var9_19.u();
                        }
                        var12_14 = (dvl)var9_19.b;
                        var13_34.getClass();
                        var12_14.b |= 1;
                        var12_14.d = var13_34;
                    }
                    for (String var13_34 : var14_37.c) {
                        if (var13_34.equals(var8_6)) continue;
                        var9_19.F(var13_34);
                    }
                    var1_1.G((String)var11_10.getKey(), (dvl)var9_19.o());
                }
                return (dvn)var1_1.o();
            }
            case 15: {
                var1_1 = (String)var1_1;
                return (dvo)((cya)this.a).c.get(var1_1);
            }
            case 14: {
                var1_1 = (clw)((ilo)var1_1).a;
                kl.at(var1_1.a);
                var2_5 = var1_1.a.a;
                if (var2_5 == 1 || var2_5 == 3) {
                    var7_8 = true;
                }
                var8_6 = this.a;
                var1_1 = var7_8;
                ((dtd)var8_6).a.set(var1_1);
                return var1_1;
            }
            case 13: {
                var1_1 = (String)var1_1;
                try {
                    var9_20 = new ProcessBuilder(new String[]{"/system/bin/trigger_perfetto", var1_1});
                    return var9_20.start();
                }
                catch (IOException var1_3) {
                    ((dna)this.a).b = true;
                    return var8_6;
                }
            }
            case 12: {
                var1_1 = (Throwable)var1_1;
                var1_1 = ((dal)this.a).a.iterator();
                while (var1_1.hasNext() != false) {
                    ((das)var1_1.next()).b();
                }
                return new bbe();
            }
            case 11: {
                var1_1 = (AmbientLifecycleObserverKt)var1_1;
                var8_6 = ((dal)this.a).a.iterator();
                while (var8_6.hasNext() != false) {
                    var9_21 = (das)var8_6.next();
                    try {
                        var9_21.a();
                    }
                    catch (Exception var9_27) {}
                }
                return var1_1;
            }
            case 10: {
                var8_6 = (Uri)var1_1;
                var1_1 = this.a;
                if (var8_6 == null) return 0L;
                try {
                    return ((czd)var1_1).h.u((Uri)var8_6);
                }
                catch (IOException var1_4) {
                    cyr.j(var1_4, "%s: Failed to call mobstore fileSize on uri %s!", new Object[]{"StorageLogger", var8_6});
                }
                return 0L;
            }
            case 9: {
                var1_1 = (cts)var1_1;
                var2_5 = cyx.d;
                var10_30 = var1_1.d;
                var8_6 = this.a;
                var9_22 = new cyl(var8_6, 3);
                var2_5 = fvd.B(var10_30.iterator(), (gtq)var9_22);
                if (var2_5 == -1) {
                    var9_22 = (hwp)var1_1.C(5);
                    var9_22.x((hwv)var1_1);
                    if (!var9_22.b.B()) {
                        var9_22.u();
                    }
                    var1_1 = (cts)var9_22.b;
                    var8_6.getClass();
                    var1_1.b();
                    var1_1.d.add(var8_6);
                    return (cts)var9_22.o();
                }
                var10_30 = (ctl)var1_1.d.get(var2_5);
                var9_22 = (hwp)var10_30.C(5);
                var9_22.x((hwv)var10_30);
                var3_38 = var10_30.g;
                var8_6 = (ctl)var8_6;
                var5_41 = var8_6.g;
                if (!var9_22.b.B()) {
                    var9_22.u();
                }
                var12_15 = var9_22.b;
                var11_11 = (ctl)var12_15;
                var11_11.b |= 16;
                var11_11.g = var3_38 + var5_41;
                var5_41 = var10_30.h;
                var3_38 = var8_6.h;
                if (!var12_15.B()) {
                    var9_22.u();
                }
                var8_6 = (ctl)var9_22.b;
                var8_6.b |= 32;
                var8_6.h = var5_41 + var3_38;
                var8_6 = (ctl)var9_22.o();
                var9_22 = (hwp)var1_1.C(5);
                var9_22.x((hwv)var1_1);
                if (!var9_22.b.B()) {
                    var9_22.u();
                }
                var1_1 = (cts)var9_22.b;
                var8_6.getClass();
                var1_1.b();
                var1_1.d.set(var2_5, var8_6);
                return (cts)var9_22.o();
            }
            case 8: {
                var1_1 = (Void)var1_1;
                var2_5 = cyx.d;
                return (List)((AtomicReference)this.a).get();
            }
            case 7: {
                var1_1 = (cts)var1_1;
                var2_5 = cyx.d;
                var8_6 = var1_1.d;
                ((AtomicReference)this.a).set(var8_6);
                var8_6 = (hwp)var1_1.C(5);
                var8_6.x((hwv)var1_1);
                if (!var8_6.b.B()) {
                    var8_6.u();
                }
                ((cts)var8_6.b).d = hyp.b;
                return (cts)var8_6.o();
            }
            case 6: {
                var1_1 = (Void)var1_1;
                var2_5 = cyx.d;
                return (gto)((AtomicReference)this.a).get();
            }
            case 5: {
                var10_31 = (cts)var1_1;
                var5_42 = cqq.x();
                var9_23 /* !! */  = var5_42;
                var1_1 = var8_6 = var10_31.c;
                if (var8_6 == null) {
                    var1_1 = hzb.a;
                }
                var3_39 = hzw.a((hzb)var1_1);
                var8_6 = (hwp)var10_31.C(5);
                var8_6.x(var10_31);
                var9_23 /* !! */ .getClass();
                var1_1 = hzw.b(var5_42);
                if (!var8_6.b.B()) {
                    var8_6.u();
                }
                var11_12 = (cts)var8_6.b;
                var1_1.getClass();
                var11_12.c = var1_1;
                var11_12.b |= 1;
                var1_1 = (cts)var8_6.o();
                if ((var10_31.b & 1) == 0) return var1_1;
                var8_6 = this.a;
                var9_23 /* !! */ .getClass();
                var5_42 = cyx.e(var5_42);
                Long.valueOf(var3_39).getClass();
                var3_39 = cyx.e(var3_39);
                var9_23 /* !! */  = gto.i(hhk.ag(TimeUnit.MILLISECONDS.toDays(var5_42 - var3_39)));
                ((AtomicReference)var8_6).set(var9_23 /* !! */ );
                return var1_1;
            }
            case 4: {
                var8_6 = (cts)var1_1;
                var9_24 = var8_6.f;
                var1_1 = var9_24;
                if (var9_24 == null) {
                    var1_1 = ctu.a;
                }
                if ((var1_1.b & 1) != 0) {
                    return var8_6;
                }
                var3_40 = ((cyx)this.a).b.nextLong();
                var9_24 = (hwp)var8_6.C(5);
                var9_24.x((hwv)var8_6);
                var1_1 = var8_6 = var8_6.f;
                if (var8_6 == null) {
                    var1_1 = ctu.a;
                }
                var8_6 = (hwp)var1_1.C(5);
                var8_6.x((hwv)var1_1);
                if (!var8_6.b.B()) {
                    var8_6.u();
                }
                var1_1 = (ctu)var8_6.b;
                var1_1.b |= 1;
                var1_1.c = var3_40;
                var1_1 = hzw.b(cqq.x());
                if (!var8_6.b.B()) {
                    var8_6.u();
                }
                var10_32 = (ctu)var8_6.b;
                var1_1.getClass();
                var10_32.d = var1_1;
                var10_32.b |= 2;
                if (!var9_24.b.B()) {
                    var9_24.u();
                }
                var1_1 = (cts)var9_24.b;
                var8_6 = (ctu)var8_6.o();
                var8_6.getClass();
                var1_1.f = var8_6;
                var1_1.b = 4 | var1_1.b;
                return (cts)var9_24.o();
            }
            case 3: {
                var8_6 = (cwi)var1_1;
                var1_1 = this.a;
                if (var8_6 != cwi.b && var8_6 != cwi.a) {
                    var8_6 = (hwp)var1_1;
                    if (!var8_6.b.B()) {
                        var8_6.u();
                    }
                    var8_6 = (hlx)var8_6.b;
                    var9_25 = hlx.a;
                    var8_6.c = a.A(5);
                    var8_6.b |= 1;
                    return (hlx)((hwp)var1_1).o();
                }
                var8_6 = (hwp)var1_1;
                if (!var8_6.b.B()) {
                    var8_6.u();
                }
                var9_26 = (hlx)var8_6.b;
                var8_6 = hlx.a;
                var9_26.c = a.A(4);
                var9_26.b |= 1;
                return (hlx)((hwp)var1_1).o();
            }
            case 2: {
                return new cyp((hlx)var1_1, (hlq)this.a);
            }
            case 1: {
                return fvd.M((List)var1_1, new cyl(this.a, 2));
            }
            case 0: 
        }
        return fvd.M((List)var1_1, new cyl(this.a, 0));
    }
}

