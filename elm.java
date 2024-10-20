/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.google.android.libraries.speech.modelmanager.languagepack.ui.grpc.DownloadActivityStarterService;
import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class elm
implements imb {
    private final jnu a;
    private final int b;

    public elm(jnu jnu2, int n2) {
        this.b = n2;
        this.a = jnu2;
    }

    @Override
    public final /* synthetic */ Object b() {
        switch (this.b) {
            default: {
                return new fkj(((ilt)this.a).a());
            }
            case 19: {
                fjz fjz2 = (fjz)this.a.b();
                hdc hdc2 = hdc.a;
                idi.m(hdc2);
                return new fki(fjz2, hdc2);
            }
            case 18: {
                Object object = (bzq)((imc)this.a).a;
                fgh fgh2 = new fgh();
                object = (bmu)((bzq)object).a;
                return new cnu(((ilt)((bmu)object).c).a(), (Optional)((imc)((bmu)object).b).a, (Optional)((imc)((bmu)object).a).a, fgh2);
            }
            case 17: {
                return new fhr(((fiy)this.a).a());
            }
            case 16: {
                return new ffy((dxi)this.a.b());
            }
            case 15: {
                return new hth(((fdp)this.a).a());
            }
            case 14: {
                return new jmm((itx)this.a.b(), itw.a.f(jmw.b, (Object)jmt.b));
            }
            case 13: {
                Object object = ((ilt)this.a).a();
                object = new iuz(iyp.b((Context)object, DownloadActivityStarterService.class), (Context)object, new fvc(null));
                ((iuz)object).k(5L, TimeUnit.SECONDS);
                return ((iuy)object).i();
            }
            case 12: {
                return new bzo((dxi)this.a.b(), null);
            }
            case 11: {
                return new bzo((dxi)this.a.b(), null);
            }
            case 10: {
                return new bmu((ScheduledExecutorService)this.a.b(), new eye());
            }
            case 9: {
                Boolean bl2 = ((imr)this.a).a();
                bl2.booleanValue();
                return bl2;
            }
            case 8: {
                return new crh((cgw)this.a.b());
            }
            case 7: {
                Object object = this.a;
                jse.e(object, "audioRequestClientProvider");
                object = object.b();
                jse.d(object, "get(...)");
                object = (ekc)object;
                idi.m(object);
                return object;
            }
            case 6: {
                return new bzb(this.a, null);
            }
            case 5: {
                return new dml(this.a, null);
            }
            case 4: {
                return new dtu((cgw)this.a.b());
            }
            case 3: {
                return new dlm(this.a, null);
            }
            case 2: {
                return new elp((jvb)this.a.b());
            }
            case 1: {
                Executor executor = (Executor)this.a.b();
                return new cqq();
            }
            case 0: 
        }
        return new ell((dtu)this.a.b());
    }
}

