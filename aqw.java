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

public final class aqw
extends aqs {
    public static final Parcelable.Creator CREATOR = new aqo(5);
    public final String a;
    public final byte[] b;

    public aqw(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int n2 = agf.a;
        this.a = string;
        this.b = parcel.createByteArray();
    }

    public aqw(String string, byte[] byArray) {
        super("PRIV");
        this.a = string;
        this.b = byArray;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (aqw)object;
            if (Objects.equals(this.a, ((aqw)object).a) && Arrays.equals(this.b, ((aqw)object).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String string = this.a;
        int n2 = string != null ? string.hashCode() : 0;
        return (n2 + 527) * 31 + Arrays.hashCode(this.b);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f);
        stringBuilder.append(": owner=");
        stringBuilder.append(this.a);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
    }
}

