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

public final class ir
extends AnimatorListenerAdapter {
    final lg a;
    final int b;
    final View c;
    final int d;
    final ViewPropertyAnimator e;
    final kk f;

    public ir(kk kk2, lg lg2, int n2, View view, int n3, ViewPropertyAnimator viewPropertyAnimator) {
        this.f = kk2;
        this.a = lg2;
        this.b = n2;
        this.c = view;
        this.d = n3;
        this.e = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        if (this.b != 0) {
            this.c.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            this.c.setTranslationY(0.0f);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        this.e.setListener(null);
        this.f.a(this.a);
        this.f.j.remove(this.a);
        this.f.c();
    }

    public final void onAnimationStart(Animator animator) {
    }
}

