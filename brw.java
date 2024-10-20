/*
 * Decompiled with CFR 0.152.
 */
public final class brw {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final double e;

    public brw() {
        throw null;
    }

    public brw(int n2, int n3, int n4, int n5, double d2) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = n5;
        this.e = d2;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof brw) {
            object = (brw)object;
            if (this.a == ((brw)object).a && this.b == ((brw)object).b && this.c == ((brw)object).c && this.d == ((brw)object).d) {
                double d2 = this.e;
                double d3 = ((brw)object).e;
                if (Double.doubleToLongBits(d2) == Double.doubleToLongBits(d3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long l2 = Double.doubleToLongBits(this.e);
        long l3 = Double.doubleToLongBits(this.e);
        int n2 = this.a;
        int n3 = this.b;
        int n4 = this.c;
        int n5 = this.d;
        return (int)(l2 >>> 32 ^ l3) ^ ((((n2 ^ 0xF4243) * 1000003 ^ n3) * 1000003 ^ n4) * 1000003 ^ n5) * 1000003;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("InternalTimepoint{sentenceIndex=");
        stringBuilder.append(this.a);
        stringBuilder.append(", sayIndex=");
        stringBuilder.append(this.b);
        stringBuilder.append(", startChar=");
        stringBuilder.append(this.c);
        stringBuilder.append(", endChar=");
        stringBuilder.append(this.d);
        stringBuilder.append(", startTime=");
        stringBuilder.append(this.e);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

