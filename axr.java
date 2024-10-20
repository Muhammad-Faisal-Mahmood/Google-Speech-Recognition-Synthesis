/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ObjectAnimator
 *  android.util.Property
 *  android.view.View
 */
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;

public final class axr
extends aza {
    public axr() {
    }

    public axr(int n2) {
        this.u = n2;
    }

    private static float O(aym object, float f2) {
        if (object != null && (object = (Float)((aym)object).a.get("android:fade:transitionAlpha")) != null) {
            return ((Float)object).floatValue();
        }
        return f2;
    }

    private final Animator P(View object, float f2, float f3) {
        if (f2 == f3) {
            return null;
        }
        ayr.c(object, f2);
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat((Object)object, (Property)ayr.b, (float[])new float[]{f3});
        object = new axq((View)object);
        objectAnimator.addListener((Animator.AnimatorListener)object);
        this.j().D((axz)object);
        return objectAnimator;
    }

    @Override
    public final void c(aym aym2) {
        Float f2;
        aza.N(aym2);
        Float f3 = f2 = (Float)aym2.b.getTag(2131427990);
        if (f2 == null) {
            f3 = aym2.b.getVisibility() == 0 ? Float.valueOf(ayr.a(aym2.b)) : Float.valueOf(0.0f);
        }
        aym2.a.put("android:fade:transitionAlpha", f3);
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final Animator f(View view, aym aym2) {
        ays ays2 = ayr.a;
        return this.P(view, axr.O(aym2, 0.0f), 1.0f);
    }

    @Override
    public final Animator g(View view, aym aym2, aym aym3) {
        ays ays2 = ayr.a;
        if ((aym2 = this.P(view, axr.O(aym2, 1.0f), 0.0f)) == null) {
            ayr.c(view, axr.O(aym3, 1.0f));
        }
        return aym2;
    }
}

