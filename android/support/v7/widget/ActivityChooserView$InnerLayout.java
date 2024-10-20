/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.widget.LinearLayout
 */
package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.wear.ambient.AmbientDelegate;

public class ActivityChooserView$InnerLayout
extends LinearLayout {
    private static final int[] a = new int[]{16842964};

    public ActivityChooserView$InnerLayout(Context object, AttributeSet attributeSet) {
        super((Context)object, attributeSet);
        object = AmbientDelegate.z((Context)object, attributeSet, a);
        this.setBackgroundDrawable(((AmbientDelegate)object).r(0));
        ((AmbientDelegate)object).v();
    }
}

