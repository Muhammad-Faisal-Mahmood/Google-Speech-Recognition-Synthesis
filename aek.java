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
import java.util.List;

public final class aek
implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aa(14);
    public final long a;
    private final aej[] b;

    public aek(long l2, aej ... aejArray) {
        this.a = l2;
        this.b = aejArray;
    }

    public aek(Parcel parcel) {
        aej[] aejArray;
        this.b = new aej[parcel.readInt()];
        for (int i2 = 0; i2 < (aejArray = this.b).length; ++i2) {
            aejArray[i2] = (aej)parcel.readParcelable(aej.class.getClassLoader());
        }
        this.a = parcel.readLong();
    }

    public aek(List list) {
        this(list.toArray(new aej[0]));
    }

    public aek(aej ... aejArray) {
        this(-9223372036854775807L, aejArray);
    }

    public final int a() {
        return this.b.length;
    }

    public final aej b(int n2) {
        return this.b[n2];
    }

    public final aek c(aej ... aejArray) {
        int n2 = aejArray.length;
        if (n2 == 0) {
            return this;
        }
        long l2 = this.a;
        aej[] aejArray2 = this.b;
        int n3 = agf.a;
        n3 = aejArray2.length;
        aejArray2 = Arrays.copyOf(aejArray2, n3 + n2);
        System.arraycopy(aejArray, 0, aejArray2, n3, n2);
        return new aek(l2, aejArray2);
    }

    public final aek d(aek aek2) {
        if (aek2 == null) {
            return this;
        }
        return this.c(aek2.b);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (aek)object;
            if (Arrays.equals(this.b, ((aek)object).b) && this.a == ((aek)object).a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = Arrays.hashCode(this.b);
        long l2 = this.a;
        return n2 * 31 + (int)(l2 ^ l2 >>> 32);
    }

    public final String toString() {
        long l2 = this.a;
        String string = Arrays.toString(this.b);
        String string2 = l2 == -9223372036854775807L ? "" : a.ap(l2, ", presentationTimeUs=");
        StringBuilder stringBuilder = new StringBuilder("entries=");
        stringBuilder.append(string);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        parcel.writeInt(this.b.length);
        aej[] aejArray = this.b;
        int n3 = aejArray.length;
        for (n2 = 0; n2 < n3; ++n2) {
            parcel.writeParcelable((Parcelable)aejArray[n2], 0);
        }
        parcel.writeLong(this.a);
    }
}

