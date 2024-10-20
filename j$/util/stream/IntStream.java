/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.stream.BaseStream;
import j$.util.stream.Stream;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;

public interface IntStream
extends BaseStream<Integer, IntStream> {
    public IntStream filter(IntPredicate var1);

    public <U> Stream<U> mapToObj(IntFunction<? extends U> var1);

    public boolean noneMatch(IntPredicate var1);

    public int sum();

    public int[] toArray();
}

