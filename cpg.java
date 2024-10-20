/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
import android.os.SystemClock;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

final class cpg
extends hnk
implements Runnable,
hpp {
    final long a;
    final long b;
    final boolean c;
    final AtomicLong d;
    Runnable e;
    final cpi f;

    public cpg(cpi cpi2, Runnable runnable, long l2, long l3, boolean bl2) {
        this.f = cpi2;
        this.d = new AtomicLong(0L);
        this.e = runnable;
        this.a = l2;
        this.b = l3;
        this.c = bl2;
    }

    private final long d() {
        return Math.max(0L, this.d.get() * this.b + this.a - SystemClock.elapsedRealtime());
    }

    @Override
    public final /* synthetic */ int compareTo(Object object) {
        return cpi.a(this, (Delayed)object);
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.d(), TimeUnit.MILLISECONDS);
    }

    @Override
    public final void run() {
        block3: {
            long l2;
            cpi cpi2;
            if (this.isDone()) {
                return;
            }
            this.d.incrementAndGet();
            try {
                this.e.run();
                if (!this.c) break block3;
                cpi2 = this.f;
                l2 = this.d();
            }
            catch (Throwable throwable) {
                this.e = null;
                this.n(throwable);
                return;
            }
            cpi2.a.postDelayed((Runnable)this, l2);
            return;
        }
        cpi cpi3 = this.f;
        long l3 = this.b;
        cpi3.a.postDelayed((Runnable)this, l3);
    }
}

