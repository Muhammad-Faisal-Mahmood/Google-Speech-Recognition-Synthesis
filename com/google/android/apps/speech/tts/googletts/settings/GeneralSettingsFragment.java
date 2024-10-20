/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.View
 */
package com.google.android.apps.speech.tts.googletts.settings;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.preference.DropDownPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreference;
import androidx.preference.TwoStatePreference;

public final class GeneralSettingsFragment
extends ata {
    private static final hei ah = hei.m("com/google/android/apps/speech/tts/googletts/settings/GeneralSettingsFragment");
    public bxf ag;
    private PreferenceScreen ai;
    private btn aj;
    public Context d;

    private final boolean I() {
        fxf.K(this.d);
        return this.d.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    @Override
    public final void G(String string) {
        this.a.f();
        this.E(2132213775, string);
    }

    @Override
    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = this.e().getContext();
        this.d = object;
        this.ag = ((bxd)fvd.l((Context)object, bxd.class)).A();
        this.aj = ((bxd)fvd.l(this.d, bxd.class)).k();
        object = (PreferenceScreen)this.aW(this.d.getString(2132017188));
        this.ai = object;
        fxf.K(object);
        this.ai.setOnPreferenceClickListener(new bww(this, 3));
        object = this.aW(this.d.getString(2132017286));
        fxf.K(object);
        ((Preference)object).setOnPreferenceClickListener(new bww(this, 4));
        if (this.I()) {
            fxf.K(object);
            ((Preference)object).setVisible(false);
            object = this.ai;
            fxf.K(object);
            ((Preference)object).setVisible(false);
        }
        object = this.aW(this.d.getString(2132017434));
        fxf.K(object);
        ((Preference)object).setOnPreferenceClickListener(new bww(this, 5));
        object = this.aW(this.d.getString(2132017308));
        fxf.K(object);
        ((Preference)object).setOnPreferenceClickListener(new bww(this, 6));
        object = (SwitchPreference)this.aW(this.d.getString(2132017315));
        fxf.K(object);
        boolean bl2 = this.ag.a() == 3.981f;
        ((TwoStatePreference)object).setChecked(bl2);
        ((Preference)object).setOnPreferenceChangeListener(new bxc(this, (Preference)object, 1));
        object = (DropDownPreference)this.aW(this.d.getString(2132017311));
        fxf.K(object);
        ((Preference)object).setSummary(((ListPreference)object).getEntry());
        ((ListPreference)object).setValueIndex(((ListPreference)object).findIndexOfValue(this.ag.c()));
        ((Preference)object).setOnPreferenceChangeListener(new bxc(this, (Preference)object, 0));
        object = (SwitchPreference)this.aW(this.d.getString(2132017198));
        fxf.K(object);
        if (this.d.getPackageManager().hasSystemFeature("android.hardware.telephony")) {
            ((TwoStatePreference)object).setChecked(this.ag.h());
            ((Preference)object).setOnPreferenceChangeListener(new bxc(this, (Preference)object, 2));
            return;
        }
        ((heg)((heg)ah.f()).j("com/google/android/apps/speech/tts/googletts/settings/GeneralSettingsFragment", "onCreate", 154, "GeneralSettingsFragment.java")).r("Device does not support mobile data, force-enabling wifi-only setting.");
        this.ag.f(true);
        ((Preference)object).setVisible(false);
    }

    @Override
    public final void onDestroy() {
        this.aj.d();
        super.onDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.ag.g()) {
            fxf.K(this.ai);
            this.ai.setSummary(2132017190);
            return;
        }
        fxf.K(this.ai);
        this.ai.setSummary(2132017189);
    }

    @Override
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.I()) {
            int n2 = this.getResources().getDimensionPixelOffset(2131166561);
            view.requestFocus();
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop() + n2, view.getPaddingRight(), view.getPaddingBottom() + n2);
        }
    }
}

