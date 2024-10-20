/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.graphics.Path
 *  android.graphics.Path$Direction
 *  android.graphics.Path$Op
 *  android.graphics.PointF
 *  android.graphics.RectF
 */
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;

public final class fxo {
    private final fxw[] a = new fxw[4];
    private final Matrix[] b = new Matrix[4];
    private final Matrix[] c = new Matrix[4];
    private final PointF d = new PointF();
    private final Path e = new Path();
    private final Path f = new Path();
    private final fxw g = new fxw();
    private final float[] h = new float[2];
    private final float[] i = new float[2];
    private final Path j = new Path();
    private final Path k = new Path();
    private boolean l = true;

    public fxo() {
        for (int i2 = 0; i2 < 4; ++i2) {
            this.a[i2] = new fxw();
            this.b[i2] = new Matrix();
            this.c[i2] = new Matrix();
        }
    }

    static final fxd a(int n2, fxm fxm2) {
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    return fxm2.c;
                }
                return fxm2.b;
            }
            return fxm2.e;
        }
        return fxm2.d;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean c(Path path, int n2) {
        this.k.reset();
        RectF rectF = this.b;
        this.a[n2].c(rectF[n2], this.k);
        rectF = new RectF();
        boolean bl2 = true;
        path.computeBounds(rectF, true);
        this.k.computeBounds(rectF, true);
        path.op(this.k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        boolean bl3 = bl2;
        if (!rectF.isEmpty()) return bl3;
        if (!(rectF.width() > 1.0f)) return false;
        if (!(rectF.height() > 1.0f)) return false;
        return bl2;
    }

    private static final float d(int n2) {
        return (n2 + 1) % 4 * 90;
    }

    public final void b(fxm fxm2, float[] object, float f2, RectF rectF, AmbientModeSupport$AmbientController ambientModeSupport$AmbientController, Path path) {
        float f3;
        int n2;
        path.rewind();
        this.e.rewind();
        this.f.rewind();
        Object object2 = Path.Direction.CW;
        this.f.addRect(rectF, (Path.Direction)object2);
        for (n2 = 0; n2 < 4; ++n2) {
            Object object3 = object == null ? fxo.a(n2, fxm2) : new fxc(object[n2]);
            object2 = n2 != 1 ? (n2 != 2 ? (n2 != 3 ? fxm2.k : fxm2.j) : fxm2.m) : fxm2.l;
            object2.a(this.a[n2], f2, object3.a(rectF));
            f3 = fxo.d(n2);
            this.b[n2].reset();
            object2 = this.d;
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        object2.set(rectF.right, rectF.top);
                    } else {
                        object2.set(rectF.left, rectF.top);
                    }
                } else {
                    object2.set(rectF.left, rectF.bottom);
                }
            } else {
                object2.set(rectF.right, rectF.bottom);
            }
            object3 = this.b[n2];
            object2 = this.d;
            object3.setTranslate(object2.x, object2.y);
            this.b[n2].preRotate(f3);
            object3 = this.h;
            object2 = this.a[n2];
            object3[0] = object2.b;
            object3[1] = object2.c;
            this.b[n2].mapPoints((float[])object3);
            f3 = fxo.d(n2);
            this.c[n2].reset();
            object2 = this.c[n2];
            object3 = this.h;
            object2.setTranslate((float)object3[0], (float)object3[1]);
            this.c[n2].preRotate(f3);
        }
        n2 = 0;
        while (n2 < 4) {
            object2 = this.h;
            object = this.a[n2];
            object2[0] = (Path.Direction)0.0f;
            object2[1] = (Path.Direction)((fxw)object).a;
            this.b[n2].mapPoints((float[])object2);
            if (n2 == 0) {
                object = this.h;
                path.moveTo(object[0], object[1]);
            } else {
                object = this.h;
                path.lineTo(object[0], object[1]);
            }
            object = this.a;
            object2 = this.b;
            object[n2].c((Matrix)object2[n2], path);
            if (ambientModeSupport$AmbientController != null) {
                object = this.a[n2];
                object2 = this.b[n2];
                ((fxi)ambientModeSupport$AmbientController.a).d.set(n2, false);
                ((fxi)ambientModeSupport$AmbientController.a).b[n2] = object = ((fxw)object).a((Matrix)object2);
            }
            int n3 = n2 + 1;
            object2 = this.h;
            object = this.a[n2];
            object2[0] = (PointF)((fxw)object).b;
            object2[1] = (PointF)((fxw)object).c;
            this.b[n2].mapPoints((float[])object2);
            object = this.i;
            object2 = this.a;
            int n4 = n3 % 4;
            object2 = object2[n4];
            object[0] = 0.0f;
            object[1] = object2.a;
            this.b[n4].mapPoints((float[])object);
            object2 = this.h;
            f2 = (float)object2[0];
            object = this.i;
            f3 = object[0];
            Matrix matrix = object2[1];
            float f4 = object[1];
            f2 = Math.max((float)Math.hypot(f2 - f3, (double)(matrix - f4)) - 0.001f, 0.0f);
            object = this.h;
            object2 = this.a[n2];
            object[0] = object2.b;
            object[1] = object2.c;
            this.b[n2].mapPoints((float[])object);
            if (n2 != 1 && n2 != 3) {
                Math.abs(rectF.centerY() - this.h[1]);
            } else {
                Math.abs(rectF.centerX() - this.h[0]);
            }
            this.g.e();
            object = n2 != 1 ? (n2 != 2 ? (n2 != 3 ? (Object)fxm2.g : (Object)fxm2.f) : (Object)fxm2.i) : (Object)fxm2.h;
            this.g.d(f2, 0.0f);
            this.j.reset();
            this.g.c(this.c[n2], this.j);
            if (this.l && (this.c(this.j, n2) || this.c(this.j, n4))) {
                object = this.j;
                object.op((Path)object, this.f, Path.Op.DIFFERENCE);
                object = this.h;
                object[0] = 0.0f;
                object[1] = this.g.a;
                this.c[n2].mapPoints((float[])object);
                object = this.e;
                object2 = this.h;
                object.moveTo((float)object2[0], (float)object2[1]);
                this.g.c(this.c[n2], this.e);
            } else {
                this.g.c(this.c[n2], path);
            }
            if (ambientModeSupport$AmbientController != null) {
                object = this.g;
                object2 = this.c[n2];
                ((fxi)ambientModeSupport$AmbientController.a).d.set(n2 + 4, false);
                ((fxi)ambientModeSupport$AmbientController.a).c[n2] = object = ((fxw)object).a((Matrix)object2);
            }
            n2 = n3;
        }
        path.close();
        this.e.close();
        if (!this.e.isEmpty()) {
            path.op(this.e, Path.Op.UNION);
        }
    }
}

