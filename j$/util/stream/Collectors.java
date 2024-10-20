/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.stream.Collector;
import j$.util.stream.a_0;
import j$.util.stream.h_0;
import j$.util.stream.i_0;
import j$.util.stream.j_0;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

public final class Collectors {
    static final Set a;
    static final Set b;

    static {
        Collector.Characteristics characteristics = Collector.Characteristics.CONCURRENT;
        Collector.Characteristics characteristics2 = Collector.Characteristics.UNORDERED;
        Collector.Characteristics characteristics3 = Collector.Characteristics.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2, characteristics3));
        Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2));
        a = Collections.unmodifiableSet(EnumSet.of(characteristics3));
        Collections.unmodifiableSet(EnumSet.of(characteristics2, characteristics3));
        b = Collections.emptySet();
        Collections.unmodifiableSet(EnumSet.of(characteristics2));
    }

    public static <T, A, R, RR> Collector<T, A, RR> collectingAndThen(Collector<T, A, R> collector, Function<R, RR> function) {
        Set set;
        block2: {
            EnumSet enumSet = collector.a();
            Collector.Characteristics characteristics = Collector.Characteristics.IDENTITY_FINISH;
            set = enumSet;
            if (!enumSet.contains((Object)characteristics)) break block2;
            if (enumSet.size() == 1) {
                set = b;
            } else {
                set = EnumSet.copyOf(enumSet);
                set.remove((Object)characteristics);
                set = Collections.unmodifiableSet(set);
            }
        }
        return new j_0(collector.d(), collector.b(), collector.c(), collector.e().andThen(function), set);
    }

    public static Collector<CharSequence, ?, String> joining(CharSequence charSequence) {
        return new j_0(new a_0(1, charSequence), new h_0(11), new h_0(12), new h_0(13), b);
    }

    public static <T, C extends Collection<T>> Collector<T, ?, C> toCollection(Supplier<C> supplier) {
        return new j_0(supplier, new h_0(8), new h_0(0), a);
    }

    public static <T> Collector<T, ?, List<T>> toList() {
        return new j_0(new h_0(9), new h_0(10), new h_0(1), a);
    }

    public static <T, K, U, M extends Map<K, U>> Collector<T, ?, M> toMap(Function<? super T, ? extends K> function, Function<? super T, ? extends U> function2, BinaryOperator<U> binaryOperator, Supplier<M> supplier) {
        return new j_0(supplier, new i_0(function, function2, binaryOperator), new a_0(2, binaryOperator), a);
    }
}

