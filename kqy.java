/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.util.Log
 */
import android.content.Context;
import android.os.Build;
import android.util.Log;

public final class kqy {
    private static final String a = "kqy";
    private static kqx b;

    private kqy() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static kqx a(Context object, int n2) {
        synchronized (kqy.class) {
            if (b == null && Build.VERSION.SDK_INT >= 30) {
                boolean bl2;
                boolean bl3 = bl2 = true;
                if (n2 != 5) {
                    bl3 = n2 == 3 ? bl2 : false;
                }
                if (bl3 = kqz.a(object).getBoolean("android.net.http.EnableTelemetry", bl3)) {
                    try {
                        object = new ksk();
                        b = object;
                    }
                    catch (Exception exception) {
                        Log.e((String)a, (String)"Exception creating an instance of CronetLoggerImpl", (Throwable)exception);
                    }
                }
            }
            if (b != null) return b;
            object = new krz();
            b = object;
            return b;
        }
    }
}

