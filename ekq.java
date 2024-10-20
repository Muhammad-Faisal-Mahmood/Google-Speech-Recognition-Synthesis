/*
 * Decompiled with CFR 0.152.
 */
public final class ekq
implements ecs {
    private final ecx a;
    private final gto b;
    private final gto c;
    private final gto d;
    private final hpn e;
    private final int f;

    public ekq(eah eah2, int n2) {
        ebt ebt2;
        this.f = n2;
        cxt cxt2 = dpf.v(ecx.a.l());
        ebt ebt3 = ebt2 = ((ear)eah2.f()).c;
        if (ebt2 == null) {
            ebt3 = ebt.a;
        }
        cxt2.A(ebt3);
        this.a = cxt2.z();
        this.b = eah2.a();
        this.c = eah2.b();
        this.d = eah2.c();
        this.e = eah2.e();
    }

    public ekq(gto gto2, gto gto3, gto gto4, hpn hpn2, ebt ebt2, int n2) {
        this.f = n2;
        cxt cxt2 = dpf.v(ecx.a.l());
        cxt2.A(ebt2);
        this.a = cxt2.z();
        this.b = gto2;
        this.c = gto3;
        this.d = gto4;
        this.e = hpn2;
    }

    @Override
    public final gto a() {
        if (this.f != 0) {
            return this.b;
        }
        return this.b;
    }

    @Override
    public final gto b() {
        if (this.f != 0) {
            return this.c;
        }
        return this.c;
    }

    @Override
    public final gto c() {
        if (this.f != 0) {
            return this.d;
        }
        return this.d;
    }

    @Override
    public final /* synthetic */ gto d() {
        if (this.f != 0) {
            return gsl.a;
        }
        return gsl.a;
    }

    @Override
    public final hpn e() {
        if (this.f != 0) {
            return this.e;
        }
        return this.e;
    }

    @Override
    public final /* synthetic */ Object f() {
        if (this.f != 0) {
            return this.a;
        }
        return this.a;
    }
}

