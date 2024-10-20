/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class cjr
extends cgk {
    public static final Parcelable.Creator CREATOR = new cho(7);
    public final List a;

    public cjr(List list) {
        this.a = list;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof cjr)) {
            return false;
        }
        object = (cjr)object;
        return this.a.equals(((cjr)object).a);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FlagOverrides(");
        Iterator iterator = this.a.iterator();
        boolean bl2 = true;
        while (iterator.hasNext()) {
            cjq cjq2 = (cjq)iterator.next();
            if (!bl2) {
                stringBuilder.append(", ");
            }
            cjq2.a(stringBuilder);
            bl2 = false;
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        n2 = kl.u(parcel);
        kl.O(parcel, 2, this.a);
        kl.w(parcel, n2);
    }
}

