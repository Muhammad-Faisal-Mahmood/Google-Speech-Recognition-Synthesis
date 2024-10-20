/*
 * Decompiled with CFR 0.152.
 */
public final class gmr
implements gpf {
    public final Object a;
    private final int b;

    public gmr(gpf gpf2, int n2) {
        this.b = n2;
        this.a = gpf2;
    }

    public /* synthetic */ gmr(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    @Override
    public final void close() {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            gno.w((gpc)this.a);
                            return;
                        }
                        fpk.d(new gjf(this, 10), 10000L);
                        return;
                    }
                    this.a.close();
                    gno.l();
                    return;
                }
                ((gms)this.a).p();
                return;
            }
            gms gms2 = (gms)this.a;
            gms2.p();
            gms2.n();
            return;
        }
        gms gms3 = (gms)this.a;
        gms3.p();
        gms3.n();
        gms3.a = null;
    }
}

