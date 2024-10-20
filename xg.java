/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.util.Log
 *  android.view.View
 *  android.view.WindowInsets
 */
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class xg
extends xl {
    private static boolean c = false;
    private static Method f;
    private static Class g;
    private static Field h;
    private static Field i;
    final WindowInsets a;
    tg b;
    private tg[] j;
    private tg k = null;
    private xn l;

    public xg(xn xn2, WindowInsets windowInsets) {
        super(xn2);
        this.a = windowInsets;
    }

    private tg t(int n2, boolean bl2) {
        tg tg2 = tg.a;
        for (int i2 = 1; i2 <= 256; i2 += i2) {
            tg tg3 = tg2;
            if ((n2 & i2) != 0) {
                tg3 = tg.b(tg2, this.b(i2, false));
            }
            tg2 = tg3;
        }
        return tg2;
    }

    private tg u() {
        xn xn2 = this.l;
        if (xn2 != null) {
            return xn2.g();
        }
        return tg.a;
    }

    private tg v(View object) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!c) {
                xg.w();
            }
            Method method = f;
            Object var2_4 = null;
            if (method != null && g != null && h != null) {
                block9: {
                    block8: {
                        object = method.invoke(object, null);
                        if (object != null) break block8;
                        object = new NullPointerException();
                        Log.w((String)"WindowInsetsCompat", (String)"Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", (Throwable)object);
                        return null;
                    }
                    object = i.get(object);
                    method = (Rect)h.get(object);
                    object = var2_4;
                    if (method == null) break block9;
                    try {
                        object = tg.c((Rect)method);
                    }
                    catch (ReflectiveOperationException reflectiveOperationException) {
                        Log.e((String)"WindowInsetsCompat", (String)"Failed to get visible insets. (Reflection error). ".concat(String.valueOf(reflectiveOperationException.getMessage())), (Throwable)reflectiveOperationException);
                    }
                }
                return object;
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    private static void w() {
        try {
            Class<?> clazz;
            f = View.class.getDeclaredMethod("getViewRootImpl", null);
            g = clazz = Class.forName("android.view.View$AttachInfo");
            h = clazz.getDeclaredField("mVisibleInsets");
            i = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            h.setAccessible(true);
            i.setAccessible(true);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            Log.e((String)"WindowInsetsCompat", (String)"Failed to get visible insets. (Reflection error). ".concat(String.valueOf(reflectiveOperationException.getMessage())), (Throwable)reflectiveOperationException);
        }
        c = true;
    }

    @Override
    public tg a(int n2) {
        return this.t(n2, false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected tg b(int n2, boolean bl2) {
        int n3;
        int n4 = 0;
        if (n2 == 1) return tg.d(0, ((xl)this).c().c, 0, 0);
        Object object = null;
        tg tg2 = null;
        if (n2 != 2) {
            if (n2 != 8) {
                if (n2 == 16) return this.r();
                if (n2 == 32) return this.q();
                if (n2 == 64) return this.s();
                if (n2 != 128 || (object = (object = this.l) != null ? ((xn)object).b.o() : this.o()) == null) return tg.a;
                n2 = Build.VERSION.SDK_INT >= 28 ? fs$$ExternalSyntheticApiModelOutline0.m$1(((vc)object).a) : 0;
                int n5 = Build.VERSION.SDK_INT >= 28 ? fs$$ExternalSyntheticApiModelOutline0.m$2(((vc)object).a) : 0;
                int n6 = Build.VERSION.SDK_INT >= 28 ? fs$$ExternalSyntheticApiModelOutline0.m$3(((vc)object).a) : 0;
                if (Build.VERSION.SDK_INT < 28) return tg.d(n2, n5, n6, n4);
                n4 = fs$$ExternalSyntheticApiModelOutline0.m$4(((vc)object).a);
                return tg.d(n2, n5, n6, n4);
            }
            tg[] tgArray = this.j;
            object = tg2;
            if (tgArray != null) {
                object = tgArray[wc.c(8)];
            }
            if (object != null) {
                return object;
            }
            tg2 = ((xl)this).c();
            object = this.u();
            n2 = tg2.e;
            if (n2 <= ((tg)object).e && ((tg2 = this.b) == null || tg2.equals(tg.a) || (n2 = this.b.e) <= ((tg)object).e)) return tg.a;
            return tg.d(0, 0, 0, n2);
        }
        tg2 = ((xl)this).c();
        xn xn2 = this.l;
        if (xn2 != null) {
            object = xn2.g();
        }
        n2 = n3 = tg2.e;
        if (object == null) return tg.d(tg2.b, 0, tg2.d, n2);
        n2 = Math.min(n3, ((tg)object).e);
        return tg.d(tg2.b, 0, tg2.d, n2);
    }

    @Override
    public final tg c() {
        if (this.k == null) {
            WindowInsets windowInsets = this.a;
            this.k = tg.d(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.k;
    }

    @Override
    public xn d(int n2, int n3, int n4, int n5) {
        Object object = xn.m(this.a);
        object = Build.VERSION.SDK_INT >= 30 ? new xe((xn)object) : (Build.VERSION.SDK_INT >= 29 ? new xd((xn)object) : new xc((xn)object));
        ((xf)object).c(xn.h(((xl)this).c(), n2, n3, n4, n5));
        ((xf)object).b(xn.h(this.j(), n2, n3, n4, n5));
        return ((xf)object).a();
    }

    @Override
    public void e(View object) {
        tg tg2 = this.v((View)object);
        object = tg2;
        if (tg2 == null) {
            object = tg.a;
        }
        this.g((tg)object);
    }

    @Override
    public boolean equals(Object object) {
        if (!super.equals(object)) {
            return false;
        }
        object = (xg)object;
        return Objects.equals(this.b, ((xg)object).b);
    }

    @Override
    public void f(tg[] tgArray) {
        this.j = tgArray;
    }

    public void g(tg tg2) {
        this.b = tg2;
    }

    @Override
    public void h(xn xn2) {
        this.l = xn2;
    }

    @Override
    public boolean i() {
        return this.a.isRound();
    }
}

