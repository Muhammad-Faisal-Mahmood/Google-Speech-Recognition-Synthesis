/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;

abstract class jds
implements jcj {
    @Override
    public final its a() {
        throw null;
    }

    @Override
    public final void b(jeh jeh2) {
        this.p().b(jeh2);
    }

    @Override
    public final void c(iyh iyh2) {
        this.p().c(iyh2);
    }

    @Override
    public final void d() {
        this.p().d();
    }

    @Override
    public final void e() {
        this.p().e();
    }

    @Override
    public final void f() {
        this.p().f();
    }

    @Override
    public final void g(int n2) {
        this.p().g(n2);
    }

    @Override
    public final void h(iuf iuf2) {
        this.p().h(iuf2);
    }

    @Override
    public final void i(iut iut2) {
        this.p().i(iut2);
    }

    @Override
    public final void j(iuw iuw2) {
        this.p().j(iuw2);
    }

    @Override
    public final void k(int n2) {
        this.p().k(n2);
    }

    @Override
    public final void l(int n2) {
        this.p().l(n2);
    }

    @Override
    public void m(jcl jcl2) {
        throw null;
    }

    @Override
    public final void n(InputStream inputStream) {
        this.p().n(inputStream);
    }

    @Override
    public final boolean o() {
        return this.p().o();
    }

    protected abstract jcj p();

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.b("delegate", this.p());
        return gtn2.toString();
    }
}

