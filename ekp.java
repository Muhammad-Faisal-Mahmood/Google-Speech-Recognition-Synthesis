/*
 * Decompiled with CFR 0.152.
 */
public final class ekp
implements eah {
    private final ear a;
    private final gto b;
    private final gto c;
    private final gto d;
    private final gto e;
    private final hpn f;
    private final int g;

    public ekp(ecp ecp2, int n2) {
        this.g = n2;
        this.a = (ear)ecp2.f();
        this.b = ecp2.a();
        this.c = ecp2.b();
        this.d = ecp2.d();
        this.e = ecp2.c();
        this.f = ecp2.e();
    }

    public ekp(gto gto2, gto gto3, gto gto4, gto gto5, hpn hpn2, ebt ebt2, int n2) {
        this.g = n2;
        bzo bzo2 = dpf.r(ear.a.l());
        bzo2.q(ebt2);
        this.a = bzo2.p();
        this.b = gto2;
        this.d = gto3;
        this.c = gto4;
        this.e = gto5;
        this.f = hpn2;
    }

    @Override
    public final gto a() {
        if (this.g != 0) {
            return this.b;
        }
        return this.b;
    }

    @Override
    public final gto b() {
        if (this.g != 0) {
            return this.c;
        }
        return this.c;
    }

    @Override
    public final gto c() {
        if (this.g != 0) {
            return this.e;
        }
        return this.e;
    }

    @Override
    public final gto d() {
        if (this.g != 0) {
            return this.d;
        }
        return this.d;
    }

    @Override
    public final hpn e() {
        if (this.g != 0) {
            return this.f;
        }
        return this.f;
    }

    @Override
    public final /* synthetic */ Object f() {
        if (this.g != 0) {
            return this.a;
        }
        return this.a;
    }
}

