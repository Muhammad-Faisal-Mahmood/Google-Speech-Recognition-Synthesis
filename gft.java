/*
 * Decompiled with CFR 0.152.
 */
public final class gft {
    public final hvu a;
    public final long b;
    public final dup c;
    private final String d;

    public gft(String string, hvu hvu2, long l2, dup dup2) {
        jse.e(string, "serverToken");
        jse.e(dup2, "commitProperties");
        this.d = string;
        this.a = hvu2;
        this.b = l2;
        this.c = dup2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof gft)) {
            return false;
        }
        object = (gft)object;
        if (!jse.i(this.d, ((gft)object).d)) {
            return false;
        }
        if (!jse.i(this.a, ((gft)object).a)) {
            return false;
        }
        if (this.b != ((gft)object).b) {
            return false;
        }
        return jse.i(this.c, ((gft)object).c);
    }

    public final int hashCode() {
        int n2;
        int n3 = this.d.hashCode();
        Object object = this.a;
        int n4 = object == null ? 0 : ((hvu)object).hashCode();
        long l2 = this.b;
        int n5 = (int)(l2 ^ l2 >>> 32);
        object = this.c;
        if (((hwv)object).B()) {
            n2 = ((hwv)object).i();
        } else {
            int n6;
            n2 = n6 = ((hwv)object).memoizedHashCode;
            if (n6 == 0) {
                ((hwv)object).memoizedHashCode = n2 = ((hwv)object).i();
            }
        }
        return ((n3 * 31 + n4) * 31 + n5) * 31 + n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Metadata(serverToken=");
        stringBuilder.append(this.d);
        stringBuilder.append(", experimentToken=");
        stringBuilder.append(this.a);
        stringBuilder.append(", lastUpdateEpochMillis=");
        stringBuilder.append(this.b);
        stringBuilder.append(", commitProperties=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

