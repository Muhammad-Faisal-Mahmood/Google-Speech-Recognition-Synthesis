/*
 * Decompiled with CFR 0.152.
 */
final class gdu {
    public final long a;

    public gdu() {
        throw null;
    }

    public gdu(long l2) {
        this.a = l2;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof gdu) {
            object = (gdu)object;
            if (this.a == ((gdu)object).a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long l2 = this.a;
        return (int)(l2 ^ l2 >>> 32) ^ 0xF4243;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FetchTaskIdentifier{index=");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

