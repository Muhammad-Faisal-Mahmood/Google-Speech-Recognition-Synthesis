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

public final class aqh
implements aej {
    public static final Parcelable.Creator CREATOR = new aa(15);
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public aqh(int n2, String string, String string2, int n3, int n4, int n5, int n6, byte[] byArray) {
        this.a = n2;
        this.b = string;
        this.c = string2;
        this.d = n3;
        this.e = n4;
        this.f = n5;
        this.g = n6;
        this.h = byArray;
    }

    public aqh(Parcel parcel) {
        this.a = parcel.readInt();
        String string = parcel.readString();
        int n2 = agf.a;
        this.b = string;
        this.c = parcel.readString();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.createByteArray();
    }

    @Override
    public final void a(aeh aeh2) {
        aeh2.a(this.h, this.a);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (aqh)object;
            if (this.a == ((aqh)object).a && this.b.equals(((aqh)object).b) && this.c.equals(((aqh)object).c) && this.d == ((aqh)object).d && this.e == ((aqh)object).e && this.f == ((aqh)object).f && this.g == ((aqh)object).g && Arrays.equals(this.h, ((aqh)object).h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.a;
        int n3 = this.b.hashCode();
        int n4 = this.c.hashCode();
        byte[] byArray = this.h;
        return (((((((n2 + 527) * 31 + n3) * 31 + n4) * 31 + this.d) * 31 + this.e) * 31 + this.f) * 31 + this.g) * 31 + Arrays.hashCode(byArray);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Picture: mimeType=");
        stringBuilder.append(this.b);
        stringBuilder.append(", description=");
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeByteArray(this.h);
    }
}

