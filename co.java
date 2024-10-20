/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.os.IBinder
 *  android.os.Parcel
 */
import android.app.Notification;
import android.os.IBinder;
import android.os.Parcel;

public final class co
implements cq {
    private final IBinder a;

    public co(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override
    public final void a(String string, int n2, Notification notification) {
        Parcel parcel = Parcel.obtain();
        try {
            parcel.writeInterfaceToken(b);
            parcel.writeString(string);
            parcel.writeInt(n2);
            parcel.writeString(null);
            if (notification != null) {
                parcel.writeInt(1);
                notification.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
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

