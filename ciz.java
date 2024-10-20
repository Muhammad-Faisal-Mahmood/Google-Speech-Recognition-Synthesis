/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

public final class ciz
extends cgk {
    public static final Parcelable.Creator CREATOR = new cgi(11);
    public final int a;
    public final String b;
    public final long c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public ciz(int n2, String string, long l2, int n3, int n4, int n5, int n6, int n7, int n8) {
        this.a = n2;
        this.b = string;
        this.c = l2;
        this.d = n3;
        this.e = n4;
        this.f = n5;
        this.g = n6;
        this.h = n7;
        this.i = n8;
    }

    public final String toString() {
        return String.format(Locale.US, "ExtendedSyncStatus{code=%d, message=%s, lastSyncTimeMillis=%d, numOfItems=%d, syncStage=%d, dataType=%d, cycleStatus=%d, numOfSyncedItems=%d, numOfTotalItems=%d}", this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        int n3 = this.a;
        n2 = kl.u(parcel);
        kl.A(parcel, 2, n3);
        kl.K(parcel, 3, this.b);
        kl.B(parcel, 4, this.c);
        kl.A(parcel, 5, this.d);
        kl.A(parcel, 6, this.e);
        kl.A(parcel, 7, this.f);
        kl.A(parcel, 8, this.g);
        kl.A(parcel, 9, this.h);
        kl.A(parcel, 10, this.i);
        kl.w(parcel, n2);
    }
}

