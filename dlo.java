/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;

final class dlo
extends dlp {
    final dlq a;

    public dlo(dlq dlq2) {
        this.a = dlq2;
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        int n2;
        Object object = this.a;
        ((dlq)object).b = n2 = ((dlq)object).b - 1;
        if (n2 == 0) {
            ((dlq)object).h = djt.b(activity.getClass());
            activity = this.a.e;
            fvd.ao(activity);
            object = this.a.f;
            fvd.ao(object);
            activity.postDelayed((Runnable)object, 700L);
        }
    }

    @Override
    public final void onActivityResumed(Activity object) {
        int n2;
        Object object2 = this.a;
        ((dlq)object2).b = n2 = ((dlq)object2).b + 1;
        if (n2 == 1) {
            if (((dlq)object2).c) {
                object2 = ((dlq)object2).g.iterator();
                while (object2.hasNext()) {
                    ((dld)object2.next()).l(djt.b(object.getClass()));
                }
                this.a.c = false;
                return;
            }
            object2 = ((dlq)object2).e;
            fvd.ao(object2);
            object = this.a.f;
            fvd.ao(object);
            object2.removeCallbacks((Runnable)object);
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        int n2;
        dlq dlq2 = this.a;
        dlq2.a = n2 = dlq2.a + 1;
        if (n2 == 1 && dlq2.d) {
            for (dld dld2 : dlq2.g) {
                djt.b(activity.getClass());
            }
            this.a.d = false;
        }
    }

    @Override
    public final void onActivityStopped(Activity activity) {
        dlq dlq2 = this.a;
        --dlq2.a;
        djt.b(activity.getClass());
        dlq2.a();
    }
}

