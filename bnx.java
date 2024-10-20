/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.car.Car
 *  android.car.Car$CarServiceLifecycleListener
 *  android.util.Log
 */
import android.car.Car;
import android.util.Log;

public final class bnx
implements Car.CarServiceLifecycleListener {
    public final bnz a;

    public /* synthetic */ bnx(bnz bnz2) {
        this.a = bnz2;
    }

    public final void onLifecycleChanged(Car car2, boolean bl2) {
        bnz bnz2 = this.a;
        if (bl2) {
            bnz.d(car2, bnz2.c);
            return;
        }
        Log.w((String)"CarUxRestrictionsUtil", (String)"Car service disconnected, assuming fully restricted uxr");
        bnz2.c.onUxRestrictionsChanged(null);
    }
}

