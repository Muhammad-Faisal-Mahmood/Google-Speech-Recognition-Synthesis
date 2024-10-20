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

public final class aqp
extends aqs {
    public static final Parcelable.Creator CREATOR = new aqo(0);
    public final String a;
    public final String b;
    public final String c;

    public aqp(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int n2 = agf.a;
        this.a = string;
        this.b = parcel.readString();
        this.c = parcel.readString();
    }

    public aqp(String string, String string2, String string3) {
        super("COMM");
        this.a = string;
        this.b = string2;
        this.c = string3;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (aqp)object;
            if (Objects.equals(this.b, ((aqp)object).b) && Objects.equals(this.a, ((aqp)object).a) && Objects.equals(this.c, ((aqp)object).c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String string = this.a;
        int n2 = 0;
        int n3 = string != null ? string.hashCode() : 0;
        string = this.b;
        int n4 = string != null ? string.hashCode() : 0;
        string = this.c;
        if (string != null) {
            n2 = string.hashCode();
        }
        return ((n3 + 527) * 31 + n4) * 31 + n2;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f);
        stringBuilder.append(": language=");
        stringBuilder.append(this.a);
        stringBuilder.append(", description=");
        stringBuilder.append(this.b);
        stringBuilder.append(", text=");
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        parcel.writeString(this.f);
        parcel.writeString(this.a);
        parcel.writeString(this.c);
    }
}

