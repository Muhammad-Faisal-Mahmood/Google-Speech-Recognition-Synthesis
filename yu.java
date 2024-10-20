/*
 * Decompiled with CFR 0.152.
 */
import android.animation.ValueAnimator$DurationScaleChangeListener;

public final class yu
implements ValueAnimator$DurationScaleChangeListener {
    public final yv a;

    public /* synthetic */ yu(yv yv2) {
        this.a = yv2;
    }

    public final void onChanged(float f2) {
        this.a.b.f = f2;
    }
}

