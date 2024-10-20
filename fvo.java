/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 */
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class fvo
extends AnimatorListenerAdapter {
    final fvx a;

    public fvo(fvx fvx2) {
        this.a = fvx2;
    }

    public final void onAnimationEnd(Animator object) {
        object = this.a;
        object.A = 0;
        object.v = null;
    }

    public final void onAnimationStart(Animator animator) {
        this.a.B.g(0, false);
        fvx fvx2 = this.a;
        fvx2.A = 2;
        fvx2.v = animator;
    }
}

