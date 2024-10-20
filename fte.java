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
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public final class fte
implements Application.ActivityLifecycleCallbacks,
fta {
    private static final long g = TimeUnit.MINUTES.toMillis(1L);
    public final ScheduledExecutorService a;
    public ftc b;
    public final long c;
    public final AtomicLong d = new AtomicLong(0L);
    public ScheduledFuture e;
    protected final Object f;
    private final ftb h;

    private fte(ftc ftc2, ScheduledExecutorService scheduledExecutorService, ftb ftb2) {
        this.b = ftc2;
        this.a = scheduledExecutorService;
        this.h = ftb2;
        this.c = g;
        this.f = new Object();
    }

    public static fte b(ftc object, ScheduledExecutorService scheduledExecutorService, ftb ftb2, Application application) {
        object = new fte((ftc)object, scheduledExecutorService, ftb2);
        if (application != null) {
            application.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)object);
        }
        ftb2.a = object;
        return object;
    }

    @Override
    public final void a(ftc ftc2) {
        this.b = ftc2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() {
        Object object = this.f;
        synchronized (object) {
            ScheduledFuture scheduledFuture = this.e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.e = null;
            }
            return;
        }
    }

    public final void d() {
        this.d.set(0L);
        this.b.a(this.h);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onActivityPaused(Activity activity) {
        Object object = this.f;
        synchronized (object) {
            this.d();
            this.c();
            return;
        }
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

