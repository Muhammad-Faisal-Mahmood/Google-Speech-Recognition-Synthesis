/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 */
import android.app.Activity;
import android.os.Bundle;
import java.util.concurrent.Executor;

public final class dow
implements dll {
    private final iku a;
    private boolean b = false;
    private Activity c;

    public dow(iku iku2, gto gto2, Executor executor) {
        this.a = iku2;
        executor.execute(new dov(this, gto2));
    }

    @Override
    public /* synthetic */ void a(Activity activity, Bundle bundle) {
    }

    @Override
    public /* synthetic */ void b(Activity activity) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void c(Activity activity) {
        synchronized (this) {
            if (this.b) {
                ((doz)this.a.b()).a(activity);
            } else if (!activity.equals(this.c)) {
                ((heg)((heg)dkc.a.c()).j("com/google/android/libraries/performance/primes/metrics/jank/ActivityLevelJankMonitor", "onActivityPaused", 86, "ActivityLevelJankMonitor.java")).C("Activity mismatch (currentActivity=%s, activity=%s)", this.c, activity);
            }
            this.c = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void d(Activity activity) {
        synchronized (this) {
            if (this.b) {
                ((doz)this.a.b()).b(activity);
                return;
            }
            this.c = activity;
            return;
        }
    }

    @Override
    public /* synthetic */ void e(Activity activity, Bundle bundle) {
    }

    @Override
    public /* synthetic */ void f(Activity activity) {
    }

    @Override
    public /* synthetic */ void g(Activity activity) {
    }

    @Override
    public /* synthetic */ void h(int n2) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public /* synthetic */ void i(gto gto2) {
        if (gto2.g() && !((Boolean)((jnu)gto2.c()).b()).booleanValue()) {
            return;
        }
        synchronized (this) {
            this.b = true;
            gto2 = this.c;
            if (gto2 != null) {
                this.d((Activity)gto2);
            }
            this.c = null;
            return;
        }
    }
}

