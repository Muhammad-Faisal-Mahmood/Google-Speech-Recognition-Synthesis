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

public final class bu
implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aa(2);
    final String a;
    final int b;

    public bu(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readInt();
    }

    public bu(String string, int n2) {
        this.a = string;
        this.b = n2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
    }
}

