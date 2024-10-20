/*
 * Decompiled with CFR 0.152.
 */
public final class gsl
extends gto {
    public static final gsl a = new gsl();
    private static final long serialVersionUID = 0L;

    private gsl() {
    }

    private Object readResolve() {
        return a;
    }

    @Override
    public final gto a(gto gto2) {
        return gto2;
    }

    @Override
    public final gto b(gte gte2) {
        return a;
    }

    @Override
    public final Object c() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override
    public final Object d(gui object) {
        object = object.a();
        a.s(object, "use Optional.orNull() instead of a Supplier that returns null");
        return object;
    }

    @Override
    public final Object e(Object object) {
        a.s(object, "use Optional.orNull() instead of Optional.or(null)");
        return object;
    }

    @Override
    public final boolean equals(Object object) {
        return object == this;
    }

    @Override
    public final Object f() {
        return null;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}

