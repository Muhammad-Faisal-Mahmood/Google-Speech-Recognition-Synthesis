/*
 * Decompiled with CFR 0.152.
 */
public final class emm {
    public final eip a;
    public final Integer b;
    public final Integer c;
    public final Integer d;

    public emm(eip eip2, Integer n2, Integer n3, Integer n4) {
        jse.e(eip2, "clientInfo");
        this.a = eip2;
        this.b = n2;
        this.c = n3;
        this.d = n4;
    }

    public /* synthetic */ emm(eip eip2, Integer n2, Integer n3, Integer n4, int n5) {
        if ((n5 & 4) != 0) {
            n3 = null;
        }
        if ((n5 & 8) != 0) {
            n4 = null;
        }
        this(eip2, n2, n3, n4);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof emm)) {
            return false;
        }
        object = (emm)object;
        if (!jse.i(this.a, ((emm)object).a)) {
            return false;
        }
        if (!jse.i(this.b, ((emm)object).b)) {
            return false;
        }
        if (!jse.i(this.c, ((emm)object).c)) {
            return false;
        }
        return jse.i(this.d, ((emm)object).d);
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
        object = this.b;
        int n4 = 0;
        n2 = object == null ? 0 : object.hashCode();
        object = this.c;
        int n5 = object == null ? 0 : object.hashCode();
        object = this.d;
        if (object != null) {
            n4 = object.hashCode();
        }
        return ((n3 * 31 + n2) * 31 + n5) * 31 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AudioLoggingMetadata(clientInfo=");
        stringBuilder.append(this.a);
        stringBuilder.append(", routeToken=");
        stringBuilder.append(this.b);
        stringBuilder.append(", sessionToken=");
        stringBuilder.append(this.c);
        stringBuilder.append(", clientToken=");
        stringBuilder.append(this.d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

