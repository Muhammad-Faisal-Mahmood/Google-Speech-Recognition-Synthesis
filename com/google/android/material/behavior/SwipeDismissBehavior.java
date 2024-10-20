/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  android.view.View
 */
package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class SwipeDismissBehavior
extends rw {
    public yt a;
    public boolean b;
    public int c = 2;
    public float d = 0.0f;
    public float e = 0.5f;
    private boolean f;
    private final ys g = new fub(this);

    public static float H(float f2) {
        return Math.min(Math.max(0.0f, f2), 1.0f);
    }

    public boolean G(View view) {
        return true;
    }

    @Override
    public boolean d(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean bl2 = this.f;
        int n2 = motionEvent.getActionMasked();
        if (n2 != 0) {
            if (n2 == 1 || n2 == 3) {
                this.f = false;
            }
        } else {
            this.f = bl2 = coordinatorLayout.k(view, (int)motionEvent.getX(), (int)motionEvent.getY());
        }
        if (bl2) {
            if (this.a == null) {
                this.a = yt.b(coordinatorLayout, this.g);
            }
            if (!this.b && this.a.j(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean e(CoordinatorLayout coordinatorLayout, View view, int n2) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            wj.k(view, 0x100000);
            if (this.G(view)) {
                wj.s(view, xu.e, new fuc(this));
            }
        }
        return false;
    }

    @Override
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.a != null) {
            if (!this.b || motionEvent.getActionMasked() != 3) {
                this.a.e(motionEvent);
            }
            return true;
        }
        return false;
    }
}

