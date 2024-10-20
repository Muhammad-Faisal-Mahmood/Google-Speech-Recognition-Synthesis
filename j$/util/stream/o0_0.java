/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.I;
import j$.util.stream.M0;
import j$.util.stream.b_0;
import j$.util.stream.q0_0;

/*
 * Renamed from j$.util.stream.o0
 */
final class o0_0
extends I {
    @Override
    public final Object a(b_0 object, Spliterator spliterator) {
        object = M0.SIZED.s(((b_0)object).i()) ? Long.valueOf(spliterator.l()) : (Long)super.a((b_0)object, spliterator);
        return object;
    }

    @Override
    public final Object b(b_0 object, Spliterator spliterator) {
        object = M0.SIZED.s(((b_0)object).i()) ? Long.valueOf(spliterator.l()) : (Long)super.b((b_0)object, spliterator);
        return object;
    }

    @Override
    public final int d() {
        return M0.q;
    }

    @Override
    public final q0_0 n() {
        return new Object();
    }
}

