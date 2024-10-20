/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.SystemClock
 *  android.os.health.HealthStats
 *  android.os.health.SystemHealthManager
 *  android.util.Base64
 */
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.health.HealthStats;
import android.os.health.SystemHealthManager;
import android.util.Base64;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class dma
extends dly
implements dll,
dle,
dmw {
    final AtomicBoolean a = new AtomicBoolean();
    private final Context b;
    private final dlm c;
    private final Executor d;
    private final dml e;
    private final jnu f;
    private final dmt g;
    private final AtomicBoolean h;
    private final dli i;

    public dma(dmu dmu2, Context context, dlm dlm2, dli dli2, hpr executor, iku iku2, dml dml2, jnu jnu2, jnu jnu3, Executor executor2) {
        new ConcurrentHashMap();
        this.h = new AtomicBoolean(false);
        this.i = dli2;
        this.g = dmu2.a(executor2, iku2, jnu3);
        this.b = context;
        this.c = dlm2;
        if (Build.VERSION.SDK_INT < 31) {
            executor = executor2;
        }
        this.d = executor;
        this.e = dml2;
        this.f = jnu2;
    }

    private final hpn M(kdc kdc2) {
        return hhk.P(new dlz(this, kdc2), this.d);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public /* synthetic */ hpn I(kdc object, djt object2) {
        Object object3;
        Object object4;
        Object object5;
        block79: {
            Object var22_4;
            block80: {
                double d2;
                boolean bl2;
                Object object6;
                Object object7;
                Object object8;
                Object object9;
                block77: {
                    block78: {
                        object2 = this.g;
                        var22_4 = null;
                        if (!((dmt)object2).c(null)) {
                            return hpj.a;
                        }
                        fpk.b();
                        dml dml2 = this.e;
                        // MONITORENTER : dml2
                        object2 = this.e.a;
                        object5 = (hym)dtm.a.C(7);
                        fpk.b();
                        object2 = !crt.e((Context)((dsh)object2).a) ? null : (Object)Base64.decode((String)((SharedPreferences)((dsh)object2).b.b()).getString("primes.battery.snapshot", ""), (int)0);
                        if (object2 != null && (object9 = ((Object)object2).length) != 0) {
                            object8 = object2[0];
                            if (object8 == true) {
                                try {
                                    object2 = object5.h((byte[])object2, 1, object9 - 1, hwj.a());
                                    break block77;
                                }
                                catch (hxn hxn2) {
                                    a.as(dkc.a.h(), "failure reading proto", "com/google/android/libraries/performance/primes/persistent/PersistentStorage", "readProto", 'Q', "PersistentStorage.java", hxn2);
                                    break block78;
                                }
                            }
                            ((heg)((heg)dkc.a.h()).j("com/google/android/libraries/performance/primes/persistent/PersistentStorage", "readProto", 84, "PersistentStorage.java")).r("wrong header");
                        }
                    }
                    object2 = null;
                }
                dtm dtm2 = (dtm)object2;
                if (dtm2 == null) {
                    object2 = null;
                } else {
                    Object object10;
                    if ((dtm2.b & 0x20) != 0) {
                        object2 = object5 = kdc.b(dtm2.h);
                        if (object5 == null) {
                            object2 = kdc.a;
                        }
                        object5 = object2;
                    } else {
                        object5 = null;
                    }
                    object4 = object2 = dtm2.c;
                    if (object2 == null) {
                        object4 = kdm.a;
                    }
                    object3 = (dtm2.b & 2) != 0 ? Long.valueOf(dtm2.d) : null;
                    object7 = (dtm2.b & 4) != 0 ? Long.valueOf(dtm2.e) : null;
                    object6 = (dtm2.b & 8) != 0 ? Long.valueOf(dtm2.f) : null;
                    Long l2 = (dtm2.b & 0x10) != 0 ? Long.valueOf(dtm2.g) : null;
                    object9 = dtm2.b;
                    String string = (object9 & 0x40) != 0 ? dtm2.i : null;
                    if ((object9 & 0x100) != 0) {
                        object2 = object10 = dtm2.j;
                        if (object10 == null) {
                            object2 = kdo.a;
                        }
                    } else {
                        object2 = null;
                    }
                    object10 = (dtm2.b & 0x200) != 0 ? Integer.valueOf(dtm2.k) : null;
                    object2 = new dmk((kdm)object4, (Long)object3, (Long)object7, (Long)object6, l2, (kdc)object5, string, (kdo)object2, (Integer)object10);
                }
                // MONITOREXIT : dml2
                object4 = (dpi)this.f.b();
                ((djp)((dpi)object4).a).a();
                object5 = ((dpi)object4).d;
                long l3 = SystemClock.elapsedRealtime();
                object5 = ((dpi)object4).d;
                long l4 = cgw.p().toEpochMilli();
                object5 = ag$$ExternalSyntheticApiModelOutline1.m(((Context)((dpq)((dpi)object4).c).b).getSystemService("systemhealth"));
                object5 = object5 != null ? ag$$ExternalSyntheticApiModelOutline1.m((SystemHealthManager)object5) : null;
                ((djp)((dpi)object4).a).a();
                object5 = dly.x(l3, l4, (HealthStats)object5, (kdc)object, (dpi)object4);
                object = this.e;
                // MONITORENTER : object
                object3 = this.e;
                object4 = dtm.a.l();
                object7 = ((dmk)object5).a;
                if (object7 != null) {
                    if (!((hwp)object4).b.B()) {
                        ((hwp)object4).u();
                    }
                    object6 = (dtm)((hwp)object4).b;
                    ((dtm)object6).c = object7;
                    ((dtm)object6).b |= 1;
                }
                if ((object7 = ((dmk)object5).b) != null) {
                    l4 = (Long)object7;
                    if (!((hwp)object4).b.B()) {
                        ((hwp)object4).u();
                    }
                    object7 = (dtm)((hwp)object4).b;
                    ((dtm)object7).b |= 2;
                    ((dtm)object7).d = l4;
                }
                if ((object7 = ((dmk)object5).c) != null) {
                    l4 = (Long)object7;
                    if (!((hwp)object4).b.B()) {
                        ((hwp)object4).u();
                    }
                    object7 = (dtm)((hwp)object4).b;
                    ((dtm)object7).b |= 4;
                    ((dtm)object7).e = l4;
                }
                if ((object7 = ((dmk)object5).d) != null) {
                    l4 = (Long)object7;
                    if (!((hwp)object4).b.B()) {
                        ((hwp)object4).u();
                    }
                    object7 = (dtm)((hwp)object4).b;
                    ((dtm)object7).b |= 8;
                    ((dtm)object7).f = l4;
                }
                if ((object7 = ((dmk)object5).e) != null) {
                    l4 = (Long)object7;
                    if (!((hwp)object4).b.B()) {
                        ((hwp)object4).u();
                    }
                    object7 = (dtm)((hwp)object4).b;
                    ((dtm)object7).b |= 0x10;
                    ((dtm)object7).g = l4;
                }
                if ((object7 = ((dmk)object5).f) != null) {
                    object9 = ((kdc)object7).h;
                    if (!((hwp)object4).b.B()) {
                        ((hwp)object4).u();
                    }
                    object7 = (dtm)((hwp)object4).b;
                    ((dtm)object7).b |= 0x20;
                    ((dtm)object7).h = object9;
                }
                if ((object6 = ((dmk)object5).g) != null) {
                    if (!((hwp)object4).b.B()) {
                        ((hwp)object4).u();
                    }
                    object7 = (dtm)((hwp)object4).b;
                    ((dtm)object7).b |= 0x40;
                    ((dtm)object7).i = object6;
                }
                if ((object7 = ((dmk)object5).h) != null) {
                    if (!((hwp)object4).b.B()) {
                        ((hwp)object4).u();
                    }
                    object6 = (dtm)((hwp)object4).b;
                    ((dtm)object6).j = object7;
                    ((dtm)object6).b |= 0x100;
                }
                if ((object7 = ((dmk)object5).i) != null) {
                    object9 = (Integer)object7;
                    if (!((hwp)object4).b.B()) {
                        ((hwp)object4).u();
                    }
                    object7 = (dtm)((hwp)object4).b;
                    ((dtm)object7).b |= 0x200;
                    ((dtm)object7).k = object9;
                }
                object3 = ((dml)object3).a;
                object4 = (dtm)((hwp)object4).o();
                fxf.K(object4);
                object4 = object4.g();
                fpk.b();
                if (!crt.e((Context)((dsh)object3).a)) {
                    bl2 = false;
                } else {
                    object9 = ((Object)object4).length;
                    object7 = new byte[object9 + 1];
                    object7[0] = true;
                    System.arraycopy(object4, 0, object7, 1, object9);
                    bl2 = ((SharedPreferences)((dsh)object3).b.b()).edit().putString("primes.battery.snapshot", Base64.encodeToString((byte[])object7, (int)0)).commit();
                }
                object8 = false;
                // MONITOREXIT : object
                if (!bl2) {
                    this.c.b(this);
                    object = this.e;
                    // MONITORENTER : object
                    object2 = this.e.a;
                    fpk.b();
                    if (crt.e((Context)((dsh)object2).a)) {
                        ((SharedPreferences)((dsh)object2).b.b()).edit().remove("primes.battery.snapshot").commit();
                    }
                    // MONITOREXIT : object
                    throw new IOException("Failure storing persistent snapshot and helper data");
                }
                ((heg)((heg)dkc.a.e()).j("com/google/android/libraries/performance/primes/metrics/battery/BatteryMetricServiceImpl", "captureAndLog", 320, "BatteryMetricServiceImpl.java")).C("log start: %s\nend: %s", object2, object5);
                object = (dpi)this.f.b();
                if (object2 == null || !Objects.equals(((dmk)object2).d, object4 = ((dmk)object5).d) || !Objects.equals(((dmk)object2).e, ((dmk)object5).e) || (object3 = ((dmk)object2).b) == null || ((dmk)object2).c == null || (object4 = ((dmk)object5).b) == null || ((dmk)object5).c == null) break block80;
                long l5 = (Long)object4;
                l3 = (Long)object3;
                object3 = ((dmk)object5).c;
                object4 = ((dmk)object2).c;
                l4 = (Long)object3 - (Long)object4;
                if (l4 <= 0L || (l3 = Math.abs(l5 - l3 - l4)) >= 25L && !((double)l3 / (d2 = (double)l4) <= 3.472222222222222E-5)) break block80;
                object4 = ((dpi)object).c;
                object3 = dly.r(((dmk)object5).a, ((dmk)object2).a);
                if (object3 == null) {
                    object = null;
                } else {
                    object = (hwp)((hwv)object3).C(5);
                    ((hwp)object).x((hwv)object3);
                    object4 = ((dpq)object4).a;
                    DesugarCollections.unmodifiableList(((kdm)((hwp)object).b).h);
                    for (object9 = 0; object9 < ((kdm)((hwp)object).b).h.size(); ++object9) {
                        object3 = ((hwp)object).ae((int)object9);
                        ((hwp)object).au((int)object9, ((dmc)object4).c((kdl)object3));
                    }
                    DesugarCollections.unmodifiableList(((kdm)((hwp)object).b).i);
                    for (object9 = 0; object9 < ((kdm)((hwp)object).b).i.size(); ++object9) {
                        object3 = ((hwp)object).af((int)object9);
                        ((hwp)object).av((int)object9, ((dmc)object4).c((kdl)object3));
                    }
                    DesugarCollections.unmodifiableList(((kdm)((hwp)object).b).j);
                    for (object9 = 0; object9 < ((kdm)((hwp)object).b).j.size(); ++object9) {
                        object3 = ((hwp)object).ag((int)object9);
                        ((hwp)object).aw((int)object9, ((dmc)object4).c((kdl)object3));
                    }
                    DesugarCollections.unmodifiableList(((kdm)((hwp)object).b).k);
                    for (object9 = 0; object9 < ((kdm)((hwp)object).b).k.size(); ++object9) {
                        object3 = ((hwp)object).ad((int)object9);
                        ((hwp)object).at((int)object9, ((dmc)object4).c((kdl)object3));
                    }
                    DesugarCollections.unmodifiableList(((kdm)((hwp)object).b).l);
                    for (object9 = 0; object9 < ((kdm)((hwp)object).b).l.size(); ++object9) {
                        object3 = ((hwp)object).ac((int)object9);
                        ((hwp)object).as((int)object9, ((dmc)object4).c((kdl)object3));
                    }
                    DesugarCollections.unmodifiableList(((kdm)((hwp)object).b).m);
                    for (object9 = 0; object9 < ((kdm)((hwp)object).b).m.size(); ++object9) {
                        object3 = ((hwp)object).aa((int)object9);
                        ((hwp)object).aq((int)object9, ((dmc)object4).c((kdl)object3));
                    }
                    DesugarCollections.unmodifiableList(((kdm)((hwp)object).b).o);
                    for (object9 = (Object)object8; object9 < ((kdm)((hwp)object).b).o.size(); ++object9) {
                        object3 = ((hwp)object).ab((int)object9);
                        ((hwp)object).ar((int)object9, ((dmc)object4).c((kdl)object3));
                    }
                    object = (kdm)((hwp)object).o();
                }
                if (object == null) {
                    ((heg)((heg)dkc.a.c()).j("com/google/android/libraries/performance/primes/metrics/battery/BatteryCapture", "createBatteryMetric", 151, "BatteryCapture.java")).r("null diff");
                    object = var22_4;
                    break block79;
                } else if ((((kdm)object).b & 1) != 0 && ((kdm)object).d > 0L) {
                    object4 = kdd.a.l();
                    object7 = ((dmk)object5).b;
                    fxf.K(object7);
                    object3 = ((dmk)object2).b;
                    l4 = (Long)object7;
                    fxf.K(object3);
                    l3 = (Long)object3;
                    if (!((hwp)object4).b.B()) {
                        ((hwp)object4).u();
                    }
                    object3 = ((hwp)object4).b;
                    object7 = (kdd)object3;
                    ((kdd)object7).b |= 0x40;
                    ((kdd)object7).i = l4 - l3;
                    object7 = ((dmk)object2).f;
                    if (object7 != null) {
                        if (!((hwv)object3).B()) {
                            ((hwp)object4).u();
                        }
                        object3 = (kdd)((hwp)object4).b;
                        ((kdd)object3).c = ((kdc)object7).h;
                        ((kdd)object3).b |= 1;
                    }
                    if ((object7 = ((dmk)object2).g) != null) {
                        if (!((hwp)object4).b.B()) {
                            ((hwp)object4).u();
                        }
                        object3 = (kdd)((hwp)object4).b;
                        ((kdd)object3).b |= 8;
                        ((kdd)object3).f = object7;
                    }
                    if ((object3 = ((dmk)object2).h) != null) {
                        if (!((hwp)object4).b.B()) {
                            ((hwp)object4).u();
                        }
                        object7 = (kdd)((hwp)object4).b;
                        ((kdd)object7).g = object3;
                        ((kdd)object7).b |= 0x10;
                    }
                    if ((object3 = ((dmk)object5).f) != null) {
                        if (!((hwp)object4).b.B()) {
                            ((hwp)object4).u();
                        }
                        object7 = (kdd)((hwp)object4).b;
                        ((kdd)object7).h = ((kdc)object3).h;
                        ((kdd)object7).b |= 0x20;
                    }
                    if ((object3 = ((dmk)object5).b) != null) {
                        l4 = (Long)object3;
                        if (!((hwp)object4).b.B()) {
                            ((hwp)object4).u();
                        }
                        object3 = (kdd)((hwp)object4).b;
                        ((kdd)object3).b |= 0x100;
                        ((kdd)object3).k = l4;
                    }
                    if ((object2 = ((dmk)object2).i) != null && (object3 = ((dmk)object5).i) != null) {
                        object8 = (Integer)object3;
                        object9 = (Integer)object2;
                        if (!((hwp)object4).b.B()) {
                            ((hwp)object4).u();
                        }
                        l4 = (long)(object8 - object9);
                        object2 = (kdd)((hwp)object4).b;
                        ((kdd)object2).b |= 0x200;
                        ((kdd)object2).l = l4;
                    }
                    if (!((hwp)object4).b.B()) {
                        ((hwp)object4).u();
                    }
                    object2 = (kdd)((hwp)object4).b;
                    ((kdd)object2).j = object;
                    ((kdd)object2).b |= 0x80;
                    object = kfl.a.l();
                    object2 = kde.a.l();
                    if (!((hwp)object2).b.B()) {
                        ((hwp)object2).u();
                    }
                    object3 = (kde)((hwp)object2).b;
                    object4 = (kdd)((hwp)object4).o();
                    object4.getClass();
                    ((kde)object3).c = object4;
                    ((kde)object3).b |= 1;
                    if (!((hwp)object).b.B()) {
                        ((hwp)object).u();
                    }
                    object4 = (kfl)((hwp)object).b;
                    object2 = (kde)((hwp)object2).o();
                    object2.getClass();
                    ((kfl)object4).k = object2;
                    ((kfl)object4).b |= 0x100;
                    object = (kfl)((hwp)object).o();
                    break block79;
                } else {
                    ((heg)((heg)dkc.a.c()).j("com/google/android/libraries/performance/primes/metrics/battery/BatteryCapture", "createBatteryMetric", 155, "BatteryCapture.java")).r("invalid realtime");
                    object = var22_4;
                }
                break block79;
            }
            ((heg)((heg)dkc.a.c()).j("com/google/android/libraries/performance/primes/metrics/battery/BatteryCapture", "createBatteryMetric", 146, "BatteryCapture.java")).r("inconsistent stats");
            object = var22_4;
        }
        if (object == null) {
            return hpj.a;
        }
        object2 = this.g;
        object3 = ((dmk)object5).g;
        object4 = dmq.a();
        ((fhc)object4).b = object3;
        ((fhc)object4).g(true);
        ((fhc)object4).i((kfl)object);
        ((fhc)object4).d = ((dmk)object5).h;
        return ((dmt)object2).b(((fhc)object4).e());
    }

    public hpn J() {
        if (!crt.e(this.b)) {
            return hpj.a;
        }
        try {
            fxf.A(this.a.getAndSet(false));
            return this.M(kdc.b);
        }
        catch (Exception exception) {
            return hhk.J(exception);
        }
    }

    public hpn K() {
        if (!crt.e(this.b)) {
            return hpj.a;
        }
        if (this.a.getAndSet(true)) {
            ((heg)((heg)dkc.a.h()).j("com/google/android/libraries/performance/primes/metrics/battery/BatteryMetricServiceImpl", "onAppToForeground", 141, "BatteryMetricServiceImpl.java")).r("App is already in the foreground.");
            return hhk.I();
        }
        return this.M(kdc.c);
    }

    @Override
    public void L() {
        this.i.a(this);
        this.c.a(this);
    }

    @Override
    public void a(Activity activity, Bundle bundle) {
        if (!this.h.getAndSet(true)) {
            this.j(null);
        }
    }

    @Override
    public /* synthetic */ void b(Activity activity) {
    }

    @Override
    public /* synthetic */ void c(Activity activity) {
    }

    @Override
    public /* synthetic */ void d(Activity activity) {
    }

    @Override
    public /* synthetic */ void e(Activity activity, Bundle bundle) {
    }

    @Override
    public /* synthetic */ void f(Activity activity) {
    }

    @Override
    public /* synthetic */ void g(Activity activity) {
    }

    @Override
    public /* synthetic */ void h(int n2) {
    }

    @Override
    public void i(djt djt2) {
        this.J();
    }

    @Override
    public void j(djt djt2) {
        if (!this.a.get()) {
            this.K();
        }
    }
}

