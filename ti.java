/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.os.Build$VERSION
 *  android.os.Trace
 */
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;

public final class ti {
    public static final tp a;
    public static final oz b;

    static {
        yj.m("TypefaceCompat static init");
        a = Build.VERSION.SDK_INT >= 29 ? new tm() : (Build.VERSION.SDK_INT >= 28 ? new tl() : new tk());
        b = new oz(16);
        Trace.endSection();
    }

    public static Typeface a(Context context, Resources object, int n2, String string, int n3, int n4) {
        if ((context = a.d(context, (Resources)object, n2, string, n4)) != null) {
            object = ti.b(object, n2, string, n3, n4);
            b.b(object, context);
        }
        return context;
    }

    public static String b(Resources resources, int n2, String string, int n3, int n4) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(resources.getResourcePackageName(n2));
        stringBuilder.append('-');
        stringBuilder.append(string);
        stringBuilder.append('-');
        stringBuilder.append(n3);
        stringBuilder.append('-');
        stringBuilder.append(n2);
        stringBuilder.append('-');
        stringBuilder.append(n4);
        return stringBuilder.toString();
    }
}

