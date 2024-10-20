/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.util.AttributeSet
 *  android.widget.SeekBar
 *  android.widget.TextView
 */
package com.android.car.ui.preference;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.DialogPreference;

public class CarUiSeekBarDialogPreference
extends DialogPreference
implements DialogInterface.OnClickListener,
bkw {
    public int a;
    public SeekBar b;
    public TextView c;
    public TextView d;
    public TextView e;
    public int f = 100;

    public CarUiSeekBarDialogPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setDialogLayoutResource(2131624016);
        this.setPositiveButtonText(2132017219);
        this.setNegativeButtonText(2132017218);
    }

    @Override
    public final void onAttached() {
        super.onAttached();
        this.a = this.getPersistedInt(0);
    }

    @Override
    public final void onBindViewHolder(atm atm2) {
        super.onBindViewHolder(atm2);
        bnv.o(atm2.itemView, false);
    }

    public final /* synthetic */ void onClick(DialogInterface dialogInterface, int n2) {
    }

    @Override
    public final void performClick() {
        if (!this.isEnabled()) {
            this.isSelectable();
        }
        super.performClick();
    }
}

