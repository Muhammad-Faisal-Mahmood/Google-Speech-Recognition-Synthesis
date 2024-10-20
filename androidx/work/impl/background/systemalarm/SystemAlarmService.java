/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.PowerManager$WakeLock
 */
package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import java.util.LinkedHashMap;
import java.util.Map;

public class SystemAlarmService
extends abi
implements bek {
    private static final String a = bbi.b("SystemAlarmService");
    private bem b;
    private boolean c;

    private final void b() {
        bem bem2;
        this.b = bem2 = new bem((Context)this);
        if (bem2.i != null) {
            bbi.a().c(bem.a, "A completion listener for SystemAlarmDispatcher already exists.");
            return;
        }
        bem2.i = this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a() {
        this.c = true;
        bbi.a();
        Object object = new LinkedHashMap();
        Object object2 = bil.a;
        synchronized (object2) {
            object.putAll(bil.b);
        }
        object2 = object.entrySet().iterator();
        while (true) {
            if (!object2.hasNext()) {
                this.stopSelf();
                return;
            }
            Map.Entry object22 = (Map.Entry)object2.next();
            object = (PowerManager.WakeLock)object22.getKey();
            String string = (String)object22.getValue();
            if (object == null || !object.isHeld()) continue;
            object = String.valueOf(string);
            bbi.a().f(bik.a, "WakeLock held for ".concat((String)object));
        }
    }

    @Override
    public final void onCreate() {
        super.onCreate();
        this.b();
        this.c = false;
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        this.c = true;
        this.b.b();
    }

    public final int onStartCommand(Intent intent, int n2, int n3) {
        super.onStartCommand(intent, n2, n3);
        if (this.c) {
            bbi.a().e(a, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.b.b();
            this.b();
            this.c = false;
        }
        if (intent != null) {
            this.b.d(intent, n3);
        }
        return 3;
    }
}

