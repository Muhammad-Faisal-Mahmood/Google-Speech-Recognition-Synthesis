/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 */
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class oa
extends kh {
    public final Object a = new Object();
    public final ExecutorService b = Executors.newFixedThreadPool(4, new knp(1, null));
    public volatile Handler c;

    public oa() {
        super(null);
    }

    public static Handler v(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return fs$$ExternalSyntheticApiModelOutline0.m(looper);
        }
        try {
            Handler handler = (Handler)Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, true);
            return handler;
        }
        catch (InvocationTargetException invocationTargetException) {
            return new Handler(looper);
        }
        catch (IllegalAccessException | InstantiationException | NoSuchMethodException reflectiveOperationException) {
            return new Handler(looper);
        }
    }
}

