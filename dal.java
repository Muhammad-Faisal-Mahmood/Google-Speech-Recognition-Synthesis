/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.libraries.mdi.download.workmanager.workers.PeriodicWorker;
import java.util.Set;

public final class dal
implements gcc {
    public final Set a;
    private final Context b;
    private final cty c;
    private final hpq d;
    private final gui e;

    public dal(Context context, cty cty2, gto gto2, hpq hpq2, Set set) {
        this.b = context;
        this.c = cty2;
        this.d = hpq2;
        this.e = (gui)gto2.e(new bpr(9));
        this.a = set;
    }

    @Override
    public final /* synthetic */ hpn a(WorkerParameters workerParameters) {
        return fxf.h();
    }

    @Override
    public final hpn b(WorkerParameters workerParameters) {
        if (!((Boolean)this.e.a()).booleanValue()) {
            return hhk.K(new bbg());
        }
        workerParameters.b.b("MDD_TASK_TAG_KEY");
        return dah.e(new PeriodicWorker(this.b, workerParameters, this.c, this.d).b()).f(new cym(this, 11), this.d).b(Throwable.class, new cym(this, 12), this.d);
    }
}

