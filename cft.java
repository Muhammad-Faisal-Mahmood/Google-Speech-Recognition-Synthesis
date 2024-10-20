/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 */
import android.os.IBinder;
import android.os.Parcel;

public final class cft
extends bov
implements cfv {
    public cft(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override
    public final int e() {
        Parcel parcel = this.b(2, this.a());
        int n2 = parcel.readInt();
        parcel.recycle();
        return n2;
    }

    @Override
    public final cha f() {
        Object object;
        Parcel parcel = this.b(1, this.a());
        IBinder iBinder = parcel.readStrongBinder();
        object = iBinder == null ? null : ((object = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper")) instanceof cha ? (cha)object : new cgy(iBinder));
        parcel.recycle();
        return object;
    }
}

