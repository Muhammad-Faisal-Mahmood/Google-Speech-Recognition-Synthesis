/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 */
package com.android.car.ui.baselayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class ClickBlockingView
extends View {
    private boolean a = false;
    private boolean b = false;

    public ClickBlockingView(Context context) {
        super(context);
    }

    public ClickBlockingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClickBlockingView(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
    }

    public ClickBlockingView(Context context, AttributeSet attributeSet, int n2, int n3) {
        super(context, attributeSet, n2, n3);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int n2 = motionEvent.getActionMasked();
        int n3 = 9;
        int n4 = n2;
        if (n2 == 9) {
            this.b = false;
            n4 = 9;
        }
        if (!this.b) {
            boolean bl2 = super.onHoverEvent(motionEvent);
            if (n4 == 9) {
                n4 = n3;
                if (!bl2) {
                    this.b = true;
                    n4 = n3;
                }
            }
        }
        if (n4 == 10 || n4 == 3) {
            this.b = false;
        }
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int n2;
        int n3 = n2 = motionEvent.getActionMasked();
        if (n2 == 0) {
            this.a = false;
            n3 = 0;
        }
        n2 = n3;
        if (!this.a) {
            boolean bl2 = super.onTouchEvent(motionEvent);
            n2 = n3;
            if (n3 == 0) {
                if (!bl2) {
                    this.a = true;
                }
                n2 = 0;
            }
        }
        if (n2 == 1 || n2 == 3) {
            this.a = false;
        }
        return true;
    }
}

