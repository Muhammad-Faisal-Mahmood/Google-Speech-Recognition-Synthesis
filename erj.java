/*
 * Decompiled with CFR 0.152.
 */
public final class erj
implements erl {
    public final String a;

    public erj() {
        this.a = "";
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof erj)) {
            return false;
        }
        object = (erj)object;
        return jse.i(this.a, ((erj)object).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("NotOwned(actualOwnerApp=");
        stringBuilder.append(this.a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

