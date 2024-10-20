/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.TimeUnit;

public abstract class dff {
    private static final long a = TimeUnit.DAYS.toMillis(1L);

    public static dfe n() {
        dfe dfe2 = new dfe();
        int n2 = gzx.d;
        dfe2.l(hct.a);
        dfe2.d(0);
        dfe2.j(System.currentTimeMillis());
        dfe2.h(true);
        dfe2.f(false);
        dfe2.g(false);
        dfe2.e(false);
        dfe2.k(a);
        dfe2.i(2);
        return dfe2;
    }

    public abstract int a();

    public abstract int b();

    public abstract long c();

    public abstract long d();

    public abstract ded e();

    public abstract gzx f();

    public abstract String g();

    public abstract String h();

    public abstract boolean i();

    public abstract boolean j();

    public abstract boolean k();

    public abstract boolean l();

    public String m() {
        throw null;
    }

    public String toString() {
        gtn gtn2 = new gtn("");
        gtn2.d();
        gtn2.b("id", this.h());
        gtn2.b("params", this.m());
        gtn2.b("urls", this.f());
        gtn2.e("prio", this.a());
        String string = this.d() == 0L ? "never" : dec.d(this.c() + this.d());
        gtn2.b("ttl", string);
        return gtn2.toString();
    }
}

