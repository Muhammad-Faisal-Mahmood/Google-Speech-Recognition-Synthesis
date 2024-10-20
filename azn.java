/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Paint$Cap
 *  android.graphics.Paint$Join
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.Path$FillType
 *  android.graphics.PathMeasure
 *  android.graphics.Shader
 */
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Shader;

final class azn {
    public static final Matrix a = new Matrix();
    Paint b;
    Paint c;
    final azl d;
    float e = 0.0f;
    float f = 0.0f;
    float g = 0.0f;
    float h = 0.0f;
    int i = 255;
    String j = null;
    Boolean k = null;
    final ot l;
    private final Path m;
    private final Path n;
    private final Matrix o = new Matrix();
    private PathMeasure p;
    private int q;

    public azn() {
        this.l = new ot();
        this.d = new azl();
        this.m = new Path();
        this.n = new Path();
    }

    public azn(azn azn2) {
        ot ot2;
        this.l = ot2 = new ot();
        this.d = new azl(azn2.d, ot2);
        this.m = new Path(azn2.m);
        this.n = new Path(azn2.n);
        this.e = azn2.e;
        this.f = azn2.f;
        this.g = azn2.g;
        this.h = azn2.h;
        int n2 = azn2.q;
        this.q = 0;
        this.i = azn2.i;
        this.j = azn2.j;
        String string = azn2.j;
        if (string != null) {
            ot2.put(string, this);
        }
        this.k = azn2.k;
    }

    public final void a(azl azl2, Matrix object, Canvas canvas, int n2, int n3) {
        azl2.a.set((Matrix)object);
        azl2.a.preConcat(azl2.j);
        canvas.save();
        for (int i2 = 0; i2 < azl2.b.size(); ++i2) {
            Object object2;
            Object object3;
            object = (aay)azl2.b.get(i2);
            if (object instanceof azl) {
                this.a((azl)object, azl2.a, canvas, n2, n3);
                continue;
            }
            if (!(object instanceof azm)) continue;
            object = (azm)object;
            float f2 = (float)n2 / this.g;
            float f3 = (float)n3 / this.h;
            float f4 = Math.min(f2, f3);
            Object object4 = azl2.a;
            this.o.set((Matrix)object4);
            this.o.postScale(f2, f3);
            float[] fArray = object3 = new float[4];
            object3[0] = 0.0f;
            fArray[1] = 1.0f;
            fArray[2] = 1.0f;
            fArray[3] = 0.0f;
            object4.mapVectors(object3);
            float f5 = (float)Math.hypot(object3[0], object3[1]);
            float f6 = (float)Math.hypot(object3[2], object3[3]);
            f3 = object3[0];
            float f7 = object3[1];
            f2 = object3[2];
            float f8 = object3[3];
            f5 = Math.max(f5, f6);
            f3 = f5 > 0.0f ? Math.abs(f3 * f8 - f7 * f2) / f5 : 0.0f;
            if (f3 == 0.0f) continue;
            object3 = this.m;
            object3.reset();
            object4 = ((azm)object).m;
            if (object4 != null) {
                kt.h((th[])object4, (Path)object3);
            }
            object4 = this.m;
            this.n.reset();
            if (((azm)object).l()) {
                object3 = this.n;
                object = ((azm)object).o == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                object3.setFillType((Path.FillType)object);
                this.n.addPath((Path)object4, this.o);
                canvas.clipPath(this.n);
                continue;
            }
            object3 = (azk)object;
            f7 = object3.e;
            if (f7 != 0.0f || object3.f != 1.0f) {
                f5 = object3.g;
                f8 = object3.f;
                if (this.p == null) {
                    this.p = new PathMeasure();
                }
                this.p.setPath(this.m, false);
                f2 = this.p.getLength();
                f7 = (f7 + f5) % 1.0f * f2;
                f8 = (f8 + f5) % 1.0f * f2;
                object4.reset();
                if (f7 > f8) {
                    this.p.getSegment(f7, f2, (Path)object4, true);
                    this.p.getSegment(0.0f, f8, (Path)object4, true);
                } else {
                    this.p.getSegment(f7, f8, (Path)object4, true);
                }
                object4.rLineTo(0.0f, 0.0f);
            }
            this.n.addPath((Path)object4, this.o);
            if (object3.l.k()) {
                object = object3.l;
                if (this.c == null) {
                    object4 = new Paint(1);
                    this.c = object4;
                    object4.setStyle(Paint.Style.FILL);
                }
                object4 = this.c;
                if (((htf)object).h()) {
                    object2 = ((htf)object).a;
                    object = this.o;
                    object2 = (Shader)object2;
                    object2.setLocalMatrix((Matrix)object);
                    object4.setShader((Shader)object2);
                    object4.setAlpha(Math.round(object3.d * 255.0f));
                } else {
                    object4.setShader(null);
                    object4.setAlpha(255);
                    object4.setColor(azq.a(((htf)object).b, object3.d));
                }
                object4.setColorFilter(null);
                object2 = this.n;
                object = object3.o == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                object2.setFillType((Path.FillType)object);
                canvas.drawPath(this.n, (Paint)object4);
            }
            if (!object3.k.k()) continue;
            object4 = object3.k;
            if (this.b == null) {
                object = new Paint(1);
                this.b = object;
                object.setStyle(Paint.Style.STROKE);
            }
            object = this.b;
            object2 = object3.i;
            if (object2 != null) {
                object.setStrokeJoin((Paint.Join)object2);
            }
            if ((object2 = object3.h) != null) {
                object.setStrokeCap((Paint.Cap)object2);
            }
            object.setStrokeMiter(object3.j);
            if (((htf)object4).h()) {
                object2 = ((htf)object4).a;
                object4 = this.o;
                object2 = (Shader)object2;
                object2.setLocalMatrix((Matrix)object4);
                object.setShader((Shader)object2);
                object.setAlpha(Math.round(object3.c * 255.0f));
            } else {
                object.setShader(null);
                object.setAlpha(255);
                object.setColor(azq.a(((htf)object4).b, object3.c));
            }
            object.setColorFilter(null);
            object.setStrokeWidth(object3.b * (f3 * f4));
            canvas.drawPath(this.n, (Paint)object);
        }
        canvas.restore();
    }

    public float getAlpha() {
        return (float)this.getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.i;
    }

    public void setAlpha(float f2) {
        this.setRootAlpha((int)(f2 * 255.0f));
    }

    public void setRootAlpha(int n2) {
        this.i = n2;
    }
}

