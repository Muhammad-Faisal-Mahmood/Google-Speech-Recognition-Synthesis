/*
 * Decompiled with CFR 0.152.
 */
public final class qj
extends qg {
    public float a = -1.0f;
    public int ar = 0;
    private boolean as;
    public int b = -1;
    public int c = -1;
    public qf d = this.K;

    public qj() {
        this.S.clear();
        this.S.add(this.d);
        int n2 = this.R.length;
        for (int i2 = 0; i2 < 6; ++i2) {
            this.R[i2] = this.d;
        }
    }

    @Override
    public final qf K(int n2) {
        block4: {
            block5: {
                block2: {
                    block3: {
                        if (--n2 == 1) break block2;
                        if (n2 == 2) break block3;
                        if (n2 == 3) break block2;
                        if (n2 != 4) break block4;
                    }
                    if (this.ar != 0) break block4;
                    break block5;
                }
                if (this.ar != 1) break block4;
            }
            return this.d;
        }
        return null;
    }

    @Override
    public final void R(boolean bl2) {
        if (this.U == null) {
            return;
        }
        int n2 = px.o(this.d);
        if (this.ar == 1) {
            this.Z = n2;
            this.aa = 0;
            this.x(this.U.h());
            this.C(0);
            return;
        }
        this.Z = 0;
        this.aa = n2;
        this.C(this.U.j());
        this.x(0);
    }

    public final void a(int n2) {
        this.d.e(n2);
        this.as = true;
    }

    @Override
    public final void b(px px2, boolean bl2) {
        qg qg2 = this.U;
        if (qg2 != null) {
            Object object = qg2.K(2);
            Object object2 = qg2.K(4);
            Object object3 = this.U;
            boolean bl3 = true;
            boolean bl4 = object3 != null && ((qg)object3).aq[0] == 2;
            if (this.ar == 0) {
                object = qg2.K(3);
                object2 = qg2.K(5);
                bl4 = object3 != null && ((qg)object3).aq[1] == 2 ? bl3 : false;
            }
            if (this.as) {
                object3 = this.d;
                if (((qf)object3).c) {
                    object3 = px2.b(object3);
                    px2.f((qb)object3, this.d.a());
                    if (this.b != -1) {
                        if (bl4) {
                            px2.g(px2.b(object2), (qb)object3, 0, 5);
                        }
                    } else if (this.c != -1 && bl4) {
                        object2 = px2.b(object2);
                        px2.g((qb)object3, px2.b(object), 0, 5);
                        px2.g((qb)object2, (qb)object3, 0, 5);
                    }
                    this.as = false;
                    return;
                }
            }
            if (this.b != -1) {
                object3 = px2.b(this.d);
                px2.m((qb)object3, px2.b(object), this.b, 8);
                if (bl4) {
                    px2.g(px2.b(object2), (qb)object3, 0, 5);
                    return;
                }
            } else if (this.c != -1) {
                object3 = px2.b(this.d);
                object2 = px2.b(object2);
                px2.m((qb)object3, (qb)object2, -this.c, 8);
                if (bl4) {
                    px2.g((qb)object3, px2.b(object), 0, 5);
                    px2.g((qb)object2, (qb)object3, 0, 5);
                    return;
                }
            } else if (this.a != -1.0f) {
                object = px2.b(this.d);
                object2 = px2.b(object2);
                float f2 = this.a;
                object3 = px2.a();
                ((pw)object3).e.g((qb)object, -1.0f);
                ((pw)object3).e.g((qb)object2, f2);
                px2.e((pw)object3);
            }
        }
    }

    public final void c(int n2) {
        if (this.ar != n2) {
            this.ar = n2;
            this.S.clear();
            this.d = this.ar == 1 ? this.J : this.K;
            this.S.add(this.d);
            n2 = this.R.length;
            for (n2 = 0; n2 < 6; ++n2) {
                this.R[n2] = this.d;
            }
        }
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final boolean e() {
        return this.as;
    }

    @Override
    public final boolean f() {
        return this.as;
    }
}

