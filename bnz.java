/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.car.Car
 *  android.car.Car$CarServiceLifecycleListener
 *  android.car.drivingstate.CarUxRestrictions
 *  android.car.drivingstate.CarUxRestrictions$Builder
 *  android.car.drivingstate.CarUxRestrictionsManager
 *  android.car.drivingstate.CarUxRestrictionsManager$OnUxRestrictionsChangedListener
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.util.Log
 */
import android.car.Car;
import android.car.drivingstate.CarUxRestrictions;
import android.car.drivingstate.CarUxRestrictionsManager;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public final class bnz {
    private static bnz d;
    public CarUxRestrictions a = bnz.a();
    public final Set b = Collections.newSetFromMap(new WeakHashMap());
    public final CarUxRestrictionsManager.OnUxRestrictionsChangedListener c;

    private bnz(Context context) {
        Object object = new bnw(this);
        this.c = object;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                object = new bnx(this);
                Car.createCar((Context)context, null, (long)0L, (Car.CarServiceLifecycleListener)object);
                return;
            }
            bnz.d(Car.createCar((Context)context), (CarUxRestrictionsManager.OnUxRestrictionsChangedListener)object);
            return;
        }
        catch (RuntimeException runtimeException) {
            Log.w((String)"CarUxRestrictionsUtil", (String)"Unable to connect to car service, assuming unrestricted", (Throwable)runtimeException);
            this.c.onUxRestrictionsChanged(new CarUxRestrictions.Builder(false, 0, 0L).build());
            return;
        }
    }

    public static CarUxRestrictions a() {
        return new CarUxRestrictions.Builder(true, 511, 0L).build();
    }

    public static bnz b(Context context) {
        if (d == null) {
            d = new bnz(context);
        }
        return d;
    }

    public static void d(Car car2, CarUxRestrictionsManager.OnUxRestrictionsChangedListener onUxRestrictionsChangedListener) {
        try {
            car2 = (CarUxRestrictionsManager)car2.getCarManager("uxrestriction");
            car2.registerListener(onUxRestrictionsChangedListener);
            onUxRestrictionsChangedListener.onUxRestrictionsChanged(car2.getCurrentCarUxRestrictions());
            return;
        }
        catch (NullPointerException nullPointerException) {
            Log.e((String)"CarUxRestrictionsUtil", (String)"Car not connected", (Throwable)nullPointerException);
            return;
        }
    }

    public final void c(bny bny2) {
        this.b.add(bny2);
        bny2.a(this.a);
    }

    public final void e(bny bny2) {
        this.b.remove(bny2);
    }
}

