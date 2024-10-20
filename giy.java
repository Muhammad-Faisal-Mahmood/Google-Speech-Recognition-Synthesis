/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 */
import android.app.Application;
import java.util.concurrent.atomic.AtomicBoolean;

public final class giy
implements dxe {
    public final Application a;
    public final Application.ActivityLifecycleCallbacks b;
    public final AtomicBoolean c;
    public final long d;

    public /* synthetic */ giy(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks, AtomicBoolean atomicBoolean, long l2) {
        this.a = application;
        this.b = activityLifecycleCallbacks;
        this.c = atomicBoolean;
        this.d = l2;
    }

    @Override
    public final void a() {
        Application application = this.a;
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        long l2 = this.d;
        fpk.e(new gja(this.c, application, activityLifecycleCallbacks, l2, 0));
    }
}

