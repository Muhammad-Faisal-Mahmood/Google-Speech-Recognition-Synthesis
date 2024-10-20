/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.RadialGradient
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 */
package androidx.wear.widget.drawer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

public class PageIndicatorView
extends View {
    int a;
    private final Paint b;
    private final Paint c;
    private final Paint d;
    private final Paint e;
    private int f;
    private float g;
    private float h;
    private int i;
    private int j;
    private boolean k;
    private float l;
    private float m;
    private float n;
    private int o;
    private int p;
    private int q;

    public PageIndicatorView(Context context) {
        this(context, null);
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        Paint paint;
        Paint paint2;
        context = this.getContext().obtainStyledAttributes(attributeSet, baa.c, n2, 2132084929);
        this.f = context.getDimensionPixelOffset(12, 0);
        this.g = context.getDimension(6, 0.0f);
        this.h = context.getDimension(7, 0.0f);
        this.i = context.getColor(0, 0);
        this.j = context.getColor(1, 0);
        context.getInt(3, 0);
        this.a = context.getInt(4, 0);
        context.getInt(2, 0);
        this.k = context.getBoolean(5, false);
        this.l = context.getDimension(9, 0.0f);
        this.m = context.getDimension(10, 0.0f);
        this.n = context.getDimension(11, 0.0f);
        this.o = context.getColor(8, 0);
        context.recycle();
        context = new Paint(1);
        this.b = context;
        context.setColor(this.i);
        context.setStyle(Paint.Style.FILL);
        this.d = paint2 = new Paint(1);
        paint2.setColor(this.j);
        paint2.setStyle(Paint.Style.FILL);
        attributeSet = new Paint(1);
        this.c = attributeSet;
        this.e = paint = new Paint(1);
        if (this.isInEditMode()) {
            this.p = 5;
            this.q = 2;
            this.k = false;
        }
        if (this.k) {
            this.animate().alpha(0.0f).setStartDelay(2000L).setDuration((long)this.a).start();
        } else {
            this.animate().cancel();
            this.setAlpha(1.0f);
        }
        PageIndicatorView.a((Paint)context, (Paint)attributeSet, this.g, this.n, this.i, this.o);
        PageIndicatorView.a(paint2, paint, this.h, this.n, this.j, this.o);
    }

    private static final void a(Paint paint, Paint paint2, float f2, float f3, int n2, int n3) {
        f3 = f2 + f3;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader((Shader)new RadialGradient(0.0f, 0.0f, f3, new int[]{n3, n3, 0}, new float[]{0.0f, f2 /= f3, 1.0f}, tileMode));
        paint.setColor(n2);
        paint.setStyle(Paint.Style.FILL);
    }

    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.p > 1) {
            float f2 = this.getPaddingLeft();
            float f3 = this.f;
            float f4 = this.getHeight();
            canvas.save();
            canvas.translate(f2 + f3 / 2.0f, f4 / 2.0f);
            for (int i2 = 0; i2 < this.p; ++i2) {
                if (i2 == this.q) {
                    f2 = this.h;
                    f4 = this.n;
                    canvas.drawCircle(this.l, this.m, f2 + f4, this.e);
                    canvas.drawCircle(0.0f, 0.0f, this.h, this.d);
                } else {
                    f2 = this.g;
                    f4 = this.n;
                    canvas.drawCircle(this.l, this.m, f2 + f4, this.c);
                    canvas.drawCircle(0.0f, 0.0f, this.g, this.b);
                }
                canvas.translate((float)this.f, 0.0f);
            }
            canvas.restore();
        }
    }

    protected final void onMeasure(int n2, int n3) {
        int n4;
        int n5 = View.MeasureSpec.getMode((int)n2) == 0x40000000 ? View.MeasureSpec.getSize((int)n2) : this.p * this.f + this.getPaddingLeft() + this.getPaddingRight();
        if (View.MeasureSpec.getMode((int)n3) == 0x40000000) {
            n4 = View.MeasureSpec.getSize((int)n3);
        } else {
            float f2 = this.g;
            float f3 = this.n;
            f3 = Math.max(f2 + f3, this.h + f3);
            n4 = (int)Math.ceil(f3 + f3);
            f2 = this.m;
            f3 = n4;
            n4 = this.getPaddingTop();
            n4 = (int)(f3 + f2) + n4 + this.getPaddingBottom();
        }
        this.setMeasuredDimension(PageIndicatorView.resolveSizeAndState((int)n5, (int)n2, (int)0), PageIndicatorView.resolveSizeAndState((int)n4, (int)n3, (int)0));
    }
}

