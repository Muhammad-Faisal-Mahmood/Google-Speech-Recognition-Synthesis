/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Path
 *  android.graphics.RadialGradient
 *  android.graphics.RectF
 *  android.graphics.Region$Op
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 */
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

final class fxq
extends fxv {
    private final fxs a;

    public fxq(fxs fxs2) {
        this.a = fxs2;
    }

    @Override
    public final void a(Matrix matrix, fwz fwz2, int n2, Canvas canvas) {
        float f2;
        Object object;
        fxs fxs2 = this.a;
        float f3 = fxs2.e;
        float f4 = fxs2.f;
        fxs2 = new RectF(fxs2.a, fxs2.b, fxs2.c, fxs2.d);
        boolean bl2 = f4 < 0.0f;
        Path path = fwz2.k;
        if (bl2) {
            object = fwz.c;
            object[0] = 0;
            object[1] = fwz2.j;
            object[2] = fwz2.i;
            object[3] = fwz2.h;
        } else {
            path.rewind();
            path.moveTo(fxs2.centerX(), fxs2.centerY());
            path.arcTo((RectF)fxs2, f3, f4);
            path.close();
            f2 = -n2;
            fxs2.inset(f2, f2);
            object = fwz.c;
            object[0] = 0;
            object[1] = fwz2.h;
            object[2] = fwz2.i;
            object[3] = fwz2.j;
        }
        f2 = fxs2.width() / 2.0f;
        if (f2 <= 0.0f) {
            return;
        }
        float f5 = 1.0f - (float)n2 / f2;
        float f6 = (1.0f - f5) / 2.0f;
        object = fwz.d;
        object[1] = (int)f5;
        object[2] = (int)(f5 + f6);
        object = new RadialGradient(fxs2.centerX(), fxs2.centerY(), f2, fwz.c, fwz.d, Shader.TileMode.CLAMP);
        fwz2.f.setShader((Shader)object);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, fxs2.height() / fxs2.width());
        if (!bl2) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, fwz2.l);
        }
        canvas.drawArc((RectF)fxs2, f3, f4, true, fwz2.f);
        canvas.restore();
    }
}

