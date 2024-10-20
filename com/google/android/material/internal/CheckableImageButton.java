/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.Checkable
 */
package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;

public class CheckableImageButton
extends hl
implements Checkable {
    private static final int[] c = new int[]{0x10100A0};
    public boolean a;
    public boolean b = true;
    private boolean d = true;

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969321);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        wj.m((View)this, new fwb(this));
    }

    public final boolean isChecked() {
        return this.a;
    }

    public final int[] onCreateDrawableState(int n2) {
        if (this.a) {
            return CheckableImageButton.mergeDrawableStates((int[])super.onCreateDrawableState(n2 + 1), (int[])c);
        }
        return super.onCreateDrawableState(n2);
    }

    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof fwc)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        parcelable = (fwc)parcelable;
        super.onRestoreInstanceState(parcelable.d);
        this.setChecked(parcelable.a);
    }

    protected final Parcelable onSaveInstanceState() {
        fwc fwc2 = new fwc(super.onSaveInstanceState());
        fwc2.a = this.a;
        return fwc2;
    }

    public final void setChecked(boolean bl2) {
        if (this.b && this.a != bl2) {
            this.a = bl2;
            this.refreshDrawableState();
            this.sendAccessibilityEvent(2048);
        }
    }

    public final void setPressed(boolean bl2) {
        if (this.d) {
            super.setPressed(bl2);
        }
    }

    public final void toggle() {
        this.setChecked(this.a ^ true);
    }
}

