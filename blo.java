/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.car.drivingstate.CarUxRestrictions
 */
import android.car.drivingstate.CarUxRestrictions;

final class blo
implements bny {
    final blp a;

    public blo(blp blp2) {
        this.a = blp2;
    }

    @Override
    public final void a(CarUxRestrictions carUxRestrictions) {
        kf kf2 = this.a.a.g();
        if (kf2 instanceof bli) {
            int n2 = (carUxRestrictions.getActiveRestrictions() & 0x20) != 0 ? carUxRestrictions.getMaxCumulativeContentItems() : -1;
            int n3 = kf2.getItemCount();
            ((bli)kf2).a = n2;
            n2 = kf2.getItemCount();
            if (n2 != n3) {
                if (n2 < n3) {
                    kf2.notifyItemRangeRemoved(n2, n3 - n2);
                    return;
                }
                kf2.notifyItemRangeInserted(n3, n2 - n3);
            }
        }
    }
}

