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

public final class aqv
extends aqs {
    public static final Parcelable.Creator CREATOR = new aqo(4);
    public final int a;
    public final int b;
    public final int c;
    public final int[] d;
    public final int[] e;

    public aqv(int n2, int n3, int n4, int[] nArray, int[] nArray2) {
        super("MLLT");
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = nArray;
        this.e = nArray2;
    }

    public aqv(Parcel parcel) {
        super("MLLT");
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        int[] nArray = parcel.createIntArray();
        int n2 = agf.a;
        this.d = nArray;
        this.e = parcel.createIntArray();
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
            object = (aqv)object;
            if (this.a == ((aqv)object).a && this.b == ((aqv)object).b && this.c == ((aqv)object).c && Arrays.equals(this.d, ((aqv)object).d) && Arrays.equals(this.e, ((aqv)object).e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.a;
        int[] nArray = this.d;
        return ((((n2 + 527) * 31 + this.b) * 31 + this.c) * 31 + Arrays.hashCode(nArray)) * 31 + Arrays.hashCode(this.e);
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeIntArray(this.e);
    }
}

