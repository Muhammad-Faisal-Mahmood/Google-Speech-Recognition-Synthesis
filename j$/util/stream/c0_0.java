/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.b_0;
import j$.util.stream.d0_0;

/*
 * Renamed from j$.util.stream.c0
 */
final class c0_0
extends d0_0 {
    private final Object[] h;

    c0_0(Spliterator spliterator, b_0 b_02, Object[] objectArray) {
        super(spliterator, b_02, objectArray.length);
        this.h = objectArray;
    }

    c0_0(c0_0 c0_02, Spliterator spliterator, long l2, long l3) {
        super(c0_02, spliterator, l2, l3, c0_02.h.length);
        this.h = c0_02.h;
    }

    @Override
    final d0_0 a(Spliterator spliterator, long l2, long l3) {
        return new c0_0(this, spliterator, l2, l3);
    }

    public final void accept(Object object) {
        int n2 = this.f;
        if (n2 < this.g) {
            Object[] objectArray = this.h;
            this.f = n2 + 1;
            objectArray[n2] = object;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f));
    }
}

