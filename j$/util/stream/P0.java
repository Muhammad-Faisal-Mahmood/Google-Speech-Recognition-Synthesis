/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$_CC;
import j$.util.stream.A;
import j$.util.z;
import java.util.Comparator;
import java.util.function.Consumer;

final class P0
implements Spliterator,
Consumer {
    private static final Object d = new Object();
    private final Spliterator a;
    private final ConcurrentHashMap b;
    private Object c;

    P0(Spliterator spliterator) {
        this(spliterator, new ConcurrentHashMap());
    }

    private P0(Spliterator spliterator, ConcurrentHashMap concurrentHashMap) {
        this.a = spliterator;
        this.b = concurrentHashMap;
    }

    @Override
    public final int a() {
        return this.a.a() & 0xFFFFBFAB | 1;
    }

    public final void accept(Object object) {
        this.c = object;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$_CC.$default$andThen(this, consumer);
    }

    @Override
    public final Spliterator b() {
        Spliterator spliterator = this.a.b();
        spliterator = spliterator != null ? new P0(spliterator, this.b) : null;
        return spliterator;
    }

    @Override
    public final long d() {
        return this.a.d();
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        consumer = new A(2, this, consumer);
        this.a.forEachRemaining(consumer);
    }

    @Override
    public final /* synthetic */ boolean k(int n2) {
        return z.f(this, n2);
    }

    @Override
    public final /* synthetic */ long l() {
        return z.e(this);
    }

    @Override
    public final Comparator m() {
        return this.a.m();
    }

    @Override
    public final boolean o(Consumer consumer) {
        while (this.a.o(this)) {
            Boolean bl2;
            Object object = this.c;
            if (object == null) {
                object = d;
            }
            if (this.b.putIfAbsent(object, bl2 = Boolean.TRUE) != null) continue;
            consumer.accept(this.c);
            this.c = null;
            return true;
        }
        return false;
    }

    final void r(Consumer consumer, Object object) {
        Boolean bl2;
        Object object2 = object != null ? object : d;
        if (this.b.putIfAbsent(object2, bl2 = Boolean.TRUE) == null) {
            consumer.accept(object);
        }
    }
}

