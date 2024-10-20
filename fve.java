/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Color
 */
import android.content.Context;
import android.graphics.Color;

public final class fve {
    private static final int c = (int)Math.round(5.1000000000000005);
    public final boolean a;
    public final int b;
    private final int d;
    private final int e;
    private final float f;

    public fve(Context context) {
        boolean bl2 = fvc.s(context, 2130969122, false);
        int n2 = fvc.l(context, 2130969121);
        int n3 = fvc.l(context, 2130969120);
        int n4 = fvc.l(context, 2130968966);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = bl2;
        this.d = n2;
        this.e = n3;
        this.b = n4;
        this.f = f2;
    }

    public final int a(int n2, float f2) {
        int n3 = n2;
        if (this.a) {
            n3 = n2;
            if (tf.c(n2, 255) == this.b) {
                float f3 = this.f;
                f2 = !(f3 <= 0.0f) && !(f2 <= 0.0f) ? Math.min(((float)Math.log1p(f2 / f3) * 4.5f + 2.0f) / 100.0f, 1.0f) : 0.0f;
                int n4 = Color.alpha((int)n2);
                n2 = n3 = fvc.i(tf.c(n2, 255), this.d, f2);
                if (f2 > 0.0f) {
                    int n5 = this.e;
                    n2 = n3;
                    if (n5 != 0) {
                        n2 = tf.b(tf.c(n5, c), n3);
                    }
                }
                n3 = tf.c(n2, n4);
            }
        }
        return n3;
    }
}

