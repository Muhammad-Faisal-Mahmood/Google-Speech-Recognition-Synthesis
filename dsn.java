/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
import android.os.SystemClock;

public final class dsn {
    private final Object a = new Object();
    private final jnu b;
    private int c = 0;
    private long d = 0L;

    public dsn(jnu jnu2) {
        this.b = jnu2;
    }

    public static dsn a(int n2) {
        return new dsn(new dsm(n2));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        long l2 = SystemClock.elapsedRealtime();
        Object object = this.a;
        synchronized (object) {
            ++this.c;
            if (l2 - this.d > 1000L) {
                this.c = 0;
                this.d = l2;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean c() {
        int n2 = (Integer)this.b.b();
        boolean bl2 = true;
        if (n2 == 0) {
            return bl2;
        }
        if (n2 == Integer.MAX_VALUE) return false;
        Object object = this.a;
        synchronized (object) {
            if (this.c < n2) {
                return false;
            } else {
                long l2 = this.d;
                // MONITOREXIT @DISABLED, blocks:[2, 3] lbl12 : MonitorExitStatement: MONITOREXIT : var5_3
                if (SystemClock.elapsedRealtime() - l2 <= 1000L) return bl2;
            }
        }
        return false;
    }
}

