/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.Parcelable;

public final class cfh
extends cgk {
    public static final Parcelable.Creator CREATOR = new caw(16);
    public final cgg a;
    public final boolean b;
    public final boolean c;
    public final int[] d;
    public final int e;
    public final int[] f;

    public cfh(cgg cgg2, boolean bl2, boolean bl3, int[] nArray, int n2, int[] nArray2) {
        this.a = cgg2;
        this.b = bl2;
        this.c = bl3;
        this.d = nArray;
        this.e = n2;
        this.f = nArray2;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        cgg cgg2 = this.a;
        int n3 = kl.u(parcel);
        kl.J(parcel, 1, cgg2, n2);
        kl.x(parcel, 2, this.b);
        kl.x(parcel, 3, this.c);
        kl.G(parcel, 4, this.d);
        kl.A(parcel, 5, this.e);
        kl.G(parcel, 6, this.f);
        kl.w(parcel, n3);
    }
}

