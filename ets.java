/*
 * Decompiled with CFR 0.152.
 */
public final class ets
implements etr {
    public final esx a;
    public final int b;
    public final Integer c;
    public final etp d;
    public final ekk e;
    private final eak f;
    private final eaw g;
    private final boolean h;

    public /* synthetic */ ets(esx esx2, eak eak2, int n2, etp etp2, eaw eaw2) {
        ekk ekk2 = esx2.a();
        jse.e(eaw2, "params");
        this.a = esx2;
        this.f = eak2;
        this.b = n2;
        this.c = null;
        this.d = etp2;
        this.g = eaw2;
        boolean bl2 = n2 == -1;
        this.h = bl2;
        this.e = ekk2;
    }

    @Override
    public final int a() {
        return this.b;
    }

    @Override
    public final eak b() {
        return this.f;
    }

    @Override
    public final eaw c() {
        return this.g;
    }

    @Override
    public final ekk d() {
        return this.e;
    }

    @Override
    public final /* synthetic */ eqb e() {
        return euf.p(this);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ets)) {
            return false;
        }
        object = (ets)object;
        if (!jse.i(this.a, ((ets)object).a)) {
            return false;
        }
        if (!jse.i(this.f, ((ets)object).f)) {
            return false;
        }
        if (this.b != ((ets)object).b) {
            return false;
        }
        Integer n2 = ((ets)object).c;
        if (!jse.i(null, null)) {
            return false;
        }
        if (!jse.i(this.d, ((ets)object).d)) {
            return false;
        }
        if (!jse.i(this.g, ((ets)object).g)) {
            return false;
        }
        if (this.h != ((ets)object).h) {
            return false;
        }
        return jse.i(this.e, ((ets)object).e);
    }

    @Override
    public final etp f() {
        return this.d;
    }

    @Override
    public final boolean g() {
        return this.h;
    }

    public final int hashCode() {
        int n2;
        int n3 = this.a.hashCode();
        int n4 = this.f.hashCode();
        int n5 = this.b;
        int n6 = this.d.hashCode();
        eaw eaw2 = this.g;
        if (eaw2.B()) {
            n2 = eaw2.i();
        } else {
            int n7;
            n2 = n7 = eaw2.memoizedHashCode;
            if (n7 == 0) {
                eaw2.memoizedHashCode = n2 = eaw2.i();
            }
        }
        return (((((n3 * 31 + n4) * 31 + n5) * 961 + n6) * 31 + n2) * 31 + a.f(this.h)) * 31 + this.e.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AudioRouteSessionDataInternal(audioRoute=");
        stringBuilder.append(this.a);
        stringBuilder.append(", session=");
        stringBuilder.append(this.f);
        stringBuilder.append(", routeToken=");
        stringBuilder.append(this.b);
        stringBuilder.append(", parentToken=null, client=");
        stringBuilder.append(this.d);
        stringBuilder.append(", params=");
        stringBuilder.append(this.g);
        stringBuilder.append(", isInactive=");
        stringBuilder.append(this.h);
        stringBuilder.append(", routeData=");
        stringBuilder.append(this.e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

