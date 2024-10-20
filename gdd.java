/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.NotificationManager
 */
import android.app.NotificationManager;

public final class gdd
implements imb {
    private final jnu a;

    public gdd(jnu jnu2) {
        this.a = jnu2;
    }

    public final NotificationManager a() {
        NotificationManager notificationManager = (NotificationManager)((ilt)this.a).a().getSystemService("notification");
        idi.m(notificationManager);
        return notificationManager;
    }
}

