/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.util.AttributeSet
 *  android.view.View
 */
package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class FloatingActionButton$BaseBehavior
extends rw {
    private Rect a;
    private final boolean b;

    public FloatingActionButton$BaseBehavior() {
        this.b = true;
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context = context.obtainStyledAttributes(attributeSet, fwa.c);
        this.b = context.getBoolean(0, true);
        context.recycle();
    }

    private static boolean G(View view) {
        if ((view = view.getLayoutParams()) instanceof rz) {
            return ((rz)view).a instanceof BottomSheetBehavior;
        }
        return false;
    }

    private final boolean H(View view, FloatingActionButton floatingActionButton) {
        rz rz2 = (rz)floatingActionButton.getLayoutParams();
        if (this.b && rz2.f == view.getId()) {
            return floatingActionButton.d == 0;
        }
        return false;
    }

    private final boolean I(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
        if (!this.H((View)appBarLayout, floatingActionButton)) {
            return false;
        }
        if (this.a == null) {
            this.a = new Rect();
        }
        Rect rect = this.a;
        fwf.a(coordinatorLayout, (View)appBarLayout, rect);
        if (rect.bottom <= appBarLayout.d()) {
            floatingActionButton.e();
        } else {
            floatingActionButton.f();
        }
        return true;
    }

    private final boolean J(View view, FloatingActionButton floatingActionButton) {
        if (!this.H(view, floatingActionButton)) {
            return false;
        }
        rz rz2 = (rz)floatingActionButton.getLayoutParams();
        if (view.getTop() < floatingActionButton.getHeight() / 2 + rz2.topMargin) {
            floatingActionButton.e();
        } else {
            floatingActionButton.f();
        }
        return true;
    }

    @Override
    public final void a(rz rz2) {
        if (rz2.h == 0) {
            rz2.h = 80;
        }
    }
}

