/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

public final class aqj
implements aej {
    public static final Parcelable.Creator CREATOR = new aa(17);
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;

    public aqj(int n2, String string, String string2, String string3, boolean bl2, int n3) {
        boolean bl3;
        boolean bl4 = bl3 = true;
        if (n3 != -1) {
            bl4 = n3 > 0 ? bl3 : false;
        }
        abr.d(bl4);
        this.a = n2;
        this.b = string;
        this.c = string2;
        this.d = string3;
        this.e = bl2;
        this.f = n3;
    }

    public aqj(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        int n2 = agf.a;
        boolean bl2 = parcel.readInt() != 0;
        this.e = bl2;
        this.f = parcel.readInt();
    }

    @Override
    public final void a(aeh aeh2) {
        String string = this.c;
        if (string != null) {
            aeh2.v = string;
        }
        if ((string = this.b) != null) {
            aeh2.u = string;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (aqj)object;
            if (this.a == ((aqj)object).a && Objects.equals(this.b, ((aqj)object).b) && Objects.equals(this.c, ((aqj)object).c) && Objects.equals(this.d, ((aqj)object).d) && this.e == ((aqj)object).e && this.f == ((aqj)object).f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String string = this.b;
        int n2 = 0;
        int n3 = string != null ? string.hashCode() : 0;
        int n4 = this.a;
        string = this.c;
        int n5 = string != null ? string.hashCode() : 0;
        string = this.d;
        if (string != null) {
            n2 = string.hashCode();
        }
        return (((((n4 + 527) * 31 + n3) * 31 + n5) * 31 + n2) * 31 + this.e) * 31 + this.f;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("IcyHeaders: name=\"");
        stringBuilder.append(this.c);
        stringBuilder.append("\", genre=\"");
        stringBuilder.append(this.b);
        stringBuilder.append("\", bitrate=");
        stringBuilder.append(this.a);
        stringBuilder.append(", metadataInterval=");
        stringBuilder.append(this.f);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        n2 = agf.a;
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f);
    }
}

