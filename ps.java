/*
 * Decompiled with CFR 0.152.
 */
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class ps
implements hpn {
    final WeakReference a;
    public final pn b = new pr(this);

    public ps(po po2) {
        this.a = new WeakReference<po>(po2);
    }

    public final boolean a(Throwable object) {
        pn.f(object);
        object = new ph((Throwable)object);
        pe pe2 = pn.b;
        pn pn2 = this.b;
        if (pe2.d(pn2, null, object)) {
            pn.d(pn2);
            return true;
        }
        return false;
    }

    @Override
    public final void c(Runnable runnable, Executor executor) {
        this.b.c(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean bl2) {
        boolean bl3;
        po po2 = (po)this.a.get();
        bl2 = bl3 = this.b.cancel(bl2);
        if (bl3) {
            bl2 = bl3;
            if (po2 != null) {
                po2.a = null;
                po2.b = null;
                ((pn)po2.c).e(null);
                bl2 = true;
            }
        }
        return bl2;
    }

    public final Object get() {
        return this.b.get();
    }

    public final Object get(long l2, TimeUnit timeUnit) {
        return this.b.get(l2, timeUnit);
    }

    @Override
    public final boolean isCancelled() {
        return this.b.isCancelled();
    }

    @Override
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }
}

