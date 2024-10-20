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

public final class dxb
implements Application.ActivityLifecycleCallbacks {
    boolean a;
    final Application b;
    final jnu c;
    final gto d;

    public dxb(Application application, jnu jnu2, gto gto2) {
        this.b = application;
        this.c = jnu2;
        this.d = gto2;
        this.a = false;
    }

    private final gzx a() {
        if (!this.a) {
            this.a = true;
            this.b.unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)this);
            Object object = ((imj)this.c).a();
            gzs gzs2 = gzx.g(object.size());
            object = object.iterator();
            while (object.hasNext()) {
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks)object.next();
                activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks)((gte)((gtt)this.d).a).apply(activityLifecycleCallbacks);
                this.b.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                gzs2.h(activityLifecycleCallbacks);
            }
            return gzs2.g();
        }
        int n2 = gzx.d;
        return hct.a;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        gzx gzx2 = this.a();
        int n2 = ((hct)gzx2).c;
        for (int i2 = 0; i2 < n2; ++i2) {
            ((Application.ActivityLifecycleCallbacks)gzx2.get(i2)).onActivityCreated(activity, bundle);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        fxf.A(this.a);
    }

    public final void onActivityPaused(Activity activity) {
        fxf.A(this.a);
    }

    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        gzx gzx2 = this.a();
        int n2 = ((hct)gzx2).c;
        for (int i2 = 0; i2 < n2; ++i2) {
            dp$$ExternalSyntheticApiModelOutline0.m((Application.ActivityLifecycleCallbacks)gzx2.get(i2), activity, bundle);
        }
    }

    public final void onActivityResumed(Activity activity) {
        fxf.A(this.a);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        fxf.A(this.a);
    }

    public final void onActivityStarted(Activity activity) {
        fxf.A(this.a);
    }

    public final void onActivityStopped(Activity activity) {
        fxf.A(this.a);
    }
}

