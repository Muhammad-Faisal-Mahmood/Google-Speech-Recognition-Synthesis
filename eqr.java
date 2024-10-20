/*
 * Decompiled with CFR 0.152.
 */
public final class eqr {
    public final int a;
    public final ecw b;

    public eqr(int n2, ecw ecw2) {
        jse.e(ecw2, "params");
        this.a = n2;
        this.b = ecw2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof eqr)) {
            return false;
        }
        object = (eqr)object;
        if (this.a != ((eqr)object).a) {
            return false;
        }
        return jse.i(this.b, ((eqr)object).b);
    }

    public final int hashCode() {
        int n2;
        ecw ecw2 = this.b;
        if (ecw2.B()) {
            n2 = ecw2.i();
        } else {
            int n3;
            n2 = n3 = ecw2.memoizedHashCode;
            if (n3 == 0) {
                ecw2.memoizedHashCode = n2 = ecw2.i();
            }
        }
        return this.a * 31 + n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("HotwordSourceSessionData(sessionToken=");
        stringBuilder.append(this.a);
        stringBuilder.append(", params=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

