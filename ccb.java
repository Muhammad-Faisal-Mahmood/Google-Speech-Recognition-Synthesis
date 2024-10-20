/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  android.os.RemoteException
 *  android.util.Log
 */
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;

public final class ccb
extends cgk {
    public static final Parcelable.Creator CREATOR = new caw(10);
    public final String a;
    public final boolean b;
    public final boolean c;
    private final cfu d;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ccb(String object, IBinder iBinder, boolean bl2, boolean bl3) {
        block6: {
            this.a = object;
            Object var5_6 = null;
            if (iBinder == null) {
                object = var5_6;
            } else {
                try {
                    object = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                    object = object instanceof cfv ? (cfv)object : new cft(iBinder);
                    object = object.f();
                    object = object == null ? null : (Object)((byte[])cgz.b((cha)object));
                }
                catch (RemoteException remoteException) {
                    Log.e((String)"GoogleCertificatesQuery", (String)"Could not unwrap certificate", (Throwable)remoteException);
                    object = var5_6;
                    break block6;
                }
                if (object != null) {
                    object = new cbv((byte[])object);
                } else {
                    Log.e((String)"GoogleCertificatesQuery", (String)"Could not unwrap certificate");
                    object = var5_6;
                }
            }
        }
        this.d = object;
        this.b = bl2;
        this.c = bl3;
    }

    public ccb(String string, cfu cfu2, boolean bl2, boolean bl3) {
        this.a = string;
        this.d = cfu2;
        this.b = bl2;
        this.c = bl3;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        Object object = this.a;
        n2 = kl.u(parcel);
        kl.K(parcel, 1, (String)object);
        cfu cfu2 = this.d;
        object = cfu2;
        if (cfu2 == null) {
            Log.w((String)"GoogleCertificatesQuery", (String)"certificate binder is null");
            object = null;
        }
        kl.F(parcel, 2, (IBinder)object);
        kl.x(parcel, 3, this.b);
        kl.x(parcel, 4, this.c);
        kl.w(parcel, n2);
    }
}

