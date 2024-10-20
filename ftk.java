/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.res.ColorStateList
 */
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import com.google.android.material.appbar.AppBarLayout;

public final class ftk
implements ValueAnimator.AnimatorUpdateListener {
    public final AppBarLayout a;
    public final ColorStateList b;
    public final ColorStateList c;
    public final fxi d;
    public final Integer e;

    public /* synthetic */ ftk(AppBarLayout appBarLayout, ColorStateList colorStateList, ColorStateList colorStateList2, fxi fxi2, Integer n2) {
        this.a = appBarLayout;
        this.b = colorStateList;
        this.c = colorStateList2;
        this.d = fxi2;
        this.e = n2;
    }

    public final void onAnimationUpdate(ValueAnimator object) {
        Object object22;
        float f2 = ((Float)object.getAnimatedValue()).floatValue();
        object = this.c;
        int n2 = fvc.i(this.b.getDefaultColor(), object.getDefaultColor(), f2);
        Object object3 = ColorStateList.valueOf((int)n2);
        object = this.d;
        ((fxi)object).l((ColorStateList)object3);
        object3 = this.a;
        if (((AppBarLayout)object3).h != null && (object22 = ((AppBarLayout)object3).i) != null && ((Integer)object22).equals(this.e)) {
            ((AppBarLayout)object3).h.setTint(n2);
        }
        if (!((AppBarLayout)object3).g.isEmpty()) {
            for (Object object22 : ((AppBarLayout)object3).g) {
                if (((fxi)object).a.d == null) continue;
                object22.a();
            }
        }
    }
}

