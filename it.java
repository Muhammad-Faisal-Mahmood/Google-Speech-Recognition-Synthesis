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

public final class it
extends AnimatorListenerAdapter {
    final iu a;
    final ViewPropertyAnimator b;
    final View c;
    final kk d;

    public it(kk kk2, iu iu2, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = kk2;
        this.a = iu2;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        this.c.setTranslationX(0.0f);
        this.c.setTranslationY(0.0f);
        this.d.a(this.a.b);
        this.d.l.remove(this.a.b);
        this.d.c();
    }

    public final void onAnimationStart(Animator object) {
        object = this.a.b;
    }
}

