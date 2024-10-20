/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ArgbEvaluator
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Cap
 *  android.graphics.Paint$Style
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 */
package androidx.wear.widget;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

public class CircledImageView
extends View {
    int a;
    private final RectF b;
    private final Paint c;
    private final baf d;
    private final bah e;
    private final Drawable.Callback f;
    private ColorStateList g;
    private Drawable h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private int n;
    private Paint.Cap o;
    private float p;
    private float q;
    private boolean r;
    private float s;
    private float t;
    private Integer u;
    private Integer v;

    static {
        new ArgbEvaluator();
    }

    public CircledImageView(Context context) {
        this(context, null);
    }

    public CircledImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircledImageView(Context object, AttributeSet attributeSet, int n2) {
        super(object, attributeSet, n2);
        float f2;
        new Rect();
        bad bad2 = new bad((Object)this, 0);
        this.f = bad2;
        this.q = 1.0f;
        this.r = false;
        this.s = 1.0f;
        this.t = 0.0f;
        n2 = bae.a;
        TypedArray typedArray = this.getContext().obtainStyledAttributes(attributeSet, baa.b);
        wj.l(this, object, baa.b, attributeSet, typedArray, 0, 0);
        attributeSet = typedArray.getDrawable(0);
        this.h = attributeSet;
        if (attributeSet != null && attributeSet.getConstantState() != null) {
            attributeSet = this.h.getConstantState().newDrawable(object.getResources(), object.getTheme());
            this.h = attributeSet;
            this.h = attributeSet.mutate();
        }
        attributeSet = typedArray.getColorStateList(4);
        this.g = attributeSet;
        if (attributeSet == null) {
            this.g = ColorStateList.valueOf((int)object.getColor(0x1060000));
        }
        this.i = f2 = typedArray.getDimension(5, 0.0f);
        this.k = typedArray.getDimension(7, f2);
        this.n = typedArray.getColor(2, -16777216);
        this.o = Paint.Cap.values()[typedArray.getInt(1, 0)];
        this.p = f2 = typedArray.getDimension(3, 0.0f);
        if (f2 > 0.0f) {
            this.m += f2 / 2.0f;
        }
        if ((f2 = typedArray.getDimension(13, 0.0f)) > 0.0f) {
            this.m += f2;
        }
        this.s = typedArray.getFloat(11, 0.0f);
        this.t = typedArray.getFloat(12, 0.0f);
        if (typedArray.hasValue(14)) {
            this.u = typedArray.getColor(14, 0);
        }
        if (typedArray.hasValue(10)) {
            this.v = typedArray.getInt(10, 0);
        }
        this.j = f2 = typedArray.getFraction(6, 1, 1, 0.0f);
        this.l = typedArray.getFraction(8, 1, 1, f2);
        f2 = typedArray.getDimension(9, 0.0f);
        typedArray.recycle();
        this.b = new RectF();
        object = new Paint();
        this.c = object;
        object.setAntiAlias(true);
        this.d = new baf(f2, this.a(), this.p);
        object = new bah();
        this.e = object;
        object.setCallback((Drawable.Callback)bad2);
        this.setWillNotDraw(false);
        this.d();
    }

    private final void d() {
        int n2 = this.g.getColorForState(this.getDrawableState(), this.g.getDefaultColor());
        if (n2 != this.a) {
            this.a = n2;
            this.invalidate();
        }
    }

    public final float a() {
        float f2;
        float f3 = f2 = this.i;
        if (f2 <= 0.0f) {
            f3 = f2;
            if (this.j > 0.0f) {
                f3 = (float)Math.max(this.getMeasuredHeight(), this.getMeasuredWidth()) * this.j;
            }
        }
        return f3 - this.m;
    }

    public final float b() {
        float f2;
        float f3 = f2 = this.k;
        if (f2 <= 0.0f) {
            f3 = f2;
            if (this.l > 0.0f) {
                f3 = (float)Math.max(this.getMeasuredHeight(), this.getMeasuredWidth()) * this.l;
            }
        }
        return f3 - this.m;
    }

    public final void c() {
        bah bah2 = this.e;
        if (bah2 != null) {
            bah2.a.cancel();
        }
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        this.d();
    }

    protected final void onDraw(Canvas canvas) {
        int n2;
        int n3;
        int n4;
        int n5;
        Object object;
        float f2 = this.getPaddingLeft();
        float f3 = this.getPaddingTop();
        float f4 = this.r ? this.b() : this.a();
        this.getAlpha();
        if (this.p > 0.0f) {
            object = this.b;
            n5 = this.getWidth();
            n4 = this.getPaddingRight();
            n3 = this.getHeight();
            n2 = this.getPaddingBottom();
            object.set(f2, f3, (float)(n5 - n4), (float)(n3 - n2));
            object = this.b;
            object.set(object.centerX() - f4, this.b.centerY() - f4, this.b.centerX() + f4, this.b.centerY() + f4);
            this.c.setColor(this.n);
            object = this.c;
            object.setAlpha(Math.round((float)object.getAlpha() * this.getAlpha()));
            this.c.setStyle(Paint.Style.STROKE);
            this.c.setStrokeWidth(this.p);
            this.c.setStrokeCap(this.o);
            canvas.drawArc(this.b, -90.0f, this.q * 360.0f, false, this.c);
        }
        object = this.b;
        n5 = this.getWidth();
        n3 = this.getPaddingRight();
        n4 = this.getHeight();
        n2 = this.getPaddingBottom();
        object.set(f2, f3, (float)(n5 - n3), (float)(n4 - n2));
        this.c.setColor(this.a);
        object = this.c;
        object.setAlpha(Math.round((float)object.getAlpha() * this.getAlpha()));
        this.c.setStyle(Paint.Style.FILL);
        RectF rectF = this.b;
        object = this.c;
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), f4, (Paint)object);
        object = this.h;
        if (object != null) {
            object.setAlpha(Math.round(this.getAlpha() * 255.0f));
            object = this.u;
            if (object != null) {
                this.h.setTint(((Integer)object).intValue());
            }
            this.h.draw(canvas);
        }
        super.onDraw(canvas);
    }

    protected final void onLayout(boolean bl2, int n2, int n3, int n4, int n5) {
        Drawable drawable = this.h;
        if (drawable != null) {
            float f2;
            float f3;
            int n6 = drawable.getIntrinsicWidth();
            int n7 = this.h.getIntrinsicHeight();
            int n8 = this.getMeasuredWidth();
            int n9 = this.getMeasuredHeight();
            float f4 = f3 = this.s;
            if (!(f3 > 0.0f)) {
                f4 = 1.0f;
            }
            f3 = (f2 = (float)n6) != 0.0f ? (float)n8 * f4 / f2 : 1.0f;
            float f5 = n7;
            f4 = f5 != 0.0f ? f4 * (float)n9 / f5 : 1.0f;
            f3 = Math.min(1.0f, Math.min(f3, f4));
            n6 = Math.round(f2 * f3);
            n7 = Math.round(f3 * f5);
            f4 = this.t;
            f3 = n6;
            n8 = (n8 - n6) / 2 + Math.round(f4 * f3);
            drawable = this.h;
            n9 = (n9 - n7) / 2;
            drawable.setBounds(n8, n9, n6 + n8, n7 + n9);
        }
        super.onLayout(bl2, n2, n3, n4, n5);
    }

    protected final void onMeasure(int n2, int n3) {
        float f2 = this.a();
        float f3 = this.p;
        Object object = this.d;
        float f4 = ((baf)object).a;
        float f5 = ((baf)object).b;
        int n4 = View.MeasureSpec.getMode((int)n2);
        int n5 = View.MeasureSpec.getSize((int)n2);
        int n6 = View.MeasureSpec.getMode((int)n3);
        int n7 = View.MeasureSpec.getSize((int)n3);
        f4 = f2 + f3 + f4 * 0.0f;
        n2 = n5;
        if (n4 != 0x40000000) {
            f5 = f4 + f4;
            n2 = n4 == Integer.MIN_VALUE ? (int)Math.min(f5, (float)n5) : (int)f5;
        }
        n3 = n7;
        if (n6 != 0x40000000) {
            f5 = f4 + f4;
            n3 = n6 == Integer.MIN_VALUE ? (int)Math.min(f5, (float)n7) : (int)f5;
        }
        object = this.v;
        n5 = n2;
        n7 = n3;
        if (object != null) {
            n7 = (Integer)object;
            if (n7 != 1) {
                if (n7 != 2) {
                    n5 = n2;
                    n7 = n3;
                } else {
                    n7 = n2;
                    n5 = n2;
                }
            } else {
                n5 = n3;
                n7 = n3;
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int)n5, (int)0x40000000), View.MeasureSpec.makeMeasureSpec((int)n7, (int)0x40000000));
    }

    protected final boolean onSetAlpha(int n2) {
        return true;
    }

    public final void onSizeChanged(int n2, int n3, int n4, int n5) {
        if (n2 == n4 && n3 == n5) {
            return;
        }
        this.d.a(this.getPaddingLeft(), this.getPaddingTop(), n2 - this.getPaddingRight(), n3 - this.getPaddingBottom());
    }

    protected final void onVisibilityChanged(View view, int n2) {
        super.onVisibilityChanged(view, n2);
        this.c();
    }

    protected final void onWindowVisibilityChanged(int n2) {
        super.onWindowVisibilityChanged(n2);
        this.c();
    }

    public final void setPadding(int n2, int n3, int n4, int n5) {
        if (n2 != this.getPaddingLeft() || n3 != this.getPaddingTop() || n4 != this.getPaddingRight() || n5 != this.getPaddingBottom()) {
            this.d.a(n2, n3, this.getWidth() - n4, this.getHeight() - n5);
        }
        super.setPadding(n2, n3, n4, n5);
    }

    public final void setPressed(boolean bl2) {
        super.setPressed(bl2);
        if (bl2 != this.r) {
            this.r = bl2;
            baf baf2 = this.d;
            float f2 = bl2 ? this.b() : this.a();
            baf2.c = f2;
            baf2.b();
            this.invalidate();
        }
    }
}

