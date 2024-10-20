/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 */
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.Objects;

public final class ac
implements Animation.AnimationListener {
    final cy a;
    final ViewGroup b;
    final View c;
    final ad d;

    public ac(cy cy2, ViewGroup viewGroup, View view, ad ad2) {
        this.a = cy2;
        this.b = viewGroup;
        this.c = view;
        this.d = ad2;
    }

    public final void onAnimationEnd(Animation animation) {
        jse.e(animation, "animation");
        animation = this.b;
        animation.post((Runnable)new ai((Object)animation, (Object)this.c, (Object)this.d, 1, null));
        if (by.S(2)) {
            Objects.toString(this.a);
        }
    }

    public final void onAnimationRepeat(Animation animation) {
        jse.e(animation, "animation");
    }

    public final void onAnimationStart(Animation animation) {
        jse.e(animation, "animation");
        if (by.S(2)) {
            Objects.toString(this.a);
        }
    }
}

