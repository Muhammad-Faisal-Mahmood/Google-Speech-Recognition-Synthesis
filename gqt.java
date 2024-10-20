/*
 * Decompiled with CFR 0.152.
 */
public final class gqt
implements jxb {
    public static final gqs a = new gqs();
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final gqr e;
    public final fxf f;

    public gqt(fxf fxf2, boolean bl2, boolean bl3, boolean bl4) {
        boolean bl5;
        this.f = fxf2;
        this.b = bl2;
        this.c = bl3;
        this.d = bl4;
        bl4 = bl5 = false;
        if (bl2) {
            bl4 = bl5;
            if (!bl3) {
                bl4 = true;
            }
        }
        this.e = new gqr(bl4);
    }

    public final gqt c() {
        Object object = gno.a().e;
        boolean bl2 = true;
        boolean bl3 = object != null ? ((gqr)object).a : true;
        object = this.f;
        boolean bl4 = gno.a || this.b || this.d;
        bl3 = (!bl3 || this.c) && !this.d ? bl2 : false;
        return new gqt((fxf)object, bl4, bl3, false);
    }

    @Override
    public final Object fold(Object object, jro jro2) {
        return jjj.o(this, object, jro2);
    }

    @Override
    public final jqd get(jqe jqe2) {
        return jjj.p(this, jqe2);
    }

    @Override
    public final jqe getKey() {
        return a;
    }

    @Override
    public final jqf minusKey(jqe jqe2) {
        return jjj.q(this, jqe2);
    }

    @Override
    public final jqf plus(jqf jqf2) {
        return jjj.r(this, jqf2);
    }
}

