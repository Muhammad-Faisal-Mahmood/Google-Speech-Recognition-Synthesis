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

public final class bpi
extends cgk {
    public static final Parcelable.Creator CREATOR = new aqo(17);
    public final String a;
    public final int b;

    public bpi(String string, int n2) {
        this.a = string;
        this.b = n2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof bpi)) {
            return false;
        }
        object = (bpi)object;
        return this.b == ((bpi)object).b && Objects.equals(this.a, ((bpi)object).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        String string = this.a;
        n2 = kl.u(parcel);
        kl.K(parcel, 1, string);
        kl.A(parcel, 2, this.b);
        kl.w(parcel, n2);
    }
}

