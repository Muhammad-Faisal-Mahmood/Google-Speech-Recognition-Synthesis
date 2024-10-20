/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$AccessibilityDelegate
 */
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

public class we {
    static View.AccessibilityDelegate a(View view) {
        return dp$$ExternalSyntheticApiModelOutline0.m(view);
    }

    static void b(View view, Context context, int[] nArray, AttributeSet attributeSet, TypedArray typedArray, int n2, int n3) {
        dp$$ExternalSyntheticApiModelOutline0.m(view, context, nArray, attributeSet, typedArray, n2, n3);
    }

    public static void c(int n2, wd wd2) {
        wd2.h(n2);
    }

    public static void d(boolean bl2, wd wd2) {
        wd2.i(bl2);
    }

    public static void e(boolean bl2, wd wd2) {
        wd2.j(bl2);
    }

    public static void f(View view, abe abe2) {
        jse.e(view, "<this>");
        view.setTag(2131428009, (Object)abe2);
    }

    public static ach g(ack ack2, jta jta2, acr acr2) {
        return ack2.b(jsd.c(jta2), acr2);
    }

    public static ach h(Class clazz) {
        jse.e(clazz, "modelClass");
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    public static ach i(ack ack2, Class clazz) {
        jse.e(clazz, "modelClass");
        return ack2.a(clazz);
    }

    public static String j(String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder("room_table_modification_trigger_");
        stringBuilder.append(string);
        stringBuilder.append('_');
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static Object k(aui object, String string, jqb jqb2) {
        if ((object = object.a(string, wl.e, jqb2)) == jqh.a) {
            return object;
        }
        return jon.a;
    }

    public void l(awl awl2) {
        throw null;
    }
}

