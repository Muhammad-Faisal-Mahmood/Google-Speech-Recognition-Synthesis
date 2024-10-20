/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.n;
import j$.util.stream.D;
import j$.util.stream.E;
import j$.util.stream.F;
import j$.util.stream.b_0;
import j$.util.stream.e_0;
import j$.util.stream.g;

/*
 * Renamed from j$.util.stream.G
 */
final class g_0
extends e_0 {
    private final F j;

    g_0(F f2, b_0 b_02, Spliterator spliterator) {
        super(b_02, spliterator);
        this.j = f2;
    }

    g_0(g_0 g_02, Spliterator spliterator) {
        super(g_02, spliterator);
        this.j = g_02.j;
    }

    @Override
    protected final Object a() {
        b_0 b_02 = this.a;
        D d2 = (D)this.j.b.get();
        b_02.u(this.b, d2);
        boolean bl2 = d2.b;
        if (bl2 == E.g(this.j.a)) {
            n.a(this.h, null, bl2);
        }
        return null;
    }

    @Override
    protected final g d(Spliterator spliterator) {
        return new g_0(this, spliterator);
    }

    @Override
    protected final Object g() {
        return E.g(this.j.a) ^ true;
    }
}

