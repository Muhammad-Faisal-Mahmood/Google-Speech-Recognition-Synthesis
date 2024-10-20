/*
 * Decompiled with CFR 0.152.
 */
final class izp {
    public volatile boolean a;
    private long b;
    private long c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a(long l2) {
        synchronized (this) {
            long l3 = this.c;
            if (l3 - l2 >= 0L) {
                l2 = l3;
            }
            this.c = l2;
            if (this.b - l2 < 131072L && this.a) {
                this.a = false;
                return true;
            }
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean b(long l2) {
        synchronized (this) {
            this.b = l2 = this.b + l2;
            if (l2 - this.c >= 131072L && !this.a) {
                this.a = true;
                return true;
            }
            return false;
        }
    }
}

