/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.Parcelable;

public final class clg
extends cgk {
    public static final Parcelable.Creator CREATOR = new cho(15);
    public final boolean a;
    public final int b;

    public clg(boolean bl2, int n2) {
        this.a = bl2;
        this.b = n2;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        n2 = kl.u(parcel);
        kl.x(parcel, 2, this.a);
        kl.A(parcel, 3, this.b);
        kl.w(parcel, n2);
    }
}

