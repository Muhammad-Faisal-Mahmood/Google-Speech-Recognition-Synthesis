/*
 * Decompiled with CFR 0.152.
 */
public final class epq
implements epp {
    public final eqb a;
    public final ecw b;
    public final int c;
    public final jwi d;
    private final ecu e;
    private final boolean f;

    public epq(ecu ecu2, eqb eqb2, ecw ecw2, int n2, boolean bl2, jwi jwi2) {
        jse.e(ecu2, "session");
        jse.e(eqb2, "route");
        jse.e(ecw2, "params");
        this.e = ecu2;
        this.a = eqb2;
        this.b = ecw2;
        this.c = n2;
        this.f = bl2;
        this.d = jwi2;
    }

    @Override
    public final int a() {
        return this.c;
    }

    @Override
    public final ecu b() {
        return this.e;
    }

    @Override
    public final ecw c() {
        return this.b;
    }

    @Override
    public final eqb d() {
        return this.a;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof epq)) {
            return false;
        }
        object = (epq)object;
        if (!jse.i(this.e, ((epq)object).e)) {
            return false;
        }
        if (!jse.i(this.a, ((epq)object).a)) {
            return false;
        }
        if (!jse.i(this.b, ((epq)object).b)) {
            return false;
        }
        if (this.c != ((epq)object).c) {
            return false;
        }
        if (this.f != ((epq)object).f) {
            return false;
        }
        return jse.i(this.d, ((epq)object).d);
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
        int n3 = this.e.hashCode();
        int n4 = this.a.hashCode();
        ecw ecw2 = this.b;
        if (ecw2.B()) {
            n2 = ecw2.i();
        } else {
            int n5;
            n2 = n5 = ecw2.memoizedHashCode;
            if (n5 == 0) {
                ecw2.memoizedHashCode = n2 = ecw2.i();
            }
        }
        return ((((n3 * 31 + n4) * 31 + n2) * 31 + this.c) * 31 + a.f(this.f)) * 31 + this.d.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("HotwordSessionDataInternal(session=");
        stringBuilder.append(this.e);
        stringBuilder.append(", route=");
        stringBuilder.append(this.a);
        stringBuilder.append(", params=");
        stringBuilder.append(this.b);
        stringBuilder.append(", sessionToken=");
        stringBuilder.append(this.c);
        stringBuilder.append(", isInactive=");
        stringBuilder.append(this.f);
        stringBuilder.append(", routeDisconnectJob=");
        stringBuilder.append(this.d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

