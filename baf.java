/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.RadialGradient
 *  android.graphics.RectF
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 */
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

public final class baf {
    public final float a;
    public final float b;
    public float c;
    private final int[] d = new int[]{-16777216, 0};
    private final float[] e = new float[]{0.6f, 1.0f};
    private final RectF f = new RectF();
    private final Paint g;
    private float h;
    private final float i;

    public baf(float f2, float f3, float f4) {
        Paint paint;
        this.g = paint = new Paint();
        this.a = f2;
        this.b = 0.0f;
        this.c = f3;
        this.i = f4;
        this.h = f3 + f4 + f2 * 0.0f;
        paint.setColor(-16777216);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.b();
    }

    public final void a(int n2, int n3, int n4, int n5) {
        this.f.set((float)n2, (float)n3, (float)n4, (float)n5);
        this.b();
    }

    public final void b() {
        float f2;
        this.h = f2 = this.c + this.i + this.a * 0.0f;
        if (f2 > 0.0f) {
            Paint paint = this.g;
            RectF rectF = this.f;
            paint.setShader((Shader)new RadialGradient(rectF.centerX(), rectF.centerY(), this.h, this.d, this.e, Shader.TileMode.MIRROR));
        }
    }
}

