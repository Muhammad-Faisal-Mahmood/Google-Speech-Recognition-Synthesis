/*
 * Decompiled with CFR 0.152.
 */
public final class ang
implements afo {
    public final amv a;
    public final dvy b;
    public final hti c;
    private final int d;

    public /* synthetic */ ang(dvy dvy2, amv amv2, hti hti2, int n2) {
        this.d = n2;
        this.b = dvy2;
        this.a = amv2;
        this.c = hti2;
    }

    @Override
    public final void a(Object object) {
        int n2 = this.d;
        if (n2 != 0) {
            if (n2 != 1) {
                ani ani2 = (ani)object;
                hti hti2 = this.c;
                object = this.a;
                ani2.B(0, (anc)this.b.c, (amv)object, hti2);
                return;
            }
            object = (ani)object;
            hti hti3 = this.c;
            amv amv2 = this.a;
            object.E(0, (anc)this.b.c, amv2, hti3);
            return;
        }
        ani ani3 = (ani)object;
        hti hti4 = this.c;
        object = this.a;
        ani3.C(0, (anc)this.b.c, (amv)object, hti4);
    }
}

