/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 */
package com.android.car.ui.uxr;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

public class DrawableStateConstraintLayout
extends ConstraintLayout
implements boj {
    private boi h;

    public DrawableStateConstraintLayout(Context context) {
        super(context);
    }

    public DrawableStateConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DrawableStateConstraintLayout(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
    }

    @Override
    public final void a(int[] nArray, int[] nArray2) {
        if (this.h == null) {
            this.h = new boi((View)this);
        }
        this.h.a(nArray, nArray2);
    }

    public final /* synthetic */ int[] d(Integer n2) {
        return super.onCreateDrawableState(n2.intValue());
    }

    public final int[] onCreateDrawableState(int n2) {
        if (this.h == null) {
            this.h = new boi((View)this);
        }
        return this.h.b(n2, new bof(this, 0));
    }
}

