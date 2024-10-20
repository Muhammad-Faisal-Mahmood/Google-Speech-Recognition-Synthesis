/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Optional;
import j$.util.stream.BaseStream;
import j$.util.stream.Collector;
import j$.util.stream.IntStream;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public interface Stream<T>
extends BaseStream<T, Stream<T>> {
    public boolean allMatch(Predicate<? super T> var1);

    public boolean anyMatch(Predicate<? super T> var1);

    public <R, A> R collect(Collector<? super T, A, R> var1);

    public long count();

    public Stream<T> distinct();

    public Stream<T> filter(Predicate<? super T> var1);

    public Optional<T> findFirst();

    public <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> var1);

    public void forEach(Consumer<? super T> var1);

    public void forEachOrdered(Consumer<? super T> var1);

    public <R> Stream<R> map(Function<? super T, ? extends R> var1);

    public IntStream mapToInt(ToIntFunction<? super T> var1);

    public Optional<T> max(Comparator<? super T> var1);

    public boolean noneMatch(Predicate<? super T> var1);

    public Stream<T> sorted(Comparator<? super T> var1);

    public Object[] toArray();

    public <A> A[] toArray(IntFunction<A[]> var1);
}

