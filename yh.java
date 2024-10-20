/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.util.DisplayMetrics
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  android.view.ViewConfiguration
 *  android.view.animation.AccelerateInterpolator
 *  android.view.animation.AnimationUtils
 *  android.view.animation.Interpolator
 *  android.widget.ListView
 */
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ListView;

public final class yh
implements View.OnTouchListener {
    private static final int g = ViewConfiguration.getTapTimeout();
    public final yg a;
    public final View b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final ListView f;
    private final Interpolator h;
    private Runnable i;
    private final float[] j;
    private final float[] k;
    private final int l;
    private final float[] m;
    private final float[] n;
    private final float[] o;
    private boolean p;
    private boolean q;

    public yh(ListView listView) {
        float[] fArray;
        float[] fArray2;
        float[] fArray3;
        float[] fArray4;
        float[] fArray5;
        yg yg2;
        this.a = yg2 = new yg();
        this.h = new AccelerateInterpolator();
        fArray5[0] = 0.0f;
        (fArray5 = new float[2])[1] = 0.0f;
        this.j = fArray5;
        fArray4[0] = Float.MAX_VALUE;
        (fArray4 = new float[2])[1] = Float.MAX_VALUE;
        this.k = fArray4;
        fArray3[0] = 0.0f;
        (fArray3 = new float[2])[1] = 0.0f;
        this.m = fArray3;
        fArray2[0] = 0.0f;
        (fArray2 = new float[2])[1] = 0.0f;
        this.n = fArray2;
        fArray[0] = Float.MAX_VALUE;
        (fArray = new float[2])[1] = Float.MAX_VALUE;
        this.o = fArray;
        this.b = listView;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        float f2 = displayMetrics.density;
        float f3 = displayMetrics.density;
        fArray[0] = f2 = (float)((int)(f2 * 1575.0f + 0.5f)) / 1000.0f;
        fArray[1] = f2;
        fArray2[0] = f3 = (float)((int)(f3 * 315.0f + 0.5f)) / 1000.0f;
        fArray2[1] = f3;
        fArray4[0] = Float.MAX_VALUE;
        fArray4[1] = Float.MAX_VALUE;
        fArray5[0] = 0.2f;
        fArray5[1] = 0.2f;
        fArray3[0] = 0.001f;
        fArray3[1] = 0.001f;
        this.l = g;
        yg2.a = 500;
        yg2.b = 500;
        this.f = listView;
    }

    static float a(float f2, float f3, float f4) {
        if (f2 > f4) {
            return f4;
        }
        if (f2 < f3) {
            return f3;
        }
        return f2;
    }

    /*
     * Unable to fully structure code
     */
    private final float d(int var1_1, float var2_2, float var3_3, float var4_4) {
        block4: {
            var5_5 = yh.a(this.j[var1_1] * var3_3, 0.0f, this.k[var1_1]);
            var6_6 = this.e(var2_2, var5_5);
            if (!((var2_2 = this.e(var3_3 - var2_2, var5_5) - var6_6) < 0.0f)) break block4;
            var2_2 = -this.h.getInterpolation(-var2_2);
            ** GOTO lbl9
        }
        if (var2_2 > 0.0f) {
            var2_2 = this.h.getInterpolation(var2_2);
lbl9:
            // 2 sources

            var2_2 = yh.a(var2_2, -1.0f, 1.0f);
        } else {
            var2_2 = 0.0f;
        }
        var7_7 = (cfr_temp_0 = var2_2 - 0.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
        if (var7_7 == false) {
            return 0.0f;
        }
        var6_6 = this.m[var1_1];
        var3_3 = this.n[var1_1];
        var5_5 = this.o[var1_1];
        var4_4 = var6_6 * var4_4;
        if (var7_7 > 0) {
            return yh.a(var2_2 * var4_4, var3_3, var5_5);
        }
        return -yh.a(-var2_2 * var4_4, var3_3, var5_5);
    }

    private final float e(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        if (f2 < f3) {
            if (f2 >= 0.0f) {
                return 1.0f - f2 / f3;
            }
            if (this.e) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    private final void f() {
        int n2;
        boolean bl2 = this.c;
        int n3 = 0;
        if (bl2) {
            this.e = false;
            return;
        }
        yg yg2 = this.a;
        long l2 = AnimationUtils.currentAnimationTimeMillis();
        int n4 = (int)(l2 - yg2.e);
        if (n4 > (n2 = yg2.b)) {
            n4 = n2;
        } else if (n4 < 0) {
            n4 = n3;
        }
        yg2.i = n4;
        yg2.h = yg2.a(l2);
        yg2.g = l2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean b() {
        int n2;
        yg yg2 = this.a;
        float f2 = yg2.d;
        f2 /= Math.abs(f2);
        float f3 = yg2.c;
        f3 /= Math.abs(f3);
        int n3 = (int)f2;
        boolean bl2 = false;
        if (n3 != 0 && (n2 = (yg2 = this.f).getCount()) != 0) {
            int n4 = yg2.getChildCount();
            int n5 = yg2.getFirstVisiblePosition();
            if (n3 > 0) {
                if (n5 + n4 < n2) return true;
                if (yg2.getChildAt(n4 - 1).getBottom() > yg2.getHeight()) {
                    return true;
                }
            } else if (n3 < 0) {
                if (n5 > 0) return true;
                if (yg2.getChildAt(0).getTop() < 0) {
                    return true;
                }
            }
        }
        if ((int)f3 != 0) return bl2;
        return bl2;
    }

    public final void c(boolean bl2) {
        if (this.q && !bl2) {
            this.f();
        }
        this.q = bl2;
    }

    public final boolean onTouch(View object, MotionEvent object2) {
        block6: {
            int n2;
            block9: {
                block7: {
                    block8: {
                        if (!this.q) break block6;
                        n2 = object2.getActionMasked();
                        if (n2 == 0) break block7;
                        if (n2 == 1) break block8;
                        if (n2 == 2) break block9;
                        if (n2 != 3) break block6;
                    }
                    this.f();
                    break block6;
                }
                this.d = true;
                this.p = false;
            }
            float f2 = this.d(0, object2.getX(), object.getWidth(), this.b.getWidth());
            float f3 = this.d(1, object2.getY(), object.getHeight(), this.b.getHeight());
            object = this.a;
            object.c = f2;
            object.d = f3;
            if (!this.e && this.b()) {
                if (this.i == null) {
                    this.i = new kd(this, 12);
                }
                this.e = true;
                this.c = true;
                if (!this.p && (n2 = this.l) > 0) {
                    object = this.b;
                    object2 = this.i;
                    int[] nArray = wj.a;
                    object.postOnAnimationDelayed((Runnable)object2, (long)n2);
                } else {
                    this.i.run();
                }
                this.p = true;
            }
        }
        return false;
    }
}

