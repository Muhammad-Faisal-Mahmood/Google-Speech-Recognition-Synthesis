/*
 * Decompiled with CFR 0.152.
 */
public final class aqc {
    public static final aqc a = new aqc(0L, 0L);
    public final long b;
    public final long c;

    public aqc(long l2, long l3) {
        this.b = l2;
        this.c = l3;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (aqc)object;
            if (this.b == ((aqc)object).b && this.c == ((aqc)object).c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int)this.b * 31 + (int)this.c;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[timeUs=");
        stringBuilder.append(this.b);
        stringBuilder.append(", position=");
        stringBuilder.append(this.c);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

