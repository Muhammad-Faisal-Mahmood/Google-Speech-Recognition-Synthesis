/*
 * Decompiled with CFR 0.152.
 */
public final class anc {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public anc(Object object) {
        this(object, -1L);
    }

    public anc(Object object, int n2, int n3, long l2) {
        this(object, n2, n3, l2, -1);
    }

    private anc(Object object, int n2, int n3, long l2, int n4) {
        this.a = object;
        this.b = n2;
        this.c = n3;
        this.d = l2;
        this.e = n4;
    }

    public anc(Object object, long l2) {
        this(object, -1, -1, l2, -1);
    }

    public anc(Object object, long l2, int n2) {
        this(object, -1, -1, l2, n2);
    }

    public final anc a(Object object) {
        if (this.a.equals(object)) {
            return this;
        }
        return new anc(object, this.b, this.c, this.d, this.e);
    }

    public final boolean b() {
        return this.b != -1;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof anc)) {
            return false;
        }
        object = (anc)object;
        return this.a.equals(((anc)object).a) && this.b == ((anc)object).b && this.c == ((anc)object).c && this.d == ((anc)object).d && this.e == ((anc)object).e;
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        long l2 = this.d;
        return ((((n2 + 527) * 31 + this.b) * 31 + this.c) * 31 + (int)l2) * 31 + this.e;
    }
}

