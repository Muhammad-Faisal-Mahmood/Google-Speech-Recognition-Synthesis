/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 */
import android.os.Bundle;
import android.os.Parcel;

public final class chn
extends cgk {
    public static final cho CREATOR = new cho(0);
    final String a;
    final String b;
    final String c;
    final String d;
    final String e;
    final Bundle f;

    public chn(String string, String string2, String string3, String string4, String string5, Bundle bundle) {
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = string4;
        this.e = string5;
        this.f = bundle;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        n2 = kl.u(parcel);
        kl.K(parcel, 2, this.a);
        kl.K(parcel, 3, this.b);
        kl.K(parcel, 4, this.c);
        kl.K(parcel, 5, this.d);
        kl.K(parcel, 6, this.e);
        kl.C(parcel, 7, this.f);
        kl.w(parcel, n2);
    }
}

