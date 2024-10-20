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

public final class aql
extends aqs {
    public static final Parcelable.Creator CREATOR = new aa(19);
    public final byte[] a;

    public aql(Parcel parcel) {
        String string = parcel.readString();
        int n2 = agf.a;
        super(string);
        this.a = parcel.createByteArray();
    }

    public aql(String string, byte[] byArray) {
        super(string);
        this.a = byArray;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (aql)object;
            if (this.f.equals(((aql)object).f) && Arrays.equals(this.a, ((aql)object).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f.hashCode() + 527) * 31 + Arrays.hashCode(this.a);
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        parcel.writeString(this.f);
        parcel.writeByteArray(this.a);
    }
}

