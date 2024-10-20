/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.util.Log
 *  android.view.WindowInsets
 */
import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public final class xc
extends xf {
    private static Field a;
    private static boolean c = false;
    private static Constructor d;
    private static boolean e = false;
    private WindowInsets f;
    private tg g;

    public xc() {
        this.f = xc.i();
    }

    public xc(xn xn2) {
        super(xn2);
        this.f = xn2.e();
    }

    private static WindowInsets i() {
        Constructor constructor;
        Field field;
        block13: {
            if (!c) {
                try {
                    a = WindowInsets.class.getDeclaredField("CONSUMED");
                }
                catch (ReflectiveOperationException reflectiveOperationException) {
                    Log.i((String)"WindowInsetsCompat", (String)"Could not retrieve WindowInsets.CONSUMED field", (Throwable)reflectiveOperationException);
                }
                c = true;
            }
            if ((field = a) != null) {
                field = (WindowInsets)field.get(null);
                if (field == null) break block13;
                try {
                    field = new WindowInsets((WindowInsets)field);
                    return field;
                }
                catch (ReflectiveOperationException reflectiveOperationException) {
                    Log.i((String)"WindowInsetsCompat", (String)"Could not get value from WindowInsets.CONSUMED field", (Throwable)reflectiveOperationException);
                }
            }
        }
        if (!e) {
            try {
                d = WindowInsets.class.getConstructor(Rect.class);
            }
            catch (ReflectiveOperationException reflectiveOperationException) {
                Log.i((String)"WindowInsetsCompat", (String)"Could not retrieve WindowInsets(Rect) constructor", (Throwable)reflectiveOperationException);
            }
            e = true;
        }
        if ((constructor = d) != null) {
            try {
                field = new Rect();
                field = (WindowInsets)constructor.newInstance(field);
                return field;
            }
            catch (ReflectiveOperationException reflectiveOperationException) {
                Log.i((String)"WindowInsetsCompat", (String)"Could not invoke WindowInsets(Rect) constructor", (Throwable)reflectiveOperationException);
            }
        }
        return null;
    }

    @Override
    public xn a() {
        this.h();
        xn xn2 = xn.m(this.f);
        xn2.p(this.b);
        xn2.b.m(this.g);
        return xn2;
    }

    @Override
    public void b(tg tg2) {
        this.g = tg2;
    }

    @Override
    public void c(tg tg2) {
        WindowInsets windowInsets = this.f;
        if (windowInsets != null) {
            this.f = windowInsets.replaceSystemWindowInsets(tg2.b, tg2.c, tg2.d, tg2.e);
        }
    }
}

