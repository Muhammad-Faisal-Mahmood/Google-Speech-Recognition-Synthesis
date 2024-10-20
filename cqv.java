/*
 * Decompiled with CFR 0.152.
 */
public final class cqv {
    public static final cqv a = new cqv(0L, 0L, 0L);
    public final long b;
    public final long c;
    public final long d;

    public cqv() {
        throw null;
    }

    public cqv(long l2, long l3, long l4) {
        this.b = l2;
        this.c = l3;
        this.d = l4;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof cqv) {
            object = (cqv)object;
            if (this.b == ((cqv)object).b && this.c == ((cqv)object).c && this.d == ((cqv)object).d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long l2 = this.d;
        long l3 = this.b;
        int n2 = (int)(l3 ^ l3 >>> 32);
        l3 = this.c;
        int n3 = (int)(l3 >>> 32 ^ l3);
        return (int)(l2 ^ l2 >>> 32) ^ ((n2 ^ 0xF4243) * 1000003 ^ n3) * 1000003;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SchedStat{cpuTimeNs=");
        stringBuilder.append(this.b);
        stringBuilder.append(", runDelayNs=");
        stringBuilder.append(this.c);
        stringBuilder.append(", runCount=");
        stringBuilder.append(this.d);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

