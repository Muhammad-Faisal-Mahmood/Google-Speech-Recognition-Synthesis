/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 *  android.os.Handler
 *  android.view.Window
 */
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

final class dpp
implements dll {
    private final Window$OnFrameMetricsAvailableListener a;
    private final iku b;
    private Activity c;
    private boolean d;
    private final Set e = Collections.newSetFromMap(new WeakHashMap());

    public dpp(iku iku2, hpr hpr2, Window$OnFrameMetricsAvailableListener window$OnFrameMetricsAvailableListener) {
        this.a = window$OnFrameMetricsAvailableListener;
        this.b = iku2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void k() {
        synchronized (this) {
            Activity activity = this.c;
            if (activity != null && this.e.add(activity.getWindow())) {
                ag$$ExternalSyntheticApiModelOutline1.m(activity.getWindow(), this.a, (Handler)this.b.b());
                return;
            }
            ((heg)((heg)dkc.a.c()).j("com/google/android/libraries/performance/primes/metrics/jank/WindowTracker", "attachToCurrentActivity", 91, "WindowTracker.java")).r("Activity is null or already being tracked");
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void l(Activity activity) {
        synchronized (this) {
            if (activity != null && this.e.remove(activity.getWindow())) {
                activity = activity.getWindow();
                try {
                    ag$$ExternalSyntheticApiModelOutline1.m((Window)activity, this.a);
                    return;
                }
                catch (RuntimeException runtimeException) {
                    a.as(dkc.a.h(), "Failed to detach the frame metrics listener", "com/google/android/libraries/performance/primes/metrics/jank/WindowTracker", "detachFromActivity", 'm', "WindowTracker.java", runtimeException);
                    return;
                }
            }
            ((heg)((heg)dkc.a.c()).j("com/google/android/libraries/performance/primes/metrics/jank/WindowTracker", "detachFromActivity", 101, "WindowTracker.java")).r("Activity is null or isn't being tracked");
            return;
        }
    }

    @Override
    public /* synthetic */ void a(Activity activity, Bundle bundle) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void b(Activity activity) {
        synchronized (this) {
            this.l(activity);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void c(Activity activity) {
        synchronized (this) {
            this.c = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void d(Activity activity) {
        synchronized (this) {
            this.c = activity;
            if (this.d) {
                this.k();
            }
            return;
        }
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void i() {
        synchronized (this) {
            this.d = true;
            this.k();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void j() {
        synchronized (this) {
            this.d = false;
            return;
        }
    }
}

