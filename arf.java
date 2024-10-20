/*
 * Decompiled with CFR 0.152.
 */
final class arf
implements are {
    private final long[] a;
    private final long[] b;
    private final long c;
    private final long d;
    private final int e;

    public arf(long[] lArray, long[] lArray2, long l2, long l3, int n2) {
        this.a = lArray;
        this.b = lArray2;
        this.c = l2;
        this.d = l3;
        this.e = n2;
    }

    @Override
    public final long a() {
        return this.c;
    }

    @Override
    public final int b() {
        return this.e;
    }

    @Override
    public final apz c(long l2) {
        long[] lArray = this.a;
        int n2 = agf.y(lArray, l2, true);
        aqc aqc2 = new aqc(lArray[n2], this.b[n2]);
        if (aqc2.b < l2 && n2 != (lArray = this.a).length - 1) {
            return new apz(aqc2, new aqc(lArray[++n2], this.b[n2]));
        }
        return new apz(aqc2, aqc2);
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final long e() {
        return this.d;
    }

    @Override
    public final long f(long l2) {
        long[] lArray = this.b;
        return this.a[agf.y(lArray, l2, true)];
    }
}

