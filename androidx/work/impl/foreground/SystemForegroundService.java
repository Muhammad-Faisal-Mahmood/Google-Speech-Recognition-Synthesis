/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.NotificationManager
 *  android.content.Intent
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 */
package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.wear.ambient.AmbientMode$AmbientCallback;
import java.util.Objects;
import java.util.UUID;

public class SystemForegroundService
extends abi
implements bga {
    public static final String a = bbi.b("SystemFgService");
    bgb b;
    NotificationManager c;
    private boolean d;

    private final void e() {
        bgb bgb2;
        this.c = (NotificationManager)this.getApplicationContext().getSystemService("notification");
        this.b = bgb2 = new bgb(this.getApplicationContext());
        if (bgb2.h != null) {
            bbi.a().c(bgb.a, "A callback already exists.");
            return;
        }
        bgb2.h = this;
    }

    @Override
    public final void a(int n2) {
        this.c.cancel(n2);
    }

    @Override
    public final void b(int n2, Notification notification) {
        this.c.notify(n2, notification);
    }

    @Override
    public final void c(int n2, int n3, Notification notification) {
        if (Build.VERSION.SDK_INT >= 31) {
            ass.e(this, n2, notification, n3);
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            dp$$ExternalSyntheticApiModelOutline0.m(this, n2, notification, n3);
            return;
        }
        this.startForeground(n2, notification);
    }

    @Override
    public final void d() {
        this.d = true;
        bbi.a();
        this.stopForeground(true);
        this.stopSelf();
    }

    @Override
    public final void onCreate() {
        super.onCreate();
        this.e();
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        this.b.c();
    }

    public final int onStartCommand(Intent object, int n2, int n3) {
        super.onStartCommand((Intent)object, n2, n3);
        if (this.d) {
            bbi.a().e(a, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.b.c();
            this.e();
            this.d = false;
        }
        if (object != null) {
            Object object2 = this.b;
            Object object3 = object.getAction();
            if ("ACTION_START_FOREGROUND".equals(object3)) {
                object3 = bbi.a();
                String string = bgb.a;
                Objects.toString(object);
                ((bbi)object3).e(string, "Started foreground service ".concat(object.toString()));
                object3 = object.getStringExtra("KEY_WORKSPEC_ID");
                ((bgb)object2).i.a(new aks(object2, object3, 10, null));
                ((bgb)object2).b((Intent)object);
            } else if ("ACTION_NOTIFY".equals(object3)) {
                ((bgb)object2).b((Intent)object);
            } else if ("ACTION_CANCEL_WORK".equals(object3)) {
                object3 = bbi.a();
                String string = bgb.a;
                Objects.toString(object);
                ((bbi)object3).e(string, "Stopping foreground work for ".concat(object.toString()));
                object = object.getStringExtra("KEY_WORKSPEC_ID");
                if (object != null && !TextUtils.isEmpty((CharSequence)object)) {
                    object2 = ((bgb)object2).b;
                    AmbientMode$AmbientCallback.k(UUID.fromString((String)object), (bdn)object2);
                }
            } else if ("ACTION_STOP_FOREGROUND".equals(object3)) {
                bbi.a().e(bgb.a, "Stopping foreground service");
                object = ((bgb)object2).h;
                if (object != null) {
                    object.d();
                }
            }
        }
        return 3;
    }

    public final void onTimeout(int n2) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.b.d(2048);
    }

    public final void onTimeout(int n2, int n3) {
        this.b.d(n3);
    }
}

