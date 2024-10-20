/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.widget.ImageView
 */
package com.google.android.apps.speech.tts.googletts.settings.asr;

import android.content.Context;
import android.widget.ImageView;
import androidx.preference.DialogPreference;

public final class DownloadedLanguageDialogPreference
extends DialogPreference {
    private static final hfn b = hfn.o("DownloadedLPDialogPref");
    public final byq a;
    private final Context c;

    public DownloadedLanguageDialogPreference(Context context, byq byq2) {
        super(context);
        ((hfk)((hfk)b.b()).j("com/google/android/apps/speech/tts/googletts/settings/asr/DownloadedLanguageDialogPreference", "<init>", 24, "DownloadedLanguageDialogPreference.java")).r("DownloadedLanguageDialogPreference constructor");
        this.a = byq2;
        this.c = context;
        if (!byq2.c && !byq2.b.g()) {
            this.setEnabled(false);
        }
    }

    @Override
    public final void onBindViewHolder(atm atm2) {
        super.onBindViewHolder(atm2);
        atm2 = (ImageView)atm2.a(16908294);
        kh.p(this.c, (ImageView)atm2);
    }
}

