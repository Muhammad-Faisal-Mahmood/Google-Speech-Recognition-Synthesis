/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.Parcelable;

public final class ciw
extends cgk {
    public static final Parcelable.Creator CREATOR = new cgi(7);
    public final String a;
    public final int[] b;
    public final int c;
    public final String[] d;

    public ciw(String string, int[] nArray, int n2, String[] stringArray) {
        this.a = string;
        this.b = nArray;
        this.c = n2;
        this.d = stringArray;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        String string = this.a;
        n2 = kl.u(parcel);
        kl.K(parcel, 1, string);
        kl.G(parcel, 2, this.b);
        kl.A(parcel, 4, this.c);
        kl.L(parcel, 5, this.d);
        kl.w(parcel, n2);
    }
}

