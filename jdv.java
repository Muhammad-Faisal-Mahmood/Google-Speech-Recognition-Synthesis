/*
 * Decompiled with CFR 0.152.
 */
class jdv
extends iwk {
    public final iwk a;

    public jdv(iwk iwk2) {
        this.a = iwk2;
    }

    @Override
    public final itz a(ixb ixb2, itw itw2) {
        return this.a.a(ixb2, itw2);
    }

    @Override
    public final String b() {
        return this.a.b();
    }

    @Override
    public void d() {
        throw null;
    }

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.b("delegate", this.a);
        return gtn2.toString();
    }
}

