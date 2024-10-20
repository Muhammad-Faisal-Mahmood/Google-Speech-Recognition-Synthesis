/*
 * Decompiled with CFR 0.152.
 */
import j$.time.Instant;

public final class gee {
    public final long a;
    public final gdu b;
    public final gdx c;
    public final int d;
    public final Instant e;
    public final gds f;

    public gee() {
        throw null;
    }

    public gee(gds gds2, long l2, gdu gdu2, gdx gdx2, int n2, Instant instant) {
        if (gds2 != null) {
            this.f = gds2;
            this.a = l2;
            if (gdu2 != null) {
                this.b = gdu2;
                if (gdx2 != null) {
                    this.c = gdx2;
                    this.d = n2;
                    if (instant != null) {
                        this.e = instant;
                        return;
                    }
                    throw new NullPointerException("Null epochTimeAtStart");
                }
                throw new NullPointerException("Null loadTaskIdentifier");
            }
            throw new NullPointerException("Null fetchTaskIdentifier");
        }
        throw new NullPointerException("Null dataSource");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean a(gee gee2) {
        long l2 = this.a;
        boolean bl2 = false;
        boolean bl3 = l2 != Long.MIN_VALUE;
        fxf.A(bl3);
        bl3 = !((Object)this).equals(gee2) || this == gee2;
        fxf.A(bl3);
        long l3 = this.a - gee2.a;
        long l4 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
        if (l4 < 0) return true;
        bl3 = bl2;
        if (l4 != false) return bl3;
        Object object = this.b;
        l2 = gee2.b.a;
        if (((gdu)object).a < l2) return true;
        object = this.c;
        l2 = gee2.c.a;
        if (((gdx)object).a >= l2) return false;
        return true;
    }

    public final boolean b() {
        return this.d > 3;
    }

    public final gee c(gds gds2, Instant instant) {
        boolean bl2 = this.a != Long.MAX_VALUE;
        fxf.B(bl2, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
        gdu gdu2 = new gdu(0L);
        gdx gdx2 = new gdx(0L);
        return new gee(gds2, this.a + 1L, gdu2, gdx2, 0, instant);
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof gee) {
            object = (gee)object;
            if (this.f.equals(((gee)object).f) && this.a == ((gee)object).a && ((Object)this.b).equals(((gee)object).b) && ((Object)this.c).equals(((gee)object).c) && this.d == ((gee)object).d && this.e.equals(((gee)object).e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.f.hashCode();
        long l2 = this.a;
        Object object = this.b;
        int n3 = (int)(l2 ^ l2 >>> 32);
        int n4 = object.hashCode();
        int n5 = ((Object)this.c).hashCode();
        object = this.e;
        return (((((n2 ^ 0xF4243) * 1000003 ^ n3) * 1000003 ^ n4) * 1000003 ^ n5) * 1000003 ^ this.d) * 1000003 ^ ((Instant)object).hashCode();
    }

    public final String toString() {
        Object object = this.e;
        Object object2 = this.c;
        Object object3 = this.b;
        String string = String.valueOf(this.f);
        object3 = String.valueOf(object3);
        object2 = String.valueOf(object2);
        object = object.toString();
        StringBuilder stringBuilder = new StringBuilder("SubscribeSequenceState{dataSource=");
        stringBuilder.append(string);
        stringBuilder.append(", index=");
        stringBuilder.append(this.a);
        stringBuilder.append(", fetchTaskIdentifier=");
        stringBuilder.append((String)object3);
        stringBuilder.append(", loadTaskIdentifier=");
        stringBuilder.append((String)object2);
        stringBuilder.append(", loadAttempts=");
        stringBuilder.append(this.d);
        stringBuilder.append(", epochTimeAtStart=");
        stringBuilder.append((String)object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

