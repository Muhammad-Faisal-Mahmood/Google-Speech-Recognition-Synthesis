/*
 * Decompiled with CFR 0.152.
 */
public final class dzk {
    public final hpn a;
    public final jqz b;

    public dzk(hpn hpn2, jqz jqz2) {
        this.a = hpn2;
        this.b = jqz2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof dzk)) {
            return false;
        }
        object = (dzk)object;
        if (!jse.i(this.a, ((dzk)object).a)) {
            return false;
        }
        return jse.i(this.b, ((dzk)object).b);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RegistryResult(allAudioPushed=");
        stringBuilder.append(this.a);
        stringBuilder.append(", unregister=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

