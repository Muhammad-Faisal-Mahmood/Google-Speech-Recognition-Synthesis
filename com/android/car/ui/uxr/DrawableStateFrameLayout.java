/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.FrameLayout
 */
package com.android.car.ui.uxr;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class DrawableStateFrameLayout
extends FrameLayout
implements boj {
    private boi a;

    public DrawableStateFrameLayout(Context context) {
        super(context);
    }

    public DrawableStateFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DrawableStateFrameLayout(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
    }

    @Override
    public final void a(int[] nArray, int[] nArray2) {
        if (this.a == null) {
            this.a = new boi((View)this);
        }
        this.a.a(nArray, nArray2);
    }

    public final /* synthetic */ int[] b(Integer n2) {
        return super.onCreateDrawableState(n2.intValue());
    }

    public final int[] onCreateDrawableState(int n2) {
        if (this.a == null) {
            this.a = new boi((View)this);
        }
        return this.a.b(n2, new bof(this, 2));
    }
}

