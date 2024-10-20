/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.View
 */
import android.os.Build;
import android.view.View;

class ayv
extends ayu {
    private static boolean a = true;

    @Override
    public void d(View view, int n2) {
        if (Build.VERSION.SDK_INT == 28) {
            super.d(view, n2);
            return;
        }
        if (a) {
            try {
                dp$$ExternalSyntheticApiModelOutline0.m(view, n2);
                return;
            }
            catch (NoSuchMethodError noSuchMethodError) {
                a = false;
            }
        }
    }
}

