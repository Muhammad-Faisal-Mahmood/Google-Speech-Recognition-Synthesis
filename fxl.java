/*
 * Decompiled with CFR 0.152.
 */
public final class fxl
extends fxf {
    public fxl() {
        super(null);
    }

    @Override
    public final void a(fxw fxw2, float f2, float f3) {
        f2 = f3 * f2;
        fxw2.f(f2, 180.0f, 90.0f);
        f3 = f2 + f2;
        fxs fxs2 = new fxs(0.0f, 0.0f, f3, f3);
        fxs2.e = 180.0f;
        fxs2.f = 90.0f;
        fxw2.f.add(fxs2);
        fxw2.b(new fxq(fxs2), 180.0f, 270.0f);
        f2 = (float)Math.cos(Math.toRadians(270.0));
        float f4 = f3 + 0.0f;
        f3 = f4 / 2.0f;
        fxw2.b = f2 * f3 + (f4 *= 0.5f);
        fxw2.c = f4 + f3 * (float)Math.sin(Math.toRadians(270.0));
    }
}

