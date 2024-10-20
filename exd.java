/*
 * Decompiled with CFR 0.152.
 */
public final class exd
implements iku {
    public final Enum a;
    private final int b;

    public /* synthetic */ exd(Enum enum_, int n2) {
        this.b = n2;
        this.a = enum_;
    }

    @Override
    public final Object b() {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                return new ewz(crh.H((ewy)this.a));
            }
            return new ewz(crh.H(((exb)this.a).q));
        }
        return new exa(crh.H((ewy)this.a));
    }
}

