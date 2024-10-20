/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.B0;
import j$.util.stream.M0;
import j$.util.stream.b_0;
import j$.util.stream.c_0;
import j$.util.stream.g;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinTask;

/*
 * Renamed from j$.util.stream.t
 */
final class t_0
extends CountedCompleter {
    private Spliterator a;
    private final B0 b;
    private final b_0 c;
    private long d;

    t_0(b_0 b_02, Spliterator spliterator, B0 b0) {
        super(null);
        this.b = b0;
        this.c = b_02;
        this.a = spliterator;
        this.d = 0L;
    }

    t_0(t_0 t_02, Spliterator spliterator) {
        super(t_02);
        this.a = spliterator;
        this.b = t_02.b;
        this.d = t_02.d;
        this.c = t_02.c;
    }

    @Override
    public final void compute() {
        long l2;
        Spliterator spliterator = this.a;
        long l3 = spliterator.d();
        long l4 = l2 = this.d;
        if (l2 == 0L) {
            this.d = l4 = g.f(l3);
        }
        boolean bl2 = M0.SHORT_CIRCUIT.s(this.c.i());
        B0 b0 = this.b;
        boolean bl3 = false;
        Object object = this;
        while (!bl2 || !b0.j()) {
            Object object2;
            if (l3 > l4 && (object2 = spliterator.b()) != null) {
                t_0 t_02 = new t_0((t_0)object, (Spliterator)object2);
                c_0.g((t_0)object);
                if (bl3) {
                    spliterator = object2;
                } else {
                    object2 = t_02;
                    t_02 = object;
                    object = object2;
                }
                bl3 ^= true;
                ((ForkJoinTask)object).fork();
                l3 = spliterator.d();
                object = t_02;
                continue;
            }
            ((t_0)object).c.b(spliterator, b0);
            break;
        }
        ((t_0)object).a = null;
        c_0.n((t_0)object);
    }
}

