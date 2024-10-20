/*
 * Decompiled with CFR 0.152.
 */
public final class qy
extends ra {
    public final qs a;
    qt b;

    public qy(qg object) {
        super((qg)object);
        this.a = object = new qs(this);
        this.b = null;
        this.h.l = 6;
        this.i.l = 7;
        ((qs)object).l = 8;
        this.f = 1;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void b() {
        block52: {
            Object object;
            Object object2;
            block54: {
                qf qf2;
                block53: {
                    qf qf3;
                    block51: {
                        block50: {
                            block48: {
                                block49: {
                                    block47: {
                                        block46: {
                                            block45: {
                                                object2 = this.d;
                                                if (((qg)object2).e) {
                                                    ((qs)this.e).c(((qg)object2).h());
                                                }
                                                if (this.e.i) break block45;
                                                this.j = this.d.N();
                                                if (this.d.F) {
                                                    this.b = new qt(this);
                                                }
                                                if (this.j != 3) {
                                                    if (this.j == 4 && (object2 = this.d.U) != null && ((qg)object2).N() == 1) {
                                                        int n2 = ((qg)object2).h();
                                                        int n3 = this.d.K.b();
                                                        int n4 = this.d.M.b();
                                                        qy.j(this.h, ((qg)object2).i.h, this.d.K.b());
                                                        qy.j(this.i, ((qg)object2).i.i, -this.d.M.b());
                                                        ((qs)this.e).c(n2 - n3 - n4);
                                                        return;
                                                    }
                                                    if (this.j == 1) {
                                                        ((qs)this.e).c(this.d.h());
                                                    }
                                                }
                                                break block46;
                                            }
                                            if (this.j == 4 && (object2 = this.d.U) != null && ((qg)object2).N() == 1) {
                                                qy.j(this.h, ((qg)object2).i.h, this.d.K.b());
                                                qy.j(this.i, ((qg)object2).i.i, -this.d.M.b());
                                                return;
                                            }
                                        }
                                        object = this.e;
                                        if (!((qt)object).i) break block47;
                                        object2 = this.d;
                                        if (((qg)object2).e) {
                                            object = ((qg)object2).R;
                                            qf qf4 = object[2];
                                            qf qf5 = qf4.e;
                                            if (qf5 != null && object[3].e != null) {
                                                if (((qg)object2).I()) {
                                                    this.h.e = this.d.R[2].b();
                                                    this.i.e = -this.d.R[3].b();
                                                } else {
                                                    object2 = qy.k(this.d.R[2]);
                                                    if (object2 != null) {
                                                        qy.j(this.h, (qs)object2, this.d.R[2].b());
                                                    }
                                                    if ((object2 = qy.k(this.d.R[3])) != null) {
                                                        qy.j(this.i, (qs)object2, -this.d.R[3].b());
                                                    }
                                                    this.h.b = true;
                                                    this.i.b = true;
                                                }
                                                object2 = this.d;
                                                if (!((qg)object2).F) return;
                                                qy.j(this.a, this.h, ((qg)object2).ab);
                                                return;
                                            }
                                            if (qf5 != null) {
                                                object2 = qy.k(qf4);
                                                if (object2 == null) return;
                                                qy.j(this.h, (qs)object2, this.d.R[2].b());
                                                qy.j(this.i, this.h, this.e.f);
                                                object2 = this.d;
                                                if (!((qg)object2).F) return;
                                                qy.j(this.a, this.h, ((qg)object2).ab);
                                                return;
                                            }
                                            qf5 = object[3];
                                            if (qf5.e != null) {
                                                object2 = qy.k(qf5);
                                                if (object2 != null) {
                                                    qy.j(this.i, (qs)object2, -this.d.R[3].b());
                                                    qy.j(this.h, this.i, -this.e.f);
                                                }
                                                object2 = this.d;
                                                if (!((qg)object2).F) return;
                                                qy.j(this.a, this.h, ((qg)object2).ab);
                                                return;
                                            }
                                            object = object[4];
                                            if (((qf)object).e != null) {
                                                object2 = qy.k((qf)object);
                                                if (object2 == null) return;
                                                qy.j(this.a, (qs)object2, 0);
                                                qy.j(this.h, this.a, -this.d.ab);
                                                qy.j(this.i, this.h, this.e.f);
                                                return;
                                            }
                                            if (object2 instanceof qk || ((qg)object2).U == null || ((qg)object2).K((int)7).e != null) return;
                                            object = this.d;
                                            object2 = ((qg)object).U.i.h;
                                            qy.j(this.h, (qs)object2, ((qg)object).l());
                                            qy.j(this.i, this.h, this.e.f);
                                            object2 = this.d;
                                            if (!((qg)object2).F) return;
                                            qy.j(this.a, this.h, ((qg)object2).ab);
                                            return;
                                        }
                                        break block48;
                                    }
                                    if (this.j != 3) break block48;
                                    object2 = this.d;
                                    int n5 = ((qg)object2).t;
                                    if (n5 == 2) break block49;
                                    if (n5 == 3 && !((qg)object2).I()) {
                                        object2 = this.d;
                                        if (((qg)object2).s != 3) {
                                            object2 = ((qg)object2).h.e;
                                            this.e.k.add(object2);
                                            ((qs)object2).j.add(this.e);
                                            object2 = this.e;
                                            ((qt)object2).b = true;
                                            object = this.h;
                                            ((qt)object2).j.add(object);
                                            object2 = this.e;
                                            object = this.i;
                                            ((qt)object2).j.add(object);
                                        }
                                    }
                                    break block50;
                                }
                                object2 = ((qg)object2).U;
                                if (object2 != null) {
                                    object2 = ((qg)object2).i.e;
                                    ((qt)object).k.add(object2);
                                    ((qs)object2).j.add(this.e);
                                    object2 = this.e;
                                    ((qt)object2).b = true;
                                    object = this.h;
                                    ((qt)object2).j.add(object);
                                    object2 = this.e;
                                    object = this.i;
                                    ((qt)object2).j.add(object);
                                }
                                break block50;
                            }
                            ((qs)object).a(this);
                        }
                        object2 = this.d;
                        object = ((qg)object2).R;
                        qf2 = object[2];
                        qf3 = qf2.e;
                        if (qf3 == null || object[3].e == null) break block51;
                        if (((qg)object2).I()) {
                            this.h.e = this.d.R[2].b();
                            this.i.e = -this.d.R[3].b();
                        } else {
                            object = qy.k(this.d.R[2]);
                            object2 = qy.k(this.d.R[3]);
                            if (object != null) {
                                ((qs)object).a(this);
                            }
                            if (object2 != null) {
                                ((qs)object2).a(this);
                            }
                            this.k = 4;
                        }
                        if (this.d.F) {
                            this.i(this.a, this.h, 1, this.b);
                        }
                        break block52;
                    }
                    if (qf3 == null) break block53;
                    object2 = qy.k(qf2);
                    if (object2 == null) break block52;
                    qy.j(this.h, (qs)object2, this.d.R[2].b());
                    this.i(this.i, this.h, 1, this.e);
                    if (this.d.F) {
                        this.i(this.a, this.h, 1, this.b);
                    }
                    if (this.j != 3) break block52;
                    object2 = this.d;
                    if (((qg)object2).X > 0.0f) {
                        object2 = ((qg)object2).h;
                        if (((qx)object2).j == 3) {
                            ((qx)object2).e.j.add(this.e);
                            this.e.k.add(this.d.h.e);
                            this.e.a = this;
                        }
                    }
                    break block52;
                }
                qf2 = object[3];
                if (qf2.e == null) break block54;
                object2 = qy.k(qf2);
                if (object2 != null) {
                    qy.j(this.i, (qs)object2, -this.d.R[3].b());
                    this.i(this.h, this.i, -1, this.e);
                    if (this.d.F) {
                        this.i(this.a, this.h, 1, this.b);
                    }
                }
                break block52;
            }
            object = object[4];
            if (((qf)object).e != null) {
                object2 = qy.k((qf)object);
                if (object2 != null) {
                    qy.j(this.a, (qs)object2, 0);
                    this.i(this.h, this.a, -1, this.b);
                    this.i(this.i, this.h, 1, this.e);
                }
            } else if (!(object2 instanceof qk) && (object = ((qg)object2).U) != null) {
                object = ((qg)object).i.h;
                qy.j(this.h, (qs)object, ((qg)object2).l());
                this.i(this.i, this.h, 1, this.e);
                if (this.d.F) {
                    this.i(this.a, this.h, 1, this.b);
                }
                if (this.j == 3) {
                    object2 = this.d;
                    if (((qg)object2).X > 0.0f) {
                        object2 = ((qg)object2).h;
                        if (((qx)object2).j == 3) {
                            ((qx)object2).e.j.add(this.e);
                            this.e.k.add(this.d.h.e);
                            this.e.a = this;
                        }
                    }
                }
            }
        }
        if (this.e.k.size() != 0) return;
        this.e.c = true;
    }

    @Override
    public final void c() {
        qs qs2 = this.h;
        if (qs2.i) {
            this.d.aa = qs2.f;
        }
    }

    @Override
    public final void d() {
        this.l = null;
        this.h.b();
        this.i.b();
        this.a.b();
        this.e.b();
        this.g = false;
    }

    @Override
    public final boolean e() {
        if (this.j == 3) {
            return this.d.t == 0;
        }
        return true;
    }

    @Override
    public final void f() {
        block13: {
            block14: {
                float f2;
                Object object;
                Object object2;
                Object object3;
                int n2;
                block15: {
                    block16: {
                        block20: {
                            float f3;
                            block19: {
                                block17: {
                                    block18: {
                                        n2 = this.k;
                                        if (n2 == 0) break block13;
                                        if (n2 - 1 == 3) break block14;
                                        object3 = this.e;
                                        if (!((qt)object3).c || ((qt)object3).i || this.j != 3) break block15;
                                        object2 = this.d;
                                        n2 = ((qg)object2).t;
                                        if (n2 == 2) break block16;
                                        if (n2 != 3) break block15;
                                        object = ((qg)object2).h.e;
                                        if (!((qt)object).i) break block15;
                                        n2 = ((qg)object2).Y;
                                        if (n2 == -1) break block17;
                                        if (n2 == 0) break block18;
                                        f2 = ((qt)object).f;
                                        f3 = ((qg)object2).X;
                                        break block19;
                                    }
                                    f2 = (float)((qt)object).f * ((qg)object2).X;
                                    break block20;
                                }
                                f2 = ((qt)object).f;
                                f3 = ((qg)object2).X;
                            }
                            f2 /= f3;
                        }
                        ((qs)object3).c((int)(f2 + 0.5f));
                        break block15;
                    }
                    object = ((qg)object2).U;
                    if (object != null) {
                        object = ((qg)object).i.e;
                        if (((qt)object).i) {
                            f2 = ((qg)object2).A;
                            ((qs)object3).c((int)((float)((qt)object).f * f2 + 0.5f));
                        }
                    }
                }
                object2 = this.h;
                if (((qs)object2).c) {
                    object3 = this.i;
                    if (!(!((qs)object3).c || ((qs)object2).i && ((qs)object3).i && this.e.i)) {
                        int n3;
                        int n4;
                        int n5;
                        if (!this.e.i && this.j == 3) {
                            object3 = this.d;
                            if (((qg)object3).s == 0 && !((qg)object3).I()) {
                                object2 = (qs)this.h.k.get(0);
                                object3 = (qs)this.i.k.get(0);
                                n2 = ((qs)object2).f;
                                object2 = this.h;
                                int n6 = ((qs)object3).f + this.i.e;
                                ((qs)object2).c(n2 += ((qs)object2).e);
                                this.i.c(n6);
                                ((qs)this.e).c(n6 - n2);
                                return;
                            }
                        }
                        if (!this.e.i && this.j == 3 && this.c == 1 && this.h.k.size() > 0 && this.i.k.size() > 0) {
                            object3 = (qs)this.h.k.get(0);
                            object2 = (qs)this.i.k.get(0);
                            n2 = ((qs)object3).f;
                            n5 = this.h.e;
                            n4 = ((qs)object2).f;
                            n3 = this.i.e;
                            object3 = this.e;
                            if ((n3 = n4 + n3 - (n2 + n5)) < (n2 = ((qt)object3).m)) {
                                ((qs)object3).c(n3);
                            } else {
                                ((qs)object3).c(n2);
                            }
                        }
                        if (this.e.i && this.h.k.size() > 0 && this.i.k.size() > 0) {
                            object3 = (qs)this.h.k.get(0);
                            object = (qs)this.i.k.get(0);
                            n3 = ((qs)object3).f;
                            object2 = this.h;
                            n4 = ((qs)object2).e;
                            n5 = ((qs)object).f;
                            int n7 = this.i.e;
                            f2 = this.d.af;
                            if (object3 == object) {
                                f2 = 0.5f;
                            }
                            n2 = n5;
                            if (object3 != object) {
                                n2 = n7 + n5;
                            }
                            if (object3 != object) {
                                n3 = n4 + n3;
                            }
                            n5 = this.e.f;
                            ((qs)object2).c((int)((float)n3 + 0.5f + (float)(n2 - n3 - n5) * f2));
                            object = this.i;
                            object2 = this.h;
                            object3 = this.e;
                            ((qs)object).c(((qs)object2).f + ((qt)object3).f);
                        }
                    }
                }
                return;
            }
            qg qg2 = this.d;
            this.m(qg2.K, qg2.M, 1);
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
        this.a.b();
        this.a.i = false;
        this.e.i = false;
    }

    public final String toString() {
        return "VerticalRun ".concat(String.valueOf(this.d.ai));
    }
}

