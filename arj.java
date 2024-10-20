/*
 * Decompiled with CFR 0.152.
 */
final class arj
implements aro {
    public long a;
    private final apt b;
    private long c;
    private final awg d;

    public arj(apt apt2, awg awg2) {
        this.b = apt2;
        this.d = awg2;
        this.a = -1L;
        this.c = -1L;
    }

    @Override
    public final long a(app app2) {
        long l2 = this.c;
        if (l2 >= 0L) {
            this.c = -1L;
            return -(l2 + 2L);
        }
        return -1L;
    }

    @Override
    public final aqb b() {
        boolean bl2 = this.a != -1L;
        abr.f(bl2);
        long l2 = this.a;
        return new aps(this.b, l2);
    }

    @Override
    public final void c(long l2) {
        long[] lArray = (long[])this.d.b;
        this.c = lArray[agf.y(lArray, l2, true)];
    }
}

