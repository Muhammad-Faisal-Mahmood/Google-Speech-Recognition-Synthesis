/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.TimeUnit;

public final class coo
implements Runnable {
    public final cop a;
    public final Runnable b;
    public final hqa c;
    public final coq d;
    public final long e;
    public final TimeUnit f;

    public /* synthetic */ coo(cop cop2, Runnable runnable, hqa hqa2, coq coq2, long l2, TimeUnit timeUnit) {
        this.a = cop2;
        this.b = runnable;
        this.c = hqa2;
        this.d = coq2;
        this.e = l2;
        this.f = timeUnit;
    }

    @Override
    public final void run() {
        long l2 = this.e;
        cop cop2 = this.a;
        Runnable runnable = this.b;
        hqa hqa2 = this.c;
        coq coq2 = this.d;
        Object object = this.f;
        try {
            runnable.run();
            if (!hqa2.isDone()) {
                object = cop2.g.a.b(cop2.a, l2, (TimeUnit)((Object)object));
                coq2.a = object;
                if (coq2.isDone()) {
                    object.cancel(false);
                }
            }
            return;
        }
        catch (Throwable throwable) {
            hqa2.n(throwable);
            return;
        }
    }
}

