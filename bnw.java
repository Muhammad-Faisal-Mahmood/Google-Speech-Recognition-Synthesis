/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.car.drivingstate.CarUxRestrictions
 *  android.car.drivingstate.CarUxRestrictionsManager$OnUxRestrictionsChangedListener
 */
import android.car.drivingstate.CarUxRestrictions;
import android.car.drivingstate.CarUxRestrictionsManager;

public final class bnw
implements CarUxRestrictionsManager.OnUxRestrictionsChangedListener {
    public final bnz a;

    public /* synthetic */ bnw(bnz bnz2) {
        this.a = bnz2;
    }

    public final void onUxRestrictionsChanged(CarUxRestrictions object) {
        bnz bnz2 = this.a;
        bnz2.a = object == null ? bnz.a() : object;
        object = bnz2.b.iterator();
        while (object.hasNext()) {
            ((bny)object.next()).a(bnz2.a);
        }
    }
}

