/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 */
import android.os.IBinder;
import android.os.Parcel;

final class atx
implements atz {
    private final IBinder a;

    public atx(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override
    public final void a(String[] stringArray) {
        Parcel parcel = Parcel.obtain();
        try {
            parcel.writeInterfaceToken(b);
            parcel.writeStringArray(stringArray);
            this.a.transact(1, parcel, null, 1);
            return;
        }
        finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.a;
    }
}

