/*
 * Decompiled with CFR 0.152.
 */
public final class eol
implements eom {
    public final int a;

    public eol(int n2) {
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
        if (!(object instanceof eol)) {
            return false;
        }
        object = (eol)object;
        return this.a == ((eol)object).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RelativeOffset(bytes=");
        stringBuilder.append(this.a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

