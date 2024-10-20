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

public final class glx
implements glk {
    public static final hei a = hei.m("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerPeriodicScheduler");
    public final Executor b;
    public final gcv c;
    private final Context d;
    private final Boolean e;
    private final Boolean f;
    private final bng g;

    public glx(Context context, gcv gcv2, bng bng2, Executor executor, gto gto2, Boolean bl2) {
        this.d = context;
        this.c = gcv2;
        this.g = bng2;
        this.b = executor;
        this.e = (Boolean)gto2.e(false);
        this.f = bl2;
    }

    public static baq b(Set set) {
        bao bao2 = new bao();
        bao2.a = set.contains((Object)gkj.a);
        if (set.contains((Object)gkj.b)) {
            bao2.b(bbj.c);
        } else if (set.contains((Object)gkj.c)) {
            bao2.b(bbj.b);
        }
        return bao2.a();
    }

    public static String d(baq object, gto gto2) {
        StringBuilder stringBuilder = new StringBuilder("SyncPeriodicTask");
        if (gto2.g()) {
            stringBuilder.append("_proc<");
            stringBuilder.append((String)gto2.c());
            stringBuilder.append(">");
        }
        if (object.d) {
            stringBuilder.append("_charging");
        }
        if ((object = object.b) == bbj.c) {
            stringBuilder.append("_unmetered");
        } else if (object == bbj.b) {
            stringBuilder.append("_connected");
        }
        return stringBuilder.toString();
    }

    @Override
    public final hpn a(Set set, long l2, Map map) {
        if (!this.f.booleanValue()) {
            return hpj.a;
        }
        ((heg)((heg)a.f()).j("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerPeriodicScheduler", "scheduleNextSyncSystemWakeup", 84, "SyncWorkManagerPeriodicScheduler.java")).r("Scheduling next periodic WorkManager workers");
        return hno.g(this.g.c(set, l2, map), gqk.d(new ghi(this, 7)), this.b);
    }

    public final gto c() {
        gto gto2 = this.e != false ? gto.i(fxf.o(this.d)) : gsl.a;
        return gto2;
    }
}

