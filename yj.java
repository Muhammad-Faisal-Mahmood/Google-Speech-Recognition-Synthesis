/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ObjectAnimator
 *  android.content.Context
 *  android.database.sqlite.SQLiteDatabase
 *  android.graphics.Paint$FontMetricsInt
 *  android.graphics.Path
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Trace
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.Property
 *  android.util.TypedValue
 *  android.view.ActionMode$Callback
 *  android.widget.EdgeEffect
 *  android.widget.TextView
 */
import android.animation.ObjectAnimator;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Paint;
import android.graphics.Path;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Property;
import android.util.TypedValue;
import android.view.ActionMode;
import android.widget.EdgeEffect;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public final class yj {
    public static long a;
    public static Method b;
    public static Method c;
    private static Method d;
    private static Method e;

    public static float a(EdgeEffect edgeEffect) {
        try {
            float f2 = ut$$ExternalSyntheticApiModelOutline0.m(edgeEffect);
            return f2;
        }
        catch (Throwable throwable) {
            return 0.0f;
        }
    }

    public static float b(EdgeEffect edgeEffect, float f2, float f3) {
        try {
            float f4 = ut$$ExternalSyntheticApiModelOutline0.m(edgeEffect, f2, f3);
            return f4;
        }
        catch (Throwable throwable) {
            edgeEffect.onPull(f2, f3);
            return 0.0f;
        }
    }

    public static EdgeEffect c(Context context, AttributeSet attributeSet) {
        try {
            attributeSet = new EdgeEffect(context, attributeSet);
            return attributeSet;
        }
        catch (Throwable throwable) {
            return new EdgeEffect(context);
        }
    }

    public static ActionMode.Callback d(ActionMode.Callback callback) {
        ActionMode.Callback callback2 = callback;
        if (callback instanceof yn) {
            callback2 = ((yn)callback).a;
        }
        return callback2;
    }

    public static ActionMode.Callback e(TextView textView, ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT <= 27 && !(callback instanceof yn) && callback != null) {
            return new yn(callback, textView);
        }
        return callback;
    }

    public static void f(TextView textView, int n2) {
        a.X(n2);
        if (Build.VERSION.SDK_INT >= 28) {
            fs$$ExternalSyntheticApiModelOutline0.m(textView, n2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int n3 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (n2 > Math.abs(n3)) {
            textView.setPadding(textView.getPaddingLeft(), n2 + n3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void g(TextView textView, int n2) {
        a.X(n2);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int n3 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (n2 > Math.abs(n3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), n2 - n3);
        }
    }

    public static void h(TextView textView, int n2) {
        a.X(n2);
        int n3 = textView.getPaint().getFontMetricsInt(null);
        if (n2 != n3) {
            textView.setLineSpacing((float)(n2 - n3), 1.0f);
        }
    }

    public static void i(TextView textView, int n2, float f2) {
        if (Build.VERSION.SDK_INT >= 34) {
            mk$$ExternalSyntheticApiModelOutline0.m(textView, n2, f2);
            return;
        }
        yj.h(textView, Math.round(TypedValue.applyDimension((int)n2, (float)f2, (DisplayMetrics)textView.getResources().getDisplayMetrics())));
    }

    public static final aef j(String string, Uri object, yj object2, List list, gzx gzx2, aed aed2) {
        abr.f(true);
        object = object != null ? new aec((Uri)object, list, gzx2) : null;
        object2 = string;
        if (string == null) {
            object2 = "";
        }
        return new aef((String)object2, new adz(), (aec)object, new aeb(), aei.a, aed2);
    }

    public static Path k(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(f2, f3);
        path.lineTo(f4, f5);
        return path;
    }

    public static ObjectAnimator l(Object object, Property property, Path path) {
        return ObjectAnimator.ofObject((Object)object, (Property)property, null, (Path)path);
    }

    public static final void m(String string) {
        Trace.beginSection((String)yj.q(string));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void n(String object, int n2) {
        jse.e(object, "counterName");
        if (Build.VERSION.SDK_INT >= 29) {
            object = yj.q((String)object);
            jse.e(object, "counterName");
            dp$$ExternalSyntheticApiModelOutline0.m((String)object, (long)n2);
            return;
        }
        object = yj.q((String)object);
        try {
            Method method;
            if (e == null) {
                e = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            if ((method = e) != null) {
                method.invoke(null, a, object, n2);
                return;
            }
            object = new IllegalArgumentException("Required value was null.");
            throw object;
        }
        catch (Exception exception) {
            yj.p(exception);
            return;
        }
    }

    public static final boolean o() {
        boolean bl2;
        if (Build.VERSION.SDK_INT >= 29) {
            bl2 = dp$$ExternalSyntheticApiModelOutline0.m$1();
        } else {
            Object object;
            block7: {
                boolean bl3;
                bl2 = false;
                if (d == null) {
                    a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    d = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                if ((object = d) == null) break block7;
                object = ((Method)object).invoke(null, a);
                jse.c(object, "null cannot be cast to non-null type kotlin.Boolean");
                bl2 = bl3 = ((Boolean)object).booleanValue();
            }
            try {
                object = new IllegalArgumentException("Required value was null.");
                throw object;
            }
            catch (Exception exception) {
                yj.p(exception);
            }
        }
        return bl2;
    }

    public static final void p(Exception throwable) {
        if (throwable instanceof InvocationTargetException) {
            if ((throwable = throwable.getCause()) instanceof RuntimeException) {
                throw throwable;
            }
            throw new RuntimeException(throwable);
        }
    }

    public static final String q(String string) {
        String string2 = string.length() <= 127 ? string : null;
        if (string2 == null) {
            string = string.substring(0, 127);
            jse.d(string, "this as java.lang.String\u2026ing(startIndex, endIndex)");
            return string;
        }
        return string2;
    }

    public static final awu r(ilo ilo2, SQLiteDatabase object) {
        jse.e(ilo2, "refHolder");
        jse.e(object, "sqLiteDatabase");
        Object object2 = ilo2.a;
        if (object2 != null) {
            jse.e(object, "sqLiteDatabase");
            object2 = (awu)object2;
            if (jse.i(((awu)object2).d, object)) {
                return object2;
            }
        }
        object = new awu((SQLiteDatabase)object);
        ilo2.a = object;
        return object;
    }
}

