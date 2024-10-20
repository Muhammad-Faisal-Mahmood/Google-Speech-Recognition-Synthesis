/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.net.Uri
 *  hom
 */
import android.content.Intent;
import android.net.Uri;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public final class cxe
implements hny {
    public final Object a;
    public final Object b;
    public final Object c;
    private final int d;

    public /* synthetic */ cxe(egg egg2, hwv hwv2, hwv hwv3, int n2) {
        this.d = n2;
        this.a = egg2;
        this.b = hwv2;
        this.c = hwv3;
    }

    public /* synthetic */ cxe(fbm fbm2, cst cst2, ezf ezf2, int n2) {
        this.d = n2;
        this.a = fbm2;
        this.c = cst2;
        this.b = ezf2;
    }

    public /* synthetic */ cxe(Object object, Object object2, Object object3, int n2) {
        this.d = n2;
        this.c = object;
        this.a = object2;
        this.b = object3;
    }

    public /* synthetic */ cxe(Object object, Object object2, Object object3, int n2, byte[] byArray) {
        this.d = n2;
        this.b = object;
        this.c = object2;
        this.a = object3;
    }

    public /* synthetic */ cxe(Object object, Object object2, Object object3, int n2, char[] cArray) {
        this.d = n2;
        this.b = object;
        this.a = object2;
        this.c = object3;
    }

    public /* synthetic */ cxe(Object object, Object object2, Object object3, int n2, short[] sArray) {
        this.d = n2;
        this.c = object;
        this.b = object2;
        this.a = object3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final hpn a(Object object) {
        Object object2;
        Intent intent;
        Object object3;
        fcy fcy2;
        gjh gjh2;
        block44: {
            block43: {
                int n2 = this.d;
                int n3 = 1;
                switch (n2) {
                    default: {
                        gjh2 = (gjh)this.b;
                        fcy2 = gjh2.d(object);
                        object3 = Long.toString(Instant.now().toEpochMilli());
                        fcy2.c.a(dxv.aj.b("timestamp", (String)object3));
                        intent = (Intent)this.c;
                        object = intent.getAction();
                        object2 = intent.getStringExtra("calling_package");
                        if (object != null && ((String)object).equals("android.speech.action.GET_LANGUAGE_DETAILS")) break;
                        break block43;
                    }
                    case 14: {
                        Object object4 = this.c;
                        Object object5 = (gfo)object;
                        jse.e(object4, "$snapshot");
                        Object object6 = this.a;
                        jse.e(object6, "$values");
                        Object object7 = dup.a.l();
                        object = (geq)object4;
                        object4 = ((geq)object).d;
                        if (!((hwp)object7).b.B()) {
                            ((hwp)object7).u();
                        }
                        hwv hwv2 = (dup)((hwp)object7).b;
                        object4.getClass();
                        hwv2.b |= 1;
                        hwv2.c = object4;
                        object4 = duo.a.l();
                        if (!((hwp)object4).b.B()) {
                            ((hwp)object4).u();
                        }
                        hwv2 = (duo)((hwp)object4).b;
                        ((duo)hwv2).c = a.A(4);
                        ((duo)hwv2).b |= 1;
                        if (!((hwp)object7).b.B()) {
                            ((hwp)object7).u();
                        }
                        hwv2 = (dup)((hwp)object7).b;
                        object4 = (duo)((hwp)object4).o();
                        object4.getClass();
                        hwv2.d = object4;
                        hwv2.b |= 2;
                        object7 = ((hwp)object7).o();
                        jse.d(object7, "build(...)");
                        object7 = fvc.u((geq)object, (dup)object7);
                        if (!object5.e((Map)object6, (gft)object7)) {
                            return hhk.K(new gfb(false));
                        }
                        object6 = (gfv)this.b;
                        if (((Boolean)((gfv)object6).p.a()).booleanValue()) {
                            return hhk.K(new gfb(true));
                        }
                        object6 = ((gfv)object6).j.b();
                        object = ((geq)object).e;
                        object5 = ((gft)object7).c;
                        return fxf.aj(((gpm)object6).o((hvu)object, (dup)object5), gqk.b(new fiz(13)), (Executor)hom.a);
                    }
                    case 13: {
                        object = (Void)object;
                        object = ((frr)((AmbientModeSupport$AmbientController)this.c).a).f;
                        Object object8 = this.a;
                        return ((frp)object).d((hny)this.b, (Executor)object8);
                    }
                    case 12: {
                        Object object9 = this.a;
                        object = this.b;
                        return ((frr)this.c).f.d((hny)object, (Executor)object9);
                    }
                    case 11: {
                        Object object10 = this.b;
                        Object object11 = this.a;
                        boolean bl2 = hhk.S((Future)object10).equals(hhk.S((Future)object11));
                        object10 = this.c;
                        if (bl2) {
                            return hhk.K(object);
                        }
                        object = gqk.d(new fbk(object10, object11, 6, null));
                        object10 = (frp)object10;
                        object = hno.g((hpn)object11, (hny)object, ((frp)object10).c);
                        object11 = ((frp)object10).e;
                        // MONITORENTER : object11
                        // MONITOREXIT : object11
                        return object;
                    }
                    case 10: {
                        Object object12 = (String)object;
                        object = (fbm)this.a;
                        object12 = gto.i(((fbm)object).f.getString(2132017314, new Object[]{object12}));
                        cst cst2 = (cst)this.c;
                        cst2.a = object12;
                        cst2.b = gto.i("");
                        cst2.c = gto.h(((ezf)this.b).a.orElse(null));
                        return ((fbm)object).b.c(cst2.a());
                    }
                    case 9: {
                        object = (List)object;
                        dvt dvt2 = (dvt)this.b;
                        if (!dvt2.e) {
                            object = gzx.q("");
                        }
                        gzs gzs2 = new gzs();
                        Iterator iterator = object.iterator();
                        while (true) {
                            Object object13;
                            object = this.c;
                            if (!iterator.hasNext()) return hhk.Y(gzs2.g()).a(new dwp(1), ((dua)object).d());
                            Object object14 = this.a;
                            String string = (String)iterator.next();
                            if (dwa.c.containsKey(new gtp(object14, string))) continue;
                            boolean bl3 = dvt2.c;
                            Object object15 = (String)object14;
                            object14 = (dua)object;
                            object15 = new dwm((dua)object14, (String)object15, string, bl3);
                            if (dvt2.d) {
                                object13 = ((dua)object14).c;
                                object = dvt2.a;
                                object = dvz.a(object13).getString((String)object, "");
                            } else {
                                object = string;
                            }
                            object = ((dwm)object15).a((String)object);
                            object13 = hph.q((hpn)object);
                            Objects.requireNonNull(object15);
                            gzs2.h(hno.g(hno.g((hpn)object13, new cyc(object15, 12), ((dua)object14).d()), new cvq((dua)object14, (hpn)object, dvt2, string, 20), ((dua)object14).d()));
                        }
                    }
                    case 8: {
                        object = (Map)object;
                        iuv iuv2 = hhk.Y(object.values());
                        Object object16 = this.c;
                        return iuv2.a(new cmq((dhn)this.b, (dfi)object16, (Map)object, 4), (Executor)this.a);
                    }
                    case 7: {
                        Throwable throwable = crh.r((Throwable)object);
                        if (throwable instanceof CancellationException) return this.a;
                        object = this.c;
                        dcd dcd2 = new dcd(1);
                        ((cxv)((egg)object).f).a(dcd2);
                        throwable.getMessage();
                        ddb.a();
                        return this.a;
                    }
                    case 6: {
                        Object object17 = (gto)object;
                        if (((gto)object17).g()) {
                            object = this.a;
                            Object object18 = this.c;
                            Object object19 = this.b;
                            cyr.d("%s: Cancel download file %s", "MddFileDownloader", object18);
                            ((hpn)((gto)object17).c()).cancel(true);
                            object17 = (dmu)object19;
                            object18 = (Uri)object18;
                            return ((dmu)object17).c((String)object, (Uri)object18);
                        }
                        cyr.m("%s: stopDownloading on non-existent download", "MddFileDownloader");
                        return hpj.a;
                    }
                    case 5: {
                        Object object20 = (ctv)object;
                        object = (hwp)((hwv)object20).C(5);
                        ((hwp)object).x((hwv)object20);
                        if (!((hwp)object).b.B()) {
                            ((hwp)object).u();
                        }
                        Object object21 = this.c;
                        Object object22 = (ctv)((hwp)object).b;
                        ctv ctv2 = ctv.a;
                        object21 = (ctp)object21;
                        ((ctv)object22).d = ((ctp)object21).h;
                        ((ctv)object22).b |= 2;
                        if (((Enum)object21).equals(ctp.f)) {
                            n3 = ((ctv)object20).h;
                            if (!((hwp)object).b.B()) {
                                ((hwp)object).u();
                            }
                            object20 = (ctv)((hwp)object).b;
                            ((ctv)object20).b |= 0x20;
                            ((ctv)object20).h = n3 + 1;
                        }
                        object20 = this.b;
                        object22 = this.a;
                        object = (ctv)((hwp)object).o();
                        return object22.h((ctt)object20, (ctv)object);
                    }
                    case 4: {
                        object = (Uri)object;
                        object = this.a;
                        Object object23 = ctp.c;
                        hwp hwp2 = (hwp)object;
                        if (!hwp2.b.B()) {
                            hwp2.u();
                        }
                        object = this.c;
                        Object object24 = this.b;
                        ctv ctv3 = (ctv)hwp2.b;
                        ctv ctv4 = ctv.a;
                        ctv3.d = ((ctp)object23).h;
                        ctv3.b |= 2;
                        object23 = (ctv)hwp2.o();
                        return ((egg)object24).f.h((ctt)object, (ctv)object23);
                    }
                    case 3: {
                        cyr.h("%s: reVerifyFile lost or corrupted code %s", "SharedFileManager", (Object)((css)object).a);
                        object = (hwv)this.b;
                        hyg hyg2 = (hwp)((hwv)object).C(5);
                        hyg2.x((hwv)object);
                        ctp ctp2 = ctp.f;
                        if (!hyg2.b.B()) {
                            hyg2.u();
                        }
                        object = this.c;
                        Object object25 = this.a;
                        ctv ctv5 = (ctv)hyg2.b;
                        ctv ctv6 = ctv.a;
                        ctv5.d = ctp2.h;
                        ctv5.b |= 2;
                        hyg2 = (ctv)hyg2.o();
                        object25 = (egg)object25;
                        return dah.e(((egg)object25).f.h((ctt)object, (ctv)hyg2)).g(new buf(13), (Executor)((egg)object25).a);
                    }
                    case 2: {
                        object = (Uri)object;
                        if (object == null) {
                            object = css.a();
                            ((kqr)object).b = csr.A;
                            throw ((kqr)object).a();
                        }
                        Object object26 = this.b;
                        Object object27 = this.a;
                        if (!((ctv)object26).e) {
                            object26 = this.c;
                            object27 = ((egg)object27).g;
                            object26 = (ctf)object26;
                            String string = ((ctf)object26).g;
                            cye.c((bmu)object27, (ctf)object26, (Uri)object, string);
                            return hpj.a;
                        }
                        if (((bmu)((egg)object27).g).B((Uri)object)) {
                            return hpj.a;
                        }
                        object = css.a();
                        ((kqr)object).b = csr.A;
                        throw ((kqr)object).a();
                    }
                    case 1: {
                        Object object28;
                        ctv ctv7 = (ctv)object;
                        object = object28 = ctp.b(ctv7.d);
                        if (object28 == null) {
                            object = ctp.a;
                        }
                        if (object != ctp.e) {
                            return hpj.a;
                        }
                        object28 = this.c;
                        object = this.b;
                        egg egg2 = (egg)this.a;
                        return dah.e(egg2.m((ctt)object)).g(new cxe(egg2, ctv7, (hwv)object28, 2), (Executor)egg2.a).d(css.class, new cxe(egg2, ctv7, (hwv)object, 3), (Executor)egg2.a);
                    }
                    case 0: {
                        Object object29 = this.b;
                        object = (String)object;
                        n2 = a.t(((ctt)object29).f);
                        if (n2 != 0) {
                            n3 = n2;
                        }
                        Object object30 = this.c;
                        object29 = this.a;
                        object30 = ((ctf)object30).g;
                        return ((egg)object29).s(n3, (String)object, (String)object30);
                    }
                }
                object = !intent.getBooleanExtra("com.google.recognition.extra.RETURN_OFFLINE_LANGUAGE_DETAILS", false) ? "Offline not specified" : (object2 != null && fcy2.e.contains(object2) ? "" : "Offline language info not supported");
                break block44;
            }
            object = "Wrong action";
        }
        Object object31 = this.a;
        if (!((String)object).isEmpty()) {
            ((heg)((heg)fcy.a.g()).j("com/google/android/libraries/speech/modelmanager/languagepack/legacy/LanguagePackDetailsReceiver", "onReceive", 127, "LanguagePackDetailsReceiver.java")).u("Error processing the broadcast: %s", object);
            dxi dxi2 = fcy2.c;
            object2 = dxv.ak.c(10);
            ((dyj)object2).r("timestamp", (String)object3);
            dxi2.a((dyk)object2);
            object3 = (gji)object31;
            object = hhk.K(new gji(((gji)object3).a, (String)object, ((gji)object3).c));
            return gjh2.e((hpn)object, fcy2, intent);
        }
        ((heg)((heg)fcy.a.f()).j("com/google/android/libraries/speech/modelmanager/languagepack/legacy/LanguagePackDetailsReceiver", "onReceive", 135, "LanguagePackDetailsReceiver.java")).r("Fetching language pack details");
        fxf.K(object2);
        Object object32 = fcy2.f;
        object = idq.e;
        object32 = ((bqs)object32).b;
        if (object32.containsKey(object2)) {
            object = (idq)bqs.c.a((Integer)object32.get(object2));
        }
        object2 = fcy2.b.c(gto.i(object), hdc.a, Optional.empty());
        object32 = fcy2.b.b(Optional.empty());
        object = fcy2.b.a((idq)object, hdc.a, Optional.empty());
        object = fxf.aE(new hpn[]{object2, object32, object}).B(new fcw(fcy2, (hpn)object2, (hpn)object32, (hpn)object, (gji)object31, (String)object3), fcy2.d);
        return gjh2.e((hpn)object, fcy2, intent);
    }
}

