/*
 * Decompiled with CFR 0.152.
 */
public final class gki {
    public final gkj a;
    public final long b;

    public gki() {
        throw null;
    }

    public gki(gkj gkj2, long l2) {
        if (gkj2 != null) {
            this.a = gkj2;
            this.b = l2;
            return;
        }
        throw new NullPointerException("Null constraintType");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof gki) {
            object = (gki)object;
            if (this.a.equals((Object)((gki)object).a) && this.b == ((gki)object).b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        long l2 = this.b;
        return (n2 ^ 0xF4243) * 1000003 ^ (int)(l2 ^ l2 >>> 32);
    }

    public final String toString() {
        String string = ((Object)((Object)this.a)).toString();
        StringBuilder stringBuilder = new StringBuilder("SyncConstraint{constraintType=");
        stringBuilder.append(string);
        stringBuilder.append(", applicablePeriod=");
        stringBuilder.append(this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

