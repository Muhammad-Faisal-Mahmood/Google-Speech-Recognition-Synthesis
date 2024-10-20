/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.function.Consumer$_CC;
import j$.util.stream.I;
import j$.util.stream.q0_0;
import j$.util.stream.r0_0;
import java.util.function.Consumer;

/*
 * Renamed from j$.util.stream.s0
 */
final class s0_0
extends r0_0
implements q0_0 {
    long b;

    @Override
    public final /* synthetic */ void accept(int n2) {
        I.c();
        throw null;
    }

    public final void accept(Object object) {
        ++this.b;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$_CC.$default$andThen(this, consumer);
    }

    @Override
    public final /* synthetic */ void c() {
    }

    @Override
    public final void e(long l2) {
        this.b = 0L;
    }

    @Override
    public final Object get() {
        return this.b;
    }

    @Override
    public final void i(q0_0 q0_02) {
        q0_02 = (s0_0)q0_02;
        this.b += ((s0_0)q0_02).b;
    }

    @Override
    public final /* synthetic */ boolean j() {
        return false;
    }
}

