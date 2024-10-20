/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class grf
extends hoz {
    private grf(hpn hpn2) {
        super(hpn2);
    }

    public static grf g(hpn hpn2) {
        hpn2 = hpn2 instanceof grf ? (grf)hpn2 : new grf(hpn2);
        return hpn2;
    }

    public final grf e(Class clazz, gte gte2, Executor executor) {
        return new grf(fxf.ae(this.b, clazz, gte2, executor));
    }

    public final grf f(Class clazz, hny hny2, Executor executor) {
        return new grf(fxf.af(this.b, clazz, hny2, executor));
    }

    public final grf h(gte gte2, Executor executor) {
        return new grf(fxf.aj(this.b, gte2, executor));
    }

    public final grf i(hny hny2, Executor executor) {
        return new grf(fxf.ak(this.b, hny2, executor));
    }

    public final void j(hpb hpb2, Executor executor) {
        fxf.al(this.b, hpb2, executor);
    }
}

