/*
 * Decompiled with CFR 0.152.
 */
public final class eph
implements epe {
    public final eaj a;
    public final epc b;
    public final eqb c;
    public final int d;
    public final Integer e;
    public final eao f;
    public final boolean g;

    public eph(eaj eaj2, epc epc2, eqb eqb2, int n2, Integer n3, eao eao2, boolean bl2) {
        jse.e(eaj2, "session");
        jse.e(epc2, "client");
        jse.e(eqb2, "route");
        jse.e(eao2, "params");
        this.a = eaj2;
        this.b = epc2;
        this.c = eqb2;
        this.d = n2;
        this.e = null;
        this.f = eao2;
        this.g = bl2;
    }

    public /* synthetic */ eph(eaj eaj2, epc epc2, eqb eqb2, int n2, Integer n3, eao eao2, boolean bl2, int n4) {
        if ((n4 & 2) != 0) {
            epc2 = new epc(null);
        }
        if ((n4 & 4) != 0) {
            eqb2 = new eqb(null);
        }
        if ((n4 & 8) != 0) {
            n2 = -1;
        }
        if ((n4 & 0x20) != 0) {
            eao2 = dpg.c(eao.a.l()).g();
        }
        if ((n4 & 0x40) != 0) {
            bl2 = n2 == -1;
        }
        this(eaj2, epc2, eqb2, n2, null, eao2, bl2);
    }

    public static /* synthetic */ eph h(eph eph2, epc epc2, eqb eqb2, int n2, eao eao2, int n3) {
        eaj eaj2 = (n3 & 1) != 0 ? eph2.a : null;
        if ((n3 & 2) != 0) {
            epc2 = eph2.b;
        }
        if ((n3 & 4) != 0) {
            eqb2 = eph2.c;
        }
        if ((n3 & 8) != 0) {
            n2 = eph2.d;
        }
        if ((n3 & 0x20) != 0) {
            eao2 = eph2.f;
        }
        boolean bl2 = eph2.g;
        jse.e(eaj2, "session");
        jse.e(epc2, "client");
        jse.e(eqb2, "route");
        jse.e(eao2, "params");
        return new eph(eaj2, epc2, eqb2, n2, null, eao2, bl2);
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
        return this.f;
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
        if (!(object instanceof eph)) {
            return false;
        }
        object = (eph)object;
        if (!jse.i(this.a, ((eph)object).a)) {
            return false;
        }
        if (!jse.i(this.b, ((eph)object).b)) {
            return false;
        }
        if (!jse.i(this.c, ((eph)object).c)) {
            return false;
        }
        if (this.d != ((eph)object).d) {
            return false;
        }
        Integer n2 = ((eph)object).e;
        if (!jse.i(null, null)) {
            return false;
        }
        if (!jse.i(this.f, ((eph)object).f)) {
            return false;
        }
        return this.g == ((eph)object).g;
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
        eao eao2 = this.f;
        if (eao2.B()) {
            n2 = eao2.i();
        } else {
            int n6;
            n2 = n6 = eao2.memoizedHashCode;
            if (n6 == 0) {
                eao2.memoizedHashCode = n2 = eao2.i();
            }
        }
        return ((((n3 * 31 + n4) * 31 + n5) * 31 + this.d) * 961 + n2) * 31 + a.f(this.g);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AudioSessionDataSimple(session=");
        stringBuilder.append(this.a);
        stringBuilder.append(", client=");
        stringBuilder.append(this.b);
        stringBuilder.append(", route=");
        stringBuilder.append(this.c);
        stringBuilder.append(", sessionToken=");
        stringBuilder.append(this.d);
        stringBuilder.append(", parentToken=null, params=");
        stringBuilder.append(this.f);
        stringBuilder.append(", isInactive=");
        stringBuilder.append(this.g);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

