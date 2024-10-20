/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.Color
 *  android.os.Build$VERSION
 *  android.util.Log
 */
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

public final class fwx {
    static final String a;
    private static final int[] b;

    static {
        b = new int[]{16842910, 16842919};
        a = "fwx";
    }

    private fwx() {
    }

    public static ColorStateList a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (Build.VERSION.SDK_INT <= 27 && Color.alpha((int)colorStateList.getDefaultColor()) == 0 && Color.alpha((int)colorStateList.getColorForState(b, 0)) != 0) {
                Log.w((String)a, (String)"Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf((int)0);
    }
}

