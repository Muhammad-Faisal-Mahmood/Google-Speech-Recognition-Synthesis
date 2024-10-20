/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Optional;
import java.util.Locale;

public final class fch {
    public static final hei a = hei.m("com/google/android/libraries/speech/modelmanager/languagepack/ScheduleDownloadHelper");
    public final Optional b;
    private final fbt c;
    private final hpr d;
    private final feh e;

    public fch(fbt fbt2, feh feh2, hpr hpr2, Optional optional) {
        this.e = feh2;
        this.c = fbt2;
        this.d = hpr2;
        this.b = optional;
    }

    public static final void b(Optional optional, int n2) {
        optional.ifPresent(new fcc(n2, 2));
    }

    public final void a(String string, Locale object, ezj ezj2, Optional optional, boolean bl2) {
        ((heg)((heg)a.f().h(hfo.a, "ScheduleDownloadHelper")).j("com/google/android/libraries/speech/modelmanager/languagepack/ScheduleDownloadHelper", "scheduleDownload", 53, "ScheduleDownloadHelper.java")).r("start scheduling languagePack download");
        Optional<Object> optional2 = new bme(string, 19);
        this.b.ifPresent(optional2);
        optional2 = this.d;
        optional2 = new fby(string, optional, this.b, ezj2, (hpr)((Object)optional2), this.e);
        object = ((Locale)object).toLanguageTag();
        optional2 = Optional.of(optional2);
        int n2 = ezj2.b;
        fxf.al(this.c.d((String)object, n2, optional2, bl2), new enb((Object)this, string, optional, 7), this.d);
    }
}

