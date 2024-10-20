/*
 * Decompiled with CFR 0.152.
 */
public class kbq
extends jue
implements jqp {
    public final jqb e;

    public kbq(jqf jqf2, jqb jqb2) {
        super(jqf2, true);
        this.e = jqb2;
    }

    @Override
    protected void bB(Object object) {
        jqb jqb2 = this.e;
        jqb2.bD(jsl.m(object, jqb2));
    }

    @Override
    protected void bG(Object object) {
        jqb jqb2 = this.e;
        kba.a(jjj.n(jqb2), jsl.m(object, jqb2));
    }

    @Override
    public final jqp bx() {
        jqb jqb2 = this.e;
        if (jqb2 instanceof jqp) {
            return jqb2;
        }
        return null;
    }

    @Override
    public final void by() {
    }

    @Override
    protected final boolean h() {
        return true;
    }
}

