/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 */
import android.graphics.Matrix;

final class fvp
extends fth {
    final fvx a;

    public fvp(fvx fvx2) {
        this.a = fvx2;
    }

    @Override
    public final Matrix a(float f2, Matrix matrix, Matrix matrix2) {
        this.a.y = f2;
        return super.a(f2, matrix, matrix2);
    }
}

