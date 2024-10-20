/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 */
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class fvn
extends AnimatorListenerAdapter {
    final fvx a;
    private boolean b;

    public fvn(fvx fvx2) {
        this.a = fvx2;
    }

    public final void onAnimationCancel(Animator animator) {
        this.b = true;
    }

    public final void onAnimationEnd(Animator object) {
        object = this.a;
        object.A = 0;
        object.v = null;
        if (!this.b) {
            object.B.g(4, false);
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.a.B.g(0, false);
        fvx fvx2 = this.a;
        fvx2.A = 1;
        fvx2.v = animator;
        this.b = false;
    }
}

