/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.function.Consumer$_CC;
import j$.util.stream.B0;
import j$.util.stream.E;
import j$.util.stream.I;
import java.util.function.Consumer;

abstract class D
implements B0 {
    boolean a;
    boolean b;

    D(E e2) {
        this.b = E.g(e2) ^ true;
    }

    @Override
    public /* synthetic */ void accept(int n2) {
        I.c();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$_CC.$default$andThen(this, consumer);
    }

    @Override
    public final /* synthetic */ void c() {
    }

    @Override
    public final /* synthetic */ void e(long l2) {
    }

    @Override
    public final boolean j() {
        return this.a;
    }
}

