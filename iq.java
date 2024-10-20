/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 *  android.view.View
 *  android.view.ViewPropertyAnimator
 */
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

public final class iq
extends AnimatorListenerAdapter {
    final lg a;
    final View b;
    final ViewPropertyAnimator c;
    final kk d;

    public iq(kk kk2, lg lg2, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.d = kk2;
        this.a = lg2;
        this.b = view;
        this.c = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        this.b.setAlpha(1.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        this.c.setListener(null);
        this.d.a(this.a);
        this.d.i.remove(this.a);
        this.d.c();
    }

    public final void onAnimationStart(Animator animator) {
    }
}

