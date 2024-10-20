/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.A;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.stream.A0;
import j$.util.stream.E;
import j$.util.stream.F;
import j$.util.stream.IntStream;
import j$.util.stream.J;
import j$.util.stream.L;
import j$.util.stream.M0;
import j$.util.stream.N;
import j$.util.stream.N0;
import j$.util.stream.Stream;
import j$.util.stream.V;
import j$.util.stream.V0;
import j$.util.stream.Y0;
import j$.util.stream.b_0;
import j$.util.stream.g0_0;
import j$.util.stream.q0_0;
import j$.util.stream.t0_0;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public abstract class I
implements V0 {
    public static void c() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void e(A0 a0, Integer n2) {
        if (!Y0.a) {
            a0.accept(n2);
            return;
        }
        Y0.a(a0.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
        throw null;
    }

    public static /* bridge */ /* synthetic */ void f(A0 a0, Object object) {
        a0.f((Integer)object);
    }

    public static Object[] g(J j2, IntFunction objectArray) {
        if (!Y0.a) {
            if (j2.count() < 0x7FFFFFF7L) {
                objectArray = (Object[])objectArray.apply((int)j2.count());
                j2.g(objectArray, 0);
                return objectArray;
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Y0.a(j2.getClass(), "{0} calling Node.OfPrimitive.asArray");
        throw null;
    }

    public static void h(J object, Integer[] integerArray, int n2) {
        if (!Y0.a) {
            object = (int[])object.b();
            for (int i2 = 0; i2 < ((Object)object).length; ++i2) {
                integerArray[n2 + i2] = (int)object[i2];
            }
            return;
        }
        Y0.a(object.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
        throw null;
    }

    public static void i(J j2, Consumer consumer) {
        block4: {
            block3: {
                block2: {
                    if (!(consumer instanceof IntConsumer)) break block2;
                    j2.l((IntConsumer)((Object)consumer));
                    break block3;
                }
                if (Y0.a) break block4;
                ((A)j2.spliterator()).forEachRemaining(consumer);
            }
            return;
        }
        Y0.a(j2.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
        throw null;
    }

    public static L j(L l2, IntFunction objectArray) {
        if (l2.h() > 0) {
            long l3 = l2.count();
            if (l3 < 0x7FFFFFF7L) {
                objectArray = (Object[])objectArray.apply((int)l3);
                new g0_0(l2, objectArray).invoke();
                return new N(objectArray);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        return l2;
    }

    public static J k(J j2) {
        if (j2.h() > 0) {
            long l2 = j2.count();
            if (l2 < 0x7FFFFFF7L) {
                int[] nArray = new int[(int)l2];
                new g0_0(j2, (Object)nArray).invoke();
                return new V(nArray);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        return j2;
    }

    public static IntStream l(A a2) {
        return new b_0(a2, M0.p(a2), false);
    }

    public static F m(E e2, Predicate predicate) {
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(e2);
        return new F(N0.REFERENCE, e2, new j$.util.stream.A(1, (Object)e2, predicate));
    }

    public static Stream o(Spliterator spliterator, boolean bl2) {
        Objects.requireNonNull(spliterator);
        return new b_0(spliterator, M0.p(spliterator), bl2);
    }

    @Override
    public Object a(b_0 b_02, Spliterator spliterator) {
        q0_0 q0_02 = this.n();
        b_02.u(spliterator, q0_02);
        return q0_02.get();
    }

    @Override
    public Object b(b_0 b_02, Spliterator spliterator) {
        return ((q0_0)new t0_0(this, b_02, spliterator).invoke()).get();
    }

    @Override
    public /* synthetic */ int d() {
        return 0;
    }

    public abstract q0_0 n();
}

