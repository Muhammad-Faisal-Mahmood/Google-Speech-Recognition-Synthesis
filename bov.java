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

public class bov
implements IInterface {
    public final IBinder a;
    private final String b;

    protected bov(IBinder iBinder, String string) {
        this.a = iBinder;
        this.b = string;
    }

    public final Parcel a() {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken(this.b);
        return parcel;
    }

    public final IBinder asBinder() {
        return this.a;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Parcel b(int n2, Parcel parcel) {
        Throwable throwable2222222;
        block4: {
            Parcel parcel2 = Parcel.obtain();
            this.a.transact(n2, parcel, parcel2, 0);
            parcel2.readException();
            {
                catch (Throwable throwable2222222) {
                    break block4;
                }
                catch (RuntimeException runtimeException) {}
                {
                    parcel2.recycle();
                    throw runtimeException;
                }
            }
            parcel.recycle();
            return parcel2;
        }
        parcel.recycle();
        throw throwable2222222;
    }

    public final void c(int n2, Parcel parcel) {
        Parcel parcel2 = Parcel.obtain();
        try {
            this.a.transact(n2, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel.recycle();
            parcel2.recycle();
        }
    }

    public final void d(int n2, Parcel parcel) {
        try {
            this.a.transact(n2, parcel, null, 1);
            return;
        }
        finally {
            parcel.recycle();
        }
    }
}

