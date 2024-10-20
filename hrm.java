/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public final class hrm
implements hsy {
    public static final itv a = new itv("com.google.frameworks.client.data.android.auth.AuthContextInterceptor", false);
    private static final iws b = new iwm("Authorization", iwx.b);
    private final hac c;
    private hpn d;

    static {
        new iwm("X-Auth-Time", iwx.b);
    }

    public hrm(hac hac2) {
        this.c = hac2;
    }

    @Override
    public final /* synthetic */ htl a() {
        return htl.a;
    }

    @Override
    public final htl b(gpm object) {
        try {
            Object object2 = (hhk)hhk.S(this.d);
            object2 = ((gpm)object).c;
            object = b;
            fxf.B(((iwx)object2).h((iws)object) ^ true, "Already attached auth token");
            throw null;
        }
        catch (ExecutionException executionException) {
            Throwable throwable = executionException.getCause();
            if (throwable instanceof hro) {
                iye iye2 = iye.q;
                List list = iyh.a;
                return htl.b(iye2.a().d(throwable.getCause()), new iwx());
            }
            return htl.b(iyh.c(throwable), new iwx());
        }
    }

    @Override
    public final htl c(gpm object) {
        Object object2 = ((gpm)object).a;
        Object object3 = hrl.a;
        object3 = (hrl)((itw)object2).g((itv)object3);
        a.s(object3, "Using AuthContextStrategy, but did not set AuthContext");
        object2 = ((hrl)object3).a();
        if (!this.c.containsKey(object2)) {
            boolean bl2;
            boolean bl3 = ((hrl)object3).a().equals("incognito");
            boolean bl4 = bl2 = false;
            if (!bl3) {
                bl4 = bl2;
                if (!((hrl)object3).a().equals("pseudonymous")) {
                    bl4 = true;
                }
            }
            fxf.B(bl4, "Used non-google account without enabling API Key fallback");
            object2 = ((gpm)object).a;
            object3 = hqx.a;
            object2 = ((hqw)((itw)object2).g((itv)object3)).f;
            object3 = ((gpm)object).a;
            Object object4 = hrf.a;
            ((hrf)((itw)object3).g((itv)object4)).d();
            object3 = fxf.aq("AuthContextInterceptor#tokenFuture");
            try {
                object4 = new gkz((gpm)object, (hrn)object2, 2);
                object4 = gqk.j((Callable)object4);
                object2 = new hpo((Callable)object4);
                ((gol)object3).a((hpn)object2);
                object4 = ((gpm)object).a;
                object = hqx.a;
                ((hqw)((itw)object4).g((itv)object)).d.execute((Runnable)object2);
                this.d = object2;
                object = htl.c((hpn)object2);
                return object;
            }
            finally {
                ((gol)object3).close();
            }
        }
        object = ((bzq)this.c.get((Object)((hrl)object3).a())).a;
        throw null;
    }

    @Override
    public final /* synthetic */ htl d(bzq bzq2) {
        return htl.a;
    }

    @Override
    public final /* synthetic */ void e(bzq bzq2) {
    }

    @Override
    public final /* synthetic */ void f(dlm dlm2) {
    }

    @Override
    public final /* synthetic */ void g(dlm dlm2) {
    }
}

