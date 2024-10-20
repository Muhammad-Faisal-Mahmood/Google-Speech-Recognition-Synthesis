/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application$ActivityLifecycleCallbacks
 */
import android.app.Application;
import java.io.IOException;
import java.util.Set;
import java.util.UUID;

public final class ggk
implements gte {
    public final Object a;
    private final int b;

    public /* synthetic */ ggk(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    @Override
    public final Object apply(Object object2) {
        switch (this.b) {
            default: {
                object2 = (Application.ActivityLifecycleCallbacks)object2;
                return new gpi((gpm)this.a, (Application.ActivityLifecycleCallbacks)object2);
            }
            case 8: {
                object2 = (UUID)object2;
                heg heg2 = (heg)((heg)glx.a.c()).j("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerPeriodicScheduler", "scheduleWorker", 179, "SyncWorkManagerPeriodicScheduler.java");
                object2 = (glj)this.a;
                heg2.B("Scheduled worker: %s at %s", ((glj)object2).a, ((glj)object2).b);
                return null;
            }
            case 7: {
                object2 = (UUID)object2;
                heg heg3 = (heg)((heg)glv.a.c()).j("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerOneTimeScheduler", "scheduleWorker", 119, "SyncWorkManagerOneTimeScheduler.java");
                object2 = (glj)this.a;
                heg3.B("Scheduled worker: %s at %s", ((glj)object2).a, ((glj)object2).b);
                return null;
            }
            case 6: {
                object2 = (Set)object2;
                ((gld)this.a).i((Set)object2);
                return null;
            }
            case 5: {
                hwv hwv2;
                Long l2 = (Long)object2;
                ot ot2 = new ot();
                object2 = gmk.a;
                object2 = this.a;
                try {
                    hwv2 = ((gky)object2).a();
                }
                catch (IOException iOException) {
                    ((gky)object2).h(iOException);
                }
                for (Object object2 : hwv2.d) {
                    long l3 = ((gmj)object2).e;
                    hwv2 = ((gmj)object2).c;
                    object2 = hwv2;
                    if (hwv2 == null) {
                        object2 = gmm.a;
                    }
                    object2 = new gli((gmm)object2);
                    if (l3 <= 0L) {
                        l3 = l2;
                    }
                    ot2.put(object2, (Object)l3);
                }
                return ot2;
            }
            case 4: {
                gpm gpm2 = ghl.j;
                return this.a.a(object2);
            }
            case 3: {
                gpm gpm3 = ghl.j;
                return this.a.a(object2);
            }
            case 2: {
                gpm gpm4 = ghl.j;
                return this.a.a(object2);
            }
            case 1: {
                return this.a.a(object2);
            }
            case 0: 
        }
        return this.a.a(object2);
    }
}

