/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

public final class fub
extends ys {
    final SwipeDismissBehavior a;
    private int b;
    private int c;

    public fub(SwipeDismissBehavior swipeDismissBehavior) {
        this.a = swipeDismissBehavior;
        this.c = -1;
    }

    @Override
    public final int a(View view) {
        return view.getWidth();
    }

    @Override
    public final void b(View view, int n2) {
        this.c = n2;
        this.b = view.getLeft();
        if ((view = view.getParent()) != null) {
            this.a.b = true;
            view.requestDisallowInterceptTouchEvent(true);
            this.a.b = false;
        }
    }

    @Override
    public final void c(int n2) {
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void d(View var1_1, float var2_2, float var3_3) {
        block3: {
            block4: {
                block5: {
                    this.c = -1;
                    cfr_temp_0 = var2_2 - 0.0f;
                    var6_4 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                    var4_5 = var1_1.getWidth();
                    if (var6_4 == false) break block3;
                    var7_6 = var1_1.getLayoutDirection();
                    var5_8 = this.a.c;
                    if (var5_8 == 2) ** GOTO lbl-1000
                    if (var5_8 != 0) break block4;
                    if (var7_6 != 1) break block5;
                    if (var2_2 < 0.0f) ** GOTO lbl-1000
                    ** GOTO lbl-1000
                }
                if (var6_4 <= 0) ** GOTO lbl-1000
                ** GOTO lbl-1000
            }
            if (!(var7_6 == 1 ? var6_4 > 0 : var2_2 < 0.0f)) ** GOTO lbl-1000
            ** GOTO lbl-1000
        }
        var5_8 = var1_1.getLeft();
        var6_4 = this.b;
        var7_7 = Math.round((float)var1_1.getWidth() * 0.5f);
        if (Math.abs(var5_8 - var6_4) >= var7_7) lbl-1000:
        // 5 sources

        {
            var4_5 = !(var2_2 < 0.0f) && (var5_8 = var1_1.getLeft()) >= (var6_4 = (float)this.b) ? (int)(var6_4 + var4_5) : this.b - var4_5;
        } else lbl-1000:
        // 4 sources

        {
            var4_5 = this.b;
        }
        if (this.a.a.i(var4_5, var1_1.getTop())) {
            var1_1.postOnAnimation((Runnable)new cdn(this.a, var1_1, 2));
        }
    }

    @Override
    public final boolean e(View view, int n2) {
        int n3 = this.c;
        return (n3 == -1 || n3 == n2) && this.a.G(view);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final int f(View view, int n2) {
        int n3 = view.getLayoutDirection();
        int n4 = this.a.c;
        if (n4 == 0) {
            if (n3 == 1) {
                n3 = this.b - view.getWidth();
                n4 = this.b;
                return Math.min(Math.max(n3, n2), n4);
            }
            n3 = this.b;
            n4 = view.getWidth();
            return Math.min(Math.max(n3, n2), n4 += n3);
        } else {
            if (n4 != 1) {
                n3 = this.b - view.getWidth();
                n4 = this.b;
                n4 = view.getWidth() + n4;
                return Math.min(Math.max(n3, n2), n4);
            }
            if (n3 != 1) {
                n3 = this.b - view.getWidth();
                n4 = this.b;
                return Math.min(Math.max(n3, n2), n4);
            }
            n3 = this.b;
            n4 = view.getWidth();
        }
        return Math.min(Math.max(n3, n2), n4 += n3);
    }

    @Override
    public final int g(View view, int n2) {
        return view.getTop();
    }

    @Override
    public final void i(View view, int n2, int n3) {
        float f2 = (float)view.getWidth() * this.a.d;
        float f3 = (float)view.getWidth() * this.a.e;
        float f4 = Math.abs(n2 - this.b);
        if (f4 <= f2) {
            view.setAlpha(1.0f);
            return;
        }
        if (f4 >= f3) {
            view.setAlpha(0.0f);
            return;
        }
        view.setAlpha(SwipeDismissBehavior.H(1.0f - (f4 - f2) / (f3 - f2)));
    }
}

