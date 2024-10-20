/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
import android.app.Application;
import android.content.Context;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class emw
implements imb {
    private final jnu a;
    private final jnu b;
    private final int c;

    public emw(jnu jnu2, jnu jnu3, int n2) {
        this.c = n2;
        this.a = jnu2;
        this.b = jnu3;
    }

    public emw(jnu jnu2, jnu jnu3, int n2, byte[] byArray) {
        this.c = n2;
        this.b = jnu2;
        this.a = jnu3;
    }

    @Override
    public final /* synthetic */ Object b() {
        switch (this.c) {
            default: {
                Object object = gkf.a();
                ((gke)object).a = "VoiceImeSettings";
                ((gke)object).d(fmg.a);
                gkf gkf2 = ((gke)object).a();
                object = this.b;
                return ((gkg)this.a).a().s(gkf2, (bmu)object.b());
            }
            case 19: {
                Object object = gkf.a();
                ((gke)object).a = "VoiceIME";
                ((gke)object).d(fme.a);
                object = ((gke)object).a();
                jnu jnu2 = this.b;
                return ((gkg)this.a).a().s((gkf)object, (bmu)jnu2.b());
            }
            case 18: {
                cgw cgw2 = (cgw)this.a.b();
                return new fju((hpr)this.b.b());
            }
            case 17: {
                jnu jnu3 = this.b;
                return new fje(((ilt)this.a).a(), ((fei)jnu3).a());
            }
            case 16: {
                Object object = this.a;
                Context context = ((ilt)this.b).a();
                object = (hpq)object.b();
                return new giu(new cni(context, (hpq)object), (hpq)object);
            }
            case 15: {
                jnu jnu4 = this.b;
                return new bmu(((gdt)this.a).a(), ((fhb)jnu4).a());
            }
            case 14: {
                jnu jnu5 = this.a;
                return new hth(((ilt)this.b).a(), (hth)jnu5.b(), null);
            }
            case 13: {
                Object object = gkf.a();
                ((gke)object).a = "ZipfileLanguagePackRequestState";
                ((gke)object).d(far.a);
                object = ((gke)object).a();
                jnu jnu6 = this.b;
                return ((gkg)this.a).a().s((gkf)object, (bmu)jnu6.b());
            }
            case 12: {
                Object object = gkf.a();
                ((gke)object).a = "LanguagePackDownloadSettingsState";
                ((gke)object).d(fap.a);
                gkf gkf3 = ((gke)object).a();
                object = this.b;
                return ((gkg)this.a).a().s(gkf3, (bmu)object.b());
            }
            case 11: {
                Object object = gkf.a();
                ((gke)object).a = "ManagerLanguagePackRequestState";
                ((gke)object).d(far.a);
                object = ((gke)object).a();
                jnu jnu7 = this.b;
                return ((gkg)this.a).a().s((gkf)object, (bmu)jnu7.b());
            }
            case 10: {
                return new cya(((dxn)this.a).a(), (Map)((imc)this.b).a);
            }
            case 9: {
                return new ewc((bzb)((imc)this.a).a, ((imr)this.b).a());
            }
            case 8: {
                return new evu((evw)this.a.b(), (ewc)this.b.b());
            }
            case 7: {
                cgw cgw3 = (cgw)this.a.b();
                return new evo((Executor)this.b.b());
            }
            case 6: {
                return new est(((imr)this.b).a(), (esv)this.a.b());
            }
            case 5: {
                jnu jnu8 = this.b;
                return new ery(((gdb)this.a).a(), ((eru)jnu8).a());
            }
            case 4: {
                return new ers((gto)((imc)this.b).a, (dml)this.a.b());
            }
            case 3: {
                jnu jnu9 = this.a;
                return new enu(((ert)this.b).a(), (jvb)jnu9.b());
            }
            case 2: {
                Context context = ((ilt)this.a).a();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService)this.b.b();
                jse.e(scheduledExecutorService, "scheduledExecutorService");
                return new eng(scheduledExecutorService, new fss(context), (Application)context);
            }
            case 1: {
                return new emj((Set)((imc)this.b).a, (Executor)this.a.b());
            }
            case 0: 
        }
        jnu jnu10 = this.b;
        return new emv(((emp)this.a).a(), (jvb)jnu10.b());
    }
}

