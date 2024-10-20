/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class cbz
extends cgk {
    public static final Parcelable.Creator CREATOR = new caw(8);
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    private final Context f;

    public cbz(String object, boolean bl2, boolean bl3, IBinder iBinder, boolean bl4, boolean bl5) {
        this.a = object;
        this.b = bl2;
        this.c = bl3;
        object = iBinder == null ? null : ((object = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper")) instanceof cha ? (cha)object : new cgy(iBinder));
        this.f = (Context)cgz.b((cha)object);
        this.d = bl4;
        this.e = bl5;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        String string = this.a;
        n2 = kl.u(parcel);
        kl.K(parcel, 1, string);
        kl.x(parcel, 2, this.b);
        kl.x(parcel, 3, this.c);
        kl.F(parcel, 4, (IBinder)new cgz(this.f));
        kl.x(parcel, 5, this.d);
        kl.x(parcel, 6, this.e);
        kl.w(parcel, n2);
    }
}

