/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;

final class dpl {
    public final djt a;

    public dpl() {
        throw null;
    }

    public dpl(djt djt2) {
        this.a = djt2;
    }

    static dpl a(Activity activity) {
        return new dpl(new djt(activity.getClass().getName()));
    }

    final String b() {
        return this.a.a;
    }

    public final boolean equals(Object object) {
        if (object instanceof dpl) {
            object = (dpl)object;
            if (this.b().equals(((dpl)object).b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b().hashCode() * 31 ^ 0x4CF;
    }

    public final String toString() {
        return a.aj(this.a.a, "MeasurementKey{rawStringEventName=null, noPiiEventName=", ", isActivity=true}");
    }
}

