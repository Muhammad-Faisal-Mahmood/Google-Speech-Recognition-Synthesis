/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.B;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.stream.I;
import j$.util.stream.J;
import j$.util.stream.K;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
class V
implements J {
    final int[] a;
    int b;

    V(long l2) {
        if (l2 < 0x7FFFFFF7L) {
            this.a = new int[(int)l2];
            this.b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    V(int[] nArray) {
        this.a = nArray;
        this.b = nArray.length;
    }

    @Override
    public final K a(int n2) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public final Object b() {
        int[] nArray = this.a;
        int n2 = nArray.length;
        int n3 = this.b;
        if (n2 != n3) {
            nArray = Arrays.copyOf(nArray, n3);
        }
        return nArray;
    }

    @Override
    public final long count() {
        return this.b;
    }

    @Override
    public final /* synthetic */ Object[] d(IntFunction intFunction) {
        return I.g(this, intFunction);
    }

    @Override
    public final /* synthetic */ void forEach(Consumer consumer) {
        I.i(this, consumer);
    }

    @Override
    public final /* synthetic */ void g(Object[] objectArray, int n2) {
        I.h(this, (Integer[])objectArray, n2);
    }

    @Override
    public final /* synthetic */ int h() {
        return 0;
    }

    @Override
    public final void k(int n2, Object object) {
        object = (int[])object;
        int n3 = this.b;
        System.arraycopy(this.a, 0, object, n2, n3);
    }

    @Override
    public final void l(IntConsumer intConsumer) {
        for (int i2 = 0; i2 < this.b; ++i2) {
            intConsumer.accept(this.a[i2]);
        }
    }

    @Override
    public final B spliterator() {
        int n2 = this.b;
        return Spliterators.f(this.a, 0, n2);
    }

    @Override
    public final Spliterator spliterator() {
        int n2 = this.b;
        return Spliterators.f(this.a, 0, n2);
    }

    public String toString() {
        int[] nArray = this.a;
        return String.format("IntArrayNode[%d][%s]", nArray.length - this.b, Arrays.toString(nArray));
    }
}

