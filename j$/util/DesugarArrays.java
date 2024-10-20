/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.Spliterators;
import j$.util.stream.I;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;

public final class DesugarArrays {
    public static IntStream stream(int[] nArray) {
        return I.l(Spliterators.f(nArray, 0, nArray.length));
    }

    public static <T> Stream<T> stream(T[] TArray) {
        return I.o(Spliterators.g(TArray, 0, TArray.length, 1040), false);
    }
}

