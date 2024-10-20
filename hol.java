/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class hol
extends hns {
    private hok b;

    public hol(gzm gzm2, boolean bl2, Executor executor, hnx hnx2) {
        super(gzm2, bl2, false);
        this.b = new hoi(this, hnx2, executor);
        this.q();
    }

    public hol(gzm gzm2, boolean bl2, Executor executor, Callable callable) {
        super(gzm2, bl2, false);
        this.b = new hoj(this, callable, executor);
        this.q();
    }

    static /* bridge */ /* synthetic */ void t(hol hol2) {
        hol2.b = null;
    }

    @Override
    public final void e(int n2, Object object) {
    }

    @Override
    public final void g() {
        hok hok2 = this.b;
        if (hok2 != null) {
            hok2.f();
        }
    }

    @Override
    protected final void k() {
        hok hok2 = this.b;
        if (hok2 != null) {
            hok2.h();
        }
    }

    @Override
    public final void s(hnr hnr2) {
        super.s(hnr2);
        if (hnr2 == hnr.a) {
            this.b = null;
        }
    }
}

