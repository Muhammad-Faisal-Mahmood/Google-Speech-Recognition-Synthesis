/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class dah
extends hoz {
    private dah(hpn hpn2) {
        super(hpn2);
    }

    public static dah e(hpn hpn2) {
        hpn2 = hpn2 instanceof dah ? (dah)hpn2 : new dah(hpn2);
        return hpn2;
    }

    public final dah b(Class clazz, gte gte2, Executor executor) {
        return new dah(fxf.ae(this.b, clazz, gte2, executor));
    }

    public final dah d(Class clazz, hny hny2, Executor executor) {
        return new dah(fxf.af(this.b, clazz, hny2, executor));
    }

    public final dah f(gte gte2, Executor executor) {
        return new dah(fxf.aj(this.b, gte2, executor));
    }

    public final dah g(hny hny2, Executor executor) {
        return new dah(fxf.ak(this.b, hny2, executor));
    }
}

