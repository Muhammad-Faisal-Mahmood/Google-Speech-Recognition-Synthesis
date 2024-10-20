/*
 * Decompiled with CFR 0.152.
 */
final class arn {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    private final aga g = new aga(255);

    public final void a() {
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
    }

    public final boolean b(app app2, boolean bl2) {
        this.a();
        this.g.s(27);
        boolean bl3 = wc.s(app2, this.g.a, 27, bl2);
        if (bl3 && this.g.o() == 1332176723L) {
            int n2;
            if (this.g.h() != 0) {
                if (bl2) {
                    return false;
                }
                throw new aem("unsupported bit stream revision", null, false, 1);
            }
            this.a = this.g.h();
            this.b = this.g.l();
            this.g.m();
            this.g.m();
            this.g.m();
            this.c = n2 = this.g.h();
            this.d = n2 + 27;
            this.g.s(n2);
            if (wc.s(app2, this.g.a, this.c, bl2)) {
                for (int i2 = 0; i2 < this.c; ++i2) {
                    this.f[i2] = this.g.h();
                    this.e += this.f[i2];
                }
                return true;
            }
        }
        return false;
    }

    public final boolean c(app app2) {
        return this.d(app2, -1L);
    }

    public final boolean d(app app2, long l2) {
        long l3;
        long l4;
        apl apl2 = (apl)app2;
        boolean bl2 = apl2.c == app2.e();
        abr.d(bl2);
        this.g.s(4);
        while (((l4 = (l3 = l2 - -1L) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false || apl2.c + 4L < l2) && wc.s(app2, this.g.a, 4, true)) {
            this.g.v(0);
            if (this.g.o() == 1332176723L) {
                app2.i();
                return true;
            }
            app2.j(1);
        }
        while (l4 == false || apl2.c < l2) {
            int n2;
            int n3 = n2 = apl2.d(1);
            if (n2 == 0) {
                n3 = apl2.c(apl2.a, 0, Math.min(1, 4096), 0, true);
            }
            apl2.g(n3);
            if (n3 != -1) continue;
        }
        return false;
    }
}

