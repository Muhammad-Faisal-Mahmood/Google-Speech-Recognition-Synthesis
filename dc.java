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

public class dc
extends ViewGroup.MarginLayoutParams {
    public int a;

    public dc() {
        super(-2, -2);
        this.a = 8388627;
    }

    public dc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        context = context.obtainStyledAttributes(attributeSet, er.b);
        this.a = context.getInt(0, 0);
        context.recycle();
    }

    public dc(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }

    public dc(dc dc2) {
        super((ViewGroup.MarginLayoutParams)dc2);
        this.a = 0;
        this.a = dc2.a;
    }
}

