/*
 * Decompiled with CFR 0.152.
 */
public final class jvl
extends kbq {
    public final jua b = new jua(0, jud.a);

    public jvl(jqf jqf2, jqb jqb2) {
        super(jqf2, jqb2);
    }

    @Override
    protected final void bB(Object object) {
        do {
            int n2;
            if ((n2 = this.b.b) == 0) continue;
            if (n2 == 1) {
                jqb jqb2 = this.e;
                kba.a(jjj.n(jqb2), jsl.m(object, jqb2));
                return;
            }
            throw new IllegalStateException("Already resumed");
        } while (!this.b.b(0, 2));
    }

    @Override
    protected final void bG(Object object) {
        ((jue)this).bB(object);
    }
}

