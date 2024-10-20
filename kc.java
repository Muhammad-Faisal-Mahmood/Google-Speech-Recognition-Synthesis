/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.View
 */
import android.graphics.Rect;
import android.view.View;

public abstract class kc {
    public final ko a;
    public int b = Integer.MIN_VALUE;
    final Rect c = new Rect();

    public kc(ko ko2) {
        this.a = ko2;
    }

    public static kc p(ko ko2, int n2) {
        if (n2 != 0) {
            return new kb(ko2);
        }
        return new ka(ko2);
    }

    public abstract int a(View var1);

    public abstract int b(View var1);

    public abstract int c(View var1);

    public abstract int d(View var1);

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l(View var1);

    public abstract int m(View var1);

    public abstract void n(int var1);

    public final int o() {
        if (this.b == Integer.MIN_VALUE) {
            return 0;
        }
        return this.k() - this.b;
    }
}

