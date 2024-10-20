/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Paint
 *  android.graphics.Paint$Cap
 *  android.graphics.Paint$Style
 *  android.graphics.RectF
 */
import android.graphics.Paint;
import android.graphics.RectF;

public final class axf {
    final RectF a = new RectF();
    final Paint b;
    final Paint c;
    final Paint d;
    float e;
    float f;
    float g;
    float h;
    int[] i;
    float j;
    float k;
    float l;
    final float m;
    public float n;
    public int o;
    int p;
    int q;

    public axf() {
        Paint paint;
        Paint paint2;
        Paint paint3;
        this.b = paint3 = new Paint();
        this.c = paint2 = new Paint();
        this.d = paint = new Paint();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 5.0f;
        this.m = 1.0f;
        this.p = 255;
        paint3.setStrokeCap(Paint.Cap.SQUARE);
        paint3.setAntiAlias(true);
        paint3.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint.setColor(0);
    }

    final int a() {
        return this.i[0];
    }

    final void b() {
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
    }

    public final void c(int[] nArray) {
        this.i = nArray;
        this.g();
    }

    public final void d(float f2) {
        this.h = f2;
        this.b.setStrokeWidth(f2);
    }

    final void e() {
        this.j = this.e;
        this.k = this.f;
        this.l = this.g;
    }

    final void f() {
        int n2 = this.i.length;
    }

    public final void g() {
        this.q = this.i[0];
    }
}

