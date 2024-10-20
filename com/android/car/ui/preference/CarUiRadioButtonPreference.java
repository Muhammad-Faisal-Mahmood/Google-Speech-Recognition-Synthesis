/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.widget.RadioButton
 */
package com.android.car.ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.preference.TwoStatePreference;

public class CarUiRadioButtonPreference
extends TwoStatePreference
implements bkw {
    public CarUiRadioButtonPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, bnv.c(context, 2130969731, 16842894), 0);
        this.setLayoutResource(2131623981);
        this.setWidgetLayoutResource(2131624008);
    }

    @Override
    public final void onBindViewHolder(atm atm2) {
        super.onBindViewHolder(atm2);
        ((RadioButton)bnv.h(atm2.itemView, 2131427820)).setChecked(this.isChecked());
        bnv.o(atm2.itemView, false);
    }

    @Override
    public final void performClick() {
        if (!this.isEnabled()) {
            this.isSelectable();
        }
        super.performClick();
    }
}

