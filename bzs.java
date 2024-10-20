/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.content.Context
 *  android.content.pm.PackageManager
 */
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class bzs {
    private static final ConcurrentMap a = new ConcurrentHashMap();

    public final String a(PackageManager object, int n2) {
        if (n2 == 0) {
            return "unknown_uid_zero";
        }
        if (n2 < 0) {
            return "unknown_uid_negative";
        }
        ConcurrentMap concurrentMap = a;
        Integer n3 = n2;
        if (concurrentMap.containsKey(n3)) {
            object = (String)concurrentMap.get(n3);
        } else {
            String string = object.getNameForUid(n2);
            object = string;
            if (string != null) {
                concurrentMap.put(n3, string);
                object = string;
            }
        }
        if (object != null) {
            return ((String)object).split(":")[0];
        }
        return "not_assigned";
    }

    public final boolean b(Context context) {
        return ((ActivityManager)context.getSystemService("activity")).isLowRamDevice();
    }
}

