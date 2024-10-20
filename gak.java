/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public final class gak
extends hoy {
    final hth a;
    private final hpn b;

    public gak(hth hth2, hpn hpn2) {
        this.a = hth2;
        this.b = hpn2;
    }

    @Override
    protected final /* synthetic */ Object a() {
        return this.b;
    }

    @Override
    protected final hpn bi() {
        return this.b;
    }

    @Override
    protected final /* synthetic */ Future bj() {
        return this.b;
    }

    @Override
    public final void c(Runnable runnable, Executor executor) {
        if (this.isDone()) {
            this.b.c(runnable, executor);
        }
        this.b.c(runnable, new gaj((Object)this.a, executor, 0));
    }
}

