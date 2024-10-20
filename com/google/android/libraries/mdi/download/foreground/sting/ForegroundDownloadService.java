/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build$VERSION
 *  android.os.IBinder
 */
package com.google.android.libraries.mdi.download.foreground.sting;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;

public final class ForegroundDownloadService
extends cvh {
    public cty a;

    private final void a(Notification notification) {
        if (Build.VERSION.SDK_INT >= 34) {
            this.startForeground(1585575426, notification, 1);
            return;
        }
        this.startForeground(1585575426, notification);
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final int onStartCommand(Intent intent, int n2, int n3) {
        cyr.c("%s: ForegroundDownloadService.onStartCommand.", "MDD Foreground Download Service");
        String string = intent.getStringExtra("key");
        if (fxf.P(string)) {
            cyr.g("%s: KEY_EXTRA is null or empty!", "MDD Foreground Download Service");
            return 2;
        }
        if (intent.getBooleanExtra("stop-service", false)) {
            cyr.c("%s: Stopping ForegroundDownloadService.", "MDD Foreground Download Service");
            this.a(cqq.c((Context)this).a());
            this.stopForeground(true);
            this.stopSelf(n3);
            return 2;
        }
        if (intent.hasExtra("cancel-action")) {
            cyr.d("%s: Cancel notification for: %s", "MDD Foreground Download Service", string);
            this.a.i(string);
        }
        cyr.c("%s: before calling startForeground.", "MDD Foreground Download Service");
        this.a(cqq.c((Context)this).a());
        return 2;
    }

    public final void onTimeout(int n2, int n3) {
        cyr.n("%s: onTimeout: %s", "MDD Foreground Download Service", n3);
        super.onTimeout(n2, n3);
        this.stopForeground(true);
        this.stopSelf(n2);
    }
}

