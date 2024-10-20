/*
 * Decompiled with CFR 0.152.
 */
public final class kab
implements jqf {
    public final Throwable a;
    private final jqf b;

    public kab(Throwable throwable, jqf jqf2) {
        this.b = jqf2;
        this.a = throwable;
    }

    @Override
    public final Object fold(Object object, jro jro2) {
        return this.b.fold(object, jro2);
    }

    @Override
    public final jqd get(jqe jqe2) {
        return this.b.get(jqe2);
    }

    @Override
    public final jqf minusKey(jqe jqe2) {
        return this.b.minusKey(jqe2);
    }

    @Override
    public final jqf plus(jqf jqf2) {
        return this.b.plus(jqf2);
    }
}

