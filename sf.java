/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.os.Bundle
 *  android.util.Log
 */
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

public final class sf
implements Application.ActivityLifecycleCallbacks {
    public Object a;
    private Activity b;
    private final int c;
    private boolean d = false;
    private boolean e = false;
    private boolean f = false;

    public sf(Activity activity) {
        this.b = activity;
        this.c = activity.hashCode();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        if (this.b == activity) {
            this.b = null;
            this.e = true;
        }
    }

    public final void onActivityPaused(Activity activity) {
        block5: {
            if (this.e && !this.f && !this.d) {
                Object object = this.a;
                int n2 = this.c;
                Object object2 = sg.b;
                object2 = sg.c.get(activity);
                if (object2 != object) break block5;
                try {
                    if (activity.hashCode() == n2) {
                        object = sg.b.get(activity);
                        activity = sg.g;
                        aj aj2 = new aj(object, object2, 14, null);
                        activity.postAtFrontOfQueue((Runnable)aj2);
                        this.f = true;
                        this.a = null;
                        return;
                    }
                }
                catch (Throwable throwable) {
                    Log.e((String)"ActivityRecreator", (String)"Exception while fetching field values", (Throwable)throwable);
                }
            }
        }
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        if (this.b == activity) {
            this.d = true;
        }
    }

    public final void onActivityStopped(Activity activity) {
    }
}

