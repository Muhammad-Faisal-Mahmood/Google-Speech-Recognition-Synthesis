/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.view.animation.DecelerateInterpolator
 *  android.view.animation.LinearInterpolator
 */
import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

public final class ftf {
    public static final TimeInterpolator a = new LinearInterpolator();
    public static final TimeInterpolator b = new aam();
    public static final TimeInterpolator c = new aal();
    public static final TimeInterpolator d = new aan();
    public static final TimeInterpolator e = new DecelerateInterpolator();

    public static float a(float f2, float f3, float f4, float f5, float f6) {
        if (f6 <= f4) {
            return f2;
        }
        if (f6 >= f5) {
            return f3;
        }
        return f2 + (f6 - f4) / (f5 - f4) * (f3 - f2);
    }
}

