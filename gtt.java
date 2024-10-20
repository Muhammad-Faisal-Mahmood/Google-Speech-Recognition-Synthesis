/*
 * Decompiled with CFR 0.152.
 */
public final class gtt
extends gto {
    private static final long serialVersionUID = 0L;
    public final Object a;

    public gtt(Object object) {
        this.a = object;
    }

    @Override
    public final gto a(gto gto2) {
        return this;
    }

    @Override
    public final gto b(gte object) {
        object = object.apply(this.a);
        a.s(object, "the Function passed to Optional.transform() must not return null.");
        return new gtt(object);
    }

    @Override
    public final Object c() {
        return this.a;
    }

    @Override
    public final Object d(gui gui2) {
        fxf.K(gui2);
        return this.a;
    }

    @Override
    public final Object e(Object object) {
        a.s(object, "use Optional.orNull() instead of Optional.or(null)");
        return this.a;
    }

    @Override
    public final boolean equals(Object object) {
        if (object instanceof gtt) {
            object = (gtt)object;
            return this.a.equals(((gtt)object).a);
        }
        return false;
    }

    @Override
    public final Object f() {
        return this.a;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        String string = this.a.toString();
        StringBuilder stringBuilder = new StringBuilder("Optional.of(");
        stringBuilder.append(string);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

