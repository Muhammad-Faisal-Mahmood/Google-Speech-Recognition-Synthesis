/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.Layout
 *  android.util.AttributeSet
 */
package android.support.v7.widget;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.text.Layout;
import android.util.AttributeSet;

public class DialogTitle
extends AppCompatTextView {
    public DialogTitle(Context context) {
        super(context);
    }

    public DialogTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DialogTitle(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
    }

    @Override
    protected final void onMeasure(int n2, int n3) {
        int n4;
        super.onMeasure(n2, n3);
        Layout layout = this.getLayout();
        if (layout != null && (n4 = layout.getLineCount()) > 0 && layout.getEllipsisCount(n4 - 1) > 0) {
            this.setSingleLine(false);
            this.setMaxLines(2);
            layout = this.getContext().obtainStyledAttributes(null, er.w, 0x1010041, 16973892);
            n4 = layout.getDimensionPixelSize(0, 0);
            if (n4 != 0) {
                this.setTextSize(0, n4);
            }
            layout.recycle();
            super.onMeasure(n2, n3);
        }
    }
}

