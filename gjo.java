/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.ExecutionException;

final class gjo
implements hsy {
    private hpn a;

    static {
        new iwm("Authorization", iwx.b);
        new iwm("X-Auth-Time", iwx.b);
    }

    @Override
    public final /* synthetic */ htl a() {
        return htl.a;
    }

    @Override
    public final htl b(gpm object) {
        try {
            object = (gjk)hhk.S(this.a);
            throw null;
        }
        catch (ExecutionException executionException) {
            iye iye2 = iye.c;
            object = iyh.a;
            return htl.b(iye2.a().d(executionException.getCause()).e("Could not obtain auth token"), new iwx());
        }
    }

    @Override
    public final htl c(gpm object) {
        itv itv2 = gjk.a;
        object = (hpn)((itw)((gpm)object).a).g(itv2);
        if (object == null) {
            return htl.a;
        }
        this.a = object;
        return htl.c((hpn)object);
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

