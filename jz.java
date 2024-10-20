/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.util.Log
 *  android.widget.PopupWindow
 */
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

public final class jz
extends jw
implements jx {
    public static Method a;
    public jx b;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                a = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        }
        catch (NoSuchMethodException noSuchMethodException) {
            Log.i((String)"MenuPopupWindow", (String)"Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public jz(Context context, int n2) {
        super(context, null, n2, null);
    }

    @Override
    public final jc p(Context object, boolean bl2) {
        object = new jy((Context)object, bl2);
        object.e = this;
        return object;
    }
}

