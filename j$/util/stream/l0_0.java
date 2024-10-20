/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.function.Consumer$_CC;
import j$.util.stream.I;
import j$.util.stream.q0_0;
import j$.util.stream.r0_0;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;

/*
 * Renamed from j$.util.stream.l0
 */
final class l0_0
extends r0_0
implements q0_0 {
    final Supplier b;
    final BiConsumer c;
    final BinaryOperator d;

    l0_0(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator) {
        this.b = supplier;
        this.c = biConsumer;
        this.d = binaryOperator;
    }

    @Override
    public final /* synthetic */ void accept(int n2) {
        I.c();
        throw null;
    }

    public final void accept(Object object) {
        this.c.accept(this.a, object);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$_CC.$default$andThen(this, consumer);
    }

    @Override
    public final /* synthetic */ void c() {
    }

    @Override
    public final void e(long l2) {
        this.a = this.b.get();
    }

    @Override
    public final void i(q0_0 object) {
        Object object2 = (l0_0)object;
        object = this.a;
        object2 = ((r0_0)object2).a;
        this.a = this.d.apply(object, object2);
    }

    @Override
    public final /* synthetic */ boolean j() {
        return false;
    }
}

