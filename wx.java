/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.View$OnApplyWindowInsetsListener
 *  android.view.WindowInsets
 *  android.view.animation.Interpolator
 */
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import j$.util.Objects;

public final class wx
implements View.OnApplyWindowInsetsListener {
    final wt a;
    private xn b;

    public wx(View object, wt wt2) {
        this.a = wt2;
        object = wb.a((View)object);
        if (object != null) {
            object = Build.VERSION.SDK_INT >= 30 ? new xe((xn)object) : (Build.VERSION.SDK_INT >= 29 ? new xd((xn)object) : new xc((xn)object));
            object = ((xf)object).a();
        } else {
            object = null;
        }
        this.b = object;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int n2;
        int n3;
        if (!view.isLaidOut()) {
            this.b = xn.n(windowInsets, view);
            return wy.a(view, windowInsets);
        }
        xn xn2 = xn.n(windowInsets, view);
        if (this.b == null) {
            this.b = wb.a(view);
        }
        if (this.b == null) {
            this.b = xn2;
            return wy.a(view, windowInsets);
        }
        Object object = wy.b(view);
        if (object != null && Objects.equals(((wt)object).a, windowInsets)) {
            return wy.a(view, windowInsets);
        }
        object = this.b;
        int n4 = 0;
        for (n3 = 1; n3 <= 256; n3 += n3) {
            n2 = n4;
            if (!xn2.f(n3).equals(((xn)object).f(n3))) {
                n2 = n4 | n3;
            }
            n4 = n2;
        }
        if (n4 == 0) {
            return wy.a(view, windowInsets);
        }
        xn xn3 = this.b;
        object = (n4 & 8) != 0 ? (xn2.f((int)8).e > xn3.f((int)8).e ? wy.a : wy.b) : wy.c;
        ilo ilo2 = new ilo(n4, (Interpolator)object, 160L);
        ilo2.h(0.0f);
        object = ValueAnimator.ofFloat((float[])new float[]{0.0f, 1.0f}).setDuration(((xb)ilo2.a).i());
        tg tg2 = xn2.f(n4);
        tg tg3 = xn3.f(n4);
        int n5 = tg2.b;
        int n6 = tg3.b;
        int n7 = tg2.c;
        int n8 = tg3.c;
        n3 = tg2.d;
        int n9 = tg3.d;
        n2 = tg2.e;
        int n10 = tg3.e;
        Object object2 = tg.d(Math.min(n5, n6), Math.min(n7, n8), Math.min(n3, n9), Math.min(n2, n10));
        n8 = tg2.b;
        n5 = tg3.b;
        n10 = tg2.c;
        n3 = tg3.c;
        n6 = tg2.d;
        n7 = tg3.d;
        n9 = tg2.e;
        n2 = tg3.e;
        object2 = new ws((tg)object2, tg.d(Math.max(n8, n5), Math.max(n10, n3), Math.max(n6, n7), Math.max(n9, n2)));
        wy.e(view, ilo2, windowInsets, false);
        object.addUpdateListener((ValueAnimator.AnimatorUpdateListener)new wu(ilo2, xn2, xn3, n4, view));
        object.addListener((Animator.AnimatorListener)new wv(ilo2, view));
        vl.a(view, new ww(view, ilo2, (ws)object2, (ValueAnimator)object, 0));
        this.b = xn2;
        return wy.a(view, windowInsets);
    }
}

