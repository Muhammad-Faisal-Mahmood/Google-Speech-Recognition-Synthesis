/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 */
import android.graphics.Color;

public final class sv {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public sv(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
        this.e = f6;
        this.f = f7;
    }

    static sv b(int n2) {
        float[] fArray = new float[3];
        te te2 = te.a;
        float f2 = sw.a(Color.red((int)n2));
        float f3 = sw.a(Color.green((int)n2));
        float f4 = sw.a(Color.blue((int)n2));
        Object object = sw.d;
        float[] fArray2 = object[0];
        fArray[0] = fArray2[0] * f2 + fArray2[1] * f3 + fArray2[2] * f4;
        fArray2 = object[1];
        fArray[1] = fArray2[0] * f2 + fArray2[1] * f3 + fArray2[2] * f4;
        object = object[2];
        fArray[2] = f3 = f2 * object[0] + f3 * object[1] + f4 * object[2];
        object = sw.a;
        float f5 = fArray[0];
        fArray2 = object[0];
        float f6 = fArray2[0];
        float f7 = fArray[1];
        f2 = fArray2[1];
        float f8 = fArray2[2];
        fArray2 = object[1];
        float f9 = fArray2[0];
        float f10 = fArray2[1];
        float f11 = fArray2[2];
        object = object[2];
        Object object2 = object[0];
        f4 = (float)object[1];
        Object object3 = object[2];
        object = te2.g;
        f2 = (float)(object[0] * (f6 * f5 + f2 * f7 + f8 * f3));
        f9 = (float)(object[1] * (f9 * f5 + f10 * f7 + f11 * f3));
        object2 = object[2] * (f5 * object2 + f7 * f4 + f3 * object3);
        f7 = (float)Math.pow((double)(te2.h * Math.abs(f2)) / 100.0, 0.42);
        f3 = (float)Math.pow((double)(te2.h * Math.abs(f9)) / 100.0, 0.42);
        f4 = (float)Math.pow((double)(te2.h * Math.abs((float)object2)) / 100.0, 0.42);
        object3 = Math.signum(f2);
        f5 = Math.signum(f9);
        f2 = Math.signum((float)object2);
        f9 = (float)(object3 * 400.0f * f7 / (f7 + 27.13f));
        double d2 = f9;
        f3 = f5 * 400.0f * f3 / (f3 + 27.13f);
        double d3 = f3;
        double d4 = f9 + f3;
        f8 = f2 * 400.0f * f4 / (f4 + 27.13f);
        double d5 = f8;
        f4 = (float)(d4 - (d5 + d5));
        f11 = f4 / 9.0f;
        d5 = f11;
        f2 = (float)(d2 * 11.0 + d3 * -12.0 + d5);
        f10 = f2 / 11.0f;
        if ((f4 = (float)Math.atan2(d5, f10) * 180.0f / (float)Math.PI) < 0.0f) {
            f2 = f4 + 360.0f;
        } else {
            f2 = f4;
            if (f4 >= 360.0f) {
                f2 = f4 - 360.0f;
            }
        }
        f6 = f3 * 20.0f;
        f7 = (float)Math.PI * f2 / 180.0f;
        f4 = (40.0f * f9 + f6 + f8) / 20.0f * te2.c / te2.b;
        f3 = te2.e;
        f3 = te2.j;
        f3 = (float)Math.pow(f4, f3 * 0.69f);
        f4 = te2.e;
        f5 = f3 * 100.0f;
        object3 = (float)Math.sqrt(f5 / 100.0f);
        object2 = te2.b;
        f3 = te2.i;
        f4 = (double)f2 < 20.14 ? 360.0f + f2 : f2;
        f9 = (f9 * 20.0f + f6 + 21.0f * f8) / 20.0f;
        f8 = (float)(Math.cos((double)f4 * Math.PI / 180.0 + 2.0) + 3.8);
        f6 = te2.d;
        f11 = (float)Math.sqrt(f10 * f10 + f11 * f11);
        f4 = (float)Math.pow(1.64 - Math.pow(0.29, te2.f), 0.73);
        f11 = (float)Math.pow(f8 * 0.25f * 3846.1538f * f6 * f11 / (f9 + 0.305f), 0.9);
        f10 = (float)Math.sqrt((double)f5 / 100.0);
        f9 = te2.i;
        f11 = f4 * f11;
        f4 = f11 * f10;
        f10 = te2.e;
        f11 = (float)Math.sqrt(f11 * 0.69f / (te2.b + 4.0f));
        f10 = (float)Math.log(0.0228f * (f9 *= f4) + 1.0f);
        d5 = f7;
        d2 = Math.cos(d5);
        f8 = f10 * 43.85965f;
        f10 = (float)d2;
        f6 = (float)Math.sin(d5);
        fArray[0] = f2;
        fArray[1] = f4;
        f7 = 1.7f * f5 / (0.007f * f5 + 1.0f);
        f6 = f8 * f6;
        fArray = new float[]{f5, (float)(object3 * 5.7971015f * (object2 + 4.0f) * f3), f9, f11 * 50.0f, f7, f10 * f8, f6};
        return new sv(f2, f4, fArray[0], fArray[4], fArray[5], f6);
    }

