/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.ExecutionException;

final class hjz
implements Runnable {
    final hqa a;
    final hkb b;

    public hjz(hkb hkb2, hqa hqa2) {
        this.a = hqa2;
        this.b = hkb2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        try {
            Object object;
            Object object2;
            if (!this.a.isCancelled() && (object2 = hhk.S(this.a)) == (object = hkb.a)) {
                return;
            }
        }
        catch (ExecutionException executionException) {}
        this.b.o(this.a);
    }
}

