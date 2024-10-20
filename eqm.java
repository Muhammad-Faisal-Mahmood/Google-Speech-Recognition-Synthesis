/*
 * Decompiled with CFR 0.152.
 */
public final class eqm {
    public final int a;
    public final eao b;
    public final boolean c;

    public eqm(int n2, eao eao2, boolean bl2) {
        jse.e(eao2, "params");
        this.a = n2;
        this.b = eao2;
        this.c = false;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof eqm)) {
            return false;
        }
        object = (eqm)object;
        if (this.a != ((eqm)object).a) {
            return false;
        }
        if (!jse.i(this.b, ((eqm)object).b)) {
            return false;
        }
        boolean bl2 = ((eqm)object).c;
        return true;
    }

    public final int hashCode() {
        int n2;
        eao eao2 = this.b;
        if (eao2.B()) {
            n2 = eao2.i();
        } else {
            int n3;
            n2 = n3 = eao2.memoizedHashCode;
            if (n3 == 0) {
                eao2.memoizedHashCode = n2 = eao2.i();
            }
        }
        return (this.a * 31 + n2) * 31 + a.f(false);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AudioSourceSessionData(sessionToken=");
        stringBuilder.append(this.a);
        stringBuilder.append(", params=");
        stringBuilder.append(this.b);
        stringBuilder.append(", hasParent=false)");
        return stringBuilder.toString();
    }
}

