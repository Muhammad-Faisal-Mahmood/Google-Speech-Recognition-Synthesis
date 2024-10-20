/*
 * Decompiled with CFR 0.152.
 */
public class xf {
    private final xn a;
    tg[] b;

    public xf() {
        this(new xn());
    }

    public xf(xn xn2) {
        this.a = xn2;
    }

    public xn a() {
        this.h();
        return this.a;
    }

    public void b(tg tg2) {
    }

    public void c(tg tg2) {
    }

    public void d(tg tg2) {
    }

    public void e(tg tg2) {
    }

    public void f(tg tg2) {
    }

    public void g(int n2, tg tg2) {
        int n3;
        tg[] tgArray = this.b;
        int n4 = n3 = 1;
        if (tgArray == null) {
            this.b = new tg[9];
            n4 = n3;
        }
        while (n4 <= 256) {
            if ((n2 & n4) != 0) {
                this.b[wc.c((int)n4)] = tg2;
            }
            n4 += n4;
        }
    }

    protected final void h() {
        Object object = this.b;
        if (object != null) {
            tg tg2 = object[wc.c(1)];
            tg tg3 = this.b[wc.c(2)];
            object = tg3;
            if (tg3 == null) {
                object = this.a.f(2);
            }
            tg3 = tg2;
            if (tg2 == null) {
                tg3 = this.a.f(1);
            }
            this.c(tg.b(tg3, (tg)object));
            object = this.b[wc.c(16)];
            if (object != null) {
                this.e((tg)object);
            }
            if ((object = this.b[wc.c(32)]) != null) {
                this.d((tg)object);
            }
            if ((object = this.b[wc.c(64)]) != null) {
                this.f((tg)object);
            }
        }
    }
}

