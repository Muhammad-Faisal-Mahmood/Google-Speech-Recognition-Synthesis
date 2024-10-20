/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class cjg
extends cgk
implements Parcelable {
    public static final Parcelable.Creator CREATOR = new cgi(18);
    public final Integer a;

    public cjg(Integer n2) {
        this.a = n2;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof cjg)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        object = (cjg)object;
        return a.k(this.a, ((cjg)object).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        Integer n3 = this.a;
        n2 = kl.u(parcel);
        kl.H(parcel, 2, n3);
        kl.w(parcel, n2);
    }
}

