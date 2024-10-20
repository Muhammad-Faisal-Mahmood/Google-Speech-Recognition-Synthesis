/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

public final class fju {
    private static final hei a = hei.m("com/google/android/libraries/speech/transcription/recognition/service/CallbackThrottler");
    private final hpr b;
    private volatile long c;
    private volatile long d;

    public fju(hpr hpr2) {
        this.b = hpr2;
    }

    public final void a(Runnable runnable) {
        runnable = gqk.i(new ffe((Object)this, (Object)runnable, 7, null));
        this.b.be(runnable);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(Runnable runnable) {
        synchronized (this) {
            long l2 = SystemClock.elapsedRealtime();
            long l3 = l2 - this.c;
            if (l3 < this.d) {
                l2 = this.d - l3;
                ((heg)((heg)a.c()).j("com/google/android/libraries/speech/transcription/recognition/service/CallbackThrottler", "throttleSynchronized", 92, "CallbackThrottler.java")).t("scheduling callback in %dms", l2);
                hpr hpr2 = this.b;
                ffe ffe2 = new ffe((Object)this, (Object)runnable, 8, null);
                hpr2.b(ffe2, l2, TimeUnit.MILLISECONDS);
                return;
            }
            runnable.run();
            this.c = l2;
            if (l3 >= 5000L) {
                this.d = 0L;
            }
            l2 = this.d + 50L;
            this.d = Math.min(3000L, l2 + l2);
            return;
        }
    }
}

