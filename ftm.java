/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.view.View
 */
import android.animation.ValueAnimator;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;

public final class ftm
implements ValueAnimator.AnimatorUpdateListener {
    final CoordinatorLayout a;
    final AppBarLayout b;
    final AppBarLayout$BaseBehavior c;

    public ftm(AppBarLayout$BaseBehavior appBarLayout$BaseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.a = coordinatorLayout;
        this.b = appBarLayout;
        this.c = appBarLayout$BaseBehavior;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int n2 = (Integer)valueAnimator.getAnimatedValue();
        this.c.S(this.a, (View)this.b, n2);
    }
}

