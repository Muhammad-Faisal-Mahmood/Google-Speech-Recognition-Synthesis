/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.LinearGradient
 *  android.graphics.Matrix
 *  android.graphics.RectF
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 */
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Shader;

final class fxr
extends fxv {
    private final fxt a;
    private final float b;
    private final float e;

    public fxr(fxt fxt2, float f2, float f3) {
        this.a = fxt2;
        this.b = f2;
        this.e = f3;
    }

    @Override
    public final void a(Matrix object, fwz fwz2, int n2, Canvas canvas) {
        fxt fxt2 = this.a;
        float f2 = fxt2.b;
        float f3 = this.e;
        float f4 = fxt2.a;
        float f5 = this.b;
        fxt2 = new RectF(0.0f, 0.0f, (float)Math.hypot(f2 - f3, f4 - f5), 0.0f);
        this.d.set(object);
        this.d.preTranslate(this.b, this.e);
        this.d.preRotate(this.b());
        ((RectF)fxt2).bottom += (float)n2;
        fxt2.offset(0.0f, -n2);
        object = fwz.a;
        object[0] = (Matrix)fwz2.j;
        object[1] = (Matrix)fwz2.i;
        object[2] = (Matrix)fwz2.h;
        object = new LinearGradient(((RectF)fxt2).left, ((RectF)fxt2).top, ((RectF)fxt2).left, ((RectF)fxt2).bottom, fwz.a, fwz.b, Shader.TileMode.CLAMP);
        fwz2.g.setShader((Shader)object);
        canvas.save();
        canvas.concat(this.d);
        canvas.drawRect((RectF)fxt2, fwz2.g);
        canvas.restore();
    }

    final float b() {
        fxt fxt2 = this.a;
        return (float)Math.toDegrees(Math.atan((fxt2.b - this.e) / (fxt2.a - this.b)));
    }
}

