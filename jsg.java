/*
 * Decompiled with CFR 0.152.
 */
public final class jsg
implements jry {
    private final Class a;

    public jsg(Class clazz) {
        this.a = clazz;
    }

    @Override
    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object object) {
        return object instanceof jsg && jse.i(this.a, ((jsg)object).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return String.valueOf(this.a.toString()).concat(" (Kotlin reflection is not available)");
    }
}

