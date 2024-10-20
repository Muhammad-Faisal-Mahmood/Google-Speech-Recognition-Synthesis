/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class cfg
extends cgk {
    public static final Parcelable.Creator CREATOR = new caw(15);
    Bundle a;
    cbm[] b;
    int c;
    public cfh d;

    public cfg() {
    }

    public cfg(Bundle bundle, cbm[] cbmArray, int n2, cfh cfh2) {
        this.a = bundle;
        this.b = cbmArray;
        this.c = n2;
        this.d = cfh2;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        int n3 = kl.u(parcel);
        kl.C(parcel, 1, this.a);
        kl.N(parcel, 2, this.b, n2);
        kl.A(parcel, 3, this.c);
        kl.J(parcel, 4, this.d, n2);
        kl.w(parcel, n3);
    }
}

