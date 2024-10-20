/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  hom
 */
import android.content.Context;
import android.net.Uri;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

public final class cuq
implements cty {
    public final Context a;
    public final gto b;
    public final cwz c;
    public final Executor d;
    public final gto e;
    public final gto f;
    public final hny g;
    public final cyu h;
    public final czh i;
    public final czh j;
    public final bmu k;
    private final List l;
    private final bzo m = new bzo(null);
    private final bmu n;

    public cuq(Context context, cyu cyu2, cwz cwz2, Executor executor, List list, gto gto2, bmu bmu2, gto gto3, gto gto4, bmu bmu3) {
        this.a = context;
        this.h = cyu2;
        this.l = list;
        this.b = gto2;
        this.d = executor;
        this.c = cwz2;
        this.k = bmu2;
        this.e = gto3;
        this.f = gto4;
        this.n = bmu3;
        this.g = new buf(5);
        this.j = czh.k(executor);
        this.i = new czh(executor, new czw(gto4, context, 1));
    }

    public static csf j(String object, int n2, int n3, String string, hvi hvi2, boolean bl2) {
        hwp hwp2 = csf.a.l();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        hwv hwv2 = hwp2.b;
        csf csf2 = (csf)hwv2;
        object.getClass();
        csf2.b |= 1;
        csf2.c = object;
        if (!hwv2.B()) {
            hwp2.u();
        }
        hwv2 = hwp2.b;
        object = (csf)hwv2;
        ((csf)object).b |= 4;
        ((csf)object).e = n2;
        if (!hwv2.B()) {
            hwp2.u();
        }
        object = hwp2.b;
        hwv2 = (csf)object;
        ((csf)hwv2).b |= 0x20;
        ((csf)hwv2).h = bl2;
        if (n3 > 0) {
            if (!((hwv)object).B()) {
                hwp2.u();
            }
            object = (csf)hwp2.b;
            ((csf)object).b |= 8;
            ((csf)object).f = n3;
        }
        if (string != null) {
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object = (csf)hwp2.b;
            ((csf)object).b |= 2;
            ((csf)object).d = string;
        }
        if (hvi2 != null) {
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object = (csf)hwp2.b;
            ((csf)object).g = hvi2;
            ((csf)object).b |= 0x10;
        }
        return (csf)hwp2.o();
    }

    public static hlq k(csg hwv2) {
        hwp hwp2 = hlq.a.l();
        Object object = hwv2.c;
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        hwv hwv3 = hwp2.b;
        hwv hwv4 = (hlq)hwv3;
        object.getClass();
        ((hlq)hwv4).b |= 1;
        ((hlq)hwv4).c = object;
        object = hwv2.d;
        if (!hwv3.B()) {
            hwp2.u();
        }
        hwv3 = hwp2.b;
        hwv4 = (hlq)hwv3;
        object.getClass();
        ((hlq)hwv4).b |= 4;
        ((hlq)hwv4).e = object;
        int n2 = hwv2.f;
        if (!hwv3.B()) {
            hwp2.u();
        }
        object = (hlq)hwp2.b;
        ((hlq)object).b |= 2;
        ((hlq)object).d = n2;
        n2 = hwv2.h.size();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        hwv3 = hwp2.b;
        object = (hlq)hwv3;
        ((hlq)object).b |= 8;
        ((hlq)object).f = n2;
        object = hwv2.j;
        if (!hwv3.B()) {
            hwp2.u();
        }
        hwv3 = hwv4 = hwp2.b;
        object.getClass();
        ((hlq)hwv3).b |= 0x80;
        ((hlq)hwv3).j = object;
        long l2 = hwv2.i;
        if (!hwv4.B()) {
            hwp2.u();
        }
        hwv2 = (hlq)hwp2.b;
        ((hlq)hwv2).b |= 0x40;
        ((hlq)hwv2).i = l2;
        return (hlq)hwp2.o();
    }

    public static gto o(ctq object, cth cth2) {
        object = cqq.k() ? ((((ctq)object).b & 0x10) != 0 ? gto.i(((ctq)object).g) : gsl.a) : (cth2 != null ? gto.i(cth2.t) : gsl.a);
        return object;
    }

    public static List p(bmu bmu2, Uri object, String string) {
        ArrayList<csf> arrayList = new ArrayList<csf>();
        for (Object object2 : bmu2.v((Uri)object)) {
            if (bmu2.C((Uri)object2)) {
                arrayList.addAll(cuq.p(bmu2, (Uri)object2, string));
                continue;
            }
            Object object3 = object2.getPath();
            if (object3 == null) continue;
            hwp hwp2 = csf.a.l();
            String string2 = ((String)object3).replaceFirst(string, "");
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object3 = (csf)hwp2.b;
            string2.getClass();
            ((csf)object3).b |= 1;
            ((csf)object3).c = string2;
            int n2 = (int)bmu2.u((Uri)object2);
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object3 = (csf)hwp2.b;
            ((csf)object3).b |= 4;
            ((csf)object3).e = n2;
            object2 = object2.toString();
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object3 = (csf)hwp2.b;
            object2.getClass();
            ((csf)object3).b |= 2;
            ((csf)object3).d = object2;
            arrayList.add((csf)hwp2.o());
        }
        return arrayList;
    }

    public static hpn q(cth object, gto object2, String object3, int n2, boolean bl2, boolean bl3, cwz cwz2, Executor executor, bmu bmu2) {
        if (object == null) {
            return hhk.K(null);
        }
        hwp hwp2 = csg.a.l();
        Object object4 = ((cth)object).d;
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        Object object5 = hwp2.b;
        Object object6 = (csg)object5;
        object4.getClass();
        ((csg)object6).b |= 1;
        ((csg)object6).c = object4;
        object6 = ((cth)object).e;
        if (!((hwv)object5).B()) {
            hwp2.u();
        }
        object5 = hwp2.b;
        object4 = (csg)object5;
        object6.getClass();
        ((csg)object4).b |= 2;
        ((csg)object4).d = object6;
        int n3 = ((cth)object).f;
        if (!((hwv)object5).B()) {
            hwp2.u();
        }
        object5 = (csg)hwp2.b;
        ((csg)object5).b |= 8;
        ((csg)object5).f = n3;
        object5 = object6 = ((cth)object).g;
        if (object6 == null) {
            object5 = hvi.a;
        }
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        object6 = hwp2.b;
        object4 = (csg)object6;
        object5.getClass();
        ((csg)object4).l = object5;
        ((csg)object4).b |= 0x80;
        long l2 = ((cth)object).s;
        if (!((hwv)object6).B()) {
            hwp2.u();
        }
        object5 = hwp2.b;
        object6 = (csg)object5;
        ((csg)object6).b |= 0x20;
        ((csg)object6).i = l2;
        if (!((hwv)object5).B()) {
            hwp2.u();
        }
        object6 = hwp2.b;
        object5 = (csg)object6;
        ((csg)object5).g = n2 - 1;
        ((csg)object5).b |= 0x10;
        object5 = ((cth)object).u;
        if (!((hwv)object6).B()) {
            hwp2.u();
        }
        object6 = (csg)hwp2.b;
        object4 = ((csg)object6).k;
        if (!object4.c()) {
            ((csg)object6).k = hwv.s((hxk)object4);
        }
        hvc.g((Iterable)object5, ((csg)object6).k);
        if (((gto)object2).g()) {
            object5 = ((gto)object2).c();
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object2 = (csg)hwp2.b;
            ((csg)object2).b |= 0x40;
            ((csg)object2).j = (String)object5;
        }
        if (object3 != null) {
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object2 = (csg)hwp2.b;
            ((csg)object2).b |= 4;
            ((csg)object2).e = object3;
        }
        if ((((cth)object).b & 0x20) != 0) {
            object2 = object3 = ((cth)object).h;
            if (object3 == null) {
                object2 = hvi.a;
            }
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object3 = (csg)hwp2.b;
            object2.getClass();
            ((csg)object3).m = object2;
            ((csg)object3).b |= 0x100;
        }
        object2 = ((cth)object).o;
        object3 = hpj.a;
        if (n2 != 2) {
            object3 = cwz2.c;
            object = dah.e(hhk.K(((cth)object).o)).f(new brk(object, 18), ((cwj)object3).e);
            object = dah.e(((dah)object).g(new cvv(object3, 6), ((cwj)object3).e).g(new cvv(object, 7), ((cwj)object3).e)).g(new bpu(object2, hwp2, 11, null), executor);
        } else {
            if (((cth)object).n) {
                fxf.q(true);
                object5 = cqq.X(cwz2.b, cwz2.h, (cth)object).toString();
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                object3 = (csg)hwp2.b;
                object5.getClass();
                ((csg)object3).b |= 0x400;
                ((csg)object3).n = object5;
            }
            cyr.d("%s: getDataFileUris %s", "MDDManager", ((cth)object).d);
            boolean bl4 = cqq.ad((cth)object);
            object3 = new gzy();
            if (bl4) {
                ((gzy)object3).g(cwz2.c.b((cth)object));
            }
            object3 = ((gzy)object3).a();
            object = dah.e(dah.e(cwz2.f()).g(new cwy(cwz2, bl4, bl3, (cth)object), cwz2.i).f(new cwr(cwz2, bl4, bl3, (hac)object3), cwz2.i).f(new ain(20), cwz2.i)).g(new cwf((List)object2, bl2, bmu2, hwp2, 1), executor);
        }
        return dah.e((hpn)object).f(new brk(hwp2, 11), executor).b(css.class, new ain(13), executor);
    }

    private final hpn r(boolean bl2) {
        return dah.e(this.n()).g(new cua(this, bl2, 1), this.d).g(new bps(this, 9), this.d).g(new cua(this, bl2, 0), this.d);
    }

    private final void s(int n2, hpn hpn2, long l2, hlq hlq2, cup cup2, cuo cuo2) {
        hpn2.c(gqk.i(new cuf(this, l2, hlq2, hpn2, cuo2, cup2, n2, 1)), (Executor)hom.a);
    }

    @Override
    public final hpn a(csh object) {
        long l2 = cgw.o();
        Object object2 = new ctz(this, object, 5);
        Object object3 = this.d;
        object2 = this.m.g((hnx)object2, (Executor)object3);
        object3 = hlq.a.l();
        Object object4 = ((csh)object).a.c;
        if (!((hwp)object3).b.B()) {
            ((hwp)object3).u();
        }
        hwv hwv2 = ((hwp)object3).b;
        hwv hwv3 = (hlq)hwv2;
        object4.getClass();
        ((hlq)hwv3).b |= 1;
        ((hlq)hwv3).c = object4;
        long l3 = ((csh)object).a.i;
        if (!hwv2.B()) {
            ((hwp)object3).u();
        }
        hwv3 = ((hwp)object3).b;
        object4 = hwv3;
        ((hlq)object4).b |= 0x40;
        ((hlq)object4).i = l3;
        object4 = ((csh)object).a.j;
        if (!hwv3.B()) {
            ((hwp)object3).u();
        }
        hwv3 = ((hwp)object3).b;
        hwv2 = (hlq)hwv3;
        object4.getClass();
        ((hlq)hwv2).b |= 0x80;
        ((hlq)hwv2).j = object4;
        if (!hwv3.B()) {
            ((hwp)object3).u();
        }
        hwv3 = ((hwp)object3).b;
        object4 = (hlq)hwv3;
        ((hlq)object4).b |= 0x20;
        ((hlq)object4).h = false;
        if (!hwv3.B()) {
            ((hwp)object3).u();
        }
        hwv3 = ((hwp)object3).b;
        object4 = (hlq)hwv3;
        ((hlq)object4).b |= 0x100;
        ((hlq)object4).k = false;
        int n2 = ((csh)object).a.e;
        if (!hwv3.B()) {
            ((hwp)object3).u();
        }
        hwv3 = ((hwp)object3).b;
        object4 = (hlq)hwv3;
        ((hlq)object4).b |= 2;
        ((hlq)object4).d = n2;
        object4 = ((csh)object).a.d;
        if (!hwv3.B()) {
            ((hwp)object3).u();
        }
        hwv3 = (hlq)((hwp)object3).b;
        object4.getClass();
        ((hlq)hwv3).b |= 4;
        ((hlq)hwv3).e = object4;
        n2 = ((csh)object).a.h.size();
        if (!((hwp)object3).b.B()) {
            ((hwp)object3).u();
        }
        object = (hlq)((hwp)object3).b;
        ((hlq)object).b |= 8;
        ((hlq)object).f = n2;
        object = (hlq)((hwp)object3).o();
        this.s(3, (hpn)object2, l2, (hlq)object, new cuj((hlq)object), new cuk(0));
        return object2;
    }

    @Override
    public final hpn b(csu csu2) {
        return fxf.ai(new ctz(this, csu2, 0), this.d);
    }

    @Override
    public final hpn c(csu object) {
        cyr.c("%s: downloadFileGroupWithForegroundService start.", "MobileDataDownload");
        if (!this.f.g()) {
            return hhk.J(new IllegalArgumentException("downloadFileGroupWithForegroundService: ForegroundDownloadService is not provided!"));
        }
        if (!this.e.g()) {
            object = css.a();
            ((kqr)object).b = csr.r;
            ((kqr)object).c = "downloadFileGroupWithForegroundService: Download Monitor is not provided!";
            return hhk.J(((kqr)object).a());
        }
        return fxf.ai(new ctz(this, object, 6), this.d);
    }

    @Override
    public final hpn d(csz object) {
        long l2 = cgw.o();
        Object object2 = new ctz(this, object, 3);
        object2 = this.m.g((hnx)object2, this.d);
        hwp hwp2 = hlq.a.l();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        String string = ((csz)object).a;
        hwv hwv2 = hwp2.b;
        object = (hlq)hwv2;
        string.getClass();
        ((hlq)object).b |= 1;
        ((hlq)object).c = string;
        if (!hwv2.B()) {
            hwp2.u();
        }
        hwv2 = hwp2.b;
        object = (hlq)hwv2;
        ((hlq)object).b |= 0x20;
        ((hlq)object).h = false;
        if (!hwv2.B()) {
            hwp2.u();
        }
        object = hwp2.b;
        hwv2 = (hlq)object;
        ((hlq)hwv2).b |= 2;
        ((hlq)hwv2).d = -1;
        if (!((hwv)object).B()) {
            hwp2.u();
        }
        object = (hlq)hwp2.b;
        ((hlq)object).b |= 0x40;
        ((hlq)object).i = -1L;
        this.s(4, (hpn)object2, l2, (hlq)hwp2.o(), new cub(), new cuk(1));
        return object2;
    }

    @Override
    public final hpn e(ctb object) {
        object = new ctz(this, object, 2);
        Executor executor = this.d;
        return this.m.g((hnx)object, executor);
    }

    @Override
    public final hpn f(String object) {
        int n2;
        block10: {
            switch (((String)object).hashCode()) {
                default: {
                    break;
                }
                case 437964371: {
                    if (!((String)object).equals("MDD.WIFI.CHARGING.PERIODIC.TASK")) break;
                    n2 = 3;
                    break block10;
                }
                case -69128772: {
                    if (!((String)object).equals("MDD.CHARGING.PERIODIC.TASK")) break;
                    n2 = 1;
                    break block10;
                }
                case -1202768674: {
                    if (!((String)object).equals("MDD.CELLULAR.CHARGING.PERIODIC.TASK")) break;
                    n2 = 2;
                    break block10;
                }
                case -2105562759: {
                    if (!((String)object).equals("MDD.MAINTENANCE.PERIODIC.GCM.TASK")) break;
                    n2 = 0;
                    break block10;
                }
            }
            n2 = -1;
        }
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        cyr.c("%s: gcm task doesn't belong to MDD", "MobileDataDownload");
                        return hhk.J(new IllegalArgumentException("Unknown task tag sent to MDD.handleTask() ".concat((String)object)));
                    }
                    return this.r(true);
                }
                return this.r(false);
            }
            return fxf.ak(this.n(), gqk.d(new bps(this, 10)), this.d);
        }
        bzo bzo2 = this.m;
        object = this.c;
        Objects.requireNonNull(object);
        return bzo2.g(new cqg(object, 2), this.d);
    }

    @Override
    public final hpn g(cuu object) {
        ctz ctz2 = new ctz(this, object, 4, null);
        object = this.d;
        return this.m.g(ctz2, (Executor)object);
    }

    @Override
    public final hpn h() {
        bdr bdr2 = new bdr(this, 5);
        Executor executor = this.d;
        return this.m.f(bdr2, executor);
    }

    @Override
    public final void i(String string) {
        cyr.d("%s: CancelForegroundDownload for key = %s", "MobileDataDownload", string);
        fxf.ak(this.i.h(string), new bps(string, 11), this.d);
        cyr.d("%s: CancelForegroundDownload for Uri = %s", "DownloaderImp", string);
        bmu bmu2 = this.n;
        fxf.ak(fxf.ak(((czh)bmu2.c).g(string), new cww(bmu2, string, 16), (Executor)bmu2.a), new cyc(string, 6), (Executor)bmu2.a);
    }

    public final hpn l(ctq object, cth cth2, boolean bl2, boolean bl3, boolean bl4) {
        gto gto2 = cuq.o((ctq)object, cth2);
        object = (((ctq)object).b & 4) != 0 ? ((ctq)object).e : null;
        int n2 = true != bl2 ? 3 : 2;
        return fxf.aj(cuq.q(cth2, gto2, (String)object, n2, bl3, bl4, this.c, this.d, this.k), new brk(this, 8), this.d);
    }

    public final hpn m(csu csu2) {
        cvg cvg2 = cvg.a(csu2.a);
        hyg hyg2 = ctq.a.l();
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        String string = csu2.a;
        ctq ctq2 = (ctq)hyg2.b;
        string.getClass();
        ctq2.b |= 1;
        ctq2.c = string;
        String string2 = this.a.getPackageName();
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        ctq2 = (ctq)hyg2.b;
        string2.getClass();
        ctq2.b |= 2;
        ctq2.d = string2;
        boolean bl2 = csu2.g.g();
        hyg2 = (ctq)hyg2.o();
        return this.m.g(new cuc(this, cvg2, (ctq)hyg2, bl2, csu2, string), this.d);
    }

    public final hpn n() {
        ArrayList<hpn> arrayList = new ArrayList<hpn>();
        Iterator iterator = this.l.iterator();
        while (iterator.hasNext()) {
            arrayList.add(((csx)iterator.next()).a(this));
        }
        return crh.w(arrayList).u(new cuh(2), this.d);
    }
}

