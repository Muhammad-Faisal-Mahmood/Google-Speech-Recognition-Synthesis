/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class bow
extends Binder
implements IInterface {
    protected bow(String string) {
        this.attachInterface(this, string);
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int n2, Parcel parcel, Parcel parcel2, int n3) {
        if (n2 > 0xFFFFFF) {
            if (super.onTransact(n2, parcel, parcel2, n3)) {
                return true;
            }
        } else {
            parcel.enforceInterface(this.getInterfaceDescriptor());
        }
        return this.y(n2, parcel, parcel2);
    }

    protected boolean y(int n2, Parcel parcel, Parcel parcel2) {
        return false;
    }
}

