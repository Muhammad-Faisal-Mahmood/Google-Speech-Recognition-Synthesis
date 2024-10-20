/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.stream.Collector;
import j$.util.stream.I;
import j$.util.stream.M0;
import j$.util.stream.N0;
import j$.util.stream.l0_0;
import j$.util.stream.q0_0;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/*
 * Renamed from j$.util.stream.k0
 */
final class k0_0
extends I {
    final BinaryOperator a;
    final BiConsumer b;
    final Supplier c;
    final Collector d;

    k0_0(N0 n0, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        this.a = binaryOperator;
        this.b = biConsumer;
        this.c = supplier;
        this.d = collector;
    }

    @Override
    public final int d() {
        int n2 = this.d.a().contains((Object)Collector.Characteristics.UNORDERED) ? M0.q : 0;
        return n2;
    }

    @Override
    public final q0_0 n() {
        return new l0_0(this.c, this.b, this.a);
    }
}

