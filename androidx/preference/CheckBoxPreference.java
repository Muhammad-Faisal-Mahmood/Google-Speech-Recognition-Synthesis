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
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 */
package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.preference.TwoStatePreference;

public class CheckBoxPreference
extends TwoStatePreference {
    private final atr a;

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        int n2 = kt.m(context, 2130968805, 16842895);
        super(context, attributeSet, n2, 0);
        this.a = new atr(this, 1);
        context = context.obtainStyledAttributes(attributeSet, atn.b, n2, 0);
        this.setSummaryOn(kt.r((TypedArray)context, 5, 0));
        this.setSummaryOff(kt.r((TypedArray)context, 4, 1));
        this.setDisableDependentsState(kt.s((TypedArray)context, 3, 2, false));
        context.recycle();
    }

    private final void a(View view) {
        boolean bl2 = view instanceof CompoundButton;
        if (bl2) {
            ((CompoundButton)view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable)view).setChecked(this.mChecked);
        }
        if (bl2) {
            ((CompoundButton)view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)this.a);
        }
    }

    @Override
    public final void onBindViewHolder(atm atm2) {
        super.onBindViewHolder(atm2);
        this.a(atm2.a(0x1020001));
        this.syncSummaryView(atm2);
    }

    @Override
    public final void performClick(View view) {
        super.performClick(view);
        if (!((AccessibilityManager)this.getContext().getSystemService("accessibility")).isEnabled()) {
            return;
        }
        this.a(view.findViewById(0x1020001));
        this.syncSummaryView(view.findViewById(0x1020010));
    }
}

