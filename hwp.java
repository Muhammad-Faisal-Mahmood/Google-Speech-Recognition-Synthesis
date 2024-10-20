/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

public class hwp
extends hvc
implements hyg,
ebb {
    public final hwv a;
    public hwv b;

    public hwp() {
        throw null;
    }

    public hwp(hwv hwv2) {
        this.a = hwv2;
        if (!hwv2.B()) {
            this.b = this.q();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    public hwp(byte[] byArray) {
        this(ebj.a);
    }

    private static void aC(Object object, Object object2) {
        hyo.a.b(object).h(object, object2);
    }

    public final void A(csf csf2) {
        if (!this.b.B()) {
            this.u();
        }
        csg csg2 = (csg)this.b;
        csg csg3 = csg.a;
        csf2.getClass();
        csg2.b();
        csg2.h.add(csf2);
    }

    public final void B(String string, cth cth2) {
        string.getClass();
        cth2.getClass();
        if (!this.b.B()) {
            this.u();
        }
        cto cto2 = (cto)this.b;
        cto cto3 = cto.a;
        cto2.b().put(string, cth2);
    }

    public final void C(String string) {
        string.getClass();
        if (!this.b.B()) {
            this.u();
        }
        cto cto2 = (cto)this.b;
        cto cto3 = cto.a;
        cto2.b().remove(string);
    }

    public final void D(String string, ctv ctv2) {
        string.getClass();
        ctv2.getClass();
        if (!this.b.B()) {
            this.u();
        }
        ctx ctx2 = (ctx)this.b;
        ctx ctx3 = ctx.a;
        ctx2.b().put(string, ctv2);
    }

    public final void E(String string) {
        string.getClass();
        if (!this.b.B()) {
            this.u();
        }
        ctx ctx2 = (ctx)this.b;
        ctx ctx3 = ctx.a;
        ctx2.b().remove(string);
    }

    public final void F(String string) {
        if (!this.b.B()) {
            this.u();
        }
        dvl dvl2 = (dvl)this.b;
        Object object = dvl.a;
        string.getClass();
        object = dvl2.c;
        if (!object.c()) {
            dvl2.c = hwv.s((hxk)object);
        }
        dvl2.c.add(string);
    }

    public final void G(String string, dvl dvl2) {
        string.getClass();
        dvl2.getClass();
        if (!this.b.B()) {
            this.u();
        }
        dvn dvn2 = (dvn)this.b;
        Object object = dvn.a;
        object = dvn2.b;
        if (!((hya)object).b) {
            dvn2.b = ((hya)object).a();
        }
        dvn2.b.put(string, dvl2);
    }

    public final void H(Iterable object) {
        if (!this.b.B()) {
            this.u();
        }
        faq faq2 = (faq)this.b;
        Object object2 = faq.a;
        object2 = faq2.g;
        if (!object2.c()) {
            faq2.g = hwv.q((hxb)object2);
        }
        object2 = object.iterator();
        while (object2.hasNext()) {
            object = (iaz)object2.next();
            faq2.g.g(((iaz)object).r);
        }
    }

    public final void I(Iterable iterable) {
        if (!this.b.B()) {
            this.u();
        }
        far far2 = (far)this.b;
        Object object = far.a;
        object = far2.b;
        if (!object.c()) {
            far2.b = hwv.s((hxk)object);
        }
        hvc.g(iterable, far2.b);
    }

    public final void J(ffx ffx2) {
        if (!this.b.B()) {
            this.u();
        }
        fex fex2 = (fex)this.b;
        Object object = fex.a;
        ffx2.getClass();
        object = fex2.g;
        if (!object.c()) {
            fex2.g = hwv.s((hxk)object);
        }
        fex2.g.add(ffx2);
    }

    public final void K(Iterable iterable) {
        if (!this.b.B()) {
            this.u();
        }
        ffl ffl2 = (ffl)this.b;
        Object object = ffl.a;
        object = ffl2.d;
        if (!object.c()) {
            ffl2.d = hwv.s((hxk)object);
        }
        hvc.g(iterable, ffl2.d);
    }

    public final void L(Iterable iterable) {
        if (!this.b.B()) {
            this.u();
        }
        fmg fmg2 = (fmg)this.b;
        Object object = fmg.a;
        object = fmg2.e;
        if (!object.c()) {
            fmg2.e = hwv.s((hxk)object);
        }
        hvc.g(iterable, fmg2.e);
    }

    public final void M(int n2, gap gap2) {
        gap2.getClass();
        if (!this.b.B()) {
            this.u();
        }
        gam gam2 = (gam)this.b;
        gam gam3 = gam.a;
        gam2.b().put(n2, gap2);
    }

    public final void N(gmj gmj2) {
        if (!this.b.B()) {
            this.u();
        }
        gmk gmk2 = (gmk)this.b;
        Object object = gmk.a;
        gmj2.getClass();
        object = gmk2.d;
        if (!object.c()) {
            gmk2.d = hwv.s((hxk)object);
        }
        gmk2.d.add(gmj2);
    }

    public final void O(gok gok2) {
        if (!this.b.B()) {
            this.u();
        }
        gqm gqm2 = (gqm)this.b;
        Object object = gqm.a;
        gok2.getClass();
        object = gqm2.e;
        if (!object.c()) {
            gqm2.e = hwv.s((hxk)object);
        }
        gqm2.e.add(gok2);
    }

    public final void P(igt igt2) {
        if (!this.b.B()) {
            this.u();
        }
        ief ief2 = (ief)this.b;
        Object object = ief.a;
        igt2.getClass();
        object = ief2.d;
        if (!object.c()) {
            ief2.d = hwv.s((hxk)object);
        }
        ief2.d.add(igt2);
    }

    public final void Q(Iterable iterable) {
        if (!this.b.B()) {
            this.u();
        }
        ies ies2 = (ies)this.b;
        Object object = ies.a;
        object = ies2.b;
        if (!object.c()) {
            ies2.b = hwv.s((hxk)object);
        }
        hvc.g(iterable, ies2.b);
    }

    public final void R(String string, String string2) {
        string.getClass();
        string2.getClass();
        if (!this.b.B()) {
            this.u();
        }
        iew iew2 = (iew)this.b;
        Object object = iew.a;
        object = iew2.c;
        if (!((hya)object).b) {
            iew2.c = ((hya)object).a();
        }
        iew2.c.put(string, string2);
    }

    public final void S(String string, ihd ihd2) {
        ihd2.getClass();
        if (!this.b.B()) {
            this.u();
        }
        ihf ihf2 = (ihf)this.b;
        ihf ihf3 = ihf.a;
        ihf2.c().put(string, ihd2);
    }

    public final void T(Iterable iterable) {
        if (!this.b.B()) {
            this.u();
        }
        iil iil2 = (iil)this.b;
        Object object = iil.a;
        object = iil2.b;
        if (!object.c()) {
            iil2.b = hwv.s((hxk)object);
        }
        hvc.g(iterable, iil2.b);
    }

    public final void U(String string) {
        if (!this.b.B()) {
            this.u();
        }
        ijh ijh2 = (ijh)this.b;
        Object object = ijh.a;
        string.getClass();
        object = ijh2.b;
        if (!object.c()) {
            ijh2.b = hwv.s((hxk)object);
        }
        ijh2.b.add(string);
    }

    public final void V(int n2) {
        if (!this.b.B()) {
            this.u();
        }
        ijy ijy2 = (ijy)this.b;
        Object object = ijy.a;
        object = ijy2.b;
        if (!object.c()) {
            ijy2.b = hwv.q((hxb)object);
        }
        ijy2.b.g(n2 - 1);
    }

    public final void W(ijz ijz2) {
        if (!this.b.B()) {
            this.u();
        }
        ika ika2 = (ika)this.b;
        Object object = ika.a;
        ijz2.getClass();
        object = ika2.d;
        if (!object.c()) {
            ika2.d = hwv.s((hxk)object);
        }
        ika2.d.add(ijz2);
    }

    public final void X(bor bor2) {
        if (!this.b.B()) {
            this.u();
        }
        kcw kcw2 = (kcw)this.b;
        Object object = kcw.a;
        bor2.getClass();
        object = kcw2.d;
        if (!object.c()) {
            kcw2.d = hwv.s((hxk)object);
        }
        kcw2.d.add(bor2);
    }

    public final void Y(Iterable iterable) {
        if (!this.b.B()) {
            this.u();
        }
        kdh kdh2 = (kdh)this.b;
        Object object = kdh.a;
        object = kdh2.c;
        if (!object.c()) {
            kdh2.c = hwv.s((hxk)object);
        }
        hvc.g(iterable, kdh2.c);
    }

    public final void Z(Iterable iterable) {
        if (!this.b.B()) {
            this.u();
        }
        kdh kdh2 = (kdh)this.b;
        Object object = kdh.a;
        object = kdh2.d;
        if (!object.c()) {
            kdh2.d = hwv.s((hxk)object);
        }
        hvc.g(iterable, kdh2.d);
    }

    public final void aA(hwp hyg2) {
        if (!this.b.B()) {
            this.u();
        }
        ikm ikm2 = (ikm)this.b;
        hyg2 = (ikl)((hwp)hyg2).o();
        Object object = ikm.a;
        hyg2.getClass();
        object = ikm2.b;
        if (!object.c()) {
            ikm2.b = hwv.s((hxk)object);
        }
        ikm2.b.add(hyg2);
    }

    public final void aB(hwp hyg2) {
        if (!this.b.B()) {
            this.u();
        }
        kel kel2 = (kel)this.b;
        hyg2 = (keq)((hwp)hyg2).o();
        Object object = kel.a;
        hyg2.getClass();
        object = kel2.j;
        if (!object.c()) {
            kel2.j = hwv.s((hxk)object);
        }
        kel2.j.add(hyg2);
    }

    public final kdl aa(int n2) {
        return (kdl)((kdm)this.b).m.get(n2);
    }

    public final kdl ab(int n2) {
        return (kdl)((kdm)this.b).o.get(n2);
    }

    public final kdl ac(int n2) {
        return (kdl)((kdm)this.b).l.get(n2);
    }

    public final kdl ad(int n2) {
        return (kdl)((kdm)this.b).k.get(n2);
    }

    public final kdl ae(int n2) {
        return (kdl)((kdm)this.b).h.get(n2);
    }

    public final kdl af(int n2) {
        return (kdl)((kdm)this.b).i.get(n2);
    }

    public final kdl ag(int n2) {
        return (kdl)((kdm)this.b).j.get(n2);
    }

    public final void ah(Iterable iterable) {
        if (!this.b.B()) {
            this.u();
        }
        kdm kdm2 = (kdm)this.b;
        kdm kdm3 = kdm.a;
        kdm2.c();
        hvc.g(iterable, kdm2.m);
    }

    public final void ai(Iterable iterable) {
        if (!this.b.B()) {
            this.u();
        }
        kdm kdm2 = (kdm)this.b;
        kdm kdm3 = kdm.a;
        kdm2.h();
        hvc.g(iterable, kdm2.o);
    }

    public final void aj(Iterable iterable) {
        if (!this.b.B()) {
            this.u();
        }
        kdm kdm2 = (kdm)this.b;
        Object object = kdm.a;
        object = kdm2.r;
        if (!object.c()) {
            kdm2.r = hwv.s((hxk)object);
        }
        hvc.g(iterable, kdm2.r);
    }

    public final void ak(Iterable iterable) {
        if (!this.b.B()) {
            this.u();
        }
        kdm kdm2 = (kdm)this.b;
        Object object = kdm.a;
        object = kdm2.q;
        if (!object.c()) {
            kdm2.q = hwv.s((hxk)object);
        }
        hvc.g(iterable, kdm2.q);
    }

    public final void al(Iterable iterable) {
        if (!this.b.B()) {
            this.u();
        }
        kdm kdm2 = (kdm)this.b;
        kdm kdm3 = kdm.a;
        kdm2.G();
        hvc.g(iterable, kdm2.l);
    }

    public final void am(Iterable iterable) {
        if (!this.b.B()) {
            this.u();
        }
        kdm kdm2 = (kdm)this.b;
        kdm kdm3 = kdm.a;
        kdm2.H();
        hvc.g(iterable, kdm2.k);
    }

    public final void an(Iterable iterable) {
        if (!this.b.B()) {
            this.u();
        }
        kdm kdm2 = (kdm)this.b;
        kdm kdm3 = kdm.a;
        kdm2.I();
        hvc.g(iterable, kdm2.h);
    }

    public final void ao(Iterable iterable) {
        if (!this.b.B()) {
            this.u();
        }
        kdm kdm2 = (kdm)this.b;
        kdm kdm3 = kdm.a;
        kdm2.J();
        hvc.g(iterable, kdm2.i);
    }

    public final void ap(Iterable iterable) {
        if (!this.b.B()) {
            this.u();
        }
        kdm kdm2 = (kdm)this.b;
        kdm kdm3 = kdm.a;
        kdm2.K();
        hvc.g(iterable, kdm2.j);
    }

    public final void aq(int n2, kdl kdl2) {
        if (!this.b.B()) {
            this.u();
        }
        kdm kdm2 = (kdm)this.b;
        kdm kdm3 = kdm.a;
        kdl2.getClass();
        kdm2.c();
        kdm2.m.set(n2, kdl2);
    }

    public final void ar(int n2, kdl kdl2) {
        if (!this.b.B()) {
            this.u();
        }
        kdm kdm2 = (kdm)this.b;
        kdm kdm3 = kdm.a;
        kdl2.getClass();
        kdm2.h();
        kdm2.o.set(n2, kdl2);
    }

    public final void as(int n2, kdl kdl2) {
        if (!this.b.B()) {
            this.u();
        }
        kdm kdm2 = (kdm)this.b;
        kdm kdm3 = kdm.a;
        kdl2.getClass();
        kdm2.G();
        kdm2.l.set(n2, kdl2);
    }

    public final void at(int n2, kdl kdl2) {
        if (!this.b.B()) {
            this.u();
        }
        kdm kdm2 = (kdm)this.b;
        kdm kdm3 = kdm.a;
        kdl2.getClass();
        kdm2.H();
        kdm2.k.set(n2, kdl2);
    }

    public final void au(int n2, kdl kdl2) {
        if (!this.b.B()) {
            this.u();
        }
        kdm kdm2 = (kdm)this.b;
        kdm kdm3 = kdm.a;
        kdl2.getClass();
        kdm2.I();
        kdm2.h.set(n2, kdl2);
    }

    public final void av(int n2, kdl kdl2) {
        if (!this.b.B()) {
            this.u();
        }
        kdm kdm2 = (kdm)this.b;
        kdm kdm3 = kdm.a;
        kdl2.getClass();
        kdm2.J();
        kdm2.i.set(n2, kdl2);
    }

    public final void aw(int n2, kdl kdl2) {
        if (!this.b.B()) {
            this.u();
        }
        kdm kdm2 = (kdm)this.b;
        kdm kdm3 = kdm.a;
        kdl2.getClass();
        kdm2.K();
        kdm2.j.set(n2, kdl2);
    }

    public final void ax(int n2) {
        if (!this.b.B()) {
            this.u();
        }
        kfi kfi2 = (kfi)this.b;
        Object object = kfi.a;
        object = kfi2.c;
        if (!object.c()) {
            kfi2.c = hwv.q((hxb)object);
        }
        kfi2.c.g(n2);
    }

    public final void ay(int n2) {
        if (!this.b.B()) {
            this.u();
        }
        kfi kfi2 = (kfi)this.b;
        Object object = kfi.a;
        object = kfi2.b;
        if (!object.c()) {
            kfi2.b = hwv.q((hxb)object);
        }
        kfi2.b.g(n2);
    }

    public final void az(hwp hyg2) {
        if (!this.b.B()) {
            this.u();
        }
        csm csm2 = (csm)this.b;
        hyg2 = (csl)((hwp)hyg2).o();
        Object object = csm.a;
        hyg2.getClass();
        object = csm2.h;
        if (!object.c()) {
            csm2.h = hwv.s((hxk)object);
        }
        csm2.h.add(hyg2);
    }

    @Override
    protected final /* synthetic */ hvc b(hvd hvd2) {
        this.x((hwv)hvd2);
        return this;
    }

    public final hwp n() {
        hwp hwp2 = (hwp)this.a.C(5);
        hwp2.b = this.p();
        return hwp2;
    }

    public final hwv o() {
        hwv hwv2 = this.p();
        if (hwv2.v()) {
            return hwv2;
        }
        throw new hzc();
    }

    public hwv p() {
        if (!this.b.B()) {
            return this.b;
        }
        this.b.x();
        return this.b;
    }

    public final hwv q() {
        return this.a.n();
    }

    @Override
    public final /* synthetic */ hyf t() {
        return this.a;
    }

    public void u() {
        hwv hwv2 = this.q();
        hwp.aC(hwv2, this.b);
        this.b = hwv2;
    }

    @Override
    public final boolean v() {
        return hwv.A(this.b, false);
    }

    public final void w(hvy hvy2, hwj hwj2) {
        if (!this.b.B()) {
            this.u();
        }
        try {
            hyo.a.b(this.b).l(this.b, hvz.p(hvy2), hwj2);
            return;
        }
        catch (RuntimeException runtimeException) {
            if (runtimeException.getCause() instanceof IOException) {
                throw (IOException)runtimeException.getCause();
            }
            throw runtimeException;
        }
    }

    public final void x(hwv hwv2) {
        if (!this.a.equals(hwv2)) {
            if (!this.b.B()) {
                this.u();
            }
            hwp.aC(this.b, hwv2);
        }
    }

    public final void y(byte[] byArray, int n2, hwj hwj2) {
        if (!this.b.B()) {
            this.u();
        }
        try {
            hyu hyu2 = hyo.a.b(this.b);
            hwv hwv2 = this.b;
            hvj hvj2 = new hvj(hwj2);
            hyu2.i(hwv2, byArray, 0, n2, hvj2);
            return;
        }
        catch (IOException iOException) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", iOException);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        catch (hxn hxn2) {
            throw hxn2;
        }
    }

    public final void z(ibk ibk2) {
        if (!this.b.B()) {
            this.u();
        }
        bor bor2 = (bor)this.b;
        hyg hyg2 = bor.a;
        ibk2.getClass();
        ibk ibk3 = bor2.d;
        hyg2 = ibk2;
        if (ibk3 != null) {
            ibk ibk4 = ibk.a;
            hyg2 = ibk2;
            if (ibk3 != ibk4) {
                hyg2 = (hwr)ibk4.m(ibk3);
                ((hwp)hyg2).x(ibk2);
                hyg2 = (ibk)((hwr)hyg2).aC();
            }
        }
        bor2.d = hyg2;
        bor2.b |= 2;
    }
}

