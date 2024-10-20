/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.IntentFilter
 *  android.os.BatteryManager
 */
import android.content.Context;
import android.content.IntentFilter;
import android.os.BatteryManager;

public final class gko
implements gkn {
    private final BatteryManager a;

    static {
        new IntentFilter("android.intent.action.BATTERY_CHANGED");
    }

    public gko(Context context) {
        this.a = (BatteryManager)context.getSystemService("batterymanager");
    }

    @Override
    public final boolean a() {
        return this.a.isCharging();
    }
}

