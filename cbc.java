/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.Parcelable;

public final class cbc
extends cgk {
    public static final Parcelable.Creator CREATOR = new caw(2);
    public final int a;
    public final int b;
    public final int c;

    public cbc(int n2, int n3, int n4) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        int n3 = this.a;
        n2 = kl.u(parcel);
        kl.A(parcel, 1, n3);
        kl.A(parcel, 2, this.b);
        kl.A(parcel, 3, this.c);
        kl.w(parcel, n2);
    }
}

