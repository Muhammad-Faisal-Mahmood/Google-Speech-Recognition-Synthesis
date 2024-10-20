/*
 * Decompiled with CFR 0.152.
 */
public final class ett
implements etr {
    private final eak a;
    private final int b;
    private final Integer c;
    private final ekk d;
    private final etp e;
    private final eaw f;
    private final boolean g;

    public ett(eak eak2, int n2, ekk ekk2, etp etp2, eaw eaw2) {
        jse.e(eak2, "session");
        jse.e(ekk2, "routeData");
        jse.e(eaw2, "params");
        this.a = eak2;
        this.b = n2;
        this.c = null;
        this.d = ekk2;
        this.e = etp2;
        this.f = eaw2;
        this.g = true;
    }

    public static /* synthetic */ ett h(ett ett2, int n2, etp etp2, eaw eaw2, int n3) {
        ekk ekk2 = null;
        eak eak2 = (n3 & 1) != 0 ? ett2.a : null;
        if ((n3 & 2) != 0) {
            n2 = ett2.b;
        }
        if ((n3 & 8) != 0) {
            ekk2 = ett2.d;
        }
        if ((n3 & 0x10) != 0) {
            etp2 = ett2.e;
        }
        if ((n3 & 0x20) != 0) {
            eaw2 = ett2.f;
        }
        jse.e(eak2, "session");
        jse.e(ekk2, "routeData");
        jse.e(eaw2, "params");
        return new ett(eak2, n2, ekk2, etp2, eaw2);
    }

    @Override
    public final int a() {
        return this.b;
    }

    @Override
    public final eak b() {
        return this.a;
    }

    @Override
    public final eaw c() {
        return this.f;
    }

    @Override
    public final ekk d() {
        return this.d;
    }

    @Override
    public final /* synthetic */ eqb e() {
        return euf.p(this);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ett)) {
            return false;
        }
        object = (ett)object;
        if (!jse.i(this.a, ((ett)object).a)) {
            return false;
        }
        if (this.b != ((ett)object).b) {
            return false;
        }
        Integer n2 = ((ett)object).c;
        if (!jse.i(null, null)) {
            return false;
        }
        if (!jse.i(this.d, ((ett)object).d)) {
            return false;
        }
        if (!jse.i(this.e, ((ett)object).e)) {
            return false;
        }
        if (!jse.i(this.f, ((ett)object).f)) {
            return false;
        }
        boolean bl2 = ((ett)object).g;
        return true;
    }

    @Override
    public final etp f() {
        return this.e;
    }

    @Override
    public final boolean g() {
        return true;
    }

    public final int hashCode() {
        int n2;
        int n3 = this.a.hashCode();
        int n4 = this.b;
        int n5 = this.d.hashCode();
        int n6 = this.e.hashCode();
        eaw eaw2 = this.f;
        if (eaw2.B()) {
            n2 = eaw2.i();
        } else {
            int n7;
            n2 = n7 = eaw2.memoizedHashCode;
            if (n7 == 0) {
                eaw2.memoizedHashCode = n2 = eaw2.i();
            }
        }
        return ((((n3 * 31 + n4) * 961 + n5) * 31 + n6) * 31 + n2) * 31 + a.f(true);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AudioRouteSessionDataSimple(session=");
        stringBuilder.append(this.a);
        stringBuilder.append(", routeToken=");
        stringBuilder.append(this.b);
        stringBuilder.append(", parentToken=null, routeData=");
        stringBuilder.append(this.d);
        stringBuilder.append(", client=");
        stringBuilder.append(this.e);
        stringBuilder.append(", params=");
        stringBuilder.append(this.f);
        stringBuilder.append(", isInactive=true)");
        return stringBuilder.toString();
    }
}

