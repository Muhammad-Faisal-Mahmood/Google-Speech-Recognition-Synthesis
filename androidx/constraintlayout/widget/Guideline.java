/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.util.AttributeSet
 *  android.view.View
 */
package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

public class Guideline
extends View {
    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int n2, int n3) {
        super(context, attributeSet, n2);
        super.setVisibility(8);
    }

    public final void draw(Canvas canvas) {
    }

    protected final void onMeasure(int n2, int n3) {
        this.setMeasuredDimension(0, 0);
    }

    public final void setVisibility(int n2) {
    }
}

