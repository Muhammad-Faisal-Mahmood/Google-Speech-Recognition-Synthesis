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

public abstract class dcv
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final dcv a;

    static {
        a = new dcn(0, 1);
        CREATOR = new chy(1);
    }

    public static void d(int n2) {
        if (n2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(a.af(n2, "Invalid priority value:"));
    }

    public abstract int a();

    public abstract int b();

    public final int c(int n2) {
        if (this.a() != 0) {
            return n2;
        }
        return this.b() + n2;
    }

    public final int describeContents() {
        return 0;
    }

    public String toString() {
        int n2 = this.a();
        int n3 = this.b();
        StringBuilder stringBuilder = new StringBuilder("{");
        String string = n2 == 1 ? "absolute:" : "relative:";
        stringBuilder.append(string);
        stringBuilder.append(n3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        parcel.writeInt(this.b());
        parcel.writeInt(this.a());
    }
}

