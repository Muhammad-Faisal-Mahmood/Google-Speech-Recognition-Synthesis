/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.Parcelable;

public final class cga
extends cgk {
    public static final Parcelable.Creator CREATOR = new caw(18);
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;

    public cga(int n2, int n3, int n4, long l2, long l3, String string, String string2, int n5, int n6) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = l2;
        this.e = l3;
        this.f = string;
        this.g = string2;
        this.h = n5;
        this.i = n6;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        int n3 = this.a;
        n2 = kl.u(parcel);
        kl.A(parcel, 1, n3);
        kl.A(parcel, 2, this.b);
        kl.A(parcel, 3, this.c);
        kl.B(parcel, 4, this.d);
        kl.B(parcel, 5, this.e);
        kl.K(parcel, 6, this.f);
        kl.K(parcel, 7, this.g);
        kl.A(parcel, 8, this.h);
        kl.A(parcel, 9, this.i);
        kl.w(parcel, n2);
    }
}

