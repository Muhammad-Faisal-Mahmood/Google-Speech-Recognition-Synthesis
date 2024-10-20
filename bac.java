/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout$LayoutParams
 */
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public final class bac
extends FrameLayout.LayoutParams {
    public int a = 0;

    public bac(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context = context.obtainStyledAttributes(attributeSet, baa.a, 0, 0);
        this.a = context.getInt(context.hasValueOrEmpty(1) ? 1 : 0, 0);
        context.recycle();
    }

    public bac(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}

