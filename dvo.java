/*
 * Decompiled with CFR 0.152.
 */
public final class dvo {
    public final cjn a;
    public final String b;

    public dvo(cjn cjn2, String string) {
        jse.e(string, "configPackageName");
        this.a = cjn2;
        this.b = string;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof dvo)) {
            return false;
        }
        object = (dvo)object;
        if (!jse.i(this.a, ((dvo)object).a)) {
            return false;
        }
        return jse.i(this.b, ((dvo)object).b);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ExperimentTokenData(experimentToken=");
        stringBuilder.append(this.a);
        stringBuilder.append(", configPackageName=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

