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
import androidx.wear.ambient.AmbientMode$AmbientController;

public final class wo
implements ValueAnimator.AnimatorUpdateListener {
    public final Object a;
    private final int b;

    public /* synthetic */ wo(AmbientMode$AmbientController ambientMode$AmbientController, int n2) {
        this.b = n2;
        this.a = ambientMode$AmbientController;
    }

    public wo(jf jf2, int n2) {
        this.b = n2;
        this.a = jf2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.b != 0) {
            float f2 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator = ((jf)this.a).b;
            int n2 = (int)(f2 * 255.0f);
            valueAnimator.setAlpha(n2);
            ((jf)this.a).c.setAlpha(n2);
            ((jf)this.a).c();
            return;
        }
        ((View)((eq)((AmbientMode$AmbientController)this.a).a).c.getParent()).invalidate();
    }
}

