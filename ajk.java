/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;

final class ajk {
    public final anc a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public ajk(anc anc2, long l2, long l3, long l4, long l5, boolean bl2, boolean bl3, boolean bl4) {
        boolean bl5 = !bl4 || bl2;
        abr.d(bl5);
        bl5 = !bl3 || bl2;
        abr.d(bl5);
        abr.d(true);
        this.a = anc2;
        this.b = l2;
        this.c = l3;
        this.d = l4;
        this.e = l5;
        this.f = false;
        this.g = bl2;
        this.h = bl3;
        this.i = bl4;
    }

    public final ajk a(long l2) {
        if (l2 == this.c) {
            return this;
        }
        return new ajk(this.a, this.b, l2, this.d, this.e, this.g, this.h, this.i);
    }

    public final ajk b(long l2) {
        if (l2 == this.b) {
            return this;
        }
        return new ajk(this.a, l2, this.c, this.d, this.e, this.g, this.h, this.i);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (ajk)object;
            if (this.b == ((ajk)object).b && this.c == ((ajk)object).c && this.d == ((ajk)object).d && this.e == ((ajk)object).e && this.g == ((ajk)object).g && this.h == ((ajk)object).h && this.i == ((ajk)object).i && Objects.equals(this.a, ((ajk)object).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        long l2 = this.e;
        long l3 = this.d;
        long l4 = this.c;
        return (((((((n2 + 527) * 31 + (int)this.b) * 31 + (int)l4) * 31 + (int)l3) * 31 + (int)l2) * 961 + this.g) * 31 + this.h) * 31 + this.i;
    }
}

