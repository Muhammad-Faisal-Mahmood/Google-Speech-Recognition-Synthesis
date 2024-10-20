/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.view.Choreographer
 */
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.Constructor;

public final class jxo {
    public static final int a = 0;
    private static volatile Choreographer choreographer;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object;
        Object var1 = null;
        try {
            block7: {
                object = Looper.getMainLooper();
                if (Build.VERSION.SDK_INT >= 28) {
                    object = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, object);
                    jse.c(object, "null cannot be cast to non-null type android.os.Handler");
                    object = (Handler)object;
                } else {
                    Constructor constructor;
                    try {
                        constructor = Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE);
                    }
                    catch (NoSuchMethodException noSuchMethodException) {
                        object = new Handler(object);
                        break block7;
                    }
                    object = (Handler)constructor.newInstance(object, null, true);
                }
            }
            jxm jxm2 = new jxm((Handler)object, null);
            object = jxm2;
        }
        catch (Throwable throwable) {
            object = jns.aj(throwable);
        }
        if (object instanceof jod) {
            object = var1;
        }
        object = (jxn)object;
    }
}

