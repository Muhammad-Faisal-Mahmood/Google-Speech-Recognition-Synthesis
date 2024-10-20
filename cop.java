/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.TimeUnit;

final class cop
implements Runnable {
    final Runnable a;
    final Runnable b;
    final hqa c;
    final coq d;
    final long e;
    final TimeUnit f;
    final cos g;

    public cop(cos cos2, Runnable runnable, hqa hqa2, coq coq2, long l2, TimeUnit timeUnit) {
        this.b = runnable;
        this.c = hqa2;
        this.d = coq2;
        this.e = l2;
        this.f = timeUnit;
        this.g = cos2;
        this.a = this;
    }

    @Override
    public final void run() {
        coo coo2 = new coo(this, this.b, this.c, this.d, this.e, this.f);
        this.g.execute(coo2);
    }
}

