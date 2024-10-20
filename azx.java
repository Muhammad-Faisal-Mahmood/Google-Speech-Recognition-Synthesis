/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.ViewGroup$LayoutParams
 */
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;

public final class azx
extends ViewGroup.LayoutParams {
    public boolean a;
    public int b;
    public final float c;

    public azx() {
        super(-1, -1);
        this.c = 0.0f;
    }

    public azx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0.0f;
        context = context.obtainStyledAttributes(attributeSet, ViewPager.a);
        this.b = context.getInteger(0, 48);
        context.recycle();
    }
}

