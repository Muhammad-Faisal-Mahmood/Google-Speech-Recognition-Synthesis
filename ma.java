/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 */
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

public final class ma
extends dc {
    public int b = 0;

    public ma() {
        this.a = 8388627;
    }

    public ma(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ma(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public ma(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super((ViewGroup.LayoutParams)marginLayoutParams);
        this.leftMargin = marginLayoutParams.leftMargin;
        this.topMargin = marginLayoutParams.topMargin;
        this.rightMargin = marginLayoutParams.rightMargin;
        this.bottomMargin = marginLayoutParams.bottomMargin;
    }

    public ma(dc dc2) {
        super(dc2);
    }

    public ma(ma ma2) {
        super(ma2);
        this.b = ma2.b;
    }
}

