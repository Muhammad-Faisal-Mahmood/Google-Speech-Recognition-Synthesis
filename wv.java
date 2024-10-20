/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 *  android.view.View
 */
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class wv
extends AnimatorListenerAdapter {
    final View a;
    final ilo b;

    public wv(ilo ilo2, View view) {
        this.b = ilo2;
        this.a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.b.h(1.0f);
        wy.d(this.a, this.b);
    }
}

