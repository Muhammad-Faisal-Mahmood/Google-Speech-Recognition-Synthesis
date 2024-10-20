/*
 * Decompiled with CFR 0.152.
 */
public final class eua
implements etz {
    public final esx a;
    public final int b;
    public final ebk c;
    public final ekk d;
    private final ecr e;
    private final boolean f;

    public /* synthetic */ eua(esx esx2, ecr ecr2, int n2, ebk ebk2) {
        ekk ekk2 = esx2.a();
        jse.e(ebk2, "params");
        this.a = esx2;
        this.e = ecr2;
        this.b = n2;
        this.c = ebk2;
        boolean bl2 = n2 == -1;
        this.f = bl2;
        this.d = ekk2;
    }

    @Override
    public final int a() {
        return this.b;
    }

    @Override
    public final ebk b() {
        return this.c;
    }

    @Override
    public final ecr c() {
        return this.e;
    }

    @Override
    public final ekk d() {
        return this.d;
    }

    @Override
    public final /* synthetic */ eqb e() {
        return euf.m(this);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof eua)) {
            return false;
        }
        object = (eua)object;
        if (!jse.i(this.a, ((eua)object).a)) {
            return false;
        }
        if (!jse.i(this.e, ((eua)object).e)) {
            return false;
        }
        if (this.b != ((eua)object).b) {
            return false;
        }
        if (!jse.i(this.c, ((eua)object).c)) {
            return false;
        }
        if (this.f != ((eua)object).f) {
            return false;
        }
        return jse.i(this.d, ((eua)object).d);
    }

    @Override
    public final boolean f() {
        return this.f;
    }

    public final int hashCode() {
        int n2;
        int n3 = this.a.hashCode();
        int n4 = this.e.hashCode();
        ebk ebk2 = this.c;
        if (ebk2.B()) {
            n2 = ebk2.i();
        } else {
            int n5;
            n2 = n5 = ebk2.memoizedHashCode;
            if (n5 == 0) {
                ebk2.memoizedHashCode = n2 = ebk2.i();
            }
        }
        return ((((n3 * 31 + n4) * 31 + this.b) * 31 + n2) * 31 + a.f(this.f)) * 31 + this.d.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("HotwordRouteSessionDataInternal(audioRoute=");
        stringBuilder.append(this.a);
        stringBuilder.append(", session=");
        stringBuilder.append(this.e);
        stringBuilder.append(", routeToken=");
        stringBuilder.append(this.b);
        stringBuilder.append(", params=");
        stringBuilder.append(this.c);
        stringBuilder.append(", isInactive=");
        stringBuilder.append(this.f);
        stringBuilder.append(", routeData=");
        stringBuilder.append(this.d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

