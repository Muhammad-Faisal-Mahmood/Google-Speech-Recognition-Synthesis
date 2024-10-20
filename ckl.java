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

public final class ckl
extends cgk
implements cda {
    public static final Parcelable.Creator CREATOR = new cho(10);
    public final List a;
    public final String b;

    public ckl(List list, String string) {
        this.a = list;
        this.b = string;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        List list = this.a;
        n2 = kl.u(parcel);
        kl.M(parcel, 1, list);
        kl.K(parcel, 2, this.b);
        kl.w(parcel, n2);
    }
}

