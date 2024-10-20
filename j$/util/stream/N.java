/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.stream.L;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;

class N
implements L {
    final Object[] a;
    int b;

    N(long l2, IntFunction intFunction) {
        if (l2 < 0x7FFFFFF7L) {
            this.a = (Object[])intFunction.apply((int)l2);
            this.b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    N(Object[] objectArray) {
        this.a = objectArray;
        this.b = objectArray.length;
    }

    @Override
    public final L a(int n2) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public final long count() {
        return this.b;
    }

    @Override
    public final Object[] d(IntFunction objectArray) {
        objectArray = this.a;
        if (objectArray.length == this.b) {
            return objectArray;
        }
        throw new IllegalStateException();
    }

    @Override
    public final void forEach(Consumer consumer) {
        for (int i2 = 0; i2 < this.b; ++i2) {
            consumer.accept(this.a[i2]);
        }
    }

    @Override
    public final void g(Object[] objectArray, int n2) {
        int n3 = this.b;
        System.arraycopy(this.a, 0, objectArray, n2, n3);
    }

    @Override
    public final /* synthetic */ int h() {
        return 0;
    }

    @Override
    public final Spliterator spliterator() {
        int n2 = this.b;
        return Spliterators.g(this.a, 0, n2, 1040);
    }

    public String toString() {
        Object[] objectArray = this.a;
        return String.format("ArrayNode[%d][%s]", objectArray.length - this.b, Arrays.toString(objectArray));
    }
}

