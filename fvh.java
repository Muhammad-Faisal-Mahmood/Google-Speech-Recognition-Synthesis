/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.LinearGradient
 *  android.graphics.Outline
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 */
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

public final class fvh
extends Drawable {
    public final Paint a;
    public float b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g = true;
    public fxm h;
    private final fxo i = fxn.a;
    private final Path j = new Path();
    private final Rect k = new Rect();
    private final RectF l = new RectF();
    private final RectF m = new RectF();
    private final fvg n = new fvg(this);
    private int o;
    private ColorStateList p;

    public fvh(fxm fxm2) {
        this.h = fxm2;
        fxm2 = new Paint(1);
        this.a = fxm2;
        fxm2.setStyle(Paint.Style.STROKE);
    }

    protected final RectF a() {
        this.m.set(this.getBounds());
        return this.m;
    }

    public final void b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.o = colorStateList.getColorForState(this.getState(), this.o);
        }
        this.p = colorStateList;
        this.g = true;
        this.invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        float f2;
        float f3;
        if (this.g) {
            Paint paint = this.a;
            Rect rect = this.k;
            this.copyBounds(rect);
            f3 = this.b / (float)rect.height();
            int n2 = tf.b(this.c, this.o);
            int n3 = tf.b(this.d, this.o);
            int n4 = tf.b(tf.c(this.d, 0), this.o);
            int n5 = tf.b(tf.c(this.f, 0), this.o);
            int n6 = tf.b(this.f, this.o);
            int n7 = tf.b(this.e, this.o);
            f2 = rect.top;
            float f4 = rect.bottom;
            rect = Shader.TileMode.CLAMP;
            paint.setShader((Shader)new LinearGradient(0.0f, f2, 0.0f, f4, new int[]{n2, n3, n4, n5, n6, n7}, new float[]{0.0f, f3, 0.5f, 0.5f, 1.0f - f3, 1.0f}, (Shader.TileMode)rect));
            this.g = false;
        }
        f3 = this.a.getStrokeWidth() / 2.0f;
        this.copyBounds(this.k);
        this.l.set(this.k);
        f2 = Math.min(this.h.b.a(this.a()), this.l.width() / 2.0f);
        if (this.h.d(this.a())) {
            this.l.inset(f3, f3);
            canvas.drawRoundRect(this.l, f2, f2, this.a);
        }
    }

    public final Drawable.ConstantState getConstantState() {
        return this.n;
    }

    public final int getOpacity() {
        if (this.b > 0.0f) {
            return -3;
        }
        return -2;
    }

    public final void getOutline(Outline outline) {
        if (this.h.d(this.a())) {
            float f2 = this.h.b.a(this.a());
            outline.setRoundRect(this.getBounds(), f2);
            return;
        }
        this.copyBounds(this.k);
        this.l.set(this.k);
        this.i.b(this.h, null, 1.0f, this.l, null, this.j);
        fvc.f(outline, this.j);
    }

    public final boolean getPadding(Rect rect) {
        if (this.h.d(this.a())) {
            int n2 = Math.round(this.b);
            rect.set(n2, n2, n2, n2);
        }
        return true;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList = this.p;
        return colorStateList != null && colorStateList.isStateful() || super.isStateful();
    }

    protected final void onBoundsChange(Rect rect) {
        this.g = true;
    }

    protected final boolean onStateChange(int[] nArray) {
        int n2;
        ColorStateList colorStateList = this.p;
        if (colorStateList != null && (n2 = colorStateList.getColorForState(nArray, this.o)) != this.o) {
            this.g = true;
            this.o = n2;
        }
        if (this.g) {
            this.invalidateSelf();
        }
        return this.g;
    }

    public final void setAlpha(int n2) {
        this.a.setAlpha(n2);
        this.invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        this.invalidateSelf();
    }
}

