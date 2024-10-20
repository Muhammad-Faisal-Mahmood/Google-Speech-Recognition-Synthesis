/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.view.View
 */
import android.graphics.Matrix;
import android.view.View;

class ayt
extends ays {
    private static boolean a = true;
    private static boolean b = true;

    @Override
    public void e(View view, Matrix matrix) {
        if (a) {
            try {
                dp$$ExternalSyntheticApiModelOutline0.m(view, matrix);
                return;
            }
            catch (NoSuchMethodError noSuchMethodError) {
                a = false;
            }
        }
    }

    @Override
    public void f(View view, Matrix matrix) {
        if (b) {
            try {
                dp$$ExternalSyntheticApiModelOutline0.m$1(view, matrix);
                return;
            }
            catch (NoSuchMethodError noSuchMethodError) {
                b = false;
            }
        }
    }
}

