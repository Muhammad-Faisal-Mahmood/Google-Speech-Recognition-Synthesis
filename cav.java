/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;

public final class cav
extends cgk {
    public static final Parcelable.Creator CREATOR = new caw(0);
    public final List a;

    public cav(List list) {
        this.a = DesugarCollections.unmodifiableList(list);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof cav)) {
            return false;
        }
        object = (cav)object;
        return this.a.equals(((cav)object).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BatchedLogErrorParcelable[LogErrors: ");
        stringBuilder.append(this.a);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        List list = this.a;
        n2 = kl.u(parcel);
        kl.O(parcel, 1, list);
        kl.w(parcel, n2);
    }
}

