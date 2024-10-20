/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 */
import android.animation.ValueAnimator;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public final class fud
implements ValueAnimator.AnimatorUpdateListener {
    final Object a;
    private final int b;

    public fud(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    public final void onAnimationUpdate(ValueAnimator object) {
        if (this.b != 0) {
            int n2 = (Integer)object.getAnimatedValue();
            ((CollapsingToolbarLayout)((Object)this.a)).d(n2);
            return;
        }
        float f2 = ((Float)object.getAnimatedValue()).floatValue();
        object = ((BottomSheetBehavior)this.a).d;
        if (object != null) {
            ((fxi)object).m(f2);
        }
    }
}

