/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.concurrent.Executor;

public final class czf
implements imb {
    private final jnu a;
    private final jnu b;
    private final jnu c;
    private final jnu d;
    private final int e;

    public czf(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, int n2) {
        this.e = n2;
        this.a = jnu2;
        this.b = jnu3;
        this.c = jnu4;
        this.d = jnu5;
    }

    public czf(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, int n2, int[] nArray) {
        this.e = n2;
        this.c = jnu2;
        this.a = jnu3;
        this.b = jnu4;
        this.d = jnu5;
    }

    public static gkf c(Context context, hpq hpq2, cyu cyu2, cxt cxt2) {
        gke gke2 = gkf.a();
        gke2.a = "DestSharedFiles.pb";
        gke2.d(ctx.a);
        gke2.b(cqq.R(context, hpq2, cyu2, cxt2, gsl.a));
        return gke2.a();
    }

    public static gkf d(Context context, hpq hpq2, cyu cyu2, cxt cxt2) {
        gke gke2 = gkf.a();
        gke2.a = "DestFileGroups.pb";
        gke2.d(cto.a);
        gke2.b(cqq.Q(context, hpq2, cyu2, cxt2, gsl.a));
        return gke2.a();
    }

    public static gkf e(Context context, hpq hpq2, cyu cyu2, cxt cxt2) {
        gke gke2 = gkf.a();
        gke2.a = "DiagFileGroups.pb";
        gke2.d(cto.a);
        gke2.b(cqq.Q(context, hpq2, cyu2, cxt2, gsl.a));
        return gke2.a();
    }

    public static gkf f(Context context, hpq hpq2, cyu cyu2, cxt cxt2) {
        gke gke2 = gkf.a();
        gke2.a = "DiagSharedFiles.pb";
        gke2.d(ctx.a);
        gke2.b(cqq.R(context, hpq2, cyu2, cxt2, gsl.a));
        return gke2.a();
    }

    public final gkf a() {
        int n2 = this.e;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        Object object = this.d;
                        Object object2 = this.b;
                        Object object3 = this.a;
                        hth hth2 = ((gai)this.c).a();
                        object3 = ((fzz)object3).a();
                        object2 = ((fzw)object2).a();
                        object = (cqm)object.b();
                        gke gke2 = gkf.a();
                        gke2.a = "AccountData";
                        gke2.d(gam.a);
                        gke2.b(new gae((bmu)hth2.b, hth2));
                        gke2.c((frb)object3);
                        gke2.c = new gaj(object, (Executor)object2, 1);
                        return gke2.a();
                    }
                    jnu jnu2 = this.b;
                    return czf.f(((ilt)this.a).a(), (hpq)jnu2.b(), (cyu)this.c.b(), ((cxb)this.d).a());
                }
                jnu jnu3 = this.b;
                return czf.e(((ilt)this.a).a(), (hpq)jnu3.b(), (cyu)this.c.b(), ((cxb)this.d).a());
            }
            jnu jnu4 = this.b;
            return czf.d(((ilt)this.a).a(), (hpq)jnu4.b(), (cyu)this.c.b(), ((cxb)this.d).a());
        }
        jnu jnu5 = this.b;
        return czf.c(((ilt)this.a).a(), (hpq)jnu5.b(), (cyu)this.c.b(), ((cxb)this.d).a());
    }

    @Override
    public final /* synthetic */ Object b() {
        int n2 = this.e;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        return this.a();
                    }
                    return this.a();
                }
                return this.a();
            }
            return this.a();
        }
        return this.a();
    }
}

