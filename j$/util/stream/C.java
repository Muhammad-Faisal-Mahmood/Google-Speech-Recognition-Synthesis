/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.nio.file.attribute.a;
import j$.util.stream.A0;
import j$.util.stream.D;
import j$.util.stream.E;
import j$.util.stream.I;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

final class C
extends D
implements A0 {
    final E c;
    final IntPredicate d;

    C(E e2, IntPredicate intPredicate) {
        this.c = e2;
        this.d = intPredicate;
        super(e2);
    }

    @Override
    public final void accept(int n2) {
        E e2;
        boolean bl2;
        if (!this.a && (bl2 = this.d.test(n2)) == E.m(e2 = this.c)) {
            this.a = true;
            this.b = E.g(e2);
        }
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.nio.file.attribute.a.a(this, intConsumer);
    }

    @Override
    public final /* synthetic */ void f(Integer n2) {
        I.e(this, n2);
    }
}

