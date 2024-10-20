/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class chl
extends bov
implements IInterface {
    public chl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int e() {
        Parcel parcel = this.b(6, this.a());
        int n2 = parcel.readInt();
        parcel.recycle();
        return n2;
    }
}

