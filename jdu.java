/*
 * Decompiled with CFR 0.152.
 */
abstract class jdu
implements jcu {
    protected abstract jcu a();

    @Override
    public jcj b(ixb ixb2, iwx iwx2, itw itw2, iuc[] iucArray) {
        throw null;
    }

    @Override
    public final ivn c() {
        return this.a().c();
    }

    @Override
    public final Runnable d(jge jge2) {
        return this.a().d(jge2);
    }

    @Override
    public void o(iyh iyh2) {
        this.a().o(iyh2);
    }

    @Override
    public final void p(iyh iyh2) {
        throw null;
    }

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.b("delegate", this.a());
        return gtn2.toString();
    }
}

