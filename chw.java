/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.Parcelable;

public final class chw
extends cgk {
    public static final Parcelable.Creator CREATOR = new cgi(4);
    final String a;
    final boolean b;
    final boolean c;
    final boolean d;
    final boolean e;
    final chz[] f;

    public chw(String string, boolean bl2, boolean bl3, boolean bl4, boolean bl5, chz[] chzArray) {
        this.a = string;
        this.b = bl2;
        this.c = bl3;
        this.d = bl4;
        this.e = bl5;
        this.f = chzArray;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        int n3 = kl.u(parcel);
        kl.K(parcel, 2, this.a);
        kl.x(parcel, 3, this.b);
        kl.x(parcel, 4, this.c);
        kl.x(parcel, 5, this.d);
        kl.x(parcel, 6, this.e);
        kl.N(parcel, 7, this.f, n2);
        kl.w(parcel, n3);
    }
}

