/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Objects;
import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.function.a;
import j$.util.stream.A;
import j$.util.stream.B0;
import j$.util.stream.Collector;
import j$.util.stream.D0;
import j$.util.stream.E;
import j$.util.stream.H;
import j$.util.stream.I;
import j$.util.stream.IntStream;
import j$.util.stream.J0;
import j$.util.stream.L;
import j$.util.stream.M0;
import j$.util.stream.N;
import j$.util.stream.N0;
import j$.util.stream.O0;
import j$.util.stream.Q;
import j$.util.stream.Stream;
import j$.util.stream.V0;
import j$.util.stream.a_0;
import j$.util.stream.b_0;
import j$.util.stream.c0_0;
import j$.util.stream.h_0;
import j$.util.stream.i0_0;
import j$.util.stream.k0_0;
import j$.util.stream.o_0;
import j$.util.stream.r;
import j$.util.stream.u0_0;
import j$.util.stream.w0;
import j$.util.stream.w_0;
import j$.util.stream.x_0;
import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

abstract class x0
extends b_0
implements Stream {
    public final boolean allMatch(Predicate predicate) {
        return (Boolean)this.d(I.m(E.ALL, predicate));
    }

    public final boolean anyMatch(Predicate predicate) {
        return (Boolean)this.d(I.m(E.ANY, predicate));
    }

    public final Object collect(Collector collector) {
        Object object;
        if (this.k() && collector.a().contains((Object)Collector.Characteristics.CONCURRENT) && (!this.j() || collector.a().contains((Object)Collector.Characteristics.UNORDERED))) {
            object = collector.d().get();
            this.forEach((Consumer)new A(4, collector.b(), object));
        } else {
            object = Objects.requireNonNull(collector).d();
            BiConsumer biConsumer = collector.b();
            BinaryOperator binaryOperator = collector.c();
            object = this.d(new k0_0(N0.REFERENCE, binaryOperator, biConsumer, (Supplier)object, collector));
        }
        if (!collector.a().contains((Object)Collector.Characteristics.IDENTITY_FINISH)) {
            object = collector.e().apply(object);
        }
        return object;
    }

    @Override
    public final long count() {
        return (Long)this.d((V0)new Object());
    }

    public final Stream distinct() {
        return new w0(this, M0.m | M0.s, 0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    final L f(b_0 object, Spliterator object2, boolean bl2, IntFunction objectArray) {
        long l2 = ((b_0)object).g((Spliterator)object2);
        if (l2 >= 0L && object2.k(16384)) {
            if (l2 >= 0x7FFFFFF7L) throw new IllegalArgumentException("Stream size exceeds max array size");
            objectArray = (Object[])objectArray.apply((int)l2);
            new c0_0((Spliterator)object2, (b_0)object, objectArray).invoke();
            return new N(objectArray);
        }
        object = object2 = (L)new Q((b_0)object, (Spliterator)object2, new a_0(3, objectArray), new h_0(6)).invoke();
        if (!bl2) return object;
        return I.j((L)object2, (IntFunction)objectArray);
    }

    public final Stream filter(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new w_0(this, M0.s, predicate, 1);
    }

    public final Optional findFirst() {
        return (Optional)this.d(o_0.c);
    }

    public final Stream flatMap(Function function) {
        Objects.requireNonNull(function);
        return new u0_0(this, M0.o | M0.n | M0.s, function, 1);
    }

    public void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        this.d(new r(consumer, false));
    }

    public void forEachOrdered(Consumer consumer) {
        Objects.requireNonNull(consumer);
        this.d(new r(consumer, true));
    }

    @Override
    final boolean h(Spliterator spliterator, B0 b0) {
        boolean bl2;
        while (!(bl2 = b0.j()) && spliterator.o(b0)) {
        }
        return bl2;
    }

    @Override
    final H m(long l2, IntFunction object) {
        object = l2 >= 0L && l2 < 0x7FFFFFF7L ? new N(l2, (IntFunction)object) : new J0();
        return object;
    }

    public final Stream map(Function function) {
        Objects.requireNonNull(function);
        return new u0_0(this, M0.o | M0.n, function, 0);
    }

    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return new x_0(this, M0.o | M0.n, toIntFunction, 1);
    }

    public final Optional max(Comparator object) {
        Objects.requireNonNull(object);
        object = new a(object);
        Objects.requireNonNull(object);
        return (Optional)this.d(new i0_0(N0.REFERENCE, object, 0));
    }

    public final boolean noneMatch(Predicate predicate) {
        return (Boolean)this.d(I.m(E.NONE, predicate));
    }

    public final Stream sorted(Comparator comparator) {
        return new D0(this, comparator);
    }

    @Override
    final Spliterator t(b_0 b_02, Supplier supplier, boolean bl2) {
        return new O0(b_02, supplier, bl2);
    }

    @Override
    public final Object[] toArray() {
        return this.toArray((IntFunction)new h_0(21));
    }

    public final Object[] toArray(IntFunction intFunction) {
        return I.j(this.e(intFunction), intFunction).d(intFunction);
    }
}

