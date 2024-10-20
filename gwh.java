/*
 * Decompiled with CFR 0.152.
 */
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

class gwh
extends WeakReference
implements gws {
    final int g;
    final gws h;
    volatile gwd i = gwr.b;

    public gwh(ReferenceQueue referenceQueue, Object object, int n2, gws gws2) {
        super(object, referenceQueue);
        this.g = n2;
        this.h = gws2;
    }

    @Override
    public final int a() {
        return this.g;
    }

    @Override
    public long b() {
        throw new UnsupportedOperationException();
    }

    @Override
    public long c() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final gwd d() {
        return this.i;
    }

    @Override
    public final gws e() {
        return this.h;
    }

    @Override
    public gws f() {
        throw new UnsupportedOperationException();
    }

    @Override
    public gws g() {
        throw new UnsupportedOperationException();
    }

    @Override
    public gws h() {
        throw new UnsupportedOperationException();
    }

    @Override
    public gws i() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object j() {
        return this.get();
    }

    @Override
    public void k(long l2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void l(gws gws2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void m(gws gws2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void n(gws gws2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void o(gws gws2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void p(gwd gwd2) {
        this.i = gwd2;
    }

    @Override
    public void q(long l2) {
        throw new UnsupportedOperationException();
    }
}

