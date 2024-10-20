/*
 * Decompiled with CFR 0.152.
 */
public final class dyd {
    private final String a;
    private final dxk b;

    public dyd() {
        throw null;
    }

    public dyd(String string, dxk dxk2) {
        if (string != null) {
            this.a = string;
            this.b = dxk2;
            return;
        }
        throw new NullPointerException("Null name");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dyd) {
            object = (dyd)object;
            if (this.a.equals(((dyd)object).a) && this.b.equals(((dyd)object).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }

    public final String toString() {
        String string = this.b.toString();
        StringBuilder stringBuilder = new StringBuilder("NamedTracker{name=");
        stringBuilder.append(this.a);
        stringBuilder.append(", tracker=");
        stringBuilder.append(string);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

