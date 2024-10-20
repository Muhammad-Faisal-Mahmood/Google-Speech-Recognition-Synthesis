/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 */
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

abstract class fvw
extends AnimatorListenerAdapter
implements ValueAnimator.AnimatorUpdateListener {
    private boolean a;
    final fvx b;
    private float c;
    private float d;

    public fvw(fvx fvx2) {
        this.b = fvx2;
    }

    protected abstract float a();

    public final void onAnimationEnd(Animator animator) {
        int n2 = (int)this.d;
        this.b.l(n2);
        this.a = false;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f2;
        Object object;
        if (!this.a) {
            object = this.b.m;
            f2 = object == null ? 0.0f : ((fxi)object).a();
            this.c = f2;
            this.d = this.a();
            this.a = true;
        }
        object = this.b;
        f2 = this.c;
        ((fvx)object).l((int)(f2 + (this.d - f2) * valueAnimator.getAnimatedFraction()));
    }
}

