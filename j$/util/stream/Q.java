/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.H;
import j$.util.stream.L;
import j$.util.stream.b_0;
import j$.util.stream.g;
import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

class Q
extends g {
    protected final b_0 h;
    protected final LongFunction i;
    protected final BinaryOperator j;

    Q(Q q2, Spliterator spliterator) {
        super(q2, spliterator);
        this.h = q2.h;
        this.i = q2.i;
        this.j = q2.j;
    }

    Q(b_0 b_02, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(b_02, spliterator);
        this.h = b_02;
        this.i = longFunction;
        this.j = binaryOperator;
    }

    @Override
    protected final Object a() {
        H h2 = (H)this.i.apply(this.h.g(this.b));
        this.h.u(this.b, h2);
        return h2.p();
    }

    @Override
    protected final g d(Spliterator spliterator) {
        return new Q(this, spliterator);
    }

    @Override
    public final void onCompletion(CountedCompleter countedCompleter) {
        g g2 = this.d;
        if (g2 != null) {
            this.e((L)this.j.apply((L)((Q)g2).c(), (L)((Q)this.e).c()));
        }
        super.onCompletion(countedCompleter);
    }
}

