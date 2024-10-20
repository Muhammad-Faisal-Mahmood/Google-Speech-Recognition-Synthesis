/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.TimeInterpolator
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.ViewPropertyAnimator
 */
package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HideBottomViewOnScrollBehavior
extends rw {
    public ViewPropertyAnimator a;
    private final LinkedHashSet b = new LinkedHashSet();
    private int c;
    private int d;
    private TimeInterpolator e;
    private TimeInterpolator f;
    private int g = 0;
    private int h = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private final void G(View view, int n2, long l2, TimeInterpolator timeInterpolator) {
        this.a = view.animate().translationY((float)n2).setInterpolator(timeInterpolator).setDuration(l2).setListener((Animator.AnimatorListener)new ftz(this));
    }

    private final void H(int n2) {
        this.h = n2;
        Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((fua)iterator.next()).a();
        }
    }

    @Override
    public final boolean e(CoordinatorLayout coordinatorLayout, View view, int n2) {
        coordinatorLayout = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        this.g = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams)coordinatorLayout).bottomMargin;
        this.c = fvc.p(view.getContext(), 2130969598, 225);
        this.d = fvc.p(view.getContext(), 2130969604, 175);
        this.e = fvc.t(view.getContext(), 2130969614, ftf.d);
        this.f = fvc.t(view.getContext(), 2130969614, ftf.c);
        return false;
    }

    @Override
    public final void n(CoordinatorLayout coordinatorLayout, View view, int n2, int n3, int n4, int[] nArray) {
        if (n2 > 0) {
            if (this.h != 1) {
                coordinatorLayout = this.a;
                if (coordinatorLayout != null) {
                    coordinatorLayout.cancel();
                    view.clearAnimation();
                }
                this.H(1);
                this.G(view, this.g, this.d, this.f);
                return;
            }
        } else if (n2 < 0 && this.h != 2) {
            coordinatorLayout = this.a;
            if (coordinatorLayout != null) {
                coordinatorLayout.cancel();
                view.clearAnimation();
            }
            this.H(2);
            this.G(view, 0, this.c, this.e);
        }
    }

    @Override
    public final boolean q(CoordinatorLayout coordinatorLayout, View view, View view2, int n2, int n3) {
        return n2 == 2;
    }
}

