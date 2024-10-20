/*
 * Decompiled with CFR 0.152.
 */
public final class epn {
    public final ebs a;
    public final ebp b;
    public final String c;

    public epn(ebs ebs2, ebp ebp2, String string) {
        jse.e(ebs2, "openingFailure");
        jse.e(ebp2, "closingFailure");
        this.a = ebs2;
        this.b = ebp2;
        this.c = string;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof epn)) {
            return false;
        }
        object = (epn)object;
        if (this.a != ((epn)object).a) {
            return false;
        }
        if (this.b != ((epn)object).b) {
            return false;
        }
        return jse.i(this.c, ((epn)object).c);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FailedSessionStatuses(openingFailure=");
        stringBuilder.append(this.a);
        stringBuilder.append(", closingFailure=");
        stringBuilder.append(this.b);
        stringBuilder.append(", message=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

