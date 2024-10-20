/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 */
import android.graphics.Color;

public final class tf {
    static {
        new ThreadLocal();
    }

    public static int a(double d2, double d3, double d4) {
        double d5 = (3.2406 * d2 + -1.5372 * d3 + -0.4986 * d4) / 100.0;
        d5 = d5 > 0.0031308 ? Math.pow(d5, 0.4166666666666667) * 1.055 - 0.055 : (d5 *= 12.92);
        double d6 = (-0.9689 * d2 + 1.8758 * d3 + 0.0415 * d4) / 100.0;
        d6 = d6 > 0.0031308 ? Math.pow(d6, 0.4166666666666667) * 1.055 - 0.055 : (d6 *= 12.92);
        d2 = (0.0557 * d2 + -0.204 * d3 + 1.057 * d4) / 100.0;
        d2 = d2 > 0.0031308 ? Math.pow(d2, 0.4166666666666667) * 1.055 - 0.055 : (d2 *= 12.92);
        return Color.rgb((int)tf.e((int)Math.round(d5 * 255.0)), (int)tf.e((int)Math.round(d6 * 255.0)), (int)tf.e((int)Math.round(d2 * 255.0)));
    }

    public static int b(int n2, int n3) {
        int n4 = Color.alpha((int)n3);
        int n5 = Color.alpha((int)n2);
        int n6 = Color.red((int)n2);
        int n7 = Color.red((int)n3);
        int n8 = 255 - (255 - n4) * (255 - n5) / 255;
        return Color.argb((int)n8, (int)tf.d(n6, n5, n7, n4, n8), (int)tf.d(Color.green((int)n2), n5, Color.green((int)n3), n4, n8), (int)tf.d(Color.blue((int)n2), n5, Color.blue((int)n3), n4, n8));
    }

    public static int c(int n2, int n3) {
        if (n3 >= 0 && n3 <= 255) {
            return n2 & 0xFFFFFF | n3 << 24;
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    private static int d(int n2, int n3, int n4, int n5, int n6) {
        if (n6 == 0) {
            return 0;
        }
        return (n2 * 255 * n3 + n4 * n5 * (255 - n3)) / (n6 * 255);
    }

    private static int e(int n2) {
        if (n2 < 0) {
            return 0;
        }
        return Math.min(n2, 255);
    }
}

