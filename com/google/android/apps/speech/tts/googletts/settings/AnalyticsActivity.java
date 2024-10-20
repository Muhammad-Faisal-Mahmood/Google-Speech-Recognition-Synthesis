/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.MenuItem
 */
package com.google.android.apps.speech.tts.googletts.settings;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.apps.speech.tts.googletts.settings.AnalyticsPreferenceScreen;

public final class AnalyticsActivity
extends bom {
    @Override
    protected final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = new y(this.bb());
        ((ce)object).p(2131427580, new AnalyticsPreferenceScreen(), "AnalyticsPreferenceScreen");
        ((ce)object).b();
        this.setTitle(this.getString(2132017191));
        object = this.getActionBar();
        if (object != null) {
            boolean bl2 = this.getPackageManager().hasSystemFeature("android.software.leanback_only") ^ true;
            object.setDisplayHomeAsUpEnabled(bl2);
            object.setDisplayShowHomeEnabled(bl2);
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.finish();
        return true;
    }
}

