/*
 * Decompiled with CFR 0.152.
 */
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public final class dem {
    public ded a;
    public String b;
    public String c;
    private String d;
    private long e;
    private long f;
    private int g;
    private int h;
    private gzs i;
    private gzx j;
    private gzs k;
    private gzx l;
    private boolean m;
    private Date n;
    private gzy o;
    private hac p;
    private byte q;

    public dem() {
    }

    public dem(den den2) {
        den2 = (def)den2;
        this.a = ((def)den2).a;
        this.d = ((def)den2).b;
        this.b = ((def)den2).c;
        this.e = ((def)den2).d;
        this.f = ((def)den2).e;
        this.g = ((def)den2).f;
        this.h = ((def)den2).g;
        this.j = ((def)den2).h;
        this.l = ((def)den2).i;
        this.c = ((def)den2).j;
        this.m = ((def)den2).k;
        this.n = ((def)den2).l;
        this.p = ((def)den2).m;
        this.q = (byte)31;
    }

    public final den a() {
        int n2;
        Object object = this.i;
        if (object != null) {
            this.j = ((gzs)object).g();
        } else if (this.j == null) {
            n2 = gzx.d;
            this.j = hct.a;
        }
        object = this.k;
        if (object != null) {
            this.l = ((gzs)object).g();
        } else if (this.l == null) {
            n2 = gzx.d;
            this.l = hct.a;
        }
        object = this.o;
        if (object != null) {
            this.p = ((gzy)object).b();
        } else if (this.p == null) {
            this.p = hcy.a;
        }
        if (this.q == 31 && this.d != null && this.b != null && this.n != null) {
            object = new def(this.a, this.d, this.b, this.e, this.f, this.g, this.h, this.j, this.l, this.c, this.m, this.n, this.p);
            dcv.d(((def)object).g);
            dcv.d(((def)object).f);
            dde.e(((def)object).b);
            dde.e(((def)object).c);
            dde.f(((def)object).j);
            dec.o("compressedSize", ((def)object).e);
            dec.o("size", ((def)object).d);
            return object;
        }
        object = new StringBuilder();
        if (this.d == null) {
            ((StringBuilder)object).append(" namespace");
        }
        if (this.b == null) {
            ((StringBuilder)object).append(" name");
        }
        if ((this.q & 1) == 0) {
            ((StringBuilder)object).append(" size");
        }
        if ((this.q & 2) == 0) {
            ((StringBuilder)object).append(" compressedSize");
        }
        if ((this.q & 4) == 0) {
            ((StringBuilder)object).append(" gcPriority");
        }
        if ((this.q & 8) == 0) {
            ((StringBuilder)object).append(" downloadPriority");
        }
        if ((this.q & 0x10) == 0) {
            ((StringBuilder)object).append(" verifySizes");
        }
        if (this.n == null) {
            ((StringBuilder)object).append(" expiryDate");
        }
        throw new IllegalStateException("Missing required properties:".concat(object.toString()));
    }

    public final gzs b() {
        if (this.k == null) {
            if (this.l == null) {
                this.k = new gzs();
            } else {
                gzs gzs2;
                this.k = gzs2 = new gzs();
                gzs2.j(this.l);
                this.l = null;
            }
        }
        return this.k;
    }

    public final gzy c() {
        if (this.o == null) {
            if (this.p == null) {
                this.o = new gzy();
            } else {
                gzy gzy2;
                this.o = gzy2 = new gzy();
                gzy2.g(this.p);
                this.p = null;
            }
        }
        return this.o;
    }

    public final void d(String string) {
        if (this.i == null) {
            if (this.j == null) {
                this.i = new gzs();
            } else {
                gzs gzs2;
                this.i = gzs2 = new gzs();
                gzs2.j(this.j);
                this.j = null;
            }
        }
        this.i.h(string);
    }

    public final void e(String string, Object object) {
        this.c().d(string, object);
    }

    public final void f(List list) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            dde.f((String)iterator.next());
        }
        this.b().j(list);
    }

    public final void g(long l2) {
        this.f = l2;
        this.q = (byte)(this.q | 2);
    }

    public final void h(int n2) {
        this.h = n2;
        this.q = (byte)(this.q | 8);
    }

    public final void i(Date date) {
        if (date != null) {
            this.n = date;
            return;
        }
        throw new NullPointerException("Null expiryDate");
    }

    public final void j(int n2) {
        this.g = n2;
        this.q = (byte)(this.q | 4);
    }

    public final void k(String string) {
        if (string != null) {
            this.b = string;
            return;
        }
        throw new NullPointerException("Null name");
    }

    public final void l(String string) {
        if (string != null) {
            this.d = string;
            return;
        }
        throw new NullPointerException("Null namespace");
    }

    public final void m(long l2) {
        this.e = l2;
        this.q = (byte)(this.q | 1);
    }

    public final void n(boolean bl2) {
        this.m = bl2;
        this.q = (byte)(this.q | 0x10);
    }
}

