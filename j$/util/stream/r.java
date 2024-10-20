/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$_CC;
import j$.util.stream.I;
import j$.util.stream.M0;
import j$.util.stream.V0;
import j$.util.stream.b_0;
import j$.util.stream.s_0;
import j$.util.stream.t_0;
import j$.util.stream.w0_0;
import java.util.function.Consumer;

final class r
implements V0,
w0_0 {
    private final boolean a;
    final Consumer b;

    r(Consumer consumer, boolean bl2) {
        this.a = bl2;
        this.b = consumer;
    }

    @Override
    public final Object a(b_0 b_02, Spliterator spliterator) {
        b_02.u(spliterator, this);
        return null;
    }

    @Override
    public final /* synthetic */ void accept(int n2) {
        I.c();
        throw null;
    }

    public final void accept(Object object) {
        this.b.accept(object);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$_CC.$default$andThen(this, consumer);
    }

    @Override
    public final Object b(b_0 b_02, Spliterator spliterator) {
        if (this.a) {
            new s_0(b_02, spliterator, this).invoke();
        } else {
            new t_0(b_02, spliterator, b_02.v(this)).invoke();
        }
        return null;
    }

    @Override
    public final /* synthetic */ void c() {
    }

    @Override
    public final int d() {
        int n2 = this.a ? 0 : M0.q;
        return n2;
    }

    @Override
    public final /* synthetic */ void e(long l2) {
    }

    @Override
    public final /* synthetic */ boolean j() {
        return false;
    }
}

