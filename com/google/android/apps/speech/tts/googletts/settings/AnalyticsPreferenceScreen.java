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
import androidx.preference.SwitchPreference;
import j$.util.Objects;

public final class AnalyticsPreferenceScreen
extends ata {
    private Context ag;
    public SwitchPreference d;

    @Override
    public final void G(String string) {
        this.a.f();
        this.E(2132213761, string);
    }

    public final String I(boolean bl2) {
        String string = bl2 ? this.ag.getString(2132017190) : this.ag.getString(2132017189);
        return string;
    }

    @Override
    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = this.e().getContext();
        this.ag = object;
        bwq bwq2 = ((bxa)fvd.l((Context)object, bxa.class)).m();
        bxf bxf2 = ((bxa)fvd.l(this.ag, bxa.class)).A();
        object = Objects.requireNonNull((SwitchPreference)this.aW(this.ag.getString(2132017188)));
        this.d = object;
        fxf.K(object);
        boolean bl2 = bxf2.g();
        this.d.setChecked(bl2);
        this.d.setTitle(this.I(bl2));
        this.d.setOnPreferenceChangeListener(new bwz(this, bxf2, bwq2, 0));
    }

    @Override
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        fxf.K(this.ag);
        if (this.ag.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            view.requestFocus();
            int n2 = this.getResources().getDimensionPixelOffset(2131165271);
            int n3 = this.getResources().getDimensionPixelOffset(2131165267);
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop() + n2, view.getPaddingRight() + n3, view.getPaddingBottom());
        }
    }
}

