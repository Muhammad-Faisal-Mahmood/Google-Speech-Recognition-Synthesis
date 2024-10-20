/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.Objects;
import j$.util.b_0;
import j$.util.c_0;
import j$.util.z;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public final class Comparator$_CC {
    public static Comparator $default$thenComparing(Comparator comparator, Comparator comparator2) {
        Objects.requireNonNull(comparator2);
        return new c_0(comparator, comparator2, 0);
    }

    public static Comparator $default$thenComparing(Comparator comparator, Function function) {
        Objects.requireNonNull(function);
        return z.r(comparator, new b_0(2, function));
    }

    public static Comparator $default$thenComparing(Comparator comparator, Function function, Comparator comparator2) {
        return z.r(comparator, Comparator$_CC.comparing(function, comparator2));
    }

    public static Comparator $default$thenComparingDouble(Comparator comparator, ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return z.r(comparator, new b_0(1, toDoubleFunction));
    }

    public static Comparator $default$thenComparingInt(Comparator comparator, ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return z.r(comparator, new b_0(0, toIntFunction));
    }

    public static Comparator $default$thenComparingLong(Comparator comparator, ToLongFunction toLongFunction) {
        return z.r(comparator, Comparator$_CC.comparingLong(toLongFunction));
    }

    public static <T, U> Comparator<T> comparing(Function<? super T, ? extends U> function, Comparator<? super U> comparator) {
        Objects.requireNonNull(function);
        Objects.requireNonNull(comparator);
        return new c_0(comparator, function, 1);
    }

    public static <T> Comparator<T> comparingLong(ToLongFunction<? super T> toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return new b_0(3, toLongFunction);
    }
}

