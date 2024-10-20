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

public final class aqk
extends aqs {
    public static final Parcelable.Creator CREATOR = new aa(18);
    public final String a;
    public final String b;
    public final int c;
    public final byte[] d;

    public aqk(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int n2 = agf.a;
        this.a = string;
        this.b = parcel.readString();
        this.c = parcel.readInt();
        this.d = parcel.createByteArray();
    }

    public aqk(String string, String string2, int n2, byte[] byArray) {
        super("APIC");
        this.a = string;
        this.b = string2;
        this.c = n2;
        this.d = byArray;
    }

    @Override
    public final void a(aeh aeh2) {
        aeh2.a(this.d, this.c);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (aqk)object;
            if (this.c == ((aqk)object).c && Objects.equals(this.a, ((aqk)object).a) && Objects.equals(this.b, ((aqk)object).b) && Arrays.equals(this.d, ((aqk)object).d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String string = this.a;
        int n2 = 0;
        int n3 = string != null ? string.hashCode() : 0;
        int n4 = this.c;
        string = this.b;
        if (string != null) {
            n2 = string.hashCode();
        }
        return (((n4 + 527) * 31 + n3) * 31 + n2) * 31 + Arrays.hashCode(this.d);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f);
        stringBuilder.append(": mimeType=");
        stringBuilder.append(this.a);
        stringBuilder.append(", description=");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeByteArray(this.d);
    }
}

