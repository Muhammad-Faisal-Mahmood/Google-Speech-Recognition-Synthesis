/*
 * Decompiled with CFR 0.152.
 */
public final class k {
    public int a = -1;
    public int b = -1;
    public int c = 0;
    public float d;
    public final float[] e = new float[6];
    h[] f = new h[8];
    int g = 0;
    public int h;

    public k(int n2) {
        this.h = n2;
    }

    final void a(h hArray) {
        int n2 = 0;
        for (int i2 = 0; i2 < this.g; ++i2) {
            int n3;
            if (this.f[i2] != hArray) continue;
            while (n2 < (n3 = this.g) - i2 - 1) {
                hArray = this.f;
                n3 = i2 + n2;
                hArray[n3] = hArray[n3 + 1];
                ++n2;
            }
            this.g = n3 - 1;
            return;
        }
    }

    public final void b() {
        this.h = 5;
        this.c = 0;
        this.a = -1;
        this.b = -1;
        this.d = 0.0f;
        this.g = 0;
    }

    public final String toString() {
        return "null";
    }
}

