/*
 * Decompiled with CFR 0.152.
 */
final class jky
implements jjw {
    public final klm a;
    private int b;
    private int c;

    public jky(klm klm2, int n2) {
        this.a = klm2;
        this.b = n2;
    }

    @Override
    public final int a() {
        return this.c;
    }

    @Override
    public final int b() {
        return this.b;
    }

    @Override
    public final void c(byte by2) {
        this.a.F(by2);
        --this.b;
        ++this.c;
    }

    @Override
    public final void d(byte[] byArray, int n2, int n3) {
        this.a.C(byArray, n2, n3);
        this.b -= n3;
        this.c += n3;
    }
}

