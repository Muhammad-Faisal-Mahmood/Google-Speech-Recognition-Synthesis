/*
 * Decompiled with CFR 0.152.
 */
public final class ezh {
    public final String a;

    public ezh() {
        throw null;
    }

    public ezh(String string) {
        if (string != null) {
            this.a = string;
            return;
        }
        throw new NullPointerException("Null filepath");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof ezh) {
            object = (ezh)object;
            return this.a.equals(((ezh)object).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ReadOnlyParams{filepath=");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

