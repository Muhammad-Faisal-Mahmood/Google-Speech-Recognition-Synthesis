/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.nio.file.attribute.a;
import j$.util.function.Consumer$_CC;
import j$.util.stream.A0;
import j$.util.stream.I;
import j$.util.stream.h_0;
import j$.util.stream.q0_0;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/*
 * Renamed from j$.util.stream.p0
 */
final class p0_0
implements q0_0,
A0 {
    private int a;
    final h_0 b;

    p0_0(h_0 h_02) {
        this.b = h_02;
    }

    @Override
    public final void accept(int n2) {
        this.a = this.b.applyAsInt(this.a, n2);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$_CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.nio.file.attribute.a.a(this, intConsumer);
    }

    @Override
    public final /* synthetic */ void c() {
    }

    @Override
    public final void e(long l2) {
        this.a = 0;
    }

    @Override
    public final /* synthetic */ void f(Integer n2) {
        I.e(this, n2);
    }

    public final Object get() {
        return this.a;
    }

    @Override
    public final void i(q0_0 q0_02) {
        this.accept(((p0_0)q0_02).a);
    }

    @Override
    public final /* synthetic */ boolean j() {
        return false;
    }
}

