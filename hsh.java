/*
 * Decompiled with CFR 0.152.
 */
public final class hsh {
    public final String a;

    public hsh() {
        throw null;
    }

    public hsh(String string) {
        if (string != null) {
            this.a = string;
            return;
        }
        throw new NullPointerException("Null host");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof hsh) {
            object = (hsh)object;
            if (this.a.equals(((hsh)object).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ 0x1BB) * 1000003 ^ 0x1BB;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("QuicHint{host=");
        stringBuilder.append(this.a);
        stringBuilder.append(", port=443, alternatePort=443}");
        return stringBuilder.toString();
    }
}

