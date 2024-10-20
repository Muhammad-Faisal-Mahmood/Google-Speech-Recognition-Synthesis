/*
 * Decompiled with CFR 0.152.
 */
final class gnw
extends gmo
implements gnd {
    static final gnb a = new gnc();
    private final Exception b;
    private final boolean c;

    public gnw(Exception exception, boolean bl2, goz goz2) {
        super("<missing root>", gnp.a.b(), goz2);
        this.b = exception;
        this.c = bl2;
    }

    static gnw k(goz goz2) {
        boolean bl2;
        gnb gnb2 = new gnb();
        gnb gnb3 = gpe.a() ? gnb2 : a;
        boolean bl3 = gpe.a();
        boolean bl4 = bl2 = false;
        if (bl3) {
            bl4 = bl2;
            if (gno.q(gnb2)) {
                bl4 = true;
            }
        }
        return new gnw(gnb3, bl4, goz2);
    }

    @Override
    public final gpc f(String string, gop gop2, boolean bl2, goz goz2) {
        if (bl2) {
            gno.u();
        }
        return new gnx(string, this, gop2, bl2, goz2);
    }

    @Override
    public final Exception g() {
        return this.b;
    }

    @Override
    public final boolean h() {
        return this.c;
    }

    @Override
    public final gop i() {
        return goo.a;
    }

    @Override
    public final gom j(fxf fxf2) {
        return gom.d(2);
    }

    @Override
    public final gop l() {
        throw null;
    }

    @Override
    public final gpc m(String string, gop gop2, goz goz2) {
        gno.u();
        return this.f(string, gop2, true, goz2);
    }

    @Override
    public final void n(boolean bl2) {
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final void p() {
    }

    @Override
    public final void q(fxf fxf2, Object object) {
    }
}

