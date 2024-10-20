/*
 * Decompiled with CFR 0.152.
 */
final class sw {
    static final float[][] a = new float[][]{{0.401288f, 0.650173f, -0.051461f}, {-0.250268f, 1.204414f, 0.045854f}, {-0.002079f, 0.048952f, 0.953127f}};
    static final float[][] b;
    static final float[] c;
    static final float[][] d;

    static {
        float[] fArray = new float[]{1.8620678f, -1.0112547f, 0.14918678f};
        float[] fArray2 = new float[]{-0.0158415f, -0.03412294f, 1.0499644f};
        b = new float[][]{fArray, {0.38752654f, 0.62144744f, -0.00897398f}, fArray2};
        c = new float[]{95.047f, 100.0f, 108.883f};
        d = new float[][]{{0.41233894f, 0.35762063f, 0.18051042f}, {0.2126f, 0.7152f, 0.0722f}, {0.01932141f, 0.11916382f, 0.9503448f}};
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static float a(int n2) {
        float f2 = (float)n2 / 255.0f;
        if (f2 <= 0.04045f) {
            f2 /= 12.92f;
            return f2 * 100.0f;
        }
        f2 = (float)Math.pow((f2 + 0.055f) / 1.055f, 2.4f);
        return f2 * 100.0f;
    }

    static int b(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (16.0f + f2) / 116.0f;
        float f4 = f3 * f3 * f3;
        f2 = f2 > 8.0f ? f4 : (f2 /= 903.2963f);
        boolean bl2 = f4 > 0.008856452f;
        float f5 = bl2 ? f4 : (f3 * 116.0f - 16.0f) / 903.2963f;
        if (!bl2) {
            f4 = (f3 * 116.0f - 16.0f) / 903.2963f;
        }
        float[] fArray = c;
        float f6 = fArray[0];
        f3 = fArray[1];
        float f7 = fArray[2];
        return tf.a(f5 * f6, f2 * f3, f4 * f7);
    }

    static float c() {
        return (float)Math.pow(0.5689655172413793, 3.0) * 100.0f;
    }
}

