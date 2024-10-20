/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.speech.tts.googletts.settings.asr.DownloadedLanguageDialogPreference;
import java.util.Locale;

public final class bxs {
    public static final hfn a = hfn.o("DLangDialogFragPeer");
    public final bxr b;
    public final gbu c;
    public final Context d;
    public final dxi e;
    public final gpm f;
    public final byw g = new byw();
    public final byv h = new byv();
    private final byx i;

    public bxs(bxr bxr2, byx byx2, gbu gbu2, Context context, dxi dxi2, gpm gpm2) {
        this.b = bxr2;
        this.i = byx2;
        this.c = gbu2;
        this.d = context;
        this.e = dxi2;
        this.f = gpm2;
    }

    public static bxr a(String string) {
        ((hfk)((hfk)a.b()).j("com/google/android/apps/speech/tts/googletts/settings/asr/DownloadedLanguageDialogFragmentPeer", "create", 56, "DownloadedLanguageDialogFragmentPeer.java")).r("DownloadedLanguageDialogFragment constructor");
        bxr bxr2 = new bxr();
        iln.e(bxr2);
        Bundle bundle = new Bundle();
        bundle.putString("key", string);
        bxr2.setArguments(bundle);
        return bxr2;
    }

    public static String b(byq byq2) {
        String string = byq2.d;
        if (string.equals("Speech Enhancement")) {
            return kh.n(byq2.a.b);
        }
        return string;
    }

    public static boolean e(DownloadedLanguageDialogPreference downloadedLanguageDialogPreference) {
        return downloadedLanguageDialogPreference.a.c;
    }

    public static boolean f(DownloadedLanguageDialogPreference downloadedLanguageDialogPreference) {
        return downloadedLanguageDialogPreference.a.e == 3;
    }

    public static boolean g(DownloadedLanguageDialogPreference downloadedLanguageDialogPreference) {
        return downloadedLanguageDialogPreference.a.b.g() && downloadedLanguageDialogPreference.a.e == 2;
    }

    public final void c(DownloadedLanguageDialogPreference object) {
        ((hfk)((hfk)a.f()).j("com/google/android/apps/speech/tts/googletts/settings/asr/DownloadedLanguageDialogFragmentPeer", "onDownloadButtonClick", 160, "DownloadedLanguageDialogFragmentPeer.java")).r("#onClick starting LP download");
        Locale locale = ((ezj)((DownloadedLanguageDialogPreference)object).a.b.c()).a;
        int n2 = ((ezj)((DownloadedLanguageDialogPreference)object).a.b.c()).b;
        this.i.a(this.h, locale, n2);
        object = dxv.ar.c(1);
        this.e.a((dyk)object);
    }

    public final void d(DownloadedLanguageDialogPreference object) {
        ((hfk)((hfk)a.f()).j("com/google/android/apps/speech/tts/googletts/settings/asr/DownloadedLanguageDialogFragmentPeer", "onUninstallButtonClick", 169, "DownloadedLanguageDialogFragmentPeer.java")).r("#onClick starting LP uninstall");
        object = ((DownloadedLanguageDialogPreference)object).a.a.a;
        this.i.b(this.g, (Locale)object);
        object = dxv.ar.c(1);
        this.e.a((dyk)object);
    }
}

