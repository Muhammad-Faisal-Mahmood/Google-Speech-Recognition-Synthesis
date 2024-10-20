/*
 * Decompiled with CFR 0.152.
 */
final class dxo {
    public final long a;
    private final dyq b;

    public dxo() {
        throw null;
    }

    public dxo(dyq dyq2, long l2) {
        this.b = dyq2;
        this.a = l2;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dxo) {
            object = (dxo)object;
            if (((Object)this.b).equals(((dxo)object).b) && this.a == ((dxo)object).a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = ((Object)this.b).hashCode();
        long l2 = this.a;
        return (n2 ^ 0xF4243) * 1000003 ^ (int)(l2 ^ l2 >>> 32);
    }

    public final String toString() {
        String string = ((Object)this.b).toString();
        StringBuilder stringBuilder = new StringBuilder("RecentAppFlow{appFlow=");
        stringBuilder.append(string);
        stringBuilder.append(", loggedTimeNanos=");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

