/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.m_0;
import java.util.Comparator;
import java.util.function.Consumer;

final class o
implements Spliterator {
    final Spliterator a;

    o(Spliterator spliterator) {
        this.a = spliterator;
    }

    @Override
    public final int a() {
        return this.a.a();
    }

    @Override
    public final Spliterator b() {
        Spliterator spliterator = this.a.b();
        spliterator = spliterator == null ? null : new o(spliterator);
        return spliterator;
    }

    @Override
    public final long d() {
        return this.a.d();
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        consumer = new m_0(consumer);
        this.a.forEachRemaining(consumer);
    }

    @Override
    public final boolean k(int n2) {
        return this.a.k(n2);
    }

    @Override
    public final long l() {
        return this.a.l();
    }

    @Override
    public final Comparator m() {
        return this.a.m();
    }

    @Override
    public final boolean o(Consumer consumer) {
        Objects.requireNonNull(consumer);
        consumer = new m_0(consumer);
        return this.a.o(consumer);
    }
}

