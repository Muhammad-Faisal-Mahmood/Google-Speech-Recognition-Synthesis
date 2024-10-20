/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;

public final class czg
implements imb {
    private final jnu a;
    private final jnu b;

    public czg(jnu jnu2, jnu jnu3) {
        this.a = jnu2;
        this.b = jnu3;
    }

    public final gkf a() {
        Object object = ((ilt)this.a).a();
        hpq hpq2 = (hpq)this.b.b();
        gke gke2 = gkf.a();
        gke2.a = "LoggingState.pb";
        gke2.d(cts.a);
        gsl gsl2 = gsl.a;
        object = frk.d((Context)object, hpq2);
        ((fri)object).c = cqq.C("gms_icing_mdd_network_usage_monitor", gsl2);
        ((fri)object).b();
        ((fri)object).c(new cyw());
        gke2.b(((fri)object).a());
        return gke2.a();
    }
}

