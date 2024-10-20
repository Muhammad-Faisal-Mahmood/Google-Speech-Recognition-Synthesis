/*
 * Decompiled with CFR 0.152.
 */
public final class eps
implements epp {
    public final ecu a;
    public final eqb b;
    public final ecw c;
    public final int d;
    public final boolean e;

    public eps(ecu ecu2, eqb eqb2, ecw ecw2, int n2, boolean bl2) {
        jse.e(ecu2, "session");
        jse.e(eqb2, "route");
        jse.e(ecw2, "params");
        this.a = ecu2;
        this.b = eqb2;
        this.c = ecw2;
        this.d = n2;
        this.e = bl2;
    }

    public /* synthetic */ eps(ecu ecu2, eqb eqb2, ecw hyg2, int n2, boolean bl2, int n3) {
        if ((n3 & 2) != 0) {
            eqb2 = new eqb(null);
        }
        if ((n3 & 4) != 0) {
            hyg2 = ecw.a.l();
            jse.e(hyg2, "builder");
            hyg2 = ((hwp)hyg2).o();
            jse.d(hyg2, "build(...)");
            hyg2 = (ecw)hyg2;
        }
        if ((n3 & 8) != 0) {
            n2 = -1;
        }
        if ((n3 & 0x10) != 0) {
            bl2 = n2 == -1;
        }
        this(ecu2, eqb2, (ecw)hyg2, n2, bl2);
    }

    public static /* synthetic */ eps e(eps eps2, eqb eqb2, ecw ecw2, int n2, int n3) {
        ecu ecu2 = (n3 & 1) != 0 ? eps2.a : null;
        if ((n3 & 2) != 0) {
            eqb2 = eps2.b;
        }
        if ((n3 & 4) != 0) {
            ecw2 = eps2.c;
        }
        boolean bl2 = eps2.e;
        jse.e(ecu2, "session");
        jse.e(eqb2, "route");
        jse.e(ecw2, "params");
        return new eps(ecu2, eqb2, ecw2, n2, bl2);
    }

    @Override
    public final int a() {
        return this.d;
    }

    @Override
    public final ecu b() {
        return this.a;
    }

    @Override
    public final ecw c() {
        return this.c;
    }

    @Override
    public final eqb d() {
        return this.b;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof eps)) {
            return false;
        }
        object = (eps)object;
        if (!jse.i(this.a, ((eps)object).a)) {
            return false;
        }
        if (!jse.i(this.b, ((eps)object).b)) {
            return false;
        }
        if (!jse.i(this.c, ((eps)object).c)) {
            return false;
        }
        if (this.d != ((eps)object).d) {
            return false;
        }
        return this.e == ((eps)object).e;
    }

    @Override
    public final /* synthetic */ hpn f() {
        return cqq.aj(this);
    }

    @Override
    public final /* synthetic */ Object g(jqb jqb2) {
        return cqq.ak(this, jqb2);
    }

    public final int hashCode() {
        int n2;
        int n3 = this.a.hashCode();
        int n4 = this.b.hashCode();
        ecw ecw2 = this.c;
        if (ecw2.B()) {
            n2 = ecw2.i();
        } else {
            int n5;
            n2 = n5 = ecw2.memoizedHashCode;
            if (n5 == 0) {
                ecw2.memoizedHashCode = n2 = ecw2.i();
            }
        }
        return (((n3 * 31 + n4) * 31 + n2) * 31 + this.d) * 31 + a.f(this.e);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("HotwordSessionDataSimple(session=");
        stringBuilder.append(this.a);
        stringBuilder.append(", route=");
        stringBuilder.append(this.b);
        stringBuilder.append(", params=");
        stringBuilder.append(this.c);
        stringBuilder.append(", sessionToken=");
        stringBuilder.append(this.d);
        stringBuilder.append(", isInactive=");
        stringBuilder.append(this.e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

