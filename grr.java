/*
 * Decompiled with CFR 0.152.
 */
final class grr {
    public final long a;
    public final long b;

    public grr() {
        throw null;
    }

    public grr(long l2, long l3) {
        this.a = l2;
        this.b = l3;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof grr) {
            object = (grr)object;
            if (this.a == ((grr)object).a && this.b == ((grr)object).b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long l2 = this.b;
        long l3 = this.a;
        int n2 = (int)(l3 ^ l3 >>> 32);
        return (int)(l2 ^ l2 >>> 32) ^ (n2 ^ 0xF4243) * 1000003;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AsyncInfo{dispatchMarkId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", dispatchMarkTimeNanos=");
        stringBuilder.append(this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

