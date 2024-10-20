/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 */
package com.google.android.apps.speech.tts.googletts.settings.asr;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.ListPreference;
import androidx.preference.Preference;

public final class AutoUpdateDialogPreference
extends ListPreference {
    private static final hfn a = hfn.q();

    public AutoUpdateDialogPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(fao fao2) {
        ((hfk)((hfk)a.f()).j("com/google/android/apps/speech/tts/googletts/settings/asr/AutoUpdateDialogPreference", "setValueAndSummary", 26, "AutoUpdateDialogPreference.java")).s("#setValueAndSummary: %d", fao2.e);
        this.setValue(Integer.toString(fao2.e));
        ((Preference)this).setSummary(this.getEntry());
    }
}

