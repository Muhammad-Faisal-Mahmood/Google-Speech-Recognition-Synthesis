/*
 * Decompiled with CFR 0.152.
 */
public final class eok
implements eom {
    public final int a;

    public eok(int n2) {
        this.a = n2;
    }

    @Override
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof eok)) {
            return false;
        }
        object = (eok)object;
        return this.a == ((eok)object).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AbsoluteOffset(bytes=");
        stringBuilder.append(this.a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

