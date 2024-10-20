/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 */
package com.android.car.ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.android.car.ui.preference.CarUiSwitchPreference;

public class CarUiPrimarySwitchPreference
extends CarUiSwitchPreference {
    private View a;

    public CarUiPrimarySwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setLayoutResource(2131623994);
    }

    @Override
    public final void onBindViewHolder(atm atm2) {
        super.onBindViewHolder(atm2);
        atm2 = atm2.itemView;
        this.a = atm2;
        atm2.setActivated(this.isChecked());
    }

    @Override
    public final void setChecked(boolean bl2) {
        super.setChecked(bl2);
        View view = this.a;
        if (view != null) {
            view.setActivated(bl2);
        }
    }
}

