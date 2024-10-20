/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
import android.util.SparseArray;
import java.io.IOException;

public final class akl
implements aeq,
ani,
alc {
    public final afl a;
    public final akk b;
    public final SparseArray c;
    public afu d;
    public aes e;
    public afp f;
    private final aeu g;
    private final aev h;

    public akl(afl object) {
        abr.i(object);
        this.a = object;
        this.d = new afu(agf.p(), (afl)object, new akg(0));
        this.g = object = new aeu();
        this.h = new aev();
        this.b = new akk((aeu)object);
        this.c = new SparseArray();
    }

    private final akc v(int n2, anc object) {
        abr.i(this.e);
        if (object != null) {
            object = this.b.a((anc)object) != null ? this.r((anc)object) : this.s(aew.a, n2, (anc)object);
            return object;
        }
        aew aew2 = this.e.g();
        object = aew2;
        if (n2 >= aew2.c()) {
            object = aew.a;
        }
        return this.s((aew)object, n2, null);
    }

    private final akc w(aen object) {
        if (object instanceof ail && (object = ((ail)object).h) != null) {
            return this.r((anc)object);
        }
        return this.q();
    }

    @Override
    public final void A(int n2, anc object, hti hti2) {
        object = this.v(n2, (anc)object);
        this.u((akc)object, 1004, new akh((akc)object, hti2));
    }

    @Override
    public final void B(int n2, anc anc2, amv amv2, hti hti2) {
        this.u(this.v(n2, anc2), 1002, new akd(19));
    }

    @Override
    public final void C(int n2, anc anc2, amv amv2, hti hti2) {
        this.u(this.v(n2, anc2), 1001, new aki(0));
    }

    @Override
    public final void D(int n2, anc anc2, amv amv2, hti hti2, IOException iOException, boolean bl2) {
        this.u(this.v(n2, anc2), 1003, new akd(10));
    }

    @Override
    public final void E(int n2, anc anc2, amv amv2, hti hti2) {
        this.u(this.v(n2, anc2), 1000, new akd(6));
    }

    @Override
    public final void a(int n2) {
        this.u(this.q(), 4, new aki(1));
    }

    @Override
    public final void b(aen aen2) {
        this.u(this.w(aen2), 10, new air(aen2, 12));
    }

    @Override
    public final void c(aen aen2) {
        this.u(this.w(aen2), 10, new akd(16));
    }

    @Override
    public final void d() {
        this.u(this.q(), 13, new akd(7));
    }

    @Override
    public final void e() {
        this.u(this.q(), 3, new akd(4));
    }

    @Override
    public final void f() {
        this.u(this.q(), 7, new akd(12));
    }

    @Override
    public final void g() {
        this.u(this.q(), 1, new akd(9));
    }

    @Override
    public final void h() {
        this.u(this.q(), 14, new aki(4));
    }

    @Override
    public final void i() {
        this.u(this.q(), 5, new akd(17));
    }

    @Override
    public final void j() {
        this.u(this.q(), 12, new akd(0));
    }

    @Override
    public final void k() {
        this.u(this.q(), 6, new akd(15));
    }

    @Override
    public final void l() {
        this.u(this.q(), -1, new akd(11));
    }

    @Override
    public final void m(int n2) {
        int n3 = n2;
        if (n2 == 1) {
            n3 = 1;
        }
        akk akk2 = this.b;
        aes aes2 = this.e;
        abr.i(aes2);
        akk2.c = akk.b(aes2, akk2.b, akk2.d, akk2.a);
        this.u(this.q(), 11, new akj(n3));
    }

    @Override
    public final void n() {
        this.u(this.t(), 24, new aki(5));
    }

    @Override
    public final void o() {
        aes aes2 = this.e;
        abr.i(aes2);
        akk akk2 = this.b;
        akk2.c = akk.b(aes2, akk2.b, akk2.d, akk2.a);
        akk2.c(aes2.g());
        this.u(this.q(), 0, new akd(8));
    }

    @Override
    public final void p() {
        this.u(this.q(), 2, new akd(13));
    }

    public final akc q() {
        return this.r(this.b.c);
    }

    public final akc r(anc object) {
        abr.i(this.e);
        aew aew2 = object == null ? null : this.b.a((anc)object);
        if (object != null && aew2 != null) {
            aeu aeu2 = this.g;
            return this.s(aew2, aew2.n((Object)((anc)object).a, (aeu)aeu2).c, (anc)object);
        }
        int n2 = this.e.c();
        aew2 = this.e.g();
        object = aew2;
        if (n2 >= aew2.c()) {
            object = aew.a;
        }
        return this.s((aew)object, n2, null);
    }

    protected final akc s(aew aew2, int n2, anc anc2) {
        Object object;
        long l2;
        boolean bl2 = aew2.p();
        int n3 = 1;
        if (bl2) {
            anc2 = null;
        }
        long l3 = this.a.a();
        if (!aew2.equals(this.e.g()) || n2 != this.e.c()) {
            n3 = 0;
        }
        long l4 = 0L;
        if (anc2 != null && anc2.b()) {
            l2 = l4;
            if (n3 != 0) {
                l2 = l4;
                if (this.e.a() == anc2.b) {
                    l2 = l4;
                    if (this.e.b() == anc2.c) {
                        l2 = this.e.f();
                    }
                }
            }
        } else if (n3 != 0) {
            object = (aiy)this.e;
            ((aiy)object).t();
            l2 = ((aiy)object).p(((aiy)object).o);
        } else {
            l2 = aew2.p() ? l4 : aew2.o(n2, this.h).a();
        }
        anc anc3 = this.b.c;
        object = this.e.g();
        n3 = this.e.c();
        l4 = this.e.f();
        aiy aiy2 = (aiy)this.e;
        aiy2.t();
        return new akc(l3, aew2, n2, anc2, l2, (aew)object, n3, anc3, l4, agf.m(aiy2.o.r));
    }

    public final akc t() {
        return this.r(this.b.e);
    }

    public final void u(akc akc2, int n2, afr afr2) {
        this.c.put(n2, (Object)akc2);
        this.d.e(n2, afr2);
    }
}

