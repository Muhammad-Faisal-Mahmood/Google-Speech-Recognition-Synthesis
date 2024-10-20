/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.IBinder
 */
package com.google.frameworks.client.data.android.server.tiktok;

import android.content.Intent;
import android.os.IBinder;
import java.util.HashMap;

public final class MainProcessEndpointService
extends hua {
    public htu a;
    public iyu b;

    @Override
    public final IBinder onBind(Intent intent) {
        super.onBind(intent);
        return this.a.a();
    }

    @Override
    public final void onCreate() {
        super.onCreate();
        HashMap hashMap = new HashMap();
        this.a.b(kmp.S(hashMap), this.b);
    }
}

