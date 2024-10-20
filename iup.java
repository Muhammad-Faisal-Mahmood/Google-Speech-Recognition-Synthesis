/*
 * Decompiled with CFR 0.152.
 */
public final class iup {
    private final String a;

    public iup(String string) {
        ius ius2 = ius.d;
        this.a = string;
    }

    public final Object a(ius object) {
        object = ((ius)object).f;
        object = object == null ? null : object.d(this, this.hashCode(), 0);
        if (object == null) {
            return null;
        }
        return object;
    }

    public final String toString() {
        return this.a;
    }
}

