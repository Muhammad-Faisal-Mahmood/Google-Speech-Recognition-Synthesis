/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 */
import android.graphics.Canvas;
import android.graphics.Matrix;

abstract class fxv {
    static final Matrix c = new Matrix();
    final Matrix d = new Matrix();

    public abstract void a(Matrix var1, fwz var2, int var3, Canvas var4);

    public final void c(fwz fwz2, int n2, Canvas canvas) {
        this.a(c, fwz2, n2, canvas);
    }
}

