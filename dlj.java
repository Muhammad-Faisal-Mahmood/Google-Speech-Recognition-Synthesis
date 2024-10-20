/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 */
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

final class dlj
extends dlc
implements dll {
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final dle c;
    private djt d;

    public dlj(dle dle2) {
        this.c = dle2;
    }

    @Override
    public final void a(Activity activity, Bundle bundle) {
        this.d = null;
    }

    @Override
    public final void b(Activity activity) {
        this.d = null;
    }

    @Override
    public final /* synthetic */ void c(Activity activity) {
    }

    @Override
    public final void d(Activity activity) {
        this.d = null;
    }

    @Override
    public final /* synthetic */ void e(Activity activity, Bundle bundle) {
    }

    @Override
    public final void f(Activity activity) {
        this.d = null;
        Context context = activity.getApplicationContext();
        if (dlt.d(context, dlt.a(context))) {
            this.l(djt.b(activity.getClass()));
            return;
        }
        if (!this.b.getAndSet(true)) {
            ((heg)((heg)dkc.a.h()).j("com/google/android/libraries/performance/primes/foreground/ProcessImportanceForegroundSignalAdapter", "onActivityStarted", 57, "ProcessImportanceForegroundSignalAdapter.java")).r("Activity started with background importance");
        }
    }

    @Override
    public final void g(Activity activity) {
        djt djt2;
        this.d = djt2 = djt.b(activity.getClass());
        if (!dlt.d((Context)(activity = activity.getApplicationContext()), dlt.a((Context)activity))) {
            this.k(djt2);
        }
    }

    @Override
    public final void h(int n2) {
        djt djt2;
        if (n2 >= 20 && (djt2 = this.d) != null) {
            this.k(djt2);
        }
        this.d = null;
    }

    @Override
    public final void i(djt djt2) {
        this.c.i(djt2);
    }

    @Override
    public final void j(djt djt2) {
        this.c.j(djt2);
    }
}

