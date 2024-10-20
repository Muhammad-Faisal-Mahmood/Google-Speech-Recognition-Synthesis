/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  android.view.View
 */
package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

public class BaseTransientBottomBar$Behavior
extends SwipeDismissBehavior {
    public BaseTransientBottomBar$Behavior() {
        this.d = SwipeDismissBehavior.H(0.1f);
        this.e = SwipeDismissBehavior.H(0.6f);
        this.c = 0;
    }

    @Override
    public final boolean G(View view) {
        return view instanceof fya;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int n2 = motionEvent.getActionMasked();
        if (n2 == 0) {
            if (!coordinatorLayout.k(view, (int)motionEvent.getX(), (int)motionEvent.getY())) return super.d(coordinatorLayout, view, motionEvent);
            Object object = bzb.I().a;
            // MONITORENTER : object
            // MONITOREXIT : object
            return super.d(coordinatorLayout, view, motionEvent);
        }
        if (n2 != 1 && n2 != 3) {
            return super.d(coordinatorLayout, view, motionEvent);
        }
        Object object = bzb.I().a;
        // MONITORENTER : object
        // MONITOREXIT : object
        return super.d(coordinatorLayout, view, motionEvent);
    }
}

