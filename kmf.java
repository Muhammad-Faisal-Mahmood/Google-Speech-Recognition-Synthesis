/*
 * Decompiled with CFR 0.152.
 */
public final class kmf {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public kmf f;
    public kmf g;

    public kmf() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public kmf(byte[] byArray, int n2, int n3, boolean bl2) {
        jse.e(byArray, "data");
        this.a = byArray;
        this.b = n2;
        this.c = n3;
        this.d = bl2;
        this.e = false;
    }

    public final kmf a() {
        kmf kmf2;
        kmf kmf3 = kmf2 = this.f;
        if (kmf2 == this) {
            kmf3 = null;
        }
        kmf2 = this.g;
        jse.b(kmf2);
        kmf2.f = this.f;
        kmf2 = this.f;
        jse.b(kmf2);
        kmf2.g = this.g;
        this.f = null;
        this.g = null;
        return kmf3;
    }

    public final kmf b() {
        this.d = true;
        return new kmf(this.a, this.b, this.c, true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void c(kmf kmf2, int n2) {
        byte[] byArray;
        jse.e(kmf2, "sink");
        if (!kmf2.e) throw new IllegalStateException("only owner can write");
        int n3 = kmf2.c;
        int n4 = n3 + n2;
        int n5 = n3;
        if (n4 > 8192) {
            if (kmf2.d) throw new IllegalArgumentException();
            n5 = kmf2.b;
            if (n4 - n5 > 8192) throw new IllegalArgumentException();
            byArray = kmf2.a;
            jns.Y(byArray, byArray, n5, n3);
            kmf2.c = n5 = kmf2.c - kmf2.b;
            kmf2.b = 0;
        }
        byArray = this.a;
        byte[] byArray2 = kmf2.a;
        n3 = this.b;
        jns.V(byArray, byArray2, n5, n3, n3 + n2);
        kmf2.c += n2;
        this.b += n2;
    }

    public final void d(kmf kmf2) {
        jse.e(kmf2, "segment");
        kmf2.g = this;
        kmf2.f = this.f;
        kmf kmf3 = this.f;
        jse.b(kmf3);
        kmf3.g = kmf2;
        this.f = kmf2;
    }
}

