/*
 * Decompiled with CFR 0.152.
 */
public class apk
implements aqb {
    private final long a;
    private final long b;
    private final int c;
    private final long d;
    private final int e;
    private final long f;

    /*
     * Enabled aggressive block sorting
     */
    public apk(long l2, long l3, int n2, int n3) {
        this.a = l2;
        this.b = l3;
        int n4 = n3;
        if (n3 == -1) {
            n4 = 1;
        }
        this.c = n4;
        this.e = n2;
        if (l2 == -1L) {
            this.d = -1L;
            l2 = -9223372036854775807L;
        } else {
            this.d = l2 - l3;
            l2 = apk.e(l2, l3, n2);
        }
        this.f = l2;
    }

    private static long e(long l2, long l3, int n2) {
        return Math.max(0L, l2 - l3) * 8000000L / (long)n2;
    }

    @Override
    public final long a() {
        return this.f;
    }

    @Override
    public final apz c(long l2) {
        long l3 = this.d;
        long l4 = l3 - -1L;
        long l5 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (l5 != false) {
            long l6;
            long l7 = this.e;
            int n2 = this.c;
            l7 = l7 * l2 / 8000000L;
            long l8 = n2;
            l7 = l6 = l7 / l8 * l8;
            if (l5 != false) {
                l7 = Math.min(l6, l3 - l8);
            }
            l7 = Math.max(l7, 0L);
            l6 = this.b + l7;
            l7 = this.h(l6);
            aqc aqc2 = new aqc(l7, l6);
            if (this.d != -1L && l7 < l2 && (l2 = l6 + (long)this.c) < this.a) {
                return new apz(aqc2, new aqc(this.h(l2), l2));
            }
            return new apz(aqc2, aqc2);
        }
        aqc aqc3 = new aqc(0L, this.b);
        return new apz(aqc3, aqc3);
    }

    @Override
    public final boolean d() {
        return this.d != -1L;
    }

    public final long h(long l2) {
        return apk.e(l2, this.b, this.e);
    }
}

