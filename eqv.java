/*
 * Decompiled with CFR 0.152.
 */
public final class eqv {
    public final int a;
    public final ekk b;

    public eqv(int n2, ekk ekk2) {
        jse.e(ekk2, "routeData");
        this.a = n2;
        this.b = ekk2;
    }

    public final String a() {
        String string = crh.N(this.b.b);
        StringBuilder stringBuilder = new StringBuilder("route(token(");
        stringBuilder.append(this.a);
        stringBuilder.append("), ");
        stringBuilder.append(string);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof eqv)) {
            return false;
        }
        object = (eqv)object;
        if (this.a != ((eqv)object).a) {
            return false;
        }
        return jse.i(this.b, ((eqv)object).b);
    }

    public final int hashCode() {
        return this.a * 31 + this.b.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SourceRouteData(routeToken=");
        stringBuilder.append(this.a);
        stringBuilder.append(", routeData=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

