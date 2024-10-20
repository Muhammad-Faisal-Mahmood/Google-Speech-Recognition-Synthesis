/*
 * Decompiled with CFR 0.152.
 */
public final class aka {
    public static final aka a;
    public static final aka b;
    public final long c;
    public final long d;

    static {
        aka aka2;
        a = aka2 = new aka(0L, 0L);
        new aka(Long.MAX_VALUE, Long.MAX_VALUE);
        new aka(Long.MAX_VALUE, 0L);
        new aka(0L, Long.MAX_VALUE);
        b = aka2;
    }

    public aka(long l2, long l3) {
        boolean bl2 = true;
        boolean bl3 = l2 >= 0L;
        abr.d(bl3);
        bl3 = l3 >= 0L ? bl2 : false;
        abr.d(bl3);
        this.c = l2;
        this.d = l3;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (aka)object;
            if (this.c == ((aka)object).c && this.d == ((aka)object).d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int)this.c * 31 + (int)this.d;
    }
}

