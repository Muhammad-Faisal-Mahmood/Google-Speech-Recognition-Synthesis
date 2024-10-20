/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Insets
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 */
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

public final class iy {
    public static final Rect a;
    private static final int[] b;
    private static final int[] c;

    static {
        b = new int[]{0x10100A0};
        c = new int[0];
        a = new Rect();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Rect a(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 29) {
            drawable = dp$$ExternalSyntheticApiModelOutline0.m(drawable);
            return new Rect(dp$$ExternalSyntheticApiModelOutline0.m$3((Insets)drawable), dp$$ExternalSyntheticApiModelOutline0.m$1((Insets)drawable), dp$$ExternalSyntheticApiModelOutline0.m((Insets)drawable), dp$$ExternalSyntheticApiModelOutline0.m$2((Insets)drawable));
        }
        Drawable drawable2 = drawable;
        if (drawable instanceof tq) {
            Drawable drawable3 = ((tq)drawable).a();
        }
        if (Build.VERSION.SDK_INT >= 29) return a;
        if (!ix.a) return a;
        try {
            void var1_4;
            Object object = ix.b.invoke((Object)var1_4, null);
            if (object == null) return a;
            return new Rect(ix.c.getInt(object), ix.d.getInt(object), ix.e.getInt(object), ix.f.getInt(object));
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {}
        return a;
    }

    public static void b(Drawable drawable) {
        Object object = drawable.getClass().getName();
        if (Build.VERSION.SDK_INT >= 29 && Build.VERSION.SDK_INT < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(object)) {
            object = drawable.getState();
            if (object != null && ((Object)object).length != 0) {
                drawable.setState(c);
            } else {
                drawable.setState(b);
            }
            drawable.setState((int[])object);
        }
    }
}

