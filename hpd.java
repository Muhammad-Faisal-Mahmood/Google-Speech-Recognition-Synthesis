/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public final class hpd
implements Runnable {
    public Object a;
    public Object b;
    private final int c;

    public hpd(hnx hnx2, Executor executor, int n2) {
        this.c = n2;
        this.a = hnx2;
        fxf.K(executor);
        this.b = executor;
    }

    public hpd(hpn hpn2, Future future, int n2) {
        this.c = n2;
        this.a = hpn2;
        this.b = future;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void run() {
        if (this.c == 0) {
            hhk.U((hpn)this.a, (Future)this.b);
        }
        this.a = null;
        this.b = null;
    }
}

