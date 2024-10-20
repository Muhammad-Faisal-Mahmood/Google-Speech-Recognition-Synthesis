/*
 * Decompiled with CFR 0.152.
 */
public final class kau
implements jww {
    public final juc a = new juc(null, jud.a);
    public final long b;
    private final juc c;
    private final jua d;
    private final jxu e;
    private final dml f;

    public kau(long l2, kau kau2, jxu jxu2, int n2) {
        jud jud2 = jud.a;
        this.c = new juc(kau2, jud2);
        this.b = l2;
        this.d = new jua(n2 << 16, jud2);
        this.e = jxu2;
        n2 = jxw.a;
        this.f = new dml(n2 + n2);
    }

    public final Object a() {
        return this.a.a;
    }

    public final kau b() {
        Object object = this.a();
        if (object == kat.a) {
            return null;
        }
        return (kau)object;
    }

    public final kau c() {
        return (kau)this.c.a;
    }

    public final void d() {
        this.c.b(null);
    }

    public final void e() {
        boolean bl2 = jve.a;
        if (!this.f()) {
            kau kau2;
            kau kau3;
            do {
                Object object;
                kau kau4;
                kau2 = this.c();
                while (kau2 != null && kau2.i()) {
                    kau2 = (kau)kau2.c.a;
                }
                kau3 = this.b();
                jse.b(kau3);
                while (kau3.i() && (kau4 = kau3.b()) != null) {
                    kau3 = kau4;
                }
                juc juc2 = kau3.c;
                while (!juc2.d(object, kau4 = (kau)(object = juc2.a) == null ? null : kau2)) {
                }
                if (kau2 == null) continue;
                kau2.a.c(kau3);
            } while (kau3.i() && !kau3.f() || kau2 != null && kau2.i());
        }
    }

    public final boolean f() {
        return this.b() == null;
    }

    public final void g() {
        if (this.d.a() == jxw.a) {
            this.e();
        }
    }

    public final boolean h() {
        return jua.a.addAndGet(this.d, -65536) == jxw.a && !this.f();
    }

    public final boolean i() {
        return this.d.b == jxw.a && !this.f();
    }

    public final boolean j() {
        boolean bl2;
        block1: {
            int n2;
            jua jua2;
            do {
                jua2 = this.d;
                n2 = jua2.b;
                if (n2 != jxw.a || this.f()) continue;
                bl2 = false;
                break block1;
            } while (!jua2.b(n2, 65536 + n2));
            bl2 = true;
        }
        return bl2;
    }

    public final Object k(int n2, Object object) {
        return this.f.B(n2 + n2 + 1).a(object);
    }

    public final Object l(int n2) {
        return this.f.B((int)(n2 + n2)).a;
    }

    public final Object m(int n2) {
        return this.f.B((int)(n2 + n2 + 1)).a;
    }

    public final Object n(int n2) {
        Object object = this.l(n2);
        this.p(n2);
        return object;
    }

    public final jxu o() {
        jxu jxu2 = this.e;
        jse.b(jxu2);
        return jxu2;
    }

    public final void p(int n2) {
        this.r(n2, null);
    }

    public final void q(int n2, boolean bl2) {
        if (bl2) {
            this.o().m(this.b * (long)jxw.a + (long)n2);
        }
        this.g();
    }

    public final void r(int n2, Object object) {
        this.f.B(n2 + n2).b(object);
    }

    public final void s(int n2, Object object) {
        this.f.B(n2 + n2 + 1).c(object);
    }

    public final boolean t(int n2, Object object, Object object2) {
        return this.f.B(n2 + n2 + 1).d(object, object2);
    }
}

