/*
 * Decompiled with CFR 0.152.
 */
class jdw
extends ixi {
    public final ixi a;

    public jdw(ixi ixi2) {
        this.a = ixi2;
    }

    @Override
    public final String a() {
        return this.a.a();
    }

    @Override
    public final void b() {
        this.a.b();
    }

    @Override
    public void c() {
        throw null;
    }

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.b("delegate", this.a);
        return gtn2.toString();
    }
}

