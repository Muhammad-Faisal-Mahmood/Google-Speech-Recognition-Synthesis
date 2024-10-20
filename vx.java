/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.View
 */
import android.os.Build;
import android.view.View;

public abstract class vx {
    private final int a;
    private final Class b;
    private final int c;
    private final int d;

    public vx(int n2, Class clazz) {
        this(n2, clazz, 0, 28);
    }

    public vx(int n2, Class clazz, int n3, int n4) {
        this.a = n2;
        this.b = clazz;
        this.d = n3;
        this.c = n4;
    }

    static final boolean f(Boolean bl2, Boolean bl3) {
        boolean bl4;
        boolean bl5 = bl2 != null && bl2 != false;
        return bl5 == (bl4 = bl3 != null && bl3 != false);
    }

    private final boolean g() {
        return Build.VERSION.SDK_INT >= this.c;
    }

    public abstract Object a(View var1);

    public abstract void b(View var1, Object var2);

    public boolean c(Object object, Object object2) {
        throw null;
    }

    final Object d(View object) {
        if (this.g()) {
            return this.a((View)object);
        }
        if (this.b.isInstance(object = object.getTag(this.a))) {
            return object;
        }
        return null;
    }

    public final void e(View view, Object object) {
        if (this.g()) {
            this.b(view, object);
            return;
        }
        if (this.c(this.d(view), object)) {
            wj.i(view);
            view.setTag(this.a, object);
            wj.j(view, this.d);
        }
    }
}

