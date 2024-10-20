/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gvt
 */
final class gwb
extends gvz {
    volatile long a = Long.MAX_VALUE;
    gws b;
    gws c;

    public gwb(Object object, int n2, gws gws2) {
        super(object, n2, gws2);
        n2 = gwr.x;
        this.b = object = gvt.a;
        this.c = object;
    }

    @Override
    public final long c() {
        return this.a;
    }

    @Override
    public final gws g() {
        return this.b;
    }

    @Override
    public final gws i() {
        return this.c;
    }

    @Override
    public final void m(gws gws2) {
        this.b = gws2;
    }

    @Override
    public final void o(gws gws2) {
        this.c = gws2;
    }

    @Override
    public final void q(long l2) {
        this.a = l2;
    }
}

