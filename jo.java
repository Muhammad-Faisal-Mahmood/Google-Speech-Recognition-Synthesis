/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.widget.LinearLayout$LayoutParams
 */
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class jo
extends LinearLayout.LayoutParams {
    public jo(int n2) {
        super(n2, -2);
    }

    public jo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public jo(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public jo(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }
}

