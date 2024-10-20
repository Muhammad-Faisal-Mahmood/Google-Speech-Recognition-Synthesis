/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.TimeUnit;

public final class kls
extends kmm {
    public kmm a;

    public kls(kmm kmm2) {
        jse.e(kmm2, "delegate");
        this.a = kmm2;
    }

    @Override
    public final void g() {
        this.a.g();
    }

    @Override
    public final boolean h() {
        return this.a.h();
    }

    @Override
    public final long j() {
        return this.a.j();
    }

    @Override
    public final kmm k() {
        return this.a.k();
    }

    @Override
    public final kmm l() {
        return this.a.l();
    }

    @Override
    public final kmm m(long l2) {
        return this.a.m(l2);
    }

    @Override
    public final kmm n(long l2, TimeUnit timeUnit) {
        jse.e((Object)timeUnit, "unit");
        return this.a.n(l2, timeUnit);
    }

    @Override
    public final long o() {
        return this.a.o();
    }
}

