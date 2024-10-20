/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.Layout
 *  android.util.AttributeSet
 *  android.widget.Button
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.google.android.material.snackbar;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SnackbarContentLayout
extends LinearLayout {
    private TextView a;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        fvc.t(context, 2130969614, ftf.b);
    }

    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView)this.findViewById(2131427882);
        Button button = (Button)this.findViewById(2131427881);
    }

    protected final void onMeasure(int n2, int n3) {
        block9: {
            Layout layout;
            int n4;
            block8: {
                block7: {
                    super.onMeasure(n2, n3);
                    n4 = this.getOrientation();
                    boolean bl2 = true;
                    if (n4 == 1) break block7;
                    n4 = this.getResources().getDimensionPixelSize(2131165494);
                    int n5 = this.getResources().getDimensionPixelSize(2131165493);
                    layout = this.a.getLayout();
                    if (layout == null || layout.getLineCount() <= 1) {
                        n4 = n5;
                    }
                    if (this.getOrientation() != 0) {
                        this.setOrientation(0);
                    } else {
                        bl2 = false;
                    }
                    if (this.a.getPaddingTop() != n4 || this.a.getPaddingBottom() != n4) break block8;
                    if (bl2) break block9;
                }
                return;
            }
            layout = this.a;
            if (layout.isPaddingRelative()) {
                layout.setPaddingRelative(layout.getPaddingStart(), n4, layout.getPaddingEnd(), n4);
            } else {
                layout.setPadding(layout.getPaddingLeft(), n4, layout.getPaddingRight(), n4);
            }
        }
        super.onMeasure(n2, n3);
    }
}

