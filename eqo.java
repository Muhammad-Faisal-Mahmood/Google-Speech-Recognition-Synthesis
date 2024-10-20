/*
 * Decompiled with CFR 0.152.
 */
public final class eqo {
    public final eot a;
    public final eqv b;
    public final eqr c;

    public eqo(eot eot2, eqv eqv2, eqr eqr2) {
        this.a = eot2;
        this.b = eqv2;
        this.c = eqr2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof eqo)) {
            return false;
        }
        object = (eqo)object;
        if (!jse.i(this.a, ((eqo)object).a)) {
            return false;
        }
        if (!jse.i(this.b, ((eqo)object).b)) {
            return false;
        }
        return jse.i(this.c, ((eqo)object).c);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("HotwordSourceData(sourceAccessor=");
        stringBuilder.append(this.a);
        stringBuilder.append(", route=");
        stringBuilder.append(this.b);
        stringBuilder.append(", session=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

