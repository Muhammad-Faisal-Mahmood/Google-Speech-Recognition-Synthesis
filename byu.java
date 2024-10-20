/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Optional;
import java.util.Locale;

public final class byu
implements byp {
    public static final hfn a = hfn.o("LPSettingsDataService");
    public final hpq b;
    public final ezl c;
    public final ezs d;
    public final ezk e;
    public final dxi f;
    public final bmu g;
    private final fep h;

    public byu(hpq hpq2, ezl ezl2, ezs ezs2, ezk ezk2, bmu bmu2, fep fep2, dxi dxi2) {
        this.b = hpq2;
        this.c = ezl2;
        this.d = ezs2;
        this.e = ezk2;
        this.g = bmu2;
        this.h = fep2;
        this.f = dxi2;
    }

    private final hpn g() {
        return fxf.aj(this.h.a(), new ain(6), this.b);
    }

    @Override
    public final hpn a(Locale serializable, int n2) {
        String string = serializable.toLanguageTag();
        Optional optional = Optional.empty();
        serializable = gsl.a;
        Optional<csn> optional2 = Optional.of(csn.b);
        return grf.g(this.d.e(string, n2, optional, (gto)serializable, optional2)).i(new bps(this, 8), this.b).h(new brk(this, 5), this.b);
    }

    @Override
    public final hpn b(fao object) {
        ((hfk)((hfk)ezk.a.b()).j("com/google/android/libraries/speech/modeldownload/languagepacks/LanguagePackDownloadSettingsState", "setBackgroundDownloadCondition", 59, "LanguagePackDownloadSettingsState.java")).r("setBackgroundDownloadCondition");
        ezk ezk2 = this.e;
        ezk2.c.a(dxv.ag);
        object = new eex(object, 12);
        hpq hpq2 = ezk2.d;
        return fxf.aj(ezk2.e.b((gte)object, hpq2), new ain(5), this.b);
    }

    @Override
    public final hpn c(Locale locale) {
        ezs ezs2 = this.d;
        ezs2.d.a(dxv.af);
        ezu ezu2 = ezs2.c;
        bzo bzo2 = fde.f(faq.b.l());
        bzo2.R(locale.toLanguageTag());
        return fxf.aj(grf.g(ezu2.b(bzo2.Q())).i(new cyc(new etv(ezs2, 5), 16), ezs2.f).i(new cyc(new ezq(ezs2, locale, 0), 17), ezs2.f), new brk(this, 4), this.b);
    }

    @Override
    public final gds d() {
        return new gds(new fck(this, 1), "LanguagePackSettings:downloadCondition");
    }

    @Override
    public final gds e() {
        ((hfk)((hfk)a.b()).j("com/google/android/apps/speech/tts/googletts/settings/asr/dataservice/impl/LanguagePackSettingsDataServiceImpl", "getInstalledLocalesSource", 175, "LanguagePackSettingsDataServiceImpl.java")).r("#getInstalledLocalesSource()");
        return new gds(new byt(this, this.g(), 0), "LanguagePackSettings:installedPacks");
    }

    @Override
    public final gds f() {
        ((hfk)((hfk)a.b()).j("com/google/android/apps/speech/tts/googletts/settings/asr/dataservice/impl/LanguagePackSettingsDataServiceImpl", "getSupportedLocalesSource", 96, "LanguagePackSettingsDataServiceImpl.java")).r("#getSupportedLocalesSource()");
        return new gds(new byt(this, this.g(), 1), "LanguagePackSettings:supportedPacks");
    }
}

