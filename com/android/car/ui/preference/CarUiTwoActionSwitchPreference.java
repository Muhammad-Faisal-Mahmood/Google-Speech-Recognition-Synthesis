/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.widget.Switch
 */
package com.android.car.ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Switch;
import com.android.car.ui.preference.CarUiTwoActionBasePreference;
import java.util.function.Consumer;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class CarUiTwoActionSwitchPreference
extends CarUiTwoActionBasePreference {
    private boolean mSecondaryActionChecked;
    protected Consumer mSecondaryActionOnClickListener;
    private Switch mSwitchWidget;
    private final boolean mSwitchWidgetFocusable = this.getContext().getResources().getBoolean(2131034128);

    public CarUiTwoActionSwitchPreference(Context context) {
        super(context);
    }

    public CarUiTwoActionSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CarUiTwoActionSwitchPreference(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
    }

    public CarUiTwoActionSwitchPreference(Context context, AttributeSet attributeSet, int n2, int n3) {
        super(context, attributeSet, n2, n3);
    }

    @Override
    protected void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        this.setLayoutResourceInternal(2131623998);
    }

    public boolean isSecondaryActionChecked() {
        return this.mSecondaryActionChecked;
    }

    public /* synthetic */ void lambda$onBindViewHolder$0$com-android-car-ui-preference-CarUiTwoActionSwitchPreference(View view) {
        ((CarUiTwoActionBasePreference)this).performSecondaryActionClick();
    }

    public /* synthetic */ void lambda$onBindViewHolder$1$com-android-car-ui-preference-CarUiTwoActionSwitchPreference(View view) {
        ((CarUiTwoActionBasePreference)this).performSecondaryActionClick();
    }

    public /* synthetic */ boolean lambda$onBindViewHolder$2$com-android-car-ui-preference-CarUiTwoActionSwitchPreference(View view, MotionEvent motionEvent) {
        if (!this.isSecondaryActionEnabled() && this.isClickableWhileDisabled() || this.isUxRestricted()) {
            if (motionEvent.getAction() == 1) {
                view.performClick();
            }
            return true;
        }
        return false;
    }

    @Override
    public void onBindViewHolder(atm atm2) {
        super.onBindViewHolder(atm2);
        View view = bnv.i(atm2.itemView, 2131427474);
        View view2 = bnv.i(atm2.itemView, 2131427511);
        View view3 = bnv.i(atm2.itemView, 2131427512);
        this.mSwitchWidget = (Switch)bnv.i(atm2.itemView, 2131427513);
        boolean bl2 = this.isEnabled() || this.isUxRestricted() || this.isClickableWhileDisabled();
        boolean bl3 = this.isSecondaryActionEnabled() || this.isUxRestricted() || this.isClickableWhileDisabled();
        atm2.itemView.setFocusable(false);
        atm2.itemView.setClickable(false);
        int n2 = 8;
        view.setOnClickListener((View.OnClickListener)new gp(this, 8, null));
        view.setEnabled(bl2);
        view.setFocusable(bl2);
        if (this.mSecondaryActionVisible) {
            n2 = 0;
        }
        view2.setVisibility(n2);
        this.mSwitchWidget.setChecked(this.mSecondaryActionChecked);
        view3.setEnabled(bl3);
        this.mSwitchWidget.setEnabled(bl3);
        view3.setOnClickListener((View.OnClickListener)new gp(this, 9, null));
        this.mSwitchWidget.setOnClickListener((View.OnClickListener)new gp(this, 10, null));
        this.mSwitchWidget.setOnTouchListener((View.OnTouchListener)new bkl(this, 0));
        if (this.mSwitchWidgetFocusable) {
            view3.setFocusable(false);
            this.mSwitchWidget.setFocusable(bl3);
        } else {
            this.mSwitchWidget.setFocusable(false);
            view3.setFocusable(bl3);
        }
        bnv.n(view3, this.isSecondaryActionEnabled(), this.isUxRestricted());
    }

    @Override
    public void performSecondaryActionClick() {
        super.performSecondaryActionClick();
        if (this.mSwitchWidget.isChecked() != this.isSecondaryActionChecked()) {
            this.mSwitchWidget.setChecked(this.isSecondaryActionChecked());
        }
    }

    @Override
    protected void performSecondaryActionClickInternal() {
        this.mSecondaryActionChecked ^= true;
        this.notifyChanged();
        Consumer consumer = this.mSecondaryActionOnClickListener;
        if (consumer != null) {
            ag$$ExternalSyntheticApiModelOutline1.m(consumer, (Object)this.mSecondaryActionChecked);
        }
    }

    public void setOnSecondaryActionClickListener(Consumer consumer) {
        this.mSecondaryActionOnClickListener = consumer;
        this.notifyChanged();
    }

    public void setSecondaryActionChecked(boolean bl2) {
        this.mSecondaryActionChecked = bl2;
        this.notifyChanged();
    }
}

