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

public final class fts
extends FrameLayout.LayoutParams {
    public int a = 0;
    public float b = 0.5f;

    public fts() {
        super(-1, -1);
    }

    public fts(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context = context.obtainStyledAttributes(attributeSet, ftw.d);
        this.a = context.getInt(0, 0);
        this.b = context.getFloat(1, 0.5f);
        context.recycle();
    }

    public fts(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}

