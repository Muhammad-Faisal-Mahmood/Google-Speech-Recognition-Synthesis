/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.os.Bundle
 */
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

final class giz
implements Application.ActivityLifecycleCallbacks {
    final AtomicBoolean a;
    final Application b;

    public giz(AtomicBoolean atomicBoolean, Application application) {
        this.a = atomicBoolean;
        this.b = application;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.a.set(false);
        this.b.unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)this);
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

