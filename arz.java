/*
 * Decompiled with CFR 0.152.
 */
final class arz
implements aqb {
    private final ary a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;

    public arz(ary ary2, int n2, long l2, long l3) {
        this.a = ary2;
        this.b = n2;
        this.c = l2;
        this.d = l2 = (l3 - l2) / (long)ary2.d;
        this.e = this.b(l2);
    }

    private final long b(long l2) {
        long l3 = this.a.c;
        return agf.j(l2 * (long)this.b, 1000000L, l3);
    }

    @Override
    public final long a() {
        return this.e;
    }

    @Override
    public final apz c(long l2) {
        long l3 = this.b;
        long l4 = this.d;
        l4 = agf.h((long)this.a.c * l2 / (l3 * 1000000L), 0L, l4 - 1L);
        l3 = this.a.d;
        long l5 = this.b(l4);
        aqc aqc2 = new aqc(l5, this.c + l3 * l4);
        if (l5 < l2 && l4 != this.d - 1L) {
            l3 = l4 + 1L;
            l2 = this.c;
            ary ary2 = this.a;
            return new apz(aqc2, new aqc(this.b(l3), l2 + l3 * (long)ary2.d));
        }
        return new apz(aqc2, aqc2);
    }

    @Override
    public final boolean d() {
        return true;
    }
}

