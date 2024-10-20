/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 *  android.os.SystemClock
 *  hom
 */
import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class dnr
extends dno
implements dmw,
dll,
dle {
    volatile djt a;
    public final iku b;
    public final AtomicBoolean c;
    public final jnu d;
    public final jnu e;
    public final dsh f;
    public final gcv g;
    private final AtomicBoolean h = new AtomicBoolean();
    private final Executor i;
    private final dmt j;
    private final gto k;
    private final dlm l;
    private final dli m;
    private final AtomicInteger n = new AtomicInteger();
    private final AtomicInteger o = new AtomicInteger();
    private final AtomicInteger p = new AtomicInteger();
    private final AtomicBoolean q = new AtomicBoolean(false);
    private final jnu r;
    private final dml s;

    public dnr(dmu dmu2, Executor executor, iku iku2, gto gto2, dlm dlm2, dli dli2, dml dml2, jnu jnu2, jnu jnu3, jnu jnu4, gcv gcv2, dsh dsh2) {
        this.c = new AtomicBoolean(false);
        this.b = iku2;
        this.k = gto2;
        this.l = dlm2;
        this.m = dli2;
        this.s = dml2;
        this.j = dmu2.a((Executor)hom.a, iku2, null);
        this.i = executor;
        this.r = jnu2;
        this.d = jnu3;
        this.e = jnu4;
        this.g = gcv2;
        this.f = dsh2;
    }

    private final void p(int n2, AtomicInteger atomicInteger) {
        atomicInteger.getAndIncrement();
        hhk.P(new dnp(this, atomicInteger, n2), this.i);
    }

    @Override
    public final void L() {
        if (this.k.g()) {
            ((dnw)((jnu)this.k.c()).b()).a();
        }
        this.l.a(this);
        this.m.a(this);
        this.p(3, this.n);
        hhk.P(new cqg(this, 10), this.i);
    }

    @Override
    public final void a(Activity activity, Bundle bundle) {
        ((heg)((heg)dkc.a.c()).j("com/google/android/libraries/performance/primes/metrics/crash/CrashMetricServiceImpl", "onActivityCreated", 416, "CrashMetricServiceImpl.java")).r("onActivityCreated");
        if (!this.q.getAndSet(true)) {
            this.p(4, this.o);
        }
    }

    @Override
    public final /* synthetic */ void b(Activity activity) {
    }

    @Override
    public final /* synthetic */ void c(Activity activity) {
    }

    @Override
    public final void d(Activity activity) {
        hhk.P(new cqg(this, 11), this.i);
    }

    @Override
    public final /* synthetic */ void e(Activity activity, Bundle bundle) {
    }

    @Override
    public final void f(Activity activity) {
        this.a = djt.b(activity.getClass());
    }

    @Override
    public final /* synthetic */ void g(Activity activity) {
    }

    @Override
    public final /* synthetic */ void h(int n2) {
    }

    @Override
    public final void i(djt djt2) {
        this.a = null;
    }

    @Override
    public final /* synthetic */ void j(djt djt2) {
    }

    @Override
    public final void k() {
        if (this.h.compareAndSet(false, true)) {
            Thread.setDefaultUncaughtExceptionHandler(new dnq(this, Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void l(kez var1_1) {
        block47: {
            block41: {
                block45: {
                    block46: {
                        block43: {
                            block44: {
                                block42: {
                                    block40: {
                                        var8_4 = var1_1;
                                        var9_5 = (dnf)this.b.b();
                                        if (!var9_5.b()) {
                                            return;
                                        }
                                        var7_6 /* !! */  = (cxu)((gtt)this.j.g).a;
                                        var1_1 = var7_6 /* !! */ .b;
                                        synchronized (var1_1) {
                                            if (((WeakHashMap)var7_6 /* !! */ .b).isEmpty()) {
                                                var7_6 /* !! */  = dkx.a;
                                            } else {
                                                var7_6 /* !! */  = ((WeakHashMap)var7_6 /* !! */ .b).values().toArray(new dla[0]);
                                                // MONITOREXIT @DISABLED, blocks:[36, 8] lbl13 : MonitorExitStatement: MONITOREXIT : var1_1
                                                var7_6 /* !! */  = new dkx(var7_6 /* !! */ );
                                            }
                                        }
                                        var1_1 = var8_4;
                                        if (!this.m()) ** GOTO lbl-1000
                                        var1_1 = this.g;
                                        if (((AtomicBoolean)var1_1.f).getAndSet(false)) break block40;
                                        var10_7 = key.a.l();
                                        if (!var10_7.b.B()) {
                                            var10_7.u();
                                        }
                                        var1_1 = (key)var10_7.b;
                                        var1_1.c = 1;
                                        var1_1.b |= 1;
                                        var1_1 = (key)var10_7.o();
                                        break block41;
                                    }
                                    var10_7 = var1_1.d;
                                    var1_1 = key.a.l();
                                    var12_14 = (kht)var10_7;
                                    var10_7 = (dnh)var12_14.c.b();
                                    var5_11 = var12_14.a;
                                    if (SystemClock.uptimeMillis() - var5_11 <= (long)var10_7.e) break block42;
                                    if (!var1_1.b.B()) {
                                        var1_1.u();
                                    }
                                    var10_7 = (key)var1_1.b;
                                    var10_7.c = 2;
                                    var10_7.b |= 1;
                                    var1_1 = (key)var1_1.o();
                                    break block41;
                                }
                                var11_12 = var12_14.b;
                                var12_14 = var12_14.d;
                                var11_12 = (gto)var11_12.a();
                                var4_10 = var11_12.g();
                                var12_14 = var12_14.a();
                                if (!var4_10 || !(var12_14 = (gto)var12_14).g()) break block43;
                                var11_12 = var11_12.c();
                                var12_14 = (String)var12_14.c();
                                var11_12 = new dng((File)var11_12, (String)var12_14);
                                var2_8 = var11_12.a();
                                if (!var1_1.b.B()) {
                                    var1_1.u();
                                }
                                var12_14 = var1_1.b;
                                var13_15 /* !! */  = (key)var12_14;
                                var13_15 /* !! */ .b |= 2;
                                var13_15 /* !! */ .d = var2_8;
                                var3_9 = var2_8 + 1;
                                if (var3_9 < var10_7.d) break block44;
                                if (!var12_14.B()) {
                                    var1_1.u();
                                }
                                var10_7 = (key)var1_1.b;
                                var10_7.c = 5;
                                var10_7.b |= 1;
                                var1_1 = (key)var1_1.o();
                                break block41;
                            }
                            if (!var11_12.c()) break block45;
                            ++var11_12.b;
                            var12_14 = dnm.a.l();
                            var2_8 = var11_12.b;
                            if (!var12_14.b.B()) {
                                var12_14.u();
                            }
                            var13_15 /* !! */  = (dnm)var12_14.b;
                            var13_15 /* !! */ .b |= 1;
                            break block46;
                        }
                        if (!var1_1.b.B()) {
                            var1_1.u();
                        }
                        var10_7 = (key)var1_1.b;
                        var10_7.c = 6;
                        var10_7.b |= 1;
                        var1_1 = (key)var1_1.o();
                        break block41;
                    }
                    var13_15 /* !! */ .c = var2_8;
                    var12_14 = (dnm)var12_14.o();
                    var2_8 = 0;
                    while (true) {
                        var14_18 = new FileOutputStream(var11_12.b());
                        var12_14.f(var14_18);
                        var14_18.close();
                        break;
                        catch (Throwable var13_16) {
                            try {
                                var14_18.close();
                                throw var13_16;
                            }
                            catch (Throwable var14_19) {
                                try {
                                    var13_16.addSuppressed(var14_19);
                                    throw var13_16;
                                }
                                catch (IOException var11_13) {
                                    a.as(dkc.a.h(), "failed to write counter to disk.", "com/google/android/libraries/performance/primes/metrics/crash/CrashCounter", "increment", 'D', "CrashCounter.java", var11_13);
                                }
                                catch (FileNotFoundException var13_17) {
                                    if (var2_8 != 0) break;
                                    var11_12.a.mkdirs();
                                    var2_8 = 1;
                                    continue;
                                }
                            }
                        }
                        break;
                    }
                }
                if (var3_9 >= var10_7.c) {
                    if (!var1_1.b.B()) {
                        var1_1.u();
                    }
                    var10_7 = (key)var1_1.b;
                    var10_7.c = 4;
                    var10_7.b |= 1;
                    var1_1 = (key)var1_1.o();
                } else {
                    if (!var1_1.b.B()) {
                        var1_1.u();
                    }
                    var10_7 = (key)var1_1.b;
                    var10_7.c = 3;
                    var10_7.b |= 1;
                    var1_1 = (key)var1_1.o();
                }
            }
            var10_7 = (hwp)var8_4.C(5);
            var10_7.x((hwv)var8_4);
            if (!var10_7.b.B()) {
                var10_7.u();
            }
            var8_4 = (kez)var10_7.b;
            var11_12 = kez.a;
            var1_1.getClass();
            var8_4.k = var1_1;
            var8_4.b |= 2048;
            var8_4 = (kez)var10_7.o();
            var2_8 = jsl.z(var1_1.c);
            if (var2_8 != 0) break block47;
            var1_1 = var8_4;
            ** GOTO lbl-1000
        }
        var1_1 = var8_4;
        if (var2_8 == 5) {
            var2_8 = 1;
            var1_1 = var8_4;
        } else lbl-1000:
        // 3 sources

        {
            var2_8 = 0;
        }
        try {
            var3_9 = fpk.g() != false ? ((dns)this.r.b()).b : ((dns)this.r.b()).c;
            var5_11 = var3_9;
            var12_14 = this.j;
            var10_7 = dmq.a();
            var11_12 = kfl.a.l();
            if (!var11_12.b.B()) {
                var11_12.u();
            }
            var8_4 = (kfl)var11_12.b;
            var1_1.getClass();
            var8_4.i = var1_1;
            var8_4.b |= 64;
            var10_7.i((kfl)var11_12.o());
            var10_7.d = null;
            var10_7.f = var7_6 /* !! */ ;
            var10_7.f(var9_5.b);
            var12_14.b(var10_7.e()).get(var5_11, TimeUnit.MILLISECONDS);
        }
        catch (InterruptedException var1_2) {
            Thread.currentThread().interrupt();
        }
        catch (Throwable | TimeoutException var1_3) {}
        while (this.n.getAndDecrement() > 0) {
            this.n(3, var9_5);
        }
        if (this.m() && !this.c.getAndSet(true)) {
            this.o(6, var9_5, ((dnh)this.e.b()).f);
        }
        while (true) {
            if (this.o.getAndDecrement() <= 0) {
                while (true) {
                    if (this.p.getAndDecrement() <= 0) {
                        if (var2_8 == 0) return;
                        var1_1 = var9_5.c;
                        return;
                    }
                    this.n(5, var9_5);
                }
            }
            this.n(4, var9_5);
        }
    }

    public final boolean m() {
        return ((dnh)this.e.b()).b;
    }

    public final hpn n(int n2, dnf dnf2) {
        return this.o(n2, dnf2, dnf2.a / 100.0f);
    }

    public final hpn o(int n2, dnf object, float f2) {
        if (!((dnf)object).b()) {
            return hpj.a;
        }
        if (!this.s.a(f2).a()) {
            return hpj.a;
        }
        dmt dmt2 = this.j;
        fhc fhc2 = dmq.a();
        object = kfl.a.l();
        hyg hyg2 = kfk.a.l();
        f2 = 1.0f / f2;
        if (!((hwp)hyg2).b.B()) {
            ((hwp)hyg2).u();
        }
        int n3 = (int)f2;
        hwv hwv2 = ((hwp)hyg2).b;
        hwv hwv3 = (kfk)hwv2;
        hwv3.b |= 2;
        hwv3.d = n3;
        if (!hwv2.B()) {
            ((hwp)hyg2).u();
        }
        hwv3 = (kfk)((hwp)hyg2).b;
        hwv3.c = n2 - 1;
        hwv3.b |= 1;
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        hwv3 = (kfl)((hwp)object).b;
        hyg2 = (kfk)((hwp)hyg2).o();
        hyg2.getClass();
        ((kfl)hwv3).u = hyg2;
        ((kfl)hwv3).b |= 0x800000;
        fhc2.i((kfl)((hwp)object).o());
        return dmt2.b(fhc2.e());
    }
}

