/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 */
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.speech.tts.googletts.dispatch.LanguageRegistry;
import j$.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

public final class bsb
implements imb {
    private final jnu a;
    private final int b;
    private final Object c;

    public bsb(Object object, jnu jnu2, int n2) {
        this.b = n2;
        this.c = object;
        this.a = jnu2;
    }

    public bsb(jnu jnu2, jnu jnu3, int n2) {
        this.b = n2;
        this.a = jnu2;
        this.c = jnu3;
    }

    @Override
    public final /* synthetic */ Object b() {
        switch (this.b) {
            default: {
                jnu jnu2 = this.a;
                return new dlm(((ilt)this.c).a(), (dlm)jnu2.b());
            }
            case 19: {
                return new dkv((cxu)this.a.b(), (gto)((imc)this.c).a);
            }
            case 18: {
                dkd dkd2 = (dkd)this.a.b();
                hpr hpr2 = dkd2.a;
                bzq bzq2 = ((cox)this.c).a();
                ScheduledExecutorService scheduledExecutorService = hpr2;
                if (hpr2 == null) {
                    int n2 = dkd2.c;
                    scheduledExecutorService = new ScheduledThreadPoolExecutor(n2, new dkb(dkd2.b), new dka());
                    ((ThreadPoolExecutor)((Object)scheduledExecutorService)).setMaximumPoolSize(n2);
                    scheduledExecutorService = bzq2.c(hhk.F(scheduledExecutorService));
                }
                idi.m(scheduledExecutorService);
                return scheduledExecutorService;
            }
            case 17: {
                int n3 = djv.b;
                if (!fpk.g()) {
                    dmr dmr2 = (dmr)this.c.b();
                    if (!dmr.b()) {
                        ((heg)((heg)dkc.a.h()).j("com/google/android/libraries/performance/primes/CrashOnBadPrimesConfiguration", "observedBackgroundInitialization", 29, "CrashOnBadPrimesConfiguration.java")).u("Primes init triggered from background in package: %s", dmr2.a);
                        if (!dmr2.a()) {
                            throw new IllegalStateException(String.format("Primes init triggered from background in package: %s", dmr2.a));
                        }
                    }
                }
                return new djv(((djy)this.a).a());
            }
            case 16: {
                jnu jnu3 = this.a;
                Context context = ((ilt)this.c).a();
                context = (SharedPreferences)((gui)((dse)jnu3).a().e(new aim(context, 10))).a();
                idi.m(context);
                return context;
            }
            case 15: {
                return new cxv((frr)this.c.b(), (gcv)this.a.b());
            }
            case 14: {
                bmu bmu2 = ((gcy)this.c).a();
                jnu jnu4 = this.a;
                Objects.requireNonNull(jnu4);
                return new gcu(new dan(jnu4, 0), bmu2);
            }
            case 13: {
                Object object = gkf.a();
                ((gke)object).a = "TaskPeriods";
                ((gke)object).d(daj.a);
                gkf gkf2 = ((gke)object).a();
                object = this.a;
                return ((gkg)this.c).a().s(gkf2, (bmu)object.b());
            }
            case 12: {
                ((ilt)this.c).a();
                cqq cqq2 = (cqq)this.a.b();
                return new dae();
            }
            case 11: {
                cgw cgw2 = (cgw)this.c.b();
                return new daa((hpq)this.a.b());
            }
            case 10: {
                ((ilt)this.a).a();
                gto gto2 = ((cxx)this.c).f;
                idi.m(gto2);
                return gto2;
            }
            case 9: {
                cgw cgw3 = (cgw)this.c.b();
                return new cpi(((col)this.a).a());
            }
            case 8: {
                return new cot(((cob)this.a).a(), (jnu)this.c);
            }
            case 7: {
                jnu jnu5 = this.a;
                return new byo(((ilt)this.c).a(), ((gde)jnu5).a());
            }
            case 6: {
                Context context = (Context)this.c.b();
                bxf bxf2 = (bxf)this.a.b();
                if (!context.getPackageManager().hasSystemFeature("android.hardware.telephony")) {
                    bxf2.f(true);
                }
                idi.m(bxf2);
                return bxf2;
            }
            case 5: {
                return new bwq((Context)this.a.b(), ((bwr)this.c).a());
            }
            case 4: {
                return new bvo((Context)this.c.b(), (bxt)this.a.b());
            }
            case 3: {
                Context context = (Context)this.a.b();
                bxf bxf3 = (bxf)this.c.b();
                return new bxt(context);
            }
            case 2: {
                bmu bmu3 = ((gcy)this.c).a();
                jnu jnu6 = this.a;
                Objects.requireNonNull(jnu6);
                return new gcu(new dan(jnu6, 1), bmu3);
            }
            case 1: {
                ahp ahp2 = new ahp((koc)this.c.b(), (ExecutorService)this.a.b());
                ahp2.c = "Google-Speech-Actions";
                ahp2.a = ahg.a;
                ahp2.b = new brs();
                return ahp2.b();
            }
            case 0: 
        }
        Object object = this.c;
        return new LanguageRegistry(((bts)this.a).a(), (bwp)object.b());
    }
}

