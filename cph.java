/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
import android.os.SystemClock;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

final class cph
extends hnk
implements Runnable,
hpp {
    private Callable a;
    private final long b;

    public cph(Callable callable, long l2) {
        this.a = callable;
        this.b = l2;
    }

    @Override
    public final /* synthetic */ int compareTo(Object object) {
        return cpi.a(this, (Delayed)object);
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return Math.max(0L, TimeUnit.MILLISECONDS.convert(this.b - SystemClock.elapsedRealtime(), timeUnit));
    }

    @Override
    public final void run() {
        if (this.isDone()) {
            return;
        }
        try {
            Callable callable = this.a;
            this.a = null;
            this.m(callable.call());
            return;
        }
        catch (Throwable throwable) {
            this.n(throwable);
            throw new RuntimeException(throwable);
        }
    }
}

