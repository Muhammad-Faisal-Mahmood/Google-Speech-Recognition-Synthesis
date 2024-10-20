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
import androidx.preference.SwitchPreference;
import java.util.function.Consumer;

public class CarUiSwitchPreference
extends SwitchPreference
implements bkw {
    private Consumer mDisabledClickListener;
    private boolean mIsClickableWhileDisabled = false;
    private Consumer mRestrictedClickListener;
    private boolean mUxRestricted = false;

    public CarUiSwitchPreference(Context context) {
        super(context);
        this.init(null);
    }

    public CarUiSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.init(attributeSet);
    }

    public CarUiSwitchPreference(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        this.init(attributeSet);
    }

    public CarUiSwitchPreference(Context context, AttributeSet attributeSet, int n2, int n3) {
        super(context, attributeSet, n2, n3);
        this.init(attributeSet);
    }

    private void init(AttributeSet attributeSet) {
        boolean bl2;
        attributeSet = this.getContext().obtainStyledAttributes(attributeSet, bjm.b);
        this.mUxRestricted = attributeSet.getBoolean(2, false);
        this.mIsClickableWhileDisabled = bl2 = attributeSet.getBoolean(0, false);
        if (bl2) {
            super.setShouldDisableView(false);
        }
        attributeSet.recycle();
    }

    public Consumer getDisabledClickListener() {
        return this.mDisabledClickListener;
    }

    public Consumer getOnClickWhileRestrictedListener() {
        return this.mRestrictedClickListener;
    }

    public boolean isClickableWhileDisabled() {
        return this.mIsClickableWhileDisabled;
    }

    public boolean isUxRestricted() {
        return this.mUxRestricted;
    }

    @Override
    public void onBindViewHolder(atm atm2) {
        super.onBindViewHolder(atm2);
        bnv.n(atm2.itemView, this.isEnabled(), this.isUxRestricted());
    }

    @Override
    public void performClick() {
        block8: {
            block7: {
                block6: {
                    if (this.isEnabled() || !this.mIsClickableWhileDisabled) break block6;
                    Consumer consumer = this.mDisabledClickListener;
                    if (consumer != null) {
                        ag$$ExternalSyntheticApiModelOutline1.m(consumer, (Object)this);
                        return;
                    }
                    break block7;
                }
                if (!this.isEnabled() && !this.isSelectable() || !this.isUxRestricted()) break block8;
                Consumer consumer = this.mRestrictedClickListener;
                if (consumer != null) {
                    ag$$ExternalSyntheticApiModelOutline1.m(consumer, (Object)this);
                }
            }
            return;
        }
        super.performClick();
    }

    public void setClickableWhileDisabled(boolean bl2) {
        if (this.mIsClickableWhileDisabled != bl2) {
            super.setShouldDisableView(bl2 ^ true);
            this.mIsClickableWhileDisabled = bl2;
            this.notifyChanged();
        }
    }

    public void setDisabledClickListener(Consumer consumer) {
        this.mDisabledClickListener = consumer;
    }

    public /* synthetic */ void setMessageToShowWhenDisabledPreferenceClicked(String string) {
        blf.c();
    }

    public void setOnClickWhileRestrictedListener(Consumer consumer) {
        this.mRestrictedClickListener = consumer;
    }

    @Override
    public void setShouldDisableView(boolean bl2) {
        throw new UnsupportedOperationException("Dynamically setting shouldDisableView isunsupported in CarUiPreferences");
    }

    public void setUxRestricted(boolean bl2) {
        if (this.mUxRestricted != bl2) {
            this.mUxRestricted = bl2;
            this.notifyChanged();
        }
    }
}

