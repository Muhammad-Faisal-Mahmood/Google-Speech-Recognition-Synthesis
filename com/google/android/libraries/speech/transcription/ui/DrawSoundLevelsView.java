/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.util.AttributeSet
 *  android.view.View
 */
package com.google.android.libraries.speech.transcription.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import java.util.Iterator;

public final class DrawSoundLevelsView
extends View {
    public static final hei a = hei.m("com/google/android/libraries/speech/transcription/ui/DrawSoundLevelsView");
    public final gza b = new gza(20);
    private final int c;
    private final Paint d;

    public DrawSoundLevelsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawSoundLevelsView(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        context = context.obtainStyledAttributes(attributeSet, fko.a, n2, 0);
        n2 = context.getColor(1, 0);
        this.c = (int)context.getDimension(0, 2.1311666E9f);
        context.recycle();
        context = new Paint(1);
        this.d = context;
        context.setColor(n2);
    }

    public final void onDraw(Canvas canvas) {
        int n2 = 0;
        int n3 = 0;
        canvas.drawColor(0);
        if (this.isEnabled()) {
            Iterator iterator;
            int n4 = Math.min(this.getHeight(), this.getWidth());
            int n5 = this.c;
            int n6 = this.b.size();
            if (n6 != 0) {
                if (n6 == 1) {
                    n2 = (Integer)this.b.peek();
                } else {
                    iterator = this.b.iterator();
                    double d2 = 0.0;
                    n2 = n3;
                    while (iterator.hasNext()) {
                        double d3 = ((Integer)iterator.next()).intValue();
                        d2 += (d3 + d3) * (double)n2 / (double)((n6 - 1) * n6);
                        ++n2;
                    }
                    n2 = (int)d2;
                }
            }
            n2 = (n4 - n5) * n2 / 100;
            n3 = this.c;
            float f2 = this.getWidth();
            float f3 = this.getHeight();
            iterator = this.d;
            canvas.drawCircle(f2 / 2.0f, f3 / 2.0f, (float)((n2 + n3) / 2), (Paint)iterator);
        }
    }
}

