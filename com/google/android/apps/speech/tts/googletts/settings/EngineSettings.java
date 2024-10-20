/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.google.android.apps.speech.tts.googletts.settings;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.speech.tts.googletts.common.NonExpandableAppBarLayoutBehavior;
import com.google.android.apps.speech.tts.googletts.settings.GeneralSettingsFragment;
import com.google.android.material.appbar.AppBarLayout;

public final class EngineSettings
extends bom {
    private AppBarLayout k;

    @Override
    protected final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        if (this.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            object = this.findViewById(2131427581);
            if (object != null) {
                ((ViewGroup)object.getParent()).removeView((View)object);
            }
            object = this.bb();
            y y2 = new y((by)object);
            y2.p(0x1020002, new bwy(), bwy.class.getSimpleName());
            y2.n();
            ((ce)y2).h();
            ((by)object).Y();
            return;
        }
        if (this.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            object = this.findViewById(2131427581);
            if (object != null) {
                ((ViewGroup)object.getParent()).removeView((View)object);
            }
            object = new y(this.bb());
            ((ce)object).p(0x1020002, new GeneralSettingsFragment(), "GeneralSettingsFragment");
            ((ce)object).b();
            return;
        }
        object = new y(this.bb());
        ((ce)object).p(2131427580, new GeneralSettingsFragment(), "GeneralSettingsFragment");
        ((ce)object).b();
        this.setTitle(this.getString(2132017500));
        object = this.getActionBar();
        if (object != null) {
            object.setDisplayHomeAsUpEnabled(true);
            object.setDisplayShowHomeEnabled(true);
        }
        if (object != null && this.getPackageManager().hasSystemFeature("android.software.leanback_only")) {
            object.setDisplayHomeAsUpEnabled(false);
            this.k = object = (AppBarLayout)super.o().d;
            if (object != null) {
                ((AppBarLayout)object).j(false, false);
                object = (rz)this.k.getLayoutParams();
                if (object != null) {
                    ((rz)((Object)object)).b(new NonExpandableAppBarLayoutBehavior());
                }
            }
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.finish();
        return true;
    }

    public final void onWindowFocusChanged(boolean bl2) {
        AppBarLayout appBarLayout;
        super.onWindowFocusChanged(bl2);
        if (bl2 && this.getPackageManager().hasSystemFeature("android.software.leanback_only") && (appBarLayout = this.k) != null) {
            appBarLayout.j(false, false);
        }
    }
}

