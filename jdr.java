/*
 * Decompiled with CFR 0.152.
 */
final class jdr
implements jcm {
    final iyh a;
    private final jck b;

    public jdr(iyh iyh2, jck jck2) {
        fxf.r(iyh2.g() ^ true, "error must not be OK");
        this.a = iyh2;
        this.b = jck2;
    }

    @Override
    public final jcj b(ixb ixb2, iwx iwx2, itw itw2, iuc[] iucArray) {
        return new jdq(this.a, this.b, iucArray);
    }

    @Override
    public final ivn c() {
        throw new UnsupportedOperationException("Not a real transport");
    }
}

