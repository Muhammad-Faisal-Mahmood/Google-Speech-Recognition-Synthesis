/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.stream.B0;
import j$.util.stream.C0;
import j$.util.stream.L;
import j$.util.stream.M0;
import j$.util.stream.N;
import j$.util.stream.b_0;
import j$.util.stream.w0;
import j$.util.stream.x0;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

final class D0
extends w0 {
    private final Comparator l;

    D0(x0 x02, Comparator comparator) {
        super(x02, M0.p | M0.o, 0);
        this.l = Objects.requireNonNull(comparator);
    }

    @Override
    public final L n(b_0 objectArray, Spliterator spliterator, IntFunction intFunction) {
        M0 m0 = M0.SORTED;
        objectArray.i();
        ((Object)((Object)m0)).getClass();
        objectArray = objectArray.c(spliterator, true, intFunction).d(intFunction);
        Arrays.sort(objectArray, this.l);
        return new N(objectArray);
    }

    @Override
    public final B0 q(int n2, B0 b0) {
        Objects.requireNonNull(b0);
        M0.SORTED.s(n2);
        boolean bl2 = M0.SIZED.s(n2);
        Comparator comparator = this.l;
        if (bl2) {
            return new C0(b0, comparator);
        }
        return new C0(b0, comparator);
    }
}

