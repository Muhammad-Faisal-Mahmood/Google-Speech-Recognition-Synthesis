/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.SystemClock
 *  android.util.ArrayMap
 */
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.util.ArrayMap;
import android.view.Window$OnFrameMetricsAvailableListener;
import java.util.concurrent.Executor;

public final class doz
extends dpf
implements dle,
dmw {
    private final Context a;
    private final dlm b;
    private final dpp c;
    private final dow d;
    private final doy e;
    private final ArrayMap f;
    private final dmt g;
    private final jnu h;
    private final dpi i;

    public doz(dmu object, Context object2, dlm object3, iku iku2, dow dow2, jnu jnu2, jnu jnu3, Executor executor, dpq dpq2, jnu jnu4, dpg dpg2, dpi dpi2) {
        dpg2 = new ArrayMap();
        this.f = dpg2;
        fxf.A(true);
        this.g = ((dmu)object).a(executor, iku2, jnu3);
        this.a = object2;
        this.b = object3;
        this.h = jnu2;
        this.d = dow2;
        this.e = object = new doy((Context)object2, (ArrayMap)dpg2, jnu4);
        object2 = dpq2.a.b();
        object2.getClass();
        object3 = (hpr)dpq2.b.b();
        object3.getClass();
        this.c = new dpp((iku)object2, (hpr)object3, (Window$OnFrameMetricsAvailableListener)object);
        this.i = dpi2;
    }

    @Override
    public void L() {
        this.b.a(this.c);
        this.b.a(this.d);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public hpn a(Activity object) {
        Object object2;
        Object object3;
        int n2;
        object = dpl.a((Activity)object);
        Object object4 = gsl.a;
        dpd dpd2 = new dpd((dpl)object, (gto)object4, (gto)object4);
        if (!this.g.d()) {
            return hpj.a;
        }
        object = this.f;
        // MONITORENTER : object
        object4 = (dpb)this.f.remove((Object)dpd2.a);
        if (this.f.isEmpty()) {
            this.c.j();
        }
        // MONITOREXIT : object
        if (object4 == null) {
            ((heg)((heg)dkc.a.f()).j("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "stopAsFuture", 199, "FrameMetricServiceImpl.java")).u("Measurement not found: %s", new dlb(dpd2.a.a));
            return hpj.a;
        }
        Object object52 = this.i;
        object = dpd2.a.b();
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 0;
        if (n3 >= 29 && dp$$ExternalSyntheticApiModelOutline0.m$1()) {
            dp$$ExternalSyntheticApiModelOutline0.m(String.format("J<%s>", object), 352691800);
            block12: for (Object object52 : ((dpo)((dpi)object52).a.b()).c) {
                n3 = n2 = a.B(((dpm)object52).b);
                if (n2 == 0) {
                    n3 = 1;
                }
                switch (n3 - 1) {
                    default: {
                        ((heg)((heg)dkc.a.c()).j("com/google/android/libraries/performance/primes/metrics/jank/JankPerfettoTrigger", "endTraceSectionAndEmitCounters", 149, "JankPerfettoTrigger.java")).u("UNKNOWN COUNTER with %s as the name", ((dpm)object52).c);
                        continue block12;
                    }
                    case 7: {
                        n3 = ((dpb)object4).m;
                        break;
                    }
                    case 6: {
                        n3 = ((dpb)object4).k;
                        break;
                    }
                    case 5: {
                        n3 = ((dpb)object4).j;
                        break;
                    }
                    case 4: {
                        n3 = ((dpb)object4).i;
                        break;
                    }
                    case 3: {
                        n3 = ((dpb)object4).h;
                        break;
                    }
                    case 2: {
                        n3 = ((dpb)object4).f;
                        break;
                    }
                    case 1: {
                        n3 = 0;
                    }
                }
                dp$$ExternalSyntheticApiModelOutline0.m(((dpm)object52).c.replace("%EVENT_NAME%", (CharSequence)object), (long)n3);
            }
        }
        if (((dpb)object4).h == 0) {
            return hpj.a;
        }
        object = this.i;
        if (((dpo)((dpi)object).a.b()).d) {
            object52 = (dpe)((dpi)object).c.b();
            object52 = gsl.a;
            object3 = 9L;
            ((gto)object52).e(object3);
            object3.getClass();
            if ((long)((dpb)object4).m <= 9L && ((dpb)object4).f != 0) {
                object52 = (dna)((dpi)object).b.b();
                object2 = ((dpi)object).a;
                object3 = gsl.a;
                object = ((dpo)object2.b()).b.replace("%PACKAGE_NAME%", ((Context)((dpi)object).d).getPackageName());
                ((gto)object3).e(object);
                ((dna)object52).a((String)object);
            }
        }
        long l2 = ((dpb)object4).c;
        long l3 = SystemClock.elapsedRealtime();
        object52 = kff.a.l();
        if (!((hwp)object52).b.B()) {
            ((hwp)object52).u();
        }
        n3 = (int)(l3 - l2);
        object3 = ((hwp)object52).b;
        object = (kff)object3;
        ((kff)object).b |= 0x10;
        ((kff)object).g = n3 + 1;
        n3 = ((dpb)object4).f;
        if (!((hwv)object3).B()) {
            ((hwp)object52).u();
        }
        object3 = ((hwp)object52).b;
        object = (kff)object3;
        ((kff)object).b |= 1;
        ((kff)object).c = n3;
        n3 = ((dpb)object4).h;
        if (!((hwv)object3).B()) {
            ((hwp)object52).u();
        }
        object = ((hwp)object52).b;
        object3 = (kff)object;
        ((kff)object3).b |= 2;
        ((kff)object3).d = n3;
        n3 = ((dpb)object4).i;
        if (!((hwv)object).B()) {
            ((hwp)object52).u();
        }
        object3 = ((hwp)object52).b;
        object = (kff)object3;
        ((kff)object).b |= 4;
        ((kff)object).e = n3;
        n3 = ((dpb)object4).k;
        if (!((hwv)object3).B()) {
            ((hwp)object52).u();
        }
        object3 = ((hwp)object52).b;
        object = (kff)object3;
        ((kff)object).b |= 0x20;
        ((kff)object).h = n3;
        n3 = ((dpb)object4).m;
        if (!((hwv)object3).B()) {
            ((hwp)object52).u();
        }
        object = ((hwp)object52).b;
        object3 = (kff)object;
        ((kff)object3).b |= 0x40;
        ((kff)object3).i = n3;
        n3 = ((dpb)object4).j;
        if (!((hwv)object).B()) {
            ((hwp)object52).u();
        }
        object = (kff)((hwp)object52).b;
        ((kff)object).b |= 8;
        ((kff)object).f = n3;
        n2 = ((dpb)object4).n;
        n3 = n4;
        if (n2 != Integer.MIN_VALUE) {
            block46: {
                object = ((dpb)object4).e;
                object2 = dpb.b;
                object3 = kfi.a.l();
                for (n3 = 0; n3 < 52; ++n3) {
                    if (object2[n3] > n2) {
                        ((hwp)object3).ay(0);
                        ((hwp)object3).ax(n2 + 1);
                        object = (kfi)((hwp)object3).o();
                        break block46;
                    }
                    Activity activity = object[n3];
                    if (activity <= 0 && (n3 <= 0 || object[n3 - 1] <= 0)) continue;
                    ((hwp)object3).ay((int)activity);
                    ((hwp)object3).ax((int)object2[n3]);
                }
                if (object[51] > 0) {
                    ((hwp)object3).ax(n2 + 1);
                    ((hwp)object3).ay(0);
                }
                object = (kfi)((hwp)object3).o();
            }
            if (!((hwp)object52).b.B()) {
                ((hwp)object52).u();
            }
            object3 = ((hwp)object52).b;
            object2 = (kff)object3;
            object.getClass();
            ((kff)object2).o = object;
            ((kff)object2).b |= 0x800;
            n3 = ((dpb)object4).g;
            if (!((hwv)object3).B()) {
                ((hwp)object52).u();
            }
            object3 = ((hwp)object52).b;
            object = (kff)object3;
            ((kff)object).b |= 0x200;
            ((kff)object).m = n3;
            n3 = ((dpb)object4).l;
            if (!((hwv)object3).B()) {
                ((hwp)object52).u();
            }
            object = (kff)((hwp)object52).b;
            ((kff)object).b |= 0x400;
            ((kff)object).n = n3;
            n3 = n4;
        }
        while (n3 < 28) {
            n4 = n3 + 1;
            if (((dpb)object4).d[n3] > 0) {
                object = kfe.a.l();
                n2 = ((dpb)object4).d[n3];
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                object3 = ((hwp)object).b;
                object2 = (kfe)object3;
                ((kfe)object2).b |= 1;
                ((kfe)object2).c = n2;
                n3 = dpb.a[n3];
                if (!((hwv)object3).B()) {
                    ((hwp)object).u();
                }
                object2 = ((hwp)object).b;
                object3 = (kfe)object2;
                ((kfe)object3).b |= 2;
                ((kfe)object3).d = n3;
                if (n4 < 28) {
                    n3 = dpb.a[n4];
                    if (!((hwv)object2).B()) {
                        ((hwp)object).u();
                    }
                    object3 = (kfe)((hwp)object).b;
                    ((kfe)object3).b |= 4;
                    ((kfe)object3).e = n3 - 1;
                }
                if (!((hwp)object52).b.B()) {
                    ((hwp)object52).u();
                }
                object3 = (kff)((hwp)object52).b;
                object2 = (kfe)((hwp)object).o();
                object2.getClass();
                object = ((kff)object3).k;
                if (!object.c()) {
                    ((kff)object3).k = hwv.s((hxk)object);
                }
                ((kff)object3).k.add(object2);
            }
            n3 = n4;
        }
        object4 = (kff)((hwp)object52).o();
        object52 = dox.a(this.a);
        object = object4;
        if (((gto)object52).g()) {
            object = (hwp)((hwv)object4).C(5);
            ((hwp)object).x((hwv)object4);
            n3 = ((Float)((gto)object52).c()).intValue();
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            object4 = (kff)((hwp)object).b;
            ((kff)object4).b |= 0x100;
            ((kff)object4).l = n3;
            object = (kff)((hwp)object).o();
        }
        object4 = kfl.a.l();
        if (!((hwp)object4).b.B()) {
            ((hwp)object4).u();
        }
        object52 = (kfl)((hwp)object4).b;
        object.getClass();
        ((kfl)object52).l = object;
        ((kfl)object52).b |= 0x400;
        object4 = (kfl)((hwp)object4).o();
        object = this.g;
        object52 = dmq.a();
        ((fhc)object52).i((kfl)object4);
        ((fhc)object52).d = null;
        ((fhc)object52).c = "Activity";
        ((fhc)object52).b = dpd2.a.b();
        ((fhc)object52).g(true);
        return ((dmt)object).b(((fhc)object52).e());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(Activity object) {
        Object object2 = dpl.a(object);
        if (!this.g.c((String)(object = ((dpl)object2).b()))) {
            return;
        }
        object = this.f;
        synchronized (object) {
            if (this.f.size() >= 25) {
                ((heg)((heg)dkc.a.h()).j("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "start", 149, "FrameMetricServiceImpl.java")).u("Too many concurrent measurements, ignoring %s", object2);
                return;
            }
            dpb dpb2 = (dpb)this.f.put(object2, (Object)((dpc)this.h).a());
            if (dpb2 != null) {
                this.f.put(object2, (Object)dpb2);
                ((heg)((heg)dkc.a.h()).j("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "start", 162, "FrameMetricServiceImpl.java")).u("measurement already started: %s", object2);
                return;
            }
            if (this.f.size() == 1) {
                this.c.i();
            }
            object2 = ((dpl)object2).b();
            if (Build.VERSION.SDK_INT >= 29 && dp$$ExternalSyntheticApiModelOutline0.m$1()) {
                dp$$ExternalSyntheticApiModelOutline0.m$1(String.format("J<%s>", object2), 352691800);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void i(djt djt2) {
        djt2 = this.f;
        synchronized (djt2) {
            this.f.clear();
            return;
        }
    }

    @Override
    public /* synthetic */ void j(djt djt2) {
    }
}

