/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

public abstract class hpa
extends how
implements hpq {
    protected hpa() {
    }

    @Override
    public final hpn be(Runnable runnable) {
        return this.f().be(runnable);
    }

    @Override
    public final hpn bf(Callable callable) {
        return this.f().bf(callable);
    }

    @Override
    public final hpn bg(Runnable runnable, Object object) {
        return this.f().bg(runnable, object);
    }

    protected abstract hpq f();
}

