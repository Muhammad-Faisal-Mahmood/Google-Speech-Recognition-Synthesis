/*
 * Decompiled with CFR 0.152.
 */
public final class eub
implements etz {
    private final ecr a;
    private final int b;
    private final ekk c;
    private final ebk d;
    private final boolean e;

    public eub(ecr ecr2, int n2, ekk ekk2, ebk ebk2) {
        jse.e(ecr2, "session");
        jse.e(ekk2, "routeData");
        jse.e(ebk2, "params");
        this.a = ecr2;
        this.b = n2;
        this.c = ekk2;
        this.d = ebk2;
        this.e = true;
    }

    public static /* synthetic */ eub g(eub eub2, int n2, ebk ebk2, int n3) {
        ekk ekk2 = null;
        ecr ecr2 = (n3 & 1) != 0 ? eub2.a : null;
        if ((n3 & 2) != 0) {
            n2 = eub2.b;
        }
        if ((n3 & 4) != 0) {
            ekk2 = eub2.c;
        }
        if ((n3 & 8) != 0) {
            ebk2 = eub2.d;
        }
        jse.e(ecr2, "session");
        jse.e(ekk2, "routeData");
        jse.e(ebk2, "params");
        return new eub(ecr2, n2, ekk2, ebk2);
    }

    @Override
    public final int a() {
        return this.b;
    }

    @Override
    public final ebk b() {
        return this.d;
    }

    @Override
    public final ecr c() {
        return this.a;
    }

    @Override
    public final ekk d() {
        return this.c;
    }

    @Override
    public final /* synthetic */ eqb e() {
        return euf.m(this);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof eub)) {
            return false;
        }
        object = (eub)object;
        if (!jse.i(this.a, ((eub)object).a)) {
            return false;
        }
        if (this.b != ((eub)object).b) {
            return false;
        }
        if (!jse.i(this.c, ((eub)object).c)) {
            return false;
        }
        if (!jse.i(this.d, ((eub)object).d)) {
            return false;
        }
        boolean bl2 = ((eub)object).e;
        return true;
    }

    @Override
    public final boolean f() {
        return true;
    }

    public final int hashCode() {
        int n2;
        int n3 = this.a.hashCode();
        Object object = this.c;
        int n4 = this.b;
        int n5 = ((ekk)object).hashCode();
        object = this.d;
        if (((hwv)object).B()) {
            n2 = ((hwv)object).i();
        } else {
            int n6;
            n2 = n6 = ((hwv)object).memoizedHashCode;
            if (n6 == 0) {
                ((hwv)object).memoizedHashCode = n2 = ((hwv)object).i();
            }
        }
        return (((n3 * 31 + n4) * 31 + n5) * 31 + n2) * 31 + a.f(true);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("HotwordRouteSessionDataSimple(session=");
        stringBuilder.append(this.a);
        stringBuilder.append(", routeToken=");
        stringBuilder.append(this.b);
        stringBuilder.append(", routeData=");
        stringBuilder.append(this.c);
        stringBuilder.append(", params=");
        stringBuilder.append(this.d);
        stringBuilder.append(", isInactive=true)");
        return stringBuilder.toString();
    }
}

