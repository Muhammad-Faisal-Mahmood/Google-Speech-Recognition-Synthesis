/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 */
import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.List;

final class fxp
extends fxv {
    final List a;
    final Matrix b;

    public fxp(List list, Matrix matrix) {
        this.a = list;
        this.b = matrix;
    }

    @Override
    public final void a(Matrix object, fwz fwz2, int n2, Canvas canvas) {
        object = this.a.iterator();
        while (object.hasNext()) {
            ((fxv)object.next()).a(this.b, fwz2, n2, canvas);
        }
    }
}

