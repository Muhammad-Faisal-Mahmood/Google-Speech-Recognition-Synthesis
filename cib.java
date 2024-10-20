/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.Parcelable;

public final class cib
extends cgk {
    public static final Parcelable.Creator CREATOR = new cgi(5);
    int a;
    int b;

    public cib() {
        this(3, 0);
    }

    public cib(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        n2 = kl.u(parcel);
        kl.A(parcel, 2, this.a);
        kl.A(parcel, 3, this.b);
        kl.w(parcel, n2);
    }
}

