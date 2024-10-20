/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import java.lang.reflect.Method;

public final class fpi {
    private static final Method a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Throwable throwable2;
        Method method;
        block4: {
            Method method2;
            Method method3 = null;
            method = method2 = null;
            Method method4 = method3;
            try {
                try {
                    Class<?> clazz = Class.forName("android.os.SystemProperties");
                    method = method2;
                    method4 = method3;
                    method = method3 = clazz.getMethod("get", String.class, String.class);
                    method4 = method3;
                    clazz.getMethod("getInt", String.class, Integer.TYPE);
                    method = method3;
                    method4 = method3;
                    clazz.getMethod("getLong", String.class, Long.TYPE);
                    method = method3;
                    method4 = method3;
                    clazz.getMethod("getBoolean", String.class, Boolean.TYPE);
                    method4 = method3;
                }
                catch (Exception exception) {
                    method = method4;
                    exception.printStackTrace();
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            a = method4;
            return;
        }
        a = method;
        throw throwable2;
    }

    public static String a(String string, String string2) {
        try {
            string = (String)a.invoke(null, string, string2);
            return string;
        }
        catch (Exception exception) {
            Log.e((String)"SystemProperties", (String)"get error", (Throwable)exception);
            return string2;
        }
    }
}

