/*
 * Decompiled with CFR 0.152.
 */
public final class gru {
    public final djt a;
    public final kdo b;
    public final long c;
    public final long d;
    public final boolean e;
    public final kel f;
    public final kfo g;

    public gru() {
        throw null;
    }

    public gru(djt djt2, kdo kdo2, long l2, long l3, boolean bl2, kel kel2, kfo kfo2) {
        this.a = djt2;
        this.b = kdo2;
        this.c = l2;
        this.d = l3;
        this.e = bl2;
        if (kel2 != null) {
            this.f = kel2;
            if (kfo2 != null) {
                this.g = kfo2;
                return;
            }
            throw new NullPointerException("Null traceMetadata");
        }
        throw new NullPointerException("Null trace");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof gru) {
            gru gru2 = (gru)object;
            if (this.a.equals(gru2.a) && ((object = this.b) == null ? gru2.b == null : ((hwv)object).equals(gru2.b)) && this.c == gru2.c && this.d == gru2.d && this.e == gru2.e && this.f.equals(gru2.f) && this.g.equals(gru2.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2;
        int n3;
        int n4;
        int n5 = this.a.hashCode();
        hwv hwv2 = this.b;
        if (hwv2 == null) {
            n4 = 0;
        } else if (hwv2.B()) {
            n4 = hwv2.i();
        } else {
            n4 = n3 = hwv2.memoizedHashCode;
            if (n3 == 0) {
                hwv2.memoizedHashCode = n4 = hwv2.i();
            }
        }
        long l2 = this.c;
        int n6 = (int)(l2 ^ l2 >>> 32);
        l2 = this.d;
        int n7 = (int)(l2 ^ l2 >>> 32);
        int n8 = true != this.e ? 1237 : 1231;
        hwv2 = this.f;
        if (hwv2.B()) {
            n2 = hwv2.i();
        } else {
            n3 = n2 = hwv2.memoizedHashCode;
            if (n2 == 0) {
                hwv2.memoizedHashCode = n3 = hwv2.i();
            }
            n2 = n3;
        }
        hwv2 = this.g;
        if (hwv2.B()) {
            n3 = hwv2.i();
        } else {
            int n9;
            n3 = n9 = hwv2.memoizedHashCode;
            if (n9 == 0) {
                hwv2.memoizedHashCode = n3 = hwv2.i();
            }
        }
        return ((((((n5 ^ 0xF4243) * 1000003 ^ n4) * 1000003 ^ n6) * 1000003 ^ n7) * 1000003 ^ n8) * 1000003 ^ n2) * 1000003 ^ n3;
    }

    public final String toString() {
        String string = String.valueOf(this.b);
        String string2 = ((Object)this.f).toString();
        String string3 = ((Object)this.g).toString();
        StringBuilder stringBuilder = new StringBuilder("TraceData{eventName=");
        stringBuilder.append(this.a.a);
        stringBuilder.append(", metricExtension=");
        stringBuilder.append(string);
        stringBuilder.append(", startTime=");
        stringBuilder.append(this.c);
        stringBuilder.append(", endTime=");
        stringBuilder.append(this.d);
        stringBuilder.append(", empty=");
        stringBuilder.append(this.e);
        stringBuilder.append(", trace=");
        stringBuilder.append(string2);
        stringBuilder.append(", traceMetadata=");
        stringBuilder.append(string3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

