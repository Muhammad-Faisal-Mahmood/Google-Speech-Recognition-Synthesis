/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.D;
import j$.util.stream.E;
import j$.util.stream.M0;
import j$.util.stream.N0;
import j$.util.stream.V0;
import j$.util.stream.b_0;
import j$.util.stream.g_0;
import java.util.function.Supplier;

final class F
implements V0 {
    final E a;
    final Supplier b;

    F(N0 n0, E e2, Supplier supplier) {
        this.a = e2;
        this.b = supplier;
    }

    @Override
    public final Object a(b_0 b_02, Spliterator spliterator) {
        D d2 = (D)this.b.get();
        b_02.u(spliterator, d2);
        return d2.b;
    }

    @Override
    public final Object b(b_0 b_02, Spliterator spliterator) {
        return (Boolean)new g_0(this, b_02, spliterator).invoke();
    }

    @Override
    public final int d() {
        return M0.t | M0.q;
    }
}

