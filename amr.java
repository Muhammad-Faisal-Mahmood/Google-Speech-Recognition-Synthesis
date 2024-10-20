/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;
import java.io.IOException;

final class amr
implements ani,
alc {
    final ams a;
    private dvy b;
    private dvy c;

    public amr(ams ams2) {
        this.a = ams2;
        this.b = ams2.r(null);
        this.c = ams2.s(null);
    }

    private final void f(anc anc2) {
        anc2 = anc2 != null ? this.a.u(anc2) : null;
        dvy dvy2 = this.b;
        int n2 = dvy2.a;
        if (!Objects.equals(dvy2.c, anc2)) {
            this.b = this.a.b.c(anc2);
        }
        dvy2 = this.c;
        n2 = dvy2.a;
        if (!Objects.equals(dvy2.c, anc2)) {
            this.c = this.a.c.e(anc2);
        }
    }

    @Override
    public final void A(int n2, anc anc2, hti hti2) {
        this.f(anc2);
        this.b.j(hti2);
    }

    @Override
    public final void B(int n2, anc anc2, amv amv2, hti hti2) {
        this.f(anc2);
        this.b.k(amv2, hti2);
    }

    @Override
    public final void C(int n2, anc anc2, amv amv2, hti hti2) {
        this.f(anc2);
        this.b.l(amv2, hti2);
    }

    @Override
    public final void D(int n2, anc anc2, amv amv2, hti hti2, IOException iOException, boolean bl2) {
        this.f(anc2);
        this.b.m(amv2, hti2, iOException, bl2);
    }

    @Override
    public final void E(int n2, anc anc2, amv amv2, hti hti2) {
        this.f(anc2);
        this.b.n(amv2, hti2);
    }
}

