/*
 * Decompiled with CFR 0.152.
 */
final class amo
implements anv {
    public final anv a;
    public boolean b;
    final amp c;

    public amo(amp amp2, anv anv2) {
        this.c = amp2;
        this.a = anv2;
    }

    @Override
    public final int a(long l2) {
        if (this.c.n()) {
            return -3;
        }
        return this.a.a(l2);
    }

    @Override
    public final void b() {
        this.a.b();
    }

    @Override
    public final boolean c() {
        return !this.c.n() && this.a.c();
    }

    @Override
    public final int d(arq arq2, ahx object, int n2) {
        long l2;
        block7: {
            block9: {
                int n3;
                block8: {
                    amp amp2 = this.c;
                    if (amp2.n()) {
                        return -3;
                    }
                    if (this.b) {
                        ((aht)object).setFlags(4);
                        return -4;
                    }
                    l2 = amp2.d();
                    if ((n2 = this.a.d(arq2, (ahx)object, n2)) != -5) break block7;
                    object = arq2.a;
                    abr.i(object);
                    int n4 = ((adu)object).G;
                    n3 = 0;
                    n2 = n4;
                    if (n4 != 0) break block8;
                    if (((adu)object).H == 0) break block9;
                    n2 = 0;
                }
                if (this.c.b == Long.MIN_VALUE) {
                    n3 = ((adu)object).H;
                }
                object = new adt((adu)object);
                ((adt)object).E = n2;
                ((adt)object).F = n3;
                arq2.a = new adu((adt)object);
            }
            return -5;
        }
        long l3 = this.c.b;
        if (l3 != Long.MIN_VALUE && (n2 == -4 && ((ahx)object).e >= l3 || n2 == -3 && l2 == Long.MIN_VALUE && !((ahx)object).d)) {
            ((aht)object).clear();
            ((aht)object).setFlags(4);
            this.b = true;
            return -4;
        }
        return n2;
    }
}

