/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class fzu
implements fzh {
    public final Object a;
    private final int b;

    public /* synthetic */ fzu(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    @Override
    public final hpn a() {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                Object object = (gld)this.a.b();
                ((heg)((heg)gld.a.f()).j("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "onAccountsChanged", 728, "SyncManagerImpl.java")).r("onAccountsChanged: Checking and maybe rescheduling synclet bindings");
                Object object2 = ((gld)object).e;
                fxf.B(true, "onAccountsChanged called without an AccountManager bound");
                object2 = ((gld)object).h(((gld)object).c());
                Object object3 = ((gld)object).g;
                object3 = ((gky)object3).d.bf(gqk.j(new gkv(object3, 0)));
                object2 = fxf.aE(new hpn[]{object2, object3}).C(new dcf(object, object2, object3, 11), ((gld)object).b);
                if (!((gld)object).f) {
                    ((gld)object).o.set(object2);
                }
                object2 = hhk.R((hpn)object2, 10L, TimeUnit.SECONDS, ((gld)object).b);
                object = new hpo(gqk.i(new gjf(object2, 4)));
                object2.c((Runnable)object, (Executor)hom.a);
                return object;
            }
            Object object = this.a;
            hhk.P(gqk.c(new frn(object, 4)), ((fyq)object).b);
            return hhk.K(null);
        }
        Object object = this.a;
        hpn hpn2 = hhk.K(null);
        ((bmu)object).P(hpn2, "com.google.apps.tiktok.account.data.AllAccounts");
        return hpn2;
    }
}

