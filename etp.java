/*
 * Decompiled with CFR 0.152.
 */
public final class etp {
    public final int a;
    public final eam b;
    public final boolean c;

    public etp() {
        this(null);
    }

    public etp(int n2, eam eam2, boolean bl2) {
        jse.e(eam2, "params");
        this.a = n2;
        this.b = eam2;
        this.c = bl2;
    }

    public /* synthetic */ etp(byte[] byArray) {
        this(-1, dpf.g((hwr)eam.a.l()).h(), true);
    }

    public final String a() {
        Object object;
        Object object2 = object = this.b.c;
        if (object == null) {
            object2 = eip.a;
        }
        int n2 = this.a;
        jse.d(object2, "getClientInfo(...)");
        object = crh.O((eip)object2);
        object2 = new StringBuilder("client(token(");
        ((StringBuilder)object2).append(n2);
        ((StringBuilder)object2).append("), ");
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append(")");
        return ((StringBuilder)object2).toString();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof etp)) {
            return false;
        }
        object = (etp)object;
        if (this.a != ((etp)object).a) {
            return false;
        }
        if (!jse.i(this.b, ((etp)object).b)) {
            return false;
        }
        return this.c == ((etp)object).c;
    }

    public final int hashCode() {
        int n2;
        eam eam2 = this.b;
        if (eam2.B()) {
            n2 = eam2.i();
        } else {
            int n3;
            n2 = n3 = eam2.memoizedHashCode;
            if (n3 == 0) {
                eam2.memoizedHashCode = n2 = eam2.i();
            }
        }
        return (this.a * 31 + n2) * 31 + a.f(this.c);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AudioRouteClientData(clientToken=");
        stringBuilder.append(this.a);
        stringBuilder.append(", params=");
        stringBuilder.append(this.b);
        stringBuilder.append(", isInactive=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

