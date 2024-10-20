/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class cle
extends cgk {
    public static final Parcelable.Creator CREATOR = new cho(13);
    public final String a;
    public final byte[] b;
    public final List c;

    public cle(String arrayList, byte[] byArray, List list) {
        this.a = arrayList;
        this.b = byArray;
        if (list == null) {
            arrayList = new ArrayList(0);
        } else {
            super(list);
        }
        this.c = arrayList;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof cle)) {
            return false;
        }
        object = (cle)object;
        return a.k(this.a, ((cle)object).a) && a.k(this.b, ((cle)object).b) && a.k(this.c, ((cle)object).c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        Object object = this.a;
        int n3 = kl.u(parcel);
        kl.K(parcel, 1, (String)object);
        kl.D(parcel, 2, this.b);
        object = new ArrayList(this.c);
        int n4 = kl.v(parcel, 3);
        int n5 = object.size();
        parcel.writeInt(n5);
        for (n2 = 0; n2 < n5; ++n2) {
            parcel.writeInt(((Integer)object.get(n2)).intValue());
        }
        kl.w(parcel, n4);
        kl.w(parcel, n3);
    }
}

