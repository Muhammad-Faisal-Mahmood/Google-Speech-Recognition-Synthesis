/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.WindowInsets
 */
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;

public final class xn {
    public static final xn a = Build.VERSION.SDK_INT >= 30 ? xk.c : xl.d;
    public final xl b;

    public xn() {
        this.b = new xl(this);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private xn(WindowInsets object) {
        void var1_3;
        if (Build.VERSION.SDK_INT >= 30) {
            xk xk2 = new xk(this, (WindowInsets)object);
        } else if (Build.VERSION.SDK_INT >= 29) {
            xj xj2 = new xj(this, (WindowInsets)object);
        } else if (Build.VERSION.SDK_INT >= 28) {
            xi xi2 = new xi(this, (WindowInsets)object);
        } else {
            xh xh2 = new xh(this, (WindowInsets)object);
        }
        this.b = var1_3;
    }

    static tg h(tg tg2, int n2, int n3, int n4, int n5) {
        int n6 = Math.max(0, tg2.b - n2);
        int n7 = Math.max(0, tg2.c - n3);
        int n8 = Math.max(0, tg2.d - n4);
        int n9 = Math.max(0, tg2.e - n5);
        if (n6 == n2 && n7 == n3 && n8 == n4 && n9 == n5) {
            return tg2;
        }
        return tg.d(n6, n7, n8, n9);
    }

    public static xn m(WindowInsets windowInsets) {
        return xn.n(windowInsets, null);
    }

    public static xn n(WindowInsets object, View view) {
        a.Y(object);
        object = new xn((WindowInsets)object);
        if (view != null && view.isAttachedToWindow()) {
            ((xn)object).q(wb.a(view));
            ((xn)object).o(view.getRootView());
        }
        return object;
    }

    @Deprecated
    public final int a() {
        return this.b.c().e;
    }

    @Deprecated
    public final int b() {
        return this.b.c().b;
    }

    @Deprecated
    public final int c() {
        return this.b.c().d;
    }

    @Deprecated
    public final int d() {
        return this.b.c().c;
    }

    public final WindowInsets e() {
        xl xl2 = this.b;
        if (xl2 instanceof xg) {
            return ((xg)xl2).a;
        }
        return null;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof xn)) {
            return false;
        }
        object = (xn)object;
        return Objects.equals(this.b, ((xn)object).b);
    }

    public final tg f(int n2) {
        return this.b.a(n2);
    }

    @Deprecated
    public final tg g() {
        return this.b.j();
    }

    public final int hashCode() {
        xl xl2 = this.b;
        if (xl2 == null) {
            return 0;
        }
        return xl2.hashCode();
    }

    @Deprecated
    public final xn i() {
        return this.b.p();
    }

    @Deprecated
    public final xn j() {
        return this.b.k();
    }

    @Deprecated
    public final xn k() {
        return this.b.l();
    }

    public final xn l(int n2, int n3, int n4, int n5) {
        return this.b.d(n2, n3, n4, n5);
    }

    final void o(View view) {
        this.b.e(view);
    }

    final void p(tg[] tgArray) {
        this.b.f(tgArray);
    }

    final void q(xn xn2) {
        this.b.h(xn2);
    }

    public final boolean r() {
        return this.b.n();
    }
}

