/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class grz {
    public static final hei a = hei.m("com/google/audio/hearing/common/CircularByteBuffer");
    public final byte[] b;
    public final int c;
    public long d = 0L;
    public final ArrayList e = new ArrayList();
    private int f = 0;

    public grz(int n2) {
        this.b = new byte[n2];
        this.c = n2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long a() {
        synchronized (this) {
            return this.d;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean b(byte[] byArray, int n2) {
        synchronized (this) {
            int n3 = this.c;
            if (n2 > n3) {
                return false;
            }
            if (n2 == 0) {
                return true;
            }
            int n4 = this.f;
            if (n4 + n2 <= n3) {
                System.arraycopy(byArray, 0, this.b, n4, n2);
            } else {
                System.arraycopy(byArray, 0, this.b, n4, n3 -= n4);
                System.arraycopy(byArray, n3, this.b, 0, n2 - n3);
            }
            this.f = (this.f + n2) % this.c;
            this.d += (long)n2;
            return true;
        }
    }
}

