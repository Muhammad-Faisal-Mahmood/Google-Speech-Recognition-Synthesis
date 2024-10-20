/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import java.io.IOException;
import java.util.concurrent.Executor;

public final class cwo
implements cxl {
    public final cxo a;
    public final cxd b;
    public final Executor c;
    public final cyu d;
    private final cxd e;
    private final Uri f;
    private final Uri g;
    private final cxt h;
    private final bmu i;

    public cwo(cyu cyu2, cxo cxo2, cxd cxd2, cxd cxd3, Uri uri, Uri uri2, cxt cxt2, bmu bmu2, Executor executor) {
        this.d = cyu2;
        this.a = cxo2;
        this.b = cxd2;
        this.e = cxd3;
        this.f = uri;
        this.g = uri2;
        this.h = cxt2;
        this.i = bmu2;
        this.c = executor;
    }

    private static hpn j() {
        return hhk.J(new IllegalStateException("Migration flag had unexpected state"));
    }

    private final void k(Uri uri) {
        if (this.i.B(uri)) {
            this.i.z(uri);
        }
    }

    @Override
    public final hpn a() {
        int n2 = this.h.a().ordinal();
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    return cwo.j();
                }
                return this.e.a();
            }
            return fxf.ak(this.b(this.a.a()), new cvv(this, 17), this.c);
        }
        return this.a.a();
    }

    public final hpn b(hpn hpn2) {
        return fxf.ae(fxf.aj(hpn2, new ain(18), this.c), Exception.class, new ain(19), this.c);
    }

    @Override
    public final hpn c() {
        aog aog2 = new aog(18);
        int n2 = this.h.a().ordinal();
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    return cwo.j();
                }
                return this.e.c();
            }
            return fxf.ak(this.b(this.a.c()), new cwl((Object)this, aog2, 18), this.c);
        }
        return this.a.c();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn d() {
        int n2 = this.h.a().ordinal();
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    return cwo.j();
                }
                try {
                    this.k(this.f);
                    return this.e.d();
                }
                catch (IOException iOException) {
                    return hhk.J(iOException);
                }
            }
            try {
                this.k(this.g);
            }
            catch (IOException iOException) {
                return hhk.J(iOException);
            }
            return fxf.ak(this.a.d(), new cvv(this, 16), this.c);
        }
        this.k(this.f);
        this.k(this.g);
        return this.a.d();
        {
            catch (IOException iOException) {
                return hhk.J(iOException);
            }
        }
        catch (Throwable throwable) {
            this.k(this.g);
            throw throwable;
        }
    }

    @Override
    public final hpn e(ctt ctt2) {
        int n2 = this.h.a().ordinal();
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    return cwo.j();
                }
                return this.e.e(ctt2);
            }
            return fxf.ak(this.b(this.a.e(ctt2)), new cwl((Object)this, ctt2, 12), this.c);
        }
        return this.a.e(ctt2);
    }

    @Override
    public final hpn f(hav hav2) {
        int n2 = this.h.a().ordinal();
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    return cwo.j();
                }
                return this.e.f(hav2);
            }
            return fxf.ak(this.b(this.a.f(hav2)), new cwl((Object)this, hav2, 14), this.c);
        }
        return this.a.f(hav2);
    }

    @Override
    public final hpn g(ctt ctt2) {
        int n2 = this.h.a().ordinal();
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    return cwo.j();
                }
                return this.e.g(ctt2);
            }
            return fxf.ak(this.b(this.a.g(ctt2)), new cwl((Object)this, ctt2, 16), this.c);
        }
        return this.a.g(ctt2);
    }

    @Override
    public final hpn h(ctt ctt2, ctv ctv2) {
        int n2 = this.h.a().ordinal();
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    return cwo.j();
                }
                return this.e.h(ctt2, ctv2);
            }
            return fxf.ak(this.b(this.a.h(ctt2, ctv2)), new cwd((Object)this, (hwv)ctt2, ctv2, 18), this.c);
        }
        return this.a.h(ctt2, ctv2);
    }

    public final hpn i(czp czp2, czp czp3, int n2) {
        int n3 = cqq.q();
        if (cyr.b(n3)) {
            if (czp2.equals(czp3)) {
                this.d.c(1106, n3);
            } else {
                this.d.c(n2, n3);
            }
        }
        if (czp2.a) {
            return hhk.K(czp2.a());
        }
        return hhk.J((Throwable)czp2.b());
    }
}

