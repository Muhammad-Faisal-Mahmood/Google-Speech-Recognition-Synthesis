/*
 * Decompiled with CFR 0.152.
 */
public final class fxe
extends fxf {
    public fxe() {
        super(null);
    }

    @Override
    public final void a(fxw fxw2, float f2, float f3) {
        f2 = f3 * f2;
        fxw2.f(f2, 180.0f, 90.0f);
        double d2 = Math.sin(Math.toRadians(90.0));
        double d3 = f2;
        double d4 = Math.sin(Math.toRadians(0.0));
        fxw2.d((float)(d2 * d3), (float)(d4 * d3));
    }
}

