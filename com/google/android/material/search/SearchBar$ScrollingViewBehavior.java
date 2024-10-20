/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 */
package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;

public class SearchBar$ScrollingViewBehavior
extends AppBarLayout$ScrollingViewBehavior {
    private boolean e = false;

    public SearchBar$ScrollingViewBehavior() {
    }

    public SearchBar$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override
    public final boolean M() {
        return true;
    }

    @Override
    public final void i(CoordinatorLayout object, View view, View view2) {
        super.i((CoordinatorLayout)object, view, view2);
        if (!this.e && view2 instanceof AppBarLayout) {
            this.e = true;
            object = (AppBarLayout)view2;
            object.setBackgroundColor(0);
            fty.a((View)object, 0.0f);
        }
    }
}

