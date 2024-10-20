/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.Parcelable;

public final class cjk
extends cgk {
    public static final Parcelable.Creator CREATOR = new cho(3);
    public final byte[] a;

    public cjk(byte[] byArray) {
        this.a = byArray;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        n2 = kl.u(parcel);
        kl.D(parcel, 2, this.a);
        kl.w(parcel, n2);
    }
}

