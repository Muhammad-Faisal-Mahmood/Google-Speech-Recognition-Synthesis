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
import j$.util.Objects;
import java.util.List;

public final class bpk
implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aqo(19);
    public final gzx a;
    public final bpg b;

    public bpk(List list, bpg bpg2) {
        this.a = gzx.o(list);
        this.b = bpg2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof bpk)) {
            return false;
        }
        object = (bpk)object;
        return Objects.equals(this.a, ((bpk)object).a) && Objects.equals(this.b, ((bpk)object).b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        gzx gzx2 = this.a;
        int n3 = kl.u(parcel);
        kl.O(parcel, 1, gzx2);
        kl.J(parcel, 2, this.b, n2);
        kl.w(parcel, n3);
    }
}

