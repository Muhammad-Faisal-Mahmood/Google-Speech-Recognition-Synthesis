/*
 * Decompiled with CFR 0.152.
 */
public final class bgs {
    public final String a;
    public final int b;

    public bgs(String string, int n2) {
        jse.e(string, "workSpecId");
        this.a = string;
        this.b = n2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof bgs)) {
            return false;
        }
        object = (bgs)object;
        if (!jse.i(this.a, ((bgs)object).a)) {
            return false;
        }
        return this.b == ((bgs)object).b;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31 + this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("WorkGenerationalId(workSpecId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", generation=");
        stringBuilder.append(this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

