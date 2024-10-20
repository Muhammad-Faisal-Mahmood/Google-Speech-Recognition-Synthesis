/*
 * Decompiled with CFR 0.152.
 */
public final class eql {
    public final int a;
    public final eqm b;
    public final eae c;

    public eql(int n2, eqm eqm2, eae eae2) {
        jse.e(eae2, "sourceParams");
        this.a = n2;
        this.b = eqm2;
        this.c = eae2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof eql)) {
            return false;
        }
        object = (eql)object;
        if (this.a != ((eql)object).a) {
            return false;
        }
        if (!jse.i(this.b, ((eql)object).b)) {
            return false;
        }
        return jse.i(this.c, ((eql)object).c);
    }

    public final int hashCode() {
        int n2;
        int n3 = this.a;
        int n4 = this.b.hashCode();
        eae eae2 = this.c;
        if (eae2.B()) {
            n2 = eae2.i();
        } else {
            int n5;
            n2 = n5 = eae2.memoizedHashCode;
            if (n5 == 0) {
                eae2.memoizedHashCode = n2 = eae2.i();
            }
        }
        return (n3 * 31 + n4) * 31 + n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PreStart(routeToken=");
        stringBuilder.append(this.a);
        stringBuilder.append(", session=");
        stringBuilder.append(this.b);
        stringBuilder.append(", sourceParams=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

