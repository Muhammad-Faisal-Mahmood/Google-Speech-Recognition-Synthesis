/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.graphics.Matrix
 */
import android.animation.ValueAnimator;
import android.graphics.Matrix;

final class fvq
implements ValueAnimator.AnimatorUpdateListener {
    final float a;
    final float b;
    final float c;
    final float d;
    final float e;
    final float f;
    final float g;
    final Matrix h;
    final fvx i;

    public fvq(fvx fvx2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, Matrix matrix) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
        this.e = f6;
        this.f = f7;
        this.g = f8;
        this.h = matrix;
        this.i = fvx2;
    }

    public final void onAnimationUpdate(ValueAnimator object) {
        float f2 = ((Float)object.getAnimatedValue()).floatValue();
        float f3 = ftf.a(this.a, this.b, 0.0f, 0.2f, f2);
        this.i.B.setAlpha(f3);
        f3 = this.d;
        float f4 = this.c;
        this.i.B.setScaleX(f4 + (f3 - f4) * f2);
        f3 = this.d;
        f4 = this.e;
        this.i.B.setScaleY(f4 + (f3 - f4) * f2);
        f3 = this.g;
        f4 = this.f;
        object = this.i;
        ((fvx)object).y = f2 = f4 + f2 * (f3 - f4);
        ((fvx)object).e(f2, this.h);
        this.i.B.setImageMatrix(this.h);
    }
}

