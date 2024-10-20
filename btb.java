/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import androidx.wear.ambient.WearableControllerProvider;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class btb
implements hny {
    public final Object a;
    public final Object b;
    public final Object c;
    private final int d;

    public /* synthetic */ btb(btj btj2, buc buc2, int n2) {
        this.d = n2;
        this.a = btj2;
        this.b = buc2;
        this.c = "com.google.android.tts";
    }

    public /* synthetic */ btb(cwj cwj2, hwv hwv2, hwv hwv3, int n2) {
        this.d = n2;
        this.c = cwj2;
        this.a = hwv2;
        this.b = hwv3;
    }

    public /* synthetic */ btb(cwj cwj2, List list, hac hac2, int n2) {
        this.d = n2;
        this.a = cwj2;
        this.c = list;
        this.b = hac2;
    }

    public /* synthetic */ btb(Object object, ctq ctq2, Object object2, int n2) {
        this.d = n2;
        this.c = object;
        this.b = ctq2;
        this.a = object2;
    }

    public /* synthetic */ btb(Object object, Object object2, Object object3, int n2) {
        this.d = n2;
        this.b = object;
        this.c = object2;
        this.a = object3;
    }

    public /* synthetic */ btb(Object object, Object object2, Object object3, int n2, byte[] byArray) {
        this.d = n2;
        this.b = object;
        this.a = object2;
        this.c = object3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn a(Object object) {
        int n2 = this.d;
        int n3 = 0;
        switch (n2) {
            default: {
                object = (Void)object;
                Object object2 = this.c;
                cwj cwj2 = (cwj)object2;
                Object object3 = cwj2.c;
                object = this.b;
                ctq ctq2 = (ctq)object;
                object3 = dah.e(object3.g(ctq2)).f(new ain(15), cwj2.e);
                return ((dah)object3).g(new cwd(object2, ctq2, (cth)this.a, 11), cwj2.e).g(new cwd(object2, (hwv)object, object3, 12), cwj2.e);
            }
            case 19: {
                Object object4;
                Object object5 = (cth)object;
                object = this.c;
                if (object5 != null) {
                    n2 = ((cth)object5).f;
                    object5 = (hwp)object;
                    if (!((hwp)object5).b.B()) {
                        ((hwp)object5).u();
                    }
                    object5 = (hlq)((hwp)object5).b;
                    object4 = hlq.a;
                    ((hlq)object5).b = 2 | ((hlq)object5).b;
                    ((hlq)object5).d = n2;
                }
                object4 = this.a;
                object5 = this.b;
                object4 = (css)object4;
                n2 = hhk.az(((css)object4).a.aF);
                object = (hlq)((hwp)object).o();
                n3 = ((css)object4).c;
                int n4 = ((css)object4).b;
                ((cwj)object5).i.j(n2, (hlq)object, hhk.i(n3 - 1));
                return hpj.a;
            }
            case 18: {
                object = (cth)object;
                cwk cwk2 = ((cwj)this.c).c;
                object = this.a;
                return cwk2.l((ctq)this.b, (cth)object);
            }
            case 17: {
                Object object6;
                cth cth2 = (cth)object;
                Object object7 = this.b;
                Object object8 = this.c;
                object = object6 = hpj.a;
                if (cth2 != null) {
                    n2 = cqq.y(cth2.r);
                    if (n2 == 0) {
                        object = object6;
                    } else {
                        object = object6;
                        if (n2 != 1) {
                            cwj cwj3 = (cwj)object8;
                            object = object6;
                            if (cwj3.g.g()) {
                                object = ((dat)((gui)cwj3.g.c()).a()).a();
                            }
                        }
                    }
                    object6 = new cvq(object8, this.a, object7, (Object)cth2, 3, null);
                    object = ((cwj)object8).q((hpn)object, (hny)object6);
                }
                object6 = new btb(object8, (ctq)object7, (Object)cth2, 14);
                return ((cwj)object8).q((hpn)object, (hny)object6);
            }
            case 16: {
                czl czl2 = (czl)object;
                object = (ctf)this.a;
                String string = ((ctf)object).c;
                cth cth3 = (cth)this.b;
                cyr.e("%s: File couldn't be shared before download %s, filegroup %s", "FileGroupManager", string, cth3.d);
                n2 = czl2.a;
                cwj.A(((cwj)this.c).i, cth3, (ctf)object, n2);
                return hpj.a;
            }
            case 15: {
                ctv ctv2 = (ctv)object;
                object = this.b;
                Object object9 = this.a;
                return ((cwj)this.c).f(ctv2, (ctf)object9, (cth)object);
            }
            case 14: {
                object = (Void)object;
                object = this.b;
                Object object10 = (hwv)object;
                hwp hwp2 = (hwp)((hwv)object10).C(5);
                hwp2.x((hwv)object10);
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                Object object11 = this.a;
                object10 = this.c;
                ctq ctq3 = (ctq)hwp2.b;
                Object object12 = ctq.a;
                ctq3.b |= 8;
                ctq3.f = true;
                ctq ctq4 = (ctq)hwp2.o();
                object12 = (cwj)object10;
                return ((cwj)object12).q(((cwj)object12).c.g(ctq4), new cvq(object10, (Object)ctq4, object, object11, 13, null));
            }
            case 13: {
                hac hac2 = (hac)object;
                Object object13 = this.c;
                object = this.b;
                Object object14 = this.a;
                Iterator iterator = object13.iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        return hpj.a;
                    }
                    ctf ctf2 = (ctf)iterator.next();
                    try {
                        Uri uri = (Uri)((hac)object).get(ctf2);
                        fxf.K(uri);
                        ctf2 = (Uri)hac2.get(ctf2);
                        fxf.K(ctf2);
                        Uri uri2 = Uri.parse((String)uri.toString().substring(0, uri.toString().lastIndexOf("/")));
                        if (!((cwj)object14).m.B(uri2)) {
                            ((cwj)object14).m.x(uri2);
                        }
                        czt.b(((cwj)object14).a, uri, (Uri)ctf2);
                    }
                    catch (IOException iOException) {
                        break;
                    }
                    catch (NullPointerException nullPointerException) {
                        // empty catch block
                        break;
                    }
                }
                object14 = css.a();
                ((kqr)object14).b = csr.O;
                ((kqr)object14).c = "Unable to create symlink";
                ((kqr)object14).d = object;
                return hhk.J(((kqr)object14).a());
            }
            case 12: {
                Object object15 = this.c;
                Exception exception = (Exception)object;
                Object object16 = object = (cth)((AtomicReference)object15).get();
                if (object == null) {
                    object16 = cth.a;
                }
                Object object17 = this.a;
                Object object18 = this.b;
                boolean bl2 = exception instanceof css;
                object = hpj.a;
                if (bl2) {
                    object15 = (css)exception;
                    cyr.d("%s: Logging DownloadException, resultCode = %s", "FileGroupManager", (Object)((css)object15).a);
                    object15 = new cvq(object18, object17, object15, object16, 5, null);
                    object15 = ((cwj)object18).q((hpn)object, (hny)object15);
                } else {
                    object15 = object;
                    if (exception instanceof csi) {
                        cyr.c("%s: Logging AggregateException", "FileGroupManager");
                        gzx gzx2 = ((csi)exception).a;
                        n2 = ((hct)gzx2).c;
                        while (true) {
                            object15 = object;
                            if (n3 >= n2) break;
                            object15 = (Throwable)gzx2.get(n3);
                            if (!(object15 instanceof css)) {
                                cyr.g("%s: Expecting DownloadException's in AggregateException", "FileGroupManager");
                            } else {
                                object15 = new cvq(object18, object17, (Object)((css)object15), object16, 6, null);
                                object = ((cwj)object18).q((hpn)object, (hny)object15);
                            }
                            ++n3;
                        }
                    }
                }
                object = new cvv(exception, 3);
                return ((cwj)object18).q((hpn)object15, (hny)object);
            }
            case 11: {
                object = (Void)object;
                Object object19 = (cwj)this.c;
                if (!((cwj)object19).g.g()) return hhk.K(true);
                cth cth4 = (cth)this.a;
                n2 = cqq.y(cth4.r);
                if (n2 != 0) {
                    if (n2 == 1) return hhk.K(true);
                    object = this.b;
                    object19 = (dat)((gui)((cwj)object19).g.c()).a();
                    n2 = cth4.r;
                    object = ((ctq)object).c;
                    return object19.b();
                }
                return hhk.K(true);
            }
            case 10: {
                if ((Boolean)object != false) return hpj.a;
                Object object20 = this.b;
                Object object21 = this.a;
                object = this.c;
                ctf ctf3 = (ctf)object21;
                object21 = ctf3.c;
                object20 = (cth)object20;
                cyr.i("%s: Failed to set new state for file %s, filegroup %s", "FileGroupManager", object21, ((cth)object20).d);
                cwj.A(((cwj)object).i, (cth)object20, ctf3, 14);
                return hpj.a;
            }
            case 9: {
                boolean bl3 = (Boolean)object;
                object = this.c;
                if (!bl3) {
                    ctq ctq5 = (ctq)this.b;
                    cyr.i("%s: Failed to add to stale for group: '%s'; account: '%s'", "FileGroupManager", ctq5.c, ctq5.e);
                    ((cwj)object).i.d(1036);
                    return hhk.J(new IOException("Failed to add downloaded group to stale: ".concat(String.valueOf(ctq5.c))));
                }
                Object object22 = this.a;
                return ((cwj)object).h.c(((cth)object22).d);
            }
            case 8: {
                Object object23 = this.c;
                Object object24 = this.b;
                csz csz2 = (csz)this.a;
                boolean bl4 = csz2.b;
                boolean bl5 = csz2.c;
                object = (cth)object;
                object24 = (ctq)object24;
                return ((cuq)object23).l((ctq)object24, (cth)object, true, bl4, bl5);
            }
            case 7: {
                Object object25 = this.b;
                object = (cth)object;
                gto gto2 = cuq.o((ctq)object25, (cth)object);
                boolean bl6 = ((csu)this.a).i;
                object25 = (cuq)this.c;
                return cuq.q((cth)object, gto2, null, 2, false, bl6, ((cuq)object25).c, ((cuq)object25).d, ((cuq)object25).k);
            }
            case 6: {
                object = (Void)object;
                Object object26 = (cuq)this.b;
                object = ((cuq)object26).g;
                cwz cwz2 = ((cuq)object26).c;
                object26 = this.c;
                return cwz2.d((ctq)this.a, (gto)object26, (hny)object);
            }
            case 5: {
                Object object27 = this.b;
                object = (cth)object;
                gto gto3 = cuq.o((ctq)object27, (cth)object);
                boolean bl7 = ((csu)this.a).i;
                object27 = (cuq)this.c;
                return cuq.q((cth)object, gto3, null, 2, false, bl7, ((cuq)object27).c, ((cuq)object27).d, ((cuq)object27).k);
            }
            case 4: {
                object = (Void)object;
                Object object28 = (cuq)this.b;
                object = ((cuq)object28).g;
                cwz cwz3 = ((cuq)object28).c;
                object28 = this.c;
                return cwz3.d((ctq)this.a, (gto)object28, (hny)object);
            }
            case 3: {
                cxr cxr2 = (cxr)this.c;
                ctq ctq6 = cxr2.a;
                object = (gzs)object;
                boolean bl8 = ctq6.f;
                Object object29 = this.b;
                cth cth5 = cxr2.b;
                ctb ctb2 = (ctb)this.a;
                boolean bl9 = ctb2.f;
                boolean bl10 = ctb2.g;
                object29 = (cuq)object29;
                return fxf.aj(((cuq)object29).l(ctq6, cth5, bl8, bl9, bl10), new brk(object, 10), ((cuq)object29).d);
            }
            case 2: {
                object = (Throwable)object;
                Object object30 = (buc)this.b;
                String string = ((buc)object30).c;
                n2 = ((buc)object30).e;
                object30 = fxf.O(((Throwable)object).getMessage());
                ((btj)this.a).d.b(string, n2, 5, (String)object30, (String)this.c);
                return hhk.J((Throwable)object);
            }
            case 1: {
                Object object31 = this.b;
                Object object32 = this.a;
                Object object33 = this.c;
                object = (bpl)object;
                WearableControllerProvider wearableControllerProvider = (WearableControllerProvider)object33;
                object32 = (bpq)object32;
                object31 = kl.o(new bpz((bqb)object31, (bpl)object, (bpq)object32, wearableControllerProvider));
                return ((bpl)object).b.h((hpn)object31, new bpr(3));
            }
            case 0: 
        }
        object = (dcm)object;
        buc buc2 = (buc)this.b;
        String string = buc2.c;
        n2 = buc2.e;
        ((btj)this.a).d.d(string, n2, 5, (String)this.c);
        return hhk.K(object);
    }
}

