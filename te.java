/*
 * Decompiled with CFR 0.152.
 */
final class te {
    static final te a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float[] g;
    public final float h;
    public final float i;
    public final float j;

    static {
        float[] fArray = sw.c;
        double d2 = sw.c();
        Object object = sw.a;
        float f2 = fArray[0];
        float[] fArray2 = object[0];
        float f3 = fArray2[0];
        float f4 = fArray[1];
        float f5 = fArray2[1];
        float f6 = fArray[2];
        float f7 = fArray2[2];
        fArray2 = object[1];
        float f8 = fArray2[0];
        float f9 = fArray2[1];
        float f10 = fArray2[2];
        object = object[2];
        Object object2 = object[0];
        float[] fArray3 = object[1];
        float[] fArray4 = object[2];
        float f11 = (float)(d2 * 63.66197723675813 / 100.0);
        float f12 = 1.0f - (float)Math.exp((-f11 - 42.0f) / 92.0f) * 0.2777778f;
        if ((d2 = (double)f12) > 1.0) {
            f12 = 1.0f;
        } else if (d2 < 0.0) {
            f12 = 0.0f;
        }
        object2 = f2 * object2 + f4 * fArray3 + f6 * fArray4;
        f8 = f8 * f2 + f9 * f4 + f10 * f6;
        f7 = f3 * f2 + f5 * f4 + f7 * f6;
        f6 = 100.0f / f7;
        f2 = 100.0f / f8;
        f4 = 100.0f / object2;
        object = new float[3];
        object[0] = (float[])(f6 * f12 + 1.0f - f12);
        object[1] = (float[])(f2 * f12 + 1.0f - f12);
        object[2] = (float[])(f4 * f12 + 1.0f - f12);
        f12 = 1.0f / (5.0f * f11 + 1.0f);
        f3 = f12 * f12 * f12 * f12;
        f5 = 1.0f - f3;
        f10 = (float)Math.cbrt((double)f11 * 5.0);
        f4 = sw.c() / fArray[1];
        d2 = f4;
        f12 = (float)Math.sqrt(d2);
        f6 = (float)Math.pow(d2, 0.2);
        f2 = (float)object[0];
        f11 = f3 * f11 + 0.1f * f5 * f5 * f10;
        f7 = (float)Math.pow((double)(f2 * f11 * f7) / 100.0, 0.42);
        f8 = (float)Math.pow((double)(object[1] * f11 * f8) / 100.0, 0.42);
        object2 = (float)Math.pow((double)(object[2] * f11 * object2) / 100.0, 0.42);
        fArray = new float[]{f7, f8, (float)object2};
        f8 = fArray[0];
        f8 = f8 * 400.0f / (f8 + 27.13f);
        f7 = fArray[1];
        f7 = f7 * 400.0f / (f7 + 27.13f);
        object2 = 400.0f * object2 / (object2 + 27.13f);
        fArray = new float[]{f8, f7, (float)object2};
        f2 = fArray[0];
        f7 = fArray[1];
        f8 = (float)Math.pow(f11, 0.25);
        f6 = 0.725f / f6;
        a = new te(f4, (f2 + f2 + f7 + object2 * 0.05f) * f6, f6, f6, (float[])object, f11, f8, f12 + 1.48f);
    }

    private te(float f2, float f3, float f4, float f5, float[] fArray, float f6, float f7, float f8) {
        this.f = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
        this.e = 0.69f;
        this.g = fArray;
        this.h = f6;
        this.i = f7;
        this.j = f8;
    }
}

