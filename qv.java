/*
 * Decompiled with CFR 0.152.
 */
public final class qv
extends ra {
    public qv(qg qg2) {
        super(qg2);
        qg2.h.d();
        qg2.i.d();
        this.f = ((qj)qg2).ar;
    }

    private final void g(qs qs2) {
        this.h.j.add(qs2);
        qs2.k.add(this.h);
    }

    @Override
    public final void b() {
        qg qg2 = this.d;
        Object object = (qj)qg2;
        int n2 = ((qj)object).b;
        int n3 = ((qj)object).c;
        float f2 = ((qj)object).a;
        if (((qj)object).ar == 1) {
            if (n2 != -1) {
                this.h.k.add(qg2.U.h.h);
                this.d.U.h.h.j.add(this.h);
                this.h.e = n2;
            } else if (n3 != -1) {
                this.h.k.add(qg2.U.h.i);
                this.d.U.h.i.j.add(this.h);
                this.h.e = -n3;
            } else {
                object = this.h;
                ((qs)object).b = true;
                ((qs)object).k.add(qg2.U.h.i);
                this.d.U.h.i.j.add(this.h);
            }
            this.g(this.d.h.h);
            this.g(this.d.h.i);
            return;
        }
        if (n2 != -1) {
            this.h.k.add(qg2.U.i.h);
            this.d.U.i.h.j.add(this.h);
            this.h.e = n2;
        } else if (n3 != -1) {
            this.h.k.add(qg2.U.i.i);
            this.d.U.i.i.j.add(this.h);
            this.h.e = -n3;
        } else {
            object = this.h;
            ((qs)object).b = true;
            ((qs)object).k.add(qg2.U.i.i);
            this.d.U.i.i.j.add(this.h);
        }
        this.g(this.d.i.h);
        this.g(this.d.i.i);
    }

    @Override
    public final void c() {
        qg qg2 = this.d;
        if (((qj)qg2).ar == 1) {
            qg2.Z = this.h.f;
            return;
        }
        qg2.aa = this.h.f;
    }

    @Override
    public final void d() {
        this.h.b();
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final void f() {
        qs qs2 = this.h;
        if (qs2.c && !qs2.i) {
            qs2 = (qs)qs2.k.get(0);
            qj qj2 = (qj)this.d;
            float f2 = qs2.f;
            float f3 = qj2.a;
            this.h.c((int)(f2 * f3 + 0.5f));
        }
    }
}

