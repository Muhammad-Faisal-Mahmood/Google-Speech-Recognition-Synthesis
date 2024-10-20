/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.view.View
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

public final class fwr
extends hq {
    private static final int[][] a = new int[][]{{16842910, 0x10100A0}, {16842910, -16842912}, {-16842910, 0x10100A0}, {-16842910, -16842912}};
    private ColorStateList b;
    private boolean c;

    public fwr(Context context, AttributeSet attributeSet) {
        super(fyl.a(context, attributeSet, 2130969749, 2132084845), attributeSet);
        context = this.getContext();
        attributeSet = fwl.c(context, attributeSet, fws.a, 2130969749, 2132084845);
        if (attributeSet.hasValue(0)) {
            this.setButtonTintList(fvc.o(context, (TypedArray)attributeSet, 0));
        }
        this.c = attributeSet.getBoolean(1, false);
        attributeSet.recycle();
    }

    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.c && this.getButtonTintList() == null) {
            this.c = true;
            if (this.b == null) {
                int n2 = fvc.h((View)this, 2130968890);
                int n3 = fvc.h((View)this, 2130968924);
                int n4 = fvc.h((View)this, 2130968966);
                int[][] nArray = a;
                int n5 = nArray.length;
                this.b = new ColorStateList(nArray, new int[]{fvc.i(n4, n2, 1.0f), fvc.i(n4, n3, 0.54f), fvc.i(n4, n3, 0.38f), fvc.i(n4, n3, 0.38f)});
            }
            this.setButtonTintList(this.b);
        }
    }
}

