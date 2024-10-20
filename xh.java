/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.WindowInsets
 */
import android.view.WindowInsets;

class xh
extends xg {
    private tg c = null;

    public xh(xn xn2, WindowInsets windowInsets) {
        super(xn2, windowInsets);
    }

    @Override
    public final tg j() {
        if (this.c == null) {
            WindowInsets windowInsets = this.a;
            this.c = tg.d(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.c;
    }

    @Override
    public xn k() {
        return xn.m(this.a.consumeStableInsets());
    }

    @Override
    public xn l() {
        return xn.m(this.a.consumeSystemWindowInsets());
    }

    @Override
    public void m(tg tg2) {
        this.c = tg2;
    }

    @Override
    public boolean n() {
        return this.a.isConsumed();
    }
}

