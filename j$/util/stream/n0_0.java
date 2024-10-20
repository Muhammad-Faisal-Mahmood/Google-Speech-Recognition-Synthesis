/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.function.Consumer$_CC;
import j$.util.stream.I;
import j$.util.stream.h_0;
import j$.util.stream.q0_0;
import j$.util.stream.r0_0;
import java.util.function.Consumer;

/*
 * Renamed from j$.util.stream.n0
 */
final class n0_0
extends r0_0
implements q0_0 {
    final h_0 b;
    final h_0 c;
    final h_0 d;

    n0_0(h_0 h_02, h_0 h_03, h_0 h_04) {
        this.b = h_02;
        this.c = h_03;
        this.d = h_04;
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
        Object object2 = (n0_0)object;
        object = this.a;
        object2 = ((r0_0)object2).a;
        this.d.accept(object, object2);
    }

    @Override
    public final /* synthetic */ boolean j() {
        return false;
    }
}

