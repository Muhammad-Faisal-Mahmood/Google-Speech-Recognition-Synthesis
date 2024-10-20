/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.Parcelable;

public final class cgg
extends cgk {
    public static final Parcelable.Creator CREATOR = new cgi(1);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    public cgg(int n2, boolean bl2, boolean bl3, int n3, int n4) {
        this.a = n2;
        this.b = bl2;
        this.c = bl3;
        this.d = n3;
        this.e = n4;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        n2 = this.a;
        int n3 = kl.u(parcel);
        kl.A(parcel, 1, n2);
        kl.x(parcel, 2, this.b);
        kl.x(parcel, 3, this.c);
        kl.A(parcel, 4, this.d);
        kl.A(parcel, 5, this.e);
        kl.w(parcel, n3);
    }
}

