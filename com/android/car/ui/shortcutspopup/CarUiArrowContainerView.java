/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.Path$Op
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 */
package com.android.car.ui.shortcutspopup;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class CarUiArrowContainerView
extends LinearLayout {
    private static final int[] a = new int[]{-16842766};
    private final Paint b;
    private final Path c;
    private boolean d;
    private boolean e;
    private boolean f;
    private ColorStateList g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private View m;
    private int n;
    private int o;

    private CarUiArrowContainerView(Context context) {
        super(context);
        this.b = new Paint();
        this.c = new Path();
    }

    public CarUiArrowContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint;
        this.b = paint = new Paint();
        this.c = new Path();
        attributeSet = context.getTheme().obtainStyledAttributes(attributeSet, bjm.a, 0, 0);
        this.d = attributeSet.getBoolean(7, false);
        context = attributeSet.hasValue(0) ? attributeSet.getColorStateList(0) : ye.f(this.getContext(), 2131099850);
        this.g = context;
        this.h = attributeSet.getDimension(4, 0.0f);
        this.i = attributeSet.getDimension(2, 0.0f);
        this.j = attributeSet.getDimension(3, 0.0f);
        this.k = attributeSet.getDimension(8, 0.0f);
        this.l = attributeSet.getDimension(9, 0.0f);
        boolean bl2 = 1 == (attributeSet.getInt(1, 3) & 1);
        this.e = bl2;
        bl2 = (attributeSet.getInt(1, 3) & 2) == 2;
        this.f = bl2;
        if (attributeSet.hasValue(5)) {
            this.n = attributeSet.getResourceId(5, 0);
            this.o = attributeSet.getResourceId(6, 2131230956);
            paint.setColor(this.g.getDefaultColor());
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            this.setOrientation(1);
            attributeSet.recycle();
            this.a(false);
            this.setWillNotDraw(false);
            return;
        }
        throw new IllegalStateException("Attribute app:carUiContentView must be specified when using CarUiArrowContainerView");
    }

    private final void a(boolean bl2) {
        View view;
        View view2;
        String string;
        block4: {
            block3: {
                block2: {
                    string = true != this.f ? "CAR_UI_ARROW_VIEW_BOTTOM_TAG" : "CAR_UI_ARROW_VIEW_TOP_TAG";
                    view2 = this.m;
                    if (view2 == null) break block2;
                    if (this.d && view2.getTag() == string && !bl2) break block3;
                    this.removeView(this.m);
                }
                if (this.d) break block4;
            }
            return;
        }
        view2 = new LinearLayout.LayoutParams(-1, (int)this.i);
        this.m = view = new View(this.getContext());
        view.setLayoutParams((ViewGroup.LayoutParams)view2);
        this.m.setTag((Object)string);
        this.addView(this.m, this.f ^ 1);
    }

    private final void b(boolean bl2, View view) {
        view.setEnabled(bl2);
        if (view instanceof ViewGroup) {
            view = (ViewGroup)view;
            for (int i2 = 0; i2 < view.getChildCount(); ++i2) {
                this.b(bl2, view.getChildAt(i2));
            }
        }
    }

    protected final void onDraw(Canvas canvas) {
        this.c.reset();
        this.findViewById(this.n).setBackgroundResource(this.o);
        if (this.d) {
            Path path = this.c;
            View view = this.m;
            float f2 = this.h;
            float f3 = this.i;
            float f4 = this.j;
            boolean bl2 = this.f;
            boolean bl3 = this.e;
            float f5 = this.k;
            if (view == null) {
                view = new Path();
            } else {
                float f6 = view.getTop();
                float f7 = f2 / (f3 + f3);
                float f8 = (float)Math.atan(f7);
                float f9 = f2 / 2.0f;
                double d2 = f3;
                double d3 = f4;
                double d4 = f8;
                d3 /= Math.sin(d4);
                double d5 = f4 / f7;
                double d6 = Math.sin(d4);
                double d7 = Math.cos(d4);
                view = new Path();
                view.reset();
                view.moveTo(0.0f, f6);
                view.lineTo(f2, f6);
                f8 = (float)(d2 - d5 * d7);
                view.lineTo((float)(d5 * d6) + f9, f8 + f6);
                f7 = (float)Math.toDegrees(d4);
                f8 = (float)(d2 - d3);
                view.arcTo(f9 - f4, f8 - f4 + f6, f9 + f4, f8 + f4 + f6, f7, 180.0f - (f7 + f7), false);
                view.lineTo(0.0f, f6 + 0.0f);
                view.close();
                f6 = f9 = -this.l;
                if (bl2) {
                    f6 = -f9;
                    Matrix matrix = new Matrix();
                    matrix.setRotate(180.0f, f2 * 0.5f, 0.5f * f3);
                    view.transform(matrix);
                }
                if (!bl3) {
                    view.offset((float)this.getWidth() - f2 - f5, f6);
                } else {
                    view.offset(f5, f6);
                }
            }
            path.op((Path)view, Path.Op.UNION);
        }
        this.c.close();
        if (this.isEnabled()) {
            this.b.setColor(this.g.getDefaultColor());
        } else {
            this.b.setColor(this.g.getColorForState(a, -7829368));
        }
        canvas.drawPath(this.c, this.b);
        super.onDraw(canvas);
    }

    public final void setEnabled(boolean bl2) {
        if (bl2 != this.isEnabled()) {
            super.setEnabled(bl2);
            this.b(bl2, this.findViewById(this.n));
            if (this.d) {
                this.a(true);
                this.invalidate();
            }
        }
    }

    public final void setOrientation(int n2) {
        super.setOrientation(1);
    }
}

