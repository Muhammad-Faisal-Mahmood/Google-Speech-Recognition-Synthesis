/*
 * Decompiled with CFR 0.152.
 */
public final class ceg {
    private final Object a;
    private final String b;

    public ceg(Object object, String string) {
        this.a = object;
        this.b = string;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ceg)) {
            return false;
        }
        object = (ceg)object;
        return this.a == ((ceg)object).a && this.b.equals(((ceg)object).b);
    }

    public final int hashCode() {
        return System.identityHashCode(this.a) * 31 + this.b.hashCode();
    }
}

