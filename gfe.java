/*
 * Decompiled with CFR 0.152.
 */
public final class gfe {
    public final String a;
    public final String b;

    public gfe(String string, String string2) {
        jse.e(string, "packageName");
        jse.e(string2, "flagName");
        this.a = string;
        this.b = string2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof gfe)) {
            return false;
        }
        object = (gfe)object;
        if (!jse.i(this.a, ((gfe)object).a)) {
            return false;
        }
        return jse.i(this.b, ((gfe)object).b);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PackageAndFlagName(packageName=");
        stringBuilder.append(this.a);
        stringBuilder.append(", flagName=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

