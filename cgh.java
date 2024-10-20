/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class cgh
extends cgk {
    public static final Parcelable.Creator CREATOR = new cgi(0);
    public final int a;
    public List b;

    public cgh(int n2, List list) {
        this.a = n2;
        this.b = list;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        n2 = this.a;
        int n3 = kl.u(parcel);
        kl.A(parcel, 1, n2);
        kl.O(parcel, 2, this.b);
        kl.w(parcel, n3);
    }
}

