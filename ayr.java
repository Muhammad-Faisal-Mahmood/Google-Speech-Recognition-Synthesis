/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.util.Property
 *  android.view.View
 */
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

final class ayr {
    public static final ays a = Build.VERSION.SDK_INT >= 29 ? new ayw() : new ayv();
    static final Property b = new ayp(Float.class);

    static {
        new ayq(Rect.class);
    }

    static float a(View view) {
        return a.a(view);
    }

    static void b(View view, int n2, int n3, int n4, int n5) {
        a.b(view, n2, n3, n4, n5);
    }

    static void c(View view, float f2) {
        a.c(view, f2);
    }

    static void d(View view, int n2) {
        a.d(view, n2);
    }
}

