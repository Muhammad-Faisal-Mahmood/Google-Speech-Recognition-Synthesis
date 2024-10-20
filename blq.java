/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.animation.DecelerateInterpolator
 *  android.view.animation.Interpolator
 */
import android.content.Context;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

public final class blq
extends lc {
    final float m;
    final float n;
    final float o;
    final Interpolator p;

    public blq(Context context) {
        super(context);
        float f2;
        this.m = f2 = bnv.b(context.getResources(), 2131165392);
        this.n = bnv.b(context.getResources(), 2131165390);
        this.p = new DecelerateInterpolator(bnv.b(context.getResources(), 2131165389));
        this.o = f2 / (float)context.getResources().getDisplayMetrics().densityDpi;
    }

    @Override
    protected final int f(int n2) {
        return (int)Math.ceil((float)((lc)this).g(n2) / this.n);
    }

    @Override
    protected final int g(int n2) {
        return (int)Math.ceil((float)Math.abs(n2) * this.o);
    }

    @Override
    protected final int h() {
        return -1;
    }

    @Override
    protected final void j(View view, la la2) {
        int n2;
        int n3 = this.e(view, -1);
        if (n3 != 0 && (n2 = ((lc)this).f(n3)) > 0) {
            la2.b(0, -n3, n2, this.p);
        }
    }
}

