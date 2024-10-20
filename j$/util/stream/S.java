/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.B;
import j$.util.Spliterator;
import j$.util.stream.I;
import j$.util.stream.J;
import j$.util.stream.K;
import j$.util.stream.M;
import j$.util.stream.a0_0;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class S
extends M
implements J,
K {
    @Override
    public final Object b() {
        long l2 = this.count();
        if (l2 < 0x7FFFFFF7L) {
            int[] nArray = new int[(int)l2];
            this.k(0, nArray);
            return nArray;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
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
    public final void k(int n2, Object object) {
        K k2 = (K)this.a;
        k2.k(n2, object);
        ((K)this.b).k(n2 + (int)k2.count(), object);
    }

    @Override
    public final void l(IntConsumer intConsumer) {
        ((K)this.a).l(intConsumer);
        ((K)this.b).l(intConsumer);
    }

    @Override
    public final B spliterator() {
        return new a0_0(this);
    }

    @Override
    public final Spliterator spliterator() {
        return new a0_0(this);
    }

    public final String toString() {
        if (this.count() < 32L) {
            return String.format("%s[%s.%s]", S.class.getName(), this.a, this.b);
        }
        return String.format("%s[size=%d]", S.class.getName(), this.count());
    }
}

