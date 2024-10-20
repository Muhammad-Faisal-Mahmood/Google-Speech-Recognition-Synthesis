/*
 * Decompiled with CFR 0.152.
 */
public final class eqt {
    public final int a;
    public final Object b;
    public final eqv c;
    public final eot d;

    public eqt(int n2, Object object, eqv eqv2, eot eot2) {
        this.a = n2;
        this.b = object;
        this.c = eqv2;
        this.d = eot2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof eqt)) {
            return false;
        }
        object = (eqt)object;
        if (this.a != ((eqt)object).a) {
            return false;
        }
        if (!jse.i(this.b, ((eqt)object).b)) {
            return false;
        }
        if (!jse.i(this.c, ((eqt)object).c)) {
            return false;
        }
        return jse.i(this.d, ((eqt)object).d);
    }

    public final int hashCode() {
        int n2;
        Object object = this.b;
        if (object == null) {
            n2 = 0;
        } else if (((hwv)(object = (hwv)object)).B()) {
            n2 = ((hwv)object).i();
        } else {
            int n3;
            n2 = n3 = ((hwv)object).memoizedHashCode;
            if (n3 == 0) {
                ((hwv)object).memoizedHashCode = n2 = ((hwv)object).i();
            }
        }
        return ((this.a * 31 + n2) * 31 + this.c.hashCode()) * 31 + this.d.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SourceData(sessionToken=");
        stringBuilder.append(this.a);
        stringBuilder.append(", sessionParams=");
        stringBuilder.append(this.b);
        stringBuilder.append(", route=");
        stringBuilder.append(this.c);
        stringBuilder.append(", sourceAccessor=");
        stringBuilder.append(this.d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

