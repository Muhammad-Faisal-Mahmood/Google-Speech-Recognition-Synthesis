/*
 * Decompiled with CFR 0.152.
 */
public final class dyo
implements dyk {
    private final dxx a;

    public dyo(dxx dxx2) {
        this.a = dxx2;
    }

    public final dyj a(int n2, String string) {
        dyj dyj2 = new dyj(this.a);
        dyj2.q(n2, string);
        return dyj2;
    }

    public final dyj b(String string, String string2) {
        dyj dyj2 = new dyj(this.a);
        dyj2.r(string, string2);
        return dyj2;
    }

    public final String c() {
        return this.a.b;
    }

    @Override
    public final dye i() {
        return this.a.a;
    }

    @Override
    public final dyj j() {
        return new dyj(this.a);
    }

    @Override
    public final Boolean n() {
        return false;
    }

    @Override
    public final String p() {
        return this.a.g;
    }

    public final String toString() {
        return this.a.b;
    }
}

