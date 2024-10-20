/*
 * Decompiled with CFR 0.152.
 */
class gvz
extends gvb {
    final Object g;
    final int h;
    final gws i;
    volatile gwd j = gwr.b;

    public gvz(Object object, int n2, gws gws2) {
        this.g = object;
        this.h = n2;
        this.i = gws2;
    }

    @Override
    public final int a() {
        return this.h;
    }

    @Override
    public final gwd d() {
        return this.j;
    }

    @Override
    public final gws e() {
        return this.i;
    }

    @Override
    public final Object j() {
        return this.g;
    }

    @Override
    public final void p(gwd gwd2) {
        this.j = gwd2;
    }
}

