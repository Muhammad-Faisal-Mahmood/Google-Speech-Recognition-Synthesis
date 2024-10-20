/*
 * Decompiled with CFR 0.152.
 */
final class cun
implements csv {
    final cvg a;
    final csu b;
    final sk c;
    final sp d;
    final int e;
    final String f;
    final cuq g;

    public cun(cuq cuq2, cvg cvg2, csu csu2, sk sk2, sp sp2, int n2, String string) {
        this.a = cvg2;
        this.b = csu2;
        this.c = sk2;
        this.d = sp2;
        this.e = n2;
        this.f = string;
        this.g = cuq2;
    }

    @Override
    public final void a(csg csg2) {
        sk sk2 = this.c;
        sp sp2 = this.d;
        int n2 = this.e;
        cvg cvg2 = this.a;
        fxf.ai(new cum(this, this.b, csg2, sk2, sp2, n2, cvg2, 1), this.g.d);
    }

    @Override
    public final void b(Throwable throwable) {
        csu csu2 = this.b;
        sk sk2 = this.c;
        sp sp2 = this.d;
        cvg cvg2 = this.a;
        fxf.ai(new cum(this, csu2, sk2, sp2, this.e, throwable, cvg2, 0), this.g.d);
    }

    @Override
    public final void c(long l2) {
        Object object = this.g.i;
        sp sp2 = this.d;
        object = ((czh)object).h(this.a.a);
        csu csu2 = this.b;
        int n2 = this.e;
        fxf.ak((hpn)object, new cwc(csu2, this.c, l2, sp2, n2, 1), this.g.d);
    }

    @Override
    public final void d() {
        fxf.ak(this.g.i.g(this.a.a), new cwe(this.b, this.c, this.f, this.d, this.e, 1), this.g.d);
    }
}

