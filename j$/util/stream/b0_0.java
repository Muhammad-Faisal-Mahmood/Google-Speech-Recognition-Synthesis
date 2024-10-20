/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.nio.file.attribute.a;
import j$.util.Spliterator;
import j$.util.stream.A0;
import j$.util.stream.I;
import j$.util.stream.b_0;
import j$.util.stream.d0_0;
import java.util.function.IntConsumer;

/*
 * Renamed from j$.util.stream.b0
 */
final class b0_0
extends d0_0
implements A0 {
    private final int[] h;

    b0_0(Spliterator spliterator, b_0 b_02, int[] nArray) {
        super(spliterator, b_02, nArray.length);
        this.h = nArray;
    }

    b0_0(b0_0 b0_02, Spliterator spliterator, long l2, long l3) {
        super(b0_02, spliterator, l2, l3, b0_02.h.length);
        this.h = b0_02.h;
    }

    @Override
    final d0_0 a(Spliterator spliterator, long l2, long l3) {
        return new b0_0(this, spliterator, l2, l3);
    }

    @Override
    public final void accept(int n2) {
        int n3 = this.f;
        if (n3 < this.g) {
            int[] nArray = this.h;
            this.f = n3 + 1;
            nArray[n3] = n2;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.nio.file.attribute.a.a(this, intConsumer);
    }

    @Override
    public final /* synthetic */ void f(Integer n2) {
        I.e(this, n2);
    }
}

