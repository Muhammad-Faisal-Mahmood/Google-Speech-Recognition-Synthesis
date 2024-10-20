/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 */
package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.PreferenceGroup;

public final class PreferenceScreen
extends PreferenceGroup {
    public final boolean e;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, kt.m(context, 2130969730, 16842891));
        this.e = true;
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    protected final void onClick() {
        ath ath2;
        if (this.getIntent() == null && this.getFragment() == null && this.a() != 0 && (ath2 = this.getPreferenceManager().e) != null) {
            ath2.H();
        }
    }
}

