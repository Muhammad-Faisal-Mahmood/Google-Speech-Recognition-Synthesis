/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
import android.os.SystemClock;

public final class akb
implements aji {
    public aeo a = aeo.a;
    private boolean b;
    private long c;
    private long d;

    @Override
    public final long a() {
        long l2;
        long l3 = l2 = this.c;
        if (this.b) {
            l3 = SystemClock.elapsedRealtime() - this.d;
            aeo aeo2 = this.a;
            l3 = aeo2.b == 1.0f ? agf.i(l3) : (l3 *= (long)aeo2.c);
            l3 = l2 + l3;
        }
        return l3;
    }

    @Override
    public final aeo b() {
        throw null;
    }

    @Override
    public final void c(aeo aeo2) {
        if (this.b) {
            this.d(this.a());
        }
        this.a = aeo2;
    }

    public final void d(long l2) {
        this.c = l2;
        if (this.b) {
            this.d = SystemClock.elapsedRealtime();
        }
    }

    public final void e() {
        if (!this.b) {
            this.d = SystemClock.elapsedRealtime();
            this.b = true;
        }
    }

    public final void f() {
        if (this.b) {
            this.d(this.a());
            this.b = false;
        }
    }
}

