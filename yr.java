/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.animation.Interpolator
 */
import android.view.animation.Interpolator;

public final class yr
implements Interpolator {
    private final int a;

    public yr(int n2) {
        this.a = n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final float getInterpolation(float f2) {
        if (this.a == 0) return (f2 -= 1.0f) * f2 * f2 * f2 * f2 + 1.0f;
        return (f2 -= 1.0f) * f2 * f2 * f2 * f2 + 1.0f;
    }
}

