/*
 * Decompiled with CFR 0.152.
 */
public final class eqn {
    public final eot a;
    public final hpn b;

    public eqn(eot eot2, hpn hpn2) {
        jse.e(hpn2, "startListeningResult");
        this.a = eot2;
        this.b = hpn2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof eqn)) {
            return false;
        }
        object = (eqn)object;
        if (!jse.i(this.a, ((eqn)object).a)) {
            return false;
        }
        return jse.i(this.b, ((eqn)object).b);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AudioSourceStartedData(sourceAccessor=");
        stringBuilder.append(this.a);
        stringBuilder.append(", startListeningResult=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

