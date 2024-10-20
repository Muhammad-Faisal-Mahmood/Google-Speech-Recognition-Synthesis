/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Optional;
import j$.util.function.Consumer$_CC;
import j$.util.function.a;
import j$.util.stream.I;
import j$.util.stream.q0_0;
import java.util.function.Consumer;

/*
 * Renamed from j$.util.stream.j0
 */
final class j0_0
implements q0_0 {
    private boolean a;
    private Object b;
    final a c;

    j0_0(a a2) {
        this.c = a2;
    }

    @Override
    public final /* synthetic */ void accept(int n2) {
        I.c();
        throw null;
    }

    public final void accept(Object object) {
        if (this.a) {
            this.a = false;
            this.b = object;
        } else {
            this.b = this.c.apply(this.b, object);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$_CC.$default$andThen(this, consumer);
    }

    @Override
    public final /* synthetic */ void c() {
    }

    @Override
    public final void e(long l2) {
        this.a = true;
        this.b = null;
    }

    public final Object get() {
        Optional<Object> optional = this.a ? Optional.empty() : Optional.of(this.b);
        return optional;
    }

    @Override
    public final void i(q0_0 q0_02) {
        q0_02 = (j0_0)q0_02;
        if (!((j0_0)q0_02).a) {
            this.accept(((j0_0)q0_02).b);
        }
    }

    @Override
    public final /* synthetic */ boolean j() {
        return false;
    }
}

