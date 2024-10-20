/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.os.Bundle
 *  android.os.SystemClock
 */
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;

public final class giw
implements Application.ActivityLifecycleCallbacks {
    public final void onActivityCreated(Activity activity, Bundle object) {
        if (activity instanceof ggz) {
            object = dqy.a;
            long l2 = ((ggz)activity).p();
            dmz dmz2 = new dmz(l2, l2);
            dmz dmz3 = object.s.b;
            if (fpk.g() && object.g != null && dmz2.a <= SystemClock.elapsedRealtime() && (dmz3 == null || dmz2.a <= dmz3.a) && object.l == null) {
                object.l = dmz2;
            }
        }
        activity.getApplication().unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)this);
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}

