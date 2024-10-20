/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gvt
 */
import java.lang.ref.ReferenceQueue;

final class gwj
extends gwh {
    volatile long a = Long.MAX_VALUE;
    gws b;
    gws c;

    public gwj(ReferenceQueue referenceQueue, Object object, int n2, gws gws2) {
        super(referenceQueue, object, n2, gws2);
        n2 = gwr.x;
        referenceQueue = gvt.a;
        this.b = referenceQueue;
        this.c = referenceQueue;
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

