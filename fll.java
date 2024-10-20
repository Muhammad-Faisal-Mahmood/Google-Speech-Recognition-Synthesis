/*
 * Decompiled with CFR 0.152.
 */
public final class fll
implements gte {
    public final long a;
    private final int b;

    public /* synthetic */ fll(long l2, int n2) {
        this.b = n2;
        this.a = l2;
    }

    @Override
    public final Object apply(Object object) {
        if (this.b != 0) {
            ctu ctu2 = (ctu)object;
            long l2 = this.a;
            boolean bl2 = 100L % l2 != 0L;
            if (bl2) {
                cyr.g("Bad sample interval (1 percent cohort will not log): %d", l2);
            }
            if (!bzo.i(ctu2.c, l2)) {
                object = gsl.a;
            } else {
                hwp hwp2 = hmg.a.l();
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                object = (hmg)hwp2.b;
                ((hmg)object).b |= 1;
                ((hmg)object).c = true;
                hwv hwv2 = ctu2.d;
                object = hwv2;
                if (hwv2 == null) {
                    object = hzb.a;
                }
                l2 = hzw.a((hzb)object);
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                object = (hmg)hwp2.b;
                ((hmg)object).b |= 2;
                ((hmg)object).d = l2;
                boolean bl3 = bzo.i(ctu2.c, 100L);
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                object = hwp2.b;
                hwv2 = (hmg)object;
                ((hmg)hwv2).b |= 4;
                ((hmg)hwv2).e = bl3;
                if (!((hwv)object).B()) {
                    hwp2.u();
                }
                object = (hmg)hwp2.b;
                ((hmg)object).b |= 8;
                ((hmg)object).f = bl2;
                object = gto.i((hmg)hwp2.o());
            }
            return object;
        }
        fme fme2 = (fme)object;
        object = flr.a;
        object = (hwp)fme2.C(5);
        ((hwp)object).x(fme2);
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        long l3 = this.a;
        fme2 = (fme)((hwp)object).b;
        fme fme3 = fme.a;
        fme2.b = 1 | fme2.b;
        fme2.c = l3;
        return (fme)((hwp)object).o();
    }
}

