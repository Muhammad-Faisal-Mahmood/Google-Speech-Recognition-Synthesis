/*
 * Decompiled with CFR 0.152.
 */
final class dxp {
    private final String a;
    private final String b;

    public dxp() {
        throw null;
    }

    public dxp(String string, String string2) {
        if (string != null) {
            this.a = string;
            if (string2 != null) {
                this.b = string2;
                return;
            }
            throw new NullPointerException("Null value");
        }
        throw new NullPointerException("Null tag");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dxp) {
            object = (dxp)object;
            if (this.a.equals(((dxp)object).a) && this.b.equals(((dxp)object).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Tag{tag=");
        stringBuilder.append(this.a);
        stringBuilder.append(", value=");
        stringBuilder.append(this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

