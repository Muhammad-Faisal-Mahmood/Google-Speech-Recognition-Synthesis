/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.ViewGroup
 */
import android.os.Build;
import android.view.ViewGroup;

final class ayo {
    private static boolean a = true;

    static void a(ViewGroup viewGroup, boolean bl2) {
        if (Build.VERSION.SDK_INT >= 29) {
            dp$$ExternalSyntheticApiModelOutline0.m(viewGroup, bl2);
            return;
        }
        ayo.b(viewGroup, bl2);
    }

    private static void b(ViewGroup viewGroup, boolean bl2) {
        if (a) {
            try {
                dp$$ExternalSyntheticApiModelOutline0.m(viewGroup, bl2);
                return;
            }
            catch (NoSuchMethodError noSuchMethodError) {
                a = false;
            }
        }
    }
}

