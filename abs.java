/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.os.Bundle
 */
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

public final class abs
implements Application.ActivityLifecycleCallbacks {
    public static final abr Companion = new abr();

    public static final void registerIn(Activity activity) {
        abr.a(activity);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        jse.e(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        jse.e(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        jse.e(activity, "activity");
    }

    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        jse.e(activity, "activity");
        int n2 = abt.a;
        wd.l(activity, aaz.ON_CREATE);
    }

    public void onActivityPostResumed(Activity activity) {
        jse.e(activity, "activity");
        int n2 = abt.a;
        wd.l(activity, aaz.ON_RESUME);
    }

    public void onActivityPostStarted(Activity activity) {
        jse.e(activity, "activity");
        int n2 = abt.a;
        wd.l(activity, aaz.ON_START);
    }

    public void onActivityPreDestroyed(Activity activity) {
        jse.e(activity, "activity");
        int n2 = abt.a;
        wd.l(activity, aaz.ON_DESTROY);
    }

    public void onActivityPrePaused(Activity activity) {
        jse.e(activity, "activity");
        int n2 = abt.a;
        wd.l(activity, aaz.ON_PAUSE);
    }

    public void onActivityPreStopped(Activity activity) {
        jse.e(activity, "activity");
        int n2 = abt.a;
        wd.l(activity, aaz.ON_STOP);
    }

    public void onActivityResumed(Activity activity) {
        jse.e(activity, "activity");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        jse.e(activity, "activity");
        jse.e(bundle, "bundle");
    }

    public void onActivityStarted(Activity activity) {
        jse.e(activity, "activity");
    }

    public void onActivityStopped(Activity activity) {
        jse.e(activity, "activity");
    }
}