    public static sv c(float f2, float f3, float f4) {
        te te2 = te.a;
        float f5 = te2.e;
        double d2 = (double)f2 / 100.0;
        Math.sqrt(d2);
        f5 = te2.b;
        float f6 = te2.i;
        f5 = (float)Math.sqrt(d2);
        float f7 = te2.e;
        f7 = te2.b;
        Math.sqrt(f3 / f5 * 0.69f / (f7 + 4.0f));
        f7 = (float)Math.log((double)(f6 * f3) * 0.0228 + 1.0);
        d2 = (float)Math.PI * f4 / 180.0f;
        f5 = (float)Math.cos(d2);
        f6 = (float)Math.sin(d2);
        return new sv(f4, f3, f2, 1.7f * f2 / (0.007f * f2 + 1.0f), (f7 *= 43.85965f) * f5, f7 * f6);
    }

    final int a(te object) {
        float f2;
        Object object2 = this.b;
        double d2 = object2;
        float f3 = f2 = 0.0f;
        if (d2 != 0.0) {
            d2 = this.c;
            f3 = d2 == 0.0 ? f2 : object2 / (float)Math.sqrt(d2 / 100.0);
        }
        d2 = Math.pow(0.29, ((te)object).f);
        f2 = (float)Math.pow((double)f3 / Math.pow(1.64 - d2, 0.73), 1.1111111111111112);
        d2 = this.a * (float)Math.PI / 180.0f;
        double d3 = Math.cos(2.0 + d2);
        f3 = ((te)object).b;
        double d4 = (double)this.c / 100.0;
        object2 = ((te)object).e;
        Object object3 = (float)Math.pow(d4, 1.4492753673265821 / (double)((te)object).j);
        Object object4 = (float)(d3 + 3.8);
        object2 = ((te)object).d;
        f3 = f3 * object3 / ((te)object).c;
        float f4 = (float)Math.sin(d2);
        object3 = (float)Math.cos(d2);
        f2 = (0.305f + f3) * 23.0f * f2 / (object4 * 0.25f * 3846.1538f * object2 * 23.0f + 11.0f * f2 * object3 + 108.0f * f2 * f4);
        object3 *= f2;
        Object object5 = f2 * f4;
        Object object6 = f3 * 460.0f;
        f2 = (451.0f * object3 + object6 + 288.0f * object5) / 1403.0f;
        object2 = (float)Math.max(0.0, (double)Math.abs(f2) * 27.13 / (400.0 - (double)Math.abs(f2)));
        f3 = 100.0f / ((te)object).h;
        f2 = Math.signum(f2);
        object4 = (float)Math.pow(object2, 2.380952380952381);
        f4 = (object6 - 891.0f * object3 - 261.0f * object5) / 1403.0f;
        Object object7 = (float)Math.max(0.0, (double)Math.abs(f4) * 27.13 / (400.0 - (double)Math.abs(f4)));
        object2 = 100.0f / ((te)object).h;
        f4 = Math.signum(f4);
        object7 = (float)Math.pow(object7, 2.380952380952381);
        object3 = (object6 - object3 * 220.0f - object5 * 6300.0f) / 1403.0f;
        object6 = (float)Math.max(0.0, (double)Math.abs(object3) * 27.13 / (400.0 - (double)Math.abs(object3)));
        object3 = Math.signum(object3);
        object5 = 100.0f / ((te)object).h;
        object6 = (float)Math.pow(object6, 2.380952380952381);
        object = ((te)object).g;
        f3 = f2 * f3 * object4 / object[0];
        f2 = f4 * object2 * object7 / object[1];
        f4 = object3 * object5 * object6 / object[2];
        object = sw.b;
        Object object8 = object[0];
        Object object9 = object8[0];
        object6 = object8[1];
        object7 = object8[2];
        object8 = object[1];
        object5 = object8[0];
        object4 = object8[1];
        Object object10 = object8[2];
        object = object[2];
        Object object11 = object[0];
        object2 = object[1];
        object3 = object[2];
        return tf.a((double)(object9 * f3 + object6 * f2 + object7 * f4), object5 * f3 + object4 * f2 + object10 * f4, f3 * object11 + f2 * object2 + f4 * object3);
    }
}

