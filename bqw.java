/*
 * Decompiled with CFR 0.152.
 */
public final class bqw
implements img {
    private final img a;
    private final int b;

    public bqw(img img2, int n2) {
        this.b = n2;
        idi.l(img2);
        this.a = img2;
    }

    public bqw(img img2, int n2, byte[] byArray) {
        this.b = n2;
        idi.l(img2);
        this.a = img2;
    }

    public final gto a() {
        if (this.b != 0) {
            return gto.i(this.a.b());
        }
        return gto.i(this.a);
    }

    @Override
    public final /* synthetic */ Object b() {
        if (this.b != 0) {
            return this.a();
        }
        return this.a();
    }
}

