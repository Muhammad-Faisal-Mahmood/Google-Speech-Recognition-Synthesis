/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

final class hqg
extends hpl {
    final hqh a;
    private final Callable b;

    public hqg(hqh hqh2, Callable callable) {
        this.a = hqh2;
        fxf.K(callable);
        this.b = callable;
    }

    @Override
    public final Object a() {
        return this.b.call();
    }

    @Override
    public final String b() {
        return this.b.toString();
    }

    @Override
    public final void d(Throwable throwable) {
        this.a.n(throwable);
    }

    @Override
    public final void e(Object object) {
        this.a.m(object);
    }

    @Override
    public final boolean g() {
        return this.a.isDone();
    }
}

