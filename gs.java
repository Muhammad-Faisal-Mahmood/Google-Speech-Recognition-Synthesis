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

public final class gs
extends ViewGroup.MarginLayoutParams {
    public gs() {
        super(-1, -1);
    }

    public gs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public gs(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}

