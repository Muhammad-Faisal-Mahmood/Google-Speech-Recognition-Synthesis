/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.TextView
 */
package com.android.car.ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.android.car.ui.preference.CarUiPreference;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class CarUiFooterPreference
extends CarUiPreference {
    private Runnable mClickListener;
    private String mLinkText;

    public CarUiFooterPreference(Context context) {
        this(context, null);
    }

    public CarUiFooterPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CarUiFooterPreference(Context context, AttributeSet attributeSet, int n2) {
        this(context, attributeSet, n2, 2132083173);
    }

    public CarUiFooterPreference(Context context, AttributeSet attributeSet, int n2, int n3) {
        super(context, attributeSet, n2, n3);
        this.setLayoutResource(2131623989);
    }

    public String getLinkText() {
        return this.mLinkText;
    }

    public boolean isLinkEnabled() {
        return this.mLinkText != null && this.mClickListener != null;
    }

    public /* synthetic */ void lambda$onBindViewHolder$0$com-android-car-ui-preference-CarUiFooterPreference(View view) {
        this.mClickListener.run();
    }

    @Override
    public void onBindViewHolder(atm atm2) {
        super.onBindViewHolder(atm2);
        atm2 = (TextView)bnv.h(atm2.itemView, 2131427483);
        if (this.isLinkEnabled()) {
            atm2.setText(this.mLinkText);
            atm2.setOnClickListener(new gp(this, 4, null));
            atm2.setClickable(true);
            atm2.setVisibility(0);
            return;
        }
        atm2.setText("");
        atm2.setOnClickListener(null);
        atm2.setClickable(false);
        atm2.setVisibility(8);
    }

    public void setLink(String string, Runnable runnable) {
        Runnable runnable2;
        block4: {
            block3: {
                block2: {
                    runnable2 = runnable;
                    if (string != null) break block2;
                    if (runnable != null) break block3;
                    runnable2 = null;
                }
                if (string == null || runnable2 != null) break block4;
            }
            throw new IllegalArgumentException("Error: Both or neither argument must be null");
        }
        this.mLinkText = string;
        this.mClickListener = runnable2;
        this.notifyChanged();
    }
}

