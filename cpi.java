/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.SystemClock
 *  hom
 */
import android.os.Handler;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public final class cpi
extends hnl
implements hpr {
    public static final int b = 0;
    public final Handler a;

    public cpi(Handler handler) {
        this.a = handler;
    }

    public static int a(Delayed delayed, Delayed delayed2) {
        long l2 = delayed2.getDelay(TimeUnit.MILLISECONDS) - delayed.getDelay(TimeUnit.MILLISECONDS);
        long l3 = l2 == 0L ? 0 : (l2 < 0L ? -1 : 1);
        if (l3 > 0) {
            return -1;
        }
        if (l3 == false) {
            return 0;
        }
        return 1;
    }

    private final hpp i(Runnable runnable, long l2, long l3, TimeUnit timeUnit, boolean bl2) {
        l2 = timeUnit.toMillis(l2);
        runnable = new cpg(this, runnable, l2 + SystemClock.elapsedRealtime(), timeUnit.toMillis(l3), bl2);
        this.a.postDelayed(runnable, l2);
        this.j((hpn)((Object)runnable), runnable);
        return runnable;
    }

    private final void j(hpn hpn2, Runnable runnable) {
        hpn2.c(new ckr((Object)this, (Object)runnable, 13, null), (Executor)hom.a);
    }

    @Override
    public final boolean awaitTermination(long l2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final hpp b(Runnable runnable, long l2, TimeUnit timeUnit) {
        return this.c(Executors.callable(runnable), l2, timeUnit);
    }

    @Override
    public final hpn bf(Callable object) {
        hqa hqa2 = new hqa();
        object = new cpf(hqa2, (Callable)object);
        this.a.post((Runnable)object);
        return hqa2;
    }

    @Override
    public final hpp c(Callable object, long l2, TimeUnit timeUnit) {
        l2 = timeUnit.toMillis(l2);
        object = new cph((Callable)object, SystemClock.elapsedRealtime() + l2);
        this.a.postDelayed((Runnable)object, l2);
        this.j((hpn)object, (Runnable)object);
        return object;
    }

    @Override
    public final hpp d(Runnable runnable, long l2, long l3, TimeUnit timeUnit) {
        return this.i(runnable, l2, l3, timeUnit, true);
    }

    @Override
    public final hpp e(Runnable runnable, long l2, long l3, TimeUnit timeUnit) {
        return this.i(runnable, l2, l3, timeUnit, false);
    }

    @Override
    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }

    @Override
    public final boolean isShutdown() {
        return false;
    }

    @Override
    public final boolean isTerminated() {
        return false;
    }

    @Override
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }
}

