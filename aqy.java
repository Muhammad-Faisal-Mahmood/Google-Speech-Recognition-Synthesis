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

public final class aqy
extends aqs {
    public static final Parcelable.Creator CREATOR = new aqo(7);
    public final String a;
    public final String b;

    public aqy(Parcel parcel) {
        String string = parcel.readString();
        int n2 = agf.a;
        super(string);
        this.a = parcel.readString();
        this.b = parcel.readString();
    }

    public aqy(String string, String string2, String string3) {
        super(string);
        this.a = string2;
        this.b = string3;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (aqy)object;
            if (this.f.equals(((aqy)object).f) && Objects.equals(this.a, ((aqy)object).a) && Objects.equals(this.b, ((aqy)object).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.f.hashCode();
        String string = this.a;
        int n3 = 0;
        int n4 = string != null ? string.hashCode() : 0;
        string = this.b;
        if (string != null) {
            n3 = string.hashCode();
        }
        return ((n2 + 527) * 31 + n4) * 31 + n3;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f);
        stringBuilder.append(": url=");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        parcel.writeString(this.f);
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}

