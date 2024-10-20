/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 */
import android.animation.Animator;

final class axe
implements Animator.AnimatorListener {
    final axf a;
    final axg b;

    public axe(axg axg2, axf axf2) {
        this.b = axg2;
        this.a = axf2;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
        this.b.a(1.0f, this.a, true);
        this.a.e();
        Object object = this.a;
        object.f();
        object.g();
        object = this.b;
        if (((axg)((Object)object)).d) {
            ((axg)((Object)object)).d = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            return;
        }
        ((axg)((Object)object)).c += 1.0f;
    }

    public final void onAnimationStart(Animator animator) {
        this.b.c = 0.0f;
    }
}

