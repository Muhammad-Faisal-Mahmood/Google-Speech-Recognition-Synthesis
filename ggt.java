/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.os.Bundle
 *  android.os.Looper
 *  android.os.MessageQueue$IdleHandler
 */
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;

public final class ggt
implements Application.ActivityLifecycleCallbacks {
    final Object a;
    private final int b;

    public ggt(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (this.b != 0) {
            return;
        }
        jse.e(activity, "activity");
        ((ggv)this.a).b.add(activity);
    }

    public final void onActivityDestroyed(Activity activity) {
        if (this.b != 0) {
            return;
        }
        jse.e(activity, "activity");
        ((ggv)this.a).b.remove(activity);
    }

    public final void onActivityPaused(Activity activity) {
        if (this.b != 0) {
            return;
        }
        jse.e(activity, "activity");
    }

    public final void onActivityResumed(Activity activity) {
        if (this.b != 0) {
            return;
        }
        jse.e(activity, "activity");
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (this.b != 0) {
            return;
        }
        jse.e(activity, "activity");
        jse.e(bundle, "outState");
    }

    public final void onActivityStarted(Activity object) {
        if (this.b != 0) {
            int n2;
            object = (gbb)this.a;
            ((gbb)object).b = n2 = ((gbb)object).b + 1;
            if (n2 == 1) {
                ((gbb)object).a(true);
            }
            return;
        }
        jse.e(object, "activity");
        ((ggv)this.a).c.add(object);
    }

    public final void onActivityStopped(Activity object) {
        if (this.b != 0) {
            int n2;
            gbb gbb2 = (gbb)this.a;
            gbb2.b = n2 = gbb2.b - 1;
            if (n2 == 0 && !object.isChangingConfigurations()) {
                ((gbb)this.a).a(false);
            }
            return;
        }
        jse.e(object, "activity");
        ((ggv)this.a).c.remove(object);
        fpk.c();
        Object object2 = this.a;
        object = (ggv)object2;
        if (!((ggv)object).a && ((ggv)object).c.isEmpty() && ((ggv)object).a()) {
            object = Looper.myQueue();
            object2 = new ggs(object2, 0);
            long l2 = gqk.a;
            object.addIdleHandler((MessageQueue.IdleHandler)new gqb(gno.d(), (MessageQueue.IdleHandler)object2));
        }
    }
}

