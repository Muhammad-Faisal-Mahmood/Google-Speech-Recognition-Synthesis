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

public final class eys
implements Comparable,
Parcelable {
    public static final Parcelable.Creator CREATOR = new chy(6);
    public final String a;
    public final long b;
    public final int c;

    public eys(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readLong();
        this.c = parcel.readInt();
    }

    public eys(String string, long l2, int n2) {
        this.a = string;
        this.b = l2;
        this.c = n2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof eys)) {
            return false;
        }
        object = (eys)object;
        return this.a.equals(((eys)object).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
    }
}

