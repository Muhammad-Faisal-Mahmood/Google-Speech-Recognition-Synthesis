/*
 * Decompiled with CFR 0.152.
 */
public final class yg {
    public int a;
    public int b;
    public float c;
    public float d;
    public long e = Long.MIN_VALUE;
    public long f = 0L;
    public long g = -1L;
    public float h;
    public int i;

    public final float a(long l2) {
        long l3 = this.e;
        if (l2 < l3) {
            return 0.0f;
        }
        long l4 = this.g;
        if (l4 >= 0L && l2 >= l4) {
            float f2 = this.h;
            float f3 = this.i;
            return 1.0f - f2 + f2 * yh.a((float)(l2 - l4) / f3, 0.0f, 1.0f);
        }
        float f4 = this.a;
        return yh.a((float)(l2 - l3) / f4, 0.0f, 1.0f) * 0.5f;
    }
}

