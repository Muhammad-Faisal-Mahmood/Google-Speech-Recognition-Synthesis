/*
 * Decompiled with CFR 0.152.
 */
abstract class jdt
implements jcl {
    @Override
    public void a(iyh iyh2, jck jck2, iwx iwx2) {
        throw null;
    }

    protected abstract jcl b();

    @Override
    public final void c(iwx iwx2) {
        this.b().c(iwx2);
    }

    @Override
    public final void d(jjq jjq2) {
        this.b().d(jjq2);
    }

    @Override
    public final void e() {
        this.b().e();
    }

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.b("delegate", this.b());
        return gtn2.toString();
    }
}

