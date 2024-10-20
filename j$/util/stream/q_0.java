/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.n;
import j$.util.stream.b_0;
import j$.util.stream.c_0;
import j$.util.stream.e_0;
import j$.util.stream.g;
import j$.util.stream.n_0;
import j$.util.stream.w0_0;
import java.util.concurrent.CountedCompleter;

/*
 * Renamed from j$.util.stream.q
 */
final class q_0
extends e_0 {
    private final n_0 j;
    private final boolean k;

    q_0(n_0 n_02, boolean bl2, b_0 b_02, Spliterator spliterator) {
        super(b_02, spliterator);
        this.k = bl2;
        this.j = n_02;
    }

    q_0(q_0 q_02, Spliterator spliterator) {
        super(q_02, spliterator);
        this.k = q_02.k;
        this.j = q_02.j;
    }

    private void h(Object object) {
        block5: {
            Object object2 = this;
            while (object2 != null) {
                g g2 = (g)c_0.c((g)object2);
                if (g2 != null && g2.d != object2) {
                    object = (e_0)((g)c_0.c(this));
                    object2 = this;
                    while (object != null) {
                        if (((g)object).d == object2) {
                            object2 = (e_0)((g)object).e;
                            if (!((e_0)object2).i) {
                                ((e_0)object2).i = true;
                            }
                        }
                        g2 = (e_0)((g)c_0.c((g)object));
                        object2 = object;
                        object = g2;
                    }
                    break block5;
                }
                object2 = g2;
            }
            n.a(this.h, null, object);
        }
    }

    @Override
    protected final Object a() {
        b_0 b_02 = this.a;
        w0_0 w0_02 = (w0_0)this.j.d.get();
        b_02.u(this.b, w0_02);
        b_02 = w0_02.get();
        if (!this.k) {
            if (b_02 != null) {
                n.a(this.h, null, b_02);
            }
            return null;
        }
        if (b_02 != null) {
            this.h(b_02);
            return b_02;
        }
        return null;
    }

    @Override
    protected final g d(Spliterator spliterator) {
        return new q_0(this, spliterator);
    }

    @Override
    protected final Object g() {
        return this.j.b;
    }

    @Override
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (this.k) {
            q_0 q_02 = (q_0)this.d;
            Object object = null;
            while (q_02 != object) {
                object = q_02.c();
                if (object != null && this.j.c.test(object)) {
                    this.e(object);
                    this.h(object);
                    break;
                }
                q_0 q_03 = (q_0)this.e;
                object = q_02;
                q_02 = q_03;
            }
        }
        super.onCompletion(countedCompleter);
    }
}

