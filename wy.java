/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.WindowInsets
 *  android.view.animation.DecelerateInterpolator
 *  android.view.animation.Interpolator
 *  android.view.animation.PathInterpolator
 */
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import java.util.List;

public final class wy
extends xb {
    public static final Interpolator a = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final Interpolator b = new aal();
    public static final Interpolator c = new DecelerateInterpolator();

    public wy(int n2, Interpolator interpolator, long l2) {
        super(n2, interpolator, l2);
    }

    static WindowInsets a(View view, WindowInsets windowInsets) {
        if (view.getTag(2131427920) != null) {
            return windowInsets;
        }
        return view.onApplyWindowInsets(windowInsets);
    }

    static wt b(View object) {
        if ((object = object.getTag(2131427928)) instanceof wx) {
            return ((wx)object).a;
        }
        return null;
    }

    static void c(View view, xn xn2, List list) {
        wt wt2 = wy.b(view);
        if (wt2 == null) {
            if (view instanceof ViewGroup) {
                view = (ViewGroup)view;
                for (int i2 = 0; i2 < view.getChildCount(); ++i2) {
                    wy.c(view.getChildAt(i2), xn2, list);
                }
            }
            return;
        }
        wt2.b(list);
    }

    static void d(View view, ilo ilo2) {
        wt wt2 = wy.b(view);
        if (wt2 == null) {
            if (view instanceof ViewGroup) {
                view = (ViewGroup)view;
                for (int i2 = 0; i2 < view.getChildCount(); ++i2) {
                    wy.d(view.getChildAt(i2), ilo2);
                }
            }
            return;
        }
        wt2.a();
    }

    static void e(View view, ilo ilo2, WindowInsets windowInsets, boolean bl2) {
        wt wt2 = wy.b(view);
        boolean bl3 = bl2;
        if (wt2 != null) {
            wt2.a = windowInsets;
            bl3 = bl2;
            if (!bl2) {
                wt2.c(ilo2);
                bl3 = true;
            }
        }
        if (view instanceof ViewGroup) {
            view = (ViewGroup)view;
            for (int i2 = 0; i2 < view.getChildCount(); ++i2) {
                wy.e(view.getChildAt(i2), ilo2, windowInsets, bl3);
            }
        }
    }

    static void f(View view, ilo ilo2, ws ws2) {
        wt wt2 = wy.b(view);
        if (wt2 == null) {
            if (view instanceof ViewGroup) {
                view = (ViewGroup)view;
                for (int i2 = 0; i2 < view.getChildCount(); ++i2) {
                    wy.f(view.getChildAt(i2), ilo2, ws2);
                }
            }
            return;
        }
        wt2.d(ilo2, ws2);
    }
}

