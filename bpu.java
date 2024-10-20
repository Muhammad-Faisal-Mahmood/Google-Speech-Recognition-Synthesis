/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.util.Log
 */
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import j$.util.Collection$_EL;
import j$.util.stream.Stream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public final class bpu
implements hny {
    public final Object a;
    public final Object b;
    private final int c;

    public /* synthetic */ bpu(Object object, Object object2, int n2) {
        this.c = n2;
        this.b = object;
        this.a = object2;
    }

    public /* synthetic */ bpu(Object object, Object object2, int n2, byte[] byArray) {
        this.c = n2;
        this.a = object;
        this.b = object2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final hpn a(Object object) {
        Iterator iterator;
        cth cth2;
        hav hav2;
        int n2 = this.c;
        int n3 = 0;
        switch (n2) {
            default: {
                hav2 = (hav)object;
                object = new ArrayList();
                cth2 = (cth)this.b;
                iterator = cth2.o.iterator();
                break;
            }
            case 19: {
                object = (cth)object;
                Object object2 = (hwv)this.b;
                hwp hwp2 = (hwp)((hwv)object2).C(5);
                hwp2.x((hwv)object2);
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                object2 = this.a;
                ctq ctq2 = (ctq)hwp2.b;
                ctq ctq3 = ctq.a;
                ctq2.b |= 8;
                ctq2.f = false;
                ctq ctq4 = (ctq)hwp2.o();
                return ((cwj)object2).c.l(ctq4, (cth)object);
            }
            case 18: {
                object = (cxk)object;
                cyr.h("%s: Encountered SharedFileMissingException for group: %s", "FileGroupManager", ((cth)this.b).d);
                ((cwj)this.a).b.a();
                return hhk.K(ctp.a);
            }
            case 17: {
                List list = (List)object;
                object = new ArrayList();
                Iterator iterator2 = list.iterator();
                while (true) {
                    String string;
                    Object object3;
                    Object object4 = this.b;
                    if (!iterator2.hasNext()) return crh.w((Iterable)object).u(new cuh(5), ((cwj)object4).e);
                    ctq ctq5 = (ctq)iterator2.next();
                    if (ctq5.e.isEmpty() || ((hav)(object3 = this.a)).contains(string = ctq5.e)) continue;
                    object3 = (cwj)object4;
                    object.add(((cwj)object3).q(((cwj)object3).c.g(ctq5), new cvy(object4, ctq5, 0)));
                }
            }
            case 16: {
                if (!((Boolean)object).booleanValue()) {
                    Object object5 = this.b;
                    object = this.a;
                    ctq ctq6 = (ctq)object5;
                    cyr.i("%s: Failed to remove pending version for group: '%s'; account: '%s'", "FileGroupManager", ctq6.c, ctq6.e);
                    ((cwj)object).i.d(1036);
                    return hhk.J(new IOException("Failed to remove pending group: ".concat(String.valueOf(ctq6.c))));
                }
                object = css.a();
                csr csr2 = csr.C;
                ((kqr)object).b = csr2;
                ((kqr)object).c = csr2.name();
                return hhk.J(((kqr)object).a());
            }
            case 15: {
                object = (Void)object;
                object = this.b;
                dmt dmt2 = (dmt)object;
                return fxf.ak(dmt2.i.m((List)this.a), new bps(object, 18), (Executor)dmt2.c);
            }
            case 14: {
                Object object6 = (List)object;
                ArrayList<Uri> arrayList = new ArrayList<Uri>();
                ArrayList arrayList2 = new ArrayList();
                object = new AtomicInteger(0);
                Object object7 = new ArrayList<hpn>();
                Iterator iterator3 = object6.iterator();
                while (true) {
                    object6 = this.b;
                    if (!iterator3.hasNext()) break;
                    Object object8 = this.a;
                    ctt ctt2 = (ctt)iterator3.next();
                    if (!object8.contains(ctt2)) {
                        object8 = (dmt)object6;
                        object7.add(fxf.ak(((dmt)object8).h.e(ctt2), new cvq(object6, arrayList2, (Object)ctt2, object, 0), (Executor)((dmt)object8).c));
                        continue;
                    }
                    object6 = (dmt)object6;
                    object7.add(fxf.aj(((egg)((dmt)object6).d).m(ctt2), new brk(arrayList, 13), (Executor)((dmt)object6).c));
                }
                if (cqq.j()) {
                    ArrayList arrayList3 = new ArrayList();
                    dmt dmt3 = (dmt)object6;
                    object7.add(fxf.aj(fxf.aj(dmt3.i.c(), new bte(object6, arrayList3, 3), (Executor)dmt3.c), new brk(arrayList, 14), (Executor)dmt3.c));
                } else {
                    dmt dmt4 = (dmt)object6;
                    Object object9 = dmt4.a;
                    gto gto2 = (gto)dmt4.f;
                    arrayList.add(crh.d((Context)object9, gto2));
                }
                object7 = crh.w(object7);
                object6 = (dmt)object6;
                return ((bzq)object7).u(new ddy((dmt)object6, (AtomicInteger)object, arrayList2, arrayList, 1), (Executor)((dmt)object6).c);
            }
            case 13: {
                object = (csg)object;
                object = ((cvg)this.a).a;
                return ((cuq)this.b).j.i((String)object);
            }
            case 12: {
                object = (Void)object;
                ((hpo)this.a).run();
                return this.b;
            }
            case 11: {
                hac hac2 = (hac)object;
                Iterator iterator4 = this.a.iterator();
                while (iterator4.hasNext()) {
                    ctf ctf2 = (ctf)iterator4.next();
                    String string = ctf2.c;
                    n3 = ctf2.e;
                    n2 = ctf2.j;
                    if ((ctf2.b & 0x2000) != 0) {
                        hvi hvi2 = ctf2.q;
                        object = hvi2;
                        if (hvi2 == null) {
                            object = hvi.a;
                        }
                    } else {
                        object = null;
                    }
                    boolean bl2 = hac2.containsKey(ctf2) && hac2.get(ctf2) == ctp.e;
                    Object object10 = this.b;
                    object = cuq.j(string, n3, n2, null, (hvi)object, bl2);
                    ((hwp)object10).A((csf)object);
                }
                return hpj.a;
            }
            case 10: {
                object = (Void)object;
                ((hpo)this.a).run();
                return this.b;
            }
            case 9: {
                cuq cuq2 = (cuq)this.a;
                cwz cwz2 = cuq2.c;
                object = (cth)object;
                return fxf.aj(cwz2.e((ctq)this.b, true), new brk(object, 9), cuq2.d);
            }
            case 8: {
                gzx gzx2 = (gzx)object;
                object = hhk.K(new gzs());
                n2 = gzx2.size();
                while (true) {
                    Object object11 = this.a;
                    if (n3 >= n2) return fxf.aj((hpn)object, new ain(10), ((cuq)object11).d);
                    Object object12 = this.b;
                    object = fxf.ak((hpn)object, new btb(object11, (cxr)gzx2.get(n3), object12, 3), ((cuq)object11).d);
                    ++n3;
                }
            }
            case 7: {
                object = (cvn)object;
                n3 = ((cvn)object).b() - 1;
                if (n3 == 1) return ((cvn)object).c();
                if (n3 == 2) return hhk.K(((cvn)object).a());
                Object object13 = this.b;
                object = ctq.a.l();
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                csu csu2 = (csu)object13;
                String string = csu2.a;
                Object object14 = this.a;
                ctq ctq7 = (ctq)((hwp)object).b;
                string.getClass();
                ctq7.b |= 1;
                ctq7.c = string;
                cuq cuq3 = (cuq)object14;
                String string2 = cuq3.a.getPackageName();
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                ctq ctq8 = (ctq)((hwp)object).b;
                string2.getClass();
                ctq8.b = 2 | ctq8.b;
                ctq8.d = string2;
                ctq8 = (ctq)((hwp)object).o();
                if (csu2.g.g()) {
                    if (cuq3.e.g()) {
                        ((daa)cuq3.e.c()).g(string, (csv)csu2.g.c());
                    } else {
                        object = css.a();
                        ((kqr)object).b = csr.r;
                        ((kqr)object).c = "downloadFileGroup: DownloadListener is present but Download Monitor is not provided!";
                        return hhk.J(((kqr)object).a());
                    }
                }
                try {
                    object = ((csu)object13).f.g() ? gto.i(cqq.P((csp)((csu)object13).f.c())) : gsl.a;
                }
                catch (hxn hxn2) {
                    return hhk.J(hxn2);
                }
                cvg cvg2 = cvg.a(csu2.a);
                hpo hpo2 = new hpo((Callable)new cuh(1));
                object = dah.e(hpo2).g(new btb(object14, ctq8, object, 6, null), cuq3.d).g(new btb(object14, ctq8, object13, 7), cuq3.d).f(new ain(12), cuq3.d);
                object = dah.e(cuq3.j.f(cvg2.a, (hpn)object)).g(new bpu(hpo2, object, 12, null), cuq3.d);
                object = ((dah)object).g(new bpu(object14, cvg2, 13), cuq3.d).g(new cvq(object14, object, object13, (Object)string, 1), cuq3.d);
                fxf.al((hpn)object, new emz(cuq3, csu2, string, cvg2, 1), cuq3.d);
                return object;
            }
            case 6: {
                gzx gzx3 = (gzx)object;
                object = (cni)this.b;
                return ((cni)object).a((bpm)((cni)object).b.get(), gzx3, (idq)this.a);
            }
            case 5: {
                cap cap2 = (cap)object;
                object = this.a;
                if (cap2 != null) return object;
                hpn hpn2 = ((cag)this.b).k;
                object = hpn2;
                if (hpn2 != null) return object;
                return hhk.K(null);
            }
            case 4: {
                Object object15 = this.a;
                ezo ezo2 = (ezo)object;
                object = hcy.a;
                try {
                    hac hac3 = (hac)hhk.S((Future)object15);
                    object = hac3;
                }
                catch (ExecutionException executionException) {
                    ((hfk)((hfk)((hfk)byu.a.h()).i(executionException)).j("com/google/android/apps/speech/tts/googletts/settings/asr/dataservice/impl/LanguagePackSettingsDataServiceImpl", "getInstalledLocalesSource", 193, "LanguagePackSettingsDataServiceImpl.java")).r("Language names could not be read properly! The settings page may not have readable language names.");
                }
                Object object16 = this.b;
                hac hac4 = (hac)Collection$_EL.stream(crh.B(hav.n(ezo2.a))).collect(gye.a(new bpf(12), new bpf(13)));
                Stream stream = Collection$_EL.stream(crh.B(hav.n(ezo2.c))).filter(new boa(14));
                object16 = (byu)object16;
                return fxf.aj(hhk.Q((gzx)stream.map(new bys((byu)object16, hac4, ezo2, (hac)object)).collect(gye.a)), new ain(7), ((byu)object16).b);
            }
            case 3: {
                object = (dcm)object;
                object = ((bas)this.b).b("locale_to_sync");
                if (fxf.P((String)object)) {
                    return hhk.K(new bbg());
                }
                Object object17 = this.a;
                object = Locale.forLanguageTag((String)object);
                bug bug2 = (bug)object17;
                Locale locale = bug2.d.a((Locale)object);
                if (locale != null) {
                    object = locale;
                }
                if (((Locale)object).equals(Locale.US)) return hhk.K(new bbg());
                if ((object = bug2.e.b(new brx(brz.h((Locale)object)))) != null) return hno.g(hph.q(bug2.c.k((buc)object)), new buf(0), bug2.b);
                return hhk.K(new bbg());
            }
            case 2: {
                if ((dcm)object == null) {
                    return hhk.K("");
                }
                Object object18 = this.b;
                object = this.a;
                Object object19 = (bso)object18;
                buc buc2 = ((bso)object19).h();
                String string = ((bso)object19).n();
                bua bua2 = ((bso)object19).g();
                btz btz2 = ((bso)object19).f();
                object19 = buc2.c;
                return hhk.P(gqk.c(new czj(((btn)object).e, (String)object19, buc2, string, bua2, btz2, 1)), btj.b);
            }
            case 1: {
                object = (Integer)object;
                n3 = (Integer)object;
                Object object20 = this.b;
                if (n3 != 0) {
                    if (n3 != 1 && n3 != 2) {
                        if (n3 != 3) {
                            Objects.toString(object);
                            return hhk.J(new bpp(1, 0, "Unexpected feature status: ".concat(String.valueOf(object)), null));
                        }
                        bpy bpy2 = (bpy)object20;
                        object = bpy2.c;
                        String string = bpy.a;
                        StringBuilder stringBuilder = new StringBuilder("Feature ");
                        stringBuilder.append(((bpq)object).a);
                        stringBuilder.append(" is downloaded and ready.");
                        Log.i((String)string, (String)stringBuilder.toString());
                        bpy2.e.execute(new bpw(1));
                        return hpj.a;
                    }
                    object = this.a;
                    Object object21 = (bpy)object20;
                    bpm bpm2 = ((bpy)object21).b;
                    object21 = ((bpy)object21).c;
                    bqb bqb2 = (bqb)bpm2;
                    return hno.g(bqb2.a(), new btb(bpm2, object21, object, 1, null), bqb2.d);
                }
                object = new bpp(1, 0, "Feature is unavailable.", null);
                ((bpy)object20).e.execute(new bpw(0));
                return hhk.J((Throwable)object);
            }
            case 0: {
                Object object22 = this.b;
                Object object23 = this.a;
                object = (bpx)object;
                hpn hpn3 = kl.o(new bbc(object22, object, object23, 2, null));
                return ((bpx)object).b.h(hpn3, new bpr(0));
            }
        }
        while (true) {
            ctt ctt3;
            Object object24 = this.a;
            if (!iterator.hasNext()) return crh.w((Iterable)object).u(new cuh(3), ((cwj)object24).e);
            ctf ctf3 = (ctf)iterator.next();
            if (cqq.ae(ctf3)) continue;
            n3 = n2 = a.t(cth2.j);
            if (n2 == 0) {
                n3 = 1;
            }
            if (hav2.contains(ctt3 = crh.l(ctf3, n3))) continue;
            object.add(((cwj)object24).j.j(ctt3));
        }
    }
}

