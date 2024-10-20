/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.stream.M0;
import j$.util.stream.N0;
import j$.util.stream.V0;
import j$.util.stream.b_0;
import j$.util.stream.h_0;
import j$.util.stream.q_0;
import j$.util.stream.w0_0;

/*
 * Renamed from j$.util.stream.n
 */
final class n_0
implements V0 {
    final int a;
    final Optional b;
    final h_0 c;
    final h_0 d;

    n_0(boolean bl2, N0 n0, Optional optional, h_0 h_02, h_0 h_03) {
        int n2 = M0.t;
        int n3 = bl2 ? 0 : M0.q;
        this.a = n3 | n2;
        this.b = optional;
        this.c = h_02;
        this.d = h_03;
    }

    @Override
    public final Object a(b_0 object, Spliterator spliterator) {
        w0_0 w0_02 = (w0_0)this.d.get();
        ((b_0)object).u(spliterator, w0_02);
        object = w0_02.get();
        if (object == null) {
            object = this.b;
        }
        return object;
    }

    @Override
    public final Object b(b_0 b_02, Spliterator spliterator) {
        return new q_0(this, M0.ORDERED.s(b_02.i()), b_02, spliterator).invoke();
    }

    @Override
    public final int d() {
        return this.a;
    }
}

