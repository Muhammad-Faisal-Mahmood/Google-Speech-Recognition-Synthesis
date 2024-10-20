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
import java.util.ArrayList;
import java.util.List;

final class bz
implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aa(3);
    ArrayList a;
    ArrayList b;
    z[] c;
    int d;
    String e = null;
    ArrayList f = new ArrayList();
    ArrayList g = new ArrayList();
    ArrayList h;

    public bz() {
    }

    public bz(Parcel parcel) {
        this.a = parcel.createStringArrayList();
        this.b = parcel.createStringArrayList();
        this.c = (z[])parcel.createTypedArray(z.CREATOR);
        this.d = parcel.readInt();
        this.e = parcel.readString();
        this.f = parcel.createStringArrayList();
        this.g = parcel.createTypedArrayList(ab.CREATOR);
        this.h = parcel.createTypedArrayList(bu.CREATOR);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        parcel.writeStringList((List)this.a);
        parcel.writeStringList((List)this.b);
        parcel.writeTypedArray((Parcelable[])this.c, n2);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeStringList((List)this.f);
        parcel.writeTypedList((List)this.g);
        parcel.writeTypedList((List)this.h);
    }
}

