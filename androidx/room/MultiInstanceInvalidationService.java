/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.Intent
 *  android.os.IBinder
 *  android.os.RemoteCallbackList
 */
package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import java.util.LinkedHashMap;
import java.util.Map;

public final class MultiInstanceInvalidationService
extends Service {
    public int a;
    public final Map b = new LinkedHashMap();
    public final RemoteCallbackList c = new auf(this);
    private final aua d = new aua(this);

    public final IBinder onBind(Intent intent) {
        jse.e(intent, "intent");
        return this.d;
    }
}

