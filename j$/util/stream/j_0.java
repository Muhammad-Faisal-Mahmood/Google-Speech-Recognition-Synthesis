/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.stream.Collector;
import j$.util.stream.Collectors;
import j$.util.stream.h_0;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/*
 * Renamed from j$.util.stream.j
 */
final class j_0
implements Collector {
    private final Supplier a;
    private final BiConsumer b;
    private final BinaryOperator c;
    private final Function d;
    private final Set e;

    j_0(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Set set) {
        Set set2 = Collectors.a;
        this(supplier, biConsumer, binaryOperator, new h_0(2), set);
    }

    j_0(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Function function, Set set) {
        this.a = supplier;
        this.b = biConsumer;
        this.c = binaryOperator;
        this.d = function;
        this.e = set;
    }

    @Override
    public final Set a() {
        return this.e;
    }

    @Override
    public final BiConsumer b() {
        return this.b;
    }

    @Override
    public final BinaryOperator c() {
        return this.c;
    }

    @Override
    public final Supplier d() {
        return this.a;
    }

    @Override
    public final Function e() {
        return this.d;
    }
}

