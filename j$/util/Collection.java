/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public interface Collection<E> {
    public void forEach(Consumer<? super E> var1);

    public Stream<E> parallelStream();

    public boolean removeIf(Predicate<? super E> var1);

    public Spliterator<E> spliterator();

    public Stream<E> stream();

    public <T> T[] toArray(IntFunction<T[]> var1);
}

