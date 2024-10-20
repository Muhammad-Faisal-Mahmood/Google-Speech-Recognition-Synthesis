/*
 * Decompiled with CFR 0.152.
 */
public final class cdf
extends cdd {
    public final bmu b;

    public cdf(bmu bmu2, bzo bzo2) {
        super(3, bzo2);
        this.b = bmu2;
    }

    @Override
    public final boolean a(cdx cdx2) {
        return ((cem)this.b.c).c;
    }

    @Override
    public final cbm[] b(cdx cdx2) {
        return ((cem)this.b.c).b;
    }

    @Override
    public final void c(cdx cdx2) {
        ((cem)this.b.c).b(cdx2.b, this.a);
        ceg ceg2 = ((cem)this.b.c).a();
        if (ceg2 != null) {
            cdx2.d.put(ceg2, this.b);
        }
    }
}

