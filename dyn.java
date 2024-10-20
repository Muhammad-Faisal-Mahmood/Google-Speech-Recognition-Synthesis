/*
 * Decompiled with CFR 0.152.
 */
public final class dyn {
    private final dxx a;

    public dyn(dxx dxx2) {
        this.a = dxx2;
    }

    public final dyj a(int n2, String string) {
        dyj dyj2 = new dyj(this.a);
        dyj2.q(n2, string);
        return dyj2;
    }

    public final dyp b(String string, String string2) {
        dyp dyp2 = new dyp(this.a);
        dyp2.a.r(string, string2);
        return dyp2;
    }

    public final dyj c(int n2) {
        dyj dyj2 = new dyj(this.a);
        dyj2.s(n2);
        return dyj2;
    }

    public final String toString() {
        return this.a.b;
    }
}

