/*
 * Decompiled with CFR 0.152.
 */
public final class cqw {
    public final int a;
    private final long b;
    private final String c;
    private final String d;

    public cqw() {
        throw null;
    }

    public cqw(int n2, long l2, String string, String string2) {
        this.a = n2;
        this.b = l2;
        if (string != null) {
            this.c = string;
            this.d = string2;
            return;
        }
        throw new NullPointerException("Null name");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof cqw) {
            object = (cqw)object;
            if (this.a == ((cqw)object).a && this.b == ((cqw)object).b && this.c.equals(((cqw)object).c) && this.d.equals(((cqw)object).d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long l2 = this.b;
        int n2 = this.a;
        String string = this.c;
        return (((int)(l2 ^ l2 >>> 32) ^ (n2 ^ 0xF4243) * 1000003) * 1000003 ^ string.hashCode()) * 1000003 ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ThreadIdentifier{tid=");
        stringBuilder.append(this.a);
        stringBuilder.append(", id=");
        stringBuilder.append(this.b);
        stringBuilder.append(", name=");
        stringBuilder.append(this.c);
        stringBuilder.append(", threadPoolName=");
        stringBuilder.append(this.d);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

