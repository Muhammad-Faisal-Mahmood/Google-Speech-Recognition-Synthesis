/*
 * Decompiled with CFR 0.152.
 */
public abstract class dez {
    public static dey i() {
        dey dey2 = new dey();
        dey2.b(0);
        dey2.c(0L);
        dey2.e(0);
        dey2.g(0);
        dey2.f(0L);
        return dey2;
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract long d();

    public abstract long e();

    public abstract ddn f();

    public abstract ded g();

    public abstract String h();

    public String toString() {
        gtn gtn2 = new gtn("");
        gtn2.d();
        gtn2.b("name", this.f());
        gtn2.b("state", dec.h(this.b()));
        gtn2.f("size", this.e());
        gtn2.e("priority", this.a());
        gtn2.b("last access", dec.d(this.d()));
        gtn2.b("source", this.h());
        gtn2.e("validation failure", this.c());
        return gtn2.toString();
    }
}

