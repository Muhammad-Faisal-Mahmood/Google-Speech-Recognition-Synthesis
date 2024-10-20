/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.util.Log
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.wear.ambient.AmbientMode$AmbientController;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentMap;

public final class dwa
extends BroadcastReceiver {
    public static final Object a = new Object();
    public static volatile boolean b;
    public static final ConcurrentMap c;

    static {
        c = new ConcurrentHashMap();
    }

    public final void onReceive(Context object, Intent object2) {
        object = object2.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (object != null) {
            if (!((String)object).contains("../") && !((String)object).contains("/..")) {
                object2 = new ArrayList(c.keySet());
                int n2 = object2.size();
                for (int i2 = 0; i2 < n2; ++i2) {
                    AmbientMode$AmbientController ambientMode$AmbientController;
                    Object object3 = (gtp)object2.get(i2);
                    if (!((String)((gtp)object3).a).equals(object) || (ambientMode$AmbientController = (AmbientMode$AmbientController)c.get(object3)) == null) continue;
                    object3 = dvr.g;
                    ((dvr)ambientMode$AmbientController.a).b();
                }
            }
        } else {
            return;
        }
        Log.w((String)"PhUpdateBroadcastRecv", (String)a.aj((String)object, "Got an invalid config package for P/H that includes '..': ", ". Exiting."));
    }
}

