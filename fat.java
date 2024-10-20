/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Collection$_EL;
import java.util.Set;

public final class fat {
    public static final hei a = hei.m("com/google/android/libraries/speech/modeldownload/languagepacks/signals/DownloaderCallbacksTrigger");
    public final jnu b;
    private final jnu c;
    private final jnu d;
    private final hpr e;

    public fat(jnu jnu2, jnu jnu3, jnu jnu4, hpr hpr2) {
        this.c = jnu2;
        this.b = jnu3;
        this.d = jnu4;
        this.e = hpr2;
    }

    public final void a(Runnable runnable, String string) {
        grf.g(fxf.ag(runnable, this.e)).j(new cmr(string, 7), this.e);
    }

    public final void b(ezj ezj2) {
        Set set = (Set)((imc)this.c).a;
        if (set.isEmpty()) {
            ((heg)((heg)a.f().h(hfo.a, "LanguagePackCBTrigger")).j("com/google/android/libraries/speech/modeldownload/languagepacks/signals/DownloaderCallbacksTrigger", "onInstallComplete", 43, "DownloaderCallbacksTrigger.java")).u("No #onInstallComplete callbacks registered. Installation finished for %s", ezj2.b());
            return;
        }
        Collection$_EL.stream(set).forEach(new fas(this, ezj2, 0));
    }

    public final void c(ezj ezj2) {
        Set set = (Set)((imc)this.d).a;
        if (set.isEmpty()) {
            ((heg)((heg)a.f().h(hfo.a, "LanguagePackCBTrigger")).j("com/google/android/libraries/speech/modeldownload/languagepacks/signals/DownloaderCallbacksTrigger", "onInstallRequest", 93, "DownloaderCallbacksTrigger.java")).u("No #onInstallRequest callbacks registered. Request logged for %s", ezj2.b());
            return;
        }
        Collection$_EL.stream(set).forEach(new fas(this, ezj2, 3));
    }
}

