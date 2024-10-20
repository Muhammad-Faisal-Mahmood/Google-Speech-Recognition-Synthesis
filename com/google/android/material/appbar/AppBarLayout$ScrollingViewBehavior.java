/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.util.AttributeSet
 *  android.view.View
 */
package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;
import java.util.List;

public class AppBarLayout$ScrollingViewBehavior
extends ftv {
    public AppBarLayout$ScrollingViewBehavior() {
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context = context.obtainStyledAttributes(attributeSet, ftw.f);
        this.d = context.getDimensionPixelSize(0, 0);
        context.recycle();
    }

    static final AppBarLayout J(List list) {
        int n2 = list.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            View view = (View)list.get(i2);
            if (!(view instanceof AppBarLayout)) continue;
            return (AppBarLayout)view;
        }
        return null;
    }

    @Override
    public final float G(View object) {
        if (object instanceof AppBarLayout) {
            object = (AppBarLayout)object;
            int n2 = ((AppBarLayout)object).f();
            int n3 = ((AppBarLayout)object).b();
            object = ((rz)object.getLayoutParams()).a;
            int n4 = object instanceof AppBarLayout$BaseBehavior ? ((ftu)((AppBarLayout$BaseBehavior)object)).J() : 0;
            if ((n3 == 0 || n2 + n4 > n3) && (n3 = n2 - n3) != 0) {
                return (float)n4 / (float)n3 + 1.0f;
            }
        }
        return 0.0f;
    }

    @Override
    public final int H(View view) {
        return ((AppBarLayout)view).f();
    }

    @Override
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean bl2) {
        AppBarLayout appBarLayout = AppBarLayout$ScrollingViewBehavior.J(coordinatorLayout.a(view));
        if (appBarLayout != null) {
            rect = new Rect(rect);
            rect.offset(view.getLeft(), view.getTop());
            view = this.a;
            view.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
            if (!view.contains(rect)) {
                appBarLayout.j(false, bl2 ^ true);
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean h(View view) {
        return view instanceof AppBarLayout;
    }

    @Override
    public void i(CoordinatorLayout object, View view, View view2) {
        object = ((rz)view2.getLayoutParams()).a;
        if (object instanceof AppBarLayout$BaseBehavior) {
            object = (AppBarLayout$BaseBehavior)object;
            int n2 = view2.getBottom();
            int n3 = view.getTop();
            int n4 = ((AppBarLayout$BaseBehavior)object).a;
            int n5 = this.c;
            int n6 = this.K(view2);
            object = wj.a;
            view.offsetTopAndBottom(n2 - n3 + n4 + n5 - n6);
        }
        if (view2 instanceof AppBarLayout) {
            object = (AppBarLayout)view2;
            if (((AppBarLayout)object).f) {
                ((AppBarLayout)object).l(((AppBarLayout)object).m(view));
            }
        }
    }

    @Override
    public final void j(CoordinatorLayout coordinatorLayout, View view) {
        if (view instanceof AppBarLayout) {
            wj.m((View)coordinatorLayout, null);
        }
    }
}

