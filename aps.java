/*
 * Decompiled with CFR 0.152.
 */
public final class aps
implements aqb {
    private final apt a;
    private final long b;

    public aps(apt apt2, long l2) {
        this.a = apt2;
        this.b = l2;
    }

    private final aqc b(long l2, long l3) {
        return new aqc(l2 * 1000000L / (long)this.a.e, this.b + l3);
    }

    @Override
    public final long a() {
        apt apt2 = this.a;
        long l2 = apt2.h;
        if (l2 == 0L) {
            return -9223372036854775807L;
        }
        return l2 * 1000000L / (long)apt2.e;
    }

    @Override
    public final apz c(long l2) {
        abr.j(this.a.j);
        Object object = this.a;
        long l3 = ((apt)object).h;
        long l4 = ((apt)object).e;
        object = ((apt)object).j;
        Object object2 = ((awg)object).b;
        object = ((awg)object).a;
        l3 = agf.h(l4 * l2 / 1000000L, 0L, l3 - 1L);
        long[] lArray = (long[])object2;
        int n2 = agf.y(lArray, l3, false);
        l4 = 0L;
        l3 = n2 == -1 ? 0L : lArray[n2];
        if (n2 != -1) {
            l4 = ((long[])object)[n2];
        }
        object2 = this.b(l3, l4);
        if (((aqc)object2).b != l2 && n2 != lArray.length - 1) {
            return new apz((aqc)object2, this.b(lArray[++n2], ((long[])object)[n2]));
        }
        return new apz((aqc)object2, (aqc)object2);
    }

    @Override
    public final boolean d() {
        return true;
    }
}

