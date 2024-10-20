/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import androidx.work.WorkerParameters;
import java.util.concurrent.Executor;

public final class glp
implements gcc {
    public final hpq a;
    public final gcv b;
    private final gkt c;
    private final glk d;
    private final boolean e;

    public glp(gkt gkt2, gcv gcv2, glk glk2, hpq hpq2, boolean bl2) {
        this.c = gkt2;
        this.b = gcv2;
        this.d = glk2;
        this.a = hpq2;
        this.e = bl2;
    }

    @Override
    public final /* synthetic */ hpn a(WorkerParameters workerParameters) {
        return fxf.h();
    }

    @Override
    public final hpn b(WorkerParameters workerParameters) {
        if (!this.e) {
            return hhk.K(new bbg());
        }
        if (this.d instanceof glv) {
            return hno.f(this.c.b(), gqk.b(new fiz(16)), (Executor)hom.a);
        }
        return hno.g(this.c.a(), gqk.d(new fbk(this, workerParameters, 13)), this.a);
    }
}

