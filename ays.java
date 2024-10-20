/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.util.Log
 *  android.view.View
 */
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

class ays {
    private static boolean a = true;
    private static Field b;
    private static boolean c;

    public float a(View view) {
        if (a) {
            try {
                float f2 = dp$$ExternalSyntheticApiModelOutline0.m(view);
                return f2;
            }
            catch (NoSuchMethodError noSuchMethodError) {
                a = false;
            }
        }
        return view.getAlpha();
    }

    public void b(View view, int n2, int n3, int n4, int n5) {
        throw null;
    }

    public void c(View view, float f2) {
        if (a) {
            try {
                dp$$ExternalSyntheticApiModelOutline0.m(view, f2);
                return;
            }
            catch (NoSuchMethodError noSuchMethodError) {
                a = false;
            }
        }
        view.setAlpha(f2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void d(View view, int n2) {
        Field field;
        if (!c) {
            try {
                b = field = View.class.getDeclaredField("mViewFlags");
                field.setAccessible(true);
            }
            catch (NoSuchFieldException noSuchFieldException) {
                Log.i((String)"ViewUtilsApi19", (String)"fetchViewFlagsField: ");
            }
            c = true;
        }
        if ((field = b) == null) return;
        try {
            int n3 = field.getInt(view);
            b.setInt(view, n2 | n3 & 0xFFFFFFF3);
            return;
        }
        catch (IllegalAccessException illegalAccessException) {
            return;
        }
    }

    public void e(View view, Matrix matrix) {
        throw null;
    }

    public void f(View view, Matrix matrix) {
        throw null;
    }
}

