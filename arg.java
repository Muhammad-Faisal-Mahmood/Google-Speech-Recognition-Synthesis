/*
 * Decompiled with CFR 0.152.
 */
final class arg
implements are {
    private final long a;
    private final int b;
    private final long c;
    private final int d;
    private final long e;
    private final long f;
    private final long[] g;

    public arg(long l2, int n2, long l3, int n3, long l4, long[] lArray) {
        this.a = l2;
        this.b = n2;
        this.c = l3;
        this.d = n3;
        this.e = l4;
        this.g = lArray;
        l3 = -1L;
        l2 = l4 == -1L ? l3 : (l2 += l4);
        this.f = l2;
    }

    private final long g(int n2) {
        return this.c * (long)n2 / 100L;
    }

    @Override
    public final long a() {
        return this.c;
    }

    @Override
    public final int b() {
        return this.d;
    }

    @Override
    public final apz c(long l2) {
        Object object;
        int n2;
        if (!this.d()) {
            aqc aqc2 = new aqc(0L, this.a + (long)this.b);
            return new apz(aqc2, aqc2);
        }
        l2 = agf.h(l2, 0L, this.c);
        double d2 = (double)l2 * 100.0 / (double)this.c;
        double d3 = 0.0;
        if (!(d2 <= 0.0)) {
            if (d2 >= 100.0) {
                d3 = 256.0;
            } else {
                n2 = (int)d2;
                object = this.g;
                abr.j(object);
                double d4 = object[n2];
                d3 = n2 == 99 ? 256.0 : (double)object[n2 + 1];
                d3 = d4 + (d2 - (double)n2) * (d3 - d4);
            }
        }
        long l3 = this.e;
        n2 = this.b;
        l3 = agf.h(Math.round((d3 /= 256.0) * (double)l3), n2, l3 - 1L);
        object = new aqc(l2, this.a + l3);
        return new apz((aqc)object, (aqc)object);
    }

    @Override
    public final boolean d() {
        return this.g != null;
    }

    @Override
    public final long e() {
        return this.f;
    }

    @Override
    public final long f(long l2) {
        if (this.d() && (l2 -= this.a) > (long)this.b) {
            long[] lArray = this.g;
            abr.j(lArray);
            double d2 = (double)l2 * 256.0 / (double)this.e;
            int n2 = agf.y(lArray, (long)d2, true);
            long l3 = this.g(n2);
            long l4 = lArray[n2];
            int n3 = n2 + 1;
            long l5 = this.g(n3);
            l2 = n2 == 99 ? 256L : lArray[n3];
            d2 = l4 == l2 ? 0.0 : (d2 - (double)l4) / (double)(l2 - l4);
            return l3 + Math.round(d2 * (double)(l5 - l3));
        }
        return 0L;
    }
}

