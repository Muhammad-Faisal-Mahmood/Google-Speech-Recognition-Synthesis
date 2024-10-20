/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 */
package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public final class Snackbar$SnackbarLayout
extends fya {
    public Snackbar$SnackbarLayout(Context context) {
        super(context);
    }

    public Snackbar$SnackbarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override
    protected final void onMeasure(int n2, int n3) {
        super.onMeasure(n2, n3);
        int n4 = this.getChildCount();
        n3 = this.getMeasuredWidth();
        int n5 = this.getPaddingLeft();
        int n6 = this.getPaddingRight();
        for (n2 = 0; n2 < n4; ++n2) {
            View view = this.getChildAt(n2);
            if (view.getLayoutParams().width != -1) continue;
            view.measure(View.MeasureSpec.makeMeasureSpec((int)(n3 - n5 - n6), (int)0x40000000), View.MeasureSpec.makeMeasureSpec((int)view.getMeasuredHeight(), (int)0x40000000));
        }
    }
}

