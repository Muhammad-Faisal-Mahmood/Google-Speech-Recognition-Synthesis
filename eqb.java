/*
 * Decompiled with CFR 0.152.
 */
public final class eqb {
    public final int a;
    public final ekk b;
    public final boolean c;

    public eqb() {
        this(null);
    }

    public eqb(int n2, ekk ekk2, boolean bl2) {
        jse.e(ekk2, "routeData");
        this.a = n2;
        this.b = ekk2;
        this.c = bl2;
    }

    public /* synthetic */ eqb(byte[] byArray) {
        this(-1, ekk.a(), true);
    }

    public final eqv a() {
        return new eqv(this.a, this.b);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof eqb)) {
            return false;
        }
        object = (eqb)object;
        if (this.a != ((eqb)object).a) {
            return false;
        }
        if (!jse.i(this.b, ((eqb)object).b)) {
            return false;
        }
        return this.c == ((eqb)object).c;
    }

    public final int hashCode() {
        return (this.a * 31 + this.b.hashCode()) * 31 + a.f(this.c);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SessionRouteData(routeToken=");
        stringBuilder.append(this.a);
        stringBuilder.append(", routeData=");
        stringBuilder.append(this.b);
        stringBuilder.append(", isInactive=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

