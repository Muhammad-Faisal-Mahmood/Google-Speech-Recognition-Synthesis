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
import androidx.preference.EditTextPreference;
import java.util.function.Consumer;

public class CarUiEditTextPreference
extends EditTextPreference
implements bkw {
    private Consumer mRestrictedClickListener;
    private boolean mShowChevron;
    private boolean mUxRestricted;

    public CarUiEditTextPreference(Context context) {
        this(context, null);
    }

    public CarUiEditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bnv.c(context, 2130969117, 16842898));
    }

    public CarUiEditTextPreference(Context context, AttributeSet attributeSet, int n2) {
        this(context, attributeSet, n2, 0);
    }

    public CarUiEditTextPreference(Context context, AttributeSet attributeSet, int n2, int n3) {
        super(context, attributeSet, n2, n3);
        this.init(attributeSet, n2, n3);
    }

    private void init(AttributeSet attributeSet, int n2, int n3) {
        attributeSet = this.getContext().obtainStyledAttributes(attributeSet, bjm.b, n2, n3);
        this.mShowChevron = attributeSet.getBoolean(1, true);
        this.mUxRestricted = attributeSet.getBoolean(2, false);
        attributeSet.recycle();
    }

    public Consumer getOnClickWhileRestrictedListener() {
        return this.mRestrictedClickListener;
    }

    public View getWidgetActionContainer(atm atm2) {
        return bnv.h(atm2.itemView, 2131427412);
    }

    public boolean isUxRestricted() {
        return this.mUxRestricted;
    }

    @Override
    public void onAttached() {
        super.onAttached();
        if (this.getContext().getResources().getBoolean(2131034127) && this.mShowChevron) {
            this.setWidgetLayoutResource(2131623984);
        }
    }

    @Override
    public void onBindViewHolder(atm atm2) {
        super.onBindViewHolder(atm2);
        bnv.o(atm2.itemView, this.isUxRestricted());
    }

    @Override
    public void performClick() {
        if ((this.isEnabled() || this.isSelectable()) && this.isUxRestricted()) {
            Consumer consumer = this.mRestrictedClickListener;
            if (consumer != null) {
                ag$$ExternalSyntheticApiModelOutline1.m(consumer, (Object)this);
            }
            return;
        }
        super.performClick();
    }

    public void setOnClickWhileRestrictedListener(Consumer consumer) {
        this.mRestrictedClickListener = consumer;
    }

    public void setShowChevron(boolean bl2) {
        this.mShowChevron = bl2;
    }

    protected void setTwoActionLayout() {
        this.setLayoutResource(2131624028);
    }

    public void setUxRestricted(boolean bl2) {
        if (bl2 != this.mUxRestricted) {
            this.mUxRestricted = bl2;
            this.notifyChanged();
        }
    }
}

