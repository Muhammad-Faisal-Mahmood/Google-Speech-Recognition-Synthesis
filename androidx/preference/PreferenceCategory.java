/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 */
package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import androidx.preference.PreferenceGroup;

public class PreferenceCategory
extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, kt.m(context, 2130969723, 16842892), null);
    }

    @Override
    public final boolean isEnabled() {
        return false;
    }

    @Override
    public final void onBindViewHolder(atm atm2) {
        super.onBindViewHolder(atm2);
        if (Build.VERSION.SDK_INT >= 28) {
            fs$$ExternalSyntheticApiModelOutline0.m(atm2.itemView, true);
        }
    }

    @Override
    public final boolean shouldDisableDependents() {
        return !super.isEnabled();
    }
}

