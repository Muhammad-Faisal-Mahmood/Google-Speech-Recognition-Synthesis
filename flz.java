/*
 * Decompiled with CFR 0.152.
 */
public final class flz
implements fgr {
    public final fdl a;
    public final fma b;

    public flz(fma fma2, fdl fdl2) {
        this.b = fma2;
        this.a = fdl2;
    }

    @Override
    public final /* synthetic */ void a(boolean bl2) {
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c(fef object) {
        object = gqk.i(new ffd(this, 7));
        this.b.b.execute((Runnable)object);
    }

    @Override
    public final void d(fef fef2) {
    }

    @Override
    public final /* synthetic */ void e(fjm fjm2, fjn fjn2) {
    }

    @Override
    public final /* synthetic */ void f(ifs ifs2) {
    }

    @Override
    public final void g(fgd object) {
        object = gqk.i(new ffe(this, object, 9));
        this.b.b.execute((Runnable)object);
    }

    @Override
    public final void h() {
    }

    @Override
    public final void i(fex object) {
        object = ((fex)object).c.size() > 0 ? (String)((fex)object).c.get(0) : "";
        fma fma2 = this.b;
        object = gqk.i(new ffe((Object)this, object, 10, null));
        fma2.b.execute((Runnable)object);
    }

    @Override
    public final /* synthetic */ void j(iga iga2) {
    }

    @Override
    public final void k() {
    }
}

