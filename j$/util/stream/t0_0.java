/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.I;
import j$.util.stream.b_0;
import j$.util.stream.g;
import j$.util.stream.q0_0;
import java.util.concurrent.CountedCompleter;

/*
 * Renamed from j$.util.stream.t0
 */
final class t0_0
extends g {
    private final I h;

    t0_0(I i2, b_0 b_02, Spliterator spliterator) {
        super(b_02, spliterator);
        this.h = i2;
    }

    t0_0(t0_0 t0_02, Spliterator spliterator) {
        super(t0_02, spliterator);
        this.h = t0_02.h;
    }

    @Override
    protected final Object a() {
        b_0 b_02 = this.a;
        q0_0 q0_02 = this.h.n();
        b_02.u(this.b, q0_02);
        return q0_02;
    }

    @Override
    protected final g d(Spliterator spliterator) {
        return new t0_0(this, spliterator);
    }

    @Override
    public final void onCompletion(CountedCompleter countedCompleter) {
        Object object = this.d;
        if (object != null) {
            object = (q0_0)((t0_0)object).c();
            object.i((q0_0)((t0_0)this.e).c());
            this.e(object);
        }
        super.onCompletion(countedCompleter);
    }
}

