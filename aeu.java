/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;

public final class aeu {
    public Object a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public adh g = adh.a;

    static {
        agf.z(0);
        agf.z(1);
        agf.z(2);
        agf.z(3);
        agf.z(4);
    }

    public final int a(int n2) {
        return this.g.a((int)n2).b;
    }

    public final int b(long l2) {
        return -1;
    }

    public final int c(long l2) {
        this.g.b();
        return -1;
    }

    public final int d(int n2) {
        return this.g.a(n2).a();
    }

    public final long e(int n2, int n3) {
        adg adg2 = this.g.a(n2);
        if (adg2.b != -1) {
            return adg2.f[n3];
        }
        return -9223372036854775807L;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass().equals(object.getClass())) {
            object = (aeu)object;
            if (Objects.equals(this.a, ((aeu)object).a) && Objects.equals(this.b, ((aeu)object).b) && this.c == ((aeu)object).c && this.d == ((aeu)object).d && this.f == ((aeu)object).f && Objects.equals(this.g, ((aeu)object).g)) {
                return true;
            }
        }
        return false;
    }

    public final long f() {
        return agf.m(0L);
    }

    public final void g(Object object, Object object2, int n2, long l2, adh adh2, boolean bl2) {
        this.a = object;
        this.b = object2;
        this.c = n2;
        this.d = l2;
        this.e = 0L;
        this.g = adh2;
        this.f = bl2;
    }

    public final void h() {
        int n2 = this.g.b;
    }

    public final int hashCode() {
        Object object = this.a;
        int n2 = 0;
        int n3 = object == null ? 0 : object.hashCode();
        object = this.b;
        if (object != null) {
            n2 = object.hashCode();
        }
        int n4 = this.c;
        long l2 = this.d;
        return (((((n3 + 217) * 31 + n2) * 31 + n4) * 31 + (int)(l2 ^ l2 >>> 32)) * 961 + this.f) * 31 + this.g.hashCode();
    }

    public final void i(int n2) {
        long l2 = this.g.a((int)n2).a;
    }

    public final void j() {
        long l2 = this.g.c;
    }

    public final void k(int n2) {
        boolean bl2 = this.g.a((int)n2).h;
    }

    public final void l(int n2) {
        this.h();
        if (n2 == -1) {
            this.g.b();
        }
    }
}

