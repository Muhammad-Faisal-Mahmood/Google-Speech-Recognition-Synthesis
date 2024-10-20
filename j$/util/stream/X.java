/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.B;
import j$.util.Spliterator;
import j$.util.function.Consumer$_CC;
import j$.util.stream.A0;
import j$.util.stream.H;
import j$.util.stream.I;
import j$.util.stream.I0;
import j$.util.stream.J;
import j$.util.stream.K;
import j$.util.stream.L;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class X
extends I0
implements J,
H,
A0 {
    @Override
    public final K a(int n2) {
        throw new IndexOutOfBoundsException();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$_CC.$default$andThen(this, consumer);
    }

    @Override
    public final Object b() {
        return (int[])super.b();
    }

    @Override
    public final void c() {
    }

    @Override
    public final /* synthetic */ Object[] d(IntFunction intFunction) {
        return I.g(this, intFunction);
    }

    @Override
    public final void e(long l2) {
        this.clear();
        this.n(l2);
    }

    @Override
    public final /* synthetic */ void f(Integer n2) {
        I.e(this, n2);
    }

    @Override
    public final /* synthetic */ void g(Object[] objectArray, int n2) {
        I.h(this, (Integer[])objectArray, n2);
    }

    @Override
    public final /* synthetic */ int h() {
        return 0;
    }

    @Override
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override
    public final void k(int n2, Object object) {
        super.k(n2, (int[])object);
    }

    @Override
    public final L p() {
        return this;
    }

    @Override
    public final B spliterator() {
        return super.o();
    }

    @Override
    public final Spliterator spliterator() {
        return super.o();
    }
}

