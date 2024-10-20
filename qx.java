/*
 * Decompiled with CFR 0.152.
 */
public final class qx
extends ra {
    private static final int[] a = new int[2];

    public qx(qg qg2) {
        super(qg2);
        this.h.l = 4;
        this.i.l = 5;
        this.f = 0;
    }

    private static final void n(int[] nArray, int n2, int n3, int n4, int n5, float f2, int n6) {
        n4 = n5 - n4;
        n2 = n3 - n2;
        if (n6 != -1) {
            if (n6 != 0) {
                float f3 = n2;
                nArray[0] = n2;
                nArray[1] = (int)(f3 * f2 + 0.5f);
                return;
            }
            nArray[0] = (int)((float)n4 * f2 + 0.5f);
            nArray[1] = n4;
            return;
        }
        float f4 = n4;
        float f5 = (float)n2 / f2;
        n3 = (int)(f4 * f2 + 0.5f);
        if (n3 <= n2) {
            nArray[0] = n3;
            nArray[1] = n4;
            return;
        }
        n3 = (int)(f5 + 0.5f);
        if (n3 <= n4) {
            nArray[0] = n2;
            nArray[1] = n3;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void b() {
        Object object;
        Object object2;
        int n2;
        Object object3 = this.d;
        if (((qg)object3).e) {
            ((qs)this.e).c(((qg)object3).j());
        }
        if (!this.e.i) {
            this.j = n2 = this.d.M();
            if (n2 != 3) {
                if (this.j == 4 && (object3 = this.d.U) != null && (((qg)object3).M() == 1 || ((qg)object3).M() == 4)) {
                    int n3 = ((qg)object3).j();
                    n2 = this.d.J.b();
                    int n4 = this.d.L.b();
                    qx.j(this.h, ((qg)object3).h.h, this.d.J.b());
                    qx.j(this.i, ((qg)object3).h.i, -this.d.L.b());
                    ((qs)this.e).c(n3 - n2 - n4);
                    return;
                }
                if (this.j == 1) {
                    ((qs)this.e).c(this.d.j());
                }
            }
        } else if (this.j == 4 && (object3 = this.d.U) != null && (((qg)object3).M() == 1 || ((qg)object3).M() == 4)) {
            qx.j(this.h, ((qg)object3).h.h, this.d.J.b());
            qx.j(this.i, ((qg)object3).h.i, -this.d.L.b());
            return;
        }
        object3 = this.e;
        if (((qt)object3).i) {
            object2 = this.d;
            if (((qg)object2).e) {
                qf[] qfArray = ((qg)object2).R;
                qf qf2 = qfArray[0];
                object3 = qf2.e;
                if (object3 != null && qfArray[1].e != null) {
                    if (((qg)object2).H()) {
                        this.h.e = this.d.R[0].b();
                        this.i.e = -this.d.R[1].b();
                        return;
                    }
                    object3 = qx.k(this.d.R[0]);
                    if (object3 != null) {
                        qx.j(this.h, (qs)object3, this.d.R[0].b());
                    }
                    if ((object3 = qx.k(this.d.R[1])) != null) {
                        qx.j(this.i, (qs)object3, -this.d.R[1].b());
                    }
                    this.h.b = true;
                    this.i.b = true;
                    return;
                }
                if (object3 != null) {
                    object3 = qx.k(qf2);
                    if (object3 == null) return;
                    qx.j(this.h, (qs)object3, this.d.R[0].b());
                    qx.j(this.i, this.h, this.e.f);
                    return;
                }
                object3 = qfArray[1];
                if (((qf)object3).e != null) {
                    if ((object3 = qx.k((qf)object3)) == null) return;
                    qx.j(this.i, (qs)object3, -this.d.R[1].b());
                    qx.j(this.h, this.i, -this.e.f);
                    return;
                }
                if (object2 instanceof qk || ((qg)object2).U == null || ((qg)object2).K((int)7).e != null) return;
                object3 = this.d;
                object2 = ((qg)object3).U.h.h;
                qx.j(this.h, (qs)object2, ((qg)object3).k());
                qx.j(this.i, this.h, this.e.f);
                return;
            }
        }
        if (this.j == 3) {
            object = this.d;
            n2 = ((qg)object).s;
            if (n2 != 2) {
                if (n2 == 3) {
                    if (((qg)object).t == 3) {
                        this.h.a = this;
                        this.i.a = this;
                        object2 = ((qg)object).i;
                        ((qy)object2).h.a = this;
                        ((qy)object2).i.a = this;
                        ((qt)object3).a = this;
                        if (((qg)object).I()) {
                            this.e.k.add(this.d.i.e);
                            this.d.i.e.j.add(this.e);
                            object3 = this.d.i;
                            ((qy)object3).e.a = this;
                            this.e.k.add(((qy)object3).h);
                            this.e.k.add(this.d.i.i);
                            this.d.i.h.j.add(this.e);
                            this.d.i.i.j.add(this.e);
                        } else if (this.d.H()) {
                            this.d.i.e.k.add(this.e);
                            this.e.j.add(this.d.i.e);
                        } else {
                            this.d.i.e.k.add(this.e);
                        }
                    } else {
                        object2 = ((qg)object).i.e;
                        ((qt)object3).k.add(object2);
                        ((qs)object2).j.add(this.e);
                        this.d.i.h.j.add(this.e);
                        this.d.i.i.j.add(this.e);
                        object2 = this.e;
                        ((qt)object2).b = true;
                        object3 = this.h;
                        ((qt)object2).j.add(object3);
                        object3 = this.e;
                        object2 = this.i;
                        ((qt)object3).j.add(object2);
                        object2 = this.h;
                        object3 = this.e;
                        ((qs)object2).k.add(object3);
                        object2 = this.i;
                        object3 = this.e;
                        ((qs)object2).k.add(object3);
                    }
                }
            } else {
                object2 = ((qg)object).U;
                if (object2 != null) {
                    object2 = ((qg)object2).i.e;
                    ((qt)object3).k.add(object2);
                    ((qs)object2).j.add(this.e);
                    object2 = this.e;
                    ((qt)object2).b = true;
                    object3 = this.h;
                    ((qt)object2).j.add(object3);
                    object3 = this.e;
                    object2 = this.i;
                    ((qt)object3).j.add(object2);
                }
            }
        }
        object3 = this.d;
        qf[] qfArray = ((qg)object3).R;
        object = qfArray[0];
        object2 = ((qf)object).e;
        if (object2 != null && qfArray[1].e != null) {
            if (((qg)object3).H()) {
                this.h.e = this.d.R[0].b();
                this.i.e = -this.d.R[1].b();
                return;
            }
            object3 = qx.k(this.d.R[0]);
            object2 = qx.k(this.d.R[1]);
            if (object3 != null) {
                ((qs)object3).a(this);
            }
            if (object2 != null) {
                ((qs)object2).a(this);
            }
            this.k = 4;
            return;
        }
        if (object2 != null) {
            object3 = qx.k((qf)object);
            if (object3 == null) return;
            qx.j(this.h, (qs)object3, this.d.R[0].b());
            this.i(this.i, this.h, 1, this.e);
            return;
        }
        object2 = qfArray[1];
        if (((qf)object2).e != null) {
            object3 = qx.k((qf)object2);
            if (object3 == null) return;
            qx.j(this.i, (qs)object3, -this.d.R[1].b());
            this.i(this.h, this.i, -1, this.e);
            return;
        }
        if (object3 instanceof qk || (object2 = ((qg)object3).U) == null) return;
        object2 = ((qg)object2).h.h;
        qx.j(this.h, (qs)object2, ((qg)object3).k());
        this.i(this.i, this.h, 1, this.e);
    }

    @Override
    public final void c() {
        qs qs2 = this.h;
        if (qs2.i) {
            this.d.Z = qs2.f;
        }
    }

    @Override
    public final void d() {
        this.l = null;
        this.h.b();
        this.i.b();
        this.e.b();
        this.g = false;
    }

    @Override
    public final boolean e() {
        if (this.j == 3) {
            return this.d.s == 0;
        }
        return true;
    }

    @Override
    public final void f() {
        block21: {
            block22: {
                block32: {
                    int n2;
                    int n3;
                    int n4;
                    int n5;
                    Object object;
                    float f2;
                    Object object2;
                    Object object3;
                    int n6;
                    block23: {
                        block24: {
                            block34: {
                                block30: {
                                    int n7;
                                    int n8;
                                    int n9;
                                    int n10;
                                    block33: {
                                        block31: {
                                            block25: {
                                                block29: {
                                                    float f3;
                                                    block28: {
                                                        block26: {
                                                            block27: {
                                                                n6 = this.k;
                                                                if (n6 == 0) break block21;
                                                                if (n6 - 1 == 3) break block22;
                                                                object3 = this.e;
                                                                if (((qt)object3).i || this.j != 3) break block23;
                                                                object2 = this.d;
                                                                n6 = ((qg)object2).s;
                                                                if (n6 == 2) break block24;
                                                                if (n6 != 3) break block23;
                                                                n6 = ((qg)object2).t;
                                                                if (n6 == 0 || n6 == 3) break block25;
                                                                n6 = ((qg)object2).Y;
                                                                if (n6 == -1) break block26;
                                                                if (n6 == 0) break block27;
                                                                f2 = ((qg)object2).i.e.f;
                                                                f3 = ((qg)object2).X;
                                                                break block28;
                                                            }
                                                            f2 = (float)((qg)object2).i.e.f / ((qg)object2).X;
                                                            break block29;
                                                        }
                                                        f2 = ((qg)object2).i.e.f;
                                                        f3 = ((qg)object2).X;
                                                    }
                                                    f2 *= f3;
                                                }
                                                ((qs)object3).c((int)(f2 + 0.5f));
                                                break block23;
                                            }
                                            object = ((qg)object2).i;
                                            object3 = ((qy)object).h;
                                            object = ((qy)object).i;
                                            n6 = ((qg)object2).J.e != null ? 1 : 0;
                                            n5 = ((qg)object2).K.e != null ? 1 : 0;
                                            n4 = ((qg)object2).L.e != null ? 1 : 0;
                                            n3 = ((qg)object2).M.e != null ? 1 : 0;
                                            n2 = ((qg)object2).Y;
                                            if (n6 == 0 || n5 == 0 || n4 == 0 || n3 == 0) break block30;
                                            f2 = ((qg)object2).X;
                                            if (!((qs)object3).i || !((qs)object).i) break block31;
                                            object2 = this.h;
                                            if (((qs)object2).c && this.i.c) {
                                                int n11 = ((qs)((qs)object2).k.get((int)0)).f;
                                                n5 = this.h.e;
                                                int n12 = ((qs)this.i.k.get((int)0)).f;
                                                n4 = this.i.e;
                                                n6 = ((qs)object3).f;
                                                int n13 = ((qs)object3).e;
                                                int n14 = ((qs)object).f;
                                                n3 = ((qs)object).e;
                                                object3 = a;
                                                qx.n((int[])object3, n11 + n5, n12 - n4, n6 + n13, n14 - n3, f2, n2);
                                                ((qs)this.e).c((int)object3[0]);
                                                ((qs)this.d.i.e).c((int)object3[1]);
                                                return;
                                            }
                                            break block32;
                                        }
                                        object2 = this.h;
                                        if (!((qs)object2).i) break block33;
                                        qs qs2 = this.i;
                                        if (!qs2.i) break block33;
                                        if (!((qs)object3).c || !((qs)object).c) break block32;
                                        n5 = ((qs)object2).f;
                                        n4 = ((qs)object2).e;
                                        n10 = qs2.f;
                                        n3 = qs2.e;
                                        n6 = ((qs)((qs)object3).k.get((int)0)).f;
                                        n9 = ((qs)object3).e;
                                        n8 = ((qs)((qs)object).k.get((int)0)).f;
                                        n7 = ((qs)object).e;
                                        object2 = a;
                                        qx.n((int[])object2, n5 + n4, n10 - n3, n6 + n9, n8 - n7, f2, n2);
                                        ((qs)this.e).c((int)object2[0]);
                                        ((qs)this.d.i.e).c((int)object2[1]);
                                    }
                                    object2 = this.h;
                                    if (!((qs)object2).c || !this.i.c || !((qs)object3).c || !((qs)object).c) break block32;
                                    n8 = ((qs)((qs)object2).k.get((int)0)).f;
                                    n10 = this.h.e;
                                    n3 = ((qs)this.i.k.get((int)0)).f;
                                    n4 = this.i.e;
                                    n7 = ((qs)((qs)object3).k.get((int)0)).f;
                                    n5 = ((qs)object3).e;
                                    n6 = ((qs)((qs)object).k.get((int)0)).f;
                                    n9 = ((qs)object).e;
                                    object3 = a;
                                    qx.n((int[])object3, n8 + n10, n3 - n4, n7 + n5, n6 - n9, f2, n2);
                                    ((qs)this.e).c((int)object3[0]);
                                    ((qs)this.d.i.e).c((int)object3[1]);
                                    break block23;
                                }
                                if (n6 == 0 || n4 == 0) break block34;
                                object3 = this.h;
                                if (!((qs)object3).c || !this.i.c) break block32;
                                f2 = ((qg)object2).X;
                                n5 = ((qs)((qs)object3).k.get((int)0)).f;
                                n6 = this.h.e;
                                n6 = ((qs)this.i.k.get((int)0)).f - this.i.e - (n5 + n6);
                                if (n2 != -1 && n2 != 0) {
                                    n4 = (int)((float)(n6 = this.h(n6, 0)) / f2 + 0.5f);
                                    if (n4 != (n5 = this.h(n4, 1))) {
                                        n6 = (int)((float)n5 * f2 + 0.5f);
                                    }
                                    ((qs)this.e).c(n6);
                                    ((qs)this.d.i.e).c(n5);
                                } else {
                                    n4 = (int)((float)(n6 = this.h(n6, 0)) * f2 + 0.5f);
                                    if (n4 != (n5 = this.h(n4, 1))) {
                                        n6 = (int)((float)n5 / f2 + 0.5f);
                                    }
                                    ((qs)this.e).c(n6);
                                    ((qs)this.d.i.e).c(n5);
                                }
                                break block23;
                            }
                            if (n5 == 0 || n3 == 0) break block23;
                            if (!((qs)object3).c || !((qs)object).c) break block32;
                            f2 = ((qg)object2).X;
                            n5 = ((qs)((qs)object3).k.get((int)0)).f;
                            n6 = ((qs)object3).e;
                            n6 = ((qs)((qs)object).k.get((int)0)).f - ((qs)object).e - (n5 + n6);
                            if (n2 != 0) {
                                n4 = (int)((float)(n6 = this.h(n6, 1)) / f2 + 0.5f);
                                if (n4 != (n5 = this.h(n4, 0))) {
                                    n6 = (int)((float)n5 * f2 + 0.5f);
                                }
                                ((qs)this.e).c(n5);
                                ((qs)this.d.i.e).c(n6);
                            } else {
                                n4 = (int)((float)(n6 = this.h(n6, 1)) * f2 + 0.5f);
                                if (n4 != (n5 = this.h(n4, 0))) {
                                    n6 = (int)((float)n5 / f2 + 0.5f);
                                }
                                ((qs)this.e).c(n5);
                                ((qs)this.d.i.e).c(n6);
                            }
                            break block23;
                        }
                        object = ((qg)object2).U;
                        if (object != null) {
                            object = ((qg)object).h.e;
                            if (((qt)object).i) {
                                f2 = ((qg)object2).x;
                                ((qs)object3).c((int)((float)((qt)object).f * f2 + 0.5f));
                            }
                        }
                    }
                    object = this.h;
                    if (((qs)object).c) {
                        object3 = this.i;
                        if (!(!((qs)object3).c || ((qs)object).i && ((qs)object3).i && this.e.i)) {
                            if (!this.e.i && this.j == 3) {
                                object3 = this.d;
                                if (((qg)object3).s == 0 && !((qg)object3).H()) {
                                    object = (qs)this.h.k.get(0);
                                    object3 = (qs)this.i.k.get(0);
                                    n6 = ((qs)object).f;
                                    object = this.h;
                                    n5 = ((qs)object3).f + this.i.e;
                                    ((qs)object).c(n6 += ((qs)object).e);
                                    this.i.c(n5);
                                    ((qs)this.e).c(n5 - n6);
                                    return;
                                }
                            }
                            if (!this.e.i && this.j == 3 && this.c == 1 && this.h.k.size() > 0 && this.i.k.size() > 0) {
                                object = (qs)this.h.k.get(0);
                                object3 = (qs)this.i.k.get(0);
                                n5 = ((qs)object).f;
                                n6 = this.h.e;
                                n6 = Math.min(((qs)object3).f + this.i.e - (n5 + n6), this.e.m);
                                object3 = this.d;
                                n4 = ((qg)object3).w;
                                n6 = n5 = Math.max(((qg)object3).v, n6);
                                if (n4 > 0) {
                                    n6 = Math.min(n4, n5);
                                }
                                ((qs)this.e).c(n6);
                            }
                            if (this.e.i) {
                                object = (qs)this.h.k.get(0);
                                object3 = (qs)this.i.k.get(0);
                                n5 = ((qs)object).f;
                                object2 = this.h;
                                n3 = ((qs)object2).e;
                                n4 = ((qs)object3).f;
                                n2 = this.i.e;
                                f2 = this.d.ae;
                                if (object == object3) {
                                    f2 = 0.5f;
                                }
                                n6 = n4;
                                if (object != object3) {
                                    n6 = n2 + n4;
                                }
                                if (object != object3) {
                                    n5 = n3 + n5;
                                }
                                n4 = this.e.f;
                                ((qs)object2).c((int)((float)n5 + 0.5f + (float)(n6 - n5 - n4) * f2));
                                object = this.i;
                                object3 = this.h;
                                object2 = this.e;
                                ((qs)object).c(((qs)object3).f + ((qt)object2).f);
                            }
                        }
                    }
                }
                return;
            }
            qg qg2 = this.d;
            this.m(qg2.J, qg2.L, 0);
            return;
        }
        throw null;
    }

    public final void g() {
        this.g = false;
        this.h.b();
        this.h.i = false;
        this.i.b();
        this.i.i = false;
        this.e.i = false;
    }

    public final String toString() {
        return "HorizontalRun ".concat(String.valueOf(this.d.ai));
    }
}

