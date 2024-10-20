/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.animation.Interpolator
 */
import android.view.animation.Interpolator;

public class xb {
    private final int a;
    private float b;
    private final Interpolator c;
    private final long d;

    public xb(int n2, Interpolator interpolator, long l2) {
        this.a = n2;
        this.c = interpolator;
        this.d = l2;
    }

    public float g() {
        Interpolator interpolator = this.c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.b);
        }
        return this.b;
    }

    public int h() {
        return this.a;
    }

    public long i() {
        return this.d;
    }

    public void j(float f2) {
        this.b = f2;
    }
}

