/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.Button
 */
package com.android.car.ui.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import com.android.car.ui.preference.CarUiTwoActionBasePreference;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class CarUiTwoActionTextPreference
extends CarUiTwoActionBasePreference {
    public static final int SECONDARY_ACTION_STYLE_BORDERED = 0;
    public static final int SECONDARY_ACTION_STYLE_BORDERLESS = 1;
    protected Runnable mSecondaryActionOnClickListener;
    private CharSequence mSecondaryActionText;

    public CarUiTwoActionTextPreference(Context context) {
        super(context);
    }

    public CarUiTwoActionTextPreference(Context context, int n2) {
        super(context);
        n2 = n2 == 0 ? 2131624000 : 2131624001;
        this.setLayoutResourceInternal(n2);
    }

    public CarUiTwoActionTextPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CarUiTwoActionTextPreference(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
    }

    public CarUiTwoActionTextPreference(Context context, AttributeSet attributeSet, int n2, int n3) {
        super(context, attributeSet, n2, n3);
    }

    public CharSequence getSecondaryActionText() {
        return this.mSecondaryActionText;
    }

    @Override
    protected void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        TypedArray typedArray = this.getContext().obtainStyledAttributes(attributeSet, bjm.h);
        try {
            int n2 = typedArray.getInteger(0, 0);
            this.mSecondaryActionText = typedArray.getString(1);
            n2 = n2 == 0 ? 2131624000 : 2131624001;
            this.setLayoutResourceInternal(n2);
            return;
        }
        finally {
            typedArray.recycle();
        }
    }

    public /* synthetic */ void lambda$onBindViewHolder$0$com-android-car-ui-preference-CarUiTwoActionTextPreference(View view) {
        this.performSecondaryActionClick();
    }

    @Override
    public void onBindViewHolder(atm atm2) {
        boolean bl2;
        Button button;
        block4: {
            block3: {
                super.onBindViewHolder(atm2);
                View view = bnv.i(atm2.itemView, 2131427474);
                View view2 = bnv.i(atm2.itemView, 2131427511);
                button = (Button)bnv.i(atm2.itemView, 2131427512);
                View view3 = atm2.itemView;
                boolean bl3 = false;
                view3.setFocusable(false);
                atm2.itemView.setClickable(false);
                view.setOnClickListener((View.OnClickListener)new gp(this, 11, null));
                bl2 = this.isEnabled() || this.isClickableWhileDisabled();
                view.setEnabled(bl2);
                bl2 = this.isEnabled() || this.isClickableWhileDisabled();
                view.setFocusable(bl2);
                int n2 = true != this.mSecondaryActionVisible ? 8 : 0;
                view2.setVisibility(n2);
                button.setText(this.mSecondaryActionText);
                button.setOnClickListener((View.OnClickListener)new gp(this, 12, null));
                bl2 = this.isSecondaryActionEnabled() || this.isClickableWhileDisabled();
                button.setEnabled(bl2);
                if (this.isSecondaryActionEnabled()) break block3;
                bl2 = bl3;
                if (!this.isClickableWhileDisabled()) break block4;
            }
            bl2 = true;
        }
        button.setFocusable(bl2);
        bnv.n((View)button, this.isSecondaryActionEnabled(), this.isUxRestricted());
    }

    @Override
    protected void performSecondaryActionClickInternal() {
        Runnable runnable = this.mSecondaryActionOnClickListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void setOnSecondaryActionClickListener(Runnable runnable) {
        this.mSecondaryActionOnClickListener = runnable;
        this.notifyChanged();
    }

    public void setSecondaryActionText(int n2) {
        this.setSecondaryActionText(this.getContext().getString(n2));
    }

    public void setSecondaryActionText(CharSequence charSequence) {
        this.mSecondaryActionText = charSequence;
        this.notifyChanged();
    }
}

