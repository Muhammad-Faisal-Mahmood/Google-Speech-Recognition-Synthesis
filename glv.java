/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public final class glv
implements glk {
    public static final hei a = hei.m("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerOneTimeScheduler");
    public final gcv b;
    private final Context c;
    private final Executor d;
    private final Boolean e;
    private final Boolean f;
    private final bng g;

    public glv(Context context, gcv gcv2, bng bng2, Executor executor, gto gto2, Boolean bl2) {
        this.c = context;
        this.b = gcv2;
        this.g = bng2;
        this.d = executor;
        this.e = (Boolean)gto2.e(false);
        this.f = bl2;
    }

    @Override
    public final hpn a(Set set, long l2, Map map) {
        if (!this.f.booleanValue()) {
            return hpj.a;
        }
        ((heg)((heg)a.f()).j("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerOneTimeScheduler", "scheduleNextSyncSystemWakeup", 82, "SyncWorkManagerOneTimeScheduler.java")).r("Scheduling next onetime WorkManager workers");
        return hno.g(this.g.c(set, l2, map), gqk.d(new ghi(this, 6)), this.d);
    }

    public final gto b() {
        gto gto2 = this.e != false ? gto.i(fxf.o(this.c)) : gsl.a;
        return gto2;
    }
}

