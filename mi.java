/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.View
 */
import android.os.Build;
import android.view.View;
import java.lang.reflect.Method;

public final class mi {
    public static boolean a;
    public static Method b;
    public static final boolean c;

    static {
        boolean bl2 = Build.VERSION.SDK_INT >= 27;
        c = bl2;
    }

    public static boolean a(View view) {
        return view.getLayoutDirection() == 1;
    }
}

