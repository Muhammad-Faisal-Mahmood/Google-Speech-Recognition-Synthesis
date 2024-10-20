/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Path
 *  android.util.Log
 */
import android.graphics.Path;
import android.util.Log;

public final class th {
    public char a;
    public final float[] b;

    public th(char c2, float[] fArray) {
        this.a = c2;
        this.b = fArray;
    }

    public th(th object) {
        this.a = ((th)object).a;
        object = ((th)object).b;
        this.b = kt.k((float[])object, ((Object)object).length);
    }

    public static void a(Path path, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean bl2, boolean bl3) {
        double d2 = Math.toRadians(f8);
        double d3 = Math.cos(d2);
        double d4 = Math.sin(d2);
        double d5 = f2;
        double d6 = f3;
        double d7 = -f2;
        double d8 = d6;
        double d9 = f4;
        double d10 = f5;
        double d11 = -f4;
        d7 = f6;
        double d12 = (d9 * d3 + d10 * d4) / d7;
        double d13 = f7;
        double d14 = (d7 * d4 + d6 * d3) / d13;
        double d15 = (d11 * d4 + d10 * d3) / d13;
        double d16 = (d9 = (d6 = (d5 * d3 + d6 * d4) / d7) - d12) * d9 + (d11 = d14 - d15) * d11;
        if (d16 == 0.0) {
            Log.w((String)"PathParser", (String)" Points are coincident");
            return;
        }
        d10 = 1.0 / d16 - 0.25;
        if (d10 < 0.0) {
            StringBuilder stringBuilder = new StringBuilder("Points are too far apart ");
            stringBuilder.append(d16);
            Log.w((String)"PathParser", (String)stringBuilder.toString());
            float f9 = (float)(Math.sqrt(d16) / 1.99999);
            th.a(path, f2, f3, f4, f5, f6 * f9, f7 * f9, f8, bl2, bl3);
            return;
        }
        double d17 = Math.sqrt(d10);
        d10 = (d14 + d15) / 2.0;
        d16 = d9 * d17;
        d9 = (d6 + d12) / 2.0;
        d11 = d17 * d11;
        if (bl2 == bl3) {
            d9 -= d11;
            d11 = d10 + d16;
        } else {
            d9 += d11;
            d11 = d10 - d16;
        }
        d10 = Math.atan2(d14 - d11, d6 - d9);
        d14 = Math.atan2(d15 - d11, d12 - d9) - d10;
        double d18 = d14 - 0.0;
        double d19 = d18 == 0.0 ? 0 : (d18 > 0.0 ? 1 : -1);
        bl2 = d19 >= 0;
        d6 = d14;
        if (bl3 != bl2) {
            d6 = d19 > 0 ? Math.PI * -2 : Math.PI * 2;
            d6 = d14 + d6;
        }
        double d20 = d11 * d13;
        d15 = (d9 *= d7) * d3;
        d12 = d9 * d4;
        d3 = d20 * d3;
        int n2 = (int)Math.ceil(Math.abs(d6 * 4.0 / Math.PI));
        double d21 = Math.cos(d2);
        double d22 = Math.sin(d2);
        d14 = Math.cos(d10);
        d2 = Math.sin(d10);
        d11 = -d7;
        double d23 = d11 * d21;
        double d24 = d13 * d22;
        d9 = d11 * d22;
        double d25 = d13 * d21;
        d11 = d2 * d9 + d14 * d25;
        d14 = d23 * d2 - d24 * d14;
        d19 = 0.0;
        d13 = d8;
        d8 = d7;
        d7 = d9;
        d9 = d6;
        d6 = d15;
        d15 = d12;
        while (true) {
            double d26 = d11;
            if (d19 >= n2) break;
            d2 = d10 + d9 / (double)n2;
            double d27 = Math.sin(d2);
            d17 = Math.cos(d2);
            d11 = d2 - d10;
            d10 = Math.tan(d11 / 2.0);
            d10 = Math.sin(d11) * (Math.sqrt(d10 * 3.0 * d10 + 4.0) - 1.0) / 3.0;
            path.rLineTo(0.0f, 0.0f);
            d12 = d15 + d3 + d8 * d22 * d17 + d25 * d27;
            d16 = d6 - d20 * d4 + d8 * d21 * d17 - d24 * d27;
            d11 = d27 * d7 + d17 * d25;
            d17 = d23 * d27 - d24 * d17;
            path.cubicTo((float)(d5 + d14 * d10), (float)(d13 + d26 * d10), (float)(d16 - d10 * d17), (float)(d12 - d10 * d11), (float)d16, (float)d12);
            ++d19;
            d10 = d2;
            d5 = d16;
            d14 = d17;
            d13 = d12;
        }
    }
}

