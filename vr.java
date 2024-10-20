/*
 * Decompiled with CFR 0.152.
 */
final class vr {
    public final float[] a = new float[20];
    public final long[] b = new long[20];
    public float c = 0.0f;
    public int d = 0;
    public int e = 0;

    public static float a(float f2) {
        float f3 = Math.abs(f2);
        f3 = (float)Math.sqrt(f3 + f3);
        f2 = f2 < 0.0f ? -1.0f : 1.0f;
        return f2 * f3;
    }
}

