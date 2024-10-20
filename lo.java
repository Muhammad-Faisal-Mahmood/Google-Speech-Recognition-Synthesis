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

public final class lo
extends kp {
    public lr a;
    public boolean b;

    public lo(int n2, int n3) {
        super(n2, n3);
    }

    public lo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public lo(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public lo(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public final int d() {
        lr lr2 = this.a;
        if (lr2 == null) {
            return -1;
        }
        return lr2.e;
    }
}

