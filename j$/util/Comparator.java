/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public interface Comparator<T> {
    public java.util.Comparator<T> reversed();

    public java.util.Comparator<T> thenComparing(java.util.Comparator<? super T> var1);

    public <U extends Comparable<? super U>> java.util.Comparator<T> thenComparing(Function<? super T, ? extends U> var1);

    public <U> java.util.Comparator<T> thenComparing(Function<? super T, ? extends U> var1, java.util.Comparator<? super U> var2);

    public java.util.Comparator<T> thenComparingDouble(ToDoubleFunction<? super T> var1);

    public java.util.Comparator<T> thenComparingInt(ToIntFunction<? super T> var1);

    public java.util.Comparator<T> thenComparingLong(ToLongFunction<? super T> var1);
}

