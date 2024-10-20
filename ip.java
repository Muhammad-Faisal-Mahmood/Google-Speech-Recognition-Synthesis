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

final class ip
extends AnimatorListenerAdapter {
    final lg a;
    final ViewPropertyAnimator b;
    final View c;
    final kk d;

    public ip(kk kk2, lg lg2, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = kk2;
        this.a = lg2;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        this.d.a(this.a);
        this.d.k.remove(this.a);
        this.d.c();
    }

    public final void onAnimationStart(Animator animator) {
    }
}

