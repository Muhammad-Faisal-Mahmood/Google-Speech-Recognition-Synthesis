/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Executor;

public final class cwm
implements cwk {
    public final cxa a;
    public final Executor b;
    private final cxm c;
    private final cxa d;
    private final Uri e;
    private final Uri f;
    private final cyu g;
    private final cxt h;
    private final bmu i;

    public cwm(cyu cyu2, cxm cxm2, cxa cxa2, cxa cxa3, Uri uri, Uri uri2, cxt cxt2, bmu bmu2, Executor executor) {
        this.g = cyu2;
        this.c = cxm2;
        this.d = cxa3;
        this.a = cxa2;
        this.e = uri;
        this.f = uri2;
        this.h = cxt2;
        this.i = bmu2;
        this.b = executor;
    }

    private static hpn q() {
        return hhk.J(new IllegalStateException("Migration flag had unexpected state"));
    }

    private final void r(Uri uri) {
        if (this.i.B(uri)) {
            this.i.z(uri);
        }
    }

    @Override
    public final hpn a(cth cth2) {
        int n2 = this.h.a().ordinal();
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    return cwm.q();
                }
                return this.d.a(cth2);
            }
            return fxf.ak(this.n(this.c.a(cth2)), new cwl((Object)this, cth2, 8), this.b);
        }
        return this.c.a(cth2);
    }

    @Override
    public final hpn b() {
        int n2 = this.h.a().ordinal();
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    return cwm.q();
                }
                return this.d.b();
            }
            return fxf.ak(this.n(this.c.b()), new cvv(this, 13), this.b);
        }
        return this.c.b();
    }

    @Override
    public final hpn c() {
        aog aog2 = new aog(17);
        int n2 = this.h.a().ordinal();
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    return cwm.q();
                }
                return this.d.c();
            }
            return fxf.ak(this.n(this.c.c()), new cvy((Object)this, aog2, 14), this.b);
        }
        return this.c.c();
    }

    @Override
    public final hpn d() {
        aog aog2 = new aog(16);
        int n2 = this.h.a().ordinal();
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    return cwm.q();
                }
                return this.d.d();
            }
            return fxf.ak(this.n(this.c.d()), new cwl((Object)this, aog2, 4), this.b);
        }
        return this.c.d();
    }

    @Override
    public final hpn e() {
        int n2 = this.h.a().ordinal();
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    return cwm.q();
                }
                return this.d.e();
            }
            return fxf.ak(this.n(this.c.e()), new cvv(this, 15), this.b);
        }
        return this.c.e();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn f() {
        int n2 = this.h.a().ordinal();
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    return cwm.q();
                }
                try {
                    this.r(this.e);
                    return hpj.a;
                }
                catch (IOException iOException) {
                    return hhk.J(iOException);
                }
            }
            try {
                this.r(this.f);
                return hpj.a;
            }
            catch (IOException iOException) {
                return hhk.J(iOException);
            }
        }
        try {
            this.r(this.e);
        }
        catch (Throwable throwable) {
            this.r(this.f);
            throw throwable;
        }
        try {
            this.r(this.f);
            return hpj.a;
        }
        catch (IOException iOException) {
            return hhk.J(iOException);
        }
    }

    @Override
    public final hpn g(ctq ctq2) {
        int n2 = this.h.a().ordinal();
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    return cwm.q();
                }
                return this.d.g(ctq2);
            }
            return fxf.ak(this.n(this.c.g(ctq2)), new cwl((Object)this, ctq2, 7), this.b);
        }
        return this.c.g(ctq2);
    }

    @Override
    public final hpn h(ctq ctq2) {
        int n2 = this.h.a().ordinal();
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    return cwm.q();
                }
                return this.d.h(ctq2);
            }
            return fxf.ak(this.n(this.c.h(ctq2)), new cwl((Object)this, ctq2, 2), this.b);
        }
        return this.c.h(ctq2);
    }

    @Override
    public final hpn i(ctq ctq2) {
        int n2 = this.h.a().ordinal();
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    return cwm.q();
                }
                return this.d.i(ctq2);
            }
            return fxf.ak(this.n(this.c.i(ctq2)), new cwl((Object)this, ctq2, 0), this.b);
        }
        return this.c.i(ctq2);
    }

    @Override
    public final hpn j(List list) {
        int n2 = this.h.a().ordinal();
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    return cwm.q();
                }
                return this.d.j(list);
            }
            return fxf.ak(this.n(this.c.j(list)), new cwl((Object)this, list, 5), this.b);
        }
        return this.c.j(list);
    }

    @Override
    public final hpn k() {
        int n2 = this.h.a().ordinal();
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    return cwm.q();
                }
                return this.d.k();
            }
            return fxf.ak(this.n(this.c.k()), new cvv(this, 14), this.b);
        }
        return this.c.k();
    }

    @Override
    public final hpn l(ctq ctq2, cth cth2) {
        int n2 = this.h.a().ordinal();
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    return cwm.q();
                }
                return this.d.l(ctq2, cth2);
            }
            return fxf.ak(this.n(this.c.l(ctq2, cth2)), new cwd((Object)this, ctq2, cth2, 14), this.b);
        }
        return this.c.l(ctq2, cth2);
    }

    @Override
    public final hpn m(List list) {
        int n2 = this.h.a().ordinal();
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    return cwm.q();
                }
                return this.d.m(list);
            }
            return fxf.ak(this.n(this.c.m(list)), new cvy((Object)this, list, 18), this.b);
        }
        return this.c.m(list);
    }

    public final hpn n(hpn hpn2) {
        return fxf.ae(fxf.aj(hpn2, new ain(16), this.b), Exception.class, new ain(17), this.b);
    }

    public final hpn o(czp czp2, czp czp3, int n2) {
        int n3 = cqq.q();
        if (cyr.b(n3)) {
            if (czp2.equals(czp3)) {
                this.g.c(1107, n3);
            } else {
                this.g.c(n2, n3);
            }
        }
        if (czp2.a) {
            return hhk.K(czp2.a());
        }
        return hhk.J((Throwable)czp2.b());
    }

    public final hpn p(czp object, czp czp2, Comparator comparator, int n2) {
        int n3 = cqq.q();
        if (cyr.b(n3)) {
            if (czp.d((czp)object, czp2, comparator)) {
                this.g.c(1106, n3);
            } else {
                this.g.c(n2, n3);
            }
        }
        if (((czp)object).a) {
            object = (List)((czp)object).a();
            fxf.K(object);
            object = hhk.K(object);
        } else {
            object = ((czp)object).b();
            fxf.K(object);
            object = hhk.J((Throwable)object);
        }
        return object;
    }
}

