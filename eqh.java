/*
 * Decompiled with CFR 0.152.
 */
public final class eqh {
    public final eot a;
    public final eqg b;
    public final eqm c;
    private final eqv d;

    public eqh(eot eot2, eqg eqg2, eqv eqv2, eqm eqm2) {
        this.a = eot2;
        this.b = eqg2;
        this.d = eqv2;
        this.c = eqm2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof eqh)) {
            return false;
        }
        object = (eqh)object;
        if (!jse.i(this.a, ((eqh)object).a)) {
            return false;
        }
        if (!jse.i(this.b, ((eqh)object).b)) {
            return false;
        }
        if (!jse.i(this.d, ((eqh)object).d)) {
            return false;
        }
        return jse.i(this.c, ((eqh)object).c);
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.d.hashCode()) * 31 + this.c.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AudioSourceData(sourceAccessor=");
        stringBuilder.append(this.a);
        stringBuilder.append(", client=");
        stringBuilder.append(this.b);
        stringBuilder.append(", route=");
        stringBuilder.append(this.d);
        stringBuilder.append(", session=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

