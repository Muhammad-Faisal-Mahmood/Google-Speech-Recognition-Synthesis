/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
import android.os.SystemClock;

public final class afn {
    private boolean a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        synchronized (this) {
            while (!this.a) {
                this.wait();
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        synchronized (this) {
            boolean bl2;
            boolean bl3 = false;
            while (!(bl2 = this.a)) {
                try {
                    this.wait();
                }
                catch (InterruptedException interruptedException) {
                    bl3 = true;
                }
            }
            if (bl3) {
                Thread.currentThread().interrupt();
                return;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean c(long l2) {
        synchronized (this) {
            if (l2 <= 0L) return this.a;
            long l3 = SystemClock.elapsedRealtime();
            long l4 = l2 + l3;
            l2 = l3;
            if (l4 < l3) {
                this.a();
                return this.a;
            } else {
                while (!this.a) {
                    if (l2 >= l4) return this.a;
                    this.wait(l4 - l2);
                    l2 = SystemClock.elapsedRealtime();
                }
                return this.a;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean d() {
        synchronized (this) {
            return this.a;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean e() {
        synchronized (this) {
            boolean bl2 = this.a;
            if (bl2) {
                return false;
            }
            this.a = true;
            this.notifyAll();
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f() {
        synchronized (this) {
            this.a = false;
            return;
        }
    }
}

