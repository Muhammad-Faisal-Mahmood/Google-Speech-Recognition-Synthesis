/*
 * Decompiled with CFR 0.152.
 */
public final class fsw {
    public final String a;
    public final Class b;

    public fsw(String string, Class clazz) {
        this.a = string;
        this.b = clazz;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof fsw) {
            object = (fsw)object;
            if (this.b == ((fsw)object).b && this.a.equals(((fsw)object).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return String.format("(%s, %s)", this.a, this.b);
    }
}

