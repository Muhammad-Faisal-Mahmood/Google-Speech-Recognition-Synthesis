/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.util.AttributeSet
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 */
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

public class kp
extends ViewGroup.MarginLayoutParams {
    public lg c;
    public final Rect d = new Rect();
    public boolean e = true;
    boolean f = false;

    public kp(int n2, int n3) {
        super(n2, n3);
    }

    public kp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public kp(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public kp(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public kp(kp kp2) {
        super((ViewGroup.LayoutParams)kp2);
    }

    public final int a() {
        return this.c.getLayoutPosition();
    }

    public final boolean b() {
        return this.c.isUpdated();
    }

    public final boolean c() {
        return this.c.isRemoved();
    }
}

