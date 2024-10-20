/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.Color
 *  android.util.Log
 *  android.util.TypedValue
 *  android.view.View
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.wear.ambient.AmbientDelegate;

public final class lt {
    public static final int[] a;
    public static final int[] b;
    public static final int[] c;
    static final int[] d;
    public static final int[] e;
    private static final ThreadLocal f;
    private static final int[] g;

    static {
        f = new ThreadLocal();
        a = new int[]{-16842910};
        b = new int[]{16842908};
        c = new int[]{16842919};
        d = new int[]{0x10100A0};
        e = new int[0];
        g = new int[1];
    }

    public static int a(Context context, int n2) {
        ColorStateList colorStateList = lt.c(context, n2);
        if (colorStateList != null && colorStateList.isStateful()) {
            return colorStateList.getColorForState(a, colorStateList.getDefaultColor());
        }
        ThreadLocal threadLocal = f;
        TypedValue typedValue = (TypedValue)threadLocal.get();
        colorStateList = typedValue;
        if (typedValue == null) {
            colorStateList = new TypedValue();
            threadLocal.set(colorStateList);
        }
        context.getTheme().resolveAttribute(0x1010033, (TypedValue)colorStateList, true);
        float f2 = colorStateList.getFloat();
        n2 = lt.b(context, n2);
        return tf.c(n2, Math.round((float)Color.alpha((int)n2) * f2));
    }

    public static int b(Context object, int n2) {
        int[] nArray = g;
        nArray[0] = n2;
        object = AmbientDelegate.z((Context)object, null, nArray);
        try {
            n2 = ((TypedArray)((AmbientDelegate)object).b).getColor(0, 0);
            return n2;
        }
        finally {
            ((AmbientDelegate)object).v();
        }
    }

    public static ColorStateList c(Context object, int n2) {
        Object object2 = g;
        object2[0] = n2;
        object = AmbientDelegate.z((Context)object, null, object2);
        try {
            object2 = ((AmbientDelegate)object).q(0);
            return object2;
        }
        finally {
            ((AmbientDelegate)object).v();
        }
    }

    public static void d(View view, Context context) {
        context = context.obtainStyledAttributes(er.j);
        try {
            if (!context.hasValue(117)) {
                StringBuilder stringBuilder = new StringBuilder("View ");
                stringBuilder.append(view.getClass());
                stringBuilder.append(" is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
                Log.e((String)"ThemeUtils", (String)stringBuilder.toString());
            }
            return;
        }
        finally {
            context.recycle();
        }
    }
}

