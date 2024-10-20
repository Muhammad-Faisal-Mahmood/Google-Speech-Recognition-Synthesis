/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Objects;
import j$.util.stream.Collector;
import j$.util.stream.Collectors;
import j$.util.stream.j_0;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

public final class Collector$_CC {
    public static <T, A, R> Collector<T, A, R> of(Supplier<A> supplier, BiConsumer<A, T> biConsumer, BinaryOperator<A> binaryOperator, Function<A, R> function, Collector.Characteristics ... characteristicsArray) {
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(biConsumer);
        Objects.requireNonNull(binaryOperator);
        Objects.requireNonNull(function);
        Objects.requireNonNull(characteristicsArray);
        Set<Collector.Characteristics> set = Collectors.b;
        if (characteristicsArray.length > 0) {
            set = EnumSet.noneOf(Collector.Characteristics.class);
            Collections.addAll(set, characteristicsArray);
            set = Collections.unmodifiableSet(set);
        }
        return new j_0(supplier, biConsumer, binaryOperator, function, set);
    }
}

