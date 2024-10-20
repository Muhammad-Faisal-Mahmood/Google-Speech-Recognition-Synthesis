/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

public final class hqh
extends hov
implements RunnableFuture {
    private volatile hpl a;

    public hqh(hnx hnx2) {
        this.a = new hqf(this, hnx2);
    }

    public hqh(Callable callable) {
        this.a = new hqg(this, callable);
    }

    public static hqh d(Runnable runnable, Object object) {
        return new hqh(Executors.callable(runnable, object));
    }

    @Override
    protected final String a() {
        hpl hpl2 = this.a;
        if (hpl2 != null) {
            return a.ar(hpl2, "task=[", "]");
        }
        return super.a();
    }

    @Override
    protected final void b() {
        hpl hpl2;
        if (this.p() && (hpl2 = this.a) != null) {
            hpl2.h();
        }
        this.a = null;
    }

    @Override
    public final void run() {
        hpl hpl2 = this.a;
        if (hpl2 != null) {
            hpl2.run();
        }
        this.a = null;
    }
}

