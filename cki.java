/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

public final class cki
extends cgk
implements cda {
    public static final Parcelable.Creator CREATOR = new cho(9);
    final int a;
    public int b;
    public Intent c;

    public cki() {
        this(2, 0, null);
    }

    public cki(int n2, int n3, Intent intent) {
        this.a = n2;
        this.b = n3;
        this.c = intent;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        int n3 = kl.u(parcel);
        kl.A(parcel, 1, this.a);
        kl.A(parcel, 2, this.b);
        kl.J(parcel, 3, (Parcelable)this.c, n2);
        kl.w(parcel, n3);
    }
}

