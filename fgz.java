/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Function;

public final class fgz
implements fgr {
    final fha a;

    public fgz(fha fha2) {
        this.a = fha2;
    }

    @Override
    public final /* synthetic */ void a(boolean bl2) {
    }

    @Override
    public final void b() {
        dyj dyj2 = dxv.e.b("requestId", this.a.e);
        this.a.b.a(dyj2);
    }

    @Override
    public final void c(fef fef2) {
        this.a.c(fef2);
    }

    @Override
    public final void d(fef object) {
        dyj dyj2 = dxv.u.b("requestId", this.a.e);
        object = ((fef)object).a;
        dyj2.q(((fdr)object).a, ((fdr)object).b());
        this.a.b.a(dyj2);
    }

    @Override
    public final /* synthetic */ void e(fjm fjm2, fjn fjn2) {
    }

    @Override
    public final /* synthetic */ void f(ifs ifs2) {
    }

    @Override
    public final void g(fgd object) {
        object = new fja(object, 1);
        this.a.f((Function)object);
    }

    @Override
    public final void h() {
    }

    @Override
    public final void i(fex fex2) {
        hwp hwp2 = fgd.a.l();
        String string = (String)fex2.c.get(0);
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        fgd fgd2 = (fgd)hwp2.b;
        string.getClass();
        fgd2.b |= 1;
        fgd2.c = string;
        fgd2 = (fgd)hwp2.o();
        if (this.a.g(new fbi(fgd2, fex2, 2))) {
            this.a.e();
        }
    }

    @Override
    public final /* synthetic */ void j(iga iga2) {
    }

    @Override
    public final void k() {
        Object object = new fcx(7);
        this.a.f((Function)object);
        object = dxv.d.b("requestId", this.a.e);
        this.a.b.a((dyk)object);
    }
}

