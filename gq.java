/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 */
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.widget.ActionBarOverlayLayout;

public final class gq
extends AnimatorListenerAdapter {
    final ActionBarOverlayLayout a;

    public gq(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.a = actionBarOverlayLayout;
    }

    public final void onAnimationCancel(Animator object) {
        object = this.a;
        object.i = null;
        object.f = false;
    }

    public final void onAnimationEnd(Animator object) {
        object = this.a;
        object.i = null;
        object.f = false;
    }
}

