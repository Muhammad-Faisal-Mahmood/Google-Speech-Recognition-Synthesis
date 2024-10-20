/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 */
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class je
extends AnimatorListenerAdapter {
    final jf a;
    private boolean b;

    public je(jf jf2) {
        this.a = jf2;
        this.b = false;
    }

    public final void onAnimationCancel(Animator animator) {
        this.b = true;
    }

    public final void onAnimationEnd(Animator object) {
        if (this.b) {
            this.b = false;
            return;
        }
        if (((Float)this.a.p.getAnimatedValue()).floatValue() == 0.0f) {
            object = this.a;
            ((jf)object).q = 0;
            ((jf)object).d(0);
            return;
        }
        object = this.a;
        ((jf)object).q = 2;
        ((jf)object).c();
    }
}

