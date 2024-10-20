/*
 * Decompiled with CFR 0.152.
 */
public final class jyc {
    public static final jyb a = new jyb();
    public final Object b;

    public /* synthetic */ jyc(Object object) {
        this.b = object;
    }

    public static final Object a(Object object) {
        if (!(object instanceof jyb)) {
            return object;
        }
        return null;
    }

    public final boolean equals(Object object) {
        return object instanceof jyc && jse.i(this.b, ((jyc)object).b);
    }

    public final int hashCode() {
        Object object = this.b;
        if (object == null) {
            return 0;
        }
        return object.hashCode();
    }

    public final String toString() {
        Object object = this.b;
        object = object instanceof jya ? ((jyb)((jya)object)).toString() : a.ak(object, "Value(", ")");
        return object;
    }
}

