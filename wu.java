/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.os.Build$VERSION
 *  android.view.View
 */
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import java.util.Collections;

final class wu
implements ValueAnimator.AnimatorUpdateListener {
    final xn a;
    final xn b;
    final int c;
    final View d;
    final ilo e;

    public wu(ilo ilo2, xn xn2, xn xn3, int n2, View view) {
        this.e = ilo2;
        this.a = xn2;
        this.b = xn3;
        this.c = n2;
        this.d = view;
    }

    public final void onAnimationUpdate(ValueAnimator object) {
        this.e.h(object.getAnimatedFraction());
        float f2 = this.e.e();
        object = wy.a;
        int n2 = Build.VERSION.SDK_INT;
        Object object2 = this.a;
        object = n2 >= 30 ? new xe((xn)object2) : (Build.VERSION.SDK_INT >= 29 ? new xd((xn)object2) : new xc((xn)object2));
        for (n2 = 1; n2 <= 256; n2 += n2) {
            if ((this.c & n2) == 0) {
                ((xf)object).g(n2, ((xn)object2).f(n2));
                continue;
            }
            Object object3 = this.b;
            tg tg2 = ((xn)object2).f(n2);
            object3 = ((xn)object3).f(n2);
            int n3 = tg2.b;
            int n4 = ((tg)object3).b;
            float f3 = 1.0f - f2;
            int n5 = tg2.c;
            int n6 = ((tg)object3).c;
            int n7 = tg2.d;
            int n8 = ((tg)object3).d;
            int n9 = tg2.e;
            int n10 = ((tg)object3).e;
            ((xf)object).g(n2, xn.h(tg2, (int)((double)((float)(n3 - n4) * f3) + 0.5), (int)((double)((float)(n5 - n6) * f3) + 0.5), (int)((double)((float)(n7 - n8) * f3) + 0.5), (int)((double)((float)(n9 - n10) * f3) + 0.5)));
        }
        object = ((xf)object).a();
        object2 = this.e;
        wy.c(this.d, (xn)object, Collections.singletonList(object2));
    }
}

