/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.WindowInsets
 */
import android.view.WindowInsets;

class xj
extends xi {
    private tg c = null;
    private tg f = null;
    private tg g = null;

    public xj(xn xn2, WindowInsets windowInsets) {
        super(xn2, windowInsets);
    }

    @Override
    public xn d(int n2, int n3, int n4, int n5) {
        return xn.m(dp$$ExternalSyntheticApiModelOutline0.m(this.a, n2, n3, n4, n5));
    }

    @Override
    public void m(tg tg2) {
    }

    @Override
    public tg q() {
        if (this.f == null) {
            this.f = tg.e(dp$$ExternalSyntheticApiModelOutline0.m$2(this.a));
        }
        return this.f;
    }

    @Override
    public tg r() {
        if (this.c == null) {
            this.c = tg.e(dp$$ExternalSyntheticApiModelOutline0.m$1(this.a));
        }
        return this.c;
    }

    @Override
    public tg s() {
        if (this.g == null) {
            this.g = tg.e(dp$$ExternalSyntheticApiModelOutline0.m$3(this.a));
        }
        return this.g;
    }
}

