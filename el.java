/*
 * Decompiled with CFR 0.152.
 */
final class el {
    public static el a;
    public long b;
    public long c;
    public int d;

    public final void a(long l2, double d2, double d3) {
        long l3;
        int n2;
        int n3;
        double d4;
        double d5;
        float f2;
        block6: {
            block5: {
                float f3 = (float)(l2 - 946728000000L) / 8.64E7f;
                f2 = 0.01720197f * f3 + 6.24006f;
                double d6 = f2;
                double d7 = Math.sin(d6);
                double d8 = Math.sin(f2 + f2);
                d5 = Math.sin(f2 * 3.0f);
                d3 = -d3;
                d4 = f3 - 9.0E-4f;
                f2 = Math.round(d4 - (d3 /= 360.0));
                d4 = Math.sin(d6);
                d6 = d6 + d7 * (double)0.0334196f + d8 * 3.4906598739326E-4 + d5 * (double)5.236E-6f + 1.796593063 + Math.PI;
                d5 = Math.sin(d6 + d6);
                d7 = Math.asin(Math.sin(d6) * Math.sin(0.4092797040939331));
                d6 = Math.sin(-0.10471975803375244);
                d2 = 0.01745329238474369 * d2;
                d2 = (d6 - Math.sin(d2) * Math.sin(d7)) / (Math.cos(d2) * Math.cos(d7));
                n3 = 1;
                n2 = 1;
                if (d2 >= 1.0) break block5;
                if (!(d2 <= -1.0)) break block6;
                n2 = 0;
            }
            this.d = n2;
            this.b = -1L;
            this.c = -1L;
            return;
        }
        d3 = (double)(f2 + 9.0E-4f) + d3 + d4 * 0.0053 + d5 * -0.0069;
        d2 = (float)(Math.acos(d2) / (Math.PI * 2));
        this.b = Math.round((d3 + d2) * 8.64E7) + 946728000000L;
        this.c = l3 = Math.round((d3 - d2) * 8.64E7) + 946728000000L;
        n2 = n3;
        if (l3 < l2) {
            n2 = n3;
            if (this.b > l2) {
                n2 = 0;
            }
        }
        this.d = n2;
    }
}

