/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Collection$_EL;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.Collection;
import java.util.Locale;

public final class fcf {
    public static final hei a = hei.m("com/google/android/libraries/speech/modelmanager/languagepack/ModelManagerImpl");
    public final fbt b;
    public final hpr c;
    public final Optional d;
    public final Optional e;
    public final Optional f;
    public final fch g;
    public final feh h;
    private final fep i;

    public fcf(fbt fbt2, fep fep2, feh feh2, hpr hpr2, Optional optional, Optional optional2, Optional optional3, fch fch2) {
        this.h = feh2;
        this.b = fbt2;
        this.i = fep2;
        this.c = hpr2;
        this.d = optional;
        this.e = optional2;
        this.f = optional3;
        this.g = fch2;
    }

    public static gzx a(hav hav2) {
        return ((gzm)((hav)Collection$_EL.stream(hav2).map(new fab(17)).map(new fab(18)).collect(gye.b))).f();
    }

    public static String c(Collection collection) {
        return Collection$_EL.stream(collection).map(new fab(16)).collect(Collectors.joining(", "));
    }

    public static final void e(Optional optional) {
        optional.ifPresent(new fbw(4));
    }

    public final hpn b(String object, idq idq2, hav hav2) {
        ((heg)((heg)a.b().h(hfo.a, "ModelManagerImpl")).j("com/google/android/libraries/speech/modelmanager/languagepack/ModelManagerImpl", "getRecognitionSupport", 79, "ModelManagerImpl.java")).G("#getRecognitionSupport: %s, %s, %s", object, idq2, hav2);
        hpn hpn2 = this.b.c(gto.i(idq2), hav2, Optional.of(object));
        hpn hpn3 = this.b.b(Optional.of(object));
        object = Optional.of(object);
        object = this.b.a(idq2, hav2, (Optional)object);
        return fxf.aE(new hpn[]{hpn2, hpn3, object}).B(new cmq(object, (Object)hpn2, (Object)hpn3, 9, null), this.c);
    }

    public final void d(String string, Locale locale, boolean bl2, Optional optional, idq object) {
        ((heg)((heg)a.b().h(hfo.a, "ModelManagerImpl")).j("com/google/android/libraries/speech/modelmanager/languagepack/ModelManagerImpl", "triggerModelDownload", 155, "ModelManagerImpl.java")).H("#triggerModelDownload: %s, skipUserConfirmation: %s, useDownloadListener: %s, application Domain: %s", locale, bl2, optional, object);
        Object object2 = new bme(string, 16);
        this.e.ifPresent(object2);
        object2 = ((Enum)object).equals(idq.a) ? gsl.a : gto.i(object);
        object = fxf.ak(this.b.c((gto)object2, hdc.a, Optional.of(string)), new fbl(this, locale, (idq)object, string, 2), this.c);
        object2 = this.i;
        String string2 = locale.toLanguageTag();
        object2 = grf.g(((fep)object2).a()).i(new ezz(string2, 11), ((fep)object2).c);
        fxf.al(fxf.aE(new hpn[]{object, object2}).B(new fcb(this, (hpn)object, optional, string, (hpn)object2, bl2, locale), this.c), new enb((Object)this, string, optional, 6), this.c);
    }
}

