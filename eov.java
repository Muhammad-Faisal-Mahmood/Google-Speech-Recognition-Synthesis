/*
 * Decompiled with CFR 0.152.
 */
public final class eov
implements eot {
    private final eot a;
    private final jny b;

    public eov(eoy eoy2, eot eot2) {
        this.a = eot2;
        this.b = new jog(new eop(eoy2, 2));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final eom c(eom eom2) {
        eom eom3 = eom2;
        if (eom2 instanceof eok) return eom3;
        if (!(eom2 instanceof eol)) throw new joa();
        eom3 = (eom)this.b.a();
        if (eom3 instanceof eok) {
            eom3 = (eok)eom3;
            eom2 = (eol)eom2;
            return new eok(((eok)eom3).a + ((eol)eom2).a);
        }
        if (!(eom3 instanceof eol)) throw new joa();
        eom2 = (eol)eom2;
        eom3 = (eol)eom3;
        jse.e(eom3, "other");
        return new eol(((eol)eom2).a + ((eol)eom3).a);
    }

    @Override
    public final int a() {
        return this.a.a();
    }

    @Override
    public final eae b() {
        return ((epa)this.a).h;
    }

    @Override
    public final efq d() {
        return ((epa)this.a).i;
    }

    @Override
    public final eln e() {
        return ((epa)this.a).c;
    }

    @Override
    public final eot g() {
        return ((epa)this.a).d;
    }

    @Override
    public final hpn h(ebv ebv2) {
        jse.e(ebv2, "stopListeningReason");
        return this.a.h(ebv2);
    }

    @Override
    public final hpn i(ebu ebu2, eom eom2) {
        jse.e(ebu2, "success");
        return this.a.i(ebu2, this.c(eom2));
    }

    @Override
    public final hpn j() {
        return ((epa)this.a).f;
    }

    @Override
    public final hpn k(eom eom2) {
        return this.a.k(this.c(eom2));
    }
}

