/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.Paint
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.drawable.Animatable
 *  android.graphics.drawable.Drawable
 *  android.view.animation.Interpolator
 *  android.view.animation.LinearInterpolator
 */
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

public final class axg
extends Drawable
implements Animatable {
    private static final Interpolator e = new LinearInterpolator();
    private static final Interpolator f = new aam();
    private static final int[] g = new int[]{-16777216};
    public final axf a;
    public final Resources b;
    float c;
    boolean d;
    private float h;
    private final Animator i;

    public axg(Context context) {
        axf axf2;
        a.Y(context);
        this.b = context.getResources();
        this.a = axf2 = new axf();
        axf2.c(g);
        axf2.d(2.5f);
        this.invalidateSelf();
        context = ValueAnimator.ofFloat((float[])new float[]{0.0f, 1.0f});
        context.addUpdateListener((ValueAnimator.AnimatorUpdateListener)new ftl(this, axf2, 1));
        context.setRepeatCount(-1);
        context.setRepeatMode(1);
        context.setInterpolator((TimeInterpolator)e);
        context.addListener((Animator.AnimatorListener)new axe(this, axf2));
        this.i = context;
    }

    public static final void b(float f2, axf axf2) {
        if (f2 > 0.75f) {
            int n2 = axf2.a();
            int[] nArray = axf2.i;
            axf2.f();
            int n3 = nArray[0];
            int n4 = n2 & 0xFF;
            f2 = (f2 - 0.75f) / 0.25f;
            int n5 = (int)((float)((n3 & 0xFF) - n4) * f2);
            int n6 = n2 >> 8 & 0xFF;
            int n7 = (int)((float)((n3 >> 8 & 0xFF) - n6) * f2);
            int n8 = n2 >> 16 & 0xFF;
            int n9 = (int)((float)((n3 >> 16 & 0xFF) - n8) * f2);
            n2 = n2 >> 24 & 0xFF;
            axf2.q = n2 + (int)(f2 * (float)((n3 >> 24 & 0xFF) - n2)) << 24 | n8 + n9 << 16 | n6 + n7 << 8 | n4 + n5;
            return;
        }
        axf2.q = axf2.a();
    }

    public final void a(float f2, axf axf2, boolean bl2) {
        float f3;
        float f4;
        if (this.d) {
            axg.b(f2, axf2);
            double d2 = Math.floor(axf2.l / 0.8f);
            float f5 = axf2.j;
            float f6 = axf2.k;
            axf2.e = f5 + (-0.01f + f6 - f5) * f2;
            axf2.f = f6;
            f6 = axf2.l;
            axf2.g = f6 + ((float)(d2 + 1.0) - f6) * f2;
            return;
        }
        if (f2 == 1.0f && !bl2) {
            return;
        }
        float f7 = axf2.l;
        if (f2 < 0.5f) {
            f4 = f2 / 0.5f;
            f3 = axf2.j;
            f4 = f.getInterpolation(f4) * 0.79f + 0.01f + f3;
        } else {
            f3 = (-0.5f + f2) / 0.5f;
            f4 = axf2.j + 0.79f;
            f3 = f4 - ((1.0f - f.getInterpolation(f3)) * 0.79f + 0.01f);
        }
        float f8 = this.c;
        axf2.e = f3;
        axf2.f = f4;
        axf2.g = f7 + 0.20999998f * f2;
        this.h = (f2 + f8) * 216.0f;
    }

    public final void draw(Canvas canvas) {
        float f2;
        Rect rect = this.getBounds();
        canvas.save();
        canvas.rotate(this.h, rect.exactCenterX(), rect.exactCenterY());
        axf axf2 = this.a;
        float f3 = axf2.n;
        float f4 = axf2.h / 2.0f + f3;
        if (f3 <= 0.0f) {
            f2 = (float)Math.min(rect.width(), rect.height()) / 2.0f;
            f3 = axf2.o;
            f4 = axf2.m;
            f4 = f2 - Math.max(f3 / 2.0f, axf2.h / 2.0f);
        }
        RectF rectF = axf2.a;
        rectF.set((float)rect.centerX() - f4, (float)rect.centerY() - f4, (float)rect.centerX() + f4, (float)rect.centerY() + f4);
        f2 = axf2.e;
        f4 = axf2.g;
        f3 = axf2.f;
        axf2.b.setColor(axf2.q);
        axf2.b.setAlpha(axf2.p);
        float f5 = axf2.h / 2.0f;
        rectF.inset(f5, f5);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, axf2.d);
        f5 = -f5;
        rectF.inset(f5, f5);
        axf2 = axf2.b;
        f2 = (f2 + f4) * 360.0f;
        canvas.drawArc(rectF, f2, (f3 + f4) * 360.0f - f2, false, (Paint)axf2);
        canvas.restore();
    }

    public final int getAlpha() {
        return this.a.p;
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isRunning() {
        return this.i.isRunning();
    }

    public final void setAlpha(int n2) {
        this.a.p = n2;
        this.invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.b.setColorFilter(colorFilter);
        this.invalidateSelf();
    }

    public final void start() {
        this.i.cancel();
        this.a.e();
        axf axf2 = this.a;
        if (axf2.f != axf2.e) {
            this.d = true;
            this.i.setDuration(666L);
            this.i.start();
            return;
        }
        axf2.g();
        this.a.b();
        this.i.setDuration(1332L);
        this.i.start();
    }

    public final void stop() {
        this.i.cancel();
        this.h = 0.0f;
        this.a.g();
        this.a.b();
        this.invalidateSelf();
    }
}

