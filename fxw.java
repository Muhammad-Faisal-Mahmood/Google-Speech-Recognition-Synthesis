/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.graphics.Path
 */
import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

public final class fxw {
    @Deprecated
    public float a;
    @Deprecated
    public float b;
    @Deprecated
    public float c;
    @Deprecated
    public float d;
    @Deprecated
    public float e;
    public final List f = new ArrayList();
    private final List g = new ArrayList();

    public fxw() {
        this.e();
    }

    private final void g(float f2) {
        float f3;
        float f4 = this.d;
        if (f4 != f2 && !((f3 = (f2 - f4 + 360.0f) % 360.0f) > 180.0f)) {
            f4 = this.b;
            float f5 = this.c;
            fxs fxs2 = new fxs(f4, f5, f4, f5);
            fxs2.e = this.d;
            fxs2.f = f3;
            this.g.add(new fxq(fxs2));
            this.d = f2;
        }
    }

    final fxv a(Matrix matrix) {
        this.g(this.e);
        matrix = new Matrix(matrix);
        return new fxp(new ArrayList(this.g), matrix);
    }

    public final void b(fxv fxv2, float f2, float f3) {
        this.g(f2);
        this.g.add(fxv2);
        this.d = f3;
    }

    public final void c(Matrix matrix, Path path) {
        int n2 = this.f.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            ((fxu)this.f.get(i2)).a(matrix, path);
        }
    }

    public final void d(float f2, float f3) {
        Object object = new fxt();
        ((fxt)object).a = f2;
        ((fxt)object).b = f3;
        this.f.add(object);
        object = new fxr((fxt)object, this.b, this.c);
        this.b((fxv)object, ((fxr)object).b() + 270.0f, ((fxr)object).b() + 270.0f);
        this.b = f2;
        this.c = f3;
    }

    public final void e() {
        this.f(0.0f, 270.0f, 0.0f);
    }

    public final void f(float f2, float f3, float f4) {
        this.a = f2;
        this.b = 0.0f;
        this.c = f2;
        this.d = f3;
        this.e = (f3 + f4) % 360.0f;
        this.f.clear();
        this.g.clear();
    }
}

