/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public final class cls
extends cgk {
    public static final Parcelable.Creator CREATOR = new cho(17);
    public final int a;
    public final boolean b;
    public final List c;
    public final int d;
    public final String e;
    public final boolean f;

    public cls(int n2, boolean bl2, List list, int n3, String string, boolean bl3) {
        ArrayList arrayList;
        this.c = arrayList = new ArrayList();
        this.a = n2;
        this.b = bl2;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.d = n3;
        this.e = string;
        this.f = bl3;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        n2 = kl.u(parcel);
        kl.A(parcel, 2, this.a);
        kl.x(parcel, 3, this.b);
        kl.M(parcel, 4, this.c);
        kl.A(parcel, 5, this.d);
        kl.K(parcel, 6, this.e);
        kl.x(parcel, 7, this.f);
        kl.w(parcel, n2);
    }
}

