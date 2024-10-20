/*
 * Decompiled with CFR 0.152.
 */
public final class epx {
    public final eip a;
    public final int b;
    public final jqz c;
    public final Object d;

    public epx(eip eip2, int n2, jqz jqz2, Object object) {
        jse.e(eip2, "client");
        this.a = eip2;
        this.b = n2;
        this.c = jqz2;
        this.d = object;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof epx)) {
            return false;
        }
        object = (epx)object;
        if (!jse.i(this.a, ((epx)object).a)) {
            return false;
        }
        if (this.b != ((epx)object).b) {
            return false;
        }
        if (!jse.i(this.c, ((epx)object).c)) {
            return false;
        }
        return jse.i(this.d, ((epx)object).d);
    }

    public final int hashCode() {
        int n2;
        int n3;
        Object object = this.a;
        if (((hwv)object).B()) {
            n3 = ((hwv)object).i();
        } else {
            n3 = n2 = ((hwv)object).memoizedHashCode;
            if (n2 == 0) {
                ((hwv)object).memoizedHashCode = n3 = ((hwv)object).i();
            }
        }
        int n4 = this.b;
        int n5 = this.c.hashCode();
        object = this.d;
        n2 = object == null ? 0 : object.hashCode();
        return ((n3 * 31 + n4) * 31 + n5) * 31 + n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SessionData(client=");
        stringBuilder.append(this.a);
        stringBuilder.append(", sessionToken=");
        stringBuilder.append(this.b);
        stringBuilder.append(", stopped=");
        stringBuilder.append(this.c);
        stringBuilder.append(", params=");
        stringBuilder.append(this.d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

