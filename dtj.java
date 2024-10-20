/*
 * Decompiled with CFR 0.152.
 */
final class dtj
implements dtk {
    private final int a;

    public dtj(int n2) {
        this.a = n2;
    }

    @Override
    public final /* synthetic */ String a(hye hye2) {
        int n2 = this.a;
        if (n2 != 0) {
            if (n2 != 1) {
                return ((kec)((hwr)hye2).b).c;
            }
            return ((kfl)((hwp)hye2).b).e;
        }
        return ((kdd)((hwp)hye2).b).f;
    }

    @Override
    public final /* synthetic */ String b(hye hye2) {
        int n2 = this.a;
        if (n2 != 0) {
            if (n2 != 1) {
                return ((kec)((hwr)hye2).b).e;
            }
            return ((kfl)((hwp)hye2).b).d;
        }
        return ((kdd)((hwp)hye2).b).e;
    }

    @Override
    public final /* synthetic */ void c(hye hyg2, Long object) {
        int n2 = this.a;
        if (n2 != 0) {
            if (n2 != 1) {
                hyg2 = (hwr)hyg2;
                if (object == null) {
                    if (!((hwp)hyg2).b.B()) {
                        ((hwp)hyg2).u();
                    }
                    hyg2 = (kec)((hwr)hyg2).b;
                    object = kec.a;
                    ((kec)hyg2).b &= 0xFFFFFFFD;
                    ((kec)hyg2).d = 0L;
                    return;
                }
                long l2 = (Long)object;
                if (!((hwp)hyg2).b.B()) {
                    ((hwp)hyg2).u();
                }
                object = (kec)((hwr)hyg2).b;
                hyg2 = kec.a;
                ((kec)object).b |= 2;
                ((kec)object).d = l2;
                return;
            }
            if (object != null) {
                long l3 = (Long)object;
                hyg2 = (hwp)hyg2;
                if (!((hwp)hyg2).b.B()) {
                    ((hwp)hyg2).u();
                }
                hyg2 = (kfl)((hwp)hyg2).b;
                object = kfl.a;
                ((kfl)hyg2).b |= 1;
                ((kfl)hyg2).c = l3;
                return;
            }
            hyg2 = (hwp)hyg2;
            if (!((hwp)hyg2).b.B()) {
                ((hwp)hyg2).u();
            }
            hyg2 = (kfl)((hwp)hyg2).b;
            object = kfl.a;
            ((kfl)hyg2).b &= 0xFFFFFFFE;
            ((kfl)hyg2).c = 0L;
            return;
        }
        if (object != null) {
            long l4 = (Long)object;
            hyg2 = (hwp)hyg2;
            if (!((hwp)hyg2).b.B()) {
                ((hwp)hyg2).u();
            }
            object = (kdd)((hwp)hyg2).b;
            hyg2 = kdd.a;
            ((kdd)object).b |= 2;
            ((kdd)object).d = l4;
            return;
        }
        hyg2 = (hwp)hyg2;
        if (!((hwp)hyg2).b.B()) {
            ((hwp)hyg2).u();
        }
        object = (kdd)((hwp)hyg2).b;
        hyg2 = kdd.a;
        ((kdd)object).b &= 0xFFFFFFFD;
        ((kdd)object).d = 0L;
    }

    @Override
    public final /* synthetic */ void d(hye hyg2) {
        int n2 = this.a;
        if (n2 != 0) {
            if (n2 != 1) {
                hyg2 = (hwr)hyg2;
                if (!((hwp)hyg2).b.B()) {
                    ((hwp)hyg2).u();
                }
                kec kec2 = (kec)((hwr)hyg2).b;
                hyg2 = kec.a;
                kec2.b &= 0xFFFFFFFB;
                kec2.e = kec.a.e;
                return;
            }
            hyg2 = (hwp)hyg2;
            if (!((hwp)hyg2).b.B()) {
                ((hwp)hyg2).u();
            }
            kfl kfl2 = (kfl)((hwp)hyg2).b;
            hyg2 = kfl.a;
            kfl2.b &= 0xFFFFFFFD;
            kfl2.d = kfl.a.d;
            return;
        }
        hyg2 = (hwp)hyg2;
        if (!((hwp)hyg2).b.B()) {
            ((hwp)hyg2).u();
        }
        kdd kdd2 = (kdd)((hwp)hyg2).b;
        hyg2 = kdd.a;
        kdd2.b &= 0xFFFFFFFB;
        kdd2.e = kdd.a.e;
    }
}

