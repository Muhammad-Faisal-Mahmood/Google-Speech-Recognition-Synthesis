/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 */
package com.android.car.ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.ListPreference;
import java.util.function.Consumer;

public class CarUiListPreference
extends ListPreference
implements bkw {
    private Consumer mRestrictedClickListener;
    private boolean mUxRestricted = false;

    public CarUiListPreference(Context context) {
        this(context, null);
    }

    public CarUiListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130968778);
    }

    public CarUiListPreference(Context context, AttributeSet attributeSet, int n2) {
        this(context, attributeSet, n2, 2132083173);
    }

    public CarUiListPreference(Context context, AttributeSet attributeSet, int n2, int n3) {
        super(context, attributeSet, n2, n3);
        this.init(attributeSet, n2, n3);
    }

    private void init(AttributeSet attributeSet, int n2, int n3) {
        attributeSet = this.getContext().obtainStyledAttributes(attributeSet, bjm.b, n2, n3);
        this.mUxRestricted = attributeSet.getBoolean(2, false);
        attributeSet.recycle();
    }

    public Consumer getOnClickWhileRestrictedListener() {
        return this.mRestrictedClickListener;
    }

    public boolean isUxRestricted() {
        return this.mUxRestricted;
    }

    @Override
    public void onAttached() {
        super.onAttached();
        if (!this.getContext().getResources().getBoolean(2131034127)) {
            return;
        }
        this.setWidgetLayoutResource(2131623984);
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

    public void setUxRestricted(boolean bl2) {
        if (bl2 != this.mUxRestricted) {
            this.mUxRestricted = bl2;
            this.notifyChanged();
        }
    }
}

