/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class daw
implements Runnable {
    public final hqa a;
    public final Callable b;
    public final hpn c;
    public final Executor d;

    public /* synthetic */ daw(hqa hqa2, Callable callable, hpn hpn2, Executor executor) {
        this.a = hqa2;
        this.b = callable;
        this.c = hpn2;
        this.d = executor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        Object object = this.b;
        Executor executor = this.d;
        hqa hqa2 = this.a;
        if (hqa2.isCancelled()) {
            return;
        }
        try {
            hpn hpn2 = (hpn)object.call();
            hpn hpn3 = this.c;
            if (hpn2 == null) {
                hqa2.o(hpn3);
                return;
            }
            object = new dav(hpn2, hqa2, hpn3);
            hpn2.c((Runnable)object, executor);
            return;
        }
        catch (Exception exception) {
            hqa2.n(exception);
            return;
        }
    }
}

