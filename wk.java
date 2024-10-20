/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewConfiguration
 */
import android.view.ViewConfiguration;

public final class wk
implements uq {
    public final ViewConfiguration a;
    private final int b;

    public /* synthetic */ wk(ViewConfiguration viewConfiguration, int n2) {
        this.b = n2;
        this.a = viewConfiguration;
    }

    @Override
    public final Object a() {
        if (this.b != 0) {
            return this.a.getScaledMaximumFlingVelocity();
        }
        return this.a.getScaledMinimumFlingVelocity();
    }
}

