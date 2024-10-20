/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class BaselineLayout
extends ViewGroup {
    private int a = -1;

    public BaselineLayout(Context context) {
        super(context, null, 0);
    }

    public BaselineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public BaselineLayout(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
    }

    public final int getBaseline() {
        return this.a;
    }

    protected final void onLayout(boolean bl2, int n2, int n3, int n4, int n5) {
        int n6 = this.getChildCount();
        int n7 = this.getPaddingLeft();
        int n8 = this.getPaddingRight();
        int n9 = this.getPaddingTop();
        for (n3 = 0; n3 < n6; ++n3) {
            View view = this.getChildAt(n3);
            if (view.getVisibility() == 8) continue;
            int n10 = view.getMeasuredWidth();
            int n11 = view.getMeasuredHeight();
            int n12 = (n4 - n2 - n8 - n7 - n10) / 2 + n7;
            n5 = this.a != -1 && view.getBaseline() != -1 ? this.a + n9 - view.getBaseline() : n9;
            view.layout(n12, n5, n10 + n12, n11 + n5);
        }
    }

    protected final void onMeasure(int n2, int n3) {
        int n4;
        int n5;
        int n6 = this.getChildCount();
        int n7 = 0;
        int n8 = n5 = (n4 = 0);
        int n9 = -1;
        int n10 = -1;
        int n11 = n5;
        for (int i2 = 0; i2 < n6; ++i2) {
            View view = this.getChildAt(i2);
            int n12 = n7;
            int n13 = n4;
            int n14 = n11;
            int n15 = n8;
            int n16 = n9;
            n5 = n10;
            if (view.getVisibility() != 8) {
                this.measureChild(view, n2, n3);
                n13 = Math.max(n4, view.getMeasuredHeight());
                n15 = view.getBaseline();
                n16 = n9;
                n5 = n10;
                if (n15 != -1) {
                    n16 = Math.max(n9, n15);
                    n5 = Math.max(n10, view.getMeasuredHeight() - n15);
                }
                n12 = Math.max(n7, view.getMeasuredWidth());
                n15 = Math.max(n8, view.getMeasuredHeight());
                n14 = View.combineMeasuredStates((int)n11, (int)view.getMeasuredState());
            }
            n7 = n12;
            n4 = n13;
            n11 = n14;
            n8 = n15;
            n9 = n16;
            n10 = n5;
        }
        if (n9 != -1) {
            this.a = n9;
        }
        n10 = Math.max(n4 + this.getPaddingBottom(), this.getSuggestedMinimumHeight());
        this.setMeasuredDimension(View.resolveSizeAndState((int)Math.max(n7, this.getSuggestedMinimumWidth()), (int)n2, (int)n11), View.resolveSizeAndState((int)n10, (int)n3, (int)(n11 << 16)));
    }
}

