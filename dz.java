/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.IntentFilter
 *  android.os.PowerManager
 */
import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;

final class dz
extends eb {
    public final PowerManager a;
    final eg b;

    public dz(eg eg2, Context context) {
        this.b = eg2;
        super(eg2);
        this.a = (PowerManager)context.getApplicationContext().getSystemService("power");
    }

    @Override
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }

    @Override
    public final void b() {
        this.b.M();
    }
}

