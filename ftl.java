/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.graphics.drawable.Drawable
 */
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.material.appbar.AppBarLayout;

public final class ftl
implements ValueAnimator.AnimatorUpdateListener {
    public final Object a;
    public final Drawable b;
    private final int c;

    public ftl(axg axg2, axf axf2, int n2) {
        this.c = n2;
        this.b = axg2;
        this.a = axf2;
    }

    public /* synthetic */ ftl(AppBarLayout appBarLayout, fxi fxi2, int n2) {
        this.c = n2;
        this.a = appBarLayout;
        this.b = fxi2;
    }

    public final void onAnimationUpdate(ValueAnimator object) {
        if (this.c != 0) {
            float f2 = ((Float)object.getAnimatedValue()).floatValue();
            axg.b(f2, (axf)this.a);
            object = this.b;
            axf axf2 = (axf)this.a;
            ((axg)((Object)object)).a(f2, axf2, false);
            ((axg)this.b).invalidateSelf();
            return;
        }
        float f3 = ((Float)object.getAnimatedValue()).floatValue();
        ((fxi)this.b).k(f3);
        object = (AppBarLayout)this.a;
        Drawable drawable = ((AppBarLayout)object).h;
        if (drawable instanceof fxi) {
            ((fxi)drawable).k(f3);
        }
        object = ((AppBarLayout)object).g.iterator();
        while (object.hasNext()) {
            ((ftq)object.next()).a();
        }
    }
}

