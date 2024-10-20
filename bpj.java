/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.ParcelFileDescriptor
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

public final class bpj
extends cgk
implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aqo(18);
    public final byte[] a;
    public final String b;
    public final int c;
    public final ParcelFileDescriptor d;
    public final String e;

    public bpj(byte[] byArray, String string, int n2, ParcelFileDescriptor parcelFileDescriptor, String string2) {
        this.a = byArray;
        this.b = string;
        this.c = n2;
        this.d = parcelFileDescriptor;
        this.e = string2;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        byte[] byArray = this.a;
        int n3 = kl.u(parcel);
        kl.D(parcel, 1, byArray);
        kl.K(parcel, 2, this.b);
        kl.A(parcel, 3, this.c);
        kl.J(parcel, 4, (Parcelable)this.d, n2);
        kl.K(parcel, 5, this.e);
        kl.w(parcel, n3);
    }
}

