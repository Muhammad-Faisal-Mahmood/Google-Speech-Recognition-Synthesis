/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import androidx.work.WorkerParameters;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class gls
implements gcc {
    public static final hei a = hei.m("com/google/apps/tiktok/sync/impl/workmanager/SyncPeriodicWorker");
    public static final gcj b = new gcj(1L, TimeUnit.DAYS);
    public final glk c;
    public final hpq d;
    public final gcv e;
    public final dtu f;
    private final gkt g;
    private final boolean h;

    public gls(gkt gkt2, gcv gcv2, glk glk2, hpq hpq2, dtu dtu2, boolean bl2) {
        this.g = gkt2;
        this.e = gcv2;
        this.c = glk2;
        this.d = hpq2;
        this.f = dtu2;
        this.h = bl2;
    }

    public static String d(gto object) {
        object = ((gto)object).g() ? String.format("_proc<%s>", ((gto)object).c()) : "";
        return "com.google.apps.tiktok.sync.impl.workmanager.SyncPeriodicWorker".concat(String.valueOf(object));
    }

    @Override
    public final /* synthetic */ hpn a(WorkerParameters workerParameters) {
        return fxf.h();
    }

    @Override
    public final hpn b(WorkerParameters workerParameters) {
        if (!this.h) {
            return this.c(workerParameters);
        }
        if (this.c instanceof glx) {
            return hmv.f(fxf.aj(fxf.ak(this.g.b(), new fbk(this, workerParameters, 15), this.d), new fiz(17), (Executor)hom.a), Throwable.class, gqk.b(new fiz(18)), (Executor)hom.a);
        }
        return fxf.ak(this.g.a(), gqk.d(new fbk(this, workerParameters, 16)), this.d);
    }

    public final hpn c(WorkerParameters workerParameters) {
        Set set = workerParameters.c;
        Object object = new agx(7);
        object = (String)fvd.E(set.iterator(), (gtq)object);
        return fvd.d(fxf.ak(this.e.c((String)object), new fbk(this, workerParameters, 14), this.d), new dwp(7), (Executor)hom.a);
    }
}

