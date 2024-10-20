/*
 * Decompiled with CFR 0.152.
 */
public final class ber
extends ass {
    public final int a;

    public ber(int n2) {
        this.a = n2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ber)) {
            return false;
        }
        object = (ber)object;
        return this.a == ((ber)object).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ConstraintsNotMet(reason=");
        stringBuilder.append(this.a);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

