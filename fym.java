/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  gda
 */
import android.os.Parcel;
import android.os.Parcelable;

public final class fym
implements Parcelable {
    public static final Parcelable.Creator CREATOR = new chy(8);
    public final int a;

    public fym() {
        throw null;
    }

    public fym(int n2) {
        this.a = n2;
    }

    public static fym a(int n2, gda gda2) {
        fxf.K(gda2);
        boolean bl2 = n2 >= -1;
        fxf.B(bl2, "Invalid AccountId");
        return new fym(n2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof fym) {
            object = (fym)object;
            if (this.a == ((fym)object).a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a ^ 0xF4243;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AccountId{id=");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        parcel.writeInt(this.a);
    }
}

