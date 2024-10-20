/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gvt
 */
final class gvx
extends gvz {
    volatile long a = Long.MAX_VALUE;
    gws b;
    gws c;

    public gvx(Object object, int n2, gws gws2) {
        super(object, n2, gws2);
        n2 = gwr.x;
        this.b = object = gvt.a;
        this.c = object;
    }

    @Override
    public final long b() {
        return this.a;
    }

    @Override
    public final gws f() {
        return this.b;
    }

    @Override
    public final gws h() {
        return this.c;
    }

    @Override
    public final void k(long l2) {
        this.a = l2;
    }

    @Override
    public final void l(gws gws2) {
        this.b = gws2;
    }

    @Override
    public final void n(gws gws2) {
        this.c = gws2;
    }
}

