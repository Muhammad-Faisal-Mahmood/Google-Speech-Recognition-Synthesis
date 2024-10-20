/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TypeEvaluator
 *  android.graphics.Matrix
 */
import android.animation.TypeEvaluator;
import android.graphics.Matrix;

public class fth
implements TypeEvaluator {
    private final float[] a = new float[9];
    private final float[] b = new float[9];
    private final Matrix c = new Matrix();

    public Matrix a(float f2, Matrix object, Matrix object2) {
        object.getValues(this.a);
        object2.getValues(this.b);
        for (int i2 = 0; i2 < 9; ++i2) {
            object2 = this.b;
            object = this.a;
            Matrix matrix = object2[i2];
            Matrix matrix2 = object[i2];
            object2[i2] = matrix2 + (matrix - matrix2) * f2;
        }
        this.c.setValues(this.b);
        return this.c;
    }
}

