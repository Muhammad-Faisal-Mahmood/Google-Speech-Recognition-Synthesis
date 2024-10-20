/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.google.android.apps.speech.tts.googletts.settings.asr.NondownloadedLanguageDialogPreference;

public final class byd {
    public static final hfn a = hfn.o("NDLangDialogFragPeer");
    public final byc b;
    public final byx c;
    public final Context d;
    public final dxi e;
    public final gbu f;
    public final gpm g;
    public final byv h = new byv();
    public final byw i = new byw();

    public byd(byc byc2, byx byx2, Context context, dxi dxi2, gbu gbu2, gpm gpm2) {
        this.b = byc2;
        this.c = byx2;
        this.d = context;
        this.e = dxi2;
        this.f = gbu2;
        this.g = gpm2;
    }

    public static boolean a(NondownloadedLanguageDialogPreference nondownloadedLanguageDialogPreference) {
        return nondownloadedLanguageDialogPreference.a.e == 3;
    }
}

