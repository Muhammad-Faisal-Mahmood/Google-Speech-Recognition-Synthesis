/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;

public final class fff
implements fgr {
    public final ffg a;

    public fff(ffg ffg2) {
        this.a = ffg2;
    }

    @Override
    public final void a(boolean bl2) {
        this.l(new bmu(ffc.i, new jdj(this, bl2, 1)));
    }

    @Override
    public final void b() {
        ffc ffc2 = ffc.d;
        fgr fgr2 = this.a.c;
        Objects.requireNonNull(fgr2);
        this.l(new bmu(ffc2, new ffd(fgr2, 2)));
    }

    @Override
    public final void c(fef fef2) {
        this.l(new bmu((Object)ffc.e, new ffe(this, fef2, 0), fef2));
    }

    @Override
    public final void d(fef object) {
        object = this == this.a.f ? "network" : "SODA";
        throw new IllegalStateException("Unexpected #onFallback from ".concat((String)object));
    }

    @Override
    public final void e(fjm fjm2, fjn fjn2) {
        this.l(new bmu(ffc.h, new fbx(this, fjm2, fjn2, 2, null)));
    }

    @Override
    public final /* synthetic */ void f(ifs ifs2) {
    }

    @Override
    public final void g(fgd fgd2) {
        this.l(new bmu(ffc.c, new dpw(this, fgd2, 19, null)));
    }

    @Override
    public final void h() {
        ffc ffc2 = ffc.g;
        fgr fgr2 = this.a.c;
        Objects.requireNonNull(fgr2);
        this.l(new bmu(ffc2, new ffd(fgr2, 3)));
    }

    @Override
    public final void i(fex fex2) {
        this.l(new bmu(ffc.f, new dpw(this, fex2, 20)));
    }

    @Override
    public final /* synthetic */ void j(iga iga2) {
    }

    @Override
    public final void k() {
        ffc ffc2 = ffc.b;
        fgr fgr2 = this.a.c;
        Objects.requireNonNull(fgr2);
        this.l(new bmu(ffc2, new ffd(fgr2, 0)));
    }

    public final void l(bmu object) {
        object = gqk.i(new ffe(this, object, 1));
        this.a.b.execute((Runnable)object);
    }
}

