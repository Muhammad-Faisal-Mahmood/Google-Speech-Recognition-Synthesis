/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.SwitchPreference;

public final class bzk
extends bzl {
    public static final hei a = hei.m("com/google/android/apps/speech/tts/googletts/settings/asr/voiceime/ui/VoiceImeSettingsFragmentPeer");
    public final bzg b;
    public final fmj c;
    public final gbu d;
    public final grn e;
    public final byp f;
    public final byl g;
    public final geg h = new bzh(this);
    public final gbv i = new bzi(this);
    public final gbv j = new bzj(this);
    public final goi k;

    public bzk(bzg bzg2, fmj fmj2, goi goi2, gbu gbu2, grn grn2, byp byp2, dxi dxi2, Context context) {
        this.b = bzg2;
        this.c = fmj2;
        this.k = goi2;
        this.d = gbu2;
        this.e = grn2;
        this.f = byp2;
        this.g = new byl(bzg2, grn2, byp2, gbu2, dxi2, context);
    }

    public final ListPreference a() {
        return (ListPreference)this.b.aW("primary_language");
    }

    public final MultiSelectListPreference b() {
        return (MultiSelectListPreference)this.b.aW("voice_languages");
    }

    public final SwitchPreference c() {
        return (SwitchPreference)this.b.aW("profanity_filter");
    }
}

