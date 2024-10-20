/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 */
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class wp
extends AnimatorListenerAdapter {
    final wq a;

    public wp(wq wq2) {
        this.a = wq2;
    }

    public final void onAnimationCancel(Animator animator) {
        this.a.c();
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.a();
    }

    public final void onAnimationStart(Animator animator) {
        this.a.b();
    }
}

