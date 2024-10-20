/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.stream.L;
import j$.util.stream.M;
import j$.util.stream.a0_0;
import java.util.function.Consumer;
import java.util.function.IntFunction;

final class T
extends M {
    @Override
    public final Object[] d(IntFunction objectArray) {
        long l2 = this.count();
        if (l2 < 0x7FFFFFF7L) {
            objectArray = (Object[])objectArray.apply((int)l2);
            this.g(objectArray, 0);
            return objectArray;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override
    public final void forEach(Consumer consumer) {
        this.a.forEach(consumer);
        this.b.forEach(consumer);
    }

    @Override
    public final void g(Object[] objectArray, int n2) {
        Objects.requireNonNull(objectArray);
        L l2 = this.a;
        l2.g(objectArray, n2);
        int n3 = (int)l2.count();
        this.b.g(objectArray, n2 + n3);
    }

    @Override
    public final Spliterator spliterator() {
        return new a0_0(this);
    }

    public final String toString() {
        if (this.count() < 32L) {
            return String.format("ConcNode[%s.%s]", this.a, this.b);
        }
        return String.format("ConcNode[size=%d]", this.count());
    }
}

