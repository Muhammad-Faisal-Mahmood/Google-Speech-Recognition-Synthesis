/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

final class hoj
extends hok {
    final hol a;
    private final Callable c;

    public hoj(hol hol2, Callable callable, Executor executor) {
        this.a = hol2;
        super(hol2, executor);
        this.c = callable;
    }

    @Override
    public final Object a() {
        return this.c.call();
    }

    @Override
    public final String b() {
        return this.c.toString();
    }

    @Override
    public final void c(Object object) {
        this.a.m(object);
    }
}

