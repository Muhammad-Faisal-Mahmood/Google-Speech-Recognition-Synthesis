/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.Parcelable;

public final class ckn
extends cgk {
    public static final Parcelable.Creator CREATOR = new cho(11);
    final int a;
    final cgd b;

    public ckn(int n2, cgd cgd2) {
        this.a = n2;
        this.b = cgd2;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        int n3 = kl.u(parcel);
        kl.A(parcel, 1, this.a);
        kl.J(parcel, 2, this.b, n2);
        kl.w(parcel, n3);
    }
}

