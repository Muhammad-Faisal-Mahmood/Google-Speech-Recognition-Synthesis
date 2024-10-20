/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.Parcelable;

public final class cca
extends cgk {
    public static final Parcelable.Creator CREATOR = new caw(9);
    public final boolean a;
    public final String b;
    public final int c;
    public final int d;

    public cca(boolean bl2, String string, int n2, int n3) {
        this.a = bl2;
        this.b = string;
        this.c = ki.m(n2) - 1;
        this.d = ki.n(n3) - 1;
    }

    public final int a() {
        return ki.m(this.c);
    }

    public final void b() {
        ki.n(this.d);
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        boolean bl2 = this.a;
        n2 = kl.u(parcel);
        kl.x(parcel, 1, bl2);
        kl.K(parcel, 2, this.b);
        kl.A(parcel, 3, this.c);
        kl.A(parcel, 4, this.d);
        kl.w(parcel, n2);
    }
}

