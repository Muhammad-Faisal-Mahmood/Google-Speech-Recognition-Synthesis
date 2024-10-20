/*
 * Decompiled with CFR 0.152.
 */
public final class ezi {
    public final String a;
    public final String b;

    public ezi() {
        throw null;
    }

    public ezi(String string, String string2) {
        if (string != null) {
            this.a = string;
            if (string2 != null) {
                this.b = string2;
                return;
            }
            throw new NullPointerException("Null hashValueSha1");
        }
        throw new NullPointerException("Null downloadUrl");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof ezi) {
            object = (ezi)object;
            if (this.a.equals(((ezi)object).a) && this.b.equals(((ezi)object).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ZipfileParams{downloadUrl=");
        stringBuilder.append(this.a);
        stringBuilder.append(", hashValueSha1=");
        stringBuilder.append(this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

