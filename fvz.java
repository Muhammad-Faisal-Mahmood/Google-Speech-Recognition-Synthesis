/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorSet
 *  android.animation.AnimatorSet$Builder
 *  android.animation.ObjectAnimator
 *  android.animation.StateListAnimator
 *  android.graphics.Rect
 *  android.util.Property
 *  android.view.View
 */
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

public final class fvz
extends fvx {
    private StateListAnimator E;

    public fvz(FloatingActionButton floatingActionButton, AmbientModeSupport$AmbientController ambientModeSupport$AmbientController) {
        super(floatingActionButton, ambientModeSupport$AmbientController);
    }

    private final Animator p(float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet.Builder builder = animatorSet.play((Animator)ObjectAnimator.ofFloat((Object)this.B, (String)"elevation", (float[])new float[]{f2}).setDuration(0L));
        Property property = View.TRANSLATION_Z;
        builder.with((Animator)ObjectAnimator.ofFloat((Object)this.B, (Property)property, (float[])new float[]{f3}).setDuration(100L));
        animatorSet.setInterpolator(a);
        return animatorSet;
    }

    @Override
    public final float a() {
        return this.B.getElevation();
    }

    @Override
    public final void f(Rect rect) {
        if (this.D.k()) {
            super.f(rect);
            return;
        }
        if (!this.o()) {
            int n2 = (this.u - this.B.b()) / 2;
            rect.set(n2, n2, n2, n2);
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    @Override
    public final void g(float f2, float f3, float f4) {
        if (this.B.getStateListAnimator() == this.E) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(f, this.p(f2, f4));
            stateListAnimator.addState(g, this.p(f2, f3));
            stateListAnimator.addState(h, this.p(f2, f3));
            stateListAnimator.addState(i, this.p(f2, f3));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList<ObjectAnimator> arrayList = new ArrayList<ObjectAnimator>();
            arrayList.add(ObjectAnimator.ofFloat((Object)this.B, (String)"elevation", (float[])new float[]{f2}).setDuration(0L));
            arrayList.add(ObjectAnimator.ofFloat((Object)this.B, (Property)View.TRANSLATION_Z, (float[])new float[]{0.0f}).setDuration(100L));
            animatorSet.playSequentially(arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(a);
            stateListAnimator.addState(j, (Animator)animatorSet);
            stateListAnimator.addState(k, this.p(0.0f, 0.0f));
            this.E = stateListAnimator;
            this.B.setStateListAnimator(this.E);
        }
        if (((fvx)this).m()) {
            this.k();
        }
    }

    @Override
    public final boolean m() {
        return this.D.k() || !this.o();
        {
        }
    }
}

