/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.provider.Settings$Secure
 */
import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.TimeUnit;

final class dnd {
    static {
        TimeUnit.DAYS.toMillis(365L);
        TimeUnit.HOURS.toMillis(6L);
    }

    public dnd(Context context) {
        dlt.b();
        Settings.Secure.getString((ContentResolver)context.getContentResolver(), (String)"android_id");
    }
}

