/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.A;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.stream.B0;
import j$.util.stream.E;
import j$.util.stream.F;
import j$.util.stream.H;
import j$.util.stream.I;
import j$.util.stream.I0;
import j$.util.stream.IntStream;
import j$.util.stream.J;
import j$.util.stream.L;
import j$.util.stream.M0;
import j$.util.stream.N0;
import j$.util.stream.O0;
import j$.util.stream.Q;
import j$.util.stream.Stream;
import j$.util.stream.V;
import j$.util.stream.Y0;
import j$.util.stream.b0_0;
import j$.util.stream.b_0;
import j$.util.stream.h_0;
import j$.util.stream.i0_0;
import j$.util.stream.u_0;
import j$.util.stream.w_0;
import j$.util.stream.x_0;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.Supplier;

/*
 * Renamed from j$.util.stream.z
 */
abstract class z_0
extends b_0
implements IntStream {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    final L f(b_0 object, Spliterator object2, boolean bl2, IntFunction object3) {
        long l2 = ((b_0)object).g((Spliterator)object2);
        if (l2 >= 0L && object2.k(16384)) {
            if (l2 >= 0x7FFFFFF7L) throw new IllegalArgumentException("Stream size exceeds max array size");
            object3 = new int[(int)l2];
            new b0_0((Spliterator)object2, (b_0)object, (int[])object3).invoke();
            return new V((int[])object3);
        }
        object = object2 = (J)new Q((b_0)object, (Spliterator)object2, new h_0(4), new h_0(5)).invoke();
        if (!bl2) return object;
        return I.k((J)object2);
    }

    @Override
    public final IntStream filter(IntPredicate intPredicate) {
        Objects.requireNonNull(intPredicate);
        return new x_0(this, M0.s, intPredicate, 0);
    }

    @Override
    final boolean h(Spliterator object, B0 b0) {
        block5: {
            block8: {
                boolean bl2;
                A a2;
                block7: {
                    block6: {
                        if (!(object instanceof A)) break block5;
                        a2 = (A)object;
                        if (!(b0 instanceof IntConsumer)) break block6;
                        object = (IntConsumer)((Object)b0);
                        break block7;
                    }
                    if (Y0.a) break block8;
                    Objects.requireNonNull(b0);
                    object = new u_0(b0);
                }
                while (!(bl2 = b0.j()) && a2.g((IntConsumer)object)) {
                }
                return bl2;
            }
            Y0.a(b_0.class, "using IntStream.adapt(Sink<Integer> s)");
            throw null;
        }
        if (Y0.a) {
            Y0.a(b_0.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    @Override
    final H m(long l2, IntFunction object) {
        object = l2 >= 0L && l2 < 0x7FFFFFF7L ? new V(l2) : new I0();
        return object;
    }

    public final Stream mapToObj(IntFunction intFunction) {
        Objects.requireNonNull(intFunction);
        return new w_0(this, M0.o | M0.n, intFunction, 0);
    }

    @Override
    public final boolean noneMatch(IntPredicate intPredicate) {
        E e2 = E.NONE;
        Objects.requireNonNull(intPredicate);
        Objects.requireNonNull(e2);
        return (Boolean)this.d(new F(N0.INT_VALUE, e2, new j$.util.stream.A(0, (Object)e2, intPredicate)));
    }

    @Override
    public final int sum() {
        h_0 h_02 = new h_0(20);
        Objects.requireNonNull(h_02);
        return (Integer)this.d(new i0_0(N0.INT_VALUE, h_02, 1));
    }

    @Override
    final Spliterator t(b_0 b_02, Supplier supplier, boolean bl2) {
        return new O0(b_02, supplier, bl2);
    }

    @Override
    public final int[] toArray() {
        return (int[])I.k((J)this.e(new h_0(19))).b();
    }
}

