/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorListenerAdapter
 */
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class axw
extends AnimatorListenerAdapter {
    final ayc a;

    public axw(ayc ayc2) {
        this.a = ayc2;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.s();
        animator.removeListener((Animator.AnimatorListener)this);
    }
}

