/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.RemoteException
 *  android.util.Log
 */
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public abstract class cfu
extends bow
implements cfv {
    private int a;

    public cfu() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    protected cfu(byte[] byArray) {
        super("com.google.android.gms.common.internal.ICertData");
        boolean bl2 = byArray.length == 25;
        kl.an(bl2);
        this.a = Arrays.hashCode(byArray);
    }

    public static byte[] c(String object) {
        try {
            object = ((String)object).getBytes("ISO-8859-1");
            return object;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new AssertionError((Object)unsupportedEncodingException);
        }
    }

    @Override
    public final int e() {
        return this.a;
    }

    public final boolean equals(Object object) {
        if (object != null && object instanceof cfv) {
            block6: {
                block5: {
                    object = (cfv)object;
                    if (object.e() == this.a) break block5;
                    return false;
                }
                object = object.f();
                if (object != null) break block6;
                return false;
            }
            try {
                object = (byte[])cgz.b((cha)object);
                boolean bl2 = Arrays.equals(this.x(), (byte[])object);
                return bl2;
            }
            catch (RemoteException remoteException) {
                Log.e((String)"GoogleCertificates", (String)"Failed to get Google certificates from remote", (Throwable)remoteException);
            }
        }
        return false;
    }

    @Override
    public final cha f() {
        return new cgz(this.x());
    }

    public final int hashCode() {
        return this.a;
    }

    public abstract byte[] x();

    @Override
    protected final boolean y(int n2, Parcel object, Parcel parcel) {
        if (n2 != 1) {
            if (n2 != 2) {
                return false;
            }
            n2 = this.a;
            parcel.writeNoException();
            parcel.writeInt(n2);
        } else {
            object = this.f();
            parcel.writeNoException();
            n2 = box.a;
            parcel.writeStrongBinder((IBinder)object);
        }
        return true;
    }
}

