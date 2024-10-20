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

public final class NondownloadedLanguageDialogPreference
extends DialogPreference {
    public final byq a;
    private final Context b;

    public NondownloadedLanguageDialogPreference(Context context, byq byq2) {
        super(context);
        this.a = byq2;
        this.b = context;
    }

    @Override
    public final void onBindViewHolder(atm atm2) {
        super.onBindViewHolder(atm2);
        atm2 = (ImageView)atm2.a(16908294);
        kh.p(this.b, (ImageView)atm2);
    }
}

