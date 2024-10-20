/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.net.Uri
 */
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class cwj {
    public final Context a;
    public final cuv b;
    public final cwk c;
    public final gto d;
    public final Executor e;
    public final gto f;
    public final gto g;
    public final cyj h;
    public final cyu i;
    public final egg j;
    public final bzo k = new bzo(null);
    public final cqq l;
    public final bmu m;
    private final Executor n;

    public cwj(Context context, cyu cyu2, cuv cuv2, cwk cwk2, egg egg2, cqq cqq2, gto gto2, Executor executor, gto gto3, bmu bmu2, gto gto4, cyj cyj2, Executor executor2) {
        this.a = context;
        this.i = cyu2;
        this.b = cuv2;
        this.c = cwk2;
        this.j = egg2;
        this.l = cqq2;
        this.d = gto2;
        this.e = executor;
        this.n = executor2;
        this.f = gto3;
        this.m = bmu2;
        this.g = gto4;
        this.h = cyj2;
    }

    public static void A(cyu cyu2, cth hwv2, ctf object, int n2) {
        hwp hwp2 = hlt.a.l();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        Object object2 = (hlt)hwp2.b;
        ((hlt)object2).c = hhk.aA(n2);
        ((hlt)object2).b |= 1;
        String string = ((cth)hwv2).d;
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        hwv hwv3 = hwp2.b;
        object2 = (hlt)hwv3;
        string.getClass();
        ((hlt)object2).b |= 2;
        ((hlt)object2).d = string;
        n2 = ((cth)hwv2).f;
        if (!hwv3.B()) {
            hwp2.u();
        }
        hwv3 = hwp2.b;
        object2 = (hlt)hwv3;
        ((hlt)object2).b |= 4;
        ((hlt)object2).e = n2;
        long l2 = ((cth)hwv2).s;
        if (!hwv3.B()) {
            hwp2.u();
        }
        hwv3 = hwp2.b;
        object2 = (hlt)hwv3;
        ((hlt)object2).b |= 0x80;
        ((hlt)object2).i = l2;
        object2 = ((cth)hwv2).t;
        if (!hwv3.B()) {
            hwp2.u();
        }
        hwv2 = hwp2.b;
        hwv3 = (hlt)hwv2;
        object2.getClass();
        ((hlt)hwv3).b |= 0x100;
        ((hlt)hwv3).j = object2;
        object = ((ctf)object).c;
        if (!hwv2.B()) {
            hwp2.u();
        }
        hwv2 = (hlt)hwp2.b;
        object.getClass();
        ((hlt)hwv2).b |= 8;
        ((hlt)hwv2).f = object;
        cyu2.a((hlt)hwp2.o());
    }

    public static gto a(cth hwv2, cth hwv3) {
        if (((cth)hwv3).s == hwv2.s) {
            if (((cth)hwv3).t.equals(hwv2.t)) {
                if (((cth)hwv3).f != hwv2.f) {
                    return gto.i(hmh.e);
                }
                if (cwj.s(hwv2, (cth)hwv3)) {
                    if (((cth)hwv3).k == hwv2.k) {
                        if (((cth)hwv3).l == hwv2.l) {
                            ctj ctj2;
                            ctj ctj3;
                            hwv hwv4 = ctj3 = ((cth)hwv3).m;
                            if (ctj3 == null) {
                                hwv4 = ctj.a;
                            }
                            ctj3 = ctj2 = hwv2.m;
                            if (ctj2 == null) {
                                ctj3 = ctj.a;
                            }
                            if (hwv4.equals(ctj3)) {
                                int n2;
                                int n3 = a.t(((cth)hwv3).j);
                                int n4 = 1;
                                int n5 = n3;
                                if (n3 == 0) {
                                    n5 = 1;
                                }
                                n3 = n2 = a.t(hwv2.j);
                                if (n2 == 0) {
                                    n3 = 1;
                                }
                                if (n5 == n3) {
                                    n5 = n3 = cqq.y(((cth)hwv3).r);
                                    if (n3 == 0) {
                                        n5 = 1;
                                    }
                                    if ((n3 = cqq.y(hwv2.r)) == 0) {
                                        n3 = n4;
                                    }
                                    if (n5 == n3) {
                                        hwv4 = ((cth)hwv3).v;
                                        hwv3 = hwv4;
                                        if (hwv4 == null) {
                                            hwv3 = kfr.a;
                                        }
                                        hwv4 = hwv2.v;
                                        hwv2 = hwv4;
                                        if (hwv4 == null) {
                                            hwv2 = kfr.a;
                                        }
                                        if (!hwv3.equals(hwv2)) {
                                            return gto.i(hmh.l);
                                        }
                                        return gsl.a;
                                    }
                                    return gto.i(hmh.k);
                                }
                                return gto.i(hmh.j);
                            }
                            return gto.i(hmh.i);
                        }
                        return gto.i(hmh.h);
                    }
                    return gto.i(hmh.g);
                }
                return gto.i(hmh.f);
            }
            return gto.i(hmh.d);
        }
        return gto.i(hmh.c);
    }

    public static boolean s(cth cth2, cth cth3) {
        return cth2.o.equals(cth3.o);
    }

    public static boolean u(ctv ctv2, long l2) {
        return l2 > ctv2.f;
    }

    public static final void v(List object, ctq ctq2) {
        cyr.i("%s downloadFileGroup %s %s can't finish!", "FileGroupManager", ctq2.c, ctq2.d);
        csi.b((Collection)object, ctq2.c);
        cyr.g("%s: An unknown error has occurred during download", "FileGroupManager");
        object = css.a();
        ((kqr)object).b = csr.c;
        throw ((kqr)object).a();
    }

    public static void z(int n2, cyu cyu2, cth cth2) {
        cyu2.e(n2, cth2.d, cth2.f, cth2.s, cth2.t);
    }

    final hpn B(ctq hyg2, cth cth2, hny hny2, bzo bzo2) {
        cyr.e("%s: Verify group: %s, remove pending version: %s", "FileGroupManager", cth2.d, true);
        hyg hyg3 = (hwp)((hwv)hyg2).C(5);
        ((hwp)hyg3).x((hwv)hyg2);
        if (!((hwp)hyg3).b.B()) {
            ((hwp)hyg3).u();
        }
        ctq ctq2 = (ctq)((hwp)hyg3).b;
        ctq ctq3 = ctq.a;
        ctq2.b |= 8;
        ctq2.f = true;
        ctq3 = (ctq)((hwp)hyg3).o();
        hyg3 = (hwp)((hwv)hyg2).C(5);
        ((hwp)hyg3).x((hwv)hyg2);
        if (!((hwp)hyg3).b.B()) {
            ((hwp)hyg3).u();
        }
        hyg2 = (ctq)((hwp)hyg3).b;
        ((ctq)hyg2).b |= 8;
        ((ctq)hyg2).f = false;
        ctq2 = (ctq)((hwp)hyg3).o();
        hyg2 = hyg3 = cth2.c;
        if (hyg3 == null) {
            hyg2 = ctg.a;
        }
        boolean bl2 = (((ctg)hyg2).b & 4) != 0;
        long l2 = cqq.x();
        hyg2 = hyg3 = cth2.c;
        if (hyg3 == null) {
            hyg2 = ctg.a;
        }
        hyg3 = (hwp)((hwv)hyg2).C(5);
        ((hwp)hyg3).x((hwv)hyg2);
        if (!((hwp)hyg3).b.B()) {
            ((hwp)hyg3).u();
        }
        hyg2 = (ctg)((hwp)hyg3).b;
        ((ctg)hyg2).b |= 4;
        ((ctg)hyg2).e = l2;
        hyg2 = (ctg)((hwp)hyg3).o();
        hyg3 = (hwp)cth2.C(5);
        ((hwp)hyg3).x(cth2);
        if (!((hwp)hyg3).b.B()) {
            ((hwp)hyg3).u();
        }
        cth cth3 = (cth)((hwp)hyg3).b;
        hyg2.getClass();
        cth3.c = hyg2;
        cth3.b |= 1;
        hyg2 = (cth)((hwp)hyg3).o();
        return dah.e(this.h(cth2)).g(new dgy(this, bzo2, cth2, ctq2, hny2, ctq3, (cth)hyg2, bl2, 1), this.e).g(new cvy((Object)this, cth2, 7), this.e);
    }

    public final hac b(cth object) {
        gzy gzy2 = new gzy();
        Uri uri = cqq.X(this.a, this.f, (cth)object);
        for (ctf ctf2 : ((cth)object).o) {
            gzy2.d(ctf2, cqq.W(uri, ctf2));
        }
        return gzy2.a();
    }

    public final hac c(hac hac2, hac hac3) {
        gzy gzy2 = new gzy();
        hdx hdx2 = hac3.k().k();
        while (hdx2.hasNext()) {
            Map.Entry entry = (Map.Entry)hdx2.next();
            if (entry.getValue() == null || !hac2.containsKey(entry.getKey())) continue;
            hac3 = (Uri)hac2.get(entry.getKey());
            Uri uri = (Uri)entry.getValue();
            try {
                Uri uri2 = czt.a(this.a, (Uri)hac3);
                if (this.m.B((Uri)hac3) && uri2.toString().equals(uri.toString())) {
                    gzy2.d((ctf)entry.getKey(), hac3);
                    continue;
                }
                cyr.i("%s verifyIsolatedFileUris unable to get isolated file uri! %s %s", "FileGroupManager", hac3, uri);
            }
            catch (IOException iOException) {
                cyr.i("%s verifyIsolatedFileUris unable to get isolated file uri! %s %s", "FileGroupManager", hac3, uri);
            }
        }
        return gzy2.a();
    }

    public final hpn d(cth object) {
        Object object2;
        block3: {
            if (!((cth)object).n) {
                return hpj.a;
            }
            try {
                cqq.ax(this.a, this.f, (cth)object, this.m);
                object2 = ((cth)object).o;
                if (!fvd.L((Iterable)object2, new agx(3)).g()) break block3;
            }
            catch (IOException iOException) {
                object = css.a();
                ((kqr)object).b = csr.N;
                ((kqr)object).c = "Unable to cleanup symlink structure";
                ((kqr)object).d = iOException;
                return hhk.J(((kqr)object).a());
            }
            return hhk.J(new UnsupportedOperationException("Preserve File Paths is invalid with Android Blob Sharing"));
        }
        hac hac2 = this.b((cth)object);
        object2 = fxf.ak(this.k((cth)object), new btb(this, (List)object2, hac2, 13), this.e);
        fxf.al((hpn)object2, new ena(this, object, 1), this.e);
        return object2;
    }

    public final hpn e(ctq ctq2, ctj ctj2, hny hny2) {
        AtomicReference atomicReference = new AtomicReference();
        return fxf.af(this.q(this.g(ctq2, false), new cvu(this, ctq2, atomicReference, ctj2, hny2, 1)), Exception.class, new btb((Object)this, atomicReference, (Object)ctq2, 12), this.e);
    }

    public final hpn f(ctv ctv2, ctf ctf2, cth cth2) {
        if (!ctv2.e) {
            if (ctf2.o.isEmpty()) {
                return hhk.K((Object)cwh.c);
            }
            ctv2 = this.a;
            String string = ctf2.o;
            bmu bmu2 = this.m;
            Executor executor = this.n;
            return this.p(fxf.ai(new czk((Context)ctv2, string, bmu2, ctf2, cth2), executor), new ain(14));
        }
        return hhk.K((Object)cwh.b);
    }

    public final hpn g(ctq ctq2, boolean bl2) {
        hwp hwp2 = (hwp)ctq2.C(5);
        hwp2.x(ctq2);
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        ctq ctq3 = (ctq)hwp2.b;
        ctq2 = ctq.a;
        ctq3.b |= 8;
        ctq3.f = bl2;
        ctq2 = (ctq)hwp2.o();
        return this.c.g(ctq2);
    }

    public final hpn h(cth cth2) {
        return this.i(cth2, false, false, 0, cth2.o.size());
    }

    public final hpn i(cth cth2, boolean bl2, boolean bl3, int n2, int n3) {
        if (n2 < n3) {
            ctf ctf2 = (ctf)cth2.o.get(n2);
            if (cqq.ae(ctf2)) {
                return this.i(cth2, bl2, bl3, n2 + 1, n3);
            }
            return dah.e(this.j(ctf2, cth2)).g(new cwg(this, ctf2, cth2, bl2, bl3, n2, n3), this.e);
        }
        if (bl2) {
            return hhk.K((Object)cwi.c);
        }
        if (bl3) {
            return hhk.K((Object)cwi.a);
        }
        return hhk.K((Object)cwi.b);
    }

    public final hpn j(ctf object, cth cth2) {
        int n2;
        int n3 = n2 = a.t(cth2.j);
        if (n2 == 0) {
            n3 = 1;
        }
        ctt ctt2 = crh.l((ctf)object, n3);
        object = this.j;
        return dah.e(fxf.ak(((egg)object).o(ctt2), new buf(12), (Executor)((egg)object).a)).d(cxk.class, new bpu(this, cth2, 18, null), this.e);
    }

    final hpn k(cth object) {
        gzy gzy2 = new gzy();
        gzy gzy3 = new gzy();
        for (ctf ctf2 : ((cth)object).o) {
            int n2;
            if (cqq.ae(ctf2)) {
                gzy2.d(ctf2, Uri.parse((String)ctf2.d));
                continue;
            }
            int n3 = n2 = a.t(((cth)object).j);
            if (n2 == 0) {
                n3 = 1;
            }
            gzy3.d(ctf2, crh.l(ctf2, n3));
        }
        object = gzy3.a();
        return dah.e(this.j.n(hav.n(((hac)object).g()))).f(new bte(object, gzy2, 6, null), this.e);
    }

    public final hpn l(cth cth2, ctf ctf2, ctt ctt2) {
        return fxf.af(this.j.o(ctt2), cxk.class, new cvq(this, ctt2, cth2, ctf2, 9), this.e);
    }

    public final hpn m(hny hny2) {
        ArrayList arrayList = new ArrayList();
        return this.q(this.c.d(), new cwd(this, arrayList, hny2, 5));
    }

    public final hpn n(ctq ctq2, css css2, long l2, String object) {
        hwp hwp2 = hlq.a.l();
        Object object2 = ctq2.c;
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        Object object3 = hwp2.b;
        hwv hwv2 = (hlq)object3;
        object2.getClass();
        ((hlq)hwv2).b |= 1;
        ((hlq)hwv2).c = object2;
        object2 = ctq2.d;
        if (!((hwv)object3).B()) {
            hwp2.u();
        }
        hwv2 = hwp2.b;
        object3 = hwv2;
        object2.getClass();
        ((hlq)object3).b |= 4;
        ((hlq)object3).e = object2;
        if (!hwv2.B()) {
            hwp2.u();
        }
        object2 = hwp2.b;
        object3 = (hlq)object2;
        ((hlq)object3).b |= 0x40;
        ((hlq)object3).i = l2;
        if (!((hwv)object2).B()) {
            hwp2.u();
        }
        object3 = (hlq)hwp2.b;
        object.getClass();
        ((hlq)object3).b |= 0x80;
        ((hlq)object3).j = object;
        object3 = this.c;
        object = (hwp)ctq2.C(5);
        ((hwp)object).x(ctq2);
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        ctq2 = (ctq)((hwp)object).b;
        ctq2.b |= 8;
        ctq2.f = false;
        return this.q(object3.g((ctq)((hwp)object).o()), new btb((Object)this, hwp2, (Object)css2, 19));
    }

    public final hpn o(cth cth2, int n2, int n3) {
        int n4 = 1;
        if (n2 < n3) {
            hwv hwv2 = (ctf)cth2.o.get(n2);
            if (!cqq.ae(hwv2)) {
                int n5 = a.t(cth2.j);
                if (n5 != 0) {
                    n4 = n5;
                }
                hwv2 = crh.l(hwv2, n4);
                egg egg2 = this.j;
                return this.q(fxf.ak(egg2.f.e((ctt)hwv2), new cww(egg2, hwv2, 8, null), (Executor)egg2.a), new cyt(this, cth2, n2, n3, 1));
            }
            return this.o(cth2, n2 + 1, n3);
        }
        return hhk.K(true);
    }

    public final hpn p(hpn hpn2, gte gte2) {
        return fxf.aj(hpn2, gte2, this.e);
    }

    public final hpn q(hpn hpn2, hny hny2) {
        return fxf.ak(hpn2, hny2, this.e);
    }

    public final hpn r(cth cth2, ctf ctf2, ctt ctt2, long l2) {
        egg egg2 = this.j;
        return this.q(fxf.ak(egg2.o(ctt2), new cxg(egg2, l2, ctt2), (Executor)egg2.a), new btb(this, ctf2, cth2, 10));
    }

    public final boolean t(String string) {
        try {
            this.a.getPackageManager().getApplicationInfo(string, 0);
            return true;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return false;
        }
    }

    public final hpn w(cth cth2, ctf ctf2, ctt ctt2, ctv ctv2, int n2) {
        return this.q(this.y(cth2, ctf2, ctv2, ctt2, ctf2.o, cth2.l, n2), new cwe(this, n2, cth2, ctf2, ctt2, 0));
    }

    public final hpn x(cth cth2, ctf ctf2, ctt ctt2, ctv ctv2, int n2) {
        Uri uri;
        int n3;
        String string = ctf2.o;
        long l2 = cth2.l;
        int n4 = n3 = a.t(ctt2.f);
        if (n3 == 0) {
            n4 = 1;
        }
        if ((uri = crh.f(this.a, n4, ctv2.c, ctf2.g, this.b, this.f, false)) != null) {
            Context context = this.a;
            bmu bmu2 = this.m;
            Executor executor = this.n;
            return dah.e(fxf.ai(new czj(context, string, bmu2, uri, ctf2, cth2, 0), executor)).g(new cvz(this, cth2, ctf2, ctv2, ctt2, string, l2, n2), this.e);
        }
        cyr.g("%s: Failed to get file uri!", "FileGroupManager");
        throw new czl(28, "Failed to get local file uri");
    }

    final hpn y(cth cth2, ctf ctf2, ctv object, ctt ctt2, String string, long l2, int n2) {
        if (((ctv)object).e && !cwj.u((ctv)object, l2)) {
            cwj.A(this.i, cth2, ctf2, n2);
            return hhk.K(true);
        }
        l2 = Math.max(l2, ((ctv)object).f);
        Context context = this.a;
        bmu bmu2 = this.m;
        object = this.n;
        return this.q(fxf.ai(new czi(context, string, l2, bmu2, ctf2, cth2), (Executor)object), new cvs(this, ctt2, string, l2, ctf2, cth2, n2));
    }
}

