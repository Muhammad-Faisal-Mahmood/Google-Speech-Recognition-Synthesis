/*
 * Decompiled with CFR 0.152.
 */
public final class eft {
    public final int a;
    public final long b;
    private final int c;

    public eft(int n2, long l2, int n3) {
        this.a = n2;
        this.b = l2;
        this.c = n3;
    }

    public /* synthetic */ eft(int n2, long l2, int n3, byte[] byArray) {
        if ((n3 & 2) != 0) {
            l2 = Long.MIN_VALUE;
        }
        this(n2, l2, Integer.MIN_VALUE);
    }

    public final int a(int n2) {
        int n3 = this.c;
        if (n3 != Integer.MIN_VALUE) {
            return n3;
        }
        return n2;
    }

    public final eft b(int n2, int n3, eae eae2) {
        int n4 = n3 + n2;
        if (n4 <= (n3 = this.a)) {
            if (!this.c()) {
                long l2 = this.b;
                long l3 = Long.MIN_VALUE;
                if (l2 != Long.MIN_VALUE) {
                    l3 = l2 - ekn.c(n3 - n4, eae2);
                }
                int n5 = this.c;
                n3 = Integer.MIN_VALUE;
                if (n5 != Integer.MIN_VALUE) {
                    n3 = n5 - (this.a - n4);
                }
                return new eft(n2, l3, n3);
            }
            throw new IllegalStateException("TimestampRead can't be re-calculated for an error");
        }
        throw new IllegalArgumentException("The end offset cannot be greater than the size");
    }

    public final boolean c() {
        return this.a < -1;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof eft)) {
            return false;
        }
        object = (eft)object;
        if (this.a != ((eft)object).a) {
            return false;
        }
        if (this.b != ((eft)object).b) {
            return false;
        }
        return this.c == ((eft)object).c;
    }

    public final int hashCode() {
        long l2 = this.b;
        return (this.a * 31 + (int)(l2 ^ l2 >>> 32)) * 31 + this.c;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TimestampedRead(size=");
        stringBuilder.append(this.a);
        stringBuilder.append(", timestampElapsedNanos=");
        stringBuilder.append(this.b);
        stringBuilder.append(", originalEndOffset=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

