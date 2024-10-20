/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.graphics.Path
 *  android.graphics.RectF
 */
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

public final class fxs
extends fxu {
    private static final RectF h = new RectF();
    @Deprecated
    public final float a;
    @Deprecated
    public final float b;
    @Deprecated
    public final float c;
    @Deprecated
    public final float d;
    @Deprecated
    public float e;
    @Deprecated
    public float f;

    public fxs(float f2, float f3, float f4, float f5) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
    }

    @Override
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.g;
        matrix.invert(matrix2);
        path.transform(matrix2);
        matrix2 = h;
        matrix2.set(this.a, this.b, this.c, this.d);
        path.arcTo((RectF)matrix2, this.e, this.f, false);
        path.transform(matrix);
    }
}

