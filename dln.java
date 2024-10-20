/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.ComponentCallbacks2
 *  android.content.res.Configuration
 *  android.os.Bundle
 */
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class dln
implements Application.ActivityLifecycleCallbacks,
ComponentCallbacks2 {
    public static final int c = 0;
    public final List a = new CopyOnWriteArrayList();
    public final AtomicInteger b;
    private final AtomicInteger d = new AtomicInteger();
    private final AtomicInteger e = new AtomicInteger();
    private final AtomicInteger f;
    private final AtomicInteger g;
    private final AtomicInteger h;
    private boolean i = false;
    private final dmr j;

    public dln(dmr dmr2) {
        this.b = new AtomicInteger();
        this.f = new AtomicInteger();
        this.g = new AtomicInteger();
        this.h = new AtomicInteger();
        this.j = dmr2;
    }

    private final void a() {
        block2: {
            dmr dmr2;
            block4: {
                block3: {
                    if (this.i || this.d.get() != 0) break block2;
                    dmr2 = this.j;
                    if (dmr.b()) break block3;
                    ((heg)((heg)dkc.a.h()).j("com/google/android/libraries/performance/primes/CrashOnBadPrimesConfiguration", "observedOutOfOrderLifecycleEvent", 43, "CrashOnBadPrimesConfiguration.java")).u("Primes did not observe lifecycle events in the expected order. %s is not initializing in Application#onCreate", dmr2.a);
                    if (!dmr2.a()) break block4;
                }
                this.i = true;
                return;
            }
            throw new IllegalStateException(String.format("Primes did not observe lifecycle events in the expected order. %s is not initializing in Application#onCreate", dmr2.a));
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.d.incrementAndGet();
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((dll)iterator.next()).a(activity, bundle);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        if (this.h.getAndIncrement() == 0) {
            this.a();
        }
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((dll)iterator.next()).b(activity);
        }
    }

    public final void onActivityPaused(Activity activity) {
        if (this.f.getAndIncrement() == 0) {
            this.a();
        }
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((dll)iterator.next()).c(activity);
        }
    }

    public final void onActivityResumed(Activity activity) {
        if (this.b.getAndIncrement() == 0) {
            this.a();
        }
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((dll)iterator.next()).d(activity);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((dll)iterator.next()).e(activity, bundle);
        }
    }

    public final void onActivityStarted(Activity activity) {
        if (this.e.getAndIncrement() == 0) {
            this.a();
        }
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((dll)iterator.next()).f(activity);
        }
    }

    public final void onActivityStopped(Activity activity) {
        if (this.g.getAndIncrement() == 0) {
            this.a();
        }
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((dll)iterator.next()).g(activity);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int n2) {
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((dll)iterator.next()).h(n2);
        }
    }
}

