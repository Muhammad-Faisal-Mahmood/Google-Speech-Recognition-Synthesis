/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

public final class cje
extends cgk {
    public static final Parcelable.Creator CREATOR = new cgi(16);
    public final String a;
    public final List b;
    public final long c;

    public cje(String string, List list, long l2) {
        this.a = string;
        this.b = list;
        this.c = l2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (cje)object;
            if (a.k(this.a, ((cje)object).a) && a.k(this.b, ((cje)object).b) && this.c == ((cje)object).c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        Object object = this.a;
        int n3 = kl.u(parcel);
        kl.K(parcel, 1, (String)object);
        object = this.b;
        if (object != null) {
            int n4 = kl.v(parcel, 2);
            int n5 = object.size();
            parcel.writeInt(n5);
            for (n2 = 0; n2 < n5; ++n2) {
                parcel.writeLong(((Long)object.get(n2)).longValue());
            }
            kl.w(parcel, n4);
        }
        kl.B(parcel, 3, this.c);
        kl.w(parcel, n3);
    }
}

