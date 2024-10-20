/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.Parcelable;

public final class cko
extends cgk {
    public static final Parcelable.Creator CREATOR = new cho(12);
    final int a;
    public final cbk b;
    public final cge c;

    public cko(int n2, cbk cbk2, cge cge2) {
        this.a = n2;
        this.b = cbk2;
        this.c = cge2;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        int n3 = kl.u(parcel);
        kl.A(parcel, 1, this.a);
        kl.J(parcel, 2, this.b, n2);
        kl.J(parcel, 3, this.c, n2);
        kl.w(parcel, n3);
    }
}

