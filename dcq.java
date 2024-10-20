/*
 * Decompiled with CFR 0.152.
 */
public final class dcq
extends ddr {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final gzx h;
    public final ddm i;
    private volatile transient String j;

    public dcq(String string, String string2, int n2, int n3, int n4, int n5, int n6, gzx gzx2, ddm ddm2) {
        this.a = string;
        this.b = string2;
        this.c = n2;
        this.d = n3;
        this.e = n4;
        this.f = n5;
        this.g = n6;
        if (gzx2 != null) {
            this.h = gzx2;
            this.i = ddm2;
            return;
        }
        throw new NullPointerException("Null validationSchemes");
    }

    @Override
    public final int a() {
        return this.f;
    }

    @Override
    public final int b() {
        return this.d;
    }

    @Override
    public final int c() {
        return this.c;
    }

    @Override
    public final int d() {
        return this.e;
    }

    @Override
    public final int e() {
        return this.g;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof ddr) {
            object = (ddr)object;
            String string = this.a;
            if ((string == null ? ((ddr)object).i() == null : string.equals(((ddr)object).i())) && ((string = this.b) == null ? ((ddr)object).h() == null : string.equals(((ddr)object).h())) && this.c == ((ddr)object).c() && this.d == ((ddr)object).b() && this.e == ((ddr)object).d() && this.f == ((ddr)object).a() && this.g == ((ddr)object).e() && fvd.z(this.h, ((ddr)object).g()) && ((Object)this.i).equals(((ddr)object).f())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final ddm f() {
        return this.i;
    }

    @Override
    public final gzx g() {
        return this.h;
    }

    @Override
    public final String h() {
        return this.b;
    }

    public final int hashCode() {
        String string = this.a;
        int n2 = 0;
        int n3 = string == null ? 0 : string.hashCode();
        string = this.b;
        if (string != null) {
            n2 = string.hashCode();
        }
        return ((((((((n3 ^ 0xF4243) * 1000003 ^ n2) * 1000003 ^ this.c) * 1000003 ^ this.d) * 1000003 ^ this.e) * 1000003 ^ this.f) * 1000003 ^ this.g) * 1000003 ^ this.h.hashCode()) * 1000003 ^ ((Object)this.i).hashCode();
    }

    @Override
    public final String i() {
        return this.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final String toString() {
        if (this.j != null) return this.j;
        synchronized (this) {
            if (this.j != null) return this.j;
            Object object = new gtn("");
            ((gtn)object).d();
            ((gtn)object).b("url", this.a);
            ((gtn)object).b("const", dec.a(this.c, this.d, this.e, this.f));
            ((gtn)object).b("flags", dec.i(this.g));
            ((gtn)object).b("scheme", this.b);
            ((gtn)object).b("val", this.h);
            ((gtn)object).e("extras", this.i.b().size());
            this.j = ((gtn)object).toString();
            if (this.j != null) {
                return this.j;
            }
            object = new NullPointerException("toString() cannot return null");
            throw object;
        }
    }
}

