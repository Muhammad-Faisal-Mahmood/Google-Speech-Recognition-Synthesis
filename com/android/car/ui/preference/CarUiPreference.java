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
import androidx.preference.Preference;
import java.util.function.Consumer;

public class CarUiPreference
extends Preference
implements bkw {
    private Consumer mDisabledClickListener;
    private boolean mIsClickableWhileDisabled = false;
    private Consumer mRestrictedClickListener;
    private boolean mShowChevron;
    private boolean mUxRestricted = false;

    public CarUiPreference(Context context) {
        this(context, null);
    }

    public CarUiPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130968778);
    }

    public CarUiPreference(Context context, AttributeSet attributeSet, int n2) {
        this(context, attributeSet, n2, 2132083173);
    }

    public CarUiPreference(Context context, AttributeSet attributeSet, int n2, int n3) {
        super(context, attributeSet, n2, n3);
        this.init(attributeSet, n2, n3);
    }

    private void init(AttributeSet attributeSet, int n2, int n3) {
        boolean bl2;
        attributeSet = this.getContext().obtainStyledAttributes(attributeSet, bjm.b, n2, n3);
        this.mShowChevron = attributeSet.getBoolean(1, true);
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
    public void onAttached() {
        super.onAttached();
        if (this.getContext().getResources().getBoolean(2131034127) && this.mShowChevron && (this.getOnPreferenceClickListener() != null || this.getIntent() != null || this.getFragment() != null)) {
            this.setWidgetLayoutResource(2131623984);
        }
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

    public void performClickUnrestricted(View view) {
        ((Preference)this).performClick();
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
        throw new UnsupportedOperationException("android:shouldDisableView isunsupported on CarUiPreferences");
    }

    public void setShowChevron(boolean bl2) {
        this.mShowChevron = bl2;
    }

    public void setUxRestricted(boolean bl2) {
        this.mUxRestricted = bl2;
        this.notifyChanged();
    }
}

