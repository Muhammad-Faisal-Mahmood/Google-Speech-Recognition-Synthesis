/*
 * Decompiled with CFR 0.152.
 */
public final class aig {
    public final long a;
    public final long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public float h;
    public float i;
    public float j;
    public long k;
    public long l;
    public long m;
    private long n;

    public aig(long l2, long l3) {
        this.a = l2;
        this.b = l3;
        this.c = -9223372036854775807L;
        this.n = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.i = 0.97f;
        this.h = 1.03f;
        this.j = 1.0f;
        this.k = -9223372036854775807L;
        this.d = -9223372036854775807L;
        this.g = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.m = -9223372036854775807L;
    }

    public static long c(long l2, long l3) {
        return (long)((float)l2 * 0.999f + (float)l3 * 9.999871E-4f);
    }

    public final void a() {
        long l2;
        long l3 = this.c;
        if (l3 != -9223372036854775807L) {
            long l4;
            l2 = l4 = this.n;
            if (l4 == -9223372036854775807L) {
                l4 = this.e;
                l2 = l3;
                if (l4 != -9223372036854775807L) {
                    l2 = l3;
                    if (l3 < l4) {
                        l2 = l4;
                    }
                }
                if ((l3 = this.f) != -9223372036854775807L && l2 > l3) {
                    l2 = l3;
                }
            }
        } else {
            l2 = -9223372036854775807L;
        }
        if (this.d == l2) {
            return;
        }
        this.d = l2;
        this.g = l2;
        this.l = -9223372036854775807L;
        this.m = -9223372036854775807L;
        this.k = -9223372036854775807L;
    }

    public final void b(long l2) {
        this.n = l2;
        this.a();
    }
}

