/*
 * Decompiled with CFR 0.152.
 */
public final class ekh {
    public final eak a;
    public final int b;

    public ekh(eak eak2, int n2) {
        jse.e(eak2, "routeSession");
        this.a = eak2;
        this.b = n2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ekh)) {
            return false;
        }
        object = (ekh)object;
        if (!jse.i(this.a, ((ekh)object).a)) {
            return false;
        }
        return this.b == ((ekh)object).b;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31 + this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AudioClientRouteUpdateData(routeSession=");
        stringBuilder.append(this.a);
        stringBuilder.append(", routeToken=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

