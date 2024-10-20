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
import java.util.Arrays;

public final class aqm
extends aqs {
    public static final Parcelable.Creator CREATOR = new aa(20);
    public final String a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    private final aqs[] g;

    public aqm(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int n2 = agf.a;
        this.a = string;
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readLong();
        this.e = parcel.readLong();
        int n3 = parcel.readInt();
        this.g = new aqs[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            this.g[n2] = (aqs)parcel.readParcelable(aqs.class.getClassLoader());
        }
    }

    public aqm(String string, int n2, int n3, long l2, long l3, aqs[] aqsArray) {
        super("CHAP");
        this.a = string;
        this.b = n2;
        this.c = n3;
        this.d = l2;
        this.e = l3;
        this.g = aqsArray;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (aqm)object;
            if (this.b == ((aqm)object).b && this.c == ((aqm)object).c && this.d == ((aqm)object).d && this.e == ((aqm)object).e && Objects.equals(this.a, ((aqm)object).a) && Arrays.equals(this.g, ((aqm)object).g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String string = this.a;
        int n2 = string != null ? string.hashCode() : 0;
        int n3 = this.b;
        int n4 = this.c;
        long l2 = this.d;
        long l3 = this.e;
        return ((((n3 + 527) * 31 + n4) * 31 + (int)l2) * 31 + (int)l3) * 31 + n2;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeInt(this.g.length);
        aqs[] aqsArray = this.g;
        int n3 = aqsArray.length;
        for (n2 = 0; n2 < n3; ++n2) {
            parcel.writeParcelable((Parcelable)aqsArray[n2], 0);
        }
    }
}

