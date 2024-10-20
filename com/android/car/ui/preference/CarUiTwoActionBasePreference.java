/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 */
package com.android.car.ui.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.android.car.ui.preference.CarUiPreference;
import java.util.function.Consumer;

public abstract class CarUiTwoActionBasePreference
extends CarUiPreference {
    protected boolean mSecondaryActionEnabled = true;
    protected boolean mSecondaryActionVisible = true;

    public CarUiTwoActionBasePreference(Context context) {
        super(context);
        this.init(null);
    }

    public CarUiTwoActionBasePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.init(attributeSet);
    }

    public CarUiTwoActionBasePreference(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        this.init(attributeSet);
    }

    public CarUiTwoActionBasePreference(Context context, AttributeSet attributeSet, int n2, int n3) {
        super(context, attributeSet, n2, n3);
        this.init(attributeSet);
    }

    private static void disallowResourceIds(TypedArray typedArray, int ... nArray) {
        for (int n2 : nArray) {
            if (!typedArray.hasValue(n2)) {
                continue;
            }
            throw new AssertionError((Object)"Setting this attribute is not allowed: ".concat(String.valueOf(typedArray.getResources().getResourceName(n2))));
        }
    }

    protected void init(AttributeSet attributeSet) {
        this.setShowChevron(false);
        TypedArray typedArray = this.getContext().obtainStyledAttributes(attributeSet, bjm.e);
        CarUiTwoActionBasePreference.disallowResourceIds(typedArray, 2, 0, 3, 1);
        attributeSet = this.getContext().obtainStyledAttributes(attributeSet, bjm.g);
        try {
            this.mSecondaryActionVisible = attributeSet.getBoolean(1, true);
            this.mSecondaryActionEnabled = attributeSet.getBoolean(0, true);
            return;
        }
        finally {
            typedArray.recycle();
        }
    }

    public boolean isSecondaryActionEnabled() {
        return this.mSecondaryActionEnabled && this.isEnabled();
    }

    public boolean isSecondaryActionVisible() {
        return this.mSecondaryActionVisible;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void performSecondaryActionClick() {
        if (this.isSecondaryActionEnabled()) {
            if (this.isUxRestricted()) {
                Consumer consumer = this.getOnClickWhileRestrictedListener();
                if (consumer == null) return;
                ag$$ExternalSyntheticApiModelOutline1.m(consumer, (Object)this);
                return;
            }
            this.performSecondaryActionClickInternal();
            return;
        }
        if (!this.isClickableWhileDisabled() || this.getDisabledClickListener() == null) return;
        ag$$ExternalSyntheticApiModelOutline1.m(this.getDisabledClickListener(), (Object)this);
    }

    protected abstract void performSecondaryActionClickInternal();

    @Override
    public void setLayoutResource(int n2) {
        throw new UnsupportedOperationException();
    }

    protected void setLayoutResourceInternal(int n2) {
        super.setLayoutResource(n2);
    }

    public void setSecondaryActionEnabled(boolean bl2) {
        this.mSecondaryActionEnabled = bl2;
        this.notifyChanged();
    }

    public void setSecondaryActionVisible(boolean bl2) {
        this.mSecondaryActionVisible = bl2;
        this.notifyChanged();
    }

    @Override
    public void setWidgetLayoutResource(int n2) {
        throw new UnsupportedOperationException();
    }
}

