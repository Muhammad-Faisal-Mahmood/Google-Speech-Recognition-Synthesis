/*
 * Decompiled with CFR 0.152.
 */
public final class gm
implements wq {
    int a;
    final gn b;
    private boolean c;

    protected gm(gn gn2) {
        this.b = gn2;
        this.c = false;
    }

    @Override
    public final void a() {
        if (this.c) {
            return;
        }
        gn gn2 = this.b;
        gn2.f = null;
        gn.b(gn2, this.a);
    }

    @Override
    public final void b() {
        gn.d(this.b);
        this.c = false;
    }

    @Override
    public final void c() {
        this.c = true;
    }

    public final void d(bzb bzb2, int n2) {
        this.b.f = bzb2;
        this.a = n2;
    }
}

