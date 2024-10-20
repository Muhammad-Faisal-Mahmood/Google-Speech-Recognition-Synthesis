/*
 * Decompiled with CFR 0.152.
 */
public final class amw
implements anb,
ana {
    public final anc a;
    public final long b;
    public ane c;
    public anb d;
    public long e;
    private ana f;
    private final apb g;

    public amw(anc anc2, apb apb2, long l2) {
        this.a = anc2;
        this.g = apb2;
        this.b = l2;
        this.e = -9223372036854775807L;
    }

    private final long q(long l2) {
        long l3 = this.e;
        if (l3 != -9223372036854775807L) {
            return l3;
        }
        return l2;
    }

    @Override
    public final long a(long l2, aka aka2) {
        anb anb2 = this.d;
        int n2 = agf.a;
        return anb2.a(l2, aka2);
    }

    @Override
    public final void c(anb object) {
        object = this.f;
        int n2 = agf.a;
        object.c(this);
    }

    @Override
    public final long d() {
        anb anb2 = this.d;
        int n2 = agf.a;
        return anb2.d();
    }

    @Override
    public final long e() {
        anb anb2 = this.d;
        int n2 = agf.a;
        return anb2.e();
    }

    @Override
    public final long f() {
        anb anb2 = this.d;
        int n2 = agf.a;
        return anb2.f();
    }

    @Override
    public final long g(long l2) {
        anb anb2 = this.d;
        int n2 = agf.a;
        return anb2.g(l2);
    }

    @Override
    public final aob h() {
        anb anb2 = this.d;
        int n2 = agf.a;
        return anb2.h();
    }

    @Override
    public final void i() {
        Object object = this.d;
        if (object != null) {
            object.i();
            return;
        }
        object = this.c;
        if (object != null) {
            object.t();
        }
    }

    @Override
    public final void j(ana object, long l2) {
        this.f = object;
        object = this.d;
        if (object != null) {
            object.j(this, this.q(this.b));
        }
    }

    @Override
    public final void k(long l2) {
        anb anb2 = this.d;
        int n2 = agf.a;
        anb2.k(l2);
    }

    @Override
    public final boolean l(ajh ajh2) {
        anb anb2 = this.d;
        return anb2 != null && anb2.l(ajh2);
    }

    @Override
    public final boolean m() {
        anb anb2 = this.d;
        return anb2 != null && anb2.m();
    }

    public final void n(anc object) {
        long l2 = this.q(this.b);
        ane ane2 = this.c;
        abr.i(ane2);
        this.d = object = ane2.B((anc)object, this.g, l2);
        if (this.f != null) {
            object.j(this, l2);
        }
    }

    @Override
    public final long o(aoh[] aohArray, boolean[] blArray, anv[] anvArray, boolean[] blArray2, long l2) {
        long l3 = this.e;
        if (l3 != -9223372036854775807L && l2 == this.b) {
            l2 = l3;
        }
        this.e = -9223372036854775807L;
        anb anb2 = this.d;
        int n2 = agf.a;
        return anb2.o(aohArray, blArray, anvArray, blArray2, l2);
    }

    @Override
    public final void p(long l2) {
        anb anb2 = this.d;
        int n2 = agf.a;
        anb2.p(l2);
    }
}

