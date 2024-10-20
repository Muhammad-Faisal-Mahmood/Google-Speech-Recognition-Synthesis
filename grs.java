/*
 * Decompiled with CFR 0.152.
 */
final class grs {
    public final long a;
    public final gto b;

    public grs() {
        throw null;
    }

    public grs(long l2, gto gto2) {
        this.a = l2;
        this.b = gto2;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof grs) {
            object = (grs)object;
            if (this.a == ((grs)object).a && this.b.equals(((grs)object).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long l2 = this.a;
        return ((int)(l2 ^ l2 >>> 32) ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }

    public final String toString() {
        String string = this.b.toString();
        StringBuilder stringBuilder = new StringBuilder("ParentInfo{ancestorRegionId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", asyncInfo=");
        stringBuilder.append(string);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

