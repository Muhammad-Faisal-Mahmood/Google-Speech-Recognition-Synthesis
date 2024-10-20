/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.PowerManager
 *  android.os.PowerManager$WakeLock
 */
import android.content.Context;
import android.os.PowerManager;

public final class bik {
    public static final String a = bbi.b("WakeLocks");

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final PowerManager.WakeLock a(Context object, String string) {
        jse.e(object, "context");
        object = object.getApplicationContext().getSystemService("power");
        jse.c(object, "null cannot be cast to non-null type android.os.PowerManager");
        object = (PowerManager)object;
        String string2 = "WorkManager: ".concat(string);
        string = object.newWakeLock(1, string2);
        object = bil.a;
        synchronized (object) {
            string2 = bil.b.put(string, string2);
        }
        jse.d(string, "wakeLock");
        return string;
    }
}

