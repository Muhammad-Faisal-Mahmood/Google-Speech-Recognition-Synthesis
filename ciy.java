/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.Parcelable;

public final class ciy
extends cgk {
    public static final Parcelable.Creator CREATOR = new cgi(9);
    public final int a;
    public final int b;

    public ciy(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        int n3 = this.a;
        n2 = kl.u(parcel);
        kl.A(parcel, 1, n3);
        kl.A(parcel, 2, this.b);
        kl.w(parcel, n2);
    }
}

