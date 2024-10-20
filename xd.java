/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.WindowInsets
 *  android.view.WindowInsets$Builder
 */
import android.view.WindowInsets;

public class xd
extends xf {
    final WindowInsets.Builder a;

    public xd() {
        this.a = new WindowInsets.Builder();
    }

    public xd(xn xn2) {
        super(xn2);
        xn2 = xn2.e();
        xn2 = xn2 != null ? new WindowInsets.Builder((WindowInsets)xn2) : new WindowInsets.Builder();
        this.a = xn2;
    }

    @Override
    public xn a() {
        this.h();
        xn xn2 = xn.m(dp$$ExternalSyntheticApiModelOutline0.m(this.a));
        xn2.p(this.b);
        return xn2;
    }

    @Override
    public void b(tg tg2) {
        dp$$ExternalSyntheticApiModelOutline0.m$3(this.a, tg2.a());
    }

    @Override
    public void c(tg tg2) {
        dp$$ExternalSyntheticApiModelOutline0.m(this.a, tg2.a());
    }

    @Override
    public void d(tg tg2) {
        dp$$ExternalSyntheticApiModelOutline0.m$2(this.a, tg2.a());
    }

    @Override
    public void e(tg tg2) {
        dp$$ExternalSyntheticApiModelOutline0.m$1(this.a, tg2.a());
    }

    @Override
    public void f(tg tg2) {
        dp$$ExternalSyntheticApiModelOutline0.m$4(this.a, tg2.a());
    }
}

