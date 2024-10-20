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

public abstract class ded
implements Comparable,
Parcelable {
    public static final Parcelable.Creator CREATOR = new chy(3);

    public static ded c(String string, int n2) {
        dec.o("version", n2);
        return new dct(string, n2);
    }

    public abstract int a();

    public abstract String b();

    public final int describeContents() {
        return 0;
    }

    public String toString() {
        String string = this.b();
        int n2 = this.a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(".");
        stringBuilder.append(n2);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        parcel.writeString(this.b());
        parcel.writeInt(this.a());
    }
}

