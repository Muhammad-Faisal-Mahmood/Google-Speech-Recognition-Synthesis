/*
 * Decompiled with CFR 0.152.
 */
public final class ekl {
    public final ecr a;
    public final int b;

    public ekl(ecr ecr2, int n2) {
        jse.e(ecr2, "routeSession");
        this.a = ecr2;
        this.b = n2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ekl)) {
            return false;
        }
        object = (ekl)object;
        if (!jse.i(this.a, ((ekl)object).a)) {
            return false;
        }
        return this.b == ((ekl)object).b;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31 + this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("HotwordClientRouteUpdateData(routeSession=");
        stringBuilder.append(this.a);
        stringBuilder.append(", routeToken=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

