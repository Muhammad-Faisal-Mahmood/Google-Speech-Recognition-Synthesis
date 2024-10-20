/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.os.SystemClock
 *  android.util.Log
 */
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import androidx.wear.ambient.AmbientDelegate;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public final class cww
implements hny {
    public final Object a;
    public final Object b;
    private final int c;

    public /* synthetic */ cww(Object object, Object object2, int n2) {
        this.c = n2;
        this.a = object;
        this.b = object2;
    }

    public /* synthetic */ cww(Object object, Object object2, int n2, byte[] byArray) {
        this.c = n2;
        this.b = object;
        this.a = object2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final hpn a(Object object) {
        int n2;
        Object object2;
        int n3 = this.c;
        Object object3 = false;
        boolean bl2 = true;
        switch (n3) {
            default: {
                object = (Void)object;
                object = dvv.a;
                object2 = new gzs();
                object = (dua)this.a;
                ((gzs)object2).h(((dua)object).c);
                n3 = crt.a;
                ((gzs)object2).h(crt.a(((dua)object).c));
                object = ((gzs)object2).g();
                n3 = ((hct)object).c;
                break;
            }
            case 19: {
                dsy dsy2 = (dsy)object;
                object = (hwp)dsy2.C(5);
                ((hwp)object).x(dsy2);
                hwr hwr2 = (hwr)object;
                if (!hwr2.b.B()) {
                    ((hwp)hwr2).u();
                }
                object = this.a;
                object3 = this.b;
                dsy2 = (dsy)hwr2.b;
                dsy dsy3 = dsy.a;
                object3.getClass();
                dsy2.c = (kfl)object3;
                dsy2.b |= 1;
                dsy2 = (dsy)hwr2.o();
                object3 = (dwm)object;
                object = ((dwm)object3).e;
                object3 = (Context)((dwm)object3).c;
                return ((ClearcutMetricSnapshotTransmitter)object).a((Context)object3, dsy2);
            }
            case 18: {
                Object object4 = (dek)object;
                object = (AmbientDelegate)this.a;
                Object object5 = ((dgx)((AmbientDelegate)object).b).c().f();
                Object object6 = ((den)object5).o();
                object3 = dde.a((ddn)object6, ((den)object5).k());
                object5 = (kpo)this.b;
                n2 = ((dfu)((kpo)object5).c).a((ddn)object3);
                if (n2 <= ((kpo)object5).a) {
                    ((hfk)((hfk)ddd.c.f()).j("com/google/android/libraries/micore/superpacks/packs/FetchPipeline", "fetchOnePackMaybeRetry", 319, "FetchPipeline.java")).G("Retrying fetching pack %s after validation failure, counts: %d, maxAllowed: %d", ((ddn)object6).e(), n2, ((kpo)object5).a);
                    object6 = ((kpo)object5).c;
                    object4 = dhu.f;
                    ((dfu)object6).o((ddn)object3, (dhu)object4, false);
                    return ((kpo)object5).j((AmbientDelegate)object);
                }
                ((hfk)((hfk)ddd.c.f()).j("com/google/android/libraries/micore/superpacks/packs/FetchPipeline", "fetchOnePackMaybeRetry", 334, "FetchPipeline.java")).x("Max validation retry count of %d met for pack %s, failing fetch", n2, ((ddn)object6).e());
                return hhk.J((Throwable)object4);
            }
            case 17: {
                object = (dbx)object;
                object = this.b;
                long l2 = SystemClock.elapsedRealtime();
                object3 = ((dct)object).a;
                Object object7 = this.a;
                object = (egg)object7;
                hpn hpn2 = hhk.P(new dqo((egg)object, (String)object3, l2, 1), (Executor)((egg)object).l);
                hpn hpn3 = hhk.Z(hpn2).b(new dcf(object7, object3, hpn2, 0, null), (Executor)((egg)object).l);
                if (!((cxv)((egg)object).f).b()) return hhk.Z(hpn3).b(new dcf(object7, hpn2, object3, 2), (Executor)((egg)object).l);
                return hpn3;
            }
            case 16: {
                bl2 = (Boolean)object;
                Object object8 = this.b;
                object = (bmu)this.a;
                object = bl2 ? ((bmu)object).c : ((bmu)object).b;
                return ((czh)object).h((String)object8);
            }
            case 15: {
                Object object9;
                object = (Map)object;
                object3 = this.a;
                object = object9 = (Set)object.get(object3);
                if (object9 == null) {
                    object = hdc.a;
                }
                object9 = this.b;
                object = hac.j(object3, object);
                return ((cyo)object9).f((Map)object);
            }
            case 14: {
                object = (Void)object;
                ((hpo)this.b).run();
                return this.a;
            }
            case 13: {
                Exception exception = (Exception)object;
                if (exception instanceof css) {
                    object = (css)exception;
                } else {
                    object = css.a();
                    ((kqr)object).d = exception;
                    ((kqr)object).b = csr.c;
                    object = ((kqr)object).a();
                }
                object3 = this.a;
                Object object10 = this.b;
                return fxf.ak(object3.b((css)object), new cyc(exception, 2), (Executor)((dmu)object10).c);
            }
            case 12: {
                object = (Void)object;
                object = this.a;
                return this.b.a((Uri)object);
            }
            case 11: {
                object = (Void)object;
                object = (cyb)this.b;
                object3 = ((cyb)object).d.g;
                bmu bmu2 = ((cyb)object).o;
                Object object11 = this.a;
                if (!cye.d(bmu2, (Uri)object11, (String)object3)) {
                    cyr.h("%s: Final file checksum verification failed. %s.", "DeltaFileDownloaderCallbackImpl", object11);
                    object = css.a();
                    ((kqr)object).b = csr.F;
                    return hhk.J(((kqr)object).a());
                }
                object3 = ((cyb)object).d;
                n2 = ((cyb)object).n;
                object11 = ((cyb)object).b;
                object = ((cyb)object).l;
                return cyd.c(ctp.e, (ctf)object3, n2, (cxl)object11, (Executor)object);
            }
            case 10: {
                hac hac2 = (hac)object;
                gzy gzy2 = new gzy();
                object3 = ((hav)this.b).k();
                while (object3.hasNext()) {
                    object = (ctt)object3.next();
                    if (!hac2.containsKey(object)) {
                        cyr.h("%s: getOnDeviceUris called on file that doesn't exist. Key = %s!", "SharedFileManager", object);
                        return hhk.J(new cxk());
                    }
                    Object object12 = this.a;
                    Object object13 = (ctv)hac2.get(object);
                    n2 = a.t(((ctt)object).f);
                    if (n2 == 0) {
                        n2 = 1;
                    }
                    Object object14 = (egg)object12;
                    object12 = ((egg)object14).k;
                    String string = ((ctv)object13).c;
                    String string2 = ((ctv)object13).g;
                    Object object15 = ((egg)object14).d;
                    object14 = ((egg)object14).l;
                    object13 = (gto)object14;
                    bl2 = ((ctv)object13).e;
                    if ((object12 = crh.f((Context)object12, n2, string, string2, (cuv)object15, (gto)object13, bl2)) == null) continue;
                    gzy2.d(object, object12);
                }
                return hhk.K(gzy2.a());
            }
            case 9: {
                Object object16 = (ctv)object;
                object = this.a;
                if (object16 == null) {
                    cyr.h("%s: No file entry with key %s", "SharedFileManager", object);
                    return hhk.K(object3);
                }
                object3 = this.b;
                ctt ctt2 = (ctt)object;
                n2 = a.t(ctt2.f);
                if (n2 == 0) {
                    n2 = 1;
                }
                object3 = (egg)object3;
                Object object17 = ((egg)object3).k;
                Object object18 = ((ctv)object16).c;
                object16 = ctt2.e;
                Object object19 = ((egg)object3).d;
                gto gto2 = (gto)((egg)object3).l;
                if ((object17 = crh.f((Context)object17, n2, (String)object18, (String)object16, (cuv)object19, gto2, false)) == null) return fxf.ak(((egg)object3).f.g(ctt2), new cwu(object, 14), (Executor)((egg)object3).a);
                object18 = ((egg)object3).m;
                object16 = ctt2.e;
                ((dmu)object18).e((String)object16, (Uri)object17);
                return fxf.ak(((egg)object3).f.g(ctt2), new cwu(object, 14), (Executor)((egg)object3).a);
            }
            case 8: {
                if ((ctv)object != null) {
                    return hhk.K(true);
                }
                object = this.a;
                egg egg2 = (egg)this.b;
                Object object20 = egg2.l;
                object20 = cqq.z((Context)egg2.k, "gms_icing_mdd_shared_file_manager_metadata", (gto)object20);
                long l3 = object20.getLong("next_file_name_v2", System.currentTimeMillis());
                if (!object20.edit().putLong("next_file_name_v2", 1L + l3).commit()) {
                    cyr.h("%s: Unable to update file name %s", "SharedFileManager", object);
                    return hhk.K(object3);
                }
                object20 = a.ap(l3, "datadownloadfile_");
                object3 = ctv.a.l();
                ctp ctp2 = ctp.b;
                if (!((hwp)object3).b.B()) {
                    ((hwp)object3).u();
                }
                hwv hwv2 = ((hwp)object3).b;
                ctv ctv2 = (ctv)hwv2;
                ctv2.d = ctp2.h;
                ctv2.b = 2 | ctv2.b;
                if (!hwv2.B()) {
                    ((hwp)object3).u();
                }
                hwv2 = (ctv)((hwp)object3).b;
                ((ctv)hwv2).b |= 1;
                ((ctv)hwv2).c = object20;
                object3 = (ctv)((hwp)object3).o();
                return fxf.ak(egg2.f.h((ctt)object, (ctv)object3), new cwu(object, 15), (Executor)egg2.a);
            }
            case 7: {
                Object object21;
                object3 = (ctv)object;
                if (object3 == null) {
                    cyr.g("%s: Unable to read sharedFile from shared preferences.", "SharedFileManager");
                    return hhk.J(new cxk());
                }
                object = object21 = ctp.b(((ctv)object3).d);
                if (object21 == null) {
                    object = ctp.a;
                }
                if (object == ctp.e) return hpj.a;
                object21 = this.a;
                object = this.b;
                ctt ctt3 = (ctt)object21;
                n2 = a.t(ctt3.f);
                if (n2 == 0) {
                    n2 = 1;
                }
                egg egg3 = (egg)object;
                Object object22 = egg3.k;
                object21 = ((ctv)object3).c;
                Object object23 = ctt3.e;
                object = egg3.d;
                gto gto3 = (gto)egg3.l;
                if ((object23 = crh.f((Context)object22, n2, (String)object21, (String)object23, (cuv)object, gto3, false)) != null) {
                    object21 = egg3.m;
                    object = ctt3.e;
                    ((dmu)object21).e((String)object, (Uri)object23);
                }
                object = object21 = ctp.b(((ctv)object3).d);
                if (object21 == null) {
                    object = ctp.a;
                }
                if (object != ctp.c) return hpj.a;
                object = egg3.f;
                object21 = (hwp)((hwv)object3).C(5);
                ((hwp)object21).x((hwv)object3);
                object3 = ctp.b;
                if (!((hwp)object21).b.B()) {
                    ((hwp)object21).u();
                }
                object23 = (ctv)((hwp)object21).b;
                ((ctv)object23).d = ((ctp)object3).h;
                ((ctv)object23).b |= 2;
                return fxf.ak(object.h(ctt3, (ctv)((hwp)object21).o()), new buf(11), (Executor)egg3.a);
            }
            case 6: {
                object = (cxk)object;
                cyr.h("%s: Start download called on file that doesn't exist. Key = %s!", "SharedFileManager", this.a);
                ((egg)this.b).d.a();
                kqr kqr2 = css.a();
                kqr2.b = csr.w;
                kqr2.d = object;
                return hhk.J(kqr2.a());
            }
            case 5: {
                Boolean bl3 = (Boolean)object;
                object = this.a;
                ((cxd)this.b).i((cwq)((Object)object));
                return hhk.K(bl3);
            }
            case 4: {
                object = (Exception)object;
                Object object24 = this.a;
                ((cxd)this.b).i((cwq)((Object)object24));
                return hhk.J((Throwable)object);
            }
            case 3: {
                object = (Void)object;
                object = (hwv)this.a;
                hwp hwp2 = (hwp)((hwv)object).C(5);
                hwp2.x((hwv)object);
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                Object object25 = this.b;
                object3 = (ctq)hwp2.b;
                ctq ctq2 = ctq.a;
                ((ctq)object3).b |= 8;
                ((ctq)object3).f = false;
                object3 = (ctq)hwp2.o();
                object25 = ((cwz)object25).c;
                return ((cwj)object25).q(((cwj)object25).c.g((ctq)object3), new btb((cwj)object25, (hwv)object3, (hwv)object, 17));
            }
            case 2: {
                object = (Void)object;
                object3 = (cxr)this.b;
                cth cth2 = ((cxr)object3).b;
                hyg hyg2 = cth2.c;
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
                ((ctg)object).b |= 0x20;
                ((ctg)object).h = true;
                hyg2 = (ctg)((hwp)hyg2).o();
                hwp hwp3 = (hwp)cth2.C(5);
                hwp3.x(cth2);
                if (!hwp3.b.B()) {
                    hwp3.u();
                }
                object = this.a;
                cth2 = (cth)hwp3.b;
                hyg2.getClass();
                cth2.c = hyg2;
                cth2.b |= 1;
                hyg2 = (cth)hwp3.o();
                object3 = ((cxr)object3).a;
                object = (cwz)object;
                return fxf.aj(((cwz)object).d.l((ctq)object3, (cth)hyg2), new cwt(1), ((cwz)object).i);
            }
            case 1: {
                if ((cwi)((Object)object) != cwi.b) return hpj.a;
                Object object26 = this.b;
                object = this.a;
                object3 = (cth)hhk.S((Future)object26);
                fxf.K(object3);
                object26 = ((cth)object3).d;
                n2 = ((cth)object3).f;
                long l4 = ((cth)object3).s;
                object3 = ((cth)object3).t;
                ((cwz)object).m.e(1034, (String)object26, n2, l4, (String)object3);
                return hpj.a;
            }
            case 0: {
                object = (Void)object;
                Object object27 = this.a;
                object = ((cxr)this.b).b;
                return ((cwz)object27).b((cth)object);
            }
        }
        for (n2 = 0; n2 < n3; ++n2) {
            object3 = this.b;
            object2 = String.valueOf(((Context)object.get(n2)).getFilesDir());
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object2);
            stringBuilder.append("/phenotype/shared/");
            stringBuilder.append((String)object3);
            object2 = new File(stringBuilder.toString());
            Log.i((String)"PhenotypeAccountStore", (String)"Removing snapshots for removed user");
            if (!((File)object2).exists()) continue;
            bl2 = dvv.a((File)object2);
        }
        if (!bl2) return hhk.J(new IOException("Unable to remove snapshots for removed user"));
        return hpj.a;
    }
}

