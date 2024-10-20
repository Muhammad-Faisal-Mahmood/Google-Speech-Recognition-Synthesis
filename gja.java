/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.os.SystemClock
 */
import android.app.Application;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class gja
implements Runnable {
    final long a;
    final Object b;
    final Object c;
    final Object d;
    private final int e;

    public gja(Runnable runnable, hpr hpr2, long l2, TimeUnit timeUnit, int n2) {
        this.e = n2;
        this.c = runnable;
        this.d = hpr2;
        this.a = l2;
        this.b = timeUnit;
    }

    public gja(AtomicBoolean atomicBoolean, Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks, long l2, int n2) {
        this.e = n2;
        this.b = atomicBoolean;
        this.c = application;
        this.d = activityLifecycleCallbacks;
        this.a = l2;
    }

    @Override
    public final void run() {
        if (this.e != 0) {
            this.c.run();
            dww.c(this.d.b(this, this.a, (TimeUnit)((Object)this.b)));
            return;
        }
        if (((AtomicBoolean)this.b).get()) {
            Object object = this.c;
            Object object2 = this.d;
            ((Application)object).unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)object2);
            long l2 = this.a;
            long l3 = SystemClock.elapsedRealtime();
            djv.a().a.f(new djt("ColdLaunchBackground"), l2, l3);
            djv.a().a.g(new djt("ColdLaunchBackgroundMemory"));
        }
    }
}

