/*
 * Decompiled with CFR 0.152.
 */
public final class det
extends dez {
    public final ded a;
    public final long b;
    public final int c;
    public final int d;
    public final long e;
    public final String f;
    public final int g;
    private final ddn h;
    private volatile transient String i;

    public det(ddn ddn2, ded ded2, long l2, int n2, int n3, long l3, String string, int n4) {
        this.h = ddn2;
        this.a = ded2;
        this.b = l2;
        this.c = n2;
        this.d = n3;
        this.e = l3;
        this.f = string;
        this.g = n4;
    }

    @Override
    public final int a() {
        return this.c;
    }

    @Override
    public final int b() {
        return this.d;
    }

    @Override
    public final int c() {
        return this.g;
    }

    @Override
    public final long d() {
        return this.e;
    }

    @Override
    public final long e() {
        return this.b;
    }

    public final boolean equals(Object object) {
        Object object2;
        if (object == this) {
            return true;
        }
        return object instanceof dez && this.h.equals(((dez)(object = (dez)object)).f()) && ((object2 = this.a) == null ? ((dez)object).g() == null : object2.equals(((dez)object).g())) && this.b == ((dez)object).e() && this.c == ((dez)object).a() && this.d == ((dez)object).b() && this.e == ((dez)object).d() && ((object2 = this.f) == null ? ((dez)object).h() == null : ((String)object2).equals(((dez)object).h())) && this.g == ((dez)object).c();
    }

    @Override
    public final ddn f() {
        return this.h;
    }

    @Override
    public final ded g() {
        return this.a;
    }

    @Override
    public final String h() {
        return this.f;
    }

    public final int hashCode() {
        int n2 = this.h.hashCode();
        Object object = this.a;
        int n3 = 0;
        int n4 = object == null ? 0 : object.hashCode();
        long l2 = this.b;
        int n5 = (int)(l2 ^ l2 >>> 32);
        int n6 = this.c;
        int n7 = this.d;
        l2 = this.e;
        int n8 = (int)(l2 ^ l2 >>> 32);
        object = this.f;
        if (object != null) {
            n3 = ((String)object).hashCode();
        }
        return (((((((n2 ^ 0xF4243) * 1000003 ^ n4) * 1000003 ^ n5) * 1000003 ^ n6) * 1000003 ^ n7) * 1000003 ^ n8) * 1000003 ^ n3) * 1000003 ^ this.g;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final String toString() {
        if (this.i != null) return this.i;
        synchronized (this) {
            if (this.i != null) return this.i;
            Object object = new gtn("");
            ((gtn)object).d();
            ((gtn)object).b("name", this.h);
            ((gtn)object).b("state", dec.h(this.d));
            ((gtn)object).f("size", this.b);
            ((gtn)object).e("priority", this.c);
            ((gtn)object).b("last access", dec.d(this.e));
            ((gtn)object).b("source", this.f);
            ((gtn)object).e("validation failure", this.g);
            this.i = ((gtn)object).toString();
            if (this.i != null) {
                return this.i;
            }
            object = new NullPointerException("toString() cannot return null");
            throw object;
        }
    }
}

