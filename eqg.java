/*
 * Decompiled with CFR 0.152.
 */
public final class eqg {
    public final int a;
    public final eip b;

    public eqg(int n2, eip eip2) {
        jse.e(eip2, "clientInfo");
        this.a = n2;
        this.b = eip2;
    }

    public final String a() {
        String string = crh.O(this.b);
        StringBuilder stringBuilder = new StringBuilder("client(token(");
        stringBuilder.append(this.a);
        stringBuilder.append("), ");
        stringBuilder.append(string);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof eqg)) {
            return false;
        }
        object = (eqg)object;
        if (this.a != ((eqg)object).a) {
            return false;
        }
        return jse.i(this.b, ((eqg)object).b);
    }

    public final int hashCode() {
        int n2;
        eip eip2 = this.b;
        if (eip2.B()) {
            n2 = eip2.i();
        } else {
            int n3;
            n2 = n3 = eip2.memoizedHashCode;
            if (n3 == 0) {
                eip2.memoizedHashCode = n2 = eip2.i();
            }
        }
        return this.a * 31 + n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AudioSourceClientData(clientToken=");
        stringBuilder.append(this.a);
        stringBuilder.append(", clientInfo=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

