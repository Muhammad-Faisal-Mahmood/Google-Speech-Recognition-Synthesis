/*
 * Decompiled with CFR 0.152.
 */
public final class cxg
implements hny {
    public final long a;
    public final ctt b;
    public final egg c;

    public /* synthetic */ cxg(egg egg2, long l2, ctt ctt2) {
        this.c = egg2;
        this.a = l2;
        this.b = ctt2;
    }

    @Override
    public final hpn a(Object object) {
        object = (ctv)object;
        long l2 = this.a;
        long l3 = ((ctv)object).f;
        if (l2 > l3) {
            hyg hyg2 = (hwp)((hwv)object).C(5);
            hyg2.x((hwv)object);
            if (!hyg2.b.B()) {
                hyg2.u();
            }
            object = this.b;
            egg egg2 = this.c;
            ctv ctv2 = (ctv)hyg2.b;
            ctv2.b |= 8;
            ctv2.f = l2;
            hyg2 = (ctv)hyg2.o();
            object = egg2.f.h((ctt)object, (ctv)hyg2);
        } else {
            object = hhk.K(true);
        }
        return object;
    }
}

