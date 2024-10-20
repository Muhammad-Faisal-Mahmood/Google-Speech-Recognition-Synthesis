/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.Parcelable;

public final class clm
extends cgk {
    public static final Parcelable.Creator CREATOR = new cho(16);
    public final boolean a;
    public final boolean b;
    public final int c;

    public clm(boolean bl2, boolean bl3, int n2) {
        this.a = bl2;
        this.b = bl3;
        this.c = n2;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        n2 = kl.u(parcel);
        kl.x(parcel, 2, this.a);
        kl.x(parcel, 3, this.b);
        kl.A(parcel, 4, this.c);
        kl.w(parcel, n2);
    }
}

