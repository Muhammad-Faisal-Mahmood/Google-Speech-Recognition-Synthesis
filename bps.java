/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.RemoteException
 */
import android.content.Context;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class bps
implements hny {
    public final Object a;
    private final int b;

    public /* synthetic */ bps(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    @Override
    public final hpn a(Object object) {
        switch (this.b) {
            default: {
                if (((Boolean)object).booleanValue()) break;
                ((cwj)this.a).i.d(1036);
                break;
            }
            case 19: {
                long l2;
                hyg hyg2;
                object = (cth)object;
                Object object2 = this.a;
                if (object != null && cwj.s((cth)object2, object)) {
                    hyg2 = ((cth)object).c;
                    object = hyg2;
                    if (hyg2 == null) {
                        object = ctg.a;
                    }
                    l2 = ((ctg)object).d;
                } else {
                    l2 = cqq.x();
                }
                hyg2 = ((cth)object2).c;
                object = hyg2;
                if (hyg2 == null) {
                    object = ctg.a;
                }
                hyg2 = (hwp)((hwv)object).C(5);
                ((hwp)hyg2).x((hwv)object);
                if (!((hwp)hyg2).b.B()) {
                    ((hwp)hyg2).u();
                }
                object = (ctg)((hwp)hyg2).b;
                ((ctg)object).b |= 2;
                ((ctg)object).d = l2;
                object = (ctg)((hwp)hyg2).o();
                object2 = (hwv)object2;
                hyg2 = (hwp)((hwv)object2).C(5);
                ((hwp)hyg2).x((hwv)object2);
                if (!((hwp)hyg2).b.B()) {
                    ((hwp)hyg2).u();
                }
                object2 = (cth)((hwp)hyg2).b;
                object.getClass();
                ((cth)object2).c = object;
                ((cth)object2).b |= 1;
                return hhk.K((cth)((hwp)hyg2).o());
            }
            case 18: {
                if (!((Boolean)object).booleanValue()) {
                    ((cyu)((dmt)this.a).g).d(1036);
                    cyr.g("%s: Failed to write back stale groups!", "ExpirationHandler");
                }
                return hpj.a;
            }
            case 17: {
                object = (Void)object;
                Object object3 = this.a;
                object = (dmt)object3;
                return fxf.ak(fxf.ak(((dmt)object).i.c(), new bps(object3, 12), (Executor)((dmt)object).c), new bps(object3, 15), (Executor)((dmt)object).c);
            }
            case 16: {
                Object object4;
                object = (List)object;
                ArrayList<cth> arrayList = new ArrayList<cth>();
                Iterator iterator = object.iterator();
                while (true) {
                    Object object5;
                    object4 = this.a;
                    if (!iterator.hasNext()) break;
                    cth cth2 = (cth)iterator.next();
                    Object object6 = TimeUnit.SECONDS;
                    object = object5 = cth2.c;
                    if (object5 == null) {
                        object = ctg.a;
                    }
                    if (cqq.af(Math.min(object6.toMillis(((ctg)object).c), cqq.V(cth2)))) {
                        object = (dmt)object4;
                        object4 = ((dmt)object).g;
                        object6 = cth2.d;
                        int n2 = cth2.f;
                        long l3 = cth2.s;
                        object5 = cth2.t;
                        ((cyu)object4).e(1052, (String)object6, n2, l3, (String)object5);
                        if (!cqq.ad(cth2)) continue;
                        object5 = ((dmt)object).a;
                        object4 = ((dmt)object).f;
                        object = (bmu)((dmt)object).j;
                        object4 = (gto)object4;
                        cqq.ax((Context)object5, (gto)object4, cth2, (bmu)object);
                        continue;
                    }
                    arrayList.add(cth2);
                }
                object = (dmt)object4;
                return fxf.ak(((dmt)object).i.k(), new bpu(object4, arrayList, 15), (Executor)((dmt)object).c);
            }
            case 15: {
                Object object7 = this.a;
                dmt dmt2 = (dmt)object7;
                Object object8 = dmt2.h;
                object = (Set)object;
                return fxf.ak(object8.c(), new bpu(object7, object, 14), (Executor)dmt2.c);
            }
            case 14: {
                object = (Void)object;
                Object object9 = this.a;
                object = (dmt)object9;
                return fxf.ak(fxf.ak(((dmt)object).i.c(), new bps(object9, 13), (Executor)((dmt)object).c), new bps(object9, 17), (Executor)((dmt)object).c);
            }
            case 13: {
                Object object10;
                Object object11 = (List)object;
                object = new ArrayList();
                object11 = object11.iterator();
                while (true) {
                    object10 = this.a;
                    if (!object11.hasNext()) break;
                    Object object12 = (cxr)object11.next();
                    Object object13 = ((cxr)object12).a;
                    object12 = ((cxr)object12).b;
                    long l4 = cqq.V((cth)object12);
                    Object object14 = l4;
                    cyr.e("%s: Checking group %s with expiration date %s", "ExpirationHandler", ((cth)object12).d, object14);
                    object14.getClass();
                    if (!cqq.af(l4)) continue;
                    object10 = (dmt)object10;
                    Object object15 = ((dmt)object10).g;
                    String string = ((cth)object12).d;
                    int n3 = ((cth)object12).f;
                    l4 = ((cth)object12).s;
                    String string2 = ((cth)object12).t;
                    ((cyu)object15).e(1051, string, n3, l4, string2);
                    cyr.e("%s: Expired group %s with expiration date %s", "ExpirationHandler", ((cth)object12).d, object14);
                    object.add(object13);
                    if (!cqq.ad((cth)object12)) continue;
                    object13 = ((dmt)object10).a;
                    object14 = ((dmt)object10).f;
                    object10 = (bmu)((dmt)object10).j;
                    object14 = (gto)object14;
                    cqq.ax((Context)object13, (gto)object14, (cth)object12, (bmu)object10);
                }
                object11 = (dmt)object10;
                return fxf.aj(((dmt)object11).i.j((List)object), new brk(object10, 12), (Executor)((dmt)object11).c);
            }
            case 12: {
                Object object16 = (List)object;
                HashSet hashSet = new HashSet();
                object = new ArrayList();
                object16 = object16.iterator();
                while (object16.hasNext()) {
                    object.add(((cxr)object16.next()).b);
                }
                object16 = (dmt)this.a;
                return fxf.aj(((dmt)object16).i.e(), new cvo((dmt)object16, (List)object, hashSet), (Executor)((dmt)object16).c);
            }
            case 11: {
                object = (gto)object;
                if (((gto)object).g()) {
                    cyr.k("%s: CancelForegroundDownload future found for key = %s, cancelling...", "MobileDataDownload", this.a);
                    ((hpn)((gto)object).c()).cancel(false);
                }
                return hpj.a;
            }
            case 10: {
                object = (Void)object;
                cyr.c("%s verifyAllPendingGroups", "MDDManager");
                cuq cuq2 = (cuq)this.a;
                object = cuq2.c;
                return fxf.ak(((cwz)object).f(), new cwl(object, cuq2.g, 20), ((cwz)object).i);
            }
            case 9: {
                object = (Void)object;
                return ((cuq)this.a).n();
            }
            case 8: {
                object = (cxu)object;
                Object object17 = this.a;
                hpn hpn2 = hpj.a;
                object17 = (byu)object17;
                ((byu)object17).g.Q(hpn2, "LanguagePackSettings:installedPacks");
                hpn2 = hpj.a;
                ((byu)object17).g.Q(hpn2, "LanguagePackSettings:supportedPacks");
                object17 = ((cxu)object).a;
                object = hhk.K(ezg.a);
                return (hpn)((gto)object17).e(object);
            }
            case 7: {
                object = (hac)object;
                return ((byu)this.a).d.a();
            }
            case 6: {
                object = (hac)object;
                return ((byu)this.a).d.a();
            }
            case 5: {
                object = (dbx)object;
                Object object18 = new brx(brz.h(Locale.US));
                object = (bug)this.a;
                object18 = ((bug)object).e.b((brx)object18);
                fxf.K(object18);
                return ((bug)object).c.k((buc)object18);
            }
            case 4: {
                object = (dbx)object;
                btj btj2 = (btj)this.a;
                fxf.K(btj2.q);
                ((heg)((heg)btj.a.f()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataDownloader", "init", 255, "VoiceDataDownloader.java")).r("Superpacks created and default voices checked.");
                object = btj2.q;
                ((egg)object).f();
                return hhk.K(((egg)object).b("ttsvoices", btj2.i, "getSuperpackManifest"));
            }
            case 3: {
                object = (dbx)object;
                Object object19 = (btj)this.a;
                fxf.K(((btj)object19).q);
                ((heg)((heg)btj.a.f()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataDownloader", "fetchVoiceInternal", 299, "VoiceDataDownloader.java")).u("Syncing superpack %s", ((dbx)object).c());
                object19 = ((btj)object19).q;
                ded ded2 = ded.c(((dbx)object).c(), ((dbx)object).a());
                ddm ddm2 = ddm.a;
                return hno.g(((egg)object19).c(ded2, btj.a((dbx)object)), new cww(object19, ded2, 17), (Executor)((egg)object19).l);
            }
            case 2: {
                Object object20 = this.a;
                object = (bpx)object;
                object20 = kl.o(new bpt((bpy)object20, (bpx)object, 0));
                return ((bpx)object).b.h((hpn)object20, new bpr(2));
            }
            case 1: {
                object = (Void)object;
                return ((bpy)this.a).b.a();
            }
            case 0: {
                Object object21 = this.a;
                object = (bpl)object;
                try {
                    boz boz2 = ((bpl)object).a;
                    object21 = ((bpy)object21).b(boz2);
                }
                catch (RuntimeException runtimeException) {
                    object = hhk.J(new bpp(2, 0, "Failed to initialize service.", runtimeException));
                }
                catch (RemoteException remoteException) {
                    object = hhk.J(new bpp(2, 6, "Failed to initialize service.", remoteException));
                }
                object = hhk.K(new bpx(object21, ((bpl)object).b));
                return object;
            }
        }
        return hpj.a;
    }
}

