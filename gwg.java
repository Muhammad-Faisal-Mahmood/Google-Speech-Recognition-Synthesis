/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gvt
 */
import java.lang.ref.ReferenceQueue;

final class gwg
extends gwh {
    volatile long a = Long.MAX_VALUE;
    gws b;
    gws c;
    volatile long d;
    gws e;
    gws f;

    public gwg(ReferenceQueue referenceQueue, Object object, int n2, gws gws2) {
        super(referenceQueue, object, n2, gws2);
        n2 = gwr.x;
        referenceQueue = gvt.a;
        this.b = referenceQueue;
        this.c = referenceQueue;
        this.d = Long.MAX_VALUE;
        referenceQueue = gvt.a;
        this.e = referenceQueue;
        this.f = referenceQueue;
    }

    @Override
    public final long b() {
        return this.a;
    }

    @Override
    public final long c() {
        return this.d;
    }

    @Override
    public final gws f() {
        return this.b;
    }

    @Override
    public final gws g() {
        return this.e;
    }

    @Override
    public final gws h() {
        return this.c;
    }

    @Override
    public final gws i() {
        return this.f;
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
    public final void m(gws gws2) {
        this.e = gws2;
    }

    @Override
    public final void n(gws gws2) {
        this.c = gws2;
    }

    @Override
    public final void o(gws gws2) {
        this.f = gws2;
    }

    @Override
    public final void q(long l2) {
        this.d = l2;
    }
}

