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
import java.util.Arrays;

public final class aqq
extends aqs {
    public static final Parcelable.Creator CREATOR = new aqo(2);
    public final String a;
    public final String b;
    public final String c;
    public final byte[] d;

    public aqq(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int n2 = agf.a;
        this.a = string;
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.createByteArray();
    }

    public aqq(String string, String string2, String string3, byte[] byArray) {
        super("GEOB");
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = byArray;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (aqq)object;
            if (Objects.equals(this.a, ((aqq)object).a) && Objects.equals(this.b, ((aqq)object).b) && Objects.equals(this.c, ((aqq)object).c) && Arrays.equals(this.d, ((aqq)object).d)) {
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
        return (((n3 + 527) * 31 + n4) * 31 + n2) * 31 + Arrays.hashCode(this.d);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f);
        stringBuilder.append(": mimeType=");
        stringBuilder.append(this.a);
        stringBuilder.append(", filename=");
        stringBuilder.append(this.b);
        stringBuilder.append(", description=");
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeByteArray(this.d);
    }
}

