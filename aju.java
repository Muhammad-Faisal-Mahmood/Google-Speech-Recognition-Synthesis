/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  android.os.SystemClock
 */
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

public final class aju {
    public final ajt a;
    public final ajs b;
    public int c;
    public Object d;
    public final Looper e;
    public final long f;
    public boolean g;
    private boolean h;
    private boolean i;

    public aju(ajs ajs2, ajt ajt2, Looper looper) {
        this.b = ajs2;
        this.a = ajt2;
        this.e = looper;
        this.f = -9223372036854775807L;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(boolean bl2) {
        synchronized (this) {
            this.h = bl2 | this.h;
            this.i = true;
            this.notifyAll();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(long l2) {
        synchronized (this) {
            abr.f(this.g);
            boolean bl2 = this.e.getThread() != Thread.currentThread();
            abr.f(bl2);
            long l3 = SystemClock.elapsedRealtime();
            long l4 = l2;
            while (!this.i) {
                if (l4 <= 0L) {
                    TimeoutException timeoutException = new TimeoutException("Message delivery timed out.");
                    throw timeoutException;
                }
                this.wait(l4);
                l4 = l3 + l2 - SystemClock.elapsedRealtime();
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void c() {
        // MONITORENTER : this
        // MONITOREXIT : this
    }
}

