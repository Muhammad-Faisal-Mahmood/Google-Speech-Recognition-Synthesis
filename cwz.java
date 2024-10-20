/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.concurrent.Executor;

public final class cwz {
    public static volatile boolean a = false;
    public final Context b;
    public final cwj c;
    public final cwk d;
    public final cxl e;
    public final cuv f;
    public final czd g;
    public final gto h;
    public final Executor i;
    public final gto j;
    public final cys k;
    public final cyj l;
    public final cyu m;
    public final czh n;
    public final cxv o;
    public final dmt p;
    public final egg q;

    public cwz(Context context, cyu cyu2, egg egg2, cxl cxl2, cwj cwj2, cwk cwk2, dmt dmt2, cuv cuv2, czd czd2, czh czh2, cxv cxv2, gto gto2, Executor executor, gto gto3, cys cys2, cyj cyj2) {
        this.b = context;
        this.m = cyu2;
        this.q = egg2;
        this.e = cxl2;
        this.c = cwj2;
        this.d = cwk2;
        this.p = dmt2;
        this.f = cuv2;
        this.g = czd2;
        this.n = czh2;
        this.o = cxv2;
        this.h = gto2;
        this.i = executor;
        this.j = gto3;
        this.k = cys2;
        this.l = cyj2;
    }

    public final hpn a() {
        return fxf.ak(this.q.k(), new cvv(this, 19), this.i);
    }

    public final hpn b(cth object) {
        long l2 = ((cth)object).s;
        object = new StringBuilder("mdd_");
        ((StringBuilder)object).append(l2);
        object = ((StringBuilder)object).toString();
        return this.l.b((String)object);
    }

    public final hpn c(boolean bl2, hny hny2) {
        cyr.d("%s downloadAllPendingGroups on wifi = %s", "MDDManager", bl2);
        return fxf.ak(this.f(), new cvw((Object)this, bl2, hny2, 2), this.i);
    }

    public final hpn d(ctq ctq2, gto gto2, hny hny2) {
        cyr.e("%s downloadFileGroup %s %s", "MDDManager", ctq2.c, ctq2.d);
        return fxf.ak(this.f(), new cvq((Object)this, ctq2, (Object)gto2, (Object)hny2, 14), this.i);
    }

    public final hpn e(ctq ctq2, boolean bl2) {
        cyr.e("%s getFileGroup %s %s", "MDDManager", ctq2.c, ctq2.d);
        return fxf.ak(this.f(), new cvw(this, ctq2, bl2, 3), this.i);
    }

    public final hpn f() {
        if (a) {
            return hpj.a;
        }
        return dah.e(hpj.a).g(new cwu(this, 3), this.i).g(new cwu(this, 4), this.i).g(new cwu(this, 5), this.i).g(new cwu(this, 6), this.i).f(new cwt(5), this.i);
    }
}

