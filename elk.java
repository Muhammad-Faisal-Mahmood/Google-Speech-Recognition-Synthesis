/*
 * Decompiled with CFR 0.152.
 */
public final class elk {
    public final boolean a;
    public final int b;

    public elk(boolean bl2, int n2) {
        this.a = bl2;
        this.b = n2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof elk)) {
            return false;
        }
        object = (elk)object;
        if (this.a != ((elk)object).a) {
            return false;
        }
        return this.b == ((elk)object).b;
    }

    public final int hashCode() {
        return a.f(this.a) * 31 + this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RefOpResult(existing=");
        stringBuilder.append(this.a);
        stringBuilder.append(", count=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

