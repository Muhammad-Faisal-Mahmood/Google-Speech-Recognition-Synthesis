/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 */
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class axv
extends AnimatorListenerAdapter {
    final ot a;
    final ayc b;

    public axv(ayc ayc2, ot ot2) {
        this.b = ayc2;
        this.a = ot2;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.remove(animator);
        this.b.k.remove(animator);
    }

    public final void onAnimationStart(Animator animator) {
        this.b.k.add(animator);
    }
}

