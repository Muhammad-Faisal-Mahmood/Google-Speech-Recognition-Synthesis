/*
 * Decompiled with CFR 0.152.
 */
public final class o
extends m {
    public float af = -1.0f;
    public int ag = -1;
    public int ah = -1;
    public int ai = 0;
    private l aj = this.j;

    public o() {
        this.q.clear();
        this.q.add(this.aj);
    }

    public final void A(int n2) {
        if (this.ai == n2) {
            return;
        }
        this.ai = n2;
        this.q.clear();
        this.aj = this.ai == 1 ? this.i : this.j;
        this.q.add(this.aj);
    }

    @Override
    public final l t(int n2) {
        block6: {
            block7: {
                block4: {
                    block5: {
                        if (--n2 == 1) break block4;
                        if (n2 == 2) break block5;
                        if (n2 == 3) break block4;
                        if (n2 != 4) break block6;
                    }
                    if (this.ai == 0) break block7;
                    break block6;
                }
                if (this.ai != 1) break block6;
            }
            return this.aj;
        }
        return null;
    }

    @Override
    public final void x(j j2) {
        Object object = this.r;
        if (object != null) {
            Object object2 = ((m)object).t(2);
            Object object3 = ((m)object).t(4);
            if (this.ai == 0) {
                object2 = ((m)object).t(3);
                object3 = ((m)object).t(5);
            }
            if (this.ag != -1) {
                j2.g(j.c(j2, j2.e(this.aj), j2.e(object2), this.ag, false));
                return;
            }
            if (this.ah != -1) {
                j2.g(j.c(j2, j2.e(this.aj), j2.e(object3), -this.ah, false));
                return;
            }
            if (this.af != -1.0f) {
                object = j2.e(this.aj);
                object2 = j2.e(object2);
                object3 = j2.e(object3);
                float f2 = this.af;
                h h2 = j2.a();
                h2.d.f((k)object, -1.0f);
                h2.d.f((k)object2, 1.0f - f2);
                h2.d.f((k)object3, f2);
                j2.g(h2);
            }
        }
    }

    @Override
    public final void y() {
        if (this.r == null) {
            return;
        }
        int n2 = j.p(this.aj);
        if (this.ai == 1) {
            this.w = n2;
            this.x = 0;
            this.j(this.r.d());
            this.p(0);
            return;
        }
        this.w = 0;
        this.x = n2;
        this.p(this.r.h());
        this.j(0);
    }
}

