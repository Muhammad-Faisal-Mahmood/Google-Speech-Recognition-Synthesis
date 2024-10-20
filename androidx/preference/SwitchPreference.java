/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.accessibility.AccessibilityManager
 *  android.widget.Checkable
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.Switch
 */
package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.preference.TwoStatePreference;

public class SwitchPreference
extends TwoStatePreference {
    private final atr mListener = new atr(this, 0);
    private CharSequence mSwitchOff;
    private CharSequence mSwitchOn;

    public SwitchPreference(Context context) {
        this(context, null);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, kt.m(context, 2130969930, 16843629));
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int n2) {
        this(context, attributeSet, n2, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int n2, int n3) {
        super(context, attributeSet, n2, n3);
        context = context.obtainStyledAttributes(attributeSet, atn.l, n2, n3);
        this.setSummaryOn(kt.r((TypedArray)context, 7, 0));
        this.setSummaryOff(kt.r((TypedArray)context, 6, 1));
        this.setSwitchTextOn(kt.r((TypedArray)context, 9, 3));
        this.setSwitchTextOff(kt.r((TypedArray)context, 8, 4));
        this.setDisableDependentsState(kt.s((TypedArray)context, 5, 2, false));
        context.recycle();
    }

    private void syncSwitchView(View view) {
        boolean bl2 = view instanceof Switch;
        if (bl2) {
            ((Switch)view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable)view).setChecked(this.mChecked);
        }
        if (bl2) {
            view = (Switch)view;
            view.setTextOn(this.mSwitchOn);
            view.setTextOff(this.mSwitchOff);
            view.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)this.mListener);
        }
    }

    private void syncViewIfAccessibilityEnabled(View view) {
        if (!((AccessibilityManager)this.getContext().getSystemService("accessibility")).isEnabled()) {
            return;
        }
        this.syncSwitchView(view.findViewById(16908352));
        this.syncSummaryView(view.findViewById(0x1020010));
    }

    public CharSequence getSwitchTextOff() {
        return this.mSwitchOff;
    }

    public CharSequence getSwitchTextOn() {
        return this.mSwitchOn;
    }

    @Override
    public void onBindViewHolder(atm atm2) {
        super.onBindViewHolder(atm2);
        this.syncSwitchView(atm2.a(16908352));
        this.syncSummaryView(atm2);
    }

    @Override
    public void performClick(View view) {
        super.performClick(view);
        this.syncViewIfAccessibilityEnabled(view);
    }

    public void setSwitchTextOff(int n2) {
        this.setSwitchTextOff(this.getContext().getString(n2));
    }

    public void setSwitchTextOff(CharSequence charSequence) {
        this.mSwitchOff = charSequence;
        this.notifyChanged();
    }

    public void setSwitchTextOn(int n2) {
        this.setSwitchTextOn(this.getContext().getString(n2));
    }

    public void setSwitchTextOn(CharSequence charSequence) {
        this.mSwitchOn = charSequence;
        this.notifyChanged();
    }
}

