/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.ComponentCallbacks2
 *  android.content.res.Configuration
 *  android.os.Bundle
 *  android.os.Handler
 */
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

public final class cdk
implements Application.ActivityLifecycleCallbacks,
ComponentCallbacks2 {
    public static final cdk a = new cdk();
    public final AtomicBoolean b = new AtomicBoolean();
    public final AtomicBoolean c = new AtomicBoolean();
    public final ArrayList d = new ArrayList();
    public boolean e = false;

    private cdk() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void a(boolean bl2) {
        cdk cdk2 = a;
        synchronized (cdk2) {
            Iterator iterator = this.d.iterator();
            while (iterator.hasNext()) {
                Handler handler = ((cea)((AmbientMode$AmbientController)iterator.next()).a).m;
                handler.sendMessage(handler.obtainMessage(1, (Object)bl2));
            }
            return;
        }
    }

    public final void onActivityCreated(Activity object, Bundle bundle) {
        object = this.c;
        boolean bl2 = this.b.compareAndSet(true, false);
        ((AtomicBoolean)object).set(true);
        if (bl2) {
            this.a(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity object) {
        object = this.c;
        boolean bl2 = this.b.compareAndSet(true, false);
        ((AtomicBoolean)object).set(true);
        if (bl2) {
            this.a(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int n2) {
        if (n2 == 20 && this.b.compareAndSet(false, true)) {
            this.c.set(true);
            this.a(true);
        }
    }
}

