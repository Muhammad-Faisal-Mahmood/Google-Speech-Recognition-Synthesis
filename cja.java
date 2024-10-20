/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.Parcelable;

public final class cja
extends cgk {
    public static final Parcelable.Creator CREATOR = new cgi(12);
    public final int a;
    public final String b;
    public final ciy c;

    public cja(int n2, String string, ciy ciy2) {
        this.a = n2;
        this.b = string;
        this.c = ciy2;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        int n3 = this.a;
        int n4 = kl.u(parcel);
        kl.A(parcel, 1, n3);
        kl.K(parcel, 2, this.b);
        kl.J(parcel, 3, this.c, n2);
        kl.w(parcel, n4);
    }
}

