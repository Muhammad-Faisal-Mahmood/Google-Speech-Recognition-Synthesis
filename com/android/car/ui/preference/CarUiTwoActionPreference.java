/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.android.car.ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.android.car.ui.preference.CarUiPreference;

@Deprecated
public class CarUiTwoActionPreference
extends CarUiPreference {
    private boolean mIsActionShown;

    public CarUiTwoActionPreference(Context context) {
        super(context);
        this.init(null);
    }

    public CarUiTwoActionPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.init(attributeSet);
    }

    public CarUiTwoActionPreference(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        this.init(attributeSet);
    }

    public CarUiTwoActionPreference(Context context, AttributeSet attributeSet, int n2, int n3) {
        super(context, attributeSet, n2, n3);
        this.init(attributeSet);
    }

    private void init(AttributeSet attributeSet) {
        this.setLayoutResource(2131624028);
        attributeSet = this.getContext().obtainStyledAttributes(attributeSet, bjm.g);
        this.mIsActionShown = attributeSet.getBoolean(1, true);
        this.setShowChevron(false);
        attributeSet.recycle();
    }

    public boolean isActionShown() {
        return this.mIsActionShown;
    }

    @Override
    public void onBindViewHolder(atm object) {
        super.onBindViewHolder((atm)object);
        View view = bnv.h(((atm)object).itemView, 2131427503);
        View view2 = bnv.h(((atm)object).itemView, 2131427412);
        View view3 = bnv.h(((atm)object).itemView, 16908312);
        ((atm)object).itemView.setFocusable(this.mIsActionShown ^ true);
        boolean bl2 = this.mIsActionShown;
        object = null;
        if (bl2) {
            object = new gp(this, 7, null);
        }
        view.setOnClickListener((View.OnClickListener)object);
        view.setClickable(this.mIsActionShown);
        view.setFocusable(this.mIsActionShown);
        int n2 = true != this.mIsActionShown ? 8 : 0;
        view2.setVisibility(n2);
        view3.setFocusable(this.mIsActionShown);
        if (this.mIsActionShown) {
            this.onBindWidgetFrame(view3);
        }
    }

    protected void onBindWidgetFrame(View view) {
    }

    public void showAction(boolean bl2) {
        this.mIsActionShown = bl2;
        this.notifyChanged();
    }
}

