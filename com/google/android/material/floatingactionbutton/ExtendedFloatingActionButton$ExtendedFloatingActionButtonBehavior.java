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

public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior
extends rw {
    private Rect a;
    private final boolean b;
    private final boolean c;

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
        this.b = false;
        this.c = true;
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context = context.obtainStyledAttributes(attributeSet, fwa.a);
        this.b = context.getBoolean(0, false);
        this.c = context.getBoolean(1, true);
        context.recycle();
    }

    private static boolean G(View view) {
        if ((view = view.getLayoutParams()) instanceof rz) {
            return ((rz)view).a instanceof BottomSheetBehavior;
        }
        return false;
    }

    private final boolean H(View view, fvm object) {
        object = (rz)object.getLayoutParams();
        if (!this.b && !this.c) {
            return false;
        }
        return ((rz)((Object)object)).f == view.getId();
    }

    private final void I(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, fvm fvm2) {
        if (!this.H((View)appBarLayout, fvm2)) {
            return;
        }
        if (this.a == null) {
            this.a = new Rect();
        }
        fvm2 = this.a;
        fwf.a(coordinatorLayout, (View)appBarLayout, (Rect)fvm2);
        if (((Rect)fvm2).bottom <= appBarLayout.d()) {
            int n2 = fvm.f;
            throw null;
        }
        int n3 = fvm.f;
        throw null;
    }

    private final void J(View view, fvm fvm2) {
        if (!this.H(view, fvm2)) {
            return;
        }
        rz rz2 = (rz)fvm2.getLayoutParams();
        if (view.getTop() < fvm2.getHeight() / 2 + rz2.topMargin) {
            throw null;
        }
        throw null;
    }

    @Override
    public final void a(rz rz2) {
        if (rz2.h == 0) {
            rz2.h = 80;
        }
    }
}

