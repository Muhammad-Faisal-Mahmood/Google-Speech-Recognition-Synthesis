/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.widget.FrameLayout
 */
package com.android.car.ui;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public class SecureView
extends FrameLayout {
    private boolean a = true;

    public SecureView(Context context) {
        this(context, null);
    }

    public SecureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SecureView(Context context, AttributeSet attributeSet, int n2) {
        this(context, attributeSet, n2, 0);
    }

    public SecureView(Context context, AttributeSet attributeSet, int n2, int n3) {
        super(context, attributeSet, n2, n3);
    }

    public final void a() {
        this.a = false;
    }

    public final boolean onFilterTouchEventForSecurity(MotionEvent motionEvent) {
        if (!this.a) {
            return super.onFilterTouchEventForSecurity(motionEvent);
        }
        int n2 = Build.VERSION.SDK_INT >= 29 ? 3 : 1;
        return (n2 & motionEvent.getFlags()) == 0 && super.onFilterTouchEventForSecurity(motionEvent);
    }
}

