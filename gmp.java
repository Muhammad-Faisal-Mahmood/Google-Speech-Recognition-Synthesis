/*
 * Decompiled with CFR 0.152.
 */
public final class gmp
implements gpf {
    public final Object a;
    public final Object b;
    private final int c;

    public /* synthetic */ gmp(gpf gpf2, Object object, int n2) {
        this.c = n2;
        this.a = gpf2;
        this.b = object;
    }

    public /* synthetic */ gmp(gpf gpf2, Object object, int n2, byte[] byArray) {
        this.c = n2;
        this.b = gpf2;
        this.a = object;
    }

    @Override
    public final void close() {
        int n2 = this.c;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            this.b.close();
                            this.a.close();
                            gno.l();
                            return;
                        }
                        this.b.close();
                        gto gto2 = (gto)this.a;
                        if (gto2.g()) {
                            gto2.c().close();
                        }
                        return;
                    }
                    this.a.close();
                    gms gms2 = (gms)this.b;
                    gms2.a = null;
                    gms2.b = false;
                    gno.w(gms2.c);
                    gms2.c = null;
                    return;
                }
                this.b.close();
                this.a.close();
                return;
            }
            this.b.close();
            this.a.close();
            return;
        }
        this.a.close();
        gno.w((gpc)this.b);
    }
}

