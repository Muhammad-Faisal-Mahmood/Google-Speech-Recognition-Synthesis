/*
 * Decompiled with CFR 0.152.
 */
public final class epf
implements epe {
    public final eaj a;
    public final epc b;
    public final eqb c;
    public final int d;
    public final Integer e;
    public final jwi f;
    private final eao g;
    private final boolean h;

    public epf(eaj eaj2, epc epc2, eqb eqb2, int n2, Integer n3, eao eao2, boolean bl2, jwi jwi2) {
        jse.e(eaj2, "session");
        jse.e(epc2, "client");
        jse.e(eqb2, "route");
        jse.e(eao2, "params");
        this.a = eaj2;
        this.b = epc2;
        this.c = eqb2;
        this.d = n2;
        this.e = null;
        this.g = eao2;
        this.h = bl2;
        this.f = jwi2;
    }

    @Override
    public final int a() {
        return this.d;
    }

    @Override
    public final eaj b() {
        return this.a;
    }

    @Override
    public final eao c() {
        return this.g;
    }

    @Override
    public final epc d() {
        return this.b;
    }

    @Override
    public final eqb e() {
        return this.c;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof epf)) {
            return false;
        }
        epf epf2 = (epf)object;
        if (!jse.i(this.a, epf2.a)) {
            return false;
        }
        if (!jse.i(this.b, epf2.b)) {
            return false;
        }
        if (!jse.i(this.c, epf2.c)) {
            return false;
        }
        if (this.d != epf2.d) {
            return false;
        }
        object = epf2.e;
        if (!jse.i(null, null)) {
            return false;
        }
        if (!jse.i(this.g, epf2.g)) {
            return false;
        }
        if (this.h != epf2.h) {
            return false;
        }
        return jse.i(this.f, epf2.f);
    }

    @Override
    public final /* synthetic */ hpn f() {
        return cqq.am(this);
    }

    @Override
    public final /* synthetic */ Object g(jqb jqb2) {
        return cqq.an(this, jqb2);
    }

    public final int hashCode() {
        int n2;
        int n3 = this.a.hashCode();
        int n4 = this.b.hashCode();
        int n5 = this.c.hashCode();
        eao eao2 = this.g;
        if (eao2.B()) {
            n2 = eao2.i();
        } else {
            int n6;
            n2 = n6 = eao2.memoizedHashCode;
            if (n6 == 0) {
                eao2.memoizedHashCode = n2 = eao2.i();
            }
        }
        return (((((n3 * 31 + n4) * 31 + n5) * 31 + this.d) * 961 + n2) * 31 + a.f(this.h)) * 31 + this.f.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AudioSessionDataInternal(session=");
        stringBuilder.append(this.a);
        stringBuilder.append(", client=");
        stringBuilder.append(this.b);
        stringBuilder.append(", route=");
        stringBuilder.append(this.c);
        stringBuilder.append(", sessionToken=");
        stringBuilder.append(this.d);
        stringBuilder.append(", parentToken=null, params=");
        stringBuilder.append(this.g);
        stringBuilder.append(", isInactive=");
        stringBuilder.append(this.h);
        stringBuilder.append(", routeDisconnectJob=");
        stringBuilder.append(this.f);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

