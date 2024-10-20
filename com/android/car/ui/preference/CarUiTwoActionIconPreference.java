/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
package com.android.car.ui.preference;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.car.ui.preference.CarUiTwoActionBasePreference;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class CarUiTwoActionIconPreference
extends CarUiTwoActionBasePreference {
    private Drawable mSecondaryActionIcon;
    protected Runnable mSecondaryActionOnClickListener;

    public CarUiTwoActionIconPreference(Context context) {
        super(context);
    }

    public CarUiTwoActionIconPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CarUiTwoActionIconPreference(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
    }

    public CarUiTwoActionIconPreference(Context context, AttributeSet attributeSet, int n2, int n3) {
        super(context, attributeSet, n2, n3);
    }

    @Override
    protected void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        attributeSet = this.getContext().obtainStyledAttributes(attributeSet, bjm.f);
        try {
            this.mSecondaryActionIcon = attributeSet.getDrawable(0);
            this.setLayoutResourceInternal(2131623996);
            return;
        }
        finally {
            attributeSet.recycle();
        }
    }

    public /* synthetic */ void lambda$onBindViewHolder$0$com-android-car-ui-preference-CarUiTwoActionIconPreference(View view) {
        this.performSecondaryActionClick();
    }

    @Override
    public void onBindViewHolder(atm atm2) {
        boolean bl2;
        ViewGroup viewGroup;
        block4: {
            block3: {
                super.onBindViewHolder(atm2);
                View view = bnv.i(atm2.itemView, 2131427474);
                View view2 = bnv.i(atm2.itemView, 2131427511);
                viewGroup = (ViewGroup)bnv.i(atm2.itemView, 2131427512);
                ImageView imageView = (ImageView)bnv.i(atm2.itemView, 2131427513);
                View view3 = atm2.itemView;
                boolean bl3 = false;
                view3.setFocusable(false);
                atm2.itemView.setClickable(false);
                view.setOnClickListener((View.OnClickListener)new gp(this, 5, null));
                bl2 = this.isEnabled() || this.isClickableWhileDisabled();
                view.setEnabled(bl2);
                bl2 = this.isEnabled() || this.isClickableWhileDisabled();
                view.setFocusable(bl2);
                int n2 = true != this.mSecondaryActionVisible ? 8 : 0;
                view2.setVisibility(n2);
                imageView.setImageDrawable(this.mSecondaryActionIcon);
                bl2 = this.isSecondaryActionEnabled() || this.isClickableWhileDisabled();
                imageView.setEnabled(bl2);
                bl2 = this.isSecondaryActionEnabled() || this.isClickableWhileDisabled();
                viewGroup.setEnabled(bl2);
                if (this.isSecondaryActionEnabled()) break block3;
                bl2 = bl3;
                if (!this.isClickableWhileDisabled()) break block4;
            }
            bl2 = true;
        }
        viewGroup.setFocusable(bl2);
        viewGroup.setOnClickListener((View.OnClickListener)new gp(this, 6, null));
        bnv.n((View)viewGroup, this.isSecondaryActionEnabled(), this.isUxRestricted());
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

    public void setSecondaryActionIcon(int n2) {
        this.setSecondaryActionIcon(this.getContext().getDrawable(n2));
    }

    public void setSecondaryActionIcon(Drawable drawable) {
        this.mSecondaryActionIcon = drawable;
        this.notifyChanged();
    }
}

