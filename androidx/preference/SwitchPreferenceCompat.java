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
 */
package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.preference.TwoStatePreference;

public class SwitchPreferenceCompat
extends TwoStatePreference {
    private final CharSequence a;
    private final CharSequence b;
    private final atr c = new atr(this, 2);

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969929, 0);
        context = context.obtainStyledAttributes(attributeSet, atn.m, 2130969929, 0);
        this.setSummaryOn(kt.r((TypedArray)context, 7, 0));
        this.setSummaryOff(kt.r((TypedArray)context, 6, 1));
        this.a = kt.r((TypedArray)context, 9, 3);
        this.notifyChanged();
        this.b = kt.r((TypedArray)context, 8, 4);
        this.notifyChanged();
        this.setDisableDependentsState(kt.s((TypedArray)context, 5, 2, false));
        context.recycle();
    }

    private final void a(View object) {
        boolean bl2 = object instanceof SwitchCompat;
        if (bl2) {
            ((SwitchCompat)((Object)object)).setOnCheckedChangeListener(null);
        }
        if (object instanceof Checkable) {
            ((Checkable)object).setChecked(this.mChecked);
        }
        if (bl2) {
            object = (SwitchCompat)((Object)object);
            ((SwitchCompat)((Object)object)).e(this.a);
            object.requestLayout();
            if (object.isChecked()) {
                ((SwitchCompat)((Object)object)).b();
            }
            ((SwitchCompat)((Object)object)).d(this.b);
            object.requestLayout();
            if (!object.isChecked()) {
                ((SwitchCompat)((Object)object)).a();
            }
            object.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)this.c);
        }
    }

    @Override
    public final void onBindViewHolder(atm atm2) {
        super.onBindViewHolder(atm2);
        this.a(atm2.a(2131427913));
        this.syncSummaryView(atm2);
    }

    @Override
    public final void performClick(View view) {
        super.performClick(view);
        if (!((AccessibilityManager)this.getContext().getSystemService("accessibility")).isEnabled()) {
            return;
        }
        this.a(view.findViewById(2131427913));
        this.syncSummaryView(view.findViewById(0x1020010));
    }
}

