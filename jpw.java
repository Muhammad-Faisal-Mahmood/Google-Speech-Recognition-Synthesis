/*
 * Decompiled with CFR 0.152.
 */
public class jpw
implements jqd {
    private final jqe key;

    public jpw(jqe jqe2) {
        jse.e(jqe2, "key");
        this.key = jqe2;
    }

    @Override
    public Object fold(Object object, jro jro2) {
        return jjj.o(this, object, jro2);
    }

    @Override
    public jqd get(jqe jqe2) {
        return jjj.p(this, jqe2);
    }

    @Override
    public jqe getKey() {
        return this.key;
    }

    @Override
    public jqf minusKey(jqe jqe2) {
        return jjj.q(this, jqe2);
    }

    @Override
    public jqf plus(jqf jqf2) {
        return jjj.r(this, jqf2);
    }
}

