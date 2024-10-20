/*
 * Decompiled with CFR 0.152.
 */
public final class ged {
    public final Object a;
    public final gen b;
    public final long c;
    public final gee d;
    public final int e;
    public final gds f;

    public ged() {
        throw null;
    }

    public ged(gds gds2, Object object, gen gen2, long l2, int n2, gee gee2) {
        if (gds2 != null) {
            this.f = gds2;
            if (object != null) {
                this.a = object;
                this.b = gen2;
                this.c = l2;
                this.e = n2;
                this.d = gee2;
                return;
            }
            throw new NullPointerException("Null contentKey");
        }
        throw new NullPointerException("Null dataSource");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof ged) {
            object = (ged)object;
            if (this.f.equals(((ged)object).f) && this.a.equals(((ged)object).a) && this.b.equals(((ged)object).b) && this.c == ((ged)object).c && this.e == ((ged)object).e && ((Object)this.d).equals(((ged)object).d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.f.hashCode();
        int n3 = this.a.hashCode();
        int n4 = this.b.hashCode();
        int n5 = this.e;
        a.E(n5);
        long l2 = this.c;
        gee gee2 = this.d;
        return (((((n2 ^ 0xF4243) * 1000003 ^ n3) * 1000003 ^ n4) * 1000003 ^ (int)(l2 ^ l2 >>> 32)) * 1000003 ^ n5) * 1000003 ^ ((Object)gee2).hashCode();
    }

    public final String toString() {
        int n2 = this.e;
        Object object = this.b;
        Object object2 = this.a;
        String string = String.valueOf(this.f);
        object2 = String.valueOf(object2);
        String string2 = object.toString();
        object = n2 != 1 ? (n2 != 2 ? "SUBSCRIBE" : "FORCE_REFRESH") : "UNDEFINED";
        long l2 = this.c;
        String string3 = ((Object)this.d).toString();
        StringBuilder stringBuilder = new StringBuilder("SubscribeCallState{dataSource=");
        stringBuilder.append(string);
        stringBuilder.append(", contentKey=");
        stringBuilder.append((String)object2);
        stringBuilder.append(", tolerance=");
        stringBuilder.append(string2);
        stringBuilder.append(", index=");
        stringBuilder.append(l2);
        stringBuilder.append(", subscribeCallType=");
        stringBuilder.append((String)object);
        stringBuilder.append(", subscribeSequenceState=");
        stringBuilder.append(string3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

