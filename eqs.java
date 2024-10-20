/*
 * Decompiled with CFR 0.152.
 */
public final class eqs {
    public final eot a;
    public final hpn b;

    public eqs(eot eot2, hpn hpn2) {
        this.a = eot2;
        this.b = hpn2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof eqs)) {
            return false;
        }
        object = (eqs)object;
        if (!jse.i(this.a, ((eqs)object).a)) {
            return false;
        }
        return jse.i(this.b, ((eqs)object).b);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("HotwordSourceStartedData(sourceAccessor=");
        stringBuilder.append(this.a);
        stringBuilder.append(", startListeningResult=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

