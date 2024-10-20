/*
 * Decompiled with CFR 0.152.
 */
final class jch
implements jcl {
    public iyh a;
    final jci b;
    public final fvc c;

    public jch(jci jci2, fvc fvc2) {
        this.b = jci2;
        a.s(fvc2, "observer");
        this.c = fvc2;
    }

    @Override
    public final void a(iyh iyh2, jck object, iwx iwx2) {
        int n2 = jnr.a;
        iut iut2 = this.b.b();
        iyh iyh3 = iyh2;
        object = iwx2;
        if (iyh2.n == iye.b) {
            iyh3 = iyh2;
            object = iwx2;
            if (iut2 != null) {
                iyh3 = iyh2;
                object = iwx2;
                if (iut2.f()) {
                    iyh3 = this.b.f.b();
                    object = new iwx();
                }
            }
        }
        this.b.c.execute(new jcf(this, iyh3, (iwx)object));
    }

    public final void b(iyh iyh2) {
        this.a = iyh2;
        this.b.h.c(iyh2);
    }

    @Override
    public final void c(iwx iwx2) {
        int n2 = jnr.a;
        this.b.c.execute(new jcd(this, iwx2));
    }

    @Override
    public final void d(jjq jjq2) {
        int n2 = jnr.a;
        this.b.c.execute(new jce(this, jjq2));
    }

    @Override
    public final void e() {
        if (this.b.b.a.a()) {
            return;
        }
        int n2 = jnr.a;
        this.b.c.execute(new jcg(this));
    }
}

