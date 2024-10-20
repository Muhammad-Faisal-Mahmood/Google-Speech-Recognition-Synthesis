/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public final class cge
extends cgk {
    public static final Parcelable.Creator CREATOR = new caw(20);
    final int a;
    final IBinder b;
    public final cbk c;
    public final boolean d;
    public final boolean e;

    public cge(int n2, IBinder iBinder, cbk cbk2, boolean bl2, boolean bl3) {
        this.a = n2;
        this.b = iBinder;
        this.c = cbk2;
        this.d = bl2;
        this.e = bl3;
    }

    public final cfs a() {
        IBinder iBinder = this.b;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        iInterface = iInterface instanceof cfs ? (cfs)iInterface : new cfs(iBinder);
        return iInterface;
    }

    public final boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!(object instanceof cge)) {
            return false;
        }
        object = (cge)object;
        return this.c.equals(((cge)object).c) && a.k(this.a(), ((cge)object).a());
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        int n3 = kl.u(parcel);
        kl.A(parcel, 1, this.a);
        kl.F(parcel, 2, this.b);
        kl.J(parcel, 3, this.c, n2);
        kl.x(parcel, 4, this.d);
        kl.x(parcel, 5, this.e);
        kl.w(parcel, n3);
    }
}

