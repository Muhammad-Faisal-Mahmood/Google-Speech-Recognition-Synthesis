/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.os.Bundle
 *  android.view.View
 *  android.view.ViewTreeObserver$OnDrawListener
 *  android.view.ViewTreeObserver$OnPreDrawListener
 */
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;

public final class dqx
implements Application.ActivityLifecycleCallbacks {
    public final Application a;
    public final dqy b;

    public dqx(dqy dqy2, Application application) {
        this.b = dqy2;
        this.a = application;
    }

    public final void onActivityCreated(Activity activity, Bundle object) {
        object = this.b.s.b == null ? this.b.s : this.b.t;
        object.a = activity.getClass().getSimpleName();
        object.b = dmz.a();
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onActivityResumed(Activity activity) {
        dqt dqt2 = this.b.t.b == null ? this.b.s : this.b.t;
        if (dqt2.d == null) {
            dqt2.d = dmz.a();
        }
        try {
            activity = activity.findViewById(0x1020002);
            dqt2 = activity.getViewTreeObserver();
            Object object = new dqu(this, (View)activity);
            dqt2.addOnDrawListener((ViewTreeObserver.OnDrawListener)object);
            object = new dqw(this, (View)activity);
            dqt2.addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)object);
            return;
        }
        catch (RuntimeException runtimeException) {
            return;
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity object) {
        object = this.b.t.b == null ? this.b.s : this.b.t;
        if (object.c == null) {
            object.c = dmz.a();
        }
    }

    public final void onActivityStopped(Activity activity) {
    }
}

